package X;

import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.1mT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43011mT implements InterfaceC33691Tx {
    public final C14680hs LJLIL = new C14680hs();
    public final C33681Tw LJLILLLLZI = new C33681Tw(this);
    public C1QW LJLJI;
    public C1QW LJLJJI;

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ long LJIJ(long j) {
        return a1.LIZIZ(j, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ int LJJIJ(float f) {
        return a1.LIZ(f, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ float LJJIJL(long j) {
        return a1.LIZJ(j, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ long LJJLI(long j) {
        return a1.LIZLLL(j, this);
    }

    @Override // X.InterfaceC33691Tx
    public final long LIZIZ() {
        return this.LJLILLLLZI.LIZIZ();
    }

    public final InterfaceC11550cp LJIIL() {
        C1QW c1qw = this.LJLJJI;
        if (c1qw == null) {
            C1QW c1qw2 = new C1QW();
            c1qw2.LJIJJLI(1);
            this.LJLJJI = c1qw2;
            return c1qw2;
        }
        return c1qw;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJI() {
        return this.LJLIL.LIZ.LJJJJI();
    }

    @Override // X.InterfaceC33691Tx
    public final long LJJL() {
        return C1DF.LJIILL(this.LJLILLLLZI.LIZIZ());
    }

    @Override // X.InterfaceC23370vt
    public final float getDensity() {
        return this.LJLIL.LIZ.getDensity();
    }

    @Override // X.InterfaceC33691Tx
    public final EnumC23500w6 getLayoutDirection() {
        return this.LJLIL.LIZIZ;
    }

    @Override // X.InterfaceC33691Tx
    public final C33681Tw LJJIII() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC11550cp LJIILIIL(QZV qzv) {
        if (o.LJ(qzv, C43031mV.LIZ)) {
            C1QW c1qw = this.LJLJI;
            if (c1qw == null) {
                C1QW c1qw2 = new C1QW();
                c1qw2.LJIJJLI(0);
                this.LJLJI = c1qw2;
                return c1qw2;
            }
            return c1qw;
        }
        if (qzv instanceof C43041mW) {
            InterfaceC11550cp LJIIL = LJIIL();
            C1QW c1qw3 = (C1QW) LJIIL;
            float LJIILL = c1qw3.LJIILL();
            C43041mW c43041mW = (C43041mW) qzv;
            float f = c43041mW.LIZ;
            if (LJIILL != f) {
                c1qw3.LJIJJ(f);
            }
            int LJIIL2 = c1qw3.LJIIL();
            int i = c43041mW.LIZJ;
            if (LJIIL2 != i) {
                c1qw3.LJIIZILJ(i);
            }
            float LJIILJJIL = c1qw3.LJIILJJIL();
            float f2 = c43041mW.LIZIZ;
            if (LJIILJJIL != f2) {
                c1qw3.LJIJI(f2);
            }
            int LJIILIIL = c1qw3.LJIILIIL();
            int i2 = c43041mW.LIZLLL;
            if (LJIILIIL != i2) {
                c1qw3.LJIJ(i2);
            }
            c1qw3.getClass();
            c43041mW.getClass();
            if (o.LJ(null, null)) {
                return LJIIL;
            }
            c43041mW.getClass();
            c1qw3.LJIILLIIL(null);
            return LJIIL;
        }
        throw new C162476Zf();
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJIZL(float f) {
        return getDensity() * f;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLL(int i) {
        return i / getDensity();
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLZIJ(float f) {
        return f / getDensity();
    }

    public static long LJIIJJI(float f, long j) {
        if (f == 1.0f) {
            return j;
        }
        return C11850dJ.LIZIZ(j, C11850dJ.LIZLLL(j) * f);
    }

    public static InterfaceC11550cp LIZLLL(C43011mT c43011mT, long j, QZV qzv, float f, C11890dN c11890dN, int i) {
        InterfaceC33691Tx.LJJJJL.getClass();
        int i2 = C14730hx.LIZJ;
        InterfaceC11550cp LJIILIIL = c43011mT.LJIILIIL(qzv);
        long LJIIJJI = LJIIJJI(f, j);
        C1QW c1qw = (C1QW) LJIILIIL;
        if (!C11850dJ.LIZJ(c1qw.LIZJ(), LJIIJJI)) {
            c1qw.LIZLLL(LJIIJJI);
        }
        if (c1qw.LIZJ != null) {
            c1qw.LJIIJ(null);
        }
        if (!o.LJ(c1qw.LIZLLL, c11890dN)) {
            c1qw.LJ(c11890dN);
        }
        if (c1qw.LIZIZ != i) {
            c1qw.LJFF(i);
        }
        if (c1qw.LJIIJJI() != i2) {
            c1qw.LJI(i2);
        }
        return LJIILIIL;
    }

    public static InterfaceC11550cp LJIIJ(C43011mT c43011mT, AbstractC11740d8 abstractC11740d8, QZV qzv, float f, C11890dN c11890dN, int i) {
        InterfaceC33691Tx.LJJJJL.getClass();
        return c43011mT.LJI(abstractC11740d8, qzv, f, c11890dN, i, C14730hx.LIZJ);
    }

    public final InterfaceC11550cp LJI(AbstractC11740d8 abstractC11740d8, QZV qzv, float f, C11890dN c11890dN, int i, int i2) {
        InterfaceC11550cp LJIILIIL = LJIILIIL(qzv);
        if (abstractC11740d8 != null) {
            abstractC11740d8.LIZ(f, LIZIZ(), LJIILIIL);
        } else if (LJIILIIL.LIZ() != f) {
            LJIILIIL.setAlpha(f);
        }
        if (!o.LJ(LJIILIIL.LIZIZ(), c11890dN)) {
            LJIILIIL.LJ(c11890dN);
        }
        if (LJIILIIL.LJIIIZ() != i) {
            LJIILIIL.LJFF(i);
        }
        if (LJIILIIL.LJIIJJI() != i2) {
            LJIILIIL.LJI(i2);
        }
        return LJIILIIL;
    }

    @Override // X.InterfaceC33691Tx
    public final void LJJIIJZLJL(InterfaceC12040dc image, long j, float f, QZV style, C11890dN c11890dN, int i) {
        o.LJIIIZ(image, "image");
        o.LJIIIZ(style, "style");
        this.LJLIL.LIZJ.LJ(image, j, LJIIJ(this, null, style, f, c11890dN, i));
    }

    @Override // X.InterfaceC33691Tx
    public final void LJJLIIIJJI(InterfaceC11610cv path, long j, float f, QZV style, C11890dN c11890dN, int i) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(style, "style");
        this.LJLIL.LIZJ.LJIILJJIL(path, LIZLLL(this, j, style, f, c11890dN, i));
    }

    @Override // X.InterfaceC33691Tx
    public final void LJJLIIIJLJLI(InterfaceC11610cv path, AbstractC11740d8 brush, float f, QZV style, C11890dN c11890dN, int i) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(brush, "brush");
        o.LJIIIZ(style, "style");
        this.LJLIL.LIZJ.LJIILJJIL(path, LJIIJ(this, brush, style, f, c11890dN, i));
    }

    @Override // X.InterfaceC33691Tx
    public final void LJJI(long j, long j2, long j3, float f, QZV style, C11890dN c11890dN, int i) {
        o.LJIIIZ(style, "style");
        this.LJLIL.LIZJ.LJIIIIZZ(C10370av.LIZLLL(j2), C10370av.LJ(j2), C10430b1.LIZLLL(j3) + C10370av.LIZLLL(j2), C10430b1.LIZIZ(j3) + C10370av.LJ(j2), LIZLLL(this, j, style, f, c11890dN, i));
    }

    @Override // X.InterfaceC33691Tx
    public final void LJJJJJ(long j, float f, long j2, float f2, QZV style, C11890dN c11890dN, int i) {
        o.LJIIIZ(style, "style");
        this.LJLIL.LIZJ.LIZ(f, j2, LIZLLL(this, j, style, f2, c11890dN, i));
    }

    @Override // X.InterfaceC33691Tx
    public final void LJJLJ(AbstractC11740d8 brush, long j, long j2, float f, QZV style, C11890dN c11890dN, int i) {
        o.LJIIIZ(brush, "brush");
        o.LJIIIZ(style, "style");
        this.LJLIL.LIZJ.LJIIIIZZ(C10370av.LIZLLL(j), C10370av.LJ(j), C10430b1.LIZLLL(j2) + C10370av.LIZLLL(j), C10430b1.LIZIZ(j2) + C10370av.LJ(j), LJIIJ(this, brush, style, f, c11890dN, i));
    }

    @Override // X.InterfaceC33691Tx
    public final void LJJIJLIJ(long j, long j2, long j3, long j4, QZV style, float f, C11890dN c11890dN, int i) {
        o.LJIIIZ(style, "style");
        this.LJLIL.LIZJ.LJII(C10370av.LIZLLL(j2), C10370av.LJ(j2), C10430b1.LIZLLL(j3) + C10370av.LIZLLL(j2), C10430b1.LIZIZ(j3) + C10370av.LJ(j2), C10340as.LIZIZ(j4), C10340as.LIZJ(j4), LIZLLL(this, j, style, f, c11890dN, i));
    }

    @Override // X.InterfaceC33691Tx
    public final void LJJJJZ(AbstractC11740d8 brush, long j, long j2, long j3, float f, QZV style, C11890dN c11890dN, int i) {
        o.LJIIIZ(brush, "brush");
        o.LJIIIZ(style, "style");
        this.LJLIL.LIZJ.LJII(C10370av.LIZLLL(j), C10370av.LJ(j), C10370av.LIZLLL(j) + C10430b1.LIZLLL(j2), C10370av.LJ(j) + C10430b1.LIZIZ(j2), C10340as.LIZIZ(j3), C10340as.LIZJ(j3), LJIIJ(this, brush, style, f, c11890dN, i));
    }

    @Override // X.InterfaceC33691Tx
    public final void LJJII(long j, float f, float f2, long j2, long j3, float f3, QZV style, C11890dN c11890dN, int i) {
        o.LJIIIZ(style, "style");
        this.LJLIL.LIZJ.LJIILL(C10370av.LIZLLL(j2), C10370av.LJ(j2), C10430b1.LIZLLL(j3) + C10370av.LIZLLL(j2), C10430b1.LIZIZ(j3) + C10370av.LJ(j2), f, f2, LIZLLL(this, j, style, f3, c11890dN, i));
    }

    @Override // X.InterfaceC33691Tx
    public final void LJJJJJL(AbstractC11740d8 brush, long j, long j2, float f, int i, C39579Fg7 c39579Fg7, float f2, C11890dN c11890dN, int i2) {
        o.LJIIIZ(brush, "brush");
        InterfaceC11750d9 interfaceC11750d9 = this.LJLIL.LIZJ;
        InterfaceC33691Tx.LJJJJL.getClass();
        int i3 = C14730hx.LIZJ;
        InterfaceC11550cp LJIIL = LJIIL();
        brush.LIZ(f2, LIZIZ(), LJIIL);
        C1QW c1qw = (C1QW) LJIIL;
        if (!o.LJ(c1qw.LIZLLL, c11890dN)) {
            c1qw.LJ(c11890dN);
        }
        if (c1qw.LIZIZ != i2) {
            c1qw.LJFF(i2);
        }
        if (c1qw.LJIILL() != f) {
            c1qw.LJIJJ(f);
        }
        if (c1qw.LJIILJJIL() != 4.0f) {
            c1qw.LJIJI(4.0f);
        }
        if (c1qw.LJIIL() != i) {
            c1qw.LJIIZILJ(i);
        }
        if (c1qw.LJIILIIL() != 0) {
            c1qw.LJIJ(0);
        }
        c1qw.getClass();
        if (!o.LJ(null, c39579Fg7)) {
            c1qw.LJIILLIIL(c39579Fg7);
        }
        if (c1qw.LJIIJJI() != i3) {
            c1qw.LJI(i3);
        }
        interfaceC11750d9.LJIIZILJ(j, j2, LJIIL);
    }

    @Override // X.InterfaceC33691Tx
    public final void LJJJJZI(long j, long j2, long j3, float f, int i, C39579Fg7 c39579Fg7, float f2, C11890dN c11890dN, int i2) {
        InterfaceC11750d9 interfaceC11750d9 = this.LJLIL.LIZJ;
        InterfaceC33691Tx.LJJJJL.getClass();
        int i3 = C14730hx.LIZJ;
        InterfaceC11550cp LJIIL = LJIIL();
        long LJIIJJI = LJIIJJI(f2, j);
        C1QW c1qw = (C1QW) LJIIL;
        if (!C11850dJ.LIZJ(c1qw.LIZJ(), LJIIJJI)) {
            c1qw.LIZLLL(LJIIJJI);
        }
        if (c1qw.LIZJ != null) {
            c1qw.LJIIJ(null);
        }
        if (!o.LJ(c1qw.LIZLLL, c11890dN)) {
            c1qw.LJ(c11890dN);
        }
        if (c1qw.LIZIZ != i2) {
            c1qw.LJFF(i2);
        }
        if (c1qw.LJIILL() != f) {
            c1qw.LJIJJ(f);
        }
        if (c1qw.LJIILJJIL() != 4.0f) {
            c1qw.LJIJI(4.0f);
        }
        if (c1qw.LJIIL() != i) {
            c1qw.LJIIZILJ(i);
        }
        if (c1qw.LJIILIIL() != 0) {
            c1qw.LJIJ(0);
        }
        c1qw.getClass();
        if (!o.LJ(null, c39579Fg7)) {
            c1qw.LJIILLIIL(c39579Fg7);
        }
        if (c1qw.LJIIJJI() != i3) {
            c1qw.LJI(i3);
        }
        interfaceC11750d9.LJIIZILJ(j2, j3, LJIIL);
    }

    @Override // X.InterfaceC33691Tx
    public final void LJJJZ(InterfaceC12040dc image, long j, long j2, long j3, long j4, float f, QZV style, C11890dN c11890dN, int i, int i2) {
        o.LJIIIZ(image, "image");
        o.LJIIIZ(style, "style");
        this.LJLIL.LIZJ.LIZIZ(image, j, j2, j3, j4, LJI(null, style, f, c11890dN, i, i2));
    }
}
