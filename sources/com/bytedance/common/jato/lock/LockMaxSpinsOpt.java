package com.bytedance.common.jato.lock;

import X.C48693J9d;

/* loaded from: classes7.dex */
public class LockMaxSpinsOpt {
    public static native void nativeSetMaxSpins(int i);

    static {
        C48693J9d.LJFF();
    }

    public static void setLockMaxSpins(int i) {
        nativeSetMaxSpins(i);
    }
}
