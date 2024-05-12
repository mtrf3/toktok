package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer;

/* loaded from: classes11.dex */
public final class NVX extends C59458NVe {
    public final /* synthetic */ BaseCommonBizRootContainer LIZIZ;

    public NVX(BaseCommonBizRootContainer baseCommonBizRootContainer) {
        this.LIZIZ = baseCommonBizRootContainer;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C59458NVe c59458NVe = this.LIZIZ.LLF;
        if (c59458NVe != null) {
            c59458NVe.onPageFinished(webView, str);
        }
        BaseCommonBizRootContainer baseCommonBizRootContainer = this.LIZIZ;
        baseCommonBizRootContainer.getClass();
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            NTF.LJJ(baseCommonBizRootContainer, true);
        }
    }

    @Override // X.NVZ
    public final void LIZ(WebView webView, C59151NJj c59151NJj, NUZ nuz) {
        C59458NVe c59458NVe = this.LIZIZ.LLF;
        if (c59458NVe != null) {
            c59458NVe.LIZ(webView, c59151NJj, nuz);
        }
    }

    @Override // X.NVZ
    public final void LIZIZ(WebView webView, C59151NJj c59151NJj, WebResourceResponse webResourceResponse) {
        C59458NVe c59458NVe = this.LIZIZ.LLF;
        if (c59458NVe != null) {
            c59458NVe.LIZIZ(webView, c59151NJj, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C59458NVe c59458NVe = this.LIZIZ.LLF;
        if (c59458NVe != null) {
            c59458NVe.onPageStarted(webView, str, bitmap);
        }
        BaseCommonBizRootContainer baseCommonBizRootContainer = this.LIZIZ;
        baseCommonBizRootContainer.getClass();
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            NTF.LJJ(baseCommonBizRootContainer, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C59458NVe c59458NVe = this.LIZIZ.LLF;
        if (c59458NVe != null) {
            c59458NVe.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C59458NVe c59458NVe = this.LIZIZ.LLF;
        if (c59458NVe != null) {
            c59458NVe.onReceivedError(webView, i, str, str2);
        }
    }
}
