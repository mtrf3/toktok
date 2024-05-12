package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Ro6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70650Ro6 implements InterfaceC78660Uu0 {
    public final /* synthetic */ C70649Ro5 LJLIL;
    public final /* synthetic */ RUH LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        Object LIZ;
        C70649Ro5 c70649Ro5 = this.LJLIL;
        try {
            LIZ = new BitmapDrawable(c70649Ro5.getResources(), C70649Ro5.LIZLLL(c70649Ro5.getTagRadius(), bitmap, c70649Ro5));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Drawable drawable = (Drawable) LIZ;
        if (drawable == null) {
            drawable = C70649Ro5.LJ(this.LJLIL, this.LJLILLLLZI.LIZ);
        }
        c70649Ro5.setBackground(drawable);
    }

    public C70650Ro6(C70649Ro5 c70649Ro5, RUH ruh) {
        this.LJLIL = c70649Ro5;
        this.LJLILLLLZI = ruh;
    }
}
