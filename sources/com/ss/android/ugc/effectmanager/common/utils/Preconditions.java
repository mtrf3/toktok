package com.ss.android.ugc.effectmanager.common.utils;

import X.C16880lQ;
import X.X1D;

/* loaded from: classes7.dex */
public final class Preconditions {
    public static void checkUiThread() {
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        if (C16880lQ.LLJJJJ().getThread() == LLLLIIIILLL) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Method cannot be called off the main application thread (on: ");
        LIZ.append(LLLLIIIILLL.getName());
        LIZ.append(")");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static void checkState(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
