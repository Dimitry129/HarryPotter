package com.example.game.spells;

import com.example.game.models.Character;

public class ForbiddenSpell extends AbstractSpell {
    public ForbiddenSpell(String name, int powerLevel) {
        super(name, powerLevel);
    }

    @Override
    public void cast(Character target) {
        target.setHealth(0);
        System.out.println("You cast the forbidden spell " + name + " on " + target.getName() + " and they are now defeated!");
    }
}
