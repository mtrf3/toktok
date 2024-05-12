package X;

import android.os.Trace;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.IDqS32S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.1rT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46111rT extends AbstractC39201gK implements InterfaceC39071g7, InterfaceC40441iK {
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> LJLJLLL;
    public float LJLL;
    public Object LJLLI;
    public final /* synthetic */ C0DV LJLLLL;
    public long LJLJLJ = C23450w1.LIZIZ;
    public final C29331Dd LJLLILLLL = new AbstractC03700Co(this) { // from class: X.1Dd
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(this);
            o.LJIIIZ(this, "alignmentLinesOwner");
        }

        @Override // X.AbstractC03700Co
        public final java.util.Map<AbstractC272415c, Integer> LIZJ(AbstractC538029g abstractC538029g) {
            o.LJIIIZ(abstractC538029g, "<this>");
            return abstractC538029g.LJLJJLL().LJI();
        }

        @Override // X.AbstractC03700Co
        public final long LIZIZ(AbstractC538029g calculatePositionInParent, long j) {
            o.LJIIIZ(calculatePositionInParent, "$this$calculatePositionInParent");
            return calculatePositionInParent.LLIIL(j);
        }

        @Override // X.AbstractC03700Co
        public final int LIZLLL(AbstractC538029g abstractC538029g, AbstractC272415c alignmentLine) {
            o.LJIIIZ(alignmentLine, "alignmentLine");
            return abstractC538029g.LJJJJ(alignmentLine);
        }
    };
    public final C25710zf<InterfaceC39071g7> LJLLJ = new C25710zf<>(new InterfaceC39071g7[16]);
    public boolean LJLLL = true;

    @Override // X.InterfaceC40441iK
    public final void LJJIJIIJIL() {
        C25710zf<C29321Dc> LJJ;
        int i;
        LJIIIIZZ();
        C0DV c0dv = this.LJLLLL;
        if (c0dv.LIZLLL && (i = (LJJ = c0dv.LIZ.LJJ()).LJLJI) > 0) {
            C29321Dc[] c29321DcArr = LJJ.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                C29321Dc c29321Dc = c29321DcArr[i2];
                C0DV c0dv2 = c29321Dc.LLIFFJFJJ;
                if (c0dv2.LIZJ && c29321Dc.LLF == C0DL.InMeasureBlock) {
                    C46111rT c46111rT = c0dv2.LJIIJ;
                    if (c46111rT.LJLJJL) {
                        C23360vs c23360vs = new C23360vs(c46111rT.LJLJJI);
                        if (c29321Dc.LLFFF == C0DL.NotUsed) {
                            c29321Dc.LJIIIZ();
                        }
                        if (c29321Dc.LLIFFJFJJ.LJIIJ.LJLJJI(c23360vs.LIZ)) {
                            c0dv.LIZ.LJJJJJ(false);
                        }
                    }
                }
                i2++;
            } while (i2 < i);
        }
        if (this.LJLLLL.LJ || (!this.LJLJL && !LJJIZ().LJLJJLL && this.LJLLLL.LIZLLL)) {
            C0DV c0dv3 = this.LJLLLL;
            c0dv3.LIZLLL = false;
            C0DK c0dk = c0dv3.LIZIZ;
            c0dv3.LIZIZ = C0DK.LayingOut;
            C29321Dc c29321Dc2 = c0dv3.LIZ;
            C03750Ct snapshotObserver = C1DF.LJJIJIIJI(c29321Dc2).getSnapshotObserver();
            IDqS32S0300000 iDqS32S0300000 = new IDqS32S0300000(c0dv3, this, c29321Dc2, 3);
            snapshotObserver.getClass();
            snapshotObserver.LIZ(c29321Dc2, snapshotObserver.LIZLLL, iDqS32S0300000);
            this.LJLLLL.LIZIZ = c0dk;
            if (LJJIZ().LJLJJLL && this.LJLLLL.LJIIIIZZ) {
                requestLayout();
            }
            this.LJLLLL.LJ = false;
        }
        C29331Dd c29331Dd = this.LJLLILLLL;
        if (c29331Dd.LIZLLL) {
            c29331Dd.LJ = true;
        }
        if (c29331Dd.LIZIZ && c29331Dd.LJFF()) {
            LJII();
        }
    }

    @Override // X.InterfaceC40441iK
    public final boolean LJJIJIL() {
        return this.LJLLLL.LIZ.LJZI;
    }

    @Override // X.InterfaceC40441iK
    public final C55952Hn LJJIZ() {
        return this.LJLLLL.LIZ.LLI.LIZIZ;
    }

    @Override // X.InterfaceC40441iK
    public final void LJJLIIIJ() {
        this.LJLLLL.LIZ.LJJJJJ(false);
    }

    @Override // X.InterfaceC40441iK
    public final InterfaceC40441iK LJJLIIIJJIZ() {
        C0DV c0dv;
        C29321Dc LJIJJLI = this.LJLLLL.LIZ.LJIJJLI();
        if (LJIJJLI != null && (c0dv = LJIJJLI.LLIFFJFJJ) != null) {
            return c0dv.LJIIJ;
        }
        return null;
    }

    @Override // X.AbstractC39201gK
    public final int LJJZZI() {
        return this.LJLLLL.LIZJ().LJJZZI();
    }

    @Override // X.AbstractC39201gK
    public final int LJJZZIII() {
        return this.LJLLLL.LIZJ().LJJZZIII();
    }

    public final void LJLIL() {
        C0DV c0dv = this.LJLLLL;
        if (c0dv.LJIIIZ > 0) {
            List<C29321Dc> LJIJI = c0dv.LIZ.LJIJI();
            int size = LJIJI.size();
            for (int i = 0; i < size; i++) {
                C29321Dc c29321Dc = (C29321Dc) ListProtector.get(LJIJI, i);
                C0DV c0dv2 = c29321Dc.LLIFFJFJJ;
                if (c0dv2.LJIIIIZZ && !c0dv2.LIZLLL) {
                    c29321Dc.LJJJJIZL(false);
                }
                c0dv2.LJIIJ.LJLIL();
            }
        }
    }

    public final void LJLILLLLZI() {
        C0DL c0dl;
        this.LJLLLL.LIZ.LJJJJJ(false);
        C29321Dc LJIJJLI = this.LJLLLL.LIZ.LJIJJLI();
        if (LJIJJLI != null) {
            C29321Dc c29321Dc = this.LJLLLL.LIZ;
            if (c29321Dc.LLFFF == C0DL.NotUsed) {
                int i = C0DT.LIZ[LJIJJLI.LLIFFJFJJ.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        c0dl = LJIJJLI.LLFFF;
                    } else {
                        c0dl = C0DL.InLayoutBlock;
                    }
                } else {
                    c0dl = C0DL.InMeasureBlock;
                }
                o.LJIIIZ(c0dl, "<set-?>");
                c29321Dc.LLFFF = c0dl;
            }
        }
    }

    @Override // X.InterfaceC40441iK
    public final void requestLayout() {
        this.LJLLLL.LIZ.LJJJJIZL(false);
    }

    @Override // X.InterfaceC40441iK
    public final AbstractC03700Co LJI() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC39201gK, X.InterfaceC274115t
    public final Object LJIIJJI() {
        return this.LJLLI;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1Dd] */
    public C46111rT(C0DV c0dv) {
        this.LJLLLL = c0dv;
    }

    @Override // X.InterfaceC40441iK
    public final void LJJIIZ(InterfaceC88472Yns<? super InterfaceC40441iK, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        List<C29321Dc> LJIJI = this.LJLLLL.LIZ.LJIJI();
        int size = LJIJI.size();
        for (int i = 0; i < size; i++) {
            block.invoke(((C29321Dc) ListProtector.get(LJIJI, i)).LLIFFJFJJ.LJIIJ);
        }
    }

    @Override // X.InterfaceC274115t
    public final int LJJJI(int i) {
        LJLILLLLZI();
        return this.LJLLLL.LIZJ().LJJJI(i);
    }

    @Override // X.InterfaceC39071g7
    public final AbstractC39201gK LJJJIL(long j) {
        C0DL c0dl;
        C29321Dc c29321Dc = this.LJLLLL.LIZ;
        C0DL c0dl2 = c29321Dc.LLFFF;
        C0DL c0dl3 = C0DL.NotUsed;
        if (c0dl2 == c0dl3) {
            c29321Dc.LJIIIZ();
        }
        if (C0DV.LIZLLL(this.LJLLLL.LIZ)) {
            this.LJLJJL = true;
            LJLIIL(j);
            C29321Dc c29321Dc2 = this.LJLLLL.LIZ;
            c29321Dc2.getClass();
            o.LJIIIZ(c0dl3, "<set-?>");
            c29321Dc2.LLFF = c0dl3;
            C46081rQ c46081rQ = this.LJLLLL.LJIIJJI;
            o.LJI(c46081rQ);
            c46081rQ.LJJJIL(j);
        }
        C29321Dc c29321Dc3 = this.LJLLLL.LIZ;
        C29321Dc LJIJJLI = c29321Dc3.LJIJJLI();
        if (LJIJJLI != null) {
            if (c29321Dc3.LLF == c0dl3 || c29321Dc3.LLFZ) {
                int i = C0DT.LIZ[LJIJJLI.LLIFFJFJJ.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        c0dl = C0DL.InLayoutBlock;
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                        LIZ.append(LJIJJLI.LLIFFJFJJ.LIZIZ);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ));
                    }
                } else {
                    c0dl = C0DL.InMeasureBlock;
                }
                o.LJIIIZ(c0dl, "<set-?>");
                c29321Dc3.LLF = c0dl;
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("measure() may not be called multiple times on the same Measurable. Current state ");
                LIZ2.append(c29321Dc3.LLF);
                LIZ2.append(". Parent state ");
                LIZ2.append(LJIJJLI.LLIFFJFJJ.LIZIZ);
                LIZ2.append('.');
                String LIZIZ = X1D.LIZIZ(LIZ2);
                LIZIZ.toString();
                throw new IllegalStateException(LIZIZ);
            }
        } else {
            o.LJIIIZ(c0dl3, "<set-?>");
            c29321Dc3.LLF = c0dl3;
        }
        LJLJJI(j);
        return this;
    }

    @Override // X.InterfaceC273715p
    public final int LJJJJ(AbstractC272415c alignmentLine) {
        C0DK c0dk;
        o.LJIIIZ(alignmentLine, "alignmentLine");
        C29321Dc LJIJJLI = this.LJLLLL.LIZ.LJIJJLI();
        C0DK c0dk2 = null;
        if (LJIJJLI != null) {
            c0dk = LJIJJLI.LLIFFJFJJ.LIZIZ;
        } else {
            c0dk = null;
        }
        if (c0dk == C0DK.Measuring) {
            this.LJLLILLLL.LIZJ = true;
        } else {
            C29321Dc LJIJJLI2 = this.LJLLLL.LIZ.LJIJJLI();
            if (LJIJJLI2 != null) {
                c0dk2 = LJIJJLI2.LLIFFJFJJ.LIZIZ;
            }
            if (c0dk2 == C0DK.LayingOut) {
                this.LJLLILLLL.LIZLLL = true;
            }
        }
        this.LJLJL = true;
        int LJJJJ = this.LJLLLL.LIZJ().LJJJJ(alignmentLine);
        this.LJLJL = false;
        return LJJJJ;
    }

    @Override // X.InterfaceC274115t
    public final int LJJLIIIJILLIZJL(int i) {
        LJLILLLLZI();
        return this.LJLLLL.LIZJ().LJJLIIIJILLIZJL(i);
    }

    @Override // X.InterfaceC274115t
    public final int LJJLIIIJLLLLLLLZ(int i) {
        LJLILLLLZI();
        return this.LJLLLL.LIZJ().LJJLIIIJLLLLLLLZ(i);
    }

    @Override // X.InterfaceC274115t
    public final int LJJLJLI(int i) {
        LJLILLLLZI();
        return this.LJLLLL.LIZJ().LJJLJLI(i);
    }

    public final boolean LJLJJI(long j) {
        boolean z;
        long j2;
        C0DV c0dv = this.LJLLLL;
        Trace.beginSection("measurePass:remeasure");
        try {
            C0DR LJJIJIIJI = C1DF.LJJIJIIJI(c0dv.LIZ);
            C29321Dc LJIJJLI = c0dv.LIZ.LJIJJLI();
            C29321Dc c29321Dc = c0dv.LIZ;
            boolean z2 = true;
            if (!c29321Dc.LLFZ && (LJIJJLI == null || !LJIJJLI.LLFZ)) {
                z = false;
                c29321Dc.LLFZ = z;
                if (!c29321Dc.LLIFFJFJJ.LIZJ || !C23360vs.LIZIZ(this.LJLJJI, j)) {
                    this.LJLLILLLL.LJFF = false;
                    LJJIIZ(C46101rS.LJLIL);
                    this.LJLJJL = true;
                    j2 = c0dv.LIZJ().LJLJI;
                    LJLIIL(j);
                    C0DV.LIZIZ(c0dv, j);
                    if (C23490w5.LIZ(c0dv.LIZJ().LJLJI, j2) && c0dv.LIZJ().LJLIL == this.LJLIL && c0dv.LIZJ().LJLILLLLZI == this.LJLILLLLZI) {
                        z2 = false;
                    }
                    LJLIIIL(C78996UzQ.LIZIZ(c0dv.LIZJ().LJLIL, c0dv.LIZJ().LJLILLLLZI));
                    return z2;
                }
                LJJIJIIJI.LIZIZ(c0dv.LIZ);
                c0dv.LIZ.LJJJJL();
                return false;
            }
            z = true;
            c29321Dc.LLFZ = z;
            if (!c29321Dc.LLIFFJFJJ.LIZJ) {
            }
            this.LJLLILLLL.LJFF = false;
            LJJIIZ(C46101rS.LJLIL);
            this.LJLJJL = true;
            j2 = c0dv.LIZJ().LJLJI;
            LJLIIL(j);
            C0DV.LIZIZ(c0dv, j);
            if (C23490w5.LIZ(c0dv.LIZJ().LJLJI, j2)) {
                z2 = false;
            }
            LJLIIIL(C78996UzQ.LIZIZ(c0dv.LIZJ().LJLIL, c0dv.LIZJ().LJLILLLLZI));
            return z2;
        } finally {
            Trace.endSection();
        }
    }

    @Override // X.AbstractC39201gK
    public final void LJL(long j, float f, InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns) {
        if (!C23450w1.LIZIZ(j, this.LJLJLJ)) {
            LJLIL();
        }
        if (C0DV.LIZLLL(this.LJLLLL.LIZ)) {
            C39191gJ c39191gJ = AbstractC274515x.LIZ;
            C46081rQ c46081rQ = this.LJLLLL.LJIIJJI;
            o.LJI(c46081rQ);
            AbstractC274515x.LIZLLL(c39191gJ, c46081rQ, (int) (j >> 32), C23450w1.LIZJ(j));
        }
        this.LJLLLL.LIZIZ = C0DK.LayingOut;
        LJLJI(j, f, interfaceC88472Yns);
        this.LJLLLL.LIZIZ = C0DK.Idle;
    }

    public final void LJLJI(long j, float f, InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns) {
        this.LJLJLJ = j;
        this.LJLL = f;
        this.LJLJLLL = interfaceC88472Yns;
        this.LJLJJLL = true;
        this.LJLLILLLL.LJI = false;
        C0DV c0dv = this.LJLLLL;
        if (c0dv.LJIIIIZZ) {
            c0dv.LJIIIIZZ = false;
            c0dv.LJ(c0dv.LJIIIZ - 1);
        }
        C03750Ct snapshotObserver = C1DF.LJJIJIIJI(this.LJLLLL.LIZ).getSnapshotObserver();
        C0DV c0dv2 = this.LJLLLL;
        C29321Dc node = c0dv2.LIZ;
        C46091rR c46091rR = new C46091rR(interfaceC88472Yns, c0dv2, j, f);
        snapshotObserver.getClass();
        o.LJIIIZ(node, "node");
        snapshotObserver.LIZ(node, snapshotObserver.LJ, c46091rR);
    }
}
