package de.fhro.inf.prg3.a03.states;

import de.fhro.inf.prg3.a03.Animal;
import de.fhro.inf.prg3.a03.State;
import de.fhro.inf.prg3.a03.states.DeadState;
import de.fhro.inf.prg3.a03.states.DigestingState;

/**
 * @author Created by Bundeseule on 18.12.2017 at 16:10
 * @project 03-inheritancea
 */
public class HungryState extends State {

    HungryState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("I've been starving for too long time...");
        return new DeadState(animal, -1);
    }

    public State feed(){
        logger.info("Om nom nom...");
        return new DigestingState(animal, animal.getDigest(), duration - time);
    }
}
