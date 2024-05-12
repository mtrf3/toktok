package X;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.internal.WebDialog;
import kotlin.jvm.internal.o;

/* renamed from: X.Q4e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66400Q4e extends WebViewClient {
    public final /* synthetic */ WebDialog LIZ;

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    public C66400Q4e(WebDialog this$0) {
        o.LJIIIZ(this$0, "this$0");
        this.LIZ = this$0;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        ProgressDialog progressDialog;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.onPageFinished(view, url);
        WebDialog webDialog = this.LIZ;
        if (!webDialog.LJLL && (progressDialog = webDialog.LJLJJL) != null) {
            progressDialog.dismiss();
        }
        FrameLayout frameLayout = this.LIZ.LJLJL;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
        }
        OK2 ok2 = this.LIZ.LJLJJI;
        if (ok2 != null) {
            ok2.setVisibility(0);
        }
        ImageView imageView = this.LIZ.LJLJJLL;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.LIZ.LJLLI = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66400Q4e.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView view, String url, Bitmap bitmap) {
        ProgressDialog progressDialog;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        o.LJIILLIIL(url, "Webview loading URL: ");
        super.onPageStarted(view, url, bitmap);
        WebDialog webDialog = this.LIZ;
        if (webDialog.LJLL || (progressDialog = webDialog.LJLJJL) == null || new C03880Dg(2).LIZJ(300000, "android/app/ProgressDialog", "show", progressDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-2080996000679432411")).LIZ) {
            return;
        }
        progressDialog.show();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(handler, "handler");
        o.LJIIIZ(error, "error");
        super.onReceivedSslError(view, handler, error);
        handler.cancel();
        this.LIZ.LJ(new C65844Psm(null, -11, null));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i, String description, String failingUrl) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(description, "description");
        o.LJIIIZ(failingUrl, "failingUrl");
        super.onReceivedError(view, i, description, failingUrl);
        this.LIZ.LJ(new C65844Psm(description, i, failingUrl));
    }
}
