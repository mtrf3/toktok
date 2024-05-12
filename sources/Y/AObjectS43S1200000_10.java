package Y;

import X.InterfaceC65784Pro;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;

/* loaded from: classes11.dex */
public class AObjectS43S1200000_10 implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final Object invoke$0(AObjectS43S1200000_10 aObjectS43S1200000_10) {
        ((AdWebStatBusiness) aObjectS43S1200000_10.l1).LJII((WebView) aObjectS43S1200000_10.l2, aObjectS43S1200000_10.s0, false);
        return null;
    }

    public static final Object invoke$1(AObjectS43S1200000_10 aObjectS43S1200000_10) {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) aObjectS43S1200000_10.l1;
        WebView webView = (WebView) aObjectS43S1200000_10.l2;
        adWebStatBusiness.LJII(webView, aObjectS43S1200000_10.s0, true);
        adWebStatBusiness.LJI.LIZJ(webView.getUrl());
        return null;
    }

    public AObjectS43S1200000_10(AdWebStatBusiness adWebStatBusiness, WebView webView, String str, int i) {
        this.$t = i;
        this.l1 = adWebStatBusiness;
        this.l2 = webView;
        this.s0 = str;
    }
}
