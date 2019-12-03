package org.launchcode.studio7;

import java.util.Scanner;

public class DVD extends BaseDisc {

    public static final int MAX_CAPACITY = 100;

    public DVD() {
        super(MAX_CAPACITY);
    }

    public DVD(String title) {
        super(title, MAX_CAPACITY);
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        int selectedChapter = 0;
        while(selectedChapter < 1 || selectedChapter > (MAX_CAPACITY - this.getRemainingCapacity())) {
            System.out.println("Select a chapter (1-" + (MAX_CAPACITY - this.getRemainingCapacity()) + ")");
            selectedChapter = input.nextInt();
        }
        input.close();

        System.out.println(read(selectedChapter));
    }


    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
