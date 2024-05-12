package X;

/* loaded from: classes15.dex */
public class W78 extends W90<C81392Vwy<W5A>, C81392Vwy<W5A>> {
    public boolean LIZJ;
    public C81392Vwy<W5A> LIZLLL;

    public final boolean LJIIJJI() {
        synchronized (this) {
            if (this.LIZJ) {
                return false;
            }
            C81392Vwy<W5A> c81392Vwy = this.LIZLLL;
            this.LIZLLL = null;
            this.LIZJ = true;
            C81392Vwy.LJ(c81392Vwy);
            return true;
        }
    }

    public final void LJIIL() {
        synchronized (this) {
            if (this.LIZJ) {
                return;
            }
            C81392Vwy LIZJ = C81392Vwy.LIZJ(this.LIZLLL);
            try {
                this.LIZIZ.LIZIZ(0, LIZJ);
            } finally {
                C81392Vwy.LJ(LIZJ);
            }
        }
    }

    @Override // X.W90, X.AbstractC81756W6u
    public final void LJFF() {
        if (LJIIJJI()) {
            this.LIZIZ.LIZJ();
        }
    }

    @Override // X.W90, X.AbstractC81756W6u
    public final void LJI(Throwable th) {
        if (LJIIJJI()) {
            this.LIZIZ.onFailure(th);
        }
    }

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        C81392Vwy c81392Vwy = (C81392Vwy) obj;
        if (AbstractC81756W6u.LJ(i)) {
            return;
        }
        synchronized (this) {
            if (!this.LIZJ) {
                C81392Vwy<W5A> c81392Vwy2 = this.LIZLLL;
                this.LIZLLL = C81392Vwy.LIZJ(c81392Vwy);
                C81392Vwy.LJ(c81392Vwy2);
            }
        }
        LJIIL();
    }

    public W78(W76 w76, W7H w7h, InterfaceC81770W7i interfaceC81770W7i) {
        super(w76);
        w7h.LIZ();
        interfaceC81770W7i.LIZLLL(new W7C(this));
    }
}
