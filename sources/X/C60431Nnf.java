package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import kotlin.jvm.internal.o;

/* renamed from: X.Nnf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60431Nnf extends AbstractC60423NnX {
    public final /* synthetic */ C60429Nnd LJLIL;
    public final /* synthetic */ InterfaceC60433Nnh LJLILLLLZI;

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr<?> getExtension() {
        return this.LJLIL;
    }

    public C60431Nnf(C60429Nnd c60429Nnd, InterfaceC60433Nnh interfaceC60433Nnh) {
        this.LJLIL = c60429Nnd;
        this.LJLILLLLZI = interfaceC60433Nnh;
    }

    @Override // X.AbstractC60423NnX
    public final void LJ(WebView webView, String str) {
        super.LJ(webView, str);
        InterfaceC60433Nnh interfaceC60433Nnh = this.LJLILLLLZI;
        if (interfaceC60433Nnh != null) {
            interfaceC60433Nnh.LIZ(webView, str);
        }
    }

    @Override // X.AbstractC60423NnX
    public final WebResourceResponse LJIJ(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse shouldInterceptRequest;
        InterfaceC60433Nnh interfaceC60433Nnh = this.LJLILLLLZI;
        if (interfaceC60433Nnh == null || (shouldInterceptRequest = interfaceC60433Nnh.shouldInterceptRequest(webResourceRequest)) == null) {
            return super.LJIJ(webView, webResourceRequest);
        }
        return shouldInterceptRequest;
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIJJLI(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        WebKitView webKitView;
        android.net.Uri url;
        InterfaceC60433Nnh interfaceC60433Nnh = this.LJLILLLLZI;
        if (interfaceC60433Nnh != null) {
            Boolean bool = null;
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                str = url.toString();
            } else {
                str = null;
            }
            if ((webView instanceof WebKitView) && (webKitView = (WebKitView) webView) != null) {
                bool = Boolean.valueOf(webKitView.LJLLL());
            }
            if (interfaceC60433Nnh.LJII(webView, str, webResourceRequest, bool)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIL(WebView view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        InterfaceC60433Nnh interfaceC60433Nnh = this.LJLILLLLZI;
        if (interfaceC60433Nnh != null && interfaceC60433Nnh.LJII(view, url, null, Boolean.valueOf(((WebKitView) view).LJLLL()))) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC60423NnX
    public final void LJFF(WebView webView, String str, Bitmap bitmap) {
        super.LJFF(webView, str, bitmap);
        InterfaceC60433Nnh interfaceC60433Nnh = this.LJLILLLLZI;
        if (interfaceC60433Nnh != null) {
            interfaceC60433Nnh.LIZIZ(webView, str);
        }
    }

    @Override // X.AbstractC60423NnX
    public final void LJIIIIZZ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.LJIIIIZZ(webView, webResourceRequest, webResourceError);
        InterfaceC60433Nnh interfaceC60433Nnh = this.LJLILLLLZI;
        if (interfaceC60433Nnh != null) {
            interfaceC60433Nnh.LJ(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // X.AbstractC60423NnX
    public final void LJIIJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.LJIIJ(webView, webResourceRequest, webResourceResponse);
        InterfaceC60433Nnh interfaceC60433Nnh = this.LJLILLLLZI;
        if (interfaceC60433Nnh != null) {
            interfaceC60433Nnh.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // X.AbstractC60423NnX
    public final void LJIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.LJIIL(webView, sslErrorHandler, sslError);
        InterfaceC60433Nnh interfaceC60433Nnh = this.LJLILLLLZI;
        if (interfaceC60433Nnh != null) {
            interfaceC60433Nnh.LJI(webView);
        }
    }

    @Override // X.AbstractC60423NnX
    public final void LJII(WebView webView, int i, String str, String str2) {
        super.LJII(webView, i, str, str2);
        InterfaceC60433Nnh interfaceC60433Nnh = this.LJLILLLLZI;
        if (interfaceC60433Nnh != null) {
            interfaceC60433Nnh.LJFF(webView, i, str, str2);
        }
    }
}
