package X;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.ies.bullet.service.base.web.WebChromeClientDispatcher;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NlN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60289NlN implements InterfaceC60255Nkp {
    public WebView LIZ;
    public final C59582NZy LIZIZ;
    public final WebChromeClientDispatcher LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C60337Nm9 LJ;

    @Override // X.InterfaceC60255Nkp
    public final C60339NmB LIZLLL() {
        return (C60339NmB) this.LIZLLL.getValue();
    }

    public final WebView LJ() {
        WebView webView = this.LIZ;
        if (webView != null) {
            return webView;
        }
        "You must call 'createWebView' or 'setWebView' first.".toString();
        throw new IllegalStateException("You must call 'createWebView' or 'setWebView' first.");
    }

    @Override // X.InterfaceC60255Nkp
    public final void destroy() {
        this.LIZIZ.LIZ.clear();
        this.LIZJ.LIZ.clear();
    }

    @Override // X.InterfaceC60255Nkp
    public final WebChromeClientDispatcher LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC60255Nkp
    public final C59582NZy LIZJ() {
        return this.LIZIZ;
    }

    public C60289NlN(C60337Nm9 webKitService, C77125UOr c77125UOr) {
        o.LJIIJ(webKitService, "webKitService");
        this.LJ = webKitService;
        this.LIZIZ = new C59582NZy();
        this.LIZJ = new WebChromeClientDispatcher();
        this.LIZLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 498));
    }

    @Override // X.InterfaceC60255Nkp
    public final C60289NlN LIZ(Context context, String str) {
        WebView webView;
        WebView webView2;
        InterfaceC60336Nm8 interfaceC60336Nm8 = (InterfaceC60336Nm8) C60373Nmj.LIZIZ().LIZ(InterfaceC60336Nm8.class);
        if (interfaceC60336Nm8 != null) {
            webView = interfaceC60336Nm8.LJIILIIL(context, str);
        } else {
            webView = null;
        }
        this.LIZ = webView;
        if (webView == null) {
            try {
                webView2 = ((C60425NnZ) C60632Nqu.LIZ(C60425NnZ.class, "webx_webkit")).LJII(context);
            } catch (Throwable unused) {
                webView2 = new WebView(context);
            }
            this.LIZ = webView2;
        }
        WebView webView3 = this.LIZ;
        if (webView3 != null) {
            C16880lQ.LLZLI(webView3, this.LIZIZ);
            webView3.setWebChromeClient(this.LIZJ);
        }
        return this;
    }
}
