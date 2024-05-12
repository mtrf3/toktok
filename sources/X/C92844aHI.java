package X;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: X.aHI, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92844aHI extends C60404NnE {
    public final /* synthetic */ C92110a5S LJLIL;

    public C92844aHI(C92110a5S c92110a5S) {
        this.LJLIL = c92110a5S;
    }

    @Override // X.AbstractC60402NnC
    public final void onProgressChanged(WebView webView, int i) {
        WebChromeClient webChromeClient;
        super.onProgressChanged(webView, i);
        C92110a5S c92110a5S = this.LJLIL;
        if (c92110a5S != null && (webChromeClient = c92110a5S.LIZ) != null) {
            webChromeClient.onProgressChanged(webView, i);
        }
    }

    @Override // X.AbstractC60402NnC
    public final void onReceivedTitle(WebView webView, String str) {
        WebChromeClient webChromeClient;
        super.onReceivedTitle(webView, str);
        C92110a5S c92110a5S = this.LJLIL;
        if (c92110a5S != null && (webChromeClient = c92110a5S.LIZ) != null) {
            webChromeClient.onReceivedTitle(webView, str);
        }
    }
}
