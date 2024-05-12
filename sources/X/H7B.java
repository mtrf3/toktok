package X;

import java.net.UnknownHostException;

/* loaded from: classes8.dex */
public final class H7B {
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
        C36922EeM.LIZLLL(3, "Tools-Client", str);
        A9V.LIZ(3, "Tools-Client", str);
        C65757PrN.LIZ(str, "LogDebug");
    }

    public static void LIZJ(String str) {
        if (LIZLLL) {
            return;
        }
        C36922EeM.LIZLLL(6, "Tools-Client", str);
        A9V.LIZ(6, "Tools-Client", str);
        C65757PrN.LIZ(str, "LogError");
    }

    public static void LIZLLL(Throwable th) {
        String stackTraceString;
        if (LIZLLL) {
            return;
        }
        Throwable th2 = th;
        while (true) {
            if (th2 != null) {
                if (th2 instanceof UnknownHostException) {
                    stackTraceString = "UnknownHostException";
                    break;
                }
                th2 = th2.getCause();
            } else {
                stackTraceString = android.util.Log.getStackTraceString(th);
                break;
            }
        }
        C36922EeM.LIZLLL(6, "Tools-Client", stackTraceString);
    }

    public static void LJ(String str) {
        if (LIZIZ) {
            return;
        }
        C36922EeM.LIZLLL(4, "Tools-Client", str);
        A9V.LIZ(4, "Tools-Client", str);
        C65757PrN.LIZ(str, "LogInfo");
    }

    public static void LJFF(String str) {
        if (LIZJ) {
            return;
        }
        C36922EeM.LIZLLL(5, "Tools-Client", str);
        A9V.LIZ(5, "Tools-Client", str);
        C65757PrN.LIZ(str, "LogWarning");
    }

    public static void LIZIZ(String str, String str2) {
        if (LIZ) {
            return;
        }
        C36922EeM.LIZLLL(3, str, str2);
        A9V.LIZ(3, str, str2);
        C65757PrN.LIZ(str2, "LogDebug");
    }
}
