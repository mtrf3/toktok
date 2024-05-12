package X;

import com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class NTM implements NWE {
    public final /* synthetic */ AdProfilePopUpWebPageWidget LIZ;

    @Override // X.NWE
    public final void LIZIZ() {
    }

    @Override // X.NWE
    public final void LIZ() {
        this.LIZ.LJLLJ = "button";
    }

    @Override // X.NWE
    public final void LIZJ() {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.LIZ.LJLJLJ;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C58704N2e.LIZLLL("homepage_landing_ad", "report", awemeRawAd).LJI();
    }

    public NTM(AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget) {
        this.LIZ = adProfilePopUpWebPageWidget;
    }
}
