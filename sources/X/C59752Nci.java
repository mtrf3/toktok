package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: X.Nci, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59752Nci implements NZX {
    public final /* synthetic */ C59612NaS LJLIL;

    @Override // X.NZX
    public final void LIZ(WebView webView, String str) {
    }

    @Override // X.NZX
    public final void LJIILIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // X.NZX
    public final boolean LJIILJJIL(WebView webView, String str, WebResourceRequest webResourceRequest, boolean z) {
        return false;
    }

    @Override // X.NZX
    public final void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // X.NZX
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public C59752Nci(C59612NaS c59612NaS) {
        this.LJLIL = c59612NaS;
    }

    @Override // X.NZX
    public final void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (C52544Kjk.LIZ() && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            this.LJLIL.LJLLL = "about:blank";
        }
    }

    @Override // X.NZX
    public final void LJIIL(WebView webView, String str, Bitmap bitmap) {
        InterfaceC37958Ev4 interfaceC37958Ev4;
        C59612NaS c59612NaS = this.LJLIL;
        c59612NaS.LJLLL = str;
        if (str != null && (interfaceC37958Ev4 = ((C37905EuD) c59612NaS.LJLIL.LJIIL.getValue()).LIZ.LIZ.LIZLLL) != null) {
            interfaceC37958Ev4.LIZLLL(str);
        }
    }

    @Override // X.NZX
    public final void LJFF(WebView webView, int i, String str, String str2) {
        if (C52544Kjk.LIZ()) {
            this.LJLIL.LJLLL = "about:blank";
        }
    }
}
