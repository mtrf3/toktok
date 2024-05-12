package com.bytedance.mira.plugin.hook.flipped.compat;

import X.C16880lQ;
import X.InterfaceC39646FhC;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class FlippedV2Impl implements InterfaceC39646FhC {
    private native Method getDeclaredMethod(Object obj, String str, Class<?>[] clsArr);

    static {
        C16880lQ.LLJJJIL("flipped");
    }

    @Override // X.InterfaceC39646FhC
    public final void LIZ() {
        try {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method declaredMethod = getDeclaredMethod(cls, "getRuntime", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = getDeclaredMethod(cls, "setHiddenApiExemptions", new Class[]{String[].class});
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(invoke, new String[]{"L"});
        } catch (Exception unused) {
        }
    }
}
