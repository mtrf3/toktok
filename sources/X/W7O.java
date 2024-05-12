package X;

/* loaded from: classes15.dex */
public class W7O extends W90<W8X, W8X> {
    public final W6M<W6U, InterfaceC81378Vwk> LIZJ;
    public final W6U LIZLLL;
    public final boolean LJ;

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        C81392Vwy c81392Vwy;
        W8X w8x = (W8X) obj;
        try {
            C81939WDv.LIZIZ();
            if (!AbstractC81756W6u.LJ(i) && w8x != null && (i & 10) == 0) {
                w8x.LJIILIIL();
                if (w8x.LJLJI != C81828W9o.LIZIZ) {
                    C81392Vwy<InterfaceC81378Vwk> LIZLLL = w8x.LIZLLL();
                    if (LIZLLL != null) {
                        try {
                            if (this.LJ) {
                                c81392Vwy = this.LIZJ.LIZJ(this.LIZLLL, LIZLLL);
                            } else {
                                c81392Vwy = null;
                            }
                            if (c81392Vwy != null) {
                                try {
                                    W8X w8x2 = new W8X(c81392Vwy);
                                    w8x2.LIZJ(w8x);
                                    try {
                                        this.LIZIZ.LIZ(1.0f);
                                        this.LIZIZ.LIZIZ(i, w8x2);
                                        W8X.LIZIZ(w8x2);
                                    } catch (Throwable th) {
                                        W8X.LIZIZ(w8x2);
                                        throw th;
                                    }
                                } finally {
                                    C81392Vwy.LJ(c81392Vwy);
                                }
                            }
                        } finally {
                            C81392Vwy.LJ(LIZLLL);
                        }
                    }
                    this.LIZIZ.LIZIZ(i, w8x);
                }
            }
            this.LIZIZ.LIZIZ(i, w8x);
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    public W7O(W7F<W8X> w7f, W6M<W6U, InterfaceC81378Vwk> w6m, W6U w6u, boolean z) {
        super(w7f);
        this.LIZJ = w6m;
        this.LIZLLL = w6u;
        this.LJ = z;
    }
}
