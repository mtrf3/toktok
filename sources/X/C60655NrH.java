package X;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import kotlin.jvm.internal.o;

/* renamed from: X.NrH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60655NrH extends AbstractC60423NnX {
    public final /* synthetic */ C60430Nne LJLIL;

    @Override // X.AbstractC60536NpM
    public final /* bridge */ /* synthetic */ AbstractC60629Nqr getExtension() {
        return this.LJLIL;
    }

    public C60655NrH(C60430Nne c60430Nne) {
        this.LJLIL = c60430Nne;
    }

    @Override // X.AbstractC60423NnX
    public final void LJ(WebView webView, String str) {
        InterfaceC60656NrI interfaceC60656NrI;
        if (str != null && (interfaceC60656NrI = this.LJLIL.LJLJLJ.LJLJL) != null) {
            interfaceC60656NrI.LIZIZ();
        }
        super.LJ(webView, str);
    }

    @Override // X.AbstractC60423NnX
    public final WebResourceResponse LJIJ(WebView webView, WebResourceRequest webResourceRequest) {
        InterfaceC60656NrI interfaceC60656NrI;
        InterfaceC60656NrI interfaceC60656NrI2;
        WebView webView2;
        InterfaceC61488OBg interfaceC61488OBg;
        InterfaceC37464En6 LIZLLL;
        if (webResourceRequest != null && (interfaceC60656NrI = this.LJLIL.LJLJLJ.LJLJL) != null && interfaceC60656NrI.LJI(webResourceRequest.getUrl()) && (interfaceC60656NrI2 = this.LJLIL.LJLJLJ.LJLJL) != null) {
            C37382Elm c37382Elm = new C37382Elm(webResourceRequest);
            C37647Eq3 c37647Eq3 = null;
            if (!(webView instanceof WebKitView)) {
                webView2 = null;
            } else {
                webView2 = webView;
            }
            WebKitView webKitView = (WebKitView) webView2;
            if (webKitView != null) {
                interfaceC61488OBg = webKitView.getResource$hybrid_web_release();
            } else {
                interfaceC61488OBg = null;
            }
            if (!(interfaceC61488OBg instanceof C39902FlK) && (LIZLLL = interfaceC60656NrI2.LIZLLL(c37382Elm)) != null) {
                this.LJLIL.LJLJLJ.getClass();
                return new WebResourceResponse(LIZLLL.getMimeType(), LIZLLL.LJI(), LIZLLL.getData());
            }
            WebResourceResponse LJIJ = super.LJIJ(webView, webResourceRequest);
            if (LJIJ != null) {
                C60658NrK c60658NrK = this.LJLIL.LJLJLJ;
                EnumC37644Eq0 from = EnumC37644Eq0.Auto;
                c60658NrK.getClass();
                o.LJIIJ(from, "from");
                c37647Eq3 = new C37647Eq3(LJIJ, from);
            }
            InterfaceC37464En6 LIZ = interfaceC60656NrI2.LIZ(c37382Elm, c37647Eq3);
            if (LIZ != null) {
                this.LJLIL.LJLJLJ.getClass();
                return new WebResourceResponse(LIZ.getMimeType(), LIZ.LJI(), LIZ.getData());
            }
            return LJIJ;
        }
        return super.LJIJ(webView, webResourceRequest);
    }

    @Override // X.AbstractC60423NnX
    public final WebResourceResponse LJIJI(WebView webView, String str) {
        return super.LJIJI(webView, str);
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIJJLI(WebView webView, WebResourceRequest webResourceRequest) {
        InterfaceC60656NrI interfaceC60656NrI;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame() && (interfaceC60656NrI = this.LJLIL.LJLJLJ.LJLJL) != null) {
            interfaceC60656NrI.LJFF(webResourceRequest.getUrl().toString());
        }
        return super.LJIJJLI(webView, webResourceRequest);
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIL(WebView webView, String str) {
        return super.LJIL(webView, str);
    }

    @Override // X.AbstractC60423NnX
    public final void LJFF(WebView webView, String str, Bitmap bitmap) {
        InterfaceC60656NrI interfaceC60656NrI;
        if (str != null && (interfaceC60656NrI = this.LJLIL.LJLJLJ.LJLJL) != null) {
            interfaceC60656NrI.LIZJ();
        }
        super.LJFF(webView, str, bitmap);
    }

    @Override // X.AbstractC60423NnX
    public final void LJIIIIZZ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23 && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            if (webResourceError == null) {
                InterfaceC60656NrI interfaceC60656NrI = this.LJLIL.LJLJLJ.LJLJL;
                if (interfaceC60656NrI != null) {
                    interfaceC60656NrI.LJII();
                }
            } else {
                InterfaceC60656NrI interfaceC60656NrI2 = this.LJLIL.LJLJLJ.LJLJL;
                if (interfaceC60656NrI2 != null) {
                    webResourceError.getErrorCode();
                    webResourceError.getDescription().toString();
                    interfaceC60656NrI2.LJII();
                }
            }
        }
        super.LJIIIIZZ(webView, webResourceRequest, webResourceError);
    }

    @Override // X.AbstractC60423NnX
    public final void LJIIJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            if (webResourceResponse == null) {
                InterfaceC60656NrI interfaceC60656NrI = this.LJLIL.LJLJLJ.LJLJL;
                if (interfaceC60656NrI != null) {
                    interfaceC60656NrI.LJII();
                }
            } else {
                InterfaceC60656NrI interfaceC60656NrI2 = this.LJLIL.LJLJLJ.LJLJL;
                if (interfaceC60656NrI2 != null) {
                    webResourceResponse.getStatusCode();
                    webResourceResponse.getReasonPhrase();
                    interfaceC60656NrI2.LJII();
                }
            }
        }
        super.LJIIJ(webView, webResourceRequest, webResourceResponse);
    }

    @Override // X.AbstractC60423NnX
    public final void LJII(WebView webView, int i, String str, String str2) {
        InterfaceC60656NrI interfaceC60656NrI;
        if (Build.VERSION.SDK_INT < 23) {
            WebView webView2 = (WebView) this.LJLIL.LJLJLJ.LIZ();
            o.LJFF(webView2, "this@PiaExtension.extendable");
            if (o.LJ(str2, webView2.getUrl()) && (interfaceC60656NrI = this.LJLIL.LJLJLJ.LJLJL) != null) {
                interfaceC60656NrI.LJII();
            }
        }
        super.LJII(webView, i, str, str2);
    }
}
