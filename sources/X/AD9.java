package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creatortools.tiktokseries.SeriesSetting;

/* loaded from: classes5.dex */
public final class AD9 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        SeriesSetting LIZ2 = ADM.LIZ();
        if (LIZ2 == null || !LIZ2.showRedDot) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_tiktok_series");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("keva_tiktok_series_red_dot");
        if (!C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ3, LIZ3, repo, true)) {
            return false;
        }
        return true;
    }
}
