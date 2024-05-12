package X;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.Pl0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65362Pl0 extends WebViewClient {
    public final String LIZ;
    public final InterfaceC65368Pl6 LIZIZ;

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    public C65362Pl0(String str, C65363Pl1 c65363Pl1) {
        this.LIZ = str;
        this.LIZIZ = c65363Pl1;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ((C65363Pl1) this.LIZIZ).LIZJ.setVisibility(8);
        webView.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (C59312NPo.LJFF(webView, str)) {
            return true;
        }
        if (str.startsWith(this.LIZ)) {
            TreeMap LJIILIIL = C78999UzT.LJIILIIL(java.net.URI.create(str).getRawQuery(), false);
            Bundle bundle = new Bundle(LJIILIIL.size());
            for (Map.Entry entry : LJIILIIL.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            C65363Pl1 c65363Pl1 = (C65363Pl1) this.LIZIZ;
            c65363Pl1.getClass();
            C65265PjR.LIZIZ().getClass();
            String string = bundle.getString("oauth_verifier");
            if (string != null) {
                C65265PjR.LIZIZ().getClass();
                c65363Pl1.LJFF.LIZJ(new C65359Pkx(c65363Pl1), c65363Pl1.LIZIZ, string);
            } else {
                C44432HcC LIZIZ = C65265PjR.LIZIZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failed to get authorization, bundle incomplete ");
                LIZ.append(bundle);
                X1D.LIZIZ(LIZ);
                LIZIZ.getClass();
                c65363Pl1.LIZ(1, new C65288Pjo("Failed to get authorization, bundle incomplete"));
            }
            c65363Pl1.LIZLLL.stopLoading();
            c65363Pl1.LIZJ.setVisibility(8);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        InterfaceC65368Pl6 interfaceC65368Pl6 = this.LIZIZ;
        sslError.getPrimaryError();
        new C65366Pl4(null);
        C65363Pl1 c65363Pl1 = (C65363Pl1) interfaceC65368Pl6;
        c65363Pl1.getClass();
        C65265PjR.LIZIZ().getClass();
        c65363Pl1.LIZ(1, new C65288Pjo("OAuth web view completed with an error"));
        c65363Pl1.LIZLLL.stopLoading();
        c65363Pl1.LIZJ.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        InterfaceC65368Pl6 interfaceC65368Pl6 = this.LIZIZ;
        new C65366Pl4(str);
        C65363Pl1 c65363Pl1 = (C65363Pl1) interfaceC65368Pl6;
        c65363Pl1.getClass();
        C65265PjR.LIZIZ().getClass();
        c65363Pl1.LIZ(1, new C65288Pjo("OAuth web view completed with an error"));
        c65363Pl1.LIZLLL.stopLoading();
        c65363Pl1.LIZJ.setVisibility(8);
    }
}
