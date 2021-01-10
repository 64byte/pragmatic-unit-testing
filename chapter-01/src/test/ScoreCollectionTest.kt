package test

import iloveyouboss.main.ScoreCollection
import org.junit.jupiter.api.Test
import org.junit.*;
import kotlin.test.assertEquals

public class ScoreCollectionTest {
    @Test
    public fun test() {
        var collection: ScoreCollection = ScoreCollection();
        collection.add { 5 };
        collection.add { 7 };

        var actualResult: Int = collection.arithemticMean();

        assertEquals(6, actualResult);

    }

}