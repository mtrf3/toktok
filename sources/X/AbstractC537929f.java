package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.29f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC537929f extends AbstractC45981rG implements InterfaceC39071g7 {
    public final AbstractC538029g LJLJL;
    public final C39061g6 LJLJLJ;
    public long LJLJLLL;
    public java.util.Map<AbstractC272415c, Integer> LJLL;
    public final C39041g4 LJLLI;
    public InterfaceC273515n LJLLILLLL;
    public final java.util.Map<AbstractC272415c, Integer> LJLLJ;

    @Override // X.AbstractC39201gK, X.InterfaceC274115t
    public final Object LJIIJJI() {
        return this.LJLJL.LJIIJJI();
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJI() {
        return this.LJLJL.LJJJJI();
    }

    @Override // X.AbstractC45981rG
    public final AbstractC45981rG LJLILLLLZI() {
        AbstractC538029g abstractC538029g = this.LJLJL.LJLJLJ;
        if (abstractC538029g != null) {
            return abstractC538029g.LJLLLLLL;
        }
        return null;
    }

    @Override // X.AbstractC45981rG
    public final boolean LJLJJI() {
        if (this.LJLLILLLL != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC45981rG
    public final C29321Dc LJLJJL() {
        return this.LJLJL.LJLJL;
    }

    @Override // X.AbstractC45981rG
    public final InterfaceC273515n LJLJJLL() {
        InterfaceC273515n interfaceC273515n = this.LJLLILLLL;
        if (interfaceC273515n != null) {
            return interfaceC273515n;
        }
        "LookaheadDelegate has not been measured yet when measureResult is requested.".toString();
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // X.AbstractC45981rG
    public final AbstractC45981rG LJLJL() {
        AbstractC538029g abstractC538029g = this.LJLJL.LJLJLLL;
        if (abstractC538029g != null) {
            return abstractC538029g.LJLLLLLL;
        }
        return null;
    }

    @Override // X.AbstractC45981rG
    public final void LJLL() {
        LJL(this.LJLJLLL, 0.0f, null);
    }

    public void LJLLILLLL() {
        C39191gJ c39191gJ = AbstractC274515x.LIZ;
        int width = LJLJJLL().getWidth();
        EnumC23500w6 enumC23500w6 = this.LJLJL.LJLJL.LJLZ;
        InterfaceC274415w interfaceC274415w = AbstractC274515x.LIZLLL;
        c39191gJ.getClass();
        int i = AbstractC274515x.LIZJ;
        EnumC23500w6 enumC23500w62 = AbstractC274515x.LIZIZ;
        AbstractC274515x.LIZJ = width;
        AbstractC274515x.LIZIZ = enumC23500w6;
        boolean LJIIL = C39191gJ.LJIIL(c39191gJ, this);
        LJLJJLL().LIZJ();
        this.LJLJJLL = LJIIL;
        AbstractC274515x.LIZJ = i;
        AbstractC274515x.LIZIZ = enumC23500w62;
        AbstractC274515x.LIZLLL = interfaceC274415w;
    }

    @Override // X.InterfaceC23370vt
    public final float getDensity() {
        return this.LJLJL.getDensity();
    }

    @Override // X.InterfaceC39181gI
    public final EnumC23500w6 getLayoutDirection() {
        return this.LJLJL.LJLJL.LJLZ;
    }

    @Override // X.AbstractC45981rG
    public final InterfaceC274415w LJLJI() {
        return this.LJLLI;
    }

    @Override // X.AbstractC45981rG
    public final long LJLJLJ() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC274115t
    public int LJJJI(int i) {
        AbstractC538029g abstractC538029g = this.LJLJL.LJLJLJ;
        o.LJI(abstractC538029g);
        AbstractC537929f abstractC537929f = abstractC538029g.LJLLLLLL;
        o.LJI(abstractC537929f);
        return abstractC537929f.LJJJI(i);
    }

    @Override // X.InterfaceC274115t
    public int LJJLIIIJILLIZJL(int i) {
        AbstractC538029g abstractC538029g = this.LJLJL.LJLJLJ;
        o.LJI(abstractC538029g);
        AbstractC537929f abstractC537929f = abstractC538029g.LJLLLLLL;
        o.LJI(abstractC537929f);
        return abstractC537929f.LJJLIIIJILLIZJL(i);
    }

    @Override // X.InterfaceC274115t
    public int LJJLIIIJLLLLLLLZ(int i) {
        AbstractC538029g abstractC538029g = this.LJLJL.LJLJLJ;
        o.LJI(abstractC538029g);
        AbstractC537929f abstractC537929f = abstractC538029g.LJLLLLLL;
        o.LJI(abstractC537929f);
        return abstractC537929f.LJJLIIIJLLLLLLLZ(i);
    }

    @Override // X.InterfaceC274115t
    public int LJJLJLI(int i) {
        AbstractC538029g abstractC538029g = this.LJLJL.LJLJLJ;
        o.LJI(abstractC538029g);
        AbstractC537929f abstractC537929f = abstractC538029g.LJLLLLLL;
        o.LJI(abstractC537929f);
        return abstractC537929f.LJJLJLI(i);
    }

    public AbstractC537929f(AbstractC538029g coordinator, C39061g6 lookaheadScope) {
        o.LJIIIZ(coordinator, "coordinator");
        o.LJIIIZ(lookaheadScope, "lookaheadScope");
        this.LJLJL = coordinator;
        this.LJLJLJ = lookaheadScope;
        this.LJLJLLL = C23450w1.LIZIZ;
        this.LJLLI = new C39041g4(this);
        this.LJLLJ = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJLLI(X.AbstractC537929f r2, X.InterfaceC273515n r3) {
        /*
            r2.getClass()
            if (r3 == 0) goto L18
            int r1 = r3.getWidth()
            int r0 = r3.getHeight()
            long r0 = X.C78996UzQ.LIZIZ(r1, r0)
            r2.LJLIIIL(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L1d
        L18:
            r0 = 0
            r2.LJLIIIL(r0)
        L1d:
            X.15n r0 = r2.LJLLILLLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 != 0) goto L6e
            if (r3 == 0) goto L6e
            java.util.Map<X.15c, java.lang.Integer> r0 = r2.LJLL
            if (r0 == 0) goto L31
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3d
        L31:
            java.util.Map r0 = r3.LJI()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L6e
        L3d:
            java.util.Map r1 = r3.LJI()
            java.util.Map<X.15c, java.lang.Integer> r0 = r2.LJLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L6e
            X.29g r0 = r2.LJLJL
            X.1Dc r0 = r0.LJLJL
            X.0DV r0 = r0.LLIFFJFJJ
            X.1rQ r0 = r0.LJIIJJI
            kotlin.jvm.internal.o.LJI(r0)
            X.1DM r0 = r0.LJLLI
            r0.LJI()
            java.util.Map<X.15c, java.lang.Integer> r1 = r2.LJLL
            if (r1 != 0) goto L64
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.LJLL = r1
        L64:
            r1.clear()
            java.util.Map r0 = r3.LJI()
            r1.putAll(r0)
        L6e:
            r2.LJLLILLLL = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC537929f.LJLLI(X.29f, X.15n):void");
    }

    @Override // X.AbstractC39201gK
    public final void LJL(long j, float f, InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns) {
        if (!C23450w1.LIZIZ(this.LJLJLLL, j)) {
            this.LJLJLLL = j;
            C46081rQ c46081rQ = this.LJLJL.LJLJL.LLIFFJFJJ.LJIIJJI;
            if (c46081rQ != null) {
                c46081rQ.LJLILLLLZI();
            }
            AbstractC45981rG.LJLJLLL(this.LJLJL);
        }
        if (this.LJLJJL) {
            return;
        }
        LJLLILLLL();
    }
}
