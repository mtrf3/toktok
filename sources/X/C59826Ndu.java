package X;

import android.webkit.WebView;

/* renamed from: X.Ndu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59826Ndu extends C59825Ndt {
    public final InterfaceC60279NlD LJLIL;

    public C59826Ndu(InterfaceC60279NlD interfaceC60279NlD) {
        this.LJLIL = interfaceC60279NlD;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        InterfaceC60279NlD interfaceC60279NlD = this.LJLIL;
        if (interfaceC60279NlD != null) {
            interfaceC60279NlD.LIZJ(webView, i);
        }
    }
}
