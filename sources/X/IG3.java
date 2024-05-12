package X;

import android.content.Context;
import com.bytedance.keva.Keva;

/* loaded from: classes9.dex */
public final class IG3 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C46299IFb.LJLIL);
    public static boolean LIZIZ;
    public static double LIZJ;
    public static boolean LIZLLL;
    public static long LJ;
    public static boolean LJFF;

    public static float LIZJ() {
        return ((Number) LIZ.getValue()).floatValue();
    }

    public static void LJ() {
        Keva.getRepo("repo_auto_volume").storeBoolean("auto_volume_state", !AV1.LJIILLIIL());
    }

    public static boolean LIZIZ() {
        if (IG4.LIZ() && Keva.getRepo("repo_auto_volume").getBoolean("auto_volume_state", !AV1.LJIILLIIL())) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL() {
        if (Math.abs(System.currentTimeMillis() - LJ) > 5000) {
            LJ = System.currentTimeMillis();
            int LJFF2 = C47636Imm.LJFF(EF7.LIZIZ());
            boolean z = true;
            if (LJFF2 != 1 && LJFF2 != 2) {
                z = false;
            }
            LJFF = z;
        }
        return LJFF;
    }

    public static void LIZ(double d) {
        if (LIZJ() < 0.0f || LIZJ() > 1.0f) {
            C36922EeM.LIZLLL(4, "AutoVolumeAdjustmentHelper", "auto volume threshold is invalid. ");
            return;
        }
        Context LIZIZ2 = EF7.LIZIZ();
        if (d > LIZJ()) {
            int LIZJ2 = (int) (LIZJ() * C47636Imm.LJ(LIZIZ2));
            if (!C47636Imm.LJIIIZ(LIZIZ2)) {
                try {
                    C47636Imm.LIZ.setStreamVolume(3, LIZJ2, 8);
                } catch (Exception e) {
                    C36922EeM.LJFF(e);
                }
            }
            C76800UCe c76800UCe = C76800UCe.LIZ;
            LIZLLL = true;
            LIZIZ = true;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("auto volume adjustment result: ");
            LIZ2.append(c76800UCe);
            C36922EeM.LIZLLL(4, "AutoVolumeAdjustmentHelper", X1D.LIZIZ(LIZ2));
        }
    }
}
