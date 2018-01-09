package de.fhro.inf.prg3.a03;

import de.fhro.inf.prg3.a03.Animal;
import de.fhro.inf.prg3.a03.State;
/**
 * @author Created by Bundeseule on 18.12.2017 at 16:11
 * @project 03-inheritancea
 */
public class PlayfulState extends State {


    PlayfulState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("Yoan... getting tired");
        return new SleepingState(animal, animal.getSleeping());
    }
}
