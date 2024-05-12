package X;

import java.util.List;

/* renamed from: X.1OZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OZ implements C0Y3 {
    public final int LJLIL;
    public C0Y3 LJLILLLLZI;

    @Override // X.C0Y3
    public final List<C38531fF> LIZJ() {
        return this.LJLILLLLZI.LIZJ();
    }

    @Override // X.C0Y3
    public final List<C38531fF> LJFF() {
        return this.LJLILLLLZI.LJFF();
    }

    @Override // X.C0Y3
    public final void LJIIIZ() {
        this.LJLILLLLZI.LJIIIZ();
    }

    @Override // X.C0Y3
    public final void release() {
        this.LJLILLLLZI.release();
    }

    public C1OZ(C30371Hd c30371Hd) {
        int i = c30371Hd.LIZIZ.LIZJ;
        this.LJLIL = i;
        this.LJLILLLLZI = LIZ(i);
    }

    public static C0Y3 LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return new C17J();
            }
            return new C1PH();
        }
        return new C32791Ql(0);
    }

    @Override // X.C0Y3
    public final boolean LJI(C38531fF c38531fF) {
        return this.LJLILLLLZI.LJI(c38531fF);
    }

    @Override // X.C0Y3
    public final void LJII(C38531fF c38531fF) {
        this.LJLILLLLZI.LJII(c38531fF);
    }

    @Override // X.C0Y3
    public final void LJIIIIZZ(C38531fF c38531fF) {
        this.LJLILLLLZI.LJIIIIZZ(c38531fF);
    }

    @Override // X.C0Y3
    public final List<C38531fF> LJIIJ(List<C38531fF> list) {
        return this.LJLILLLLZI.LJIIJ(list);
    }
}
