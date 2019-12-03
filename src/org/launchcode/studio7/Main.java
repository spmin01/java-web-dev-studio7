package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD album = new CD("Steal This Album");
        DVD movie = new DVD("Die hard");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        album.spinDisc();
        movie.spinDisc();

        movie.write(3);
        movie.write(7);
        movie.write(9);

        album.write(1);
        album.write(5);
        album.write(3);

        movie.menu();

        album.read(1);
        album.read(2);
        album.read(3);

        album.play();
    }
}
