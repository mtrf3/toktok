package X;

import Y.AfS59S0200000_10;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.log.AdWebLogService;

/* loaded from: classes11.dex */
public class NO3 extends NNJ {
    public static final Aweme LJI() {
        C59284NOm LIZ = C113504cs.LIZ();
        if (LIZ != null) {
            return LIZ.LJIIL;
        }
        return null;
    }

    @Override // X.NNJ
    public final boolean LIZ() {
        Aweme LJI;
        AwemeRawAd awemeRawAd;
        Aweme LJI2 = LJI();
        if (LJI2 != null && LJI2.isAd() && C59275NOd.LIZ(LIZLLL().LIZIZ.LIZ) && (LJI = LJI()) != null && (awemeRawAd = LJI.getAwemeRawAd()) != null && awemeRawAd.isOpenSystemBrowser()) {
            return true;
        }
        return false;
    }

    @Override // X.NNJ
    public final boolean LIZIZ() {
        String str;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        N1E LIZLLL = AdWebLogService.LJFF().LIZLLL();
        boolean LIZ = AdWebLogService.LJFF().LIZ();
        Aweme LJI = LJI();
        String str2 = null;
        if (LJI == null || (awemeRawAd2 = LJI.getAwemeRawAd()) == null || (str = awemeRawAd2.getCreativeIdStr()) == null) {
            str = "";
        }
        Aweme LJI2 = LJI();
        if (LJI2 != null && (awemeRawAd = LJI2.getAwemeRawAd()) != null) {
            str2 = awemeRawAd.getLogExtra();
        }
        LIZLLL.LIZIZ(str, str2, LIZLLL().LJ.LIZIZ, LIZLLL().LIZIZ.LIZ);
        if (!LIZ) {
            C84763XOl.LJI().LJJJJZI(new AfS59S0200000_10(LIZLLL, this, 10));
        }
        return NO5.LJIJ(LIZJ(), LIZLLL().LIZIZ.LIZ);
    }
}
