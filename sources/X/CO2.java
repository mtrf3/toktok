package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CO2 implements COV {
    public final /* synthetic */ C31239CNv LIZ;

    public CO2(C31239CNv c31239CNv) {
        this.LIZ = c31239CNv;
    }

    @Override // X.COV
    public final void LIZ(WebView webView, String url) {
        o.LJIIIZ(webView, "webView");
        o.LJIIIZ(url, "url");
        C0NB.LJIIIZ("HybridContainer", "onPageFinished");
        C31239CNv c31239CNv = this.LIZ;
        InterfaceC25290yz interfaceC25290yz = c31239CNv.LJIIIIZZ;
        if (interfaceC25290yz != null) {
            interfaceC25290yz.LIZ(c31239CNv.LJ);
        }
    }

    @Override // X.COV
    public final void LIZIZ(WebView view, String description, String failingUrl) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(description, "description");
        o.LJIIIZ(failingUrl, "failingUrl");
        C0NB.LJIIIZ("HybridContainer", "onPageFinished");
        C31239CNv c31239CNv = this.LIZ;
        InterfaceC25290yz interfaceC25290yz = c31239CNv.LJIIIIZZ;
        if (interfaceC25290yz != null) {
            interfaceC25290yz.LIZLLL(c31239CNv.LJ);
        }
    }
}
