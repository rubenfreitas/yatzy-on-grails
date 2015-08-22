package rf.yatzy.game.core.rules;

import org.mockito.InjectMocks;
import rf.yatzy.game.core.DiceHash;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidThreesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidThreesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.THREES_SCORE;

/**
 * Created by rfreitas
 */
public class ThreesTest extends AbstractRuleTest {

    @InjectMocks
    private Threes threesRule;

    @Override
    public Rule getRule() {
        return threesRule;
    }

    @Override
    public DiceHash getValidHash() {
        return testValidThreesDiceHash();
    }

    @Override
    public DiceHash getNotValidHash() {
        return testNotValidThreesDiceHash();
    }

    @Override
    public int getTotalSum() {
        return THREES_SCORE;
    }
}
