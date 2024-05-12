package X;

/* loaded from: classes9.dex */
public final class J3Y {
    public static final boolean LIZ;
    public static J3Z LIZIZ;

    static {
        J3X j3x = C48541J3h.LIZ;
        if (j3x != null) {
            j3x.LIZJ();
        }
        LIZ = false;
        LIZIZ = null;
    }

    public static J3Z LIZIZ() {
        J3Z j3z = LIZIZ;
        if (j3z != null) {
            return j3z;
        }
        if (C48541J3h.LIZ != null) {
            synchronized (J3Y.class) {
                if (LIZIZ == null) {
                    C48535J3b logger = C48541J3h.LIZ.getLogger();
                    LIZIZ = logger;
                    if (logger == null) {
                        LIZIZ = C48534J3a.LIZ;
                    }
                }
            }
            return LIZIZ;
        }
        return C48534J3a.LIZ;
    }

    public static void LIZ(String str, String str2) {
        LIZIZ().LIZ(str, str2);
    }

    public static void LIZJ(String str, String str2, Throwable th) {
        LIZIZ().LIZJ(str, str2);
    }
}
