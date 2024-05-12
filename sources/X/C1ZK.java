package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1ZK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZK implements InterfaceC21400si {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;

    @Override // X.InterfaceC21400si
    public final C1JK LIZ(boolean z, C1OH interactionSource, InterfaceC24520xk interfaceC24520xk, int i) {
        float f;
        o.LJIIIZ(interactionSource, "interactionSource");
        interfaceC24520xk.LJJIIJ(-1588756907);
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        Object obj = C24500xi.LIZIZ;
        if (LJIILL == obj) {
            LJIILL = new C48211ur();
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C48211ur c48211ur = (C48211ur) LJIILL;
        interfaceC24520xk.LJJIIJ(511388516);
        boolean LJIJJ = interfaceC24520xk.LJIJJ(interactionSource) | interfaceC24520xk.LJIJJ(c48211ur);
        Object LJIILL2 = interfaceC24520xk.LJIILL();
        if (LJIJJ || LJIILL2 == obj) {
            LJIILL2 = new C55472Fr(interactionSource, c48211ur, null);
            interfaceC24520xk.LJJIII(LJIILL2);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C24610xt.LJ(interactionSource, (InterfaceC88471Ynr) LJIILL2, interfaceC24520xk);
        C0X8 c0x8 = (C0X8) ORZ.LLFII(c48211ur);
        if (!z) {
            f = this.LIZJ;
        } else if (c0x8 instanceof C1OJ) {
            f = this.LIZIZ;
        } else if (c0x8 instanceof C1OF) {
            f = this.LIZLLL;
        } else if (c0x8 instanceof C1OD) {
            f = this.LJ;
        } else {
            f = this.LIZ;
        }
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL3 = interfaceC24520xk.LJIILL();
        if (LJIILL3 == obj) {
            LJIILL3 = new C07070Pn(new C23390vv(f), C0QD.LIZJ, null);
            interfaceC24520xk.LJJIII(LJIILL3);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C07070Pn c07070Pn = (C07070Pn) LJIILL3;
        if (!z) {
            interfaceC24520xk.LJJIIJ(-1598807481);
            C24610xt.LJ(new C23390vv(f), new C55492Ft(c07070Pn, f, null), interfaceC24520xk);
            interfaceC24520xk.LJJIJIIJIL();
        } else {
            interfaceC24520xk.LJJIIJ(-1598807310);
            C24610xt.LJ(new C23390vv(f), new C55502Fu(c07070Pn, this, f, c0x8, null), interfaceC24520xk);
            interfaceC24520xk.LJJIJIIJIL();
        }
        C1JK<T, V> c1jk = c07070Pn.LIZJ;
        interfaceC24520xk.LJJIJIIJIL();
        return c1jk;
    }

    public C1ZK(float f, float f2, float f3, float f4, float f5) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
    }
}
