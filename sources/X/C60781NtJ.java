package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* renamed from: X.NtJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60781NtJ extends AbstractC60423NnX {
    public boolean LJLIL = true;
    public final /* synthetic */ C60784NtM LJLILLLLZI;

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr getExtension() {
        return this.LJLILLLLZI;
    }

    public C60781NtJ(C60784NtM c60784NtM) {
        this.LJLILLLLZI = c60784NtM;
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIJJLI(WebView webView, WebResourceRequest webResourceRequest) {
        if (this.LJLILLLLZI.LJLJLJ.LJLJLLL == null) {
            return super.LJIJJLI(webView, webResourceRequest);
        }
        this.LJLIL = true;
        this.LJLILLLLZI.LJLJLJ.LJLJLLL.LIZIZ(webResourceRequest.getUrl().toString());
        boolean LJIJJLI = super.LJIJJLI(webView, webResourceRequest);
        this.LJLIL = false;
        return LJIJJLI;
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIL(WebView webView, String str) {
        if (this.LJLIL || this.LJLILLLLZI.LJLJLJ.LJLJLLL == null) {
            return super.LJIL(webView, str);
        }
        this.LJLILLLLZI.LJLJLJ.LJLJLLL.LIZIZ(str);
        return super.LJIL(webView, str);
    }
}
