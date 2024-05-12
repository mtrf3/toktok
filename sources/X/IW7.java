package X;

import Y.ACallableS25S0001000_8;
import com.google.gson.j;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;

/* loaded from: classes9.dex */
public final class IW7 {
    public static int LIZ = -1;
    public static boolean LIZIZ;
    public static final IW5 LIZJ = new IW5();

    public static PreloadStrategyConfig LIZIZ() {
        try {
            FFL.LJIIIZ().getClass();
            PreloadStrategyConfig preloadStrategyConfig = (PreloadStrategyConfig) FFL.LJIILLIIL(PreloadStrategyConfig.class, "preload_strategy", true);
            if (preloadStrategyConfig != null) {
                return preloadStrategyConfig;
            }
        } catch (Throwable unused) {
        }
        int LIZ2 = C00F.LIZ(31744, 5, "video_preload_number", true);
        FFL.LJIIIZ().getClass();
        return PreloadStrategyConfig.convertOldConfig(LIZ2, FFL.LJIIJ(31744, 800, "video_preload_size", true));
    }

    public static String LIZJ() {
        j jVar;
        try {
            FFL.LJIIIZ().getClass();
            jVar = (j) FFL.LJIJ(true, "player_preloader_strategy_center", 31744, j.class, null);
        } catch (Throwable unused) {
            jVar = null;
        }
        if (jVar != null) {
            return jVar.toString();
        }
        return null;
    }

    public static void LIZ() {
        if (!LIZIZ) {
            LIZIZ = true;
            C10K.LIZJ(new ACallableS25S0001000_8(0, 1));
        }
    }

    public static int LIZLLL() {
        int LIZ2;
        if (FRE.LIZ) {
            if (LIZ == -1) {
                LIZ = C00F.LIZ(31744, 0, "share_guide", true);
            }
            LIZ2 = LIZ;
        } else {
            LIZ2 = C00F.LIZ(31744, 0, "share_guide", true);
        }
        if (LIZ2 < 0 || LIZ2 > 2) {
            return 0;
        }
        return LIZ2;
    }

    public static int LJ() {
        return C00F.LIZ(31744, 0, "unlogin_digg_limit", true);
    }
}
