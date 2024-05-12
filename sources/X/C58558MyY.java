package X;

import android.os.SystemProperties;

/* renamed from: X.MyY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58558MyY {
    public static volatile Object LIZ;

    public static Object LIZIZ() {
        if (LIZ == null) {
            synchronized (C58558MyY.class) {
                if (LIZ == null) {
                    try {
                        LIZ = Class.forName("android.os.SystemProperties").newInstance();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return LIZ;
    }

    public static String LIZ(String str) {
        try {
            try {
                return SystemProperties.get(str);
            } catch (Throwable unused) {
                Object LIZIZ = LIZIZ();
                return (String) LIZIZ.getClass().getMethod("get", String.class).invoke(LIZIZ, str);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused2) {
            return "";
        }
    }
}
