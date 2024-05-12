package X;

import android.graphics.Bitmap;

/* renamed from: X.CaQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31582CaQ extends AbstractC32209CkX {
    public final /* synthetic */ InterfaceC67352kd<Bitmap> LIZ;

    public C31582CaQ(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        InterfaceC67352kd<Bitmap> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        if (bitmap != null) {
            InterfaceC67352kd<Bitmap> interfaceC67352kd = this.LIZ;
            C3C5.m7constructorimpl(bitmap);
            interfaceC67352kd.resumeWith(bitmap);
        } else {
            InterfaceC67352kd<Bitmap> interfaceC67352kd2 = this.LIZ;
            C3C5.m7constructorimpl(null);
            interfaceC67352kd2.resumeWith(null);
        }
    }
}
