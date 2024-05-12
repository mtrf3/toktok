package X;

import android.graphics.Bitmap;

/* loaded from: classes6.dex */
public final class CXR extends AbstractC32209CkX {
    public final /* synthetic */ CXQ LIZ;

    public CXR(CXQ cxq) {
        this.LIZ = cxq;
    }

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        C0NB.LJ("interact", "Fetch avatar bitmap failed");
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        if (bitmap == null) {
            C0NB.LJ("interact", "Fetch avatar bitmap null");
            return;
        }
        Bitmap bitmap2 = this.LIZ.LJLJI;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.LIZ.LJLJI = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        this.LIZ.LIZ();
    }
}
