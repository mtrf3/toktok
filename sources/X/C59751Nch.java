package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: X.Nch, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59751Nch implements NZX {
    public final /* synthetic */ C59613NaT LJLIL;

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

    public C59751Nch(C59613NaT c59613NaT) {
        this.LJLIL = c59613NaT;
    }

    @Override // X.NZX
    public final void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (C52544Kjk.LIZ() && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            this.LJLIL.pageStartUrl = "about:blank";
        }
    }

    @Override // X.NZX
    public final void LJIIL(WebView webView, String str, Bitmap bitmap) {
        InterfaceC37958Ev4 interfaceC37958Ev4;
        C59613NaT c59613NaT = this.LJLIL;
        c59613NaT.pageStartUrl = str;
        if (str != null && (interfaceC37958Ev4 = ((C37905EuD) c59613NaT.iesJsBridge.LJIIL.getValue()).LIZ.LIZ.LIZLLL) != null) {
            interfaceC37958Ev4.LIZLLL(str);
        }
    }

    @Override // X.NZX
    public final void LJFF(WebView webView, int i, String str, String str2) {
        if (C52544Kjk.LIZ()) {
            this.LJLIL.pageStartUrl = "about:blank";
        }
    }
}
