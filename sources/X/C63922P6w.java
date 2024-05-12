package X;

import defpackage.b1;

/* renamed from: X.P6w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63922P6w {
    public static String LIZ = "VESDK-";
    public static byte LIZIZ = 7;
    public static volatile InterfaceC63921P6v LIZJ = new C63923P6x();

    public static void LIZ(String str, String str2) {
        if ((LIZIZ & 8) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZJ.Log((byte) 8, JBR.LJFF(LIZ2, LIZ, str, LIZ2), str2);
        }
    }

    public static void LIZIZ(String str, String str2) {
        if ((LIZIZ & 1) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZJ.Log((byte) 1, JBR.LJFF(LIZ2, LIZ, str, LIZ2), str2);
        }
    }

    public static void LIZLLL(String str, String str2) {
        if ((LIZIZ & 4) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZJ.Log((byte) 4, JBR.LJFF(LIZ2, LIZ, str, LIZ2), str2);
        }
    }

    public static void LJ(String str, String str2) {
        if ((LIZIZ & 2) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZJ.Log((byte) 2, JBR.LJFF(LIZ2, LIZ, str, LIZ2), str2);
        }
    }

    public static void LIZJ(String str, String str2, Throwable th) {
        if ((LIZIZ & 1) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            String LJFF = JBR.LJFF(LIZ2, LIZ, str, LIZ2);
            InterfaceC63921P6v interfaceC63921P6v = LIZJ;
            StringBuilder LIZJ2 = b1.LIZJ(str2, "\n***StackTrace***\n");
            LIZJ2.append(android.util.Log.getStackTraceString(th));
            interfaceC63921P6v.Log((byte) 1, LJFF, X1D.LIZIZ(LIZJ2));
        }
    }

    public static void LJFF(String str, String str2, Throwable th) {
        if ((LIZIZ & 2) != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            String LJFF = JBR.LJFF(LIZ2, LIZ, str, LIZ2);
            InterfaceC63921P6v interfaceC63921P6v = LIZJ;
            StringBuilder LIZJ2 = b1.LIZJ(str2, "\n***StackTrace***\n");
            LIZJ2.append(android.util.Log.getStackTraceString(th));
            interfaceC63921P6v.Log((byte) 2, LJFF, X1D.LIZIZ(LIZJ2));
        }
    }
}
