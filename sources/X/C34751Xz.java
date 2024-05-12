package X;

import Y.IDd0S16S0000000;

/* renamed from: X.1Xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34751Xz implements InterfaceC19350pP {
    public final AbstractC03300Ba LIZ;
    public final IDd0S16S0000000 LIZIZ;
    public final IDd0S16S0000000 LIZJ;

    public final void LIZIZ() {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZJ.LIZ();
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZJ.LIZJ(LIZ);
        }
    }

    public C34751Xz(final AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        new C1CG<C19340pO>(abstractC03300Ba) { // from class: X.1nK
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C19340pO c19340pO) {
                c19340pO.getClass();
                interfaceC37591dj.LLLLLLJ(1);
                byte[] LIZLLL = C0CY.LIZLLL(null);
                if (LIZLLL == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJJIIZ(2, LIZLLL);
                }
            }
        };
        this.LIZIZ = new IDd0S16S0000000(abstractC03300Ba, 2);
        this.LIZJ = new IDd0S16S0000000(abstractC03300Ba, 3);
    }

    public final void LIZ(String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZIZ.LIZ();
        if (str == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJII(1, str);
        }
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZIZ.LIZJ(LIZ);
        }
    }
}
