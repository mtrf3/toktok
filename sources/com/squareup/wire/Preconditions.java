package com.squareup.wire;

/* loaded from: classes12.dex */
public final class Preconditions {
    public static void LIZ(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }
}
