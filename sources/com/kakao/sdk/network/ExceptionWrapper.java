package com.kakao.sdk.network;

import java.io.IOException;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ExceptionWrapper extends IOException {
    public final Throwable origin;

    public final Throwable getOrigin() {
        return this.origin;
    }

    public ExceptionWrapper(Throwable origin) {
        o.LJIIIZ(origin, "origin");
        this.origin = origin;
    }
}
