package domain

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatCode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class CarTest {

    @ParameterizedTest
    @ValueSource(strings = ["", "po bi", "pobi1", "pobi!", "thomas"])
    fun `자동차의 이름이 1에서 5자의 영어 또는 한글로 이루어져 있지 않다면 예외 메세지를 포함한 IllegalArgumentException을 던진다`(name: String) {
        Assertions.assertThatIllegalArgumentException().isThrownBy { Car(name, RandomMovingStrategy()) }
            .withMessageContaining(ERROR_MESSAGE)
    }

    @Test
    fun `자동차의 이름이 1에서 5자의 영어 또는 한글로 이루어져 있다면 예외를 던지지 않는다`() {
        val name = "pobi"

        assertThatCode { Car(name, RandomMovingStrategy()) }.doesNotThrowAnyException()
    }

    @Test
    fun `moveAccordingToStrategy 메소드를 실행하면 전략대로 움직인다`() {
        val car = Car("pobi", OnlyAdvanceMovingStrategy())

        car.moveAccordingToStrategy()

        assertThat(car.advanceCount).isEqualTo(1)
    }

    private class OnlyAdvanceMovingStrategy : MovingStrategy {
        override fun isMovable(): Boolean = true
    }

    companion object {
        private const val ERROR_MESSAGE = "[ERROR]"
    }
}