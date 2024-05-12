package com.ss.android.ugc.aweme.commercialize.playfun;

import X.N5T;
import X.N5U;
import X.N5V;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class AdPlayFunAsseUtils implements IAdPlayFunAsseUtils {
    @Override // com.ss.android.ugc.aweme.commercialize.playfun.IAdPlayFunAsseUtils
    public final void LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (N5U.LIZ() || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        N5V n5v = new N5V("playfun", "preload_start", -1, System.currentTimeMillis());
        n5v.LJ = aweme.getAid();
        n5v.LJFF = awemeRawAd.getCreativeIdStr();
        n5v.LJI = awemeRawAd.getLogExtra();
        N5T.LJFF(n5v);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.IAdPlayFunAsseUtils
    public final void LIZIZ(Aweme aweme, String str, boolean z) {
        AwemeRawAd awemeRawAd;
        if (N5U.LIZ() || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        N5V n5v = new N5V("playfun", "preload_result", !z ? 1 : 0, System.currentTimeMillis());
        n5v.LJ = aweme.getAid();
        n5v.LJFF = awemeRawAd.getCreativeIdStr();
        n5v.LJI = awemeRawAd.getLogExtra();
        n5v.LJII = str;
        N5T.LJFF(n5v);
        N5U.LIZIZ(aweme, "aweme_ad_play_fun_preload_error_rate", z);
    }
}
