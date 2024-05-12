package X;

/* loaded from: classes9.dex */
public final class IXB {
    public static boolean LIZ;
    public static FJ2 LIZIZ;

    public static void LIZ(String str) {
        if (LIZIZ != null && IWS.LIZ) {
            C36922EeM.LIZLLL(6, "PlayerLog", str);
        }
    }

    public static void LIZJ(String str) {
        if (LIZIZ != null && IWS.LIZ) {
            C36922EeM.LIZLLL(6, "PlayerLog", str);
        }
    }

    public static void LIZIZ(String str, String str2) {
        if (LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(", ");
            LIZ2.append(str2);
            LIZ(X1D.LIZIZ(LIZ2));
        }
    }

    public static void LIZLLL(String str, String str2) {
        if (LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(", ");
            LIZ2.append(str2);
            LIZJ(X1D.LIZIZ(LIZ2));
        }
    }

    public static void LJ(String str, Throwable th) {
        if (LIZ) {
            if (th != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("PlayerLog");
                LIZ2.append(", ");
                LIZ2.append(str);
                LJ(X1D.LIZIZ(LIZ2), th);
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("PlayerLog");
            LIZ3.append(", ");
            LIZ3.append(str);
            LIZJ(X1D.LIZIZ(LIZ3));
        }
    }
}
