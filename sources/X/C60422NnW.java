package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: X.NnW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60422NnW extends C59863NeV {
    public final void LIZJ(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    public final void LJ(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
    }

    public final void LJFF(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    public final void LJII(WebView webView, ClientCertRequest clientCertRequest) {
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public final boolean LJIILJJIL(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public final void LJIJ(WebView webView, KeyEvent keyEvent) {
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    public final WebResourceResponse LJIJI(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final WebResourceResponse LJIJJ(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    public final boolean LJIJJLI(WebView webView, KeyEvent keyEvent) {
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public final boolean LJIL(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final boolean LJJ(WebView webView, String str) {
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onLoadResource");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LIZJ(webView, str);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onPageCommitVisible");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LIZLLL(webView, str);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onPageFinished");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJ(webView, str);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onPageFinished(webView, str);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onReceivedClientCertRequest");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJI(webView, clientCertRequest);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onRenderProcessGone");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJIILIIL(webView, renderProcessGoneDetail);
            c60335Nm7.get().LIZ();
            C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
            return true;
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
        return true;
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onUnhandledKeyEvent");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJIIZILJ(webView, keyEvent);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "shouldInterceptRequest");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            WebResourceResponse LJIJ = ((AbstractC60423NnX) LIZIZ).LJIJ(webView, webResourceRequest);
            c60335Nm7.get().LIZ();
            return LJIJ;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "shouldOverrideKeyEvent");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJIJJ = ((AbstractC60423NnX) LIZIZ).LJIJJ(webView, keyEvent);
            c60335Nm7.get().LIZ();
            return LJIJJ;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "shouldOverrideUrlLoading");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJIJJLI = ((AbstractC60423NnX) LIZIZ).LJIJJLI(webView, webResourceRequest);
            c60335Nm7.get().LIZ();
            return LJIJJLI;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "shouldInterceptRequest");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            WebResourceResponse LJIJI = ((AbstractC60423NnX) LIZIZ).LJIJI(webView, str);
            c60335Nm7.get().LIZ();
            return LJIJI;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "shouldOverrideUrlLoading");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean LJIL = ((AbstractC60423NnX) LIZIZ).LJIL(webView, str);
            c60335Nm7.get().LIZ();
            return LJIL;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final void LIZ(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
    }

    public final void LIZIZ(WebView webView, Message message, Message message2) {
        super.onFormResubmission(webView, message, message2);
    }

    public final void LJI(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    public final void LJIIIZ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public final void LJIIJJI(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public final void LJIILIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public final void LJIILLIIL(WebView webView, float f, float f2) {
        super.onScaleChanged(webView, f, f2);
    }

    public final void LJIIZILJ(WebView webView, Message message, Message message2) {
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "doUpdateVisitedHistory");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LIZ(webView, str, z);
            c60335Nm7.get().LIZ();
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onFormResubmission");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LIZIZ(webView, message, message2);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onPageStarted");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJFF(webView, str, bitmap);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onReceivedError");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJIIIIZZ(webView, webResourceRequest, webResourceError);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onReceivedHttpError");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJIIJ(webView, webResourceRequest, webResourceResponse);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onReceivedSslError");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJIIL(webView, sslErrorHandler, sslError);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onScaleChanged");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJIILL(webView, f, f2);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onScaleChanged(webView, f, f2);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onTooManyRedirects");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJIILLIIL(webView, message, message2);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    public final void LJIIIIZZ(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    public final void LJIIJ(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public final void LJIIL(WebView webView, String str, String str2, String str3) {
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public final void LJIILL(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onReceivedError");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJII(webView, i, str, str2);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onReceivedHttpAuthRequest");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJIIIZ(webView, httpAuthHandler, str, str2);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onReceivedLoginRequest");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJIIJJI(webView, str, str2, str3);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // X.C59863NeV, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onSafeBrowsingHit");
        if (LIZIZ instanceof AbstractC60423NnX) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60423NnX) LIZIZ).LJIILJJIL(webView, webResourceRequest, i, safeBrowsingResponse);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }
}
