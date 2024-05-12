package X;

import java.lang.reflect.Method;

/* renamed from: X.047, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass047 {
    public static final boolean LIZ() {
        Boolean bool;
        try {
            if (C45211q1.LLJJJJJIL == null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                C45211q1.LLJJJJJIL = cls;
                C45211q1.LLJJJJLIIL = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = C45211q1.LLJJJJLIIL;
            Object obj = null;
            if (method != null) {
                obj = method.invoke(null, "debug.layout", Boolean.FALSE);
            }
            if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
