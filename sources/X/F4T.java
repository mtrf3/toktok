package X;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F4T extends C59862NeU {
    public final F4U LJLJLJ;

    public F4T(F49 f49) {
        super(5);
        this.LJLJLJ = f49;
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.LJLJLJ.LIZ(webView, str);
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        int statusCode;
        WebResourceResponse LIZJ = this.LJLJLJ.LIZJ(webView, webResourceRequest);
        if (LIZJ != null) {
            return LIZJ;
        }
        WebResourceResponse shouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        if (shouldInterceptRequest != null && (!o.LJ(shouldInterceptRequest.getMimeType(), "text/html") || ((300 <= (statusCode = shouldInterceptRequest.getStatusCode()) && statusCode < 400) || o.LJ(shouldInterceptRequest.getReasonPhrase(), "redirect")))) {
            return shouldInterceptRequest;
        }
        return this.LJLJLJ.LJ(webView, webResourceRequest, shouldInterceptRequest);
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.LJLJLJ.LIZIZ(webView, str);
    }
}
