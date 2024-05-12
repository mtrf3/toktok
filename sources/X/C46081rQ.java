package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.IDqS32S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.1rQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46081rQ extends AbstractC39201gK implements InterfaceC39071g7, InterfaceC40441iK {
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public C23360vs LJLJL;
    public boolean LJLL;
    public Object LJLLL;
    public final /* synthetic */ C0DV LJLLLL;
    public long LJLJLJ = C23450w1.LIZIZ;
    public boolean LJLJLLL = true;
    public final C1DM LJLLI = new AbstractC03700Co(this) { // from class: X.1DM
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(this);
            o.LJIIIZ(this, "alignmentLinesOwner");
        }

        @Override // X.AbstractC03700Co
        public final java.util.Map<AbstractC272415c, Integer> LIZJ(AbstractC538029g abstractC538029g) {
            o.LJIIIZ(abstractC538029g, "<this>");
            AbstractC537929f abstractC537929f = abstractC538029g.LJLLLLLL;
            o.LJI(abstractC537929f);
            return abstractC537929f.LJLJJLL().LJI();
        }

        @Override // X.AbstractC03700Co
        public final long LIZIZ(AbstractC538029g calculatePositionInParent, long j) {
            o.LJIIIZ(calculatePositionInParent, "$this$calculatePositionInParent");
            AbstractC537929f abstractC537929f = calculatePositionInParent.LJLLLLLL;
            o.LJI(abstractC537929f);
            long j2 = abstractC537929f.LJLJLLL;
            return C10370av.LJI(C78923UyF.LIZ((int) (j2 >> 32), C23450w1.LIZJ(j2)), j);
        }

        @Override // X.AbstractC03700Co
        public final int LIZLLL(AbstractC538029g abstractC538029g, AbstractC272415c alignmentLine) {
            o.LJIIIZ(alignmentLine, "alignmentLine");
            AbstractC537929f abstractC537929f = abstractC538029g.LJLLLLLL;
            o.LJI(abstractC537929f);
            return abstractC537929f.LJJJJ(alignmentLine);
        }
    };
    public final C25710zf<InterfaceC39071g7> LJLLILLLL = new C25710zf<>(new InterfaceC39071g7[16]);
    public boolean LJLLJ = true;

    public final void LJLIL() {
        int i = 0;
        this.LJLJLLL = false;
        C25710zf<C29321Dc> LJJ = this.LJLLLL.LIZ.LJJ();
        int i2 = LJJ.LJLJI;
        if (i2 > 0) {
            C29321Dc[] c29321DcArr = LJJ.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                C46081rQ c46081rQ = c29321DcArr[i].LLIFFJFJJ.LJIIJJI;
                o.LJI(c46081rQ);
                c46081rQ.LJLIL();
                i++;
            } while (i < i2);
        }
    }

    @Override // X.InterfaceC40441iK
    public final void LJJIJIIJIL() {
        C25710zf<C29321Dc> LJJ;
        int i;
        LJIIIIZZ();
        C0DV c0dv = this.LJLLLL;
        if (c0dv.LJI && (i = (LJJ = c0dv.LIZ.LJJ()).LJLJI) > 0) {
            C29321Dc[] c29321DcArr = LJJ.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                C29321Dc c29321Dc = c29321DcArr[i2];
                C0DV c0dv2 = c29321Dc.LLIFFJFJJ;
                if (c0dv2.LJFF && c29321Dc.LLFF == C0DL.InMeasureBlock) {
                    C46081rQ c46081rQ = c0dv2.LJIIJJI;
                    o.LJI(c46081rQ);
                    C23360vs c23360vs = this.LJLJL;
                    o.LJI(c23360vs);
                    if (c46081rQ.LJLJJI(c23360vs.LIZ)) {
                        c0dv.LIZ.LJJJJI(false);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        AbstractC537929f abstractC537929f = LJJIZ().LJLLLLLL;
        o.LJI(abstractC537929f);
        C0DV c0dv3 = this.LJLLLL;
        if (c0dv3.LJII || (!this.LJLJJL && !abstractC537929f.LJLJJLL && c0dv3.LJI)) {
            c0dv3.LJI = false;
            C0DK c0dk = c0dv3.LIZIZ;
            c0dv3.LIZIZ = C0DK.LookaheadLayingOut;
            C03750Ct snapshotObserver = C1DF.LJJIJIIJI(c0dv3.LIZ).getSnapshotObserver();
            C0DV c0dv4 = this.LJLLLL;
            C29321Dc node = c0dv4.LIZ;
            IDqS32S0300000 iDqS32S0300000 = new IDqS32S0300000(this, c0dv4, abstractC537929f, 2);
            snapshotObserver.getClass();
            o.LJIIIZ(node, "node");
            if (node.LJLLLLLL != null) {
                snapshotObserver.LIZ(node, snapshotObserver.LJI, iDqS32S0300000);
            } else {
                snapshotObserver.LIZ(node, snapshotObserver.LIZLLL, iDqS32S0300000);
            }
            C0DV c0dv5 = this.LJLLLL;
            c0dv5.LIZIZ = c0dk;
            if (c0dv5.LJIIIIZZ && abstractC537929f.LJLJJLL) {
                requestLayout();
            }
            this.LJLLLL.LJII = false;
        }
        C1DM c1dm = this.LJLLI;
        if (c1dm.LIZLLL) {
            c1dm.LJ = true;
        }
        if (c1dm.LIZIZ && c1dm.LJFF()) {
            LJII();
        }
    }

    @Override // X.InterfaceC40441iK
    public final C55952Hn LJJIZ() {
        return this.LJLLLL.LIZ.LLI.LIZIZ;
    }

    @Override // X.InterfaceC40441iK
    public final void LJJLIIIJ() {
        this.LJLLLL.LIZ.LJJJJI(false);
    }

    @Override // X.InterfaceC40441iK
    public final InterfaceC40441iK LJJLIIIJJIZ() {
        C0DV c0dv;
        C29321Dc LJIJJLI = this.LJLLLL.LIZ.LJIJJLI();
        if (LJIJJLI != null && (c0dv = LJIJJLI.LLIFFJFJJ) != null) {
            return c0dv.LJIIJJI;
        }
        return null;
    }

    @Override // X.AbstractC39201gK
    public final int LJJZZI() {
        AbstractC537929f abstractC537929f = this.LJLLLL.LIZJ().LJLLLLLL;
        o.LJI(abstractC537929f);
        return abstractC537929f.LJJZZI();
    }

    @Override // X.AbstractC39201gK
    public final int LJJZZIII() {
        AbstractC537929f abstractC537929f = this.LJLLLL.LIZJ().LJLLLLLL;
        o.LJI(abstractC537929f);
        return abstractC537929f.LJJZZIII();
    }

    public final void LJLILLLLZI() {
        C0DV c0dv = this.LJLLLL;
        if (c0dv.LJIIIZ > 0) {
            List<C29321Dc> LJIJI = c0dv.LIZ.LJIJI();
            int size = LJIJI.size();
            for (int i = 0; i < size; i++) {
                C29321Dc c29321Dc = (C29321Dc) ListProtector.get(LJIJI, i);
                C0DV c0dv2 = c29321Dc.LLIFFJFJJ;
                if (c0dv2.LJIIIIZZ && !c0dv2.LIZLLL) {
                    c29321Dc.LJJJJ(false);
                }
                C46081rQ c46081rQ = c0dv2.LJIIJJI;
                if (c46081rQ != null) {
                    c46081rQ.LJLILLLLZI();
                }
            }
        }
    }

    public final void LJLJI() {
        C0DL c0dl;
        this.LJLLLL.LIZ.LJJJJI(false);
        C29321Dc LJIJJLI = this.LJLLLL.LIZ.LJIJJLI();
        if (LJIJJLI != null) {
            C29321Dc c29321Dc = this.LJLLLL.LIZ;
            if (c29321Dc.LLFFF == C0DL.NotUsed) {
                int i = C0DS.LIZ[LJIJJLI.LLIFFJFJJ.LIZIZ.ordinal()];
                if (i != 2) {
                    if (i != 3) {
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

    public final void LJLJJL() {
        C25710zf<C29321Dc> LJJ = this.LJLLLL.LIZ.LJJ();
        int i = LJJ.LJLJI;
        if (i > 0) {
            C29321Dc[] c29321DcArr = LJJ.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                C29321Dc c29321Dc = c29321DcArr[i2];
                c29321Dc.getClass();
                C29321Dc.LJJJJJL(c29321Dc);
                C46081rQ c46081rQ = c29321Dc.LLIFFJFJJ.LJIIJJI;
                o.LJI(c46081rQ);
                c46081rQ.LJLJJL();
                i2++;
            } while (i2 < i);
        }
    }

    @Override // X.InterfaceC40441iK
    public final void requestLayout() {
        this.LJLLLL.LIZ.LJJJJ(false);
    }

    @Override // X.InterfaceC40441iK
    public final AbstractC03700Co LJI() {
        return this.LJLLI;
    }

    @Override // X.AbstractC39201gK, X.InterfaceC274115t
    public final Object LJIIJJI() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC40441iK
    public final boolean LJJIJIL() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC40441iK
    public final void LJJIIZ(InterfaceC88472Yns<? super InterfaceC40441iK, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        List<C29321Dc> LJIJI = this.LJLLLL.LIZ.LJIJI();
        int size = LJIJI.size();
        for (int i = 0; i < size; i++) {
            C46081rQ c46081rQ = ((C29321Dc) ListProtector.get(LJIJI, i)).LLIFFJFJJ.LJIIJJI;
            o.LJI(c46081rQ);
            block.invoke(c46081rQ);
        }
    }

    @Override // X.InterfaceC274115t
    public final int LJJJI(int i) {
        LJLJI();
        AbstractC537929f abstractC537929f = this.LJLLLL.LIZJ().LJLLLLLL;
        o.LJI(abstractC537929f);
        return abstractC537929f.LJJJI(i);
    }

    @Override // X.InterfaceC39071g7
    public final AbstractC39201gK LJJJIL(long j) {
        C0DL c0dl;
        C29321Dc c29321Dc = this.LJLLLL.LIZ;
        C29321Dc LJIJJLI = c29321Dc.LJIJJLI();
        if (LJIJJLI != null) {
            if (c29321Dc.LLFF == C0DL.NotUsed || c29321Dc.LLFZ) {
                int i = C0DS.LIZ[LJIJJLI.LLIFFJFJJ.LIZIZ.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3 || i == 4) {
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
                c29321Dc.LLFF = c0dl;
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("measure() may not be called multiple times on the same Measurable. Current state ");
                LIZ2.append(c29321Dc.LLFF);
                LIZ2.append(". Parent state ");
                LIZ2.append(LJIJJLI.LLIFFJFJJ.LIZIZ);
                LIZ2.append('.');
                String LIZIZ = X1D.LIZIZ(LIZ2);
                LIZIZ.toString();
                throw new IllegalStateException(LIZIZ);
            }
        } else {
            C0DL c0dl2 = C0DL.NotUsed;
            o.LJIIIZ(c0dl2, "<set-?>");
            c29321Dc.LLFF = c0dl2;
        }
        C29321Dc c29321Dc2 = this.LJLLLL.LIZ;
        if (c29321Dc2.LLFFF == C0DL.NotUsed) {
            c29321Dc2.LJIIIZ();
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
        if (c0dk == C0DK.LookaheadMeasuring) {
            this.LJLLI.LIZJ = true;
        } else {
            C29321Dc LJIJJLI2 = this.LJLLLL.LIZ.LJIJJLI();
            if (LJIJJLI2 != null) {
                c0dk2 = LJIJJLI2.LLIFFJFJJ.LIZIZ;
            }
            if (c0dk2 == C0DK.LookaheadLayingOut) {
                this.LJLLI.LIZLLL = true;
            }
        }
        this.LJLJJL = true;
        AbstractC537929f abstractC537929f = this.LJLLLL.LIZJ().LJLLLLLL;
        o.LJI(abstractC537929f);
        int LJJJJ = abstractC537929f.LJJJJ(alignmentLine);
        this.LJLJJL = false;
        return LJJJJ;
    }

    @Override // X.InterfaceC274115t
    public final int LJJLIIIJILLIZJL(int i) {
        LJLJI();
        AbstractC537929f abstractC537929f = this.LJLLLL.LIZJ().LJLLLLLL;
        o.LJI(abstractC537929f);
        return abstractC537929f.LJJLIIIJILLIZJL(i);
    }

    @Override // X.InterfaceC274115t
    public final int LJJLIIIJLLLLLLLZ(int i) {
        LJLJI();
        AbstractC537929f abstractC537929f = this.LJLLLL.LIZJ().LJLLLLLL;
        o.LJI(abstractC537929f);
        return abstractC537929f.LJJLIIIJLLLLLLLZ(i);
    }

    @Override // X.InterfaceC274115t
    public final int LJJLJLI(int i) {
        LJLJI();
        AbstractC537929f abstractC537929f = this.LJLLLL.LIZJ().LJLLLLLL;
        o.LJI(abstractC537929f);
        return abstractC537929f.LJJLJLI(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:3:0x0007, B:6:0x0017, B:10:0x001f, B:12:0x0027, B:14:0x006b, B:20:0x002b, B:22:0x0043, B:24:0x0062, B:30:0x0079, B:31:0x0083), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #0 {all -> 0x0088, blocks: (B:3:0x0007, B:6:0x0017, B:10:0x001f, B:12:0x0027, B:14:0x006b, B:20:0x002b, B:22:0x0043, B:24:0x0062, B:30:0x0079, B:31:0x0083), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJLJJI(long r9) {
        /*
            r8 = this;
            X.0DV r2 = r8.LJLLLL
            java.lang.String r0 = "lookaheadPass:remeasure"
            android.os.Trace.beginSection(r0)
            X.1Dc r0 = r2.LIZ     // Catch: java.lang.Throwable -> L88
            X.1Dc r4 = r0.LJIJJLI()     // Catch: java.lang.Throwable -> L88
            X.1Dc r1 = r2.LIZ     // Catch: java.lang.Throwable -> L88
            boolean r0 = r1.LLFZ     // Catch: java.lang.Throwable -> L88
            r7 = 1
            r3 = 0
            if (r0 != 0) goto L1e
            if (r4 == 0) goto L1c
            boolean r0 = r4.LLFZ     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            r1.LLFZ = r0     // Catch: java.lang.Throwable -> L88
            X.0DV r0 = r1.LLIFFJFJJ     // Catch: java.lang.Throwable -> L88
            boolean r0 = r0.LJFF     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L2b
            X.0vs r0 = r8.LJLJL     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L6b
        L2b:
            X.0vs r0 = new X.0vs     // Catch: java.lang.Throwable -> L88
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L88
            r8.LJLJL = r0     // Catch: java.lang.Throwable -> L88
            X.1DM r0 = r8.LJLLI     // Catch: java.lang.Throwable -> L88
            r0.LJFF = r3     // Catch: java.lang.Throwable -> L88
            X.1rP r0 = X.C46071rP.LJLIL     // Catch: java.lang.Throwable -> L88
            r8.LJJIIZ(r0)     // Catch: java.lang.Throwable -> L88
            X.29g r0 = r2.LIZJ()     // Catch: java.lang.Throwable -> L88
            X.29f r6 = r0.LJLLLLLL     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L79
            int r1 = r6.LJLIL     // Catch: java.lang.Throwable -> L88
            int r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L88
            long r4 = X.C78996UzQ.LIZIZ(r1, r0)     // Catch: java.lang.Throwable -> L88
            X.C0DV.LIZ(r2, r9)     // Catch: java.lang.Throwable -> L88
            int r1 = r6.LJLIL     // Catch: java.lang.Throwable -> L88
            int r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L88
            long r0 = X.C78996UzQ.LIZIZ(r1, r0)     // Catch: java.lang.Throwable -> L88
            r8.LJLIIIL(r0)     // Catch: java.lang.Throwable -> L88
            r0 = 32
            long r2 = r4 >> r0
            int r1 = (int) r2     // Catch: java.lang.Throwable -> L88
            int r0 = r6.LJLIL     // Catch: java.lang.Throwable -> L88
            if (r1 != r0) goto L75
            int r1 = X.C23490w5.LIZIZ(r4)     // Catch: java.lang.Throwable -> L88
            int r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L88
            if (r1 == r0) goto L74
            goto L75
        L6b:
            long r0 = r0.LIZ     // Catch: java.lang.Throwable -> L88
            boolean r0 = X.C23360vs.LIZIZ(r0, r9)     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L84
            goto L2b
        L74:
            r7 = 0
        L75:
            android.os.Trace.endSection()
            return r7
        L79:
            java.lang.String r1 = "Lookahead result from lookaheadRemeasure cannot be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r1.toString()     // Catch: java.lang.Throwable -> L88
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L88
            throw r0     // Catch: java.lang.Throwable -> L88
        L84:
            android.os.Trace.endSection()
            return r3
        L88:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46081rQ.LJLJJI(long):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1DM] */
    public C46081rQ(C0DV c0dv, C39061g6 c39061g6) {
        this.LJLLLL = c0dv;
        this.LJLLL = c0dv.LJIIJ.LJLLI;
    }

    @Override // X.AbstractC39201gK
    public final void LJL(long j, float f, InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns) {
        this.LJLLLL.LIZIZ = C0DK.LookaheadLayingOut;
        this.LJLJJLL = true;
        if (!C23450w1.LIZIZ(j, this.LJLJLJ)) {
            LJLILLLLZI();
        }
        this.LJLLI.LJI = false;
        C0DR LJJIJIIJI = C1DF.LJJIJIIJI(this.LJLLLL.LIZ);
        C0DV c0dv = this.LJLLLL;
        if (c0dv.LJIIIIZZ) {
            c0dv.LJIIIIZZ = false;
            c0dv.LJ(c0dv.LJIIIZ - 1);
        }
        C03750Ct snapshotObserver = LJJIJIIJI.getSnapshotObserver();
        C0DV c0dv2 = this.LJLLLL;
        C29321Dc node = c0dv2.LIZ;
        C46061rO c46061rO = new C46061rO(c0dv2, j);
        snapshotObserver.getClass();
        o.LJIIIZ(node, "node");
        if (node.LJLLLLLL != null) {
            snapshotObserver.LIZ(node, snapshotObserver.LJFF, c46061rO);
        } else {
            snapshotObserver.LIZ(node, snapshotObserver.LJ, c46061rO);
        }
        this.LJLJLJ = j;
        this.LJLLLL.LIZIZ = C0DK.Idle;
    }
}
