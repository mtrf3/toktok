package X;

import java.io.File;

/* loaded from: classes7.dex */
public final class EUT {
    public static int LIZ = -1;
    public static int LIZIZ = -1;
    public static final String LIZJ = System.getProperty("java.vm.version", "");

    public static synchronized String LIZ() {
        String str;
        synchronized (EUT.class) {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.kernel.qemu");
        }
        return str;
    }

    public static synchronized boolean LIZIZ() {
        synchronized (EUT.class) {
            int i = LIZIZ;
            boolean z = false;
            if (i != -1) {
                if (i > 0) {
                    z = true;
                }
                return z;
            }
            try {
                if (LIZ().equals("1")) {
                    LIZIZ = 1;
                } else {
                    LIZIZ = 0;
                }
            } catch (Throwable unused) {
                LIZIZ = 0;
            }
            if (LIZIZ > 0) {
                z = true;
            }
            return z;
        }
    }

    public static synchronized boolean LIZJ() {
        synchronized (EUT.class) {
            int i = LIZ;
            boolean z = true;
            if (i != -1) {
                if (i <= 0) {
                    z = false;
                }
                return z;
            }
            if (new File("/system/lib/arm/nb/libc.so").exists()) {
                LIZ = 1;
            } else {
                LIZ = 0;
            }
            if (LIZ <= 0) {
                z = false;
            }
            return z;
        }
    }
}
