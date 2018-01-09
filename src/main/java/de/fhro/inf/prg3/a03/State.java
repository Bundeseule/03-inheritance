package de.fhro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Created by Bundeseule on 18.12.2017 at 16:09
 * @project 03-inheritancea
 */
public abstract class State {

    protected static final Logger logger = LogManager.getLogger();

    protected final Animal animal;

    private int time;
    private final int duration;

    protected State(Animal animal, int duration) {
        this.animal = animal;
        this.duration = duration;
    }


    final State tick() {
        if (duration < 0) return this;
        if (++time == duration) {
            return successor();
        } else {
            logger.info(getClass().getName());
            return this;
        }

    }

    public abstract State successor();


}
