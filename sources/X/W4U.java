package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes15.dex */
public final class W4U<T> extends AbstractC32664Crs<T> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ W4R LIZJ;

    @Override // X.AbstractC32664Crs, X.IHD
    public final void LIZIZ(AbstractC48384Iyq abstractC48384Iyq) {
        boolean LIZIZ = abstractC48384Iyq.LIZIZ();
        float LIZ = abstractC48384Iyq.LIZ();
        W4R w4r = this.LIZJ;
        if (!w4r.LJIIL(this.LIZ, abstractC48384Iyq)) {
            w4r.LJIILIIL("ignore_old_datasource @ onProgress", null);
            abstractC48384Iyq.close();
        } else {
            if (LIZIZ) {
                return;
            }
            w4r.LJI.LIZLLL(LIZ, false);
        }
    }

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<T> w4w) {
        this.LIZJ.LJIILL(this.LIZ, w4w, w4w.LJFF(), true);
    }

    @Override // X.AbstractC32664Crs
    public final void LJFF(W4W<T> w4w) {
        boolean z;
        boolean LIZIZ = w4w.LIZIZ();
        w4w.LIZLLL();
        float LIZ = w4w.LIZ();
        T result = w4w.getResult();
        if (result != null) {
            W4R w4r = this.LIZJ;
            String str = this.LIZ;
            if (W9G.LIZIZ) {
                z = w4w.LIZJ();
            } else {
                z = this.LIZIZ;
            }
            w4r.LJIIZILJ(str, w4w, result, LIZ, LIZIZ, z, false);
            return;
        }
        if (!LIZIZ) {
            return;
        }
        this.LIZJ.LJIILL(this.LIZ, w4w, new NullPointerException(), true);
    }

    public W4U(W4R w4r, String str, boolean z) {
        this.LIZJ = w4r;
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
