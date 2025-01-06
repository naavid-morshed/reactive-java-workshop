package io.javabrains.reactiveworkshop;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

public class CustomSubscriber<T> extends BaseSubscriber<T> {
    public void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscriber hooked onSubscribe");
        request(1);
    }

    public void hookOnNext(T value) {
        System.out.println(value);
        request(1); // okay to push signal
    }
}
