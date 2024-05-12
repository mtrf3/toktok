package com.byted.cast.common.async;

/* loaded from: classes29.dex */
public interface Observer<T> {
    void call(T t);

    void exception(Exception exc);
}
