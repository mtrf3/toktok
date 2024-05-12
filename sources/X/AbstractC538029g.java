package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.29g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC538029g extends AbstractC45981rG implements InterfaceC39071g7, InterfaceC274415w, C0DU, InterfaceC88472Yns<InterfaceC11750d9, C76800UCe> {
    public static final C46001rI LLFFF = C46001rI.LJLIL;
    public static final C45991rH LLFII = C45991rH.LJLIL;
    public static final C42621lq LLFZ = new C42621lq();
    public static final C0DB LLI = new C0DB();
    public static final C1DV LLIFFJFJJ;
    public static final C1DW LLII;
    public final C29321Dc LJLJL;
    public AbstractC538029g LJLJLJ;
    public AbstractC538029g LJLJLLL;
    public boolean LJLL;
    public InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> LJLLI;
    public InterfaceC23370vt LJLLILLLL;
    public EnumC23500w6 LJLLJ;
    public float LJLLL;
    public InterfaceC273515n LJLLLL;
    public AbstractC537929f LJLLLLLL;
    public java.util.Map<AbstractC272415c, Integer> LJLZ;
    public long LJZ;
    public float LJZI;
    public C10350at LJZL;
    public C0DB LL;
    public final IDqS420S0100000 LLD;
    public boolean LLF;
    public C0DN LLFF;

    @Override // X.AbstractC45981rG
    public final InterfaceC274415w LJLJI() {
        return this;
    }

    public abstract AbstractC537929f LJLLL(C39061g6 c39061g6);

    public abstract C1M3 LLD();

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1DV] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.1DW] */
    static {
        C11520cm.LIZ();
        LLIFFJFJJ = new C0DA<C1DO>() { // from class: X.1DV
            @Override // X.C0DA
            public final boolean LIZIZ(C29321Dc parentLayoutNode) {
                o.LJIIIZ(parentLayoutNode, "parentLayoutNode");
                return true;
            }

            @Override // X.C0DA
            public final int LIZ() {
                return 16;
            }

            @Override // X.C0DA
            public final boolean LIZLLL(C1DO c1do) {
                C1DO node = c1do;
                o.LJIIIZ(node, "node");
                node.LIZ();
                return false;
            }

            @Override // X.C0DA
            public final void LIZJ(C29321Dc c29321Dc, long j, C1DU<C1DO> hitTestResult, boolean z, boolean z2) {
                o.LJIIIZ(hitTestResult, "hitTestResult");
                c29321Dc.LJJI(j, hitTestResult, z, z2);
            }
        };
        LLII = new C0DA<C1DT>() { // from class: X.1DW
            @Override // X.C0DA
            public final int LIZ() {
                return 8;
            }

            @Override // X.C0DA
            public final boolean LIZIZ(C29321Dc parentLayoutNode) {
                C1JY LIZLLL;
                o.LJIIIZ(parentLayoutNode, "parentLayoutNode");
                C1DT LJIILLIIL = C1E4.LJIILLIIL(parentLayoutNode);
                boolean z = false;
                if (LJIILLIIL != null && (LIZLLL = C78598Ut0.LIZLLL(LJIILLIIL)) != null && LIZLLL.LJLJI) {
                    z = true;
                }
                return !z;
            }

            @Override // X.C0DA
            public final boolean LIZLLL(C1DT node) {
                o.LJIIIZ(node, "node");
                return false;
            }

            @Override // X.C0DA
            public final void LIZJ(C29321Dc c29321Dc, long j, C1DU<C1DT> hitTestResult, boolean z, boolean z2) {
                o.LJIIIZ(hitTestResult, "hitTestResult");
                c29321Dc.LLI.LIZJ.LLFII(AbstractC538029g.LLII, c29321Dc.LLI.LIZJ.LJZL(j), hitTestResult, true, z2);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    @Override // X.AbstractC39201gK, X.InterfaceC274115t
    public final Object LJIIJJI() {
        C68322mC c68322mC = new C68322mC();
        C1M3 LLD = LLD();
        C29321Dc c29321Dc = this.LJLJL;
        InterfaceC23370vt interfaceC23370vt = c29321Dc.LJLLLL;
        for (C1M3 c1m3 = c29321Dc.LLI.LIZLLL; c1m3 != null; c1m3 = c1m3.LJLJJI) {
            if (c1m3 != LLD && (c1m3.LJLILLLLZI & 64) != 0 && (c1m3 instanceof C1DN)) {
                c68322mC.element = ((C1DN) c1m3).LJIIL(interfaceC23370vt, c68322mC.element);
            }
        }
        return c68322mC.element;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJI() {
        return this.LJLJL.LJLLLL.LJJJJI();
    }

    @Override // X.AbstractC45981rG
    public final boolean LJLJJI() {
        if (this.LJLLLL != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC45981rG
    public final InterfaceC273515n LJLJJLL() {
        InterfaceC273515n interfaceC273515n = this.LJLLLL;
        if (interfaceC273515n != null) {
            return interfaceC273515n;
        }
        "Asking for measurement result of unmeasured layout modifier".toString();
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // X.AbstractC45981rG
    public final void LJLL() {
        LJL(this.LJZ, this.LJZI, this.LJLLI);
    }

    public final long LL() {
        return this.LJLLILLLL.LJJLI(this.LJLJL.LJZ.LJ());
    }

    public final void LLI() {
        C0DN c0dn = this.LLFF;
        if (c0dn != null) {
            c0dn.invalidate();
            return;
        }
        AbstractC538029g abstractC538029g = this.LJLJLLL;
        if (abstractC538029g == null) {
            return;
        }
        abstractC538029g.LLI();
    }

    public final boolean LLIFFJFJJ() {
        if (this.LLFF != null && this.LJLLL <= 0.0f) {
            return true;
        }
        AbstractC538029g abstractC538029g = this.LJLJLLL;
        if (abstractC538029g != null) {
            return abstractC538029g.LLIFFJFJJ();
        }
        return false;
    }

    public void LLIIII() {
        C0DN c0dn = this.LLFF;
        if (c0dn != null) {
            c0dn.invalidate();
        }
    }

    public final void LLIIIILZ() {
        C1M3 c1m3;
        C1M3 LLF = LLF(C17J.LJJI(128));
        if (LLF != null && (LLF.LJLIL.LJLJI & 128) != 0) {
            C0OA LIZ = C0O8.LIZ();
            try {
                C0OA LJIIIIZZ = LIZ.LJIIIIZZ();
                try {
                    boolean LJJI = C17J.LJJI(128);
                    if (LJJI) {
                        c1m3 = LLD();
                    } else {
                        c1m3 = LLD().LJLJJI;
                        if (c1m3 == null) {
                            C0OA.LJIILJJIL(LJIIIIZZ);
                        }
                    }
                    for (C1M3 LLF2 = LLF(LJJI); LLF2 != null; LLF2 = LLF2.LJLJJL) {
                        if ((LLF2.LJLJI & 128) == 0) {
                            break;
                        }
                        if ((LLF2.LJLILLLLZI & 128) != 0 && (LLF2 instanceof C1DX)) {
                            ((C1DX) LLF2).LJJIJIIJIL(this.LJLJI);
                        }
                        if (LLF2 == c1m3) {
                            break;
                        }
                    }
                    C0OA.LJIILJJIL(LJIIIIZZ);
                } catch (Throwable th) {
                    C0OA.LJIILJJIL(LJIIIIZZ);
                    throw th;
                }
            } finally {
                LIZ.LIZJ();
            }
        }
    }

    public final void LLIIIJ() {
        AbstractC537929f abstractC537929f = this.LJLLLLLL;
        if (abstractC537929f != null) {
            boolean LJJI = C17J.LJJI(128);
            C1M3 LLD = LLD();
            if (LJJI || (LLD = LLD.LJLJJI) != null) {
                for (C1M3 LLF = LLF(LJJI); LLF != null && (LLF.LJLJI & 128) != 0; LLF = LLF.LJLJJL) {
                    if ((LLF.LJLILLLLZI & 128) != 0 && (LLF instanceof C1DX)) {
                        ((C1DX) LLF).LJJJ(abstractC537929f.LJLLI);
                    }
                    if (LLF == LLD) {
                        break;
                    }
                }
            }
        }
        boolean LJJI2 = C17J.LJJI(128);
        C1M3 LLD2 = LLD();
        if (LJJI2 || (LLD2 = LLD2.LJLJJI) != null) {
            for (C1M3 LLF2 = LLF(LJJI2); LLF2 != null && (LLF2.LJLJI & 128) != 0; LLF2 = LLF2.LJLJJL) {
                if ((LLF2.LJLILLLLZI & 128) != 0 && (LLF2 instanceof C1DX)) {
                    ((C1DX) LLF2).LJJIZ(this);
                }
                if (LLF2 == LLD2) {
                    return;
                }
            }
        }
    }

    public final void LLIILII() {
        C0DN c0dn = this.LLFF;
        if (c0dn != null) {
            InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns = this.LJLLI;
            if (interfaceC88472Yns != null) {
                C42621lq c42621lq = LLFZ;
                c42621lq.LJLIL = 1.0f;
                c42621lq.LJLILLLLZI = 1.0f;
                c42621lq.LJLJI = 1.0f;
                c42621lq.LJLJJI = 0.0f;
                c42621lq.LJLJJL = 0.0f;
                c42621lq.LJLJJLL = 0.0f;
                long j = C12010dZ.LIZ;
                c42621lq.LJLJL = j;
                c42621lq.LJLJLJ = j;
                c42621lq.LJLJLLL = 0.0f;
                c42621lq.LJLL = 0.0f;
                c42621lq.LJLLI = 0.0f;
                c42621lq.LJLLILLLL = 8.0f;
                c42621lq.LJLLJ = C12000dY.LIZIZ;
                c42621lq.LJLLL = C11710d5.LIZ;
                c42621lq.LJLLLL = false;
                InterfaceC23370vt interfaceC23370vt = this.LJLJL.LJLLLL;
                o.LJIIIZ(interfaceC23370vt, "<set-?>");
                c42621lq.LJLLLLLL = interfaceC23370vt;
                C1DF.LJJIJIIJI(this.LJLJL).getSnapshotObserver().LIZ(this, LLFFF, new IDqS420S0100000(interfaceC88472Yns, (InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe>) 12));
                C0DB c0db = this.LL;
                if (c0db == null) {
                    c0db = new C0DB();
                    this.LL = c0db;
                }
                float f = c42621lq.LJLIL;
                c0db.LIZ = f;
                float f2 = c42621lq.LJLILLLLZI;
                c0db.LIZIZ = f2;
                float f3 = c42621lq.LJLJJI;
                c0db.LIZJ = f3;
                float f4 = c42621lq.LJLJJL;
                c0db.LIZLLL = f4;
                float f5 = c42621lq.LJLJLLL;
                c0db.LJ = f5;
                float f6 = c42621lq.LJLL;
                c0db.LJFF = f6;
                float f7 = c42621lq.LJLLI;
                c0db.LJI = f7;
                float f8 = c42621lq.LJLLILLLL;
                c0db.LJII = f8;
                long j2 = c42621lq.LJLLJ;
                c0db.LJIIIIZZ = j2;
                float f9 = c42621lq.LJLJI;
                float f10 = c42621lq.LJLJJLL;
                long j3 = c42621lq.LJLJL;
                long j4 = c42621lq.LJLJLJ;
                InterfaceC11790dD interfaceC11790dD = c42621lq.LJLLL;
                boolean z = c42621lq.LJLLLL;
                C29321Dc c29321Dc = this.LJLJL;
                c0dn.LIZ(f, f2, f9, f3, f4, f10, f5, f6, f7, f8, j2, interfaceC11790dD, z, j3, j4, c29321Dc.LJLZ, c29321Dc.LJLLLL);
                this.LJLL = c42621lq.LJLLLL;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (this.LJLLI != null) {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.LJLLL = LLFZ.LJLJI;
        C29321Dc c29321Dc2 = this.LJLJL;
        C0DR c0dr = c29321Dc2.LJLJLJ;
        if (c0dr != null) {
            c0dr.LJIIJ(c29321Dc2);
        }
    }

    @Override // X.InterfaceC23370vt
    public final float getDensity() {
        return this.LJLJL.LJLLLL.getDensity();
    }

    @Override // X.InterfaceC39181gI
    public final EnumC23500w6 getLayoutDirection() {
        return this.LJLJL.LJLZ;
    }

    @Override // X.C0DU
    public final boolean isValid() {
        if (this.LLFF != null && LIZLLL()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC274415w
    public final boolean LIZLLL() {
        return LLD().LJLJL;
    }

    @Override // X.InterfaceC274415w
    public final AbstractC538029g LJIILIIL() {
        if (LIZLLL()) {
            return this.LJLJL.LLI.LIZJ.LJLJLLL;
        }
        "LayoutCoordinate operations are only valid when isAttached is true".toString();
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
    }

    @Override // X.InterfaceC274415w
    public final long LIZ() {
        return this.LJLJI;
    }

    @Override // X.AbstractC45981rG
    public final AbstractC45981rG LJLILLLLZI() {
        return this.LJLJLJ;
    }

    @Override // X.AbstractC45981rG
    public final C29321Dc LJLJJL() {
        return this.LJLJL;
    }

    @Override // X.AbstractC45981rG
    public final AbstractC45981rG LJLJL() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC45981rG
    public final long LJLJLJ() {
        return this.LJZ;
    }

    public AbstractC538029g(C29321Dc layoutNode) {
        o.LJIIIZ(layoutNode, "layoutNode");
        this.LJLJL = layoutNode;
        this.LJLLILLLL = layoutNode.LJLLLL;
        this.LJLLJ = layoutNode.LJLZ;
        this.LJLLL = 0.8f;
        this.LJZ = C23450w1.LIZIZ;
        this.LLD = new IDqS420S0100000(this, 11);
    }

    @Override // X.InterfaceC274415w
    public final long LJIILL(long j) {
        if (LIZLLL()) {
            AbstractC538029g abstractC538029g = this;
            do {
                j = abstractC538029g.LLIIL(j);
                abstractC538029g = abstractC538029g.LJLJLLL;
            } while (abstractC538029g != null);
            return j;
        }
        "LayoutCoordinate operations are only valid when isAttached is true".toString();
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
    }

    @Override // X.InterfaceC274415w
    public final long LJIJJ(long j) {
        if (LIZLLL()) {
            InterfaceC274415w LJJIL = C78977Uz7.LJJIL(this);
            return LJIIL(LJJIL, C10370av.LJFF(C1DF.LJJIJIIJI(this.LJLJL).LIZLLL(j), C78977Uz7.LJJJZ(LJJIL)));
        }
        "LayoutCoordinate operations are only valid when isAttached is true".toString();
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
    }

    @Override // X.InterfaceC274415w
    public final long LJJJJLL(long j) {
        return C1DF.LJJIJIIJI(this.LJLJL).LJII(LJIILL(j));
    }

    public final long LJLLJ(long j) {
        return C1DF.LIZIZ(Math.max(0.0f, (C10430b1.LIZLLL(j) - LJJZZIII()) / 2.0f), Math.max(0.0f, (C10430b1.LIZIZ(j) - LJJZZI()) / 2.0f));
    }

    public final void LJLLLLLL(InterfaceC11750d9 canvas) {
        o.LJIIIZ(canvas, "canvas");
        C0DN c0dn = this.LLFF;
        if (c0dn != null) {
            c0dn.LJFF(canvas);
            return;
        }
        long j = this.LJZ;
        float f = (int) (j >> 32);
        float LIZJ = C23450w1.LIZJ(j);
        canvas.LJIILLIIL(f, LIZJ);
        LJZ(canvas);
        canvas.LJIILLIIL(-f, -LIZJ);
    }

    public final void LJZ(InterfaceC11750d9 interfaceC11750d9) {
        boolean LJJI = C17J.LJJI(4);
        C1M3 LLD = LLD();
        Object obj = null;
        if (LJJI || (LLD = LLD.LJLJJI) != null) {
            C1M3 LLF = LLF(LJJI);
            while (true) {
                if (LLF != null && (LLF.LJLJI & 4) != 0) {
                    if ((LLF.LJLILLLLZI & 4) != 0) {
                        if (LLF instanceof C1DP) {
                            obj = LLF;
                        }
                        C1DP c1dp = (C1DP) obj;
                        if (c1dp != null) {
                            C29321Dc c29321Dc = this.LJLJL;
                            c29321Dc.getClass();
                            C1DF.LJJIJIIJI(c29321Dc).getSharedDrawScope().LIZLLL(interfaceC11750d9, C78996UzQ.LJJJJIZL(this.LJLJI), this, c1dp);
                            return;
                        }
                    } else if (LLF == LLD) {
                        break;
                    } else {
                        LLF = LLF.LJLJJL;
                    }
                } else {
                    break;
                }
            }
        }
        LLIIIL(interfaceC11750d9);
    }

    public final AbstractC538029g LJZI(AbstractC538029g abstractC538029g) {
        C29321Dc c29321Dc = abstractC538029g.LJLJL;
        C29321Dc c29321Dc2 = this.LJLJL;
        if (c29321Dc == c29321Dc2) {
            C1M3 LLD = abstractC538029g.LLD();
            C1M3 c1m3 = LLD().LJLIL;
            if (c1m3.LJLJL) {
                for (C1M3 c1m32 = c1m3.LJLJJI; c1m32 != null; c1m32 = c1m32.LJLJJI) {
                    if ((c1m32.LJLILLLLZI & 2) != 0 && c1m32 == LLD) {
                        return abstractC538029g;
                    }
                }
                return this;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }
        while (c29321Dc.LJLJLLL > c29321Dc2.LJLJLLL) {
            c29321Dc = c29321Dc.LJIJJLI();
            o.LJI(c29321Dc);
        }
        while (c29321Dc2.LJLJLLL > c29321Dc.LJLJLLL) {
            c29321Dc2 = c29321Dc2.LJIJJLI();
            o.LJI(c29321Dc2);
        }
        while (c29321Dc != c29321Dc2) {
            c29321Dc = c29321Dc.LJIJJLI();
            c29321Dc2 = c29321Dc2.LJIJJLI();
            if (c29321Dc == null || c29321Dc2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (c29321Dc2 == this.LJLJL) {
            return this;
        }
        if (c29321Dc == abstractC538029g.LJLJL) {
            return abstractC538029g;
        }
        return c29321Dc.LLI.LIZIZ;
    }

    public final long LJZL(long j) {
        long j2 = this.LJZ;
        long LIZ = C78923UyF.LIZ(C10370av.LIZLLL(j) - ((int) (j2 >> 32)), C10370av.LJ(j) - C23450w1.LIZJ(j2));
        C0DN c0dn = this.LLFF;
        if (c0dn != null) {
            return c0dn.LIZJ(LIZ, true);
        }
        return LIZ;
    }

    public final C1M3 LLF(boolean z) {
        C1M3 LLD;
        C0D4 c0d4 = this.LJLJL.LLI;
        if (c0d4.LIZJ == this) {
            return c0d4.LJ;
        }
        if (z) {
            AbstractC538029g abstractC538029g = this.LJLJLLL;
            if (abstractC538029g == null || (LLD = abstractC538029g.LLD()) == null) {
                return null;
            }
            return LLD.LJLJJL;
        }
        AbstractC538029g abstractC538029g2 = this.LJLJLLL;
        if (abstractC538029g2 == null) {
            return null;
        }
        return abstractC538029g2.LLD();
    }

    public final void LLII(InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns) {
        boolean z;
        C29321Dc c29321Dc;
        C0DR c0dr;
        if (this.LJLLI != interfaceC88472Yns || !o.LJ(this.LJLLILLLL, this.LJLJL.LJLLLL) || this.LJLLJ != this.LJLJL.LJLZ) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLI = interfaceC88472Yns;
        C29321Dc c29321Dc2 = this.LJLJL;
        this.LJLLILLLL = c29321Dc2.LJLLLL;
        this.LJLLJ = c29321Dc2.LJLZ;
        if (LIZLLL() && interfaceC88472Yns != null) {
            if (this.LLFF == null) {
                C0DN LJIIZILJ = C1DF.LJJIJIIJI(this.LJLJL).LJIIZILJ(this.LLD, this);
                LJIIZILJ.LJIIIIZZ(this.LJLJI);
                LJIIZILJ.LJI(this.LJZ);
                this.LLFF = LJIIZILJ;
                LLIILII();
                this.LJLJL.LLIIIJ = true;
                this.LLD.invoke();
                return;
            }
            if (!z) {
                return;
            }
            LLIILII();
            return;
        }
        C0DN c0dn = this.LLFF;
        if (c0dn != null) {
            c0dn.destroy();
            this.LJLJL.LLIIIJ = true;
            this.LLD.invoke();
            if (LIZLLL() && (c0dr = (c29321Dc = this.LJLJL).LJLJLJ) != null) {
                c0dr.LJIIJ(c29321Dc);
            }
        }
        this.LLFF = null;
        this.LLF = false;
    }

    public void LLIIIL(InterfaceC11750d9 canvas) {
        o.LJIIIZ(canvas, "canvas");
        AbstractC538029g abstractC538029g = this.LJLJLJ;
        if (abstractC538029g != null) {
            abstractC538029g.LJLLLLLL(canvas);
        }
    }

    public final void LLIIJI(InterfaceC273515n value) {
        o.LJIIIZ(value, "value");
        InterfaceC273515n interfaceC273515n = this.LJLLLL;
        if (value != interfaceC273515n) {
            this.LJLLLL = value;
            if (interfaceC273515n == null || value.getWidth() != interfaceC273515n.getWidth() || value.getHeight() != interfaceC273515n.getHeight()) {
                int width = value.getWidth();
                int height = value.getHeight();
                C0DN c0dn = this.LLFF;
                if (c0dn != null) {
                    c0dn.LJIIIIZZ(C78996UzQ.LIZIZ(width, height));
                } else {
                    AbstractC538029g abstractC538029g = this.LJLJLLL;
                    if (abstractC538029g != null) {
                        abstractC538029g.LLI();
                    }
                }
                C29321Dc c29321Dc = this.LJLJL;
                C0DR c0dr = c29321Dc.LJLJLJ;
                if (c0dr != null) {
                    c0dr.LJIIJ(c29321Dc);
                }
                LJLIIIL(C78996UzQ.LIZIZ(width, height));
                boolean LJJI = C17J.LJJI(4);
                C1M3 LLD = LLD();
                if (LJJI || (LLD = LLD.LJLJJI) != null) {
                    for (C1M3 LLF = LLF(LJJI); LLF != null && (LLF.LJLJI & 4) != 0; LLF = LLF.LJLJJL) {
                        if ((LLF.LJLILLLLZI & 4) != 0 && (LLF instanceof C1DP)) {
                            ((C1DP) LLF).LJIILJJIL();
                        }
                        if (LLF == LLD) {
                            break;
                        }
                    }
                }
            }
            java.util.Map<AbstractC272415c, Integer> map = this.LJLZ;
            if (((map != null && !map.isEmpty()) || (!value.LJI().isEmpty())) && !o.LJ(value.LJI(), this.LJLZ)) {
                LJI();
                java.util.Map map2 = this.LJLZ;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.LJLZ = map2;
                }
                map2.clear();
                map2.putAll(value.LJI());
            }
        }
    }

    public final long LLIIL(long j) {
        C0DN c0dn = this.LLFF;
        if (c0dn != null) {
            j = c0dn.LIZJ(j, false);
        }
        long j2 = this.LJZ;
        return C78923UyF.LIZ(C10370av.LIZLLL(j) + ((int) (j2 >> 32)), C10370av.LJ(j) + C23450w1.LIZJ(j2));
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC11750d9 interfaceC11750d9) {
        InterfaceC11750d9 canvas = interfaceC11750d9;
        o.LJIIIZ(canvas, "canvas");
        C29321Dc c29321Dc = this.LJLJL;
        if (c29321Dc.LJZI) {
            C1DF.LJJIJIIJI(c29321Dc).getSnapshotObserver().LIZ(this, LLFII, new IDqS176S0200000(this, canvas, 19));
            this.LLF = false;
        } else {
            this.LLF = true;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC274415w
    public final C10390ax LJIIJ(InterfaceC274415w sourceCoordinates, boolean z) {
        AbstractC538029g abstractC538029g;
        C39041g4 c39041g4;
        o.LJIIIZ(sourceCoordinates, "sourceCoordinates");
        if (LIZLLL()) {
            if (sourceCoordinates.LIZLLL()) {
                if (!(sourceCoordinates instanceof C39041g4) || (c39041g4 = (C39041g4) sourceCoordinates) == null || (abstractC538029g = c39041g4.LJLIL.LJLJL) == null) {
                    abstractC538029g = (AbstractC538029g) sourceCoordinates;
                }
                AbstractC538029g LJZI = LJZI(abstractC538029g);
                C10350at c10350at = this.LJZL;
                if (c10350at == null) {
                    c10350at = new C10350at();
                    this.LJZL = c10350at;
                }
                c10350at.LIZ = 0.0f;
                c10350at.LIZIZ = 0.0f;
                c10350at.LIZJ = (int) (sourceCoordinates.LIZ() >> 32);
                c10350at.LIZLLL = C23490w5.LIZIZ(sourceCoordinates.LIZ());
                while (abstractC538029g != LJZI) {
                    abstractC538029g.LLIIIZ(c10350at, z, false);
                    if (c10350at.LIZIZ()) {
                        return C10390ax.LJ;
                    }
                    abstractC538029g = abstractC538029g.LJLJLLL;
                    o.LJI(abstractC538029g);
                }
                LJLLI(LJZI, c10350at, z);
                return new C10390ax(c10350at.LIZ, c10350at.LIZIZ, c10350at.LIZJ, c10350at.LIZLLL);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LayoutCoordinates ");
            LIZ.append(sourceCoordinates);
            LIZ.append(" is not attached!");
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            throw new IllegalStateException(LIZIZ);
        }
        "LayoutCoordinate operations are only valid when isAttached is true".toString();
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
    }

    @Override // X.InterfaceC274415w
    public final long LJIIL(InterfaceC274415w sourceCoordinates, long j) {
        AbstractC538029g abstractC538029g;
        C39041g4 c39041g4;
        o.LJIIIZ(sourceCoordinates, "sourceCoordinates");
        if (!(sourceCoordinates instanceof C39041g4) || (c39041g4 = (C39041g4) sourceCoordinates) == null || (abstractC538029g = c39041g4.LJLIL.LJLJL) == null) {
            abstractC538029g = (AbstractC538029g) sourceCoordinates;
        }
        AbstractC538029g LJZI = LJZI(abstractC538029g);
        while (abstractC538029g != LJZI) {
            j = abstractC538029g.LLIIL(j);
            abstractC538029g = abstractC538029g.LJLJLLL;
            o.LJI(abstractC538029g);
        }
        return LJLLILLLL(LJZI, j);
    }

    public final long LJLLILLLL(AbstractC538029g abstractC538029g, long j) {
        if (abstractC538029g == this) {
            return j;
        }
        AbstractC538029g abstractC538029g2 = this.LJLJLLL;
        if (abstractC538029g2 == null || o.LJ(abstractC538029g, abstractC538029g2)) {
            return LJZL(j);
        }
        return LJZL(abstractC538029g2.LJLLILLLL(abstractC538029g, j));
    }

    public final float LJLLLL(long j, long j2) {
        float LJJZZIII;
        float LJJZZI;
        if (LJJZZIII() >= C10430b1.LIZLLL(j2) && LJJZZI() >= C10430b1.LIZIZ(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long LJLLJ = LJLLJ(j2);
        float LIZLLL = C10430b1.LIZLLL(LJLLJ);
        float LIZIZ = C10430b1.LIZIZ(LJLLJ);
        float LIZLLL2 = C10370av.LIZLLL(j);
        if (LIZLLL2 < 0.0f) {
            LJJZZIII = -LIZLLL2;
        } else {
            LJJZZIII = LIZLLL2 - LJJZZIII();
        }
        float max = Math.max(0.0f, LJJZZIII);
        float LJ = C10370av.LJ(j);
        if (LJ < 0.0f) {
            LJJZZI = -LJ;
        } else {
            LJJZZI = LJ - LJJZZI();
        }
        long LIZ = C78923UyF.LIZ(max, Math.max(0.0f, LJJZZI));
        if ((LIZLLL <= 0.0f && LIZIZ <= 0.0f) || C10370av.LIZLLL(LIZ) > LIZLLL || C10370av.LJ(LIZ) > LIZIZ) {
            return Float.POSITIVE_INFINITY;
        }
        return (C10370av.LJ(LIZ) * C10370av.LJ(LIZ)) + (C10370av.LIZLLL(LIZ) * C10370av.LIZLLL(LIZ));
    }

    public final void LJLZ(InterfaceC11750d9 canvas, C1QW paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        long j = this.LJLJI;
        canvas.LJI(new C10390ax(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, C23490w5.LIZIZ(j) - 0.5f), paint);
    }

    @Override // X.AbstractC39201gK
    public void LJL(long j, float f, InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns) {
        LLII(interfaceC88472Yns);
        if (!C23450w1.LIZIZ(this.LJZ, j)) {
            this.LJZ = j;
            this.LJLJL.LLIFFJFJJ.LJIIJ.LJLIL();
            C0DN c0dn = this.LLFF;
            if (c0dn != null) {
                c0dn.LJI(j);
            } else {
                AbstractC538029g abstractC538029g = this.LJLJLLL;
                if (abstractC538029g != null) {
                    abstractC538029g.LLI();
                }
            }
            AbstractC45981rG.LJLJLLL(this);
            C29321Dc c29321Dc = this.LJLJL;
            C0DR c0dr = c29321Dc.LJLJLJ;
            if (c0dr != null) {
                c0dr.LJIIJ(c29321Dc);
            }
        }
        this.LJZI = f;
    }

    public final void LJLLI(AbstractC538029g abstractC538029g, C10350at c10350at, boolean z) {
        if (abstractC538029g == this) {
            return;
        }
        AbstractC538029g abstractC538029g2 = this.LJLJLLL;
        if (abstractC538029g2 != null) {
            abstractC538029g2.LJLLI(abstractC538029g, c10350at, z);
        }
        long j = this.LJZ;
        float f = (int) (j >> 32);
        c10350at.LIZ -= f;
        c10350at.LIZJ -= f;
        float LIZJ = C23450w1.LIZJ(j);
        c10350at.LIZIZ -= LIZJ;
        c10350at.LIZLLL -= LIZJ;
        C0DN c0dn = this.LLFF;
        if (c0dn != null) {
            c0dn.LIZIZ(c10350at, true);
            if (this.LJLL && z) {
                long j2 = this.LJLJI;
                c10350at.LIZ(0.0f, 0.0f, (int) (j2 >> 32), C23490w5.LIZIZ(j2));
            }
        }
    }

    public final void LLIIIZ(C10350at c10350at, boolean z, boolean z2) {
        C0DN c0dn = this.LLFF;
        if (c0dn != null) {
            if (this.LJLL) {
                if (z2) {
                    long LL = LL();
                    float LIZLLL = C10430b1.LIZLLL(LL) / 2.0f;
                    float LIZIZ = C10430b1.LIZIZ(LL) / 2.0f;
                    long j = this.LJLJI;
                    c10350at.LIZ(-LIZLLL, -LIZIZ, ((int) (j >> 32)) + LIZLLL, C23490w5.LIZIZ(j) + LIZIZ);
                } else if (z) {
                    long j2 = this.LJLJI;
                    c10350at.LIZ(0.0f, 0.0f, (int) (j2 >> 32), C23490w5.LIZIZ(j2));
                }
                if (c10350at.LIZIZ()) {
                    return;
                }
            }
            c0dn.LIZIZ(c10350at, false);
        }
        long j3 = this.LJZ;
        float f = (int) (j3 >> 32);
        c10350at.LIZ += f;
        c10350at.LIZJ += f;
        float LIZJ = C23450w1.LIZJ(j3);
        c10350at.LIZIZ += LIZJ;
        c10350at.LIZLLL += LIZJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f1, code lost:
    
        if (X.C47261Igj.LJIIL(r26.LIZJ(), X.C78857UxB.LJIIIIZZ(r4, r28)) > 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends X.InterfaceC03740Cs> void LLFII(X.C0DA<T> r23, long r24, X.C1DU<T> r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC538029g.LLFII(X.0DA, long, X.1DU, boolean, boolean):void");
    }

    public <T extends InterfaceC03740Cs> void LLFZ(C0DA<T> hitTestSource, long j, C1DU<T> hitTestResult, boolean z, boolean z2) {
        o.LJIIIZ(hitTestSource, "hitTestSource");
        o.LJIIIZ(hitTestResult, "hitTestResult");
        AbstractC538029g abstractC538029g = this.LJLJLJ;
        if (abstractC538029g != null) {
            abstractC538029g.LLFII(hitTestSource, abstractC538029g.LJZL(j), hitTestResult, z, z2);
        }
    }

    public final <T extends InterfaceC03740Cs> void LLFF(T t, C0DA<T> c0da, long j, C1DU<T> c1du, boolean z, boolean z2) {
        if (t == null) {
            LLFZ(c0da, j, c1du, z, z2);
            return;
        }
        C46011rJ c46011rJ = new C46011rJ(this, t, c0da, j, c1du, z, z2);
        c1du.getClass();
        c1du.LJII(t, -1.0f, z2, c46011rJ);
    }

    public final <T extends InterfaceC03740Cs> void LLFFF(T t, C0DA<T> c0da, long j, C1DU<T> c1du, boolean z, boolean z2, float f) {
        if (t == null) {
            LLFZ(c0da, j, c1du, z, z2);
        } else {
            c1du.LJII(t, f, z2, new C46021rK(this, t, c0da, j, c1du, z, z2, f));
        }
    }

    public final <T extends InterfaceC03740Cs> void LLIIJLIL(T t, C0DA<T> c0da, long j, C1DU<T> c1du, boolean z, boolean z2, float f) {
        if (t == null) {
            LLFZ(c0da, j, c1du, z, z2);
            return;
        }
        if (c0da.LIZLLL(t)) {
            C46031rL c46031rL = new C46031rL(this, t, c0da, j, c1du, z, z2, f);
            c1du.getClass();
            if (c1du.LJLJI == C47261Igj.LJJI(c1du)) {
                c1du.LJII(t, f, z2, c46031rL);
                if (c1du.LJLJI + 1 != C47261Igj.LJJI(c1du)) {
                    return;
                }
                c1du.LJIIIIZZ();
                return;
            }
            long LIZJ = c1du.LIZJ();
            int i = c1du.LJLJI;
            c1du.LJLJI = C47261Igj.LJJI(c1du);
            c1du.LJII(t, f, z2, c46031rL);
            if (c1du.LJLJI + 1 < C47261Igj.LJJI(c1du) && C47261Igj.LJIIL(LIZJ, c1du.LIZJ()) > 0) {
                int i2 = c1du.LJLJI + 1;
                int i3 = i + 1;
                Object[] objArr = c1du.LJLIL;
                C61898ORa.LJIIZILJ(i3, i2, c1du.LJLJJI, objArr, objArr);
                long[] jArr = c1du.LJLILLLLZI;
                int i4 = c1du.LJLJJI;
                o.LJIIIZ(jArr, "<this>");
                System.arraycopy(jArr, i2, jArr, i3, i4 - i2);
                c1du.LJLJI = ((c1du.LJLJJI + i) - c1du.LJLJI) - 1;
            }
            c1du.LJIIIIZZ();
            c1du.LJLJI = i;
            return;
        }
        LLIIJLIL(C78540Us4.LIZJ(t, c0da.LIZ()), c0da, j, c1du, z, z2, f);
    }
}
