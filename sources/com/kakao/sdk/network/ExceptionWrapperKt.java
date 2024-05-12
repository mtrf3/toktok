package com.kakao.sdk.network;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ExceptionWrapperKt {
    public static final Throwable getOrigin(Throwable th) {
        o.LJIIIZ(th, "<this>");
        if (th instanceof ExceptionWrapper) {
            return ((ExceptionWrapper) th).getOrigin();
        }
        return th;
    }
}
