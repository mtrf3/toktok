package com.bytedance.pia.core.plugins;

import X.AbstractC37502Eni;
import X.C37238EjS;
import X.C37449Emr;
import X.C37499Enf;
import X.C37613EpV;
import X.RunnableC31370CSw;
import Y.ARunnableS6S0101000_2;
import Y.ARunnableS9S0201000_6;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.pia.core.bridge.channel.WebViewPort;

/* loaded from: classes7.dex */
public class BridgePlugin extends AbstractC37502Eni {
    @Override // X.AbstractC37502Eni
    public final String LIZ() {
        return "pia_bridge";
    }

    @Override // X.AbstractC37502Eni
    public final void LJI() {
        WebView webView;
        WebViewPort.JSInterface jSInterface;
        View LJI = this.LIZ.LJI();
        if (!(LJI instanceof WebView) || (webView = (WebView) LJI) == null || (jSInterface = WebViewPort.JSInterface.LIZJ.get(webView)) == null) {
            C37238EjS.LIZLLL(6, "[Bridge] start render bridge failed!", null);
            return;
        }
        WebViewPort webViewPort = new WebViewPort(webView, jSInterface);
        C37449Emr c37449Emr = this.LIZ.LJIJI;
        c37449Emr.getClass();
        C37613EpV.LIZJ(new ARunnableS9S0201000_6(1, c37449Emr, webViewPort, 6));
        C37613EpV.LIZIZ(new RunnableC31370CSw(1, webViewPort, this.LIZ.LJ));
        C37238EjS.LJI(6, "[Bridge] start render bridge success.", null);
    }

    public BridgePlugin(C37499Enf c37499Enf) {
        super(c37499Enf);
    }

    @Override // X.AbstractC37502Eni
    public final void LJ(View view) {
        if (view instanceof WebView) {
            C37613EpV.LIZIZ(new ARunnableS6S0101000_2(1, view, 0));
        }
    }
}
