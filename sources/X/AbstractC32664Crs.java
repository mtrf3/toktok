package X;

/* renamed from: X.Crs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32664Crs<T> implements IHD<T> {
    @Override // X.IHD
    public void LIZIZ(AbstractC48384Iyq abstractC48384Iyq) {
    }

    @Override // X.IHD
    public void LIZJ(AbstractC48384Iyq abstractC48384Iyq) {
    }

    public abstract void LJ(W4W<T> w4w);

    public abstract void LJFF(W4W<T> w4w);

    @Override // X.IHD
    public void LIZ(W4W<T> w4w) {
        try {
            LJ(w4w);
        } finally {
            w4w.close();
        }
    }

    @Override // X.IHD
    public final void LIZLLL(W4W<T> w4w) {
        boolean LIZIZ = w4w.LIZIZ();
        try {
            LJFF(w4w);
        } finally {
            if (LIZIZ) {
                w4w.close();
            }
        }
    }
}
