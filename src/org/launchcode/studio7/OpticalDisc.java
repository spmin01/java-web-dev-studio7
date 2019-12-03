package org.launchcode.studio7;

public interface OpticalDisc {

    void spinDisc();

    boolean write(int data);

    int read(int track);
}
