package com.bytedance.common.jato.jit;

import X.C16880lQ;
import X.C48693J9d;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public class ProfileInfo {
    public static final ExecutorService LIZ = C16880lQ.LLLLZLLIL();

    public static native boolean createProfileForMethod(Method method, int[] iArr, Class[] clsArr);

    public static native void forceSaveProfile();

    public static native Method getMethod(String str, String str2, String str3);

    public static native synchronized boolean init();

    public static native void jitMethod(Method method);

    static {
        C48693J9d.LJFF();
    }
}
