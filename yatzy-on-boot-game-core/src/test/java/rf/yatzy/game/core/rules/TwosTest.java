package rf.yatzy.game.core.rules;

import org.mockito.InjectMocks;
import rf.yatzy.game.core.DiceHash;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidTwosDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidTwosDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.TWOS_SCORE;

/**
 * Created by rfreitas
 */
public class TwosTest extends AbstractRuleTest {

    @InjectMocks
    private Twos twosRule;

    @Override
    public Rule getRule() {
        return twosRule;
    }

    @Override
    public DiceHash getValidHash() {
        return testValidTwosDiceHash();
    }

    @Override
    public DiceHash getNotValidHash() {
        return testNotValidTwosDiceHash();
    }

    @Override
    public int getTotalSum() {
        return TWOS_SCORE;
    }
}
