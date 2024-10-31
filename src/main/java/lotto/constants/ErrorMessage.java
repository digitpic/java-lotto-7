package lotto.constants;

public class ErrorMessage {
    public static final String PREFIX = "[ERROR] ";
    public static final String INVALID_LOTTO_NUMBER_COUNT = PREFIX + "로또 번호는 6개여야 합니다.";
    public static final String INVALID_WINNING_NUMBER_COUNT = PREFIX + "당첨 번호는 6개여야 합니다.";
    public static final String NOT_ALLOWED_BLANK_AT_EDGES = PREFIX + "문장 맨 앞, 맨 뒤에 공백이 포함 되지 않아야 합니다.";
    public static final String INPUT_VALUE_MUST_BE_NUMERIC = PREFIX + "정수가 입력 되어야 합니다.";
    public static final String PURCHASE_AMOUNT_MUST_BE_MULTIPLE_OF_1000 = PREFIX + "구입 금액은 1,000원 단위로 입력 되어야 합니다.";
    public static final String NOT_ALLOWED_ZERO_VALUE = PREFIX + "0이 입력 되지 않아야 합니다.";
    public static final String NOT_ALLOWED_DUPLICATED_NUMBERS = PREFIX + "중복 되는 정수가 존재 하지 않아야 합니다.";
    public static final String WINNING_NUMBERS_MUST_CONTAIN_COMMA = "당첨 번호는 쉼표(,)를 통해 구분 되어야 합니다.";
    public static final String NOT_ALLOWED_STARTING_WITH_COMMA = "입력은 쉼표(,)로 시작 되지 않아야 합니다.";
    public static final String INVALID_NUMBER_RANGE = "번호는 1 이상, 45 이하여야 합니다.";
}
