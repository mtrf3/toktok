package X;

/* renamed from: X.W7w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81784W7w extends W8Z {
    public final C81782W7u LJIIIZ;
    public final W8B LJIIJ;
    public final C81783W7v LJIIJJI;
    public final InterfaceC81770W7i LJIIL;
    public int LJIILIIL;

    @Override // X.W8Z
    public final InterfaceC45733HxB LJIILIIL() {
        return this.LJIIJ.LIZIZ(this.LJIIIZ.LJ);
    }

    @Override // X.W8Z
    public final int LJIIL(W8X w8x) {
        w8x.LJIILIIL();
        if (w8x.LJLJI == C81796W8i.LIZ) {
            return this.LJIIIZ.LJFF;
        }
        w8x.LJIILIIL();
        if (w8x.LJLJI == C81796W8i.LJIIIZ) {
            return this.LJIIJJI.LIZLLL;
        }
        return 0;
    }

    @Override // X.W8Z
    public final synchronized boolean LJIILLIIL(W8X w8x, int i) {
        boolean LJII = this.LJII.LJII(w8x, i);
        if ((AbstractC81756W6u.LJ(i) || AbstractC81756W6u.LJIIJ(i, 8)) && !AbstractC81756W6u.LJIIJ(i, 4) && W8X.LJIIJJI(w8x)) {
            w8x.LJIILIIL();
            if (w8x.LJLJI == C81796W8i.LIZ) {
                if (!this.LJIIL.LJ().LJ) {
                    return false;
                }
                if (!this.LJIIIZ.LIZIZ(w8x)) {
                    return false;
                }
                int i2 = this.LJIIIZ.LJ;
                int i3 = this.LJIILIIL;
                if (i2 <= i3) {
                    return false;
                }
                if (i2 < this.LJIIJ.LIZ(i3) && !this.LJIIIZ.LJI) {
                    return false;
                }
                this.LJIILIIL = i2;
            } else {
                w8x.LJIILIIL();
                if (w8x.LJLJI == C81796W8i.LJIIIZ) {
                    if (!this.LJIIL.LJ().LJFF) {
                        return false;
                    }
                    if (!this.LJIIJJI.LIZIZ(w8x)) {
                        return false;
                    }
                    int i4 = this.LJIIJJI.LIZJ;
                    if (i4 - this.LJIILIIL < this.LJIIL.LJ().LJJ && this.LJIILIIL != 0) {
                        return false;
                    }
                    this.LJIILIIL = i4;
                } else {
                    w8x.LJIILIIL();
                    if (C81796W8i.LIZ(w8x.LJLJI)) {
                        this.LJIIL.LJ().getClass();
                        return false;
                    }
                }
            }
        }
        return LJII;
    }

    public C81784W7w(C81785W7x c81785W7x, W7F<C81392Vwy<W5A>> w7f, InterfaceC81770W7i interfaceC81770W7i, C81782W7u c81782W7u, W8B w8b, C81783W7v c81783W7v, boolean z, int i) {
        super(c81785W7x, w7f, interfaceC81770W7i, z, i);
        this.LJIIIZ = c81782W7u;
        w8b.getClass();
        this.LJIIJ = w8b;
        this.LJIIJJI = c81783W7v;
        this.LJIIL = interfaceC81770W7i;
        this.LJIILIIL = 0;
    }
}
