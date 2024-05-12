package X;

/* renamed from: X.V1z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79083V1z {
    public static boolean LIZ;
    public static V22 LIZIZ;

    public static void LIZJ(String str) {
        if (LIZIZ != null && 6 >= C79082V1y.LIZ) {
            C36922EeM.LIZLLL(6, "[Lighten]", str);
        }
    }

    public static void LJ(int i, String str, String str2) {
        LJFF(i, str, str2, "");
    }

    public static void LIZ(int i, String str, String str2, String str3) {
        if (LIZIZ != null) {
            String LIZLLL = LIZLLL(i, str, str2, str3);
            if (3 >= C79082V1y.LIZ) {
                C36922EeM.LIZLLL(3, "[Lighten]", LIZLLL);
            }
        }
    }

    public static void LIZIZ(int i, String str, String str2, String str3) {
        if (LIZIZ != null) {
            String LIZLLL = LIZLLL(i, str, str2, str3);
            if (6 >= C79082V1y.LIZ) {
                C36922EeM.LIZLLL(6, "[Lighten]", LIZLLL);
            }
        }
    }

    public static String LIZLLL(int i, String str, String str2, String str3) {
        if (i == 0) {
            return "[[" + str + "::" + str2 + "]]  " + str3;
        }
        return "[[" + str + "::" + str2 + "::" + i + "]]  " + str3;
    }

    public static void LJFF(int i, String str, String str2, String str3) {
        if (LIZ) {
            if (LIZIZ != null && 2 >= C79082V1y.LIZ) {
                C36922EeM.LIZLLL(2, "[Lighten]", LIZLLL(i, str, str2, str3));
                return;
            }
            return;
        }
        if (LIZIZ == null) {
            return;
        }
        String LIZLLL = LIZLLL(i, str, str2, str3);
        if (2 < C79082V1y.LIZ) {
            return;
        }
        C36922EeM.LIZLLL(2, "[Lighten]", LIZLLL);
    }
}
