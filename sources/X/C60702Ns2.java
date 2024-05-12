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
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Ns2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60702Ns2 extends AbstractC60423NnX {
    public boolean LJLIL;
    public final /* synthetic */ C60427Nnb LJLILLLLZI;

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr<?> getExtension() {
        return this.LJLILLLLZI;
    }

    public C60702Ns2(C60427Nnb c60427Nnb) {
        this.LJLILLLLZI = c60427Nnb;
    }

    @Override // X.AbstractC60423NnX
    public final void LIZJ(WebView webView, String str) {
        InterfaceC60614Nqc bridgeService$hybrid_web_release;
        super.LIZJ(webView, str);
        if (!(webView instanceof WebKitView)) {
            webView = null;
        }
        WebKitView webKitView = (WebKitView) webView;
        if (webKitView != null && str != null && (bridgeService$hybrid_web_release = webKitView.getBridgeService$hybrid_web_release()) != null) {
            bridgeService$hybrid_web_release.LIZJ(str);
        }
    }

    @Override // X.AbstractC60423NnX
    public final void LJ(WebView webView, String str) {
        WebView webView2;
        super.LJ(webView, str);
        VMI.LJ.LIZ(webView, str);
        boolean z = webView instanceof WebKitView;
        if (!z) {
            webView2 = null;
        } else {
            webView2 = webView;
        }
        WebKitView webKitView = (WebKitView) webView2;
        if (webKitView != null) {
            AbstractC60673NrZ webKitLifeCycle$hybrid_web_release = webKitView.getWebKitLifeCycle$hybrid_web_release();
            if (webKitLifeCycle$hybrid_web_release != null) {
                webKitLifeCycle$hybrid_web_release.LJJJJJ(webKitView);
            }
            webKitView.setReadyToSendEvent$hybrid_web_release(true);
            webKitView.getHybridContext().LJIIL();
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, i0.LJFF("onPageFinished, url:", str), null, null, 6);
            String str2 = webKitView.getHybridContext().containerId;
            if (str2 == null) {
                str2 = "";
            }
            FD5.LIZJ(System.currentTimeMillis(), str2, "prepare_engine_load_end");
            FD5.LJIIJ(webKitView.getHybridContext().containerId, Long.valueOf(System.currentTimeMillis()), "on_page_finished");
        }
        if (!z) {
            webView = null;
        }
        WebKitView webKitView2 = (WebKitView) webView;
        if (webKitView2 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("javascript:(function () {    window.reactId = '");
            LIZ.append(webKitView2.getHybridContext().containerId);
            LIZ.append("';");
            LIZ.append("})();");
            webKitView2.loadUrl(X1D.LIZIZ(LIZ));
        }
        if (!this.LJLIL && str != null) {
            UriProtector.parse(str);
        }
        this.LJLIL = false;
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIILIIL(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean z = webView instanceof WebKitView;
        if (z && webView != null) {
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, "onRenderProcessGone", null, null, 6);
        }
        boolean LJIILIIL = super.LJIILIIL(webView, renderProcessGoneDetail);
        if (!z) {
            webView = null;
        }
        WebKitView webKitView = (WebKitView) webView;
        if (webKitView != null) {
            webKitView.getInitParams$hybrid_web_release();
        }
        return LJIILIIL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x020f, code lost:
    
        if (r6 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC60423NnX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse LJIJ(android.webkit.WebView r25, android.webkit.WebResourceRequest r26) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60702Ns2.LJIJ(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // X.AbstractC60423NnX
    public final WebResourceResponse LJIJI(WebView webView, String str) {
        return super.LJIJI(webView, str);
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIJJLI(WebView webView, WebResourceRequest webResourceRequest) {
        WebView webView2;
        InterfaceC60703Ns3 navigationServiceProtocol$hybrid_web_release;
        if (super.LJIJJLI(webView, webResourceRequest)) {
            return true;
        }
        if (!(webView instanceof WebKitView)) {
            webView2 = null;
        } else {
            webView2 = webView;
        }
        WebKitView webKitView = (WebKitView) webView2;
        if (webKitView != null && (navigationServiceProtocol$hybrid_web_release = webKitView.getNavigationServiceProtocol$hybrid_web_release()) != null && navigationServiceProtocol$hybrid_web_release.LIZ(webKitView.getHybridContext(), webKitView.getHybridRuntime$hybrid_web_release(), webView, webResourceRequest)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIL(WebView webView, String str) {
        WebView webView2;
        Boolean bool;
        WebView webView3;
        InterfaceC60614Nqc bridgeService$hybrid_web_release;
        C60607NqV initParams$hybrid_web_release;
        boolean z = webView instanceof WebKitView;
        if (!z) {
            webView2 = null;
        } else {
            webView2 = webView;
        }
        WebKitView webKitView = (WebKitView) webView2;
        if (webKitView != null && (initParams$hybrid_web_release = webKitView.getInitParams$hybrid_web_release()) != null) {
            bool = initParams$hybrid_web_release.LJIILIIL;
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            if (str != null) {
                C39836FkG.LJII.getClass();
                C39858Fkc c39858Fkc = C38262Ezy.LIZ().LIZLLL;
                if (c39858Fkc != null) {
                    str = c39858Fkc.applyAppendCommonParamsUrl(str);
                }
            }
            str = null;
        }
        if (!z) {
            webView3 = null;
        } else {
            webView3 = webView;
        }
        WebKitView webKitView2 = (WebKitView) webView3;
        if (webKitView2 != null) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            C39048FUe.LIZIZ(c39048FUe, i0.LJFF("shouldOverrideUrlLoading, url:", str), null, null, 6);
            if (str != null && (bridgeService$hybrid_web_release = webKitView2.getBridgeService$hybrid_web_release()) != null && bridgeService$hybrid_web_release.LIZIZ(str)) {
                C39048FUe.LIZIZ(c39048FUe, "shouldOverrideUrlLoading, intercept by js bridge", null, null, 6);
                return true;
            }
        }
        C39836FkG.LJII.getClass();
        C39858Fkc c39858Fkc2 = C38262Ezy.LIZ().LIZLLL;
        if (c39858Fkc2 != null && c39858Fkc2.applyCommonShouldOverrideUrl(webView, str)) {
            return true;
        }
        return super.LJIL(webView, str);
    }

    @Override // X.AbstractC60423NnX
    public final void LJFF(WebView webView, String str, Bitmap bitmap) {
        WebView webView2;
        InterfaceC60614Nqc bridgeService$hybrid_web_release;
        if (!(webView instanceof WebKitView)) {
            webView2 = null;
        } else {
            webView2 = webView;
        }
        WebKitView webKitView = (WebKitView) webView2;
        if (webKitView != null) {
            if (str != null && (bridgeService$hybrid_web_release = webKitView.getBridgeService$hybrid_web_release()) != null) {
                bridgeService$hybrid_web_release.LIZLLL(str);
            }
            InterfaceC60703Ns3 navigationServiceProtocol$hybrid_web_release = webKitView.getNavigationServiceProtocol$hybrid_web_release();
            if (navigationServiceProtocol$hybrid_web_release != null) {
                navigationServiceProtocol$hybrid_web_release.LIZJ(webKitView.getHybridContext(), webKitView.getHybridRuntime$hybrid_web_release(), webView, str);
            }
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, i0.LJFF("onPageStarted, url:", str), null, null, 6);
            FD5.LJIIJ(webKitView.getHybridContext().containerId, Long.valueOf(System.currentTimeMillis()), "on_page_started");
        }
        super.LJFF(webView, str, bitmap);
        VMI.LJ.LIZIZ(webView, str);
    }

    @Override // X.AbstractC60423NnX
    public final void LJIIIIZZ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebView webView2;
        Integer num;
        CharSequence charSequence;
        android.net.Uri uri;
        Boolean bool;
        Integer num2;
        CharSequence charSequence2;
        Integer num3;
        CharSequence charSequence3;
        Integer num4;
        CharSequence charSequence4;
        if (!(webView instanceof WebKitView)) {
            webView2 = null;
        } else {
            webView2 = webView;
        }
        WebKitView webKitView = (WebKitView) webView2;
        if (webKitView != null) {
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                AbstractC60673NrZ webKitLifeCycle$hybrid_web_release = webKitView.getWebKitLifeCycle$hybrid_web_release();
                String str = "";
                if (webKitLifeCycle$hybrid_web_release != null) {
                    String webUrl$hybrid_web_release = webKitView.getWebUrl$hybrid_web_release();
                    if (webUrl$hybrid_web_release == null) {
                        webUrl$hybrid_web_release = "";
                    }
                    C60704Ns4 c60704Ns4 = new C60704Ns4();
                    c60704Ns4.LIZ = 207;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("errorCode:");
                    if (webResourceError != null) {
                        num3 = Integer.valueOf(webResourceError.getErrorCode());
                    } else {
                        num3 = null;
                    }
                    LIZ.append(num3);
                    LIZ.append(", ");
                    LIZ.append("description:");
                    if (webResourceError != null) {
                        charSequence3 = webResourceError.getDescription();
                    } else {
                        charSequence3 = null;
                    }
                    LIZ.append(charSequence3);
                    LIZ.append(' ');
                    c60704Ns4.LIZIZ = X1D.LIZIZ(LIZ);
                    if (webResourceError != null) {
                        num4 = Integer.valueOf(webResourceError.getErrorCode());
                    } else {
                        num4 = null;
                    }
                    c60704Ns4.LIZJ = num4;
                    if (webResourceError != null) {
                        charSequence4 = webResourceError.getDescription();
                    } else {
                        charSequence4 = null;
                    }
                    c60704Ns4.LIZLLL = String.valueOf(charSequence4);
                    webKitLifeCycle$hybrid_web_release.LJJJJIZL(webKitView, webUrl$hybrid_web_release, c60704Ns4);
                }
                String str2 = webKitView.getHybridContext().containerId;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("errorCode:");
                if (webResourceError != null) {
                    num2 = Integer.valueOf(webResourceError.getErrorCode());
                } else {
                    num2 = null;
                }
                LIZ2.append(num2);
                LIZ2.append(", ");
                LIZ2.append("description:");
                if (webResourceError != null) {
                    charSequence2 = webResourceError.getDescription();
                } else {
                    charSequence2 = null;
                }
                LIZ2.append(charSequence2);
                LIZ2.append(' ');
                String LIZIZ = X1D.LIZIZ(LIZ2);
                String str3 = webKitView.getHybridContext().vaid;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = webKitView.getHybridContext().bid;
                if (str4 != null) {
                    str = str4;
                }
                FD5.LJIIIIZZ(webKitView, str2, new C61659OHv(205, LIZIZ, str3, str));
            }
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onReceivedError, errorCode:");
            if (webResourceError != null) {
                num = Integer.valueOf(webResourceError.getErrorCode());
            } else {
                num = null;
            }
            LIZ3.append(num);
            LIZ3.append(", ");
            LIZ3.append("description:");
            if (webResourceError != null) {
                charSequence = webResourceError.getDescription();
            } else {
                charSequence = null;
            }
            LIZ3.append(charSequence);
            LIZ3.append(", ");
            LIZ3.append("failingUrl:");
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = null;
            }
            LIZ3.append(uri);
            LIZ3.append(", ");
            LIZ3.append("isForMainFrame:");
            if (webResourceRequest != null) {
                bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
            } else {
                bool = null;
            }
            LIZ3.append(bool);
            C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ3), null, null, 6);
        }
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            this.LJLIL = true;
        }
        super.LJIIIIZZ(webView, webResourceRequest, webResourceError);
        VMI.LJ.LJII(webView, webResourceRequest, webResourceError);
    }

    @Override // X.AbstractC60423NnX
    public final void LJIIJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebView webView2;
        Integer num;
        String str;
        android.net.Uri uri;
        Boolean bool;
        String str2;
        if (!(webView instanceof WebKitView)) {
            webView2 = null;
        } else {
            webView2 = webView;
        }
        WebKitView webKitView = (WebKitView) webView2;
        if (webKitView != null) {
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.LJLIL = true;
                String str3 = webKitView.getHybridContext().containerId;
                String str4 = "";
                if (webResourceResponse == null || (str2 = webResourceResponse.getReasonPhrase()) == null) {
                    str2 = "";
                }
                String str5 = webKitView.getHybridContext().vaid;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = webKitView.getHybridContext().bid;
                if (str6 != null) {
                    str4 = str6;
                }
                FD5.LJIIIIZZ(webKitView, str3, new C61659OHv(206, str2, str5, str4));
            }
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onReceivedError, errorCode:");
            if (webResourceResponse != null) {
                num = Integer.valueOf(webResourceResponse.getStatusCode());
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(", ");
            LIZ.append("reason:");
            if (webResourceResponse != null) {
                str = webResourceResponse.getReasonPhrase();
            } else {
                str = null;
            }
            C1DI.LIZIZ(LIZ, str, ", ", "failingUrl:");
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = null;
            }
            LIZ.append(uri);
            LIZ.append(", ");
            LIZ.append("isForMainFrame:");
            if (webResourceRequest != null) {
                bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
            } else {
                bool = null;
            }
            LIZ.append(bool);
            C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, null, 6);
        }
        super.LJIIJ(webView, webResourceRequest, webResourceResponse);
        VMI.LJ.LJIIIZ(webView, webResourceRequest, webResourceResponse);
    }

    @Override // X.AbstractC60423NnX
    public final void LJIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebView webView2;
        String str;
        String str2;
        this.LJLIL = true;
        if (!(webView instanceof WebKitView)) {
            webView2 = null;
        } else {
            webView2 = webView;
        }
        WebKitView webKitView = (WebKitView) webView2;
        if (webKitView != null) {
            String str3 = webKitView.getHybridContext().containerId;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onReceivedSslError, error:");
            if (sslError != null) {
                str = sslError.toString();
            } else {
                str = null;
            }
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            String str4 = webKitView.getHybridContext().vaid;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            String str6 = webKitView.getHybridContext().bid;
            if (str6 != null) {
                str5 = str6;
            }
            FD5.LJIIIIZZ(webKitView, str3, new C61659OHv(205, LIZIZ, str4, str5));
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onReceivedSslError, error:");
            if (sslError != null) {
                str2 = sslError.toString();
            } else {
                str2 = null;
            }
            LIZ2.append(str2);
            C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ2), null, null, 6);
        }
        super.LJIIL(webView, sslErrorHandler, sslError);
    }

    @Override // X.AbstractC60423NnX
    public final void LJII(WebView webView, int i, String str, String str2) {
        WebView webView2;
        this.LJLIL = true;
        if (!(webView instanceof WebKitView)) {
            webView2 = null;
        } else {
            webView2 = webView;
        }
        WebKitView webKitView = (WebKitView) webView2;
        if (webKitView != null) {
            StringBuilder LIZ = C06830Op.LIZ("onReceivedError, errorCode:", i, ", description:", str, ", failingUrl:");
            LIZ.append(str2);
            String LIZIZ = X1D.LIZIZ(LIZ);
            AbstractC60673NrZ webKitLifeCycle$hybrid_web_release = webKitView.getWebKitLifeCycle$hybrid_web_release();
            String str3 = "";
            if (webKitLifeCycle$hybrid_web_release != null) {
                String webUrl$hybrid_web_release = webKitView.getWebUrl$hybrid_web_release();
                if (webUrl$hybrid_web_release == null) {
                    webUrl$hybrid_web_release = "";
                }
                C60704Ns4 c60704Ns4 = new C60704Ns4();
                c60704Ns4.LIZ = 205;
                c60704Ns4.LIZIZ = LIZIZ;
                c60704Ns4.LIZJ = Integer.valueOf(i);
                c60704Ns4.LIZLLL = str;
                webKitLifeCycle$hybrid_web_release.LJJJJIZL(webKitView, webUrl$hybrid_web_release, c60704Ns4);
            }
            InterfaceC60703Ns3 navigationServiceProtocol$hybrid_web_release = webKitView.getNavigationServiceProtocol$hybrid_web_release();
            if (navigationServiceProtocol$hybrid_web_release != null) {
                navigationServiceProtocol$hybrid_web_release.LIZIZ(webKitView.getHybridContext(), webKitView.getHybridRuntime$hybrid_web_release(), webView);
            }
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, LIZIZ, EnumC39866Fkk.E, null, 4);
            String str4 = webKitView.getHybridContext().containerId;
            String str5 = webKitView.getHybridContext().vaid;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = webKitView.getHybridContext().bid;
            if (str6 != null) {
                str3 = str6;
            }
            FD5.LJIIIIZZ(webKitView, str4, new C61659OHv(205, LIZIZ, str5, str3));
        }
        super.LJII(webView, i, str, str2);
        VMI.LJ.LJIIJ(webView, i, str, str2);
    }

    @Override // X.AbstractC60423NnX
    public final void LJIIIZ(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.LJIIIZ(webView, httpAuthHandler, str, str2);
        if (!(webView instanceof WebKitView) || webView == null) {
            return;
        }
        C39048FUe.LIZIZ(C39048FUe.LIZIZ, C0ON.LIZJ("onReceivedHttpAuthRequest, host:", str, ", realm:", str2), null, null, 6);
    }
}
