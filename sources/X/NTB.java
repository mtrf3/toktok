package X;

import com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class NTB implements InterfaceC59489NWj {
    public final /* synthetic */ AdPopUpWebPageHelper LIZ;

    @Override // X.InterfaceC59489NWj
    public final void LIZ() {
    }

    @Override // X.InterfaceC59489NWj
    public final void LIZIZ(int i) {
    }

    @Override // X.InterfaceC59489NWj
    public final void LIZLLL(int i, Boolean bool) {
    }

    @Override // X.InterfaceC59489NWj
    public final String onShow() {
        AdPopUpWebPageHelper adPopUpWebPageHelper = this.LIZ;
        Aweme LIZ = adPopUpWebPageHelper.LIZ();
        if (LIZ != null && C63081OpJ.LLJJJIL(LIZ)) {
            C2U8.LIZ(new IK2());
        }
        if (!adPopUpWebPageHelper.LJLJJLL) {
            C2U8.LIZ(new C59219NLz(true));
        }
        adPopUpWebPageHelper.LJLJI = System.currentTimeMillis();
        return null;
    }

    public NTB(AdPopUpWebPageHelper adPopUpWebPageHelper) {
        this.LIZ = adPopUpWebPageHelper;
    }

    @Override // X.InterfaceC59489NWj
    public final String LIZJ(int i) {
        String str;
        AwemeRawAd awemeRawAd;
        String str2;
        AwemeRawAd awemeRawAd2;
        AdPopUpWebPageHelper adPopUpWebPageHelper = this.LIZ;
        Aweme LIZ = adPopUpWebPageHelper.LIZ();
        if (LIZ != null && C63081OpJ.LLJJJIL(LIZ) && C54153LNd.LIZ(adPopUpWebPageHelper.LIZIZ())) {
            C2U8.LIZ(new IK1());
        }
        if (!adPopUpWebPageHelper.LJLJJLL) {
            C2U8.LIZ(new C59219NLz(false));
        }
        if (adPopUpWebPageHelper.LJLJJL != null) {
            if (NTE.LIZ == 1) {
                str2 = "slide";
            } else {
                str2 = "slide_down";
            }
            C59127NIl LIZ2 = C59128NIm.LIZ();
            LIZ2.LIZ = "landing_ad";
            LIZ2.LIZIZ = "close";
            String str3 = adPopUpWebPageHelper.LJLILLLLZI;
            if (str3 == null) {
                str3 = str2;
            }
            LIZ2.LJIIIIZZ(str3);
            LIZ2.LJ(adPopUpWebPageHelper.LIZ());
            LIZ2.LJIIIZ(null);
            Aweme LIZ3 = adPopUpWebPageHelper.LIZ();
            if (LIZ3 != null) {
                awemeRawAd2 = LIZ3.getAwemeRawAd();
            } else {
                awemeRawAd2 = null;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "close", awemeRawAd2);
            String str4 = adPopUpWebPageHelper.LJLILLLLZI;
            if (str4 != null) {
                str2 = str4;
            }
            LIZLLL.LIZJ(str2, "refer");
            LIZLLL.LJII();
        }
        long currentTimeMillis = System.currentTimeMillis() - adPopUpWebPageHelper.LJLJI;
        if (adPopUpWebPageHelper.LJLJJL != null) {
            FMX.LJIIL("h5_stay_time", C169696lJ.LJ(currentTimeMillis, "duration").LIZ);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Aweme LIZ4 = adPopUpWebPageHelper.LIZ();
        if (LIZ4 == null || (awemeRawAd = LIZ4.getAwemeRawAd()) == null || (str = awemeRawAd.getWebUrl()) == null) {
            str = "";
        }
        linkedHashMap.put("url", str);
        linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        long currentTimeMillis2 = System.currentTimeMillis();
        new F15();
        C72818Shy.LIZ(new C76052yf(currentTimeMillis2, F15.LIZLLL(linkedHashMap), "ad_webview_close"));
        this.LIZ.LJLILLLLZI = null;
        return null;
    }
}
