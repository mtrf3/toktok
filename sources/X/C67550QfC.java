package X;

import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.QfC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67550QfC {
    public static boolean LIZ = true;
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static boolean LIZ() {
        if (!LIZIZ && !LIZJ) {
            if (!C62848OlY.LIZJ()) {
                R5Q.LIZ(true, true);
                LIZ = false;
                LIZIZ = true;
            } else {
                try {
                    GoogleApiAvailability.getInstance().checkApiAvailability(new C67801QjF(C58725N2z.LIZ), new InterfaceC67549QfB[0]).LJ(C44384HbQ.LJLJJL).LJIILLIIL(C1DH.LJLJJLL);
                    LIZJ = true;
                } catch (Exception unused) {
                    LIZIZ = true;
                    LIZ = false;
                    LIZJ = false;
                    R5Q.LIZ(false, true);
                }
            }
        }
        return LIZ;
    }
}
