package X;

import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.NTx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59425NTx implements InterfaceC59489NWj {
    public final /* synthetic */ AdNewFakePopUpWebPageWidget LIZ;

    @Override // X.InterfaceC59489NWj
    public final void LIZ() {
    }

    @Override // X.InterfaceC59489NWj
    public final String onShow() {
        AwemeRawAd awemeRawAd;
        AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.LIZ;
        adNewFakePopUpWebPageWidget.getClass();
        adNewFakePopUpWebPageWidget.LJLLJ = System.currentTimeMillis();
        NWF nwf = adNewFakePopUpWebPageWidget.LJLLI;
        if (nwf != null) {
            if (nwf.LJIILJJIL() || nwf.LJIILIIL()) {
                Aweme aweme = adNewFakePopUpWebPageWidget.LJLJLJ;
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

    public C59425NTx(AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget) {
        this.LIZ = adNewFakePopUpWebPageWidget;
    }

    @Override // X.InterfaceC59489NWj
    public final void LIZIZ(int i) {
        boolean z;
        NWF nwf;
        AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.LIZ;
        NWF nwf2 = adNewFakePopUpWebPageWidget.LJLLI;
        if (nwf2 != null && nwf2.LJIILJJIL()) {
            z = true;
        } else {
            z = false;
        }
        AwemeRawAd awemeRawAd = null;
        if ((z || ((nwf = adNewFakePopUpWebPageWidget.LJLLI) != null && nwf.LJIILIIL())) && i == 6) {
            Aweme aweme = adNewFakePopUpWebPageWidget.LJLJLJ;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            C025908h.LIZLLL("homepage_ad", "otherclick", awemeRawAd, "halfscreen_page", "refer");
        } else if (adNewFakePopUpWebPageWidget.LJLLI != null) {
            Aweme aweme2 = adNewFakePopUpWebPageWidget.LJLJLJ;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            }
            C025908h.LIZLLL("homepage_ad", "click", awemeRawAd, "button", "refer");
        }
        adNewFakePopUpWebPageWidget.LJLLJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC59489NWj
    public final String LIZJ(int i) {
        boolean z;
        AwemeRawAd awemeRawAd;
        String str;
        AwemeRawAd awemeRawAd2;
        AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.LIZ;
        NWF nwf = adNewFakePopUpWebPageWidget.LJLLI;
        if (nwf != null && nwf.LJIILIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (z && i == 3) {
            if (NTE.LIZ == 1) {
                str = "slide";
            } else {
                str = "slide_down";
            }
            Aweme aweme = adNewFakePopUpWebPageWidget.LJLJLJ;
            if (aweme != null) {
                awemeRawAd2 = aweme.getAwemeRawAd();
            } else {
                awemeRawAd2 = null;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "close", awemeRawAd2);
            String str2 = adNewFakePopUpWebPageWidget.LJLLILLLL;
            if (str2 != null) {
                str = str2;
            }
            LIZLLL.LIZJ(str, "refer");
            LIZLLL.LJI();
        }
        NWF nwf2 = adNewFakePopUpWebPageWidget.LJLLI;
        if (nwf2 != null && nwf2.LJIILIIL() && i == 6) {
            Aweme aweme2 = adNewFakePopUpWebPageWidget.LJLJLJ;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C025908h.LIZLLL("homepage_ad", "close", awemeRawAd, "halfscreen_page", "refer");
        }
        long currentTimeMillis = System.currentTimeMillis() - adNewFakePopUpWebPageWidget.LJLLJ;
        if (adNewFakePopUpWebPageWidget.LJLLI != null) {
            FMX.LJIIL("h5_stay_time", C169696lJ.LJ(currentTimeMillis, "duration").LIZ);
        }
        C2U8.LIZ(new IK6());
        return null;
    }

    @Override // X.InterfaceC59489NWj
    public final void LIZLLL(int i, Boolean bool) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.LIZ;
        adNewFakePopUpWebPageWidget.getClass();
        String str = "button";
        if (o.LJ(bool, Boolean.TRUE)) {
            Aweme aweme = adNewFakePopUpWebPageWidget.LJLJLJ;
            if (aweme != null) {
                awemeRawAd3 = aweme.getAwemeRawAd();
            } else {
                awemeRawAd3 = null;
            }
            C025908h.LIZLLL("homepage_ad", "othershow_fail", awemeRawAd3, "button", "refer");
        } else {
            NWF nwf = adNewFakePopUpWebPageWidget.LJLLI;
            if (nwf != null) {
                if (nwf.LJIILJJIL() && i == 6) {
                    Aweme aweme2 = adNewFakePopUpWebPageWidget.LJLJLJ;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd2 = null;
                    }
                    str = "halfscreen_page";
                    C025908h.LIZLLL("homepage_ad", "close", awemeRawAd2, "halfscreen_page", "refer");
                } else {
                    if (NTE.LIZ == 1) {
                        str = "slide";
                    } else {
                        str = "slide_down";
                    }
                    if (i != 5 && i != 0) {
                        nwf.LJIJJ(str);
                        Aweme aweme3 = adNewFakePopUpWebPageWidget.LJLJLJ;
                        if (aweme3 != null) {
                            awemeRawAd = aweme3.getAwemeRawAd();
                        } else {
                            awemeRawAd = null;
                        }
                        C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "close", awemeRawAd);
                        String str2 = adNewFakePopUpWebPageWidget.LJLLILLLL;
                        if (str2 == null) {
                            str2 = str;
                        }
                        LIZLLL.LIZJ(str2, "refer");
                        LIZLLL.LJI();
                    }
                }
            }
            NWF nwf2 = adNewFakePopUpWebPageWidget.LJLLI;
            if (nwf2 != null) {
                nwf2.LJIJJ(str);
            }
            long currentTimeMillis = System.currentTimeMillis() - adNewFakePopUpWebPageWidget.LJLLJ;
            if (adNewFakePopUpWebPageWidget.LJLLI != null) {
                FMX.LJIIL("h5_stay_time", C169696lJ.LJ(currentTimeMillis, "duration").LIZ);
            }
        }
        this.LIZ.LJLLILLLL = null;
    }
}
