package com.bytedance.common.jato.fastnative;

import X.C48693J9d;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public class FastNative {
    public static ExecutorService LIZ;

    /* loaded from: classes7.dex */
    public static class Stub {
        public void stubMethod() {
            System.out.println("stubMethod");
        }
    }

    public static native Method[] getMethodsNative(String[] strArr, String[] strArr2, String[] strArr3);

    public static native Method[] nativeModifyFastNativeInner(Method[] methodArr, boolean z);

    static {
        C48693J9d.LJFF();
    }
}
