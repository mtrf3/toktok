package X;

/* loaded from: classes15.dex */
public class W7E extends W90<C81392Vwy<W5A>, C81392Vwy<W5A>> {
    public final W6U LIZJ;
    public final boolean LIZLLL;
    public final W6M<W6U, W5A> LJ;
    public final boolean LJFF;

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        C81392Vwy c81392Vwy = (C81392Vwy) obj;
        C81392Vwy c81392Vwy2 = null;
        if (c81392Vwy == null) {
            if (AbstractC81756W6u.LIZLLL(i)) {
                this.LIZIZ.LIZIZ(i, null);
            }
        } else {
            if (AbstractC81756W6u.LJ(i) && !this.LIZLLL) {
                return;
            }
            if (this.LJFF) {
                c81392Vwy2 = this.LJ.LIZJ(this.LIZJ, c81392Vwy);
            }
            try {
                this.LIZIZ.LIZ(1.0f);
                W7F<O> w7f = this.LIZIZ;
                if (c81392Vwy2 != null) {
                    c81392Vwy = c81392Vwy2;
                }
                w7f.LIZIZ(i, c81392Vwy);
            } finally {
                C81392Vwy.LJ(c81392Vwy2);
            }
        }
    }

    public W7E(W7F<C81392Vwy<W5A>> w7f, W6U w6u, boolean z, W6M<W6U, W5A> w6m, boolean z2) {
        super(w7f);
        this.LIZJ = w6u;
        this.LIZLLL = z;
        this.LJ = w6m;
        this.LJFF = z2;
    }
}
