package X;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import kotlin.jvm.internal.o;

/* renamed from: X.NpL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60535NpL extends AbstractC60402NnC {
    public final /* synthetic */ C60534NpK LJLIL;

    @Override // X.AbstractC60402NnC
    public final Bitmap getDefaultVideoPoster() {
        C60607NqV initParams$hybrid_web_release;
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        OM1 om1 = (OM1) this.LJLIL.LJLJLJ.LIZ();
        Boolean bool = null;
        if (!(om1 instanceof WebKitView)) {
            om1 = null;
        }
        WebKitView webKitView = (WebKitView) om1;
        if (webKitView != null && (initParams$hybrid_web_release = webKitView.getInitParams$hybrid_web_release()) != null) {
            bool = initParams$hybrid_web_release.LJIIL;
        }
        if (o.LJ(bool, Boolean.TRUE) || defaultVideoPoster == null) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        return defaultVideoPoster;
    }

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr<?> getExtension() {
        return this.LJLIL;
    }

    public C60535NpL(C60534NpK c60534NpK) {
        this.LJLIL = c60534NpK;
    }

    @Override // X.AbstractC60402NnC
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        VMI.LJ.LIZJ(webView, i);
    }
}
