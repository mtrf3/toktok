package X;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes11.dex */
public final class NUU extends WebViewClient {
    public final /* synthetic */ NVO LIZ;

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    public NUU(NVO nvo) {
        this.LIZ = nvo;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            NTF.LJJ(this.LIZ, true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            NTF.LJJ(this.LIZ, false);
        }
    }
}
