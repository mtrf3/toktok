package X;

import android.text.TextUtils;
import java.net.UnknownHostException;

/* loaded from: classes8.dex */
public final class H78 {
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if ((H79.LIZ() & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ = z;
        if ((H79.LIZ() & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZIZ = z2;
        if ((H79.LIZ() & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        LIZJ = z3;
        if ((H79.LIZ() & 8) == 0) {
            z4 = false;
        }
        LIZLLL = z4;
    }

    public static void LIZ(String str) {
        if (LIZ) {
            return;
        }
        C60903NvH.LJIIJJI().LJJIIZI().LJIIJ(3, "Tools-Client", str);
    }

    public static void LIZJ(String str) {
        if (LIZLLL) {
            return;
        }
        C60903NvH.LJIIJJI().LJJIIZI().LJIIJ(6, "Tools-Client", str);
    }

    public static void LJ(Throwable th) {
        if (LIZLLL) {
            return;
        }
        C60903NvH.LJIIJJI().LJJIIZI().LJIIJ(6, "Tools-Client", LJFF(th));
    }

    public static String LJFF(Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "UnknownHostException";
            }
        }
        return android.util.Log.getStackTraceString(th);
    }

    public static void LJI(String str) {
        if (LIZIZ) {
            return;
        }
        C60903NvH.LJIIJJI().LJJIIZI().LJIIJ(4, "Tools-Client", str);
    }

    public static void LJII(String str) {
        if (LIZJ) {
            return;
        }
        C60903NvH.LJIIJJI().LJJIIZI().LJIIJ(5, "Tools-Client", str);
    }

    public static void LIZIZ(String str, String str2) {
        if (LIZ) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "Tools-Client";
        }
        C60903NvH.LJIIJJI().LJJIIZI().LJIIJ(3, str, str2);
    }

    public static void LIZLLL(String str, Throwable th) {
        if (LIZLLL) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LJ(th);
        } else {
            C60903NvH.LJIIJJI().LJJIIZI().LJIIJ(6, str, LJFF(th));
        }
    }
}
