package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NWJ extends C59458NVe {
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C59486NWg LJ;
    public boolean LJFF = true;

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageFinished(android.webkit.WebView r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NWJ.onPageFinished(android.webkit.WebView, java.lang.String):void");
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
            C59486NWg c59486NWg = this.LJ;
            if (c59486NWg != null) {
                c59486NWg.LIZ();
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
        System.currentTimeMillis();
        C59486NWg c59486NWg = this.LJ;
        if (c59486NWg != null) {
            c59486NWg.LIZ.LIZ(R.id.hxg).setVisibility(8);
            View findViewById = c59486NWg.LIZ.LIZ(R.id.hxh).findViewById(R.id.cyv);
            if (findViewById == null) {
                return;
            }
            findViewById.setVisibility(8);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (o.LJ(str2, "about:blank")) {
            return;
        }
        this.LIZJ = true;
        C59486NWg c59486NWg = this.LJ;
        if (c59486NWg != null) {
            c59486NWg.LIZ();
        }
    }
}
