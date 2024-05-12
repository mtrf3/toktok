package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: X.NJd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC59145NJd implements NZX {
    @Override // X.NZX
    public final void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    @Override // X.NZX
    public final void LJFF(WebView webView, int i, String str, String str2) {
    }

    @Override // X.NZX
    public final void LJIIL(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // X.NZX
    public final void LJIILIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // X.NZX
    public final boolean LJIILJJIL(WebView webView, String str, WebResourceRequest webResourceRequest, boolean z) {
        return false;
    }

    @Override // X.NZX
    public final void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // X.NZX
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }
}
