package X;

import android.os.Trace;
import java.util.Comparator;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Cy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03800Cy {
    public final C29321Dc LIZ;
    public final C03760Cu LIZIZ;
    public boolean LIZJ;
    public final C0DH LIZLLL;
    public final C25710zf<C0DQ> LJ;
    public final long LJFF;
    public final C25710zf<C03780Cw> LJI;
    public C23360vs LJII;

    public final void LIZ() {
        C25710zf<C0DQ> c25710zf = this.LJ;
        int i = c25710zf.LJLJI;
        if (i > 0) {
            C0DQ[] c0dqArr = c25710zf.LJLIL;
            o.LJII(c0dqArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                c0dqArr[i2].LIZ();
                i2++;
            } while (i2 < i);
        }
        this.LJ.LJII();
    }

    public final void LJIIIIZZ() {
        if (this.LIZ.LJJIIZ()) {
            C29321Dc c29321Dc = this.LIZ;
            if (c29321Dc.LJZI) {
                if (!this.LIZJ) {
                    if (this.LJII != null) {
                        this.LIZJ = true;
                        try {
                            LJIIIZ(c29321Dc);
                            return;
                        } finally {
                            this.LIZJ = false;
                        }
                    }
                    return;
                }
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    public C03800Cy(C29321Dc root) {
        o.LJIIIZ(root, "root");
        this.LIZ = root;
        C0DR.LJFF.getClass();
        this.LIZIZ = new C03760Cu();
        this.LIZLLL = new C0DH();
        this.LJ = new C25710zf<>(new C0DQ[16]);
        this.LJFF = 1L;
        this.LJI = new C25710zf<>(new C03780Cw[16]);
    }

    public static boolean LJFF(C29321Dc c29321Dc) {
        C46081rQ c46081rQ;
        C1DM c1dm;
        C0DV c0dv = c29321Dc.LLIFFJFJJ;
        if (!c0dv.LJI) {
            return false;
        }
        if (c29321Dc.LLFF != C0DL.InMeasureBlock && ((c46081rQ = c0dv.LJIIJJI) == null || (c1dm = c46081rQ.LJLLI) == null || !c1dm.LJFF())) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            C0DH c0dh = this.LIZLLL;
            C29321Dc rootNode = this.LIZ;
            c0dh.getClass();
            o.LJIIIZ(rootNode, "rootNode");
            c0dh.LIZ.LJII();
            c0dh.LIZ.LIZLLL(rootNode);
            rootNode.LLIIJLIL = true;
        }
        C0DH c0dh2 = this.LIZLLL;
        c0dh2.LIZ.LJIIZILJ(new Comparator<C29321Dc>() { // from class: X.0DF
            @Override // java.util.Comparator
            public final int compare(C29321Dc c29321Dc, C29321Dc c29321Dc2) {
                C29321Dc a = c29321Dc;
                C29321Dc b = c29321Dc2;
                o.LJIIIZ(a, "a");
                o.LJIIIZ(b, "b");
                int LJIIJJI = o.LJIIJJI(b.LJLJLLL, a.LJLJLLL);
                if (LJIIJJI != 0) {
                    return LJIIJJI;
                }
                return o.LJIIJJI(a.hashCode(), b.hashCode());
            }
        });
        C25710zf<C29321Dc> c25710zf = c0dh2.LIZ;
        int i = c25710zf.LJLJI;
        if (i > 0) {
            int i2 = i - 1;
            C29321Dc[] c29321DcArr = c25710zf.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                C29321Dc c29321Dc = c29321DcArr[i2];
                if (c29321Dc.LLIIJLIL) {
                    C0DH.LIZ(c29321Dc);
                }
                i2--;
            } while (i2 >= 0);
        }
        c0dh2.LIZ.LJII();
    }

    public final void LJ(C29321Dc layoutNode) {
        o.LJIIIZ(layoutNode, "layoutNode");
        if (isEmpty()) {
            return;
        }
        if (this.LIZJ) {
            if (!layoutNode.LLIFFJFJJ.LIZJ) {
                C25710zf<C29321Dc> LJJ = layoutNode.LJJ();
                int i = LJJ.LJLJI;
                if (i > 0) {
                    C29321Dc[] c29321DcArr = LJJ.LJLIL;
                    o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i2 = 0;
                    do {
                        C29321Dc c29321Dc = c29321DcArr[i2];
                        if (c29321Dc.LLIFFJFJJ.LIZJ && this.LIZIZ.LIZIZ(c29321Dc)) {
                            LJIIJ(c29321Dc);
                        }
                        if (!c29321Dc.LLIFFJFJJ.LIZJ) {
                            LJ(c29321Dc);
                        }
                        i2++;
                    } while (i2 < i);
                }
                if (layoutNode.LLIFFJFJJ.LIZJ && this.LIZIZ.LIZIZ(layoutNode)) {
                    LJIIJ(layoutNode);
                    return;
                }
                return;
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final boolean LJI(IDqS420S0100000 iDqS420S0100000) {
        boolean z;
        if (this.LIZ.LJJIIZ()) {
            if (this.LIZ.LJZI) {
                if (!this.LIZJ) {
                    boolean z2 = false;
                    if (this.LJII != null) {
                        this.LIZJ = true;
                        try {
                            if (!isEmpty()) {
                                C03760Cu c03760Cu = this.LIZIZ;
                                z = false;
                                while (!c03760Cu.LIZIZ.isEmpty()) {
                                    C29321Dc node = c03760Cu.LIZIZ.first();
                                    o.LJIIIIZZ(node, "node");
                                    c03760Cu.LIZIZ(node);
                                    boolean LJIIJ = LJIIJ(node);
                                    if (node == this.LIZ && LJIIJ) {
                                        z = true;
                                    }
                                }
                                if (iDqS420S0100000 != null) {
                                    iDqS420S0100000.invoke();
                                }
                            } else {
                                z = false;
                            }
                            this.LIZJ = false;
                            z2 = z;
                        } catch (Throwable th) {
                            this.LIZJ = false;
                            throw th;
                        }
                    }
                    LIZ();
                    return z2;
                }
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final void LJIIIZ(C29321Dc c29321Dc) {
        LJIIJJI(c29321Dc);
        C25710zf<C29321Dc> LJJ = c29321Dc.LJJ();
        int i = LJJ.LJLJI;
        if (i > 0) {
            C29321Dc[] c29321DcArr = LJJ.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                C29321Dc c29321Dc2 = c29321DcArr[i2];
                if (c29321Dc2.LLF == C0DL.InMeasureBlock || c29321Dc2.LLIFFJFJJ.LJIIJ.LJLLILLLL.LJFF()) {
                    LJIIIZ(c29321Dc2);
                }
                i2++;
            } while (i2 < i);
        }
        LJIIJJI(c29321Dc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0044, code lost:
    
        if (r13.LLIFFJFJJ.LJI != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r13.LJJIIZI(), java.lang.Boolean.TRUE) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        r13.LJJIJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        if (r13.LLIFFJFJJ.LIZLLL == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        if (r13.LJZI == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
    
        if (r13 != r12.LIZ) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0067, code lost:
    
        if (r13.LLFFF != X.C0DL.NotUsed) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        r13.LJIIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        r9 = r13.LLIFFJFJJ.LJIIJ;
        r8 = X.AbstractC274515x.LIZ;
        r7 = r9.LJJZZIII();
        r6 = r13.LJLZ;
        r0 = r13.LJIJJLI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007c, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007e, code lost:
    
        r10 = r0.LLI.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        r5 = X.AbstractC274515x.LIZLLL;
        r8.getClass();
        r4 = X.AbstractC274515x.LIZJ;
        r1 = X.AbstractC274515x.LIZIZ;
        X.AbstractC274515x.LIZJ = r7;
        X.AbstractC274515x.LIZIZ = r6;
        r0 = X.C39191gJ.LJIIL(r8, r10);
        X.AbstractC274515x.LJI(r8, r9, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0096, code lost:
    
        if (r10 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        X.AbstractC274515x.LIZJ = r4;
        X.AbstractC274515x.LIZIZ = r1;
        X.AbstractC274515x.LIZLLL = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        r0 = r12.LIZLLL;
        r0.getClass();
        r0.LIZ.LIZLLL(r13);
        r13.LLIIJLIL = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
    
        r10.LJLJJLL = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
    
        r13.LJJJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b0, code lost:
    
        if (r12.LJI.LJIIJJI() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b2, code lost:
    
        r0 = r12.LJI;
        r5 = r0.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b6, code lost:
    
        if (r5 <= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b8, code lost:
    
        r4 = r0.LJLIL;
        kotlin.jvm.internal.o.LJII(r4, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bf, code lost:
    
        r3 = r4[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
    
        if (r3.LIZ.LJJIIZ() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cd, code lost:
    
        if (r3.LIZIZ != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cf, code lost:
    
        LJIILL(r3.LIZ, r3.LIZJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e1, code lost:
    
        LJIILIIL(r3.LIZ, r3.LIZJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d6, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d8, code lost:
    
        if (r2 < r5) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        r12.LJI.LJII();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e0, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x003e, code lost:
    
        if (r0 == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJ(X.C29321Dc r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03800Cy.LJIIJ(X.1Dc):boolean");
    }

    public final void LJIIJJI(C29321Dc c29321Dc) {
        C23360vs c23360vs;
        C0DV c0dv = c29321Dc.LLIFFJFJJ;
        if (!c0dv.LIZJ && !c0dv.LJFF) {
            return;
        }
        if (c29321Dc == this.LIZ) {
            c23360vs = this.LJII;
            o.LJI(c23360vs);
        } else {
            c23360vs = null;
        }
        if (c29321Dc.LLIFFJFJJ.LJFF) {
            LIZJ(c29321Dc, c23360vs);
        }
        LIZLLL(c29321Dc, c23360vs);
    }

    public final void LJIILLIIL(long j) {
        C23360vs c23360vs = this.LJII;
        if (c23360vs == null || !C23360vs.LIZIZ(c23360vs.LIZ, j)) {
            if (!this.LIZJ) {
                this.LJII = new C23360vs(j);
                C29321Dc c29321Dc = this.LIZ;
                c29321Dc.LLIFFJFJJ.LIZJ = true;
                this.LIZIZ.LIZ(c29321Dc);
                return;
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean LIZJ(C29321Dc c29321Dc, C23360vs c23360vs) {
        C23360vs c23360vs2;
        boolean LJLJJI;
        if (c29321Dc.LJLLLLLL == null) {
            return false;
        }
        Trace.beginSection("MLDelegate:doLookaheadRemeasure");
        try {
            if (c23360vs != null) {
                if (c29321Dc.LJLLLLLL != null) {
                    C46081rQ c46081rQ = c29321Dc.LLIFFJFJJ.LJIIJJI;
                    o.LJI(c46081rQ);
                    LJLJJI = c46081rQ.LJLJJI(c23360vs.LIZ);
                }
                LJLJJI = false;
            } else {
                C46081rQ c46081rQ2 = c29321Dc.LLIFFJFJJ.LJIIJJI;
                if (c46081rQ2 != null && (c23360vs2 = c46081rQ2.LJLJL) != null && c29321Dc.LJLLLLLL != null) {
                    o.LJI(c46081rQ2);
                    LJLJJI = c46081rQ2.LJLJJI(c23360vs2.LIZ);
                }
                LJLJJI = false;
            }
            C29321Dc LJIJJLI = c29321Dc.LJIJJLI();
            if (LJLJJI && LJIJJLI != null) {
                if (LJIJJLI.LJLLLLLL == null) {
                    LJIILL(LJIJJLI, false);
                } else {
                    C0DL c0dl = c29321Dc.LLFF;
                    if (c0dl == C0DL.InMeasureBlock) {
                        LJIILIIL(LJIJJLI, false);
                    } else if (c0dl == C0DL.InLayoutBlock) {
                        LJIIL(LJIJJLI, false);
                    }
                }
            }
            return LJLJJI;
        } finally {
            Trace.endSection();
        }
    }

    public final boolean LIZLLL(C29321Dc c29321Dc, C23360vs c23360vs) {
        boolean z;
        Trace.beginSection("MLDelegate:doRemeasure");
        try {
            if (c23360vs != null) {
                if (c29321Dc.LLFFF == C0DL.NotUsed) {
                    c29321Dc.LJIIIZ();
                }
                z = c29321Dc.LLIFFJFJJ.LJIIJ.LJLJJI(c23360vs.LIZ);
            } else {
                C46111rT c46111rT = c29321Dc.LLIFFJFJJ.LJIIJ;
                if (c46111rT.LJLJJL) {
                    C23360vs c23360vs2 = new C23360vs(c46111rT.LJLJJI);
                    if (c29321Dc.LLFFF == C0DL.NotUsed) {
                        c29321Dc.LJIIIZ();
                    }
                    z = c29321Dc.LLIFFJFJJ.LJIIJ.LJLJJI(c23360vs2.LIZ);
                } else {
                    z = false;
                }
            }
            C29321Dc LJIJJLI = c29321Dc.LJIJJLI();
            if (z && LJIJJLI != null) {
                C0DL c0dl = c29321Dc.LLF;
                if (c0dl == C0DL.InMeasureBlock) {
                    LJIILL(LJIJJLI, false);
                } else if (c0dl == C0DL.InLayoutBlock) {
                    LJIILJJIL(LJIJJLI, false);
                }
            }
            return z;
        } finally {
            Trace.endSection();
        }
    }

    public final void LJII(C29321Dc layoutNode, long j) {
        o.LJIIIZ(layoutNode, "layoutNode");
        if (!o.LJ(layoutNode, this.LIZ)) {
            if (this.LIZ.LJJIIZ()) {
                if (this.LIZ.LJZI) {
                    if (!this.LIZJ) {
                        if (this.LJII != null) {
                            this.LIZJ = true;
                            try {
                                this.LIZIZ.LIZIZ(layoutNode);
                                boolean LIZJ = LIZJ(layoutNode, new C23360vs(j));
                                LIZLLL(layoutNode, new C23360vs(j));
                                if ((LIZJ || layoutNode.LLIFFJFJJ.LJI) && o.LJ(layoutNode.LJJIIZI(), Boolean.TRUE)) {
                                    layoutNode.LJJIJ();
                                }
                                if (layoutNode.LLIFFJFJJ.LIZLLL && layoutNode.LJZI) {
                                    layoutNode.LJJJ();
                                    C0DH c0dh = this.LIZLLL;
                                    c0dh.getClass();
                                    c0dh.LIZ.LIZLLL(layoutNode);
                                    layoutNode.LLIIJLIL = true;
                                }
                            } finally {
                                this.LIZJ = false;
                            }
                        }
                        LIZ();
                        return;
                    }
                    "Failed requirement.".toString();
                    throw new IllegalArgumentException("Failed requirement.");
                }
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final boolean LJIIL(C29321Dc layoutNode, boolean z) {
        C29321Dc LJIJJLI;
        o.LJIIIZ(layoutNode, "layoutNode");
        int i = C03790Cx.LIZ[layoutNode.LLIFFJFJJ.LIZIZ.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 3) {
                return false;
            }
            if (i != 4 && i != 5) {
                throw new C162476Zf();
            }
        }
        C0DV c0dv = layoutNode.LLIFFJFJJ;
        if ((c0dv.LJFF || c0dv.LJI) && !z) {
            return false;
        }
        c0dv.LJI = true;
        c0dv.LJII = true;
        c0dv.LIZLLL = true;
        c0dv.LJ = true;
        if (o.LJ(layoutNode.LJJIIZI(), Boolean.TRUE) && ((LJIJJLI = layoutNode.LJIJJLI()) == null || (!LJIJJLI.LLIFFJFJJ.LJFF && !LJIJJLI.LLIFFJFJJ.LJI))) {
            this.LIZIZ.LIZ(layoutNode);
        }
        if (this.LIZJ) {
            return false;
        }
        return true;
    }

    public final boolean LJIILIIL(C29321Dc layoutNode, boolean z) {
        C29321Dc LJIJJLI;
        o.LJIIIZ(layoutNode, "layoutNode");
        if (layoutNode.LJLLLLLL != null) {
            int i = C03790Cx.LIZ[layoutNode.LLIFFJFJJ.LIZIZ.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    C0DV c0dv = layoutNode.LLIFFJFJJ;
                    if (c0dv.LJFF && !z) {
                        return false;
                    }
                    c0dv.LJFF = true;
                    c0dv.LIZJ = true;
                    if ((o.LJ(layoutNode.LJJIIZI(), Boolean.TRUE) || LJFF(layoutNode)) && ((LJIJJLI = layoutNode.LJIJJLI()) == null || !LJIJJLI.LLIFFJFJJ.LJFF)) {
                        this.LIZIZ.LIZ(layoutNode);
                    }
                    if (this.LIZJ) {
                        return false;
                    }
                    return true;
                }
                throw new C162476Zf();
            }
            this.LJI.LIZLLL(new C03780Cw(layoutNode, true, z));
            return false;
        }
        "Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString();
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout");
    }

    public final boolean LJIILJJIL(C29321Dc layoutNode, boolean z) {
        C29321Dc LJIJJLI;
        o.LJIIIZ(layoutNode, "layoutNode");
        int i = C03790Cx.LIZ[layoutNode.LLIFFJFJJ.LIZIZ.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return false;
        }
        if (i == 5) {
            if (!z) {
                C0DV c0dv = layoutNode.LLIFFJFJJ;
                if (c0dv.LIZJ || c0dv.LIZLLL) {
                    return false;
                }
            }
            C0DV c0dv2 = layoutNode.LLIFFJFJJ;
            c0dv2.LIZLLL = true;
            c0dv2.LJ = true;
            if (layoutNode.LJZI && ((LJIJJLI = layoutNode.LJIJJLI()) == null || (!LJIJJLI.LLIFFJFJJ.LIZLLL && !LJIJJLI.LLIFFJFJJ.LIZJ))) {
                this.LIZIZ.LIZ(layoutNode);
            }
            if (this.LIZJ) {
                return false;
            }
            return true;
        }
        throw new C162476Zf();
    }

    public final boolean LJIILL(C29321Dc layoutNode, boolean z) {
        C29321Dc LJIJJLI;
        o.LJIIIZ(layoutNode, "layoutNode");
        int i = C03790Cx.LIZ[layoutNode.LLIFFJFJJ.LIZIZ.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    C0DV c0dv = layoutNode.LLIFFJFJJ;
                    if (!c0dv.LIZJ || z) {
                        c0dv.LIZJ = true;
                        if ((layoutNode.LJZI || layoutNode.LLF == C0DL.InMeasureBlock || c0dv.LJIIJ.LJLLILLLL.LJFF()) && ((LJIJJLI = layoutNode.LJIJJLI()) == null || !LJIJJLI.LLIFFJFJJ.LIZJ)) {
                            this.LIZIZ.LIZ(layoutNode);
                        }
                        if (!this.LIZJ) {
                            return true;
                        }
                    }
                } else {
                    throw new C162476Zf();
                }
            } else {
                this.LJI.LIZLLL(new C03780Cw(layoutNode, false, z));
            }
        }
        return false;
    }
}
