package X;

import android.graphics.Bitmap;

/* renamed from: X.SbC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72398SbC extends AbstractC32209CkX {
    public final /* synthetic */ XJL<Bitmap> LIZ;

    public C72398SbC(XKS xks) {
        this.LIZ = xks;
    }

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        XJL<Bitmap> xjl = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(new Exception("fail get bitmap"));
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        if (bitmap != null) {
            XJL<Bitmap> xjl = this.LIZ;
            C3C5.m7constructorimpl(bitmap);
            xjl.resumeWith(bitmap);
        } else {
            XJL<Bitmap> xjl2 = this.LIZ;
            C3C4 LIZ = C141335gf.LIZ(new Exception("bitmap error"));
            C3C5.m7constructorimpl(LIZ);
            xjl2.resumeWith(LIZ);
        }
    }
}
