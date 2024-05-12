package X;

import Y.ARunnableS5S1200000_6;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Eu8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37900Eu8 implements InterfaceC37958Ev4 {
    public final WebView LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public final ArrayList<InterfaceC37901Eu9> LIZLLL;

    @Override // X.InterfaceC37958Ev4
    public final String getUrl() {
        ViewParent viewParent = this.LIZ;
        if (viewParent instanceof InterfaceC37902EuA) {
            if (viewParent != null) {
                String currentUrl = ((InterfaceC37902EuA) viewParent).getCurrentUrl();
                if (!TextUtils.isEmpty(currentUrl)) {
                    return currentUrl;
                }
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.sdk.xbridge.protocol.interfaces.IXSafeWebView");
            }
        }
        if (TextUtils.isEmpty(this.LIZIZ)) {
            C37887Etv.LIZIZ(this.LIZJ, "cannot get current url, can u register IIWebViewStatusListener?");
            WebView webView = this.LIZ;
            if (webView != null) {
                return webView.getUrl();
            }
            return null;
        }
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37901Eu9
    public final void onDestroy() {
        Iterator<InterfaceC37901Eu9> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
        this.LIZLLL.clear();
        WebView webView = this.LIZ;
        if (webView != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("destroyWebviewToken with webview = ");
            LIZ.append(webView);
            C37887Etv.LIZ("WebViewTokenManager", X1D.LIZIZ(LIZ));
            ConcurrentHashMap<WebView, ConcurrentHashMap<String, C37888Etw>> concurrentHashMap = C37886Etu.LIZ;
            ConcurrentHashMap<String, C37888Etw> concurrentHashMap2 = concurrentHashMap.get(webView);
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.clear();
            }
            concurrentHashMap.remove(webView);
            C37886Etu.LIZIZ.remove(webView);
        }
    }

    @Override // X.InterfaceC37958Ev4
    public final WebView LIZ() {
        return this.LIZ;
    }

    public C37900Eu8(WebView view) {
        o.LJIIJ(view, "view");
        this.LIZIZ = "";
        this.LIZJ = "WebViewImpl";
        this.LIZLLL = new ArrayList<>();
        this.LIZ = view;
    }

    @Override // X.InterfaceC37901Eu9
    public final boolean LIZIZ(String str) {
        Iterator<InterfaceC37901Eu9> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            if (it.next().LIZIZ(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC37901Eu9
    public final void LIZJ(String url) {
        o.LJIIJ(url, "url");
        Iterator<InterfaceC37901Eu9> it = this.LIZLLL.iterator();
        if (it.hasNext()) {
            it.next().LIZJ(url);
        }
    }

    @Override // X.InterfaceC37901Eu9
    public final void LIZLLL(String url) {
        o.LJIIJ(url, "url");
        Iterator<InterfaceC37901Eu9> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(url);
        }
        this.LIZIZ = url;
    }

    @Override // X.InterfaceC37958Ev4
    public final void LJFF(InterfaceC37901Eu9 listener) {
        o.LJIIJ(listener, "listener");
        this.LIZLLL.add(listener);
    }

    @Override // X.InterfaceC37958Ev4
    public final void LJ(AbstractC37899Eu7 object, String name) {
        o.LJIIJ(object, "object");
        o.LJIIJ(name, "name");
        WebView webView = this.LIZ;
        if (webView != null) {
            webView.addJavascriptInterface(object, name);
        }
    }

    @Override // X.InterfaceC37958Ev4
    public final void LJII(ValueCallback valueCallback, String url) {
        o.LJIIJ(url, "url");
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            WebView webView = this.LIZ;
            if (webView != null) {
                webView.evaluateJavascript(url, valueCallback);
                return;
            }
            return;
        }
        WebView webView2 = this.LIZ;
        if (webView2 == null) {
            return;
        }
        webView2.post(new ARunnableS5S1200000_6(valueCallback, url, this, 5));
    }
}
