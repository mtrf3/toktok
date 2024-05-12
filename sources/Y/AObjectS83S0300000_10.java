package Y;

import X.C59273NOb;
import X.C59612NaS;
import X.C59613NaT;
import X.InterfaceC65784Pro;
import X.NZR;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;

/* loaded from: classes11.dex */
public class AObjectS83S0300000_10 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS83S0300000_10 aObjectS83S0300000_10) {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) aObjectS83S0300000_10.l0;
        NZR nzr = (NZR) aObjectS83S0300000_10.l1;
        C59273NOb c59273NOb = (C59273NOb) aObjectS83S0300000_10.l2;
        if (nzr != null) {
            nzr.injectAdPerfJs(adWebStatBusiness.LIZIZ(c59273NOb, 0));
            return null;
        }
        adWebStatBusiness.getClass();
        return null;
    }

    public static final Object invoke$1(AObjectS83S0300000_10 aObjectS83S0300000_10) {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) aObjectS83S0300000_10.l0;
        C59273NOb c59273NOb = (C59273NOb) aObjectS83S0300000_10.l1;
        WebView webView = (WebView) aObjectS83S0300000_10.l2;
        String LIZIZ = adWebStatBusiness.LIZIZ(c59273NOb, 0);
        if (webView instanceof C59613NaT) {
            ((C59613NaT) webView).injectAdPerfJs(LIZIZ);
        }
        if (webView instanceof C59612NaS) {
            ((C59612NaS) webView).injectAdPerfJs(LIZIZ);
            return null;
        }
        return null;
    }

    public AObjectS83S0300000_10(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
