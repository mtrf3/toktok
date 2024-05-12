package X;

import Y.ARunnableS18S0000000_11;
import java.io.File;
import java.util.HashMap;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public final class PJ7 {
    public static File LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final ARunnableS18S0000000_11 LIZLLL = new ARunnableS18S0000000_11(21);
    public static java.util.Map<String, String> LJ;

    public static File LIZIZ() {
        return new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/configCrash/");
    }

    public static void LIZLLL() {
        if (LIZIZ) {
            return;
        }
        File file = new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/configCrash/configFile");
        if (!file.exists()) {
            return;
        }
        try {
            PJA.LJIILJJIL(new JSONArray(PK8.LJ(file)), false);
            LIZIZ = true;
        } catch (Throwable unused) {
            PJA.LJIILJJIL(null, false);
        }
    }

    public static void LJ() {
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        boolean LIZ2 = LIZ(null);
        LIZLLL();
        if (LIZ2) {
            C78685UuP.LJJJLL();
            PJ5.LIZIZ = 40;
            C64214PIc.LIZ().LIZ(PJ5.LIZ);
        }
    }

    public static boolean LIZ(String str) {
        if (LIZ == null) {
            LIZ = new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/configCrash/configInvalid");
        }
        File file = LIZ;
        try {
            java.util.Map<String, String> map = LJ;
            if (map == null) {
                map = PK8.LJIIIZ(file);
            }
            LJ = map;
            return PJ8.LIZLLL(str, map);
        } catch (Throwable unused) {
            PK0.LJIIIIZZ.isDebugMode();
            return true;
        }
    }

    public static void LIZJ(String str, boolean z) {
        if (LJ == null) {
            LJ = new HashMap();
        }
        LJ();
        if (z || !LJ.containsKey(str)) {
            LJ.put(str, String.valueOf(System.currentTimeMillis()));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("udpate config time for aid ");
            LIZ2.append(str);
            X1D.LIZIZ(LIZ2);
            C78685UuP.LJJJLL();
        }
    }
}
