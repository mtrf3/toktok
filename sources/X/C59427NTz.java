package X;

import com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: X.NTz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59427NTz implements NWE {
    public final /* synthetic */ AdFakePopUpWebPageWidget LIZ;

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
        AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.LIZ;
        NWF nwf = adFakePopUpWebPageWidget.LJLLI;
        if (nwf != null) {
            NWN actionMode = nwf.getActionMode();
            Aweme aweme = adFakePopUpWebPageWidget.LJLJLJ;
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
                    Aweme aweme2 = adFakePopUpWebPageWidget.LJLJLJ;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    }
                    C58704N2e.LIZLLL("homepage_landing_ad", "report", awemeRawAd2).LJI();
                }
            }
        }
    }

    public C59427NTz(AdFakePopUpWebPageWidget adFakePopUpWebPageWidget) {
        this.LIZ = adFakePopUpWebPageWidget;
    }
}
