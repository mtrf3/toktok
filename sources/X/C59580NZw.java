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
import com.ss.android.ugc.aweme.ad.prefetch.IAdWebViewPrefetchManager;
import com.ss.android.ugc.aweme.commercialize.prefetch.AdWebViewPrefetchManager;
import com.ss.android.ugc.aweme.crossplatform.business.LoadEventBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.web.GeckoXClientManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NZw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59580NZw extends C59588Na4 {
    public InterfaceC88471Ynr<? super WebView, ? super String, Boolean> LJLJI;
    public InterfaceC59568NZk LJLJJI;
    public NJC LJLJJLL;
    public C40705FyH LJLJL;
    public C59866NeY LJLJLJ;
    public InterfaceC59561NZd LJLJLLL;
    public final List<NZX> LJLILLLLZI = new ArrayList();
    public final C59584Na0 LJLJJL = new C59584Na0(this);

    public final PassBackWebInfoBusiness LIZIZ() {
        NTL crossPlatformBusiness;
        InterfaceC59561NZd interfaceC59561NZd = this.LJLJLLL;
        if (interfaceC59561NZd != null && (crossPlatformBusiness = interfaceC59561NZd.getCrossPlatformBusiness()) != null) {
            return (PassBackWebInfoBusiness) ((C59484NWe) crossPlatformBusiness).LIZ(PassBackWebInfoBusiness.class);
        }
        return null;
    }

    public C59580NZw() {
        GeckoXClientManager.LJ();
        this.LJLJJLL = new NJC();
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r8 != null) goto L26;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r7, android.webkit.WebResourceRequest r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59580NZw.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        android.net.Uri url;
        android.net.Uri uri;
        Boolean bool;
        Boolean bool2;
        String str = null;
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?) url ");
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = null;
            }
            LIZ.append(uri);
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
            str = url.toString();
        }
        return LIZJ(webResourceRequest, webView, str);
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
        if (!NJA.LIZ().enableRemoveUselessInterceptor) {
            E34.LIZ(str);
        }
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x012e, code lost:
    
        if (r0.invoke(r21, r22).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.webkit.WebResourceRequest r20, android.webkit.WebView r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59580NZw.LIZJ(android.webkit.WebResourceRequest, android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IAdWebViewPrefetchManager LIZIZ;
        C59866NeY c59866NeY;
        InterfaceC59585Na1 interfaceC59585Na1;
        if (str != null && (c59866NeY = this.LJLJLJ) != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            interfaceC59585Na1.LJIILL(C58738N3m.LIZ(str));
        }
        PassBackWebInfoBusiness LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.LJII(str);
        }
        this.LJLJJL.LJIIL(webView, str, bitmap);
        PreRenderWebViewBusiness LIZ = NV9.LIZ(this.LJLJLLL);
        if (LIZ != null) {
            C38049EwX jsBridge = this.LJLIL;
            o.LJIIIIZZ(jsBridge, "jsBridge");
            LIZ.LIZLLL = jsBridge;
        }
        if (!NJA.LIZ().enablePrefetchResource || str == null || ujb.o.LJJJJJL(str) || ujb.o.LJJJLIIL(str, "file://", false) || ujb.o.LJJJLIIL(str, "about:black", false) || webView == null || (LIZIZ = AdWebViewPrefetchManager.LIZIZ()) == null) {
            return;
        }
        LIZIZ.stopLoading();
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
