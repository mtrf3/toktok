package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class FLL {
    public static boolean LIZJ;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static final FLL LIZ = new FLL();
    public static final Keva LIZIZ = Keva.getRepo("firebase_repo");
    public static boolean LIZLLL = true;

    public static final void LIZIZ() {
        LJI = true;
        LJFF();
    }

    public static final void LIZJ() {
        LJ = true;
        if (LIZLLL) {
            LIZLLL = LIZIZ.getBoolean("is_preinstall", true);
        }
        LJFF();
    }

    public static final synchronized void LJFF() {
        synchronized (FLL.class) {
            if (LJII) {
                return;
            }
            if (LJI && AV1.LJIILLIIL()) {
                LIZLLL(false);
                LJII = true;
                return;
            }
            if (LJI && LJ && LJFF) {
                if (!LIZLLL) {
                    LIZLLL(false);
                    LJII = true;
                } else if (!LIZJ) {
                    LIZLLL(true);
                    LJII = true;
                } else if (((RBX) HG3.LJIILL()).isLogin()) {
                    LIZLLL(true);
                    LJII = true;
                } else {
                    LIZLLL(false);
                }
            }
        }
    }

    public static final void LIZ(boolean z) {
        LJFF = true;
        LIZJ = z;
        LJFF();
    }

    public static void LIZLLL(boolean z) {
        C63053Oor LIZ2 = C63053Oor.LIZIZ.LIZ(EF7.LIZIZ());
        if (z) {
            LIZ2.LIZ(TokenCert.Companion.with("bpea-firebase_androidsdk_1995"), true);
        } else {
            LIZ2.LIZ(TokenCert.Companion.with("bpea-firebase_androidsdk_1994"), false);
        }
    }

    public static final void LJ(boolean z) {
        LIZLLL = z;
        LIZIZ.storeBoolean("is_preinstall", z);
    }
}
