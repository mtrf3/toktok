package X;

import com.ss.android.ugc.aweme.feed.experiment.AdPreloadExperimentData;
import com.ss.android.ugc.aweme.feed.experiment.AdPreloadMainSwitch;

/* renamed from: X.2Xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59982Xa {
    public static AdPreloadMainSwitch LIZ;
    public static boolean LIZIZ;

    public static boolean LIZ() {
        AdPreloadExperimentData lynxMaskData;
        if (!LIZIZ) {
            FFL LJIIIZ = FFL.LJIIIZ();
            AdPreloadMainSwitch adPreloadMainSwitch = LIZ;
            LJIIIZ.getClass();
            LIZ = (AdPreloadMainSwitch) FFL.LJIJ(true, "ad_lynx_is_use_preload_experiment", 31744, AdPreloadMainSwitch.class, adPreloadMainSwitch);
            LIZIZ = true;
        }
        AdPreloadMainSwitch adPreloadMainSwitch2 = LIZ;
        if (adPreloadMainSwitch2 != null && (lynxMaskData = adPreloadMainSwitch2.getLynxMaskData()) != null && lynxMaskData.isUse()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (!LIZIZ) {
            FFL LJIIIZ = FFL.LJIIIZ();
            AdPreloadMainSwitch adPreloadMainSwitch = LIZ;
            LJIIIZ.getClass();
            LIZ = (AdPreloadMainSwitch) FFL.LJIJ(true, "ad_lynx_is_use_preload_experiment", 31744, AdPreloadMainSwitch.class, adPreloadMainSwitch);
            LIZIZ = true;
        }
        AdPreloadMainSwitch adPreloadMainSwitch2 = LIZ;
        if (adPreloadMainSwitch2 != null && adPreloadMainSwitch2.getOtherOptimizeEnabled()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        AdPreloadExperimentData lynxSuperLikeData;
        if (!LIZIZ) {
            FFL LJIIIZ = FFL.LJIIIZ();
            AdPreloadMainSwitch adPreloadMainSwitch = LIZ;
            LJIIIZ.getClass();
            LIZ = (AdPreloadMainSwitch) FFL.LJIJ(true, "ad_lynx_is_use_preload_experiment", 31744, AdPreloadMainSwitch.class, adPreloadMainSwitch);
            LIZIZ = true;
        }
        AdPreloadMainSwitch adPreloadMainSwitch2 = LIZ;
        if (adPreloadMainSwitch2 != null && (lynxSuperLikeData = adPreloadMainSwitch2.getLynxSuperLikeData()) != null && lynxSuperLikeData.isUse()) {
            return true;
        }
        return false;
    }
}
