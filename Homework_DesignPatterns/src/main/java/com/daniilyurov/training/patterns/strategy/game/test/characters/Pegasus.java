package com.daniilyurov.training.patterns.strategy.game.test.characters;

import com.daniilyurov.training.patterns.strategy.game.test.Character;
import com.daniilyurov.training.patterns.strategy.game.test.properties.flying.UsualFlyingProperty;
import com.daniilyurov.training.patterns.strategy.game.test.properties.walking.UsualWalkingProperty;

public class Pegasus extends Character {
    public Pegasus() {
        walkingProperty = new UsualWalkingProperty();
        flyingProperty = new UsualFlyingProperty();
    }

    @Override
    public void identify() {
        System.out.println("I am a beautiful pegasus!");
    }
}
