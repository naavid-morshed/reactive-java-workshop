package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        // TODO: Write code here
        final List<Integer> list = ReactiveSources.intNumbersFlux().toStream().toList();

        System.out.println("List is : " + list);
        System.out.println(list.size());

        // personal breakdown, inefficient
//        final Flux<Integer> integerFlux = ReactiveSources.intNumbersFlux();
//        final Mono<List<Integer>> listMono = integerFlux.collectList();
//        final CompletableFuture<List<Integer>> future = listMono.toFuture();
//        future.get().forEach(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
