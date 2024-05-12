package X;

import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: X.NTy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59426NTy implements NWE {
    public final /* synthetic */ AdNewFakePopUpWebPageWidget LIZ;

    @Override // X.NWE
    public final void LIZIZ() {
    }

    @Override // X.NWE
    public final void LIZ() {
        this.LIZ.LJLLILLLL = "button";
    }

    @Override // X.NWE
    public final void LIZJ() {
        AwemeRawAd awemeRawAd;
        AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.LIZ;
        NWF nwf = adNewFakePopUpWebPageWidget.LJLLI;
        if (nwf != null) {
            NWN actionMode = nwf.getActionMode();
            Aweme aweme = adNewFakePopUpWebPageWidget.LJLJLJ;
            AwemeRawAd awemeRawAd2 = null;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            actionMode.getClass();
            if (awemeRawAd != null && awemeRawAd.getProfileWithWebview() == 1) {
                int i = actionMode.LJIIIIZZ;
                if (i == 7 || i == 8 || actionMode.LIZJ == 3) {
                    Aweme aweme2 = adNewFakePopUpWebPageWidget.LJLJLJ;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    }
                    C58704N2e.LIZLLL("landing_ad", "report", awemeRawAd2).LJI();
                }
            }
        }
    }

    public C59426NTy(AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget) {
        this.LIZ = adNewFakePopUpWebPageWidget;
    }
}
