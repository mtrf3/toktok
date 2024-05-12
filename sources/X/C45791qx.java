package X;

import java.util.HashSet;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45791qx extends C1M3 implements C1DY, InterfaceC40491iP, C1DP, C1DT, C1DO, C17Q, C00E, C1DN, C1DX, C1DQ, C0DU, C0XA {
    public C1M2 LJLJLJ;
    public boolean LJLJLLL;
    public C51281zo LJLL;
    public C39621h0 LJLLI;
    public final HashSet<C00C<?>> LJLLILLLL;
    public InterfaceC274415w LJLLJ;

    @Override // X.C1DP
    public final void LJIILJJIL() {
        this.LJLJLLL = true;
        C78840Uwu.LJJIJ(this).LJJII();
    }

    @Override // X.C1M3
    public final void LJIIZILJ() {
        LJIJI(true);
    }

    @Override // X.C1DO
    public final void LIZ() {
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC44261oU) c1m2).p().getClass();
    }

    @Override // X.C0XA
    public final long LIZIZ() {
        return C78996UzQ.LJJJJIZL(C78840Uwu.LJJIIZI(this, 128).LJLJI);
    }

    @Override // X.C17Q
    public final QZV LIZLLL() {
        C39621h0 c39621h0 = this.LJLLI;
        if (c39621h0 != null) {
            return c39621h0;
        }
        return new QZV() { // from class: X.1h1
            @Override // X.QZV
            public final boolean LJIIIIZZ(C00C<?> key) {
                o.LJIIIZ(key, "key");
                return false;
            }

            @Override // X.QZV
            public final Object LJIIJ(C17R key) {
                o.LJIIIZ(key, "key");
                "".toString();
                throw new IllegalStateException("");
            }
        };
    }

    @Override // X.C1DO
    public final void LJFF() {
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC44261oU) c1m2).p().LIZLLL();
    }

    @Override // X.C1DO
    public final boolean LJIIIZ() {
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C11V p = ((InterfaceC44261oU) c1m2).p();
        p.getClass();
        return p instanceof C37441dU;
    }

    public final void LJIJJLI() {
        C51281zo c51281zo;
        if (this.LJLJL) {
            C1M2 c1m2 = this.LJLJLJ;
            if ((this.LJLILLLLZI & 32) != 0) {
                if (c1m2 instanceof InterfaceC39651h3) {
                    C00D modifierLocalManager = C78840Uwu.LJJIJIIJI(this).getModifierLocalManager();
                    C17R key = ((InterfaceC39651h3) c1m2).getKey();
                    modifierLocalManager.getClass();
                    o.LJIIIZ(key, "key");
                    modifierLocalManager.LIZLLL.LIZLLL(new OSZ(C78840Uwu.LJJIJ(this), key));
                    modifierLocalManager.LIZ();
                }
                if (c1m2 instanceof InterfaceC39641h2) {
                    ((InterfaceC39641h2) c1m2).LLJI(C03710Cp.LIZ);
                }
                if ((c1m2 instanceof InterfaceC42261lG) && (c51281zo = this.LJLL) != null) {
                    C00D modifierLocalManager2 = C78840Uwu.LJJIJIIJI(this).getModifierLocalManager();
                    C17R<C51281zo> key2 = c51281zo.LJLJJI;
                    modifierLocalManager2.getClass();
                    o.LJIIIZ(key2, "key");
                    modifierLocalManager2.LIZLLL.LIZLLL(new OSZ(C78840Uwu.LJJIJ(this), key2));
                    modifierLocalManager2.LIZ();
                }
            }
            if ((this.LJLILLLLZI & 8) != 0) {
                C78840Uwu.LJJIJIIJI(this).LJIIL();
                return;
            }
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final void LJIL() {
        if (this.LJLJL) {
            C78840Uwu.LJJIJIIJI(this).getSnapshotObserver().LIZ(this, C03710Cp.LIZLLL, new IDqS420S0100000(this, 9));
        }
    }

    public final void LJJ() {
        if (this.LJLJL) {
            this.LJLLILLLL.clear();
            C78840Uwu.LJJIJIIJI(this).getSnapshotObserver().LIZ(this, C03710Cp.LIZJ, new IDqS420S0100000(this, 10));
        }
    }

    @Override // X.C1DT
    public final C1JY LJJJJ() {
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((InterfaceC41461jy) c1m2).LJJJJ();
    }

    public final String toString() {
        return this.LJLJLJ.toString();
    }

    @Override // X.AnonymousClass160
    public final void LJ() {
        C78840Uwu.LJJIJ(this).LJ();
    }

    @Override // X.C0XA
    public final InterfaceC23370vt getDensity() {
        return C78840Uwu.LJJIJ(this).LJLLLL;
    }

    @Override // X.C0XA
    public final EnumC23500w6 getLayoutDirection() {
        return C78840Uwu.LJJIJ(this).LJLZ;
    }

    @Override // X.C1M3
    public final void LJIJ() {
        LJIJJLI();
    }

    @Override // X.C0DU
    public final boolean isValid() {
        return this.LJLJL;
    }

    public C45791qx(C1M2 element) {
        o.LJIIIZ(element, "element");
        this.LJLILLLLZI = C17J.LJIILL(element);
        this.LJLJLJ = element;
        this.LJLJLLL = true;
        this.LJLLILLLL = new HashSet<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        r3 = null;
     */
    @Override // X.C00E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C17R r5) {
        /*
            r4 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.HashSet<X.00C<?>> r0 = r4.LJLLILLLL
            r0.add(r5)
            X.1M3 r1 = r4.LJLIL
            boolean r0 = r1.LJLJL
            if (r0 == 0) goto L5d
            X.1M3 r3 = r1.LJLJJI
            X.1Dc r2 = X.C78840Uwu.LJJIJ(r4)
        L16:
            if (r2 == 0) goto L56
        L18:
            X.0D4 r0 = r2.LLI
            X.1M3 r0 = r0.LJ
            int r0 = r0.LJLJI
            r0 = r0 & 32
            if (r0 == 0) goto L47
        L22:
            if (r3 == 0) goto L47
            int r0 = r3.LJLILLLLZI
            r0 = r0 & 32
            if (r0 == 0) goto L44
            boolean r0 = r3 instanceof X.C17Q
            if (r0 == 0) goto L44
            r1 = r3
            X.17Q r1 = (X.C17Q) r1
            X.QZV r0 = r1.LIZLLL()
            boolean r0 = r0.LJIIIIZZ(r5)
            if (r0 == 0) goto L44
            X.QZV r0 = r1.LIZLLL()
            java.lang.Object r0 = r0.LJIIJ(r5)
            return r0
        L44:
            X.1M3 r3 = r3.LJLJJI
            goto L22
        L47:
            X.1Dc r2 = r2.LJIJJLI()
            if (r2 == 0) goto L56
            X.0D4 r0 = r2.LLI
            if (r0 == 0) goto L54
            X.1iM r3 = r0.LIZLLL
            goto L18
        L54:
            r3 = 0
            goto L16
        L56:
            X.Pro<T> r0 = r5.LIZ
            java.lang.Object r0 = r0.invoke()
            return r0
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45791qx.LJII(X.17R):java.lang.Object");
    }

    @Override // X.InterfaceC40491iP
    public final void LJIIJ(long j) {
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        ((InterfaceC536328p) c1m2).LJIIJ(j);
    }

    @Override // X.C1DP
    public final void LJIILIIL(InterfaceC43021mU interfaceC43021mU) {
        o.LJIIIZ(interfaceC43021mU, "<this>");
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        InterfaceC42201lA interfaceC42201lA = (InterfaceC42201lA) c1m2;
        if (this.LJLJLLL && (c1m2 instanceof InterfaceC50531yb)) {
            C1M2 c1m22 = this.LJLJLJ;
            if (c1m22 instanceof InterfaceC50531yb) {
                C78840Uwu.LJJIJIIJI(this).getSnapshotObserver().LIZ(this, C03710Cp.LIZIZ, new IDqS176S0200000(c1m22, this, 18));
            }
            this.LJLJLLL = false;
        }
        interfaceC42201lA.LJIILIIL(interfaceC43021mU);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.1DK] */
    public final void LJIJI(boolean z) {
        boolean z2;
        if (this.LJLJL) {
            C1M2 c1m2 = this.LJLJLJ;
            if ((this.LJLILLLLZI & 32) != 0) {
                if (c1m2 instanceof InterfaceC39651h3) {
                    LJJI((InterfaceC39651h3) c1m2);
                }
                if (c1m2 instanceof InterfaceC39641h2) {
                    if (z) {
                        LJJ();
                    } else {
                        C78840Uwu.LJJIJIIJI(this).LJIILJJIL(new IDqS420S0100000(this, 7));
                    }
                }
                if (c1m2 instanceof InterfaceC42261lG) {
                    final InterfaceC42261lG interfaceC42261lG = (InterfaceC42261lG) c1m2;
                    C51281zo c51281zo = new C51281zo(new InterfaceC88472Yns<C0ZG, C76800UCe>(interfaceC42261lG) { // from class: X.1lH
                        public final InterfaceC42261lG LJLIL;

                        {
                            o.LJIIIZ(interfaceC42261lG, "modifier");
                            this.LJLIL = interfaceC42261lG;
                        }

                        @Override // X.InterfaceC88472Yns
                        public final C76800UCe invoke(C0ZG c0zg) {
                            C0ZG focusProperties = c0zg;
                            o.LJIIIZ(focusProperties, "focusProperties");
                            InterfaceC42261lG interfaceC42261lG2 = this.LJLIL;
                            new Object(focusProperties) { // from class: X.0ZE
                                public final C0ZG LIZ;

                                {
                                    o.LJIIIZ(focusProperties, "focusProperties");
                                    this.LIZ = focusProperties;
                                }
                            };
                            interfaceC42261lG2.J();
                            return C76800UCe.LIZ;
                        }
                    });
                    this.LJLL = c51281zo;
                    LJJI(c51281zo);
                    if (z) {
                        LJIL();
                    } else {
                        C78840Uwu.LJJIJIIJI(this).LJIILJJIL(new IDqS420S0100000(this, 8));
                    }
                }
            }
            if ((this.LJLILLLLZI & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (c1m2 instanceof InterfaceC50531yb) {
                    this.LJLJLLL = true;
                }
                C78840Uwu.LJJIIZI(this, 2).LLI();
            }
            if ((this.LJLILLLLZI & 2) != 0) {
                if (C78840Uwu.LJJIJ(this).LLI.LIZLLL.LJLJL) {
                    AbstractC538029g abstractC538029g = this.LJLJJLL;
                    o.LJI(abstractC538029g);
                    ((C55982Hq) abstractC538029g).LLIIII = this;
                    abstractC538029g.LLIIII();
                }
                C78840Uwu.LJJIIZI(this, 2).LLI();
                C78840Uwu.LJJIJ(this).LJJIIJ();
            }
            if (c1m2 instanceof InterfaceC44941pa) {
                ((InterfaceC44941pa) c1m2).LLJILJILJ(this);
            }
            if ((this.LJLILLLLZI & 128) != 0) {
                if ((c1m2 instanceof InterfaceC44921pY) && C78840Uwu.LJJIJ(this).LLI.LIZLLL.LJLJL) {
                    C78840Uwu.LJJIJ(this).LJJIIJ();
                }
                if (c1m2 instanceof InterfaceC44911pX) {
                    this.LJLLJ = null;
                    if (C78840Uwu.LJJIJ(this).LLI.LIZLLL.LJLJL) {
                        C78840Uwu.LJJIJIIJI(this).LJIILIIL(new C0DQ() { // from class: X.1DK
                            @Override // X.C0DQ
                            public final void LIZ() {
                                C45791qx c45791qx = C45791qx.this;
                                if (c45791qx.LJLLJ == null) {
                                    c45791qx.LJJIZ(C78840Uwu.LJJIIZI(c45791qx, 128));
                                }
                            }
                        });
                    }
                }
            }
            if ((this.LJLILLLLZI & 256) != 0 && (c1m2 instanceof InterfaceC44901pW) && C78840Uwu.LJJIJ(this).LLI.LIZLLL.LJLJL) {
                C78840Uwu.LJJIJ(this).LJJIIJ();
            }
            if ((this.LJLILLLLZI & 16) != 0 && (c1m2 instanceof InterfaceC44261oU)) {
                ((InterfaceC44261oU) c1m2).p().LJLIL = this.LJLJJLL;
            }
            if ((this.LJLILLLLZI & 8) != 0) {
                C78840Uwu.LJJIJIIJI(this).LJIIL();
                return;
            }
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    @Override // X.C1DQ
    public final void LJIJJ(AbstractC538029g abstractC538029g) {
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((InterfaceC44901pW) c1m2).LJIJJ(abstractC538029g);
    }

    public final void LJJI(InterfaceC39651h3<?> element) {
        o.LJIIIZ(element, "element");
        C39621h0 c39621h0 = this.LJLLI;
        if (c39621h0 != null && c39621h0.LJIIIIZZ(element.getKey())) {
            c39621h0.LIZ = element;
            C00D modifierLocalManager = C78840Uwu.LJJIJIIJI(this).getModifierLocalManager();
            C17R<?> key = element.getKey();
            modifierLocalManager.getClass();
            o.LJIIIZ(key, "key");
            modifierLocalManager.LIZJ.LIZLLL(new OSZ(this, key));
            modifierLocalManager.LIZ();
            return;
        }
        this.LJLLI = new C39621h0(element);
        if (!C78840Uwu.LJJIJ(this).LLI.LIZLLL.LJLJL) {
            return;
        }
        C00D modifierLocalManager2 = C78840Uwu.LJJIJIIJI(this).getModifierLocalManager();
        C17R<?> key2 = element.getKey();
        modifierLocalManager2.getClass();
        o.LJIIIZ(key2, "key");
        modifierLocalManager2.LIZIZ.LIZLLL(new OSZ(this, key2));
        modifierLocalManager2.LIZ();
    }

    @Override // X.C1DX
    public final void LJJIJIIJIL(long j) {
        C1M2 c1m2 = this.LJLJLJ;
        if (c1m2 instanceof InterfaceC44921pY) {
            ((InterfaceC44921pY) c1m2).LJJIJIIJIL(j);
        }
    }

    @Override // X.C1DX
    public final void LJJIZ(AbstractC538029g coordinates) {
        o.LJIIIZ(coordinates, "coordinates");
        this.LJLLJ = coordinates;
        C1M2 c1m2 = this.LJLJLJ;
        if (c1m2 instanceof InterfaceC44911pX) {
            ((InterfaceC44911pX) c1m2).LJJIZ(coordinates);
        }
    }

    @Override // X.C1DX
    public final void LJJJ(C39041g4 coordinates) {
        o.LJIIIZ(coordinates, "coordinates");
        C1M2 c1m2 = this.LJLJLJ;
        if (!(c1m2 instanceof C44841pQ)) {
            return;
        }
        c1m2.getClass();
        throw null;
    }

    @Override // X.C1DN
    public final Object LJIIL(InterfaceC23370vt interfaceC23370vt, Object obj) {
        o.LJIIIZ(interfaceC23370vt, "<this>");
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((InterfaceC44931pZ) c1m2).LJIIL(interfaceC23370vt, obj);
    }

    @Override // X.C1DO
    public final void LIZJ(C11H c11h, C11I pass, long j) {
        o.LJIIIZ(pass, "pass");
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC44261oU) c1m2).p().LJJIIZ(c11h, pass, j);
    }

    @Override // X.C1DY
    public final int LJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC44951pb) c1m2).LJI(interfaceC39181gI, interfaceC274115t, i);
    }

    @Override // X.C1DY
    public final int LJIIJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC44951pb) c1m2).LJIIJJI(interfaceC39181gI, interfaceC274115t, i);
    }

    @Override // X.C1DY
    public final InterfaceC273515n LJIILL(InterfaceC44861pS measure, InterfaceC39071g7 interfaceC39071g7, long j) {
        o.LJIIIZ(measure, "$this$measure");
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC44951pb) c1m2).LJIILL(measure, interfaceC39071g7, j);
    }

    @Override // X.C1DY
    public final int LJJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC44951pb) c1m2).LJJJI(interfaceC39181gI, interfaceC274115t, i);
    }

    @Override // X.C1DY
    public final int LJJJIL(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        C1M2 c1m2 = this.LJLJLJ;
        o.LJII(c1m2, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC44951pb) c1m2).LJJJIL(interfaceC39181gI, interfaceC274115t, i);
    }
}
