package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2Hn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55952Hn extends AbstractC538029g {
    public static final C1QW LLIIIILZ;
    public final C40461iM LLIIII;

    static {
        C1QW c1qw = new C1QW();
        c1qw.LIZLLL(C11850dJ.LIZLLL);
        c1qw.LJIJJ(1.0f);
        c1qw.LJIJJLI(1);
        LLIIIILZ = c1qw;
    }

    @Override // X.AbstractC538029g
    public final C1M3 LLD() {
        return this.LLIIII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1iM, X.1M3] */
    public C55952Hn(C29321Dc layoutNode) {
        super(layoutNode);
        o.LJIIIZ(layoutNode, "layoutNode");
        ?? r0 = new C1M3() { // from class: X.1iM
            public final String toString() {
                return "<tail>";
            }
        };
        this.LLIIII = r0;
        r0.LJLJJLL = this;
    }

    @Override // X.InterfaceC274115t
    public final int LJJJI(int i) {
        C0D8 c0d8 = this.LJLJL.LJLLL;
        InterfaceC273215k LIZ = c0d8.LIZ();
        C29321Dc c29321Dc = c0d8.LIZ;
        return LIZ.LIZIZ(c29321Dc.LLI.LIZJ, c29321Dc.LJIJ(), i);
    }

    @Override // X.InterfaceC39071g7
    public final AbstractC39201gK LJJJIL(long j) {
        LJLIIL(j);
        C25710zf<C29321Dc> LJJ = this.LJLJL.LJJ();
        int i = LJJ.LJLJI;
        if (i > 0) {
            C29321Dc[] c29321DcArr = LJJ.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                C29321Dc c29321Dc = c29321DcArr[i2];
                C0DL c0dl = C0DL.NotUsed;
                c29321Dc.getClass();
                o.LJIIIZ(c0dl, "<set-?>");
                c29321Dc.LLF = c0dl;
                i2++;
            } while (i2 < i);
        }
        C29321Dc c29321Dc2 = this.LJLJL;
        LLIIJI(c29321Dc2.LJLLJ.LIZJ(this, c29321Dc2.LJIJ(), j));
        LLIIIILZ();
        return this;
    }

    @Override // X.InterfaceC274115t
    public final int LJJLIIIJILLIZJL(int i) {
        C0D8 c0d8 = this.LJLJL.LJLLL;
        InterfaceC273215k LIZ = c0d8.LIZ();
        C29321Dc c29321Dc = c0d8.LIZ;
        return LIZ.LIZLLL(c29321Dc.LLI.LIZJ, c29321Dc.LJIJ(), i);
    }

    @Override // X.InterfaceC274115t
    public final int LJJLIIIJLLLLLLLZ(int i) {
        C0D8 c0d8 = this.LJLJL.LJLLL;
        InterfaceC273215k LIZ = c0d8.LIZ();
        C29321Dc c29321Dc = c0d8.LIZ;
        return LIZ.LJ(c29321Dc.LLI.LIZJ, c29321Dc.LJIJ(), i);
    }

    @Override // X.InterfaceC274115t
    public final int LJJLJLI(int i) {
        C0D8 c0d8 = this.LJLJL.LJLLL;
        InterfaceC273215k LIZ = c0d8.LIZ();
        C29321Dc c29321Dc = c0d8.LIZ;
        return LIZ.LIZ(c29321Dc.LLI.LIZJ, c29321Dc.LJIJ(), i);
    }

    @Override // X.AbstractC45981rG
    public final int LJLIL(AbstractC272415c alignmentLine) {
        o.LJIIIZ(alignmentLine, "alignmentLine");
        AbstractC537929f abstractC537929f = this.LJLLLLLL;
        if (abstractC537929f != null) {
            return abstractC537929f.LJLIL(alignmentLine);
        }
        C46111rT c46111rT = this.LJLJL.LLIFFJFJJ.LJIIJ;
        if (!c46111rT.LJLJL) {
            C0DV c0dv = c46111rT.LJLLLL;
            if (c0dv.LIZIZ == C0DK.Measuring) {
                C29331Dd c29331Dd = c46111rT.LJLLILLLL;
                c29331Dd.LJFF = true;
                if (c29331Dd.LIZIZ) {
                    c0dv.LIZLLL = true;
                    c0dv.LJ = true;
                }
            } else {
                c46111rT.LJLLILLLL.LJI = true;
            }
        }
        c46111rT.LJJIZ().LJLJJLL = true;
        c46111rT.LJJIJIIJIL();
        c46111rT.LJJIZ().LJLJJLL = false;
        Integer num = (Integer) ((HashMap) c46111rT.LJLLILLLL.LJIIIIZZ).get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return LiveLayoutPreloadThreadPriority.DEFAULT;
    }

    @Override // X.AbstractC538029g
    public final AbstractC537929f LJLLL(final C39061g6 scope) {
        o.LJIIIZ(scope, "scope");
        return new AbstractC537929f(this, scope) { // from class: X.2Hm
            @Override // X.AbstractC537929f
            public final void LJLLILLLL() {
                C46081rQ c46081rQ = this.LJLJL.LJLJL.LLIFFJFJJ.LJIIJJI;
                o.LJI(c46081rQ);
                if (!c46081rQ.LJLJLLL) {
                    c46081rQ.LJLJLLL = true;
                    if (!c46081rQ.LJLL) {
                        c46081rQ.LJLJJL();
                    }
                }
                C46081rQ c46081rQ2 = this.LJLJL.LJLJL.LLIFFJFJJ.LJIIJJI;
                o.LJI(c46081rQ2);
                c46081rQ2.LJJIJIIJIL();
            }

            @Override // X.AbstractC537929f, X.InterfaceC274115t
            public final int LJJJI(int i) {
                C0D8 c0d8 = this.LJLJL.LJLJL.LJLLL;
                InterfaceC273215k LIZ = c0d8.LIZ();
                C29321Dc c29321Dc = c0d8.LIZ;
                return LIZ.LIZIZ(c29321Dc.LLI.LIZJ, c29321Dc.LJIIZILJ(), i);
            }

            @Override // X.InterfaceC39071g7
            public final AbstractC39201gK LJJJIL(long j) {
                LJLIIL(j);
                C25710zf<C29321Dc> LJJ = this.LJLJL.LJLJL.LJJ();
                int i = LJJ.LJLJI;
                if (i > 0) {
                    C29321Dc[] c29321DcArr = LJJ.LJLIL;
                    o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i2 = 0;
                    do {
                        C29321Dc c29321Dc = c29321DcArr[i2];
                        C0DL c0dl = C0DL.NotUsed;
                        c29321Dc.getClass();
                        o.LJIIIZ(c0dl, "<set-?>");
                        c29321Dc.LLFF = c0dl;
                        i2++;
                    } while (i2 < i);
                }
                C29321Dc c29321Dc2 = this.LJLJL.LJLJL;
                AbstractC537929f.LJLLI(this, c29321Dc2.LJLLJ.LIZJ(this, c29321Dc2.LJIIZILJ(), j));
                return this;
            }

            @Override // X.AbstractC537929f, X.InterfaceC274115t
            public final int LJJLIIIJILLIZJL(int i) {
                C0D8 c0d8 = this.LJLJL.LJLJL.LJLLL;
                InterfaceC273215k LIZ = c0d8.LIZ();
                C29321Dc c29321Dc = c0d8.LIZ;
                return LIZ.LIZLLL(c29321Dc.LLI.LIZJ, c29321Dc.LJIIZILJ(), i);
            }

            @Override // X.AbstractC537929f, X.InterfaceC274115t
            public final int LJJLIIIJLLLLLLLZ(int i) {
                C0D8 c0d8 = this.LJLJL.LJLJL.LJLLL;
                InterfaceC273215k LIZ = c0d8.LIZ();
                C29321Dc c29321Dc = c0d8.LIZ;
                return LIZ.LJ(c29321Dc.LLI.LIZJ, c29321Dc.LJIIZILJ(), i);
            }

            @Override // X.AbstractC537929f, X.InterfaceC274115t
            public final int LJJLJLI(int i) {
                C0D8 c0d8 = this.LJLJL.LJLJL.LJLLL;
                InterfaceC273215k LIZ = c0d8.LIZ();
                C29321Dc c29321Dc = c0d8.LIZ;
                return LIZ.LIZ(c29321Dc.LLI.LIZJ, c29321Dc.LJIIZILJ(), i);
            }

            @Override // X.AbstractC45981rG
            public final int LJLIL(AbstractC272415c alignmentLine) {
                int i;
                o.LJIIIZ(alignmentLine, "alignmentLine");
                C46081rQ c46081rQ = this.LJLJL.LJLJL.LLIFFJFJJ.LJIIJJI;
                o.LJI(c46081rQ);
                if (!c46081rQ.LJLJJL) {
                    C0DV c0dv = c46081rQ.LJLLLL;
                    if (c0dv.LIZIZ == C0DK.LookaheadMeasuring) {
                        C1DM c1dm = c46081rQ.LJLLI;
                        c1dm.LJFF = true;
                        if (c1dm.LIZIZ) {
                            c0dv.LJI = true;
                            c0dv.LJII = true;
                        }
                    } else {
                        c46081rQ.LJLLI.LJI = true;
                    }
                }
                AbstractC537929f abstractC537929f = c46081rQ.LJJIZ().LJLLLLLL;
                if (abstractC537929f != null) {
                    abstractC537929f.LJLJJLL = true;
                }
                c46081rQ.LJJIJIIJIL();
                AbstractC537929f abstractC537929f2 = c46081rQ.LJJIZ().LJLLLLLL;
                if (abstractC537929f2 != null) {
                    abstractC537929f2.LJLJJLL = false;
                }
                Integer num = (Integer) ((HashMap) c46081rQ.LJLLI.LJIIIIZZ).get(alignmentLine);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = LiveLayoutPreloadThreadPriority.DEFAULT;
                }
                this.LJLLJ.put(alignmentLine, Integer.valueOf(i));
                return i;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this, scope);
                o.LJIIIZ(scope, "scope");
            }
        };
    }

    @Override // X.AbstractC538029g
    public final void LLIIIL(InterfaceC11750d9 canvas) {
        o.LJIIIZ(canvas, "canvas");
        C0DR LJJIJIIJI = C1DF.LJJIJIIJI(this.LJLJL);
        C25710zf<C29321Dc> LJIL = this.LJLJL.LJIL();
        int i = LJIL.LJLJI;
        if (i > 0) {
            C29321Dc[] c29321DcArr = LJIL.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                C29321Dc c29321Dc = c29321DcArr[i2];
                if (c29321Dc.LJZI) {
                    c29321Dc.LJIILLIIL(canvas);
                }
                i2++;
            } while (i2 < i);
        }
        if (LJJIJIIJI.getShowLayoutBounds()) {
            LJLZ(canvas, LLIIIILZ);
        }
    }

    @Override // X.AbstractC538029g, X.AbstractC39201gK
    public final void LJL(long j, float f, InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns) {
        super.LJL(j, f, interfaceC88472Yns);
        if (this.LJLJJL) {
            return;
        }
        LLIIIJ();
        C29321Dc c29321Dc = this.LJLJL;
        C29321Dc LJIJJLI = c29321Dc.LJIJJLI();
        C0D4 c0d4 = c29321Dc.LLI;
        C55952Hn c55952Hn = c0d4.LIZIZ;
        float f2 = c55952Hn.LJZI;
        for (AbstractC538029g abstractC538029g = c0d4.LIZJ; abstractC538029g != c55952Hn; abstractC538029g = abstractC538029g.LJLJLJ) {
            o.LJII(abstractC538029g, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            f2 += abstractC538029g.LJZI;
        }
        if (f2 != c29321Dc.LLII) {
            c29321Dc.LLII = f2;
            if (LJIJJLI != null) {
                LJIJJLI.LJJIJLIJ();
                LJIJJLI.LJJII();
            }
        }
        if (!c29321Dc.LJZI) {
            if (LJIJJLI != null) {
                LJIJJLI.LJJII();
            }
            c29321Dc.LJJIJIIJI();
        }
        if (LJIJJLI != null) {
            if (!c29321Dc.LLIIL && LJIJJLI.LLIFFJFJJ.LIZIZ == C0DK.LayingOut) {
                if (c29321Dc.LJZL == Integer.MAX_VALUE) {
                    int i = LJIJJLI.LLD;
                    c29321Dc.LJZL = i;
                    LJIJJLI.LLD = i + 1;
                } else {
                    "Place was called on a node which was placed already".toString();
                    throw new IllegalStateException("Place was called on a node which was placed already");
                }
            }
        } else {
            c29321Dc.LJZL = 0;
        }
        c29321Dc.LLIFFJFJJ.LJIIJ.LJJIJIIJIL();
    }

    @Override // X.AbstractC538029g
    public final <T extends InterfaceC03740Cs> void LLFZ(C0DA<T> hitTestSource, long j, C1DU<T> hitTestResult, boolean z, boolean z2) {
        C0DN c0dn;
        boolean z3 = z2;
        o.LJIIIZ(hitTestSource, "hitTestSource");
        o.LJIIIZ(hitTestResult, "hitTestResult");
        if (hitTestSource.LIZIZ(this.LJLJL)) {
            if (!C78923UyF.LJIILJJIL(j) || ((c0dn = this.LLFF) != null && this.LJLL && !c0dn.LJ(j))) {
                if (z) {
                    float LJLLLL = LJLLLL(j, LL());
                    if (!Float.isInfinite(LJLLLL) && !Float.isNaN(LJLLLL)) {
                        z3 = false;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            int i = hitTestResult.LJLJI;
            C25710zf<C29321Dc> LJIL = this.LJLJL.LJIL();
            int i2 = LJIL.LJLJI;
            if (i2 > 0) {
                int i3 = i2 - 1;
                C29321Dc[] c29321DcArr = LJIL.LJLIL;
                o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                loop0: do {
                    C29321Dc c29321Dc = c29321DcArr[i3];
                    if (c29321Dc.LJZI) {
                        hitTestSource.LIZJ(c29321Dc, j, hitTestResult, z, z3);
                        long LIZJ = hitTestResult.LIZJ();
                        if (Float.intBitsToFloat((int) (LIZJ >> 32)) < 0.0f && C47261Igj.LJJIIZ(LIZJ)) {
                            AbstractC538029g abstractC538029g = c29321Dc.LLI.LIZJ;
                            abstractC538029g.getClass();
                            C1M3 LLF = abstractC538029g.LLF(C17J.LJJI(16));
                            if (LLF == null) {
                                break;
                            }
                            C1M3 c1m3 = LLF.LJLIL;
                            if (c1m3.LJLJL) {
                                if ((c1m3.LJLJI & 16) == 0) {
                                    break;
                                }
                                for (C1M3 c1m32 = c1m3.LJLJJL; c1m32 != null; c1m32 = c1m32.LJLJJL) {
                                    if ((c1m32.LJLILLLLZI & 16) != 0 && (c1m32 instanceof C1DO) && ((C1DO) c1m32).LJIIIZ()) {
                                        hitTestResult.LJLJI = hitTestResult.LJLJJI - 1;
                                    }
                                }
                                break loop0;
                            }
                            "Check failed.".toString();
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                    i3--;
                } while (i3 >= 0);
            }
            hitTestResult.LJLJI = i;
        }
    }
}
