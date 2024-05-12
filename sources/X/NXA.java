package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NXA implements NZX {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public NXB LJLJJI;
    public boolean LJLJJL = true;

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

    public final void LIZIZ(boolean z) {
        NXB nxb;
        this.LJLJI = z;
        if (z && !this.LJLIL && (nxb = this.LJLJJI) != null) {
            System.currentTimeMillis();
            nxb.LJ();
        }
    }

    @Override // X.NZX
    public final void LIZ(WebView webView, String str) {
        if (o.LJ(str, "about:blank")) {
            return;
        }
        if (this.LJLJJL) {
            this.LJLJJL = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        if (!this.LJLIL && !this.LJLILLLLZI && !this.LJLJI) {
            this.LJLIL = true;
            NXB nxb = this.LJLJJI;
            if (nxb != null) {
                nxb.LIZ();
            }
        }
        NXB nxb2 = this.LJLJJI;
        if (nxb2 != null) {
            nxb2.LIZIZ();
        }
    }

    @Override // X.NZX
    public final void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        android.net.Uri url;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            str = url.toString();
        } else {
            str = null;
        }
        if (!o.LJ(str, "about:blank") && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            this.LJLILLLLZI = true;
            NXB nxb = this.LJLJJI;
            if (nxb != null) {
                nxb.LIZLLL();
            }
        }
    }

    @Override // X.NZX
    public final void LJIIL(WebView webView, String str, Bitmap bitmap) {
        if (o.LJ(str, "about:blank")) {
            return;
        }
        this.LJLIL = false;
        this.LJLILLLLZI = false;
        LIZIZ(false);
        System.currentTimeMillis();
        NXB nxb = this.LJLJJI;
        if (nxb != null) {
            nxb.LIZJ();
        }
    }

    @Override // X.NZX
    public final void LJFF(WebView webView, int i, String str, String str2) {
        if (o.LJ(str2, "about:blank")) {
            return;
        }
        this.LJLILLLLZI = true;
        NXB nxb = this.LJLJJI;
        if (nxb != null) {
            nxb.LIZLLL();
        }
    }
}
