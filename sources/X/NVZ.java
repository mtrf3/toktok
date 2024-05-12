package X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes11.dex */
public class NVZ extends WebViewClient {
    public void LIZ(WebView webView, C59151NJj c59151NJj, NUZ nuz) {
    }

    public void LIZIZ(WebView webView, C59151NJj c59151NJj, WebResourceResponse webResourceResponse) {
    }

    public void LIZJ() {
        throw new FCQ("An operation is not implemented");
    }

    public WebResourceResponse LIZLLL(WebView webView, C59151NJj c59151NJj) {
        throw new FCQ("An operation is not implemented");
    }

    public boolean LJ(WebView webView, C59151NJj c59151NJj) {
        throw new FCQ("An operation is not implemented");
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        LIZJ();
        C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C59151NJj c59151NJj;
        if (webResourceRequest != null) {
            c59151NJj = new C59151NJj(webResourceRequest);
        } else {
            c59151NJj = null;
        }
        return LIZLLL(webView, c59151NJj);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C59151NJj c59151NJj;
        if (webResourceRequest != null) {
            c59151NJj = new C59151NJj(webResourceRequest);
        } else {
            c59151NJj = null;
        }
        return LJ(webView, c59151NJj);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        throw new FCQ("An operation is not implemented");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        throw new FCQ("An operation is not implemented");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C59151NJj c59151NJj;
        NUZ nuz = null;
        if (webResourceRequest != null) {
            c59151NJj = new C59151NJj(webResourceRequest);
        } else {
            c59151NJj = null;
        }
        if (webResourceError != null) {
            nuz = new NUZ(webResourceError);
        }
        LIZ(webView, c59151NJj, nuz);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C59151NJj c59151NJj;
        if (webResourceRequest != null) {
            c59151NJj = new C59151NJj(webResourceRequest);
        } else {
            c59151NJj = null;
        }
        LIZIZ(webView, c59151NJj, webResourceResponse);
    }
}
