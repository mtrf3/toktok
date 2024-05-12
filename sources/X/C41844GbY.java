package X;

import android.graphics.Bitmap;

/* renamed from: X.GbY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41844GbY extends AbstractC32209CkX {
    public final /* synthetic */ W4W<C81392Vwy<W5A>> LIZ;
    public final /* synthetic */ InterfaceC67352kd<Bitmap> LIZIZ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        if (w4w != null) {
            w4w.close();
        }
        C78966Uyw.LJJL(null, this.LIZIZ);
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        if (this.LIZ.LIZIZ() && bitmap != null) {
            C78966Uyw.LJJL(Bitmap.createBitmap(bitmap), this.LIZIZ);
        }
    }

    public C41844GbY(W4W w4w, C84654XKg c84654XKg) {
        this.LIZ = w4w;
        this.LIZIZ = c84654XKg;
    }
}
