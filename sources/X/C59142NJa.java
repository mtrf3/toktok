package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NJa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59142NJa implements NZX {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public C59136NIu LJLJJL;

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

    @Override // X.NZX
    public final void LIZ(WebView webView, String str) {
        if (!o.LJ(str, "about:blank") && !this.LJLIL && !this.LJLILLLLZI && !this.LJLJI) {
            this.LJLIL = true;
            C59136NIu c59136NIu = this.LJLJJL;
            if (c59136NIu != null) {
                c59136NIu.LIZIZ(Long.valueOf(System.currentTimeMillis() - this.LJLJJI), "preload_success");
                c59136NIu.LIZ.LJLLILLLL = true;
            }
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
            C59136NIu c59136NIu = this.LJLJJL;
            if (c59136NIu != null) {
                c59136NIu.LIZ();
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
        this.LJLJI = false;
        this.LJLJJI = System.currentTimeMillis();
        C59136NIu c59136NIu = this.LJLJJL;
        if (c59136NIu != null) {
            c59136NIu.LIZ.getMErrorView().setVisibility(8);
            View findViewById = c59136NIu.LIZ.getMWebView().findViewById(R.id.cyv);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            c59136NIu.LIZIZ(null, "preload_start");
        }
    }

    @Override // X.NZX
    public final void LJFF(WebView webView, int i, String str, String str2) {
        if (o.LJ(str2, "about:blank")) {
            return;
        }
        this.LJLILLLLZI = true;
        C59136NIu c59136NIu = this.LJLJJL;
        if (c59136NIu != null) {
            c59136NIu.LIZ();
        }
    }
}
