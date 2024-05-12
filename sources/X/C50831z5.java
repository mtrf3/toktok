package X;

import androidx.compose.ui.platform.g1;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1z5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50831z5 extends AbstractC014804a implements InterfaceC44951pb {
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final boolean LJLJJLL;

    public C50831z5() {
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
        return C47959Irz.LIZIZ(this.LJLJJL, C47959Irz.LIZIZ(this.LJLJJI, C47959Irz.LIZIZ(this.LJLJI, Float.floatToIntBits(this.LJLILLLLZI) * 31, 31), 31), 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r0 != Integer.MAX_VALUE) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r1 != Integer.MAX_VALUE) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZ(X.InterfaceC23370vt r8) {
        /*
            r7 = this;
            float r0 = r7.LJLJJI
            r6 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = X.C23390vv.LIZJ(r0, r6)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            if (r0 != 0) goto L84
            float r0 = r7.LJLJJI
            X.0vv r2 = new X.0vv
            r2.<init>(r0)
            float r0 = (float) r4
            X.0vv r1 = new X.0vv
            r1.<init>(r0)
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L22
            r2 = r1
        L22:
            float r0 = r2.LJLIL
            int r3 = r8.LJJIJ(r0)
        L28:
            float r0 = r7.LJLJJL
            boolean r0 = X.C23390vv.LIZJ(r0, r6)
            if (r0 != 0) goto L80
            float r0 = r7.LJLJJL
            X.0vv r2 = new X.0vv
            r2.<init>(r0)
            float r0 = (float) r4
            X.0vv r1 = new X.0vv
            r1.<init>(r0)
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L44
            r2 = r1
        L44:
            float r0 = r2.LJLIL
            int r2 = r8.LJJIJ(r0)
        L4a:
            float r0 = r7.LJLILLLLZI
            boolean r0 = X.C23390vv.LIZJ(r0, r6)
            if (r0 != 0) goto L7e
            float r0 = r7.LJLILLLLZI
            int r1 = r8.LJJIJ(r0)
            if (r1 <= r3) goto L5b
            r1 = r3
        L5b:
            if (r1 >= 0) goto L7b
            r1 = 0
        L5e:
            float r0 = r7.LJLJI
            boolean r0 = X.C23390vv.LIZJ(r0, r6)
            if (r0 != 0) goto L73
            float r0 = r7.LJLJI
            int r0 = r8.LJJIJ(r0)
            if (r0 <= r2) goto L6f
            r0 = r2
        L6f:
            if (r0 >= 0) goto L78
            r0 = 0
        L72:
            r4 = r0
        L73:
            long r0 = X.C78555UsJ.LIZJ(r1, r3, r4, r2)
            return r0
        L78:
            if (r0 == r5) goto L73
            goto L72
        L7b:
            if (r1 == r5) goto L7e
            goto L5e
        L7e:
            r1 = 0
            goto L5e
        L80:
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L4a
        L84:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50831z5.LIZ(X.0vt):long");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C50831z5)) {
            return false;
        }
        C50831z5 c50831z5 = (C50831z5) obj;
        if (!C23390vv.LIZJ(this.LJLILLLLZI, c50831z5.LJLILLLLZI) || !C23390vv.LIZJ(this.LJLJI, c50831z5.LJLJI) || !C23390vv.LIZJ(this.LJLJJI, c50831z5.LJLJJI) || !C23390vv.LIZJ(this.LJLJJL, c50831z5.LJLJJL) || this.LJLJJLL != c50831z5.LJLJJLL) {
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
        long LIZ = LIZ(interfaceC39181gI);
        if (C23360vs.LJFF(LIZ)) {
            return C23360vs.LJII(LIZ);
        }
        return C78555UsJ.LJIIJJI(interfaceC274115t.LJJLJLI(i), LIZ);
    }

    @Override // X.InterfaceC44951pb
    public final int LJIIJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        long LIZ = LIZ(interfaceC39181gI);
        if (C23360vs.LJFF(LIZ)) {
            return C23360vs.LJII(LIZ);
        }
        return C78555UsJ.LJIIJJI(interfaceC274115t.LJJJI(i), LIZ);
    }

    @Override // X.InterfaceC44951pb
    public final InterfaceC273515n LJIILL(InterfaceC44861pS measure, InterfaceC39071g7 interfaceC39071g7, long j) {
        int LJIIIZ;
        int LJII;
        int LJIIIIZZ;
        int LJI;
        long LIZJ;
        InterfaceC273515n LJJLIL;
        o.LJIIIZ(measure, "$this$measure");
        long LIZ = LIZ(measure);
        if (this.LJLJJLL) {
            LIZJ = C78555UsJ.LJIIIZ(j, LIZ);
        } else {
            if (!C23390vv.LIZJ(this.LJLILLLLZI, Float.NaN)) {
                LJIIIZ = C23360vs.LJIIIZ(LIZ);
            } else {
                LJIIIZ = C23360vs.LJIIIZ(j);
                int LJII2 = C23360vs.LJII(LIZ);
                if (LJIIIZ > LJII2) {
                    LJIIIZ = LJII2;
                }
            }
            if (!C23390vv.LIZJ(this.LJLJJI, Float.NaN)) {
                LJII = C23360vs.LJII(LIZ);
            } else {
                LJII = C23360vs.LJII(j);
                int LJIIIZ2 = C23360vs.LJIIIZ(LIZ);
                if (LJII < LJIIIZ2) {
                    LJII = LJIIIZ2;
                }
            }
            if (!C23390vv.LIZJ(this.LJLJI, Float.NaN)) {
                LJIIIIZZ = C23360vs.LJIIIIZZ(LIZ);
            } else {
                LJIIIIZZ = C23360vs.LJIIIIZZ(j);
                int LJI2 = C23360vs.LJI(LIZ);
                if (LJIIIIZZ > LJI2) {
                    LJIIIIZZ = LJI2;
                }
            }
            if (!C23390vv.LIZJ(this.LJLJJL, Float.NaN)) {
                LJI = C23360vs.LJI(LIZ);
            } else {
                LJI = C23360vs.LJI(j);
                int LJIIIIZZ2 = C23360vs.LJIIIIZZ(LIZ);
                if (LJI < LJIIIIZZ2) {
                    LJI = LJIIIIZZ2;
                }
            }
            LIZJ = C78555UsJ.LIZJ(LJIIIZ, LJII, LJIIIIZZ, LJI);
        }
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(LIZJ);
        LJJLIL = measure.LJJLIL(LJJJIL.LJLIL, LJJJIL.LJLILLLLZI, C113554cx.LJJJLIIL(), new IDqS416S0100000(LJJJIL, 186));
        return LJJLIL;
    }

    @Override // X.InterfaceC44951pb
    public final int LJJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        long LIZ = LIZ(interfaceC39181gI);
        if (C23360vs.LJ(LIZ)) {
            return C23360vs.LJI(LIZ);
        }
        return C78555UsJ.LJIIJ(interfaceC274115t.LJJLIIIJILLIZJL(i), LIZ);
    }

    @Override // X.InterfaceC44951pb
    public final int LJJJIL(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        long LIZ = LIZ(interfaceC39181gI);
        if (C23360vs.LJ(LIZ)) {
            return C23360vs.LJI(LIZ);
        }
        return C78555UsJ.LJIIJ(interfaceC274115t.LJJLIIIJLLLLLLLZ(i), LIZ);
    }

    public C50831z5(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    public C50831z5(float f, float f2, float f3, float f4, boolean z) {
        super(g1.LIZ);
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = f3;
        this.LJLJJL = f4;
        this.LJLJJLL = z;
    }
}
