package X;

import android.os.SystemProperties;

/* renamed from: X.MyZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58559MyZ {
    public Object LIZ;

    public final Object LIZIZ() {
        if (this.LIZ == null) {
            synchronized (PCH.class) {
                if (this.LIZ == null) {
                    try {
                        this.LIZ = Class.forName("android.os.SystemProperties").newInstance();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return this.LIZ;
    }

    public final String LIZ(String str) {
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
