package X;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: X.Nad, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59623Nad extends NVZ {
    public final InterfaceC60279NlD LIZ;

    public C59623Nad(InterfaceC60279NlD interfaceC60279NlD) {
        this.LIZ = interfaceC60279NlD;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC60279NlD interfaceC60279NlD = this.LIZ;
        if (interfaceC60279NlD != null) {
            interfaceC60279NlD.LIZ(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC60279NlD interfaceC60279NlD = this.LIZ;
        if (interfaceC60279NlD != null) {
            interfaceC60279NlD.LIZIZ(webView, str);
        }
    }

    @Override // X.NVZ, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        InterfaceC60279NlD interfaceC60279NlD = this.LIZ;
        if (interfaceC60279NlD != null) {
            interfaceC60279NlD.LJII(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // X.NVZ, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        InterfaceC60279NlD interfaceC60279NlD = this.LIZ;
        if (interfaceC60279NlD != null) {
            interfaceC60279NlD.LJIIIZ(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        InterfaceC60279NlD interfaceC60279NlD = this.LIZ;
        if (interfaceC60279NlD != null) {
            interfaceC60279NlD.LJIIJ(webView, i, str, str2);
        }
    }
}
