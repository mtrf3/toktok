package X;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.aHJ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92845aHJ extends C60413NnN {
    public final /* synthetic */ C92110a5S LJLILLLLZI;

    public C92845aHJ(C92110a5S c92110a5S) {
        this.LJLILLLLZI = c92110a5S;
    }

    @Override // X.AbstractC60423NnX
    public final void LJ(WebView webView, String str) {
        WebViewClient webViewClient;
        super.LJ(webView, str);
        C92110a5S c92110a5S = this.LJLILLLLZI;
        if (c92110a5S != null && (webViewClient = c92110a5S.LIZIZ) != null) {
            webViewClient.onPageFinished(webView, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // X.AbstractC60423NnX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJLI(android.webkit.WebView r4, android.webkit.WebResourceRequest r5) {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            r2 = 0
            if (r1 < r0) goto L1e
            X.a5S r0 = r3.LJLILLLLZI
            if (r0 == 0) goto L3b
            android.webkit.WebViewClient r0 = r0.LIZIZ
            if (r0 == 0) goto L3b
            boolean r0 = r0.shouldOverrideUrlLoading(r4, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L17:
            if (r0 == 0) goto L3b
            boolean r0 = r0.booleanValue()
        L1d:
            return r0
        L1e:
            X.a5S r0 = r3.LJLILLLLZI
            if (r0 == 0) goto L3b
            android.webkit.WebViewClient r1 = r0.LIZIZ
            if (r1 == 0) goto L3b
            if (r5 == 0) goto L32
            android.net.Uri r0 = r5.getUrl()
            if (r0 == 0) goto L32
            java.lang.String r2 = r0.toString()
        L32:
            boolean r0 = r1.shouldOverrideUrlLoading(r4, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L17
        L3b:
            boolean r0 = super.LJIJJLI(r4, r5)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92845aHJ.LJIJJLI(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }

    @Override // X.AbstractC60423NnX
    public final void LJFF(WebView webView, String str, Bitmap bitmap) {
        WebViewClient webViewClient;
        super.LJFF(webView, str, bitmap);
        C92110a5S c92110a5S = this.LJLILLLLZI;
        if (c92110a5S != null && (webViewClient = c92110a5S.LIZIZ) != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // X.AbstractC60423NnX
    public final void LJIIIIZZ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C92110a5S c92110a5S;
        WebViewClient webViewClient;
        super.LJIIIIZZ(webView, webResourceRequest, webResourceError);
        if (Build.VERSION.SDK_INT >= 23 && (c92110a5S = this.LJLILLLLZI) != null && (webViewClient = c92110a5S.LIZIZ) != null) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }
}
