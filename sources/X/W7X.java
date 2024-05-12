package X;

/* loaded from: classes15.dex */
public final class W7X extends W90<C81392Vwy<W5A>, C81392Vwy<W5A>> {
    public final /* synthetic */ W6U LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ W7N LJ;

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        C81392Vwy LJFF;
        C81392Vwy c81392Vwy = (C81392Vwy) obj;
        try {
            C81939WDv.LIZIZ();
            boolean LIZLLL = AbstractC81756W6u.LIZLLL(i);
            C81392Vwy c81392Vwy2 = null;
            if (c81392Vwy == null) {
                if (LIZLLL) {
                    this.LIZIZ.LIZIZ(i, null);
                }
            } else if (((W5A) c81392Vwy.LJI()).isStateful() || AbstractC81756W6u.LJIIJ(i, 8)) {
                this.LIZIZ.LIZIZ(i, c81392Vwy);
            } else {
                if (!LIZLLL && (LJFF = this.LJ.LIZ.LJFF(this.LIZJ)) != null) {
                    try {
                        InterfaceC45733HxB qualityInfo = ((W5A) c81392Vwy.LJI()).getQualityInfo();
                        InterfaceC45733HxB qualityInfo2 = ((W5A) LJFF.LJI()).getQualityInfo();
                        if (((W8A) qualityInfo2).LIZJ || ((W8A) qualityInfo2).LIZ >= ((W8A) qualityInfo).LIZ) {
                            this.LIZIZ.LIZIZ(i, LJFF);
                            C81392Vwy.LJ(LJFF);
                        }
                    } finally {
                        C81392Vwy.LJ(LJFF);
                    }
                }
                if (this.LIZLLL) {
                    c81392Vwy2 = this.LJ.LIZ.LIZJ(this.LIZJ, c81392Vwy);
                }
                if (LIZLLL) {
                    try {
                        this.LIZIZ.LIZ(1.0f);
                    } finally {
                        C81392Vwy.LJ(c81392Vwy2);
                    }
                }
                W7F<O> w7f = this.LIZIZ;
                if (c81392Vwy2 != null) {
                    c81392Vwy = c81392Vwy2;
                }
                w7f.LIZIZ(i, c81392Vwy);
            }
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W7X(W7N w7n, W7F w7f, W6U w6u, boolean z) {
        super(w7f);
        this.LJ = w7n;
        this.LIZJ = w6u;
        this.LIZLLL = z;
    }
}
