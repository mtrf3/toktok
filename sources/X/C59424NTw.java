package X;

import com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.NTw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59424NTw implements InterfaceC59489NWj {
    public final /* synthetic */ AdFakePopUpWebPageWidget LIZ;

    @Override // X.InterfaceC59489NWj
    public final void LIZ() {
    }

    @Override // X.InterfaceC59489NWj
    public final String LIZJ(int i) {
        return null;
    }

    @Override // X.InterfaceC59489NWj
    public final String onShow() {
        AwemeRawAd awemeRawAd;
        AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.LIZ;
        NWF nwf = adFakePopUpWebPageWidget.LJLLI;
        if (nwf != null && nwf.LJIILJJIL()) {
            adFakePopUpWebPageWidget.LJLLL.post(KRQ.LJLIL);
        }
        adFakePopUpWebPageWidget.LJLLJ = System.currentTimeMillis();
        NWF nwf2 = adFakePopUpWebPageWidget.LJLLI;
        if (nwf2 != null && nwf2.LJIILJJIL()) {
            Aweme aweme = adFakePopUpWebPageWidget.LJLJLJ;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C025908h.LIZLLL("homepage_ad", "othershow", awemeRawAd, "halfscreen_page", "refer");
            return "homepage_ad_halfscreen_page";
        }
        return "homepage_ad_halfscreen_page";
    }

    public C59424NTw(AdFakePopUpWebPageWidget adFakePopUpWebPageWidget) {
        this.LIZ = adFakePopUpWebPageWidget;
    }

    @Override // X.InterfaceC59489NWj
    public final void LIZIZ(int i) {
        AwemeRawAd awemeRawAd;
        AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.LIZ;
        adFakePopUpWebPageWidget.LJLLL.post(KRP.LJLIL);
        NWF nwf = adFakePopUpWebPageWidget.LJLLI;
        if (nwf != null) {
            AwemeRawAd awemeRawAd2 = null;
            if (nwf.LJIILJJIL() && !adFakePopUpWebPageWidget.LJLLLL) {
                Aweme aweme = adFakePopUpWebPageWidget.LJLJLJ;
                if (aweme != null) {
                    awemeRawAd2 = aweme.getAwemeRawAd();
                }
                C025908h.LIZLLL("homepage_ad", "click", awemeRawAd2, "halfscreen_page", "refer");
                adFakePopUpWebPageWidget.LJLLLL = true;
                return;
            }
            String str = "landing_page";
            if (!nwf.LL) {
                Aweme aweme2 = adFakePopUpWebPageWidget.LJLJLJ;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C025908h.LIZLLL("homepage_ad", "othershow", awemeRawAd, "landing_page", "refer");
            }
            Aweme aweme3 = adFakePopUpWebPageWidget.LJLJLJ;
            if (aweme3 != null) {
                awemeRawAd2 = aweme3.getAwemeRawAd();
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("homepage_ad", "click", awemeRawAd2);
            if (nwf.LL) {
                str = "button";
            }
            LIZLLL.LIZJ(str, "refer");
            LIZLLL.LJI();
            adFakePopUpWebPageWidget.LJLLJ = System.currentTimeMillis();
            nwf.setFromAdButtonClick(false);
        }
    }

    @Override // X.InterfaceC59489NWj
    public final void LIZLLL(int i, Boolean bool) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AdFakePopUpWebPageWidget adFakePopUpWebPageWidget = this.LIZ;
        adFakePopUpWebPageWidget.getClass();
        String str = "landing_page";
        if (o.LJ(bool, Boolean.TRUE)) {
            Aweme aweme = adFakePopUpWebPageWidget.LJLJLJ;
            if (aweme != null) {
                awemeRawAd3 = aweme.getAwemeRawAd();
            } else {
                awemeRawAd3 = null;
            }
            C025908h.LIZLLL("homepage_ad", "othershow_fail", awemeRawAd3, "landing_page", "refer");
        } else {
            if (i != 5 && i != 0) {
                adFakePopUpWebPageWidget.LJLLL.post(KRO.LJLIL);
            }
            NWF nwf = adFakePopUpWebPageWidget.LJLLI;
            if (nwf != null) {
                if (nwf.LJIILJJIL() && !adFakePopUpWebPageWidget.LJLLLL) {
                    Aweme aweme2 = adFakePopUpWebPageWidget.LJLJLJ;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd2 = null;
                    }
                    str = "halfscreen_page";
                    C025908h.LIZLLL("homepage_ad", "close", awemeRawAd2, "halfscreen_page", "refer");
                    adFakePopUpWebPageWidget.LJLLLL = true;
                } else {
                    if (NTE.LIZ == 1) {
                        str = "slide";
                    } else {
                        str = "slide_down";
                    }
                    if (i != 5 && i != 0) {
                        Aweme aweme3 = adFakePopUpWebPageWidget.LJLJLJ;
                        if (aweme3 != null) {
                            awemeRawAd = aweme3.getAwemeRawAd();
                        } else {
                            awemeRawAd = null;
                        }
                        C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "close", awemeRawAd);
                        String str2 = adFakePopUpWebPageWidget.LJLLILLLL;
                        if (str2 == null) {
                            str2 = str;
                        }
                        LIZLLL.LIZJ(str2, "refer");
                        LIZLLL.LJI();
                    }
                }
            }
            NWF nwf2 = adFakePopUpWebPageWidget.LJLLI;
            if (nwf2 != null) {
                nwf2.LJIJJ(str);
            }
            long currentTimeMillis = System.currentTimeMillis() - adFakePopUpWebPageWidget.LJLLJ;
            if (adFakePopUpWebPageWidget.LJLLI != null) {
                FMX.LJIIL("h5_stay_time", C169696lJ.LJ(currentTimeMillis, "duration").LIZ);
            }
        }
        this.LIZ.LJLLILLLL = null;
    }
}
