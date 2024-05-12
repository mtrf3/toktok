package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.W4o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81698W4o<T> implements IHD<T> {
    public final int LIZ;
    public final /* synthetic */ C81696W4m LIZIZ;

    @Override // X.IHD
    public final void LIZJ(AbstractC48384Iyq abstractC48384Iyq) {
    }

    @Override // X.IHD
    public final void LIZ(W4W<T> w4w) {
        this.LIZIZ.LJIJ(this.LIZ, w4w);
    }

    @Override // X.IHD
    public final void LIZIZ(AbstractC48384Iyq abstractC48384Iyq) {
        if (this.LIZ == 0) {
            this.LIZIZ.LJIIJJI(abstractC48384Iyq.LIZ());
        }
    }

    @Override // X.IHD
    public final void LIZLLL(W4W<T> w4w) {
        Throwable th;
        boolean z;
        int i;
        if (w4w.LIZJ()) {
            C81696W4m c81696W4m = this.LIZIZ;
            int i2 = this.LIZ;
            c81696W4m.getClass();
            boolean LIZIZ = w4w.LIZIZ();
            synchronized (c81696W4m) {
                int i3 = c81696W4m.LJII;
                if (w4w == c81696W4m.LJIILLIIL(i2) && i2 != c81696W4m.LJII) {
                    if (c81696W4m.LJIIZILJ() == null || (LIZIZ && i2 < c81696W4m.LJII)) {
                        c81696W4m.LJII = i2;
                        i = i2;
                    } else {
                        i = i3;
                    }
                    while (i3 > i) {
                        W4W<T> LJIILL = c81696W4m.LJIILL(i3);
                        if (LJIILL != null) {
                            LJIILL.close();
                        }
                        i3--;
                    }
                }
            }
            if (w4w == c81696W4m.LJIIZILJ()) {
                if (i2 == 0 && w4w.LIZIZ()) {
                    z = true;
                } else {
                    z = false;
                }
                c81696W4m.LJIIL(null, z);
            }
            if (c81696W4m.LJIIIZ.incrementAndGet() == c81696W4m.LJIIIIZZ && (th = c81696W4m.LJIIJ) != null) {
                c81696W4m.LJIIJ(th);
                return;
            }
            return;
        }
        if (w4w.LIZIZ()) {
            this.LIZIZ.LJIJ(this.LIZ, w4w);
        }
    }

    public C81698W4o(C81696W4m c81696W4m, int i) {
        this.LIZIZ = c81696W4m;
        this.LIZ = i;
    }
}
