package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0D3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0D3 {
    public C1M3 LIZ;
    public int LIZIZ;
    public C25710zf<C1M2> LIZJ;
    public C25710zf<C1M2> LIZLLL;
    public final /* synthetic */ C0D4 LJ;

    public final void LIZIZ() {
        C1M3 c1m3 = this.LIZ.LJLJJI;
        o.LJI(c1m3);
        this.LIZ = c1m3;
        this.LJ.getClass();
        C0D4 c0d4 = this.LJ;
        C1M3 c1m32 = this.LIZ;
        c0d4.getClass();
        if (c1m32.LJLJL) {
            c1m32.LJIILLIIL();
        }
        C1M3 c1m33 = c1m32.LJLJJL;
        C1M3 c1m34 = c1m32.LJLJJI;
        if (c1m33 != null) {
            c1m33.LJLJJI = c1m34;
            c1m32.LJLJJL = null;
        }
        if (c1m34 != null) {
            c1m34.LJLJJL = c1m33;
            c1m32.LJLJJI = null;
        }
        o.LJI(c1m33);
        this.LIZ = c1m33;
    }

    public final void LIZ(int i) {
        C1M3 c1m3 = this.LIZ;
        C0D4 c0d4 = this.LJ;
        C1M2 c1m2 = this.LIZLLL.LJLIL[i];
        c0d4.getClass();
        this.LIZ = C0D4.LIZIZ(c1m2, c1m3);
        this.LJ.getClass();
        int i2 = this.LIZIZ;
        C1M3 c1m32 = this.LIZ;
        int i3 = i2 | c1m32.LJLILLLLZI;
        this.LIZIZ = i3;
        c1m32.LJLJI = i3;
    }

    public final void LIZJ(int i, int i2) {
        C1M3 c1m3 = this.LIZ.LJLJJI;
        o.LJI(c1m3);
        this.LIZ = c1m3;
        C1M2 c1m2 = this.LIZJ.LJLIL[i];
        C1M2 c1m22 = this.LIZLLL.LJLIL[i2];
        if (!o.LJ(c1m2, c1m22)) {
            C1M3 c1m32 = this.LIZ;
            this.LJ.getClass();
            this.LIZ = C0D4.LIZLLL(c1m2, c1m22, c1m32);
            this.LJ.getClass();
        } else {
            this.LJ.getClass();
        }
        int i3 = this.LIZIZ;
        C1M3 c1m33 = this.LIZ;
        int i4 = i3 | c1m33.LJLILLLLZI;
        this.LIZIZ = i4;
        c1m33.LJLJI = i4;
    }

    public C0D3(C0D4 c0d4, C1M3 node, int i, C25710zf<C1M2> c25710zf, C25710zf<C1M2> c25710zf2) {
        o.LJIIIZ(node, "node");
        this.LJ = c0d4;
        this.LIZ = node;
        this.LIZIZ = i;
        this.LIZJ = c25710zf;
        this.LIZLLL = c25710zf2;
    }
}
