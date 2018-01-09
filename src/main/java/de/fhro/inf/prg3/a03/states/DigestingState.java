package de.fhro.inf.prg3.a03.states;

import de.fhro.inf.prg3.a03.Animal;
import de.fhro.inf.prg3.a03.State;

/**
 * @author Created by Bundeseule on 18.12.2017 at 16:10
 * @project 03-inheritancea
 */
public class DigestingState extends State {

    private final int remainingWakeTime;

    DigestingState(Animal animal, int duration, int remainingWakeTime) {
        super(animal, duration);
        this.remainingWakeTime = remainingWakeTime;
    }

    @Override
    public State successor() {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(animal, remainingWakeTime - animal.getDigest());
    }


}
