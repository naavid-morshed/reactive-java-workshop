package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        ReactiveSources.intNumberMono().subscribe(
                integer -> System.out.println(integer),
                err -> System.err.println(err.getMessage()),
                () -> System.out.println("Done")
        );

        // Subscribe to a flux using an implementation of BaseSubscriber
        ReactiveSources.userFlux().subscribe(new CustomSubscriber<>());

        System.out.println("Press a key to end");
        System.in.read();
    }

}