package X;

import com.ss.android.ttve.nativePort.TELogcat;
import defpackage.b1;

/* loaded from: classes12.dex */
public final class P4Q {
    public static String LIZ = "VESDK-";
    public static byte LIZIZ = 7;

    public static void LIZ(String str, String str2) {
        if ((LIZIZ & 8) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ);
            LIZ2.append(str);
            TELogcat.nativeLog((byte) 8, X1D.LIZIZ(LIZ2), str2);
        }
    }

    public static void LIZJ(String str, String str2) {
        if ((LIZIZ & 1) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ);
            LIZ2.append(str);
            TELogcat.nativeLog((byte) 1, X1D.LIZIZ(LIZ2), str2);
        }
    }

    public static void LJFF(String str, String str2) {
        if ((LIZIZ & 4) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ);
            LIZ2.append(str);
            TELogcat.nativeLog((byte) 4, X1D.LIZIZ(LIZ2), str2);
        }
    }

    public static void LJI(String str, String str2) {
        if ((LIZIZ & 16) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ);
            LIZ2.append(str);
            TELogcat.nativeLog((byte) 16, X1D.LIZIZ(LIZ2), str2);
        }
    }

    public static void LJII(String str, String str2) {
        if ((LIZIZ & 2) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ);
            LIZ2.append(str);
            TELogcat.nativeLog((byte) 2, X1D.LIZIZ(LIZ2), str2);
        }
    }

    public static void LIZIZ(Class<?> cls, String str, Throwable th) {
        if ((LIZIZ & 1) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ);
            LIZ2.append(C16880lQ.LJLLJ(cls));
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            StringBuilder LIZJ = b1.LIZJ(str, "\n***StackTrace***\n");
            LIZJ.append(android.util.Log.getStackTraceString(th));
            TELogcat.nativeLog((byte) 1, LIZIZ2, X1D.LIZIZ(LIZJ));
        }
    }

    public static void LIZLLL(String str, String str2, Throwable th) {
        if ((LIZIZ & 1) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            String LJFF = JBR.LJFF(LIZ2, LIZ, str, LIZ2);
            StringBuilder LIZJ = b1.LIZJ(str2, "\n***StackTrace***\n");
            LIZJ.append(android.util.Log.getStackTraceString(th));
            TELogcat.nativeLog((byte) 1, LJFF, X1D.LIZIZ(LIZJ));
        }
    }

    public static String LJ(String str, String str2, P4P... p4pArr) {
        StringBuilder sb = new StringBuilder(C16880lQ.LLLZ("%s; (Msg): {%s}; ", new Object[]{str, str2}));
        for (P4P p4p : p4pArr) {
            if (p4p != null) {
                sb.append(C16880lQ.LLLZ("(%s): {%s}[%s], ", new Object[]{p4p.LIZ, p4p.LIZIZ, p4p.LIZJ}));
            }
        }
        sb.append("_for_auto_analysis_");
        return sb.toString();
    }
}
