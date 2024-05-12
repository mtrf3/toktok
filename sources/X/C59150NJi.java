package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.NJi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59150NJi extends C59458NVe {
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public C59135NIt LJFF;

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (!o.LJ(str, "about:blank") && !this.LIZIZ && !this.LIZJ && !this.LIZLLL) {
            this.LIZIZ = true;
            C59135NIt c59135NIt = this.LJFF;
            if (c59135NIt != null) {
                c59135NIt.LIZ(Long.valueOf(System.currentTimeMillis() - this.LJ), "preload_success");
            }
        }
    }

    @Override // X.NVZ
    public final void LIZ(WebView webView, C59151NJj c59151NJj, NUZ nuz) {
        String str;
        if (c59151NJj != null) {
            str = c59151NJj.LIZIZ().toString();
        } else {
            str = null;
        }
        if (!o.LJ(str, "about:blank") && c59151NJj != null && c59151NJj.LIZJ()) {
            this.LIZJ = true;
            C59135NIt c59135NIt = this.LJFF;
            if (c59135NIt != null) {
                c59135NIt.LIZ.getMErrorView().setVisibility(0);
                c59135NIt.LIZ(null, "preload_fail");
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (o.LJ(str, "about:blank")) {
            return;
        }
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = System.currentTimeMillis();
        C59135NIt c59135NIt = this.LJFF;
        if (c59135NIt != null) {
            c59135NIt.LIZ.getMErrorView().setVisibility(8);
            c59135NIt.LIZ(null, "preload_start");
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (o.LJ(str2, "about:blank")) {
            return;
        }
        this.LIZJ = true;
        C59135NIt c59135NIt = this.LJFF;
        if (c59135NIt != null) {
            c59135NIt.LIZ.getMErrorView().setVisibility(0);
            c59135NIt.LIZ(null, "preload_fail");
        }
    }
}
