package iloveyouboss.main

import iloveyouboss.main.Scoreable
import java.util.*;

public class ScoreCollection {
    private var scores: MutableList<Scoreable> = ArrayList<Scoreable>();

    public fun add(scoreable: Scoreable) {
        scores.add(scoreable);
    }

    public fun arithemticMean(): Int {
        var total: Int = scores.stream().mapToInt(Scoreable::getScore).sum();
        return total / scores.size;
    }



}