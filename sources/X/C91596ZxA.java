package X;

import android.graphics.Bitmap;

/* renamed from: X.ZxA, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91596ZxA extends AbstractC32209CkX {
    public final /* synthetic */ InterfaceC88472Yns<Bitmap, C76800UCe> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C91596ZxA(InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        this.LIZ.invoke(null);
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        if (bitmap != null) {
            this.LIZ.invoke(bitmap.copy(bitmap.getConfig(), bitmap.isMutable()));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LIZ.invoke(null);
    }
}
