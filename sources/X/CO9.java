package X;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes6.dex */
public class CO9 extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        VMI.LJ.LIZJ(webView, i);
    }
}
