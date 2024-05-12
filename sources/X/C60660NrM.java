package X;

import android.webkit.WebView;

/* renamed from: X.NrM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60660NrM extends AbstractC60402NnC {
    public final /* synthetic */ C60661NrN LJLIL;
    public final /* synthetic */ C60659NrL LJLILLLLZI;

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr<?> getExtension() {
        return this.LJLIL;
    }

    public C60660NrM(C60661NrN c60661NrN, C60659NrL c60659NrL) {
        this.LJLIL = c60661NrN;
        this.LJLILLLLZI = c60659NrL;
    }

    @Override // X.AbstractC60402NnC
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InterfaceC60663NrP interfaceC60663NrP = this.LJLILLLLZI.LJLJL;
        if (interfaceC60663NrP != null) {
            interfaceC60663NrP.LLLLII(str);
        }
    }
}
