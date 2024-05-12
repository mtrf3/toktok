package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity;

/* loaded from: classes11.dex */
public class O5U extends WebViewClient {
    public final /* synthetic */ O5V LIZ;

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    public O5U(O5V o5v) {
        this.LIZ = o5v;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        O5V o5v = this.LIZ;
        if (!o5v.LJLILLLLZI && !o5v.LJLJI) {
            o5v.LJLJI = true;
            o5v.LJLIL.LIZIZ();
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str.toLowerCase().contains("/favicon.ico")) {
            try {
                return new WebResourceResponse("image/png", null, null);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i;
        if (C61349O5x.LIZ()) {
            this.LIZ.getContext();
        }
        Activity activity = this.LIZ.LJLJJL;
        if (activity != null && (activity instanceof TwiceVerifyWebActivity)) {
            try {
                i = webResourceResponse.getStatusCode();
            } catch (Throwable unused) {
                i = 0;
            }
            ((TwiceVerifyWebActivity) this.LIZ.LJLJJL).LLFII(i);
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        try {
            webResourceRequest.getUrl().toString().toLowerCase().contains("/favicon.ico");
        } catch (Exception e) {
            C61349O5x.LIZIZ(e);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i;
        if (C61349O5x.LIZ()) {
            Context context = this.LIZ.getContext();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onReceivedSslError : ");
            LIZ.append(sslError);
            C16880lQ.LLZILL(Toast.makeText(context, X1D.LIZIZ(LIZ), 1));
        }
        Activity activity = this.LIZ.LJLJJL;
        if (activity != null && (activity instanceof TwiceVerifyWebActivity)) {
            try {
                i = sslError.getPrimaryError();
            } catch (Throwable unused) {
                i = 0;
            }
            ((TwiceVerifyWebActivity) this.LIZ.LJLJJL).LLFII(i);
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.LIZ.LJLILLLLZI = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append(" onReceivedError ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        O5W o5w = this.LIZ.LJLIL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("|");
        LIZ2.append(str2);
        o5w.LIZ(i, X1D.LIZIZ(LIZ2));
        Activity activity = this.LIZ.LJLJJL;
        if (activity != null && (activity instanceof TwiceVerifyWebActivity)) {
            ((TwiceVerifyWebActivity) activity).LLFII(i);
        }
        super.onReceivedError(webView, i, str, str2);
    }
}
