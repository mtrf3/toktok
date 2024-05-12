package X;

import android.app.Activity;

/* loaded from: classes10.dex */
public final class LEQ {
    public static int LIZ;
    public static int LIZIZ;

    public static boolean LIZJ() {
        return C54966Lhi.LIZJ();
    }

    public static int LIZ(Activity activity) {
        if (LIZIZ == 0) {
            C53946LFe.LIZJ(activity, null);
            int LIZLLL = C53947LFf.LIZLLL();
            LES les = LES.LIZIZ;
            int LIZ2 = les.LIZ();
            LIZ = LIZ2;
            if (LIZLLL > LIZ2) {
                LIZ = LIZLLL;
                les.LIZIZ(LIZLLL);
            }
            LEU leu = LEU.LIZIZ;
            int LIZ3 = leu.LIZ();
            LIZIZ = LIZ3;
            int i = LIZ;
            if (i >= 800) {
                if (LIZ3 != 800) {
                    LIZIZ = 800;
                    leu.LIZIZ(800);
                }
            } else if (i >= 650) {
                if (LIZ3 != 800 && LIZ3 != 650) {
                    LIZIZ = 650;
                    leu.LIZIZ(650);
                }
            } else if (i >= 600) {
                if (LIZ3 != 800 && LIZ3 != 650 && LIZ3 != 600) {
                    LIZIZ = 600;
                    leu.LIZIZ(600);
                }
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("sDeviceMaxWidth:");
                LIZ4.append(LIZ);
                LIZ4.append(" sLastABGroup:");
                LIZ4.append(LIZIZ);
                LIZ4.append(", nowSize:");
                LIZ4.append(LFE.LIZ());
                LFE.LIZIZ("ScreenSizeAB", X1D.LIZIZ(LIZ4));
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("sDeviceMaxWidth:");
            LIZ5.append(LIZ);
            LIZ5.append(" sLastABGroup:");
            LIZ5.append(LIZIZ);
            LIZ5.append(", nowSize:");
            LIZ5.append(LFE.LIZ());
            LFE.LIZIZ("ScreenSizeAB", X1D.LIZIZ(LIZ5));
        }
        return LIZIZ;
    }

    public static boolean LIZIZ(Activity activity) {
        if ((LIZJ() || LIZ(activity) != 800) && LIZ(activity) != 650) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Activity activity) {
        if (LIZ(activity) == 600) {
            return true;
        }
        return false;
    }
}
