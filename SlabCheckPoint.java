package main.java.incometax;

public class SlabCheckPoint {


    boolean isTaxable;
    boolean isRange;
    // ... fields to define a slab co-ordinates to infer information on how to calculate income tax

    public SlabCheckPoint(int slabValue, Integer percentageTaxable) {
    }

    public Range getRangeLimits() {
        return new Range();
    }
}

