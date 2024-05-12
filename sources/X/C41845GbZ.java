package X;

import android.graphics.Bitmap;

/* renamed from: X.GbZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41845GbZ extends AbstractC32209CkX {
    public final /* synthetic */ W4W LIZ;
    public final /* synthetic */ InterfaceC41846Gba LIZIZ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        if (w4w != null) {
            w4w.close();
        }
        this.LIZIZ.accept(null);
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        if (this.LIZ.LIZIZ() && bitmap != null) {
            this.LIZIZ.accept(Bitmap.createBitmap(bitmap));
            this.LIZ.close();
            return;
        }
        this.LIZIZ.accept(null);
    }

    public C41845GbZ(W4W w4w, InterfaceC41846Gba interfaceC41846Gba) {
        this.LIZ = w4w;
        this.LIZIZ = interfaceC41846Gba;
    }
}
