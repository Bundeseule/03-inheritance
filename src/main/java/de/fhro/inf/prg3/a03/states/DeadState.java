package de.fhro.inf.prg3.a03.states;

import de.fhro.inf.prg3.a03.Animal;
import de.fhro.inf.prg3.a03.State;

/**
 * @author Created by Bundeseule on 18.12.2017 at 16:11
 * @project 03-inheritancea
 */
public class DeadState extends State {

    DeadState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        throw new IllegalStateException("This is no buddhistic animal - reincarnation is no option!");
    }
}
