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

/* renamed from: X.NnX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC60423NnX extends AbstractC60536NpM<C60422NnW> {
    public void LIZJ(WebView webView, String str) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onLoadResource");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LIZJ(webView, str);
        } else {
            getExtendable().LIZJ(webView, str);
        }
    }

    public final void LIZLLL(WebView webView, String str) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onPageCommitVisible");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LIZLLL(webView, str);
        } else {
            getExtendable().LJ(webView, str);
        }
    }

    public void LJ(WebView webView, String str) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onPageFinished");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJ(webView, str);
        } else {
            getExtendable().LJFF(webView, str);
        }
    }

    public final void LJI(WebView webView, ClientCertRequest clientCertRequest) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onReceivedClientCertRequest");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJI(webView, clientCertRequest);
        } else {
            getExtendable().LJII(webView, clientCertRequest);
        }
    }

    public boolean LJIILIIL(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onRenderProcessGone");
        if (LIZ instanceof AbstractC60423NnX) {
            return ((AbstractC60423NnX) LIZ).LJIILIIL(webView, renderProcessGoneDetail);
        }
        return getExtendable().LJIILJJIL(webView, renderProcessGoneDetail);
    }

    public final void LJIIZILJ(WebView webView, KeyEvent keyEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onUnhandledKeyEvent");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJIIZILJ(webView, keyEvent);
        } else {
            getExtendable().LJIJ(webView, keyEvent);
        }
    }

    public WebResourceResponse LJIJ(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "shouldInterceptRequest");
        if (LIZ instanceof AbstractC60423NnX) {
            return ((AbstractC60423NnX) LIZ).LJIJ(webView, webResourceRequest);
        }
        return getExtendable().LJIJI(webView, webResourceRequest);
    }

    public WebResourceResponse LJIJI(WebView webView, String str) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "shouldInterceptRequest");
        if (LIZ instanceof AbstractC60423NnX) {
            return ((AbstractC60423NnX) LIZ).LJIJI(webView, str);
        }
        return getExtendable().LJIJJ(webView, str);
    }

    public final boolean LJIJJ(WebView webView, KeyEvent keyEvent) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "shouldOverrideKeyEvent");
        if (LIZ instanceof AbstractC60423NnX) {
            return ((AbstractC60423NnX) LIZ).LJIJJ(webView, keyEvent);
        }
        return getExtendable().LJIJJLI(webView, keyEvent);
    }

    public boolean LJIJJLI(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "shouldOverrideUrlLoading");
        if (LIZ instanceof AbstractC60423NnX) {
            return ((AbstractC60423NnX) LIZ).LJIJJLI(webView, webResourceRequest);
        }
        return getExtendable().LJIL(webView, webResourceRequest);
    }

    public boolean LJIL(WebView webView, String str) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "shouldOverrideUrlLoading");
        if (LIZ instanceof AbstractC60423NnX) {
            return ((AbstractC60423NnX) LIZ).LJIL(webView, str);
        }
        return getExtendable().LJJ(webView, str);
    }

    public void LIZ(WebView webView, String str, boolean z) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "doUpdateVisitedHistory");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LIZ(webView, str, z);
        } else {
            getExtendable().LIZ(webView, str, z);
        }
    }

    public final void LIZIZ(WebView webView, Message message, Message message2) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onFormResubmission");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LIZIZ(webView, message, message2);
        } else {
            getExtendable().LIZIZ(webView, message, message2);
        }
    }

    public void LJFF(WebView webView, String str, Bitmap bitmap) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onPageStarted");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJFF(webView, str, bitmap);
        } else {
            getExtendable().LJI(webView, str, bitmap);
        }
    }

    public void LJIIIIZZ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onReceivedError");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJIIIIZZ(webView, webResourceRequest, webResourceError);
        } else {
            getExtendable().LJIIIZ(webView, webResourceRequest, webResourceError);
        }
    }

    public void LJIIJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onReceivedHttpError");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJIIJ(webView, webResourceRequest, webResourceResponse);
        } else {
            getExtendable().LJIIJJI(webView, webResourceRequest, webResourceResponse);
        }
    }

    public void LJIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onReceivedSslError");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJIIL(webView, sslErrorHandler, sslError);
        } else {
            getExtendable().LJIILIIL(webView, sslErrorHandler, sslError);
        }
    }

    public final void LJIILL(WebView webView, float f, float f2) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onScaleChanged");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJIILL(webView, f, f2);
        } else {
            getExtendable().LJIILLIIL(webView, f, f2);
        }
    }

    public final void LJIILLIIL(WebView webView, Message message, Message message2) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onTooManyRedirects");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJIILLIIL(webView, message, message2);
        } else {
            getExtendable().LJIIZILJ(webView, message, message2);
        }
    }

    public void LJII(WebView webView, int i, String str, String str2) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onReceivedError");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJII(webView, i, str, str2);
        } else {
            getExtendable().LJIIIIZZ(webView, i, str, str2);
        }
    }

    public void LJIIIZ(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onReceivedHttpAuthRequest");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJIIIZ(webView, httpAuthHandler, str, str2);
        } else {
            getExtendable().LJIIJ(webView, httpAuthHandler, str, str2);
        }
    }

    public final void LJIIJJI(WebView webView, String str, String str2, String str3) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onReceivedLoginRequest");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJIIJJI(webView, str, str2, str3);
        } else {
            getExtendable().LJIIL(webView, str, str2, str3);
        }
    }

    public final void LJIILJJIL(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onSafeBrowsingHit");
        if (LIZ instanceof AbstractC60423NnX) {
            ((AbstractC60423NnX) LIZ).LJIILJJIL(webView, webResourceRequest, i, safeBrowsingResponse);
        } else {
            getExtendable().LJIILL(webView, webResourceRequest, i, safeBrowsingResponse);
        }
    }
}
