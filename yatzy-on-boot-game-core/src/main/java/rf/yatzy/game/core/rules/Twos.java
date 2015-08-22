package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.rules.config.RulesConstants.TWOS_VALUE;

/**
 * Created by rfreitas
 */
public class Twos extends UpperSection implements Rule {

    public RuleResult execute(DiceHashMap dice) {
        return calculateUpper(dice, TWOS_VALUE);
    }
}
