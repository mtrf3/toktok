package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.crossplatform.business.LoadEventBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.CWebViewInterceptor;
import com.ss.android.ugc.aweme.web.GeckoXClientManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NZx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59581NZx extends C59588Na4 {
    public InterfaceC88471Ynr<? super WebView, ? super String, Boolean> LJLJI;
    public InterfaceC59568NZk LJLJJI;
    public NJD LJLJJLL;
    public C40705FyH LJLJL;
    public C59866NeY LJLJLJ;
    public InterfaceC59561NZd LJLJLLL;
    public final List<NZX> LJLILLLLZI = new ArrayList();
    public final C59583NZz LJLJJL = new C59583NZz(this);

    public final PassBackWebInfoBusiness LIZIZ() {
        NTL crossPlatformBusiness;
        InterfaceC59561NZd interfaceC59561NZd = this.LJLJLLL;
        if (interfaceC59561NZd != null && (crossPlatformBusiness = interfaceC59561NZd.getCrossPlatformBusiness()) != null) {
            return (PassBackWebInfoBusiness) ((C59484NWe) crossPlatformBusiness).LIZ(PassBackWebInfoBusiness.class);
        }
        return null;
    }

    public C59581NZx() {
        GeckoXClientManager.LJ();
        this.LJLJJLL = new NJD();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        this.LJLJJL.onPageCommitVisible(webView, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        PlayableBusiness playableBusiness;
        NTL crossPlatformBusiness;
        NTL crossPlatformBusiness2;
        InterfaceC59585Na1 interfaceC59585Na1;
        if (str != null) {
            C59565NZh.LIZ().LIZJ(2, str, webView);
            C59866NeY c59866NeY = this.LJLJLJ;
            if (c59866NeY != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
                interfaceC59585Na1.LJIILLIIL(C58738N3m.LIZ(str));
            }
        }
        this.LJLJJL.LIZ(webView, str);
        InterfaceC59561NZd interfaceC59561NZd = this.LJLJLLL;
        NZR nzr = null;
        if (interfaceC59561NZd != null && (crossPlatformBusiness2 = interfaceC59561NZd.getCrossPlatformBusiness()) != null) {
            playableBusiness = (PlayableBusiness) ((C59484NWe) crossPlatformBusiness2).LIZ(PlayableBusiness.class);
        } else {
            playableBusiness = null;
        }
        if (playableBusiness != null) {
            playableBusiness.LIZLLL = this.LJLIL;
            playableBusiness.LIZ(false, true);
        }
        InterfaceC59561NZd interfaceC59561NZd2 = this.LJLJLLL;
        if (interfaceC59561NZd2 != null) {
            interfaceC59561NZd2.getCrossPlatformParams();
        }
        PassBackWebInfoBusiness LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            if (webView instanceof NZR) {
                nzr = (NZR) webView;
            }
            LIZIZ.LJI(nzr, true);
        }
        InterfaceC59561NZd interfaceC59561NZd3 = this.LJLJLLL;
        if (interfaceC59561NZd3 != null && (crossPlatformBusiness = interfaceC59561NZd3.getCrossPlatformBusiness()) != null) {
            ((C59484NWe) crossPlatformBusiness).LIZ(LoadEventBusiness.class);
        }
    }

    @Override // X.C59588Na4, X.C59589Na5, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C59591Na7.LIZ().LJIJJ(webView, renderProcessGoneDetail);
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        PassBackWebInfoBusiness LIZIZ;
        InterfaceC59585Na1 interfaceC59585Na1;
        WebResourceResponse LIZIZ2;
        C59314NPq crossPlatformParams;
        C59273NOb c59273NOb;
        WebResourceResponse LIZJ;
        InterfaceC59561NZd interfaceC59561NZd = this.LJLJLLL;
        if (interfaceC59561NZd != null && (crossPlatformParams = interfaceC59561NZd.getCrossPlatformParams()) != null && (c59273NOb = crossPlatformParams.LIZIZ) != null && c59273NOb.LIZ != 0 && webResourceRequest != null && (LIZJ = CWebViewInterceptor.LIZJ(webResourceRequest, c59273NOb)) != null) {
            return LIZJ;
        }
        if (webView instanceof C59613NaT) {
            C59613NaT c59613NaT = (C59613NaT) webView;
            if (c59613NaT.getUseSandbox() && (LIZIZ2 = C38136Exw.LIZIZ(c59613NaT.getJsBridge2$crossplatform_release(), webResourceRequest)) != null) {
                return LIZIZ2;
            }
        }
        if (webResourceRequest != null) {
            if (webResourceRequest.getUrl() != null && webResourceRequest.getRequestHeaders() != null && (LIZIZ = LIZIZ()) != null) {
                String uri = webResourceRequest.getUrl().toString();
                o.LJIIIIZZ(uri, "request.url.toString()");
                java.util.Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                o.LJIIIIZZ(requestHeaders, "request.requestHeaders");
                LIZIZ.LIZJ(uri, requestHeaders);
            }
            android.net.Uri url = webResourceRequest.getUrl();
            if (url != null) {
                url.toString();
            }
        }
        NJD njd = this.LJLJJLL;
        if (njd != null) {
            WebResourceResponse LIZIZ3 = njd.LIZIZ(webView, webResourceRequest);
            if (LIZIZ3 != null) {
                C59866NeY c59866NeY = this.LJLJLJ;
                if (c59866NeY != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
                    interfaceC59585Na1.LJJIIJZLJL();
                }
                return LIZIZ3;
            }
            if (this.LJLJJLL != null) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            o.LJIJI("webviewInterceptor");
            throw null;
        }
        o.LJIJI("webviewInterceptor");
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        android.net.Uri url;
        String str;
        Boolean bool;
        Boolean bool2;
        String str2 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("shouldOverrideUrlLoading url ");
            if (webView != null) {
                str = webView.getUrl();
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(" isRedirect ");
            if (webResourceRequest != null) {
                bool = Boolean.valueOf(webResourceRequest.isRedirect());
            } else {
                bool = null;
            }
            LIZ.append(bool);
            LIZ.append(" isMainFrame ");
            if (webResourceRequest != null) {
                bool2 = Boolean.valueOf(webResourceRequest.isForMainFrame());
            } else {
                bool2 = null;
            }
            LIZ.append(bool2);
            X1D.LIZIZ(LIZ);
        }
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            str2 = url.toString();
        }
        return LIZJ(webResourceRequest, webView, str2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        InterfaceC59585Na1 interfaceC59585Na1;
        InterfaceC59585Na1 interfaceC59585Na12;
        InterfaceC59585Na1 interfaceC59585Na13;
        InterfaceC59585Na1 interfaceC59585Na14;
        C59866NeY c59866NeY = this.LJLJLJ;
        if (c59866NeY != null && (interfaceC59585Na14 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            interfaceC59585Na14.LJJII();
        }
        C40705FyH c40705FyH = this.LJLJL;
        if (c40705FyH != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(str);
            WebResourceResponse LIZ2 = c40705FyH.LIZ(X1D.LIZIZ(LIZ));
            if (LIZ2 != null) {
                C59866NeY c59866NeY2 = this.LJLJLJ;
                if (c59866NeY2 != null && (interfaceC59585Na13 = (InterfaceC59585Na1) c59866NeY2.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
                    interfaceC59585Na13.LJIIIZ();
                }
                return LIZ2;
            }
        }
        E34.LIZ(str);
        C59866NeY c59866NeY3 = this.LJLJLJ;
        if (c59866NeY3 != null && (interfaceC59585Na12 = (InterfaceC59585Na1) c59866NeY3.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            interfaceC59585Na12.LJJIFFI();
        }
        C59866NeY c59866NeY4 = this.LJLJLJ;
        if (c59866NeY4 != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY4.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            interfaceC59585Na1.LJIJ(str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // X.C59588Na4, X.C59589Na5, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        return LIZJ(null, view, url);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0136, code lost:
    
        if (r1.invoke(r28, r29).booleanValue() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02c6, code lost:
    
        if (r6 != null) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.webkit.WebResourceRequest r27, android.webkit.WebView r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59581NZx.LIZJ(android.webkit.WebResourceRequest, android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C59866NeY c59866NeY;
        InterfaceC59585Na1 interfaceC59585Na1;
        if (str != null && (c59866NeY = this.LJLJLJ) != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            interfaceC59585Na1.LJIILL(C58738N3m.LIZ(str));
        }
        PassBackWebInfoBusiness LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LJII(str);
        }
        this.LJLJJL.LJIIL(webView, str, bitmap);
        PreRenderWebViewBusiness LIZ = NV9.LIZ(this.LJLJLLL);
        if (LIZ != null) {
            C38049EwX jsBridge = this.LJLIL;
            o.LJIIIIZZ(jsBridge, "jsBridge");
            LIZ.LIZLLL = jsBridge;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        InterfaceC59585Na1 interfaceC59585Na1;
        C59866NeY c59866NeY = this.LJLJLJ;
        if (c59866NeY != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            interfaceC59585Na1.LJIL(webResourceRequest, webResourceError);
        }
        this.LJLJJL.LJ(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        InterfaceC59585Na1 interfaceC59585Na1;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C59866NeY c59866NeY = this.LJLJLJ;
        if (c59866NeY != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            interfaceC59585Na1.LJIIJJI(webResourceRequest, webResourceResponse);
        }
        this.LJLJJL.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        InterfaceC59585Na1 interfaceC59585Na1;
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C59866NeY c59866NeY = this.LJLJLJ;
        if (c59866NeY != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            interfaceC59585Na1.LJII(sslError);
        }
        this.LJLJJL.LJIILIIL(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C59866NeY c59866NeY;
        InterfaceC59585Na1 interfaceC59585Na1;
        if (Build.VERSION.SDK_INT < 23 && (c59866NeY = this.LJLJLJ) != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            interfaceC59585Na1.LJJIIZI(i, str2);
        }
        this.LJLJJL.LJFF(webView, i, str, str2);
    }
}
