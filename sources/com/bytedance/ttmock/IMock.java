package com.bytedance.ttmock;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public interface IMock<T> {

    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        public static <T> T get(IMock<T> iMock) {
            o.LJIIIZ(iMock, "this");
            return null;
        }

        public static <T> void remove(IMock<T> iMock) {
            o.LJIIIZ(iMock, "this");
        }

        public static <T> void set(IMock<T> iMock, T t) {
            o.LJIIIZ(iMock, "this");
        }
    }

    T get();

    void remove();

    void set(T t);
}
