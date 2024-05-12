package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1wI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49101wI extends AbstractC014804a implements InterfaceC42201lA {
    public final C11850dJ LJLILLLLZI;
    public final AbstractC11740d8 LJLJI;
    public final float LJLJJI;
    public final InterfaceC11790dD LJLJJL;
    public C10430b1 LJLJJLL;
    public EnumC23500w6 LJLJL;
    public AbstractC11540co LJLJLJ;

    public C49101wI() {
        throw null;
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    public final int hashCode() {
        int i;
        C11850dJ c11850dJ = this.LJLILLLLZI;
        int i2 = 0;
        if (c11850dJ != null) {
            i = C61876OQe.LIZJ(c11850dJ.LIZ);
        } else {
            i = 0;
        }
        int i3 = i * 31;
        AbstractC11740d8 abstractC11740d8 = this.LJLJI;
        if (abstractC11740d8 != null) {
            i2 = abstractC11740d8.hashCode();
        }
        return this.LJLJJL.hashCode() + C47959Irz.LIZIZ(this.LJLJJI, (i3 + i2) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Background(color=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", brush=");
        LIZ.append(this.LJLJI);
        LIZ.append(", alpha = ");
        LIZ.append(this.LJLJJI);
        LIZ.append(", shape=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC42201lA
    public final void LJIILIIL(InterfaceC43021mU interfaceC43021mU) {
        AbstractC11540co outline;
        InterfaceC11610cv interfaceC11610cv;
        C1QX c1qx;
        InterfaceC43021mU interfaceC43021mU2 = interfaceC43021mU;
        o.LJIIIZ(interfaceC43021mU2, "<this>");
        if (this.LJLJJL == C11710d5.LIZ) {
            C11850dJ c11850dJ = this.LJLILLLLZI;
            if (c11850dJ != null) {
                C14720hw.LJIIIIZZ(interfaceC43021mU2, c11850dJ.LIZ, 0L, 0L, 0.0f, null, 126);
            }
            AbstractC11740d8 abstractC11740d8 = this.LJLJI;
            if (abstractC11740d8 != null) {
                C14720hw.LJII(interfaceC43021mU2, abstractC11740d8, 0L, 0L, this.LJLJJI, null, 118);
            }
        } else {
            long LIZIZ = interfaceC43021mU2.LIZIZ();
            C10430b1 c10430b1 = this.LJLJJLL;
            if (!(c10430b1 instanceof C10430b1) || LIZIZ != c10430b1.LIZ || interfaceC43021mU2.getLayoutDirection() != this.LJLJL) {
                outline = this.LJLJJL.LIZ(interfaceC43021mU2.LIZIZ(), interfaceC43021mU2.getLayoutDirection(), interfaceC43021mU2);
            } else {
                outline = this.LJLJLJ;
                o.LJI(outline);
            }
            C11850dJ c11850dJ2 = this.LJLILLLLZI;
            C11890dN c11890dN = null;
            if (c11850dJ2 != null) {
                long j = c11850dJ2.LIZ;
                C43031mV style = C43031mV.LIZ;
                InterfaceC33691Tx.LJJJJL.getClass();
                int i = C14730hx.LIZIZ;
                o.LJIIIZ(outline, "outline");
                o.LJIIIZ(style, "style");
                if (outline instanceof C1QT) {
                    C10390ax c10390ax = ((C1QT) outline).LIZ;
                    c11890dN = null;
                    interfaceC43021mU2.LJJI(j, C78923UyF.LIZ(c10390ax.LIZ, c10390ax.LIZIZ), C1DF.LIZIZ(c10390ax.LIZJ - c10390ax.LIZ, c10390ax.LIZLLL - c10390ax.LIZIZ), 1.0f, style, null, i);
                } else {
                    if (outline instanceof C1QU) {
                        C1QU c1qu = (C1QU) outline;
                        c1qx = c1qu.LIZIZ;
                        if (c1qx == null) {
                            C10410az c10410az = c1qu.LIZ;
                            float LIZIZ2 = C10340as.LIZIZ(c10410az.LJII);
                            interfaceC43021mU2.LJJIJLIJ(j, C78923UyF.LIZ(c10410az.LIZ, c10410az.LIZIZ), C1DF.LIZIZ(c10410az.LIZJ - c10410az.LIZ, c10410az.LIZLLL - c10410az.LIZIZ), C78897Uxp.LJI(LIZIZ2, LIZIZ2), style, 1.0f, null, i);
                        }
                    } else if (outline instanceof C1QS) {
                        c1qx = null;
                    } else {
                        throw new C162476Zf();
                    }
                    interfaceC43021mU2 = interfaceC43021mU2;
                    interfaceC43021mU2.LJJLIIIJJI(c1qx, j, 1.0f, style, null, i);
                }
            }
            AbstractC11740d8 abstractC11740d82 = this.LJLJI;
            if (abstractC11740d82 != null) {
                float f = this.LJLJJI;
                C43031mV style2 = C43031mV.LIZ;
                InterfaceC33691Tx.LJJJJL.getClass();
                int i2 = C14730hx.LIZIZ;
                o.LJIIIZ(outline, "outline");
                o.LJIIIZ(style2, "style");
                if (outline instanceof C1QT) {
                    C10390ax c10390ax2 = ((C1QT) outline).LIZ;
                    interfaceC43021mU2 = interfaceC43021mU2;
                    interfaceC43021mU2.LJJLJ(abstractC11740d82, C78923UyF.LIZ(c10390ax2.LIZ, c10390ax2.LIZIZ), C1DF.LIZIZ(c10390ax2.LIZJ - c10390ax2.LIZ, c10390ax2.LIZLLL - c10390ax2.LIZIZ), f, style2, c11890dN, i2);
                } else {
                    if (outline instanceof C1QU) {
                        C1QU c1qu2 = (C1QU) outline;
                        interfaceC11610cv = c1qu2.LIZIZ;
                        if (interfaceC11610cv == null) {
                            C10410az c10410az2 = c1qu2.LIZ;
                            float LIZIZ3 = C10340as.LIZIZ(c10410az2.LJII);
                            interfaceC43021mU2.LJJJJZ(abstractC11740d82, C78923UyF.LIZ(c10410az2.LIZ, c10410az2.LIZIZ), C1DF.LIZIZ(c10410az2.LIZJ - c10410az2.LIZ, c10410az2.LIZLLL - c10410az2.LIZIZ), C78897Uxp.LJI(LIZIZ3, LIZIZ3), f, style2, c11890dN, i2);
                        }
                    } else if (outline instanceof C1QS) {
                        interfaceC11610cv = c11890dN;
                    } else {
                        throw new C162476Zf();
                    }
                    interfaceC43021mU2.LJJLIIIJLJLI(interfaceC11610cv, abstractC11740d82, f, style2, c11890dN, i2);
                }
            }
            this.LJLJLJ = outline;
            this.LJLJJLL = new C10430b1(interfaceC43021mU2.LIZIZ());
            this.LJLJL = interfaceC43021mU2.getLayoutDirection();
        }
        interfaceC43021mU2.LJJLIIIIJ();
    }

    public final boolean equals(Object obj) {
        C49101wI c49101wI;
        if (obj instanceof C49101wI) {
            c49101wI = (C49101wI) obj;
        } else {
            c49101wI = null;
        }
        if (c49101wI == null || !o.LJ(this.LJLILLLLZI, c49101wI.LJLILLLLZI) || !o.LJ(this.LJLJI, c49101wI.LJLJI) || this.LJLJJI != c49101wI.LJLJJI || !o.LJ(this.LJLJJL, c49101wI.LJLJJL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C49101wI(X.C11850dJ r4, X.C42611lp r5, float r6, X.InterfaceC11790dD r7, int r8) {
        /*
            r3 = this;
            X.1qA r2 = androidx.compose.ui.platform.g1.LIZ
            r0 = r8 & 1
            r1 = 0
            if (r0 == 0) goto L8
            r4 = r1
        L8:
            r0 = r8 & 2
            if (r0 == 0) goto Ld
            r5 = r1
        Ld:
            r0 = r8 & 4
            if (r0 == 0) goto L13
            r6 = 1065353216(0x3f800000, float:1.0)
        L13:
            r3.<init>(r2)
            r3.LJLILLLLZI = r4
            r3.LJLJI = r5
            r3.LJLJJI = r6
            r3.LJLJJL = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49101wI.<init>(X.0dJ, X.1lp, float, X.0dD, int):void");
    }
}
