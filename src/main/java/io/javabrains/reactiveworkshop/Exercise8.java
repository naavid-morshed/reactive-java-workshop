package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise8 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens
//        ReactiveSources.intNumbersFluxWithException()
//                // doOnError does not override default error handling, rather extends. for overriding show error inside subscription
////                .doOnError(err -> System.err.println("Error occurred: " + err.getMessage()))
//                .subscribe(
//                        integer -> {
//                        },
//                        // better for overriding default stack trace
//                        err -> System.err.println(err.getMessage())
//                ); // Default error logging still applies

        // Print values from intNumbersFluxWithException and continue on errors
//        ReactiveSources.intNumbersFluxWithException()
//                .onErrorContinue((throwable, o) -> System.out.println(throwable.getMessage()))
//                .subscribe(System.out::println);

        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2


        System.out.println("Press a key to end");
        System.in.read();
    }

}
