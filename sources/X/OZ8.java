package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZ8 implements OZA {
    public final /* synthetic */ UserQRCodeActivity LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ InterfaceC62225ObV LIZJ;

    public OZ8(UserQRCodeActivity userQRCodeActivity, UserQRCodeActivity userQRCodeActivity2, InterfaceC62225ObV interfaceC62225ObV) {
        this.LIZ = userQRCodeActivity;
        this.LIZIZ = userQRCodeActivity2;
        this.LIZJ = interfaceC62225ObV;
    }

    @Override // X.OZA
    public final void LIZ(C62180Oam squareView, C79866VWc backgroundLayout, OZD shareOutView) {
        o.LJIIIZ(squareView, "squareView");
        o.LJIIIZ(backgroundLayout, "backgroundLayout");
        o.LJIIIZ(shareOutView, "shareOutView");
        OZ4.LIZIZ(this.LIZ, squareView, null, backgroundLayout, shareOutView, false, true, new OZ7(this.LIZIZ, this.LIZJ));
    }
}
