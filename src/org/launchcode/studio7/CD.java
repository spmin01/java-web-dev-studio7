package org.launchcode.studio7;

public class CD extends BaseDisc {

    public static final int MAX_CAPACITY = 10;

    public CD(String title) {
        super(title, MAX_CAPACITY);
    }

    public CD() {
        super(MAX_CAPACITY);
    }

    public void play() {
        for(int i = 1; i <= MAX_CAPACITY - getRemainingCapacity(); i++) {
            System.out.println(this.read(i));
        }
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
