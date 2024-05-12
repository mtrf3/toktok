package X;

import com.ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NTO implements InterfaceC59489NWj {
    public final /* synthetic */ AdProfilePopUpWebPageWidget LIZ;

    @Override // X.InterfaceC59489NWj
    public final void LIZ() {
    }

    @Override // X.InterfaceC59489NWj
    public final String onShow() {
        AwemeRawAd awemeRawAd;
        AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.LIZ;
        adProfilePopUpWebPageWidget.getClass();
        adProfilePopUpWebPageWidget.LJLLILLLL = System.currentTimeMillis();
        NWF nwf = adProfilePopUpWebPageWidget.LJLLI;
        if (nwf != null) {
            if (nwf.LJIILJJIL() || nwf.LJIILIIL()) {
                Aweme aweme = adProfilePopUpWebPageWidget.LJLJLJ;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C025908h.LIZLLL("homepage_ad", "click", awemeRawAd, "halfscreen_page", "refer");
                return "homepage_ad_halfscreen_page";
            }
            return "homepage_ad_halfscreen_page";
        }
        return "homepage_ad_halfscreen_page";
    }

    public NTO(AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget) {
        this.LIZ = adProfilePopUpWebPageWidget;
    }

    @Override // X.InterfaceC59489NWj
    public final void LIZIZ(int i) {
        boolean z;
        boolean z2;
        NWF nwf;
        AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.LIZ;
        NWF nwf2 = adProfilePopUpWebPageWidget.LJLLI;
        if (nwf2 != null && nwf2.LJIILJJIL()) {
            z = true;
        } else {
            z = false;
        }
        AwemeRawAd awemeRawAd = null;
        if ((z || ((nwf = adProfilePopUpWebPageWidget.LJLLI) != null && nwf.LJIILIIL())) && i == 6) {
            Aweme aweme = adProfilePopUpWebPageWidget.LJLJLJ;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            C025908h.LIZLLL("homepage_ad", "otherclick", awemeRawAd, "halfscreen_page", "refer");
        } else {
            NWF nwf3 = adProfilePopUpWebPageWidget.LJLLI;
            if (nwf3 != null && ((C59501NWv) nwf3.LIZ(R.id.hx7)).getActionMode().LIZJ == 6) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (i == 0 || i == 5)) {
                Aweme aweme2 = adProfilePopUpWebPageWidget.LJLJLJ;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                C025908h.LIZLLL("homepage_ad", "click", awemeRawAd, "all_screen_page", "refer");
            } else {
                NWF nwf4 = adProfilePopUpWebPageWidget.LJLLI;
                if (nwf4 != null && nwf4.LJIIL()) {
                    Aweme aweme3 = adProfilePopUpWebPageWidget.LJLJLJ;
                    if (aweme3 != null) {
                        awemeRawAd = aweme3.getAwemeRawAd();
                    }
                    C025908h.LIZLLL("homepage_ad", "click", awemeRawAd, "button", "refer");
                }
            }
        }
        adProfilePopUpWebPageWidget.LJLLILLLL = System.currentTimeMillis();
        NWF nwf5 = adProfilePopUpWebPageWidget.LJLLI;
        if (nwf5 == null) {
            return;
        }
        nwf5.setFromTitleBarClick(false);
    }

    @Override // X.InterfaceC59489NWj
    public final String LIZJ(int i) {
        boolean z;
        String str;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.LIZ;
        NWF nwf = adProfilePopUpWebPageWidget.LJLLI;
        if (nwf != null && nwf.LJIILIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (z && i == 6) {
            Aweme aweme = adProfilePopUpWebPageWidget.LJLJLJ;
            if (aweme != null) {
                awemeRawAd2 = aweme.getAwemeRawAd();
            } else {
                awemeRawAd2 = null;
            }
            C025908h.LIZLLL("homepage_ad", "close", awemeRawAd2, "halfscreen_page", "refer");
        } else {
            if (i != 4) {
                if (NTE.LIZ == 1) {
                    str = "slide";
                } else {
                    str = "slide_down";
                }
                Aweme aweme2 = adProfilePopUpWebPageWidget.LJLJLJ;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "close", awemeRawAd);
                String str2 = adProfilePopUpWebPageWidget.LJLLJ;
                if (str2 != null) {
                    str = str2;
                }
                LIZLLL.LIZJ(str, "refer");
                LIZLLL.LJI();
            }
            this.LIZ.LJLLJ = null;
            return null;
        }
        Aweme aweme3 = adProfilePopUpWebPageWidget.LJLJLJ;
        if (aweme3 != null && C63081OpJ.LLJIJIL(aweme3)) {
            C2U8.LIZ(new NTP());
        }
        adProfilePopUpWebPageWidget.LJIILLIIL(System.currentTimeMillis() - adProfilePopUpWebPageWidget.LJLLILLLL);
        this.LIZ.LJLLJ = null;
        return null;
    }

    @Override // X.InterfaceC59489NWj
    public final void LIZLLL(int i, Boolean bool) {
        boolean z;
        String str;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AdProfilePopUpWebPageWidget adProfilePopUpWebPageWidget = this.LIZ;
        adProfilePopUpWebPageWidget.getClass();
        if (o.LJ(bool, Boolean.TRUE)) {
            Aweme aweme = adProfilePopUpWebPageWidget.LJLJLJ;
            if (aweme != null) {
                awemeRawAd3 = aweme.getAwemeRawAd();
            } else {
                awemeRawAd3 = null;
            }
            C025908h.LIZLLL("homepage_ad", "othershow_fail", awemeRawAd3, "button", "refer");
        } else {
            NWF nwf = adProfilePopUpWebPageWidget.LJLLI;
            if (nwf != null && nwf.LJIILJJIL()) {
                z = true;
            } else {
                z = false;
            }
            if (z && i == 6) {
                Aweme aweme2 = adProfilePopUpWebPageWidget.LJLJLJ;
                if (aweme2 != null) {
                    awemeRawAd2 = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                str = "halfscreen_page";
                C025908h.LIZLLL("homepage_ad", "close", awemeRawAd2, "halfscreen_page", "refer");
            } else if (i != 0 && i != 5) {
                if (NTE.LIZ == 1) {
                    str = "slide";
                } else {
                    str = "slide_down";
                }
                Aweme aweme3 = adProfilePopUpWebPageWidget.LJLJLJ;
                if (aweme3 != null) {
                    awemeRawAd = aweme3.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "close", awemeRawAd);
                String str2 = adProfilePopUpWebPageWidget.LJLLJ;
                if (str2 == null) {
                    str2 = str;
                }
                LIZLLL.LIZJ(str2, "refer");
                LIZLLL.LJI();
            }
            NWF nwf2 = adProfilePopUpWebPageWidget.LJLLI;
            if (nwf2 != null) {
                nwf2.LJIJJ(str);
            }
            adProfilePopUpWebPageWidget.LJIILLIIL(System.currentTimeMillis() - adProfilePopUpWebPageWidget.LJLLILLLL);
        }
        this.LIZ.LJLLJ = null;
    }
}
