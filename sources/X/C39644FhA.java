package X;

import java.lang.reflect.Method;

/* renamed from: X.FhA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39644FhA implements InterfaceC39646FhC {
    @Override // X.InterfaceC39646FhC
    public final void LIZ() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method method = (Method) declaredMethod.invoke(cls, "getRuntime", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = (Method) declaredMethod.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
            method2.setAccessible(true);
            method2.invoke(invoke, new String[]{"L"});
        } catch (Exception unused) {
        }
    }
}
