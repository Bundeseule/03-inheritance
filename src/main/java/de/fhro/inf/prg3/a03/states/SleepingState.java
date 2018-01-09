package de.fhro.inf.prg3.a03.states;

import de.fhro.inf.prg3.a03.Animal;
import de.fhro.inf.prg3.a03.State;
import de.fhro.inf.prg3.a03.states.HungryState;

/**
 * @author Created by Bundeseule on 18.12.2017 at 16:11
 * @project 03-inheritancea
 */
public class SleepingState extends State {

    public SleepingState(Animal animal, int duration){
        super(animal, duration);
    }

    @Override
    public State successor(){
        logger.info("Yoan... geting hungry");
        return new HungryState(animal, animal.getAwake());
    }
}
