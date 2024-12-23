package io.javabrains.reactiveworkshop;

import java.util.Set;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
//        StreamSources.intNumbersStream().forEach(System.out::println);

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
//        StreamSources.intNumbersStream().filter(integer -> integer < 5).forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
//        StreamSources.intNumbersStream().filter(integer -> integer > 5)
//                .skip(1)
//                .limit(2)
//                .forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
//        StreamSources.intNumbersStream()
//                .filter(integer -> integer > 5)
//                .findFirst()
//                .ifPresentOrElse(System.out::println, () -> System.out.println(-1));

        // Print first names of all users in userStream
        // TODO: Write code here
//        StreamSources.userStream()
//                .forEach(user -> System.out.println(user.getFirstName()));

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        // flatMap approach
//        StreamSources.intNumbersStream()
//                .flatMap(integer -> StreamSources.userStream().filter(user -> user.getId() == integer))
//                .map(User::getId)
//                .forEach(System.out::println);

        // this set based approach is better for scalability
        Set<Integer> idSet = StreamSources.intNumbersStream()
                .collect(Collectors.toSet());

        StreamSources.userStream()
                .filter(user -> idSet.contains(user.getId()))
                .map(User::getFirstName)
                .forEach(System.out::println);

        // any match
//        StreamSources.userStream()
//                .filter(user -> StreamSources.intNumbersStream().anyMatch(id -> id.equals(user.getId())))
//                .map(User::getFirstName)
//                .forEach(System.out::println);
    }
}
