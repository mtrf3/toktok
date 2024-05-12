package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.NZy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59582NZy extends WebViewClient {
    public final CopyOnWriteArrayList<NVZ> LIZ = new CopyOnWriteArrayList<>();

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onLoadResource(webView, str);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onPageFinished(webView, str);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onRenderProcessGone(webView, renderProcessGoneDetail);
                return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
            } catch (FCQ unused) {
            }
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                return it.next().shouldInterceptRequest(webView, webResourceRequest);
            } catch (FCQ unused) {
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (C59312NPo.LJFF(webView, str)) {
            return true;
        }
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                return it.next().shouldOverrideUrlLoading(webView, str);
            } catch (FCQ unused) {
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                return it.next().shouldInterceptRequest(webView, str);
            } catch (FCQ unused) {
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                return it.next().shouldOverrideUrlLoading(webView, webResourceRequest);
            } catch (FCQ unused) {
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onPageStarted(webView, str, bitmap);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedError(webView, webResourceRequest, webResourceError);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedSslError(webView, sslErrorHandler, sslError);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedError(webView, i, str, str2);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        Iterator<NVZ> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } catch (FCQ unused) {
            }
        }
    }
}
