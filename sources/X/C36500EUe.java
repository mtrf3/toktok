package X;

import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.EUe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36500EUe {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new HashMap();
    }

    public static Method LIZ(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Throwable unused) {
            return null;
        }
    }
}
