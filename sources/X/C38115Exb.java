package X;

import Y.ARunnableS15S0101000_11;
import Y.ARunnableS7S1100000_6;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* renamed from: X.Exb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38115Exb extends AbstractC38114Exa {
    public String LJIIJJI;
    public WebView LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC38114Exa
    public final String LJI() {
        WebView webView = this.LJIIL;
        if (webView instanceof InterfaceC38148Ey8) {
            String safeUrl = ((InterfaceC38148Ey8) webView).getSafeUrl();
            if (TextUtils.isEmpty(safeUrl)) {
                return this.LJIIL.getUrl();
            }
            return safeUrl;
        }
        boolean z = this.LJIILIIL;
        boolean z2 = this.LJIILJJIL;
        if (z && z2 && webView != 0 && !(webView instanceof InterfaceC38148Ey8)) {
            webView.post(new ARunnableS15S0101000_11(4, webView, 9));
        }
        return this.LJIIL.getUrl();
    }

    @Override // X.AbstractC38114Exa
    public final void LJIILIIL() {
        super.LJIILIIL();
        this.LJIIL.removeJavascriptInterface(this.LJIIJJI);
    }

    @Override // X.AbstractC38114Exa
    public final Context LJ(C38116Exc c38116Exc) {
        Context context = c38116Exc.LJFF;
        if (context != null) {
            return context;
        }
        WebView webView = c38116Exc.LIZ;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // X.AbstractC38114Exa
    public final void LJIIIIZZ(C38116Exc c38116Exc) {
        this.LJIILIIL = c38116Exc.LJI;
        this.LJIILJJIL = c38116Exc.LJIIZILJ;
        WebView webView = c38116Exc.LIZ;
        this.LJIIL = webView;
        String str = c38116Exc.LIZLLL;
        this.LJIIJJI = str;
        if (!c38116Exc.LJIILJJIL) {
            webView.addJavascriptInterface(this, str);
        }
    }

    @Override // X.AbstractC38114Exa
    public final void LJIIIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("javascript:");
        YE1.LIZLLL(LIZ, this.LJIIJJI, "._handleMessageFromToutiao(", str, ")");
        LJIILLIIL(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC38114Exa
    public final void LJIILJJIL(C38117Exd c38117Exd) {
        C37969EvF c37969EvF = new C37969EvF("bridge", "call", c38117Exd.LIZLLL, 2, "JSBridge2", this.LJIIL);
        c37969EvF.LJIILJJIL = Integer.valueOf(c38117Exd.LIZ);
        if (c38117Exd.LJIILIIL != null) {
            c37969EvF.LJIILL = 1;
        }
        c37969EvF.LIZIZ();
    }

    public final void LJIILLIIL(String str) {
        if (this.LJFF || TextUtils.isEmpty(str)) {
            return;
        }
        ARunnableS7S1100000_6 aRunnableS7S1100000_6 = new ARunnableS7S1100000_6(this, str, 8);
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            C1JX.LJIIIIZZ("Received call on sub-thread, posting to main thread: ", str);
            this.LIZLLL.execute(aRunnableS7S1100000_6);
        } else {
            aRunnableS7S1100000_6.run();
        }
    }

    @Override // X.AbstractC38114Exa
    @JavascriptInterface
    public void invokeMethod(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "1870604370350061326");
        if (c03880Dg.LIZJ(300001, "com/bytedance/ies/web/jsbridge2/WebViewBridge", "invokeMethod", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/ies/web/jsbridge2/WebViewBridge", "invokeMethod", null, objArr, this, c65300Pk0, false);
        } else {
            super.invokeMethod(str);
            c03880Dg.LIZIZ(300001, "com/bytedance/ies/web/jsbridge2/WebViewBridge", "invokeMethod", null, objArr, this, c65300Pk0, true);
        }
    }

    @Override // X.AbstractC38114Exa
    public final void LJIIJ(String str, C38117Exd c38117Exd) {
        if (c38117Exd != null && !TextUtils.isEmpty(c38117Exd.LJII)) {
            String str2 = c38117Exd.LJII;
            LJIILLIIL(C16880lQ.LLLZ("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", new Object[]{Base64.encodeToString(C16880lQ.LLLZ("iframe[src=\"%s\"", new Object[]{str2}).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)}));
            return;
        }
        LJIIIZ(str);
    }
}
