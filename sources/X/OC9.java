package X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.lobby.instagram.InstagramAuthActivity;

/* loaded from: classes11.dex */
public final class OC9 extends WebViewClient {
    public String LIZ;
    public final /* synthetic */ InstagramAuthActivity LIZIZ;

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    public OC9(InstagramAuthActivity instagramAuthActivity) {
        this.LIZIZ = instagramAuthActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
    
        if (super.shouldOverrideUrlLoading(r13, r14) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OC9.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
