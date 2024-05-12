package X;

import android.view.View;
import com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZB implements OZA {
    public final /* synthetic */ UserQRCodeActivity LIZ;
    public final /* synthetic */ View LIZIZ;

    public OZB(UserQRCodeActivity userQRCodeActivity, View view) {
        this.LIZ = userQRCodeActivity;
        this.LIZIZ = view;
    }

    @Override // X.OZA
    public final void LIZ(C62180Oam squareView, C79866VWc backgroundLayout, OZD shareOutView) {
        o.LJIIIZ(squareView, "squareView");
        o.LJIIIZ(backgroundLayout, "backgroundLayout");
        o.LJIIIZ(shareOutView, "shareOutView");
        OZ4.LIZIZ(this.LIZ, squareView, this.LIZIZ, backgroundLayout, shareOutView, true, false, null);
        this.LIZ.getClass();
        C62112OZg c62112OZg = new C62112OZg();
        c62112OZg.LJIILL = "personal";
        c62112OZg.LJIILLIIL = "shaped";
        c62112OZg.LJIIZILJ = "success";
        c62112OZg.LJIILIIL();
    }
}
