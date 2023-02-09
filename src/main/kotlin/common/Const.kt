package common

const val CAR_NAMES_REQUEST_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."
const val ADVANCE_COUNT_REQUEST_MESSAGE = "시도할 횟수는 몇 회인가요?"
const val GAME_RESULT_HEADER = "실행 결과"
const val GAME_RESULT_FORMAT = "최종 우승자: %s"

const val CAR_NAMES_DISTINCT_ERROR = "[ERROR] 자동차 이름 간에 중복이 존재합니다."
const val CAR_NAMES_SIZE_ERROR = "[ERROR] 자동차는 최소 2대에서 최대 20대 사이여야 합니다."
const val CAR_NAMES_REGEX_ERROR = "[ERROR] 자동차의 이름은 한글 혹은 영어로 공백이 없어야 하며 최소 1글자에서 최대 5글자까지 가능합니다."
const val ADVANCE_COUNT_ERROR = "[ERROR] 전진 횟수는 1에서 100 사이의 숫자여야 합니다."
