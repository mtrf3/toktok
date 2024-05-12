package X;

import Y.ARunnableS29S0200000_10;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.ies.bullet.service.popup.BulletPopUpFragment;

/* renamed from: X.Nnp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60441Nnp extends C59458NVe {
    public final /* synthetic */ BulletPopUpFragment LIZIZ;

    public C60441Nnp(BulletPopUpFragment bulletPopUpFragment) {
        this.LIZIZ = bulletPopUpFragment;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        BulletPopUpFragment bulletPopUpFragment = this.LIZIZ;
        FrameLayout Gl = bulletPopUpFragment.Gl();
        NUX nux = this.LIZ;
        if (Gl != null) {
            Gl.post(new ARunnableS29S0200000_10(bulletPopUpFragment, nux, 0));
        }
    }
}
