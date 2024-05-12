package com.bytedance.pia.core.bridge.channel;

import X.BQ6;
import X.C03880Dg;
import X.C37583Ep1;
import X.C37607EpP;
import X.C37613EpV;
import X.C65300Pk0;
import X.InterfaceC37591Ep9;
import X.RunnableC23230vf;
import Y.ARunnableS7S0301000_6;
import android.webkit.JavascriptInterface;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.bytedance.pia.core.bridge.channel.WebViewPort;
import com.google.gson.m;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class WebViewPort implements InterfaceC37591Ep9 {
    public final C37607EpP<m> LIZ = new C37607EpP<>();
    public final C37607EpP<String> LIZIZ;
    public WebMessagePort LIZJ;
    public final WeakReference<WebView> LIZLLL;

    @Override // X.InterfaceC37591Ep9
    public final void close() {
        C37607EpP<m> c37607EpP = this.LIZ;
        c37607EpP.LIZLLL = true;
        c37607EpP.LIZIZ();
        c37607EpP.LIZ.set(null);
        C37607EpP<String> c37607EpP2 = this.LIZIZ;
        c37607EpP2.LIZLLL = true;
        c37607EpP2.LIZIZ();
        c37607EpP2.LIZ.set(null);
        C37613EpV.LIZJ(new RunnableC23230vf(4, this));
    }

    /* loaded from: classes7.dex */
    public static class JSInterface {
        public static final WeakHashMap<WebView, JSInterface> LIZJ = new WeakHashMap<>();
        public final AtomicReference<C37607EpP<String>> LIZ = new AtomicReference<>(null);
        public C37607EpP<String> LIZIZ = null;

        @JavascriptInterface
        public void postMessage(String str) {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = {str};
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "7644410995262815487");
            if (c03880Dg.LIZJ(300001, "com/bytedance/pia/core/bridge/channel/WebViewPort$JSInterface", "postMessage", this, objArr, "void", c65300Pk0).LIZ) {
                c03880Dg.LIZIZ(300001, "com/bytedance/pia/core/bridge/channel/WebViewPort$JSInterface", "postMessage", null, objArr, this, c65300Pk0, false);
                return;
            }
            if ("__port_init__".equals(str) || "__port_init_next__".equals(str)) {
                AtomicReference<C37607EpP<String>> atomicReference = this.LIZ;
                C37607EpP<String> c37607EpP = new C37607EpP<>();
                while (true) {
                    if (atomicReference.compareAndSet(null, c37607EpP)) {
                        this.LIZIZ = this.LIZ.get();
                        break;
                    } else if (atomicReference.get() != null) {
                        this.LIZIZ = this.LIZ.getAndSet(null);
                        break;
                    }
                }
            }
            C37607EpP<String> c37607EpP2 = this.LIZIZ;
            if (c37607EpP2 != null) {
                c37607EpP2.LIZ(str);
            }
            c03880Dg.LIZIZ(300001, "com/bytedance/pia/core/bridge/channel/WebViewPort$JSInterface", "postMessage", null, objArr, this, c65300Pk0, true);
        }
    }

    @Override // X.InterfaceC37591Ep9
    public final void LIZ(final C37583Ep1 c37583Ep1) {
        this.LIZIZ.LIZJ(new BQ6() { // from class: X.EpT
            @Override // X.BQ6
            public final void accept(Object obj) {
                WebViewPort webViewPort = WebViewPort.this;
                BQ6 bq6 = c37583Ep1;
                webViewPort.getClass();
                C37613EpV.LIZJ(new ARunnableS7S0301000_6(0, webViewPort, (String) obj, bq6, 1));
            }
        });
    }

    @Override // X.InterfaceC37591Ep9
    public final void LIZIZ(m mVar) {
        this.LIZ.LIZ(mVar);
    }

    public WebViewPort(WebView webView, JSInterface jSInterface) {
        C37607EpP<String> c37607EpP;
        AtomicReference<C37607EpP<String>> atomicReference = jSInterface.LIZ;
        C37607EpP<String> c37607EpP2 = new C37607EpP<>();
        while (true) {
            if (atomicReference.compareAndSet(null, c37607EpP2)) {
                c37607EpP = jSInterface.LIZ.get();
                break;
            } else if (atomicReference.get() != null) {
                c37607EpP = jSInterface.LIZ.getAndSet(null);
                break;
            }
        }
        this.LIZIZ = c37607EpP;
        this.LIZLLL = new WeakReference<>(webView);
    }
}
