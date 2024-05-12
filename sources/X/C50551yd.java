package X;

import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1yd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50551yd extends AbstractC014804a implements InterfaceC44951pb, InterfaceC42201lA {
    public final AbstractC16010k1 LJLILLLLZI;
    public final boolean LJLJI;
    public final InterfaceC07760Se LJLJJI;
    public final InterfaceC273615o LJLJJL;
    public final float LJLJJLL;
    public final C11890dN LJLJL;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    public final boolean LIZ() {
        if (!this.LJLJI || this.LJLILLLLZI.LJI() == C10430b1.LIZJ) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int LIZIZ = C47959Irz.LIZIZ(this.LJLJJLL, (this.LJLJJL.hashCode() + ((this.LJLJJI.hashCode() + C07250Qf.LIZ(this.LJLJI, this.LJLILLLLZI.hashCode() * 31, 31)) * 31)) * 31, 31);
        C11890dN c11890dN = this.LJLJL;
        if (c11890dN != null) {
            i = c11890dN.hashCode();
        } else {
            i = 0;
        }
        return LIZIZ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PainterModifier(painter=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", sizeToIntrinsics=");
        LIZ.append(this.LJLJI);
        LIZ.append(", alignment=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", alpha=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", colorFilter=");
        LIZ.append(this.LJLJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public static boolean LIZIZ(long j) {
        if (C10430b1.LIZ(j, C10430b1.LIZJ)) {
            return false;
        }
        float LIZIZ = C10430b1.LIZIZ(j);
        if (Float.isInfinite(LIZIZ) || Float.isNaN(LIZIZ)) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(long j) {
        if (C10430b1.LIZ(j, C10430b1.LIZJ)) {
            return false;
        }
        float LIZLLL = C10430b1.LIZLLL(j);
        if (Float.isInfinite(LIZLLL) || Float.isNaN(LIZLLL)) {
            return false;
        }
        return true;
    }

    public final long LIZLLL(long j) {
        boolean z;
        boolean z2;
        int LJIIIZ;
        int LJIIIIZZ;
        float LIZLLL;
        float LIZIZ;
        if (C23360vs.LIZLLL(j) && C23360vs.LIZJ(j)) {
            z = true;
        } else {
            z = false;
        }
        if (C23360vs.LJFF(j) && C23360vs.LJ(j)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!LIZ() && z) || z2) {
            return C23360vs.LIZ(j, C23360vs.LJII(j), 0, C23360vs.LJI(j), 0, 10);
        }
        long LJI = this.LJLILLLLZI.LJI();
        if (LIZJ(LJI)) {
            LJIIIZ = O6R.LJJIIZ(C10430b1.LIZLLL(LJI));
        } else {
            LJIIIZ = C23360vs.LJIIIZ(j);
        }
        if (LIZIZ(LJI)) {
            LJIIIIZZ = O6R.LJJIIZ(C10430b1.LIZIZ(LJI));
        } else {
            LJIIIIZZ = C23360vs.LJIIIIZZ(j);
        }
        long LIZIZ2 = C1DF.LIZIZ(C78555UsJ.LJIIJJI(LJIIIZ, j), C78555UsJ.LJIIJ(LJIIIIZZ, j));
        if (LIZ()) {
            if (!LIZJ(this.LJLILLLLZI.LJI())) {
                LIZLLL = C10430b1.LIZLLL(LIZIZ2);
            } else {
                LIZLLL = C10430b1.LIZLLL(this.LJLILLLLZI.LJI());
            }
            if (!LIZIZ(this.LJLILLLLZI.LJI())) {
                LIZIZ = C10430b1.LIZIZ(LIZIZ2);
            } else {
                LIZIZ = C10430b1.LIZIZ(this.LJLILLLLZI.LJI());
            }
            long LIZIZ3 = C1DF.LIZIZ(LIZLLL, LIZIZ);
            if (C10430b1.LIZLLL(LIZIZ2) == 0.0f || C10430b1.LIZIZ(LIZIZ2) == 0.0f) {
                LIZIZ2 = C10430b1.LIZIZ;
            } else {
                LIZIZ2 = C1FP.LJIL(LIZIZ3, this.LJLJJL.LJZI(LIZIZ3, LIZIZ2));
            }
        }
        return C23360vs.LIZ(j, C78555UsJ.LJIIJJI(O6R.LJJIIZ(C10430b1.LIZLLL(LIZIZ2)), j), 0, C78555UsJ.LJIIJ(O6R.LJJIIZ(C10430b1.LIZIZ(LIZIZ2)), j), 0, 10);
    }

    @Override // X.InterfaceC42201lA
    public final void LJIILIIL(InterfaceC43021mU interfaceC43021mU) {
        float LIZLLL;
        float LIZIZ;
        long LJIL;
        o.LJIIIZ(interfaceC43021mU, "<this>");
        long LJI = this.LJLILLLLZI.LJI();
        if (LIZJ(LJI)) {
            LIZLLL = C10430b1.LIZLLL(LJI);
        } else {
            LIZLLL = C10430b1.LIZLLL(interfaceC43021mU.LIZIZ());
        }
        if (LIZIZ(LJI)) {
            LIZIZ = C10430b1.LIZIZ(LJI);
        } else {
            LIZIZ = C10430b1.LIZIZ(interfaceC43021mU.LIZIZ());
        }
        long LIZIZ2 = C1DF.LIZIZ(LIZLLL, LIZIZ);
        if (C10430b1.LIZLLL(interfaceC43021mU.LIZIZ()) == 0.0f || C10430b1.LIZIZ(interfaceC43021mU.LIZIZ()) == 0.0f) {
            LJIL = C10430b1.LIZIZ;
        } else {
            LJIL = C1FP.LJIL(LIZIZ2, this.LJLJJL.LJZI(LIZIZ2, interfaceC43021mU.LIZIZ()));
        }
        long q = this.LJLJJI.q(C78996UzQ.LIZIZ(O6R.LJJIIZ(C10430b1.LIZLLL(LJIL)), O6R.LJJIIZ(C10430b1.LIZIZ(LJIL))), C78996UzQ.LIZIZ(O6R.LJJIIZ(C10430b1.LIZLLL(interfaceC43021mU.LIZIZ())), O6R.LJJIIZ(C10430b1.LIZIZ(interfaceC43021mU.LIZIZ()))), interfaceC43021mU.getLayoutDirection());
        float f = (int) (q >> 32);
        float LIZJ = C23450w1.LIZJ(q);
        interfaceC43021mU.LJJIII().LIZ.LJI(f, LIZJ);
        AbstractC16010k1 abstractC16010k1 = this.LJLILLLLZI;
        float f2 = this.LJLJJLL;
        C11890dN c11890dN = this.LJLJL;
        abstractC16010k1.getClass();
        if (abstractC16010k1.LJLJJI != f2) {
            if (!abstractC16010k1.LIZ(f2)) {
                if (f2 == 1.0f) {
                    C1QW c1qw = abstractC16010k1.LJLIL;
                    if (c1qw != null) {
                        c1qw.setAlpha(f2);
                    }
                    abstractC16010k1.LJLILLLLZI = false;
                } else {
                    C1QW c1qw2 = abstractC16010k1.LJLIL;
                    if (c1qw2 == null) {
                        c1qw2 = new C1QW();
                        abstractC16010k1.LJLIL = c1qw2;
                    }
                    c1qw2.setAlpha(f2);
                    abstractC16010k1.LJLILLLLZI = true;
                }
            }
            abstractC16010k1.LJLJJI = f2;
        }
        if (!o.LJ(abstractC16010k1.LJLJI, c11890dN)) {
            if (!abstractC16010k1.LJ(c11890dN)) {
                if (c11890dN == null) {
                    C1QW c1qw3 = abstractC16010k1.LJLIL;
                    if (c1qw3 != null) {
                        c1qw3.LJ(null);
                    }
                    abstractC16010k1.LJLILLLLZI = false;
                } else {
                    C1QW c1qw4 = abstractC16010k1.LJLIL;
                    if (c1qw4 == null) {
                        c1qw4 = new C1QW();
                        abstractC16010k1.LJLIL = c1qw4;
                    }
                    c1qw4.LJ(c11890dN);
                    abstractC16010k1.LJLILLLLZI = true;
                }
            }
            abstractC16010k1.LJLJI = c11890dN;
        }
        EnumC23500w6 layoutDirection = interfaceC43021mU.getLayoutDirection();
        if (abstractC16010k1.LJLJJL != layoutDirection) {
            abstractC16010k1.LJFF(layoutDirection);
            abstractC16010k1.LJLJJL = layoutDirection;
        }
        float LIZLLL2 = C10430b1.LIZLLL(interfaceC43021mU.LIZIZ()) - C10430b1.LIZLLL(LJIL);
        float LIZIZ3 = C10430b1.LIZIZ(interfaceC43021mU.LIZIZ()) - C10430b1.LIZIZ(LJIL);
        interfaceC43021mU.LJJIII().LIZ.LIZJ(0.0f, 0.0f, LIZLLL2, LIZIZ3);
        if (f2 > 0.0f && C10430b1.LIZLLL(LJIL) > 0.0f && C10430b1.LIZIZ(LJIL) > 0.0f) {
            if (abstractC16010k1.LJLILLLLZI) {
                C10390ax LIZ = C78929UyL.LIZ(C10370av.LIZIZ, C1DF.LIZIZ(C10430b1.LIZLLL(LJIL), C10430b1.LIZIZ(LJIL)));
                InterfaceC11750d9 LIZ2 = interfaceC43021mU.LJJIII().LIZ();
                C1QW c1qw5 = abstractC16010k1.LJLIL;
                if (c1qw5 == null) {
                    c1qw5 = new C1QW();
                    abstractC16010k1.LJLIL = c1qw5;
                }
                try {
                    LIZ2.LIZJ(LIZ, c1qw5);
                    abstractC16010k1.LJII(interfaceC43021mU);
                } finally {
                    LIZ2.LJIIJ();
                }
            } else {
                abstractC16010k1.LJII(interfaceC43021mU);
            }
        }
        interfaceC43021mU.LJJIII().LIZ.LIZJ(-0.0f, -0.0f, -LIZLLL2, -LIZIZ3);
        interfaceC43021mU.LJJIII().LIZ.LJI(-f, -LIZJ);
        interfaceC43021mU.LJJLIIIIJ();
    }

    public final boolean equals(Object obj) {
        C50551yd c50551yd;
        if (obj instanceof C50551yd) {
            c50551yd = (C50551yd) obj;
        } else {
            c50551yd = null;
        }
        if (c50551yd == null || !o.LJ(this.LJLILLLLZI, c50551yd.LJLILLLLZI) || this.LJLJI != c50551yd.LJLJI || !o.LJ(this.LJLJJI, c50551yd.LJLJJI) || !o.LJ(this.LJLJJL, c50551yd.LJLJJL) || this.LJLJJLL != c50551yd.LJLJJLL || !o.LJ(this.LJLJL, c50551yd.LJLJL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // X.InterfaceC44951pb
    public final int LJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        if (LIZ()) {
            long LIZLLL = LIZLLL(C78555UsJ.LJ(0, i, 7));
            return Math.max(C23360vs.LJIIIZ(LIZLLL), interfaceC274115t.LJJLJLI(i));
        }
        return interfaceC274115t.LJJLJLI(i);
    }

    @Override // X.InterfaceC44951pb
    public final int LJIIJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        if (LIZ()) {
            long LIZLLL = LIZLLL(C78555UsJ.LJ(0, i, 7));
            return Math.max(C23360vs.LJIIIZ(LIZLLL), interfaceC274115t.LJJJI(i));
        }
        return interfaceC274115t.LJJJI(i);
    }

    @Override // X.InterfaceC44951pb
    public final InterfaceC273515n LJIILL(InterfaceC44861pS measure, InterfaceC39071g7 interfaceC39071g7, long j) {
        InterfaceC273515n LJJLIL;
        o.LJIIIZ(measure, "$this$measure");
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(LIZLLL(j));
        LJJLIL = measure.LJJLIL(LJJJIL.LJLIL, LJJJIL.LJLILLLLZI, C113554cx.LJJJLIIL(), new IDqS416S0100000(LJJJIL, 180));
        return LJJLIL;
    }

    @Override // X.InterfaceC44951pb
    public final int LJJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        if (LIZ()) {
            long LIZLLL = LIZLLL(C78555UsJ.LJ(i, 0, 13));
            return Math.max(C23360vs.LJIIIIZZ(LIZLLL), interfaceC274115t.LJJLIIIJILLIZJL(i));
        }
        return interfaceC274115t.LJJLIIIJILLIZJL(i);
    }

    @Override // X.InterfaceC44951pb
    public final int LJJJIL(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        if (LIZ()) {
            long LIZLLL = LIZLLL(C78555UsJ.LJ(i, 0, 13));
            return Math.max(C23360vs.LJIIIIZZ(LIZLLL), interfaceC274115t.LJJLIIIJLLLLLLLZ(i));
        }
        return interfaceC274115t.LJJLIIIJLLLLLLLZ(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50551yd(X.AbstractC16010k1 r3, boolean r4, X.InterfaceC07760Se r5, X.InterfaceC273615o r6, float r7, X.C11890dN r8) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "painter"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            r2.LJLJI = r4
            r2.LJLJJI = r5
            r2.LJLJJL = r6
            r2.LJLJJLL = r7
            r2.LJLJL = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50551yd.<init>(X.0k1, boolean, X.0Se, X.15o, float, X.0dN):void");
    }
}
