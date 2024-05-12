package com.ss.ttlivestreamer.livestreamv2.utils;

import X.C0NY;

/* loaded from: classes12.dex */
public final class NumberUtils {
    public static final double setPrecision(double d, int i) {
        if (i >= 0 && 10 >= i) {
            return Math.rint(d * ((int) r4)) / ((float) Math.pow(10.0f, i));
        }
        throw new IllegalArgumentException(C0NY.LIZIZ("point ", i, " is not supported"));
    }
}
