package com.amazon.device.iap.internal.util;

import defpackage.i0;
import java.util.Collection;

/* loaded from: classes.dex */
public class d {
    public static boolean a(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static void a(String str, String str2) {
        if (!a(str)) {
        } else {
            throw new IllegalArgumentException(i0.LJFF(str2, " must not be null or empty"));
        }
    }

    public static void a(Collection<? extends Object> collection, String str) {
        if (!collection.isEmpty()) {
        } else {
            throw new IllegalArgumentException(i0.LJFF(str, " must not be empty"));
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException(i0.LJFF(str, " must not be null"));
        }
    }
}
