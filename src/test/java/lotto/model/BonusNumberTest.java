package lotto.model;

import org.junit.jupiter.api.Test;

import static lotto.constants.ErrorMessage.INPUT_VALUE_MUST_BE_NUMERIC;
import static lotto.constants.ErrorMessage.INVALID_NUMBER_RANGE;
import static lotto.constants.ErrorMessage.NOT_ALLOWED_BLANK_AT_EDGES;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class BonusNumberTest {
    @Test
    void 문장_맨_앞에_공백이_오는_경우_예외가_발생한다() {
        // given
        String rawBonusNumbers = " 7";

        // when & then
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new BonusNumber(rawBonusNumbers))
                .withMessage(NOT_ALLOWED_BLANK_AT_EDGES);
    }

    @Test
    void 문장_맨_뒤에_공백이_오는_경우_예외가_발생한다() {
        // given
        String rawBonusNumbers = "7 ";

        // when & then
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new BonusNumber(rawBonusNumbers))
                .withMessage(NOT_ALLOWED_BLANK_AT_EDGES);
    }

    @Test
    void 문장_맨_앞_맨_뒤에_공백이_오는_경우_예외가_발생한다() {
        // given
        String rawBonusNumbers = " 7 ";

        // when & then
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new BonusNumber(rawBonusNumbers))
                .withMessage(NOT_ALLOWED_BLANK_AT_EDGES);
    }

    @Test
    void 정수가_입력_되지_않은_경우_예외가_발생한다() {
        // given
        String rawBonusNumbers = "string";

        // when & then
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new BonusNumber(rawBonusNumbers))
                .withMessage(INPUT_VALUE_MUST_BE_NUMERIC);
    }

    @Test
    void 입력된_정수_중_1_이하_정수가_입력_된_경우_예외가_발생한다() {
        // given
        String rawBonusNumbers = "0";

        // when & then
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new BonusNumber(rawBonusNumbers))
                .withMessage(INVALID_NUMBER_RANGE);
    }

    @Test
    void 입력된_정수_중_45_이상_정수가_입력_된_경우_예외가_발생한다() {
        // given
        String rawBonusNumbers = "46";

        // when & then
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new BonusNumber(rawBonusNumbers))
                .withMessage(INVALID_NUMBER_RANGE);
    }
}