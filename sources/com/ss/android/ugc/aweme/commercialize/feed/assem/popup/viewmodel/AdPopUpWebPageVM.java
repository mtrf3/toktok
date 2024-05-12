package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel;

import X.C169696lJ;
import X.C2U8;
import X.C58655N0h;
import X.C58704N2e;
import X.C59534NYc;
import X.C59544NYm;
import X.C72818Shy;
import X.C76052yf;
import X.F15;
import X.FMX;
import X.KRH;
import X.NTE;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class AdPopUpWebPageVM extends AbsAdPopUpWebPageVM {
    public final String kv0() {
        String str;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        String str2;
        Aweme aweme2;
        Aweme aweme3;
        AwemeRawAd awemeRawAd2;
        this.LJLLILLLL = false;
        C2U8.LIZ(new KRH(false));
        setState(C59534NYc.LJLIL);
        setState(C59544NYm.LJLIL);
        if (NTE.LIZ == 1) {
            str = "slide";
        } else {
            str = "slide_down";
        }
        VideoItemParams gv0 = gv0();
        AwemeRawAd awemeRawAd3 = null;
        if (gv0 != null && (aweme = gv0.getAweme()) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getWebviewType() == 1 && this.LJLLI == 2) {
            VideoItemParams gv02 = gv0();
            if (gv02 != null && (aweme3 = gv02.getAweme()) != null && (awemeRawAd2 = aweme3.getAwemeRawAd()) != null && awemeRawAd2.getWebviewPannelStyle() == 1) {
                str2 = "close";
            } else {
                str2 = "landing_page";
            }
            VideoItemParams gv03 = gv0();
            if (gv03 != null && (aweme2 = gv03.getAweme()) != null) {
                awemeRawAd3 = aweme2.getAwemeRawAd();
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", str2, awemeRawAd3);
            String str3 = this.LJLJLLL;
            if (str3 == null) {
                str3 = str;
            }
            LIZLLL.LIZJ(str3, "refer");
            LIZLLL.LJI();
        }
        FMX.LJIIL("h5_stay_time", C169696lJ.LJ(System.currentTimeMillis() - this.LJLL, "duration").LIZ);
        lv0();
        String str4 = this.LJLJLLL;
        if (str4 == null) {
            return str;
        }
        return str4;
    }

    public final void lv0() {
        String str;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VideoItemParams gv0 = gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (str = awemeRawAd.getWebUrl()) == null) {
            str = "";
        }
        linkedHashMap.put("url", str);
        linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        long currentTimeMillis = System.currentTimeMillis();
        new F15();
        C72818Shy.LIZ(new C76052yf(currentTimeMillis, F15.LIZLLL(linkedHashMap), "ad_webview_close"));
    }
}
