package com.byted.cast.common.async;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes29.dex */
public interface Subject<T> {
    Subject addObserver(Observer<T> observer);

    void clearObservers();

    void dispose();

    void notifyException(Exception exc);

    void notifyObserver(T t);

    void removeObserver(Observer<T> observer);

    Subject setExecutor(ExecutorService executorService);

    Subject setTimeout(long j, TimeUnit timeUnit);
}
