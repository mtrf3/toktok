package X;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* renamed from: X.O8v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61425O8v extends C60413NnN {
    public final /* synthetic */ C61419O8p LJLILLLLZI;

    public C61425O8v(C61419O8p c61419O8p) {
        this.LJLILLLLZI = c61419O8p;
    }

    @Override // X.AbstractC60423NnX
    public final void LJIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url;
        this.LJLILLLLZI.LJLJJL = false;
        if (webView != null && (url = webView.getUrl()) != null) {
            this.LJLILLLLZI.LIZIZ(url);
        }
    }
}
