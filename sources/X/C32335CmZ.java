package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import kotlin.jvm.internal.o;

/* renamed from: X.CmZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32335CmZ implements InterfaceC72705Sg9, InterfaceC32497CpB {
    public final /* synthetic */ InterfaceC88472Yns LJLIL;

    @Override // X.InterfaceC72705Sg9
    public void onFailure(Exception exc) {
    }

    @Override // X.InterfaceC72705Sg9
    public void LIZ(W4W w4w) {
        C81392Vwy c81392Vwy;
        if (w4w == null || !w4w.LIZIZ() || (c81392Vwy = (C81392Vwy) w4w.getResult()) == null || !(c81392Vwy.LJI() instanceof W5B)) {
            return;
        }
        Object LJI = c81392Vwy.LJI();
        o.LJII(LJI, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableBitmap");
        Bitmap underlyingBitmap = ((W5B) LJI).getUnderlyingBitmap();
        if (underlyingBitmap == null) {
            return;
        }
        this.LJLIL.invoke(underlyingBitmap);
    }

    @Override // X.InterfaceC32497CpB
    public void LIZIZ(Throwable t) {
        o.LJIIIZ(t, "t");
        this.LJLIL.invoke(Boolean.FALSE);
    }

    @Override // X.InterfaceC32497CpB
    public void LIZJ(SendGiftResult sendGiftResult) {
        this.LJLIL.invoke(Boolean.TRUE);
    }
}
