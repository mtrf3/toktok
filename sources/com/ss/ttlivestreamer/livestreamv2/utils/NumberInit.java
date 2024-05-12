package com.ss.ttlivestreamer.livestreamv2.utils;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class NumberInit {
    public static final NumberInit INSTANCE = new NumberInit();
    public static final float UNDEFINED_FLOAT_VALUE = Float.MAX_VALUE;
    public static final double UNDEFINED_DOUBLE_VALUE = Double.MAX_VALUE;

    public static final boolean isDefined(Number number) {
        boolean LJ;
        if (number instanceof Long) {
            LJ = o.LJ(number, Long.MAX_VALUE);
        } else if (number instanceof Integer) {
            LJ = o.LJ(number, Integer.MAX_VALUE);
        } else {
            if (number instanceof Float) {
                if (Math.abs(number.floatValue() - UNDEFINED_FLOAT_VALUE) > 1.0E-6d) {
                    return true;
                }
            } else if ((number instanceof Double) && Math.abs(number.doubleValue() - UNDEFINED_DOUBLE_VALUE) > 1.0E-6d) {
                return true;
            }
            return false;
        }
        return true ^ LJ;
    }
}
