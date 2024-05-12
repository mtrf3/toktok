package X;

/* renamed from: X.PUb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64525PUb {
    public static final Class<?> LIZ;
    public static final boolean LIZIZ;

    static {
        Class<?> cls;
        boolean z;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        LIZ = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ = z;
    }

    public static boolean LIZ() {
        if (LIZ != null && !LIZIZ) {
            return true;
        }
        return false;
    }
}
