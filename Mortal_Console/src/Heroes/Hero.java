package Heroes;

import Heroes.HeroActions.AttackTypes;
import Heroes.HeroActions.DefenceTypes;


public interface Hero{
    public void attack(AttackTypes type);
    public void defend(DefenceTypes type);
    public void regenerate();
}
