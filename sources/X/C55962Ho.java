package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Ho, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55962Ho extends AbstractC537929f {
    public final InterfaceC40491iP LJLLL;
    public final C1DZ LJLLLL;
    public final /* synthetic */ C55982Hq LJLLLLLL;

    @Override // X.InterfaceC39071g7
    public final AbstractC39201gK LJJJIL(long j) {
        InterfaceC40491iP interfaceC40491iP = this.LJLLL;
        C55982Hq c55982Hq = this.LJLLLLLL;
        LJLIIL(j);
        AbstractC538029g abstractC538029g = c55982Hq.LJLJLJ;
        o.LJI(abstractC538029g);
        AbstractC537929f abstractC537929f = abstractC538029g.LJLLLLLL;
        o.LJI(abstractC537929f);
        abstractC537929f.LJJJIL(j);
        interfaceC40491iP.LJIIJ(C78996UzQ.LIZIZ(abstractC537929f.LJLJJLL().getWidth(), abstractC537929f.LJLJJLL().getHeight()));
        AbstractC537929f.LJLLI(this, this.LJLLLL);
        return this;
    }

    @Override // X.AbstractC45981rG
    public final int LJLIL(AbstractC272415c alignmentLine) {
        o.LJIIIZ(alignmentLine, "alignmentLine");
        int LIZ = C87277YNd.LIZ(this, alignmentLine);
        this.LJLLJ.put(alignmentLine, Integer.valueOf(LIZ));
        return LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1DZ] */
    public C55962Ho(C55982Hq c55982Hq, C39061g6 scope, InterfaceC40491iP interfaceC40491iP) {
        super(c55982Hq, scope);
        o.LJIIIZ(scope, "scope");
        this.LJLLLLLL = c55982Hq;
        this.LJLLL = interfaceC40491iP;
        this.LJLLLL = new InterfaceC273515n() { // from class: X.1DZ
            public final C93833mF LIZ = C113554cx.LJJJLIIL();

            @Override // X.InterfaceC273515n
            public final void LIZJ() {
                C39191gJ c39191gJ = AbstractC274515x.LIZ;
                AbstractC538029g abstractC538029g = C55962Ho.this.LJLLLLLL.LJLJLJ;
                o.LJI(abstractC538029g);
                AbstractC537929f abstractC537929f = abstractC538029g.LJLLLLLL;
                o.LJI(abstractC537929f);
                AbstractC274515x.LIZLLL(c39191gJ, abstractC537929f, 0, 0);
            }

            @Override // X.InterfaceC273515n
            public final int getHeight() {
                AbstractC538029g abstractC538029g = C55962Ho.this.LJLLLLLL.LJLJLJ;
                o.LJI(abstractC538029g);
                AbstractC537929f abstractC537929f = abstractC538029g.LJLLLLLL;
                o.LJI(abstractC537929f);
                return abstractC537929f.LJLJJLL().getHeight();
            }

            @Override // X.InterfaceC273515n
            public final int getWidth() {
                AbstractC538029g abstractC538029g = C55962Ho.this.LJLLLLLL.LJLJLJ;
                o.LJI(abstractC538029g);
                AbstractC537929f abstractC537929f = abstractC538029g.LJLLLLLL;
                o.LJI(abstractC537929f);
                return abstractC537929f.LJLJJLL().getWidth();
            }

            @Override // X.InterfaceC273515n
            public final java.util.Map<AbstractC272415c, Integer> LJI() {
                return this.LIZ;
            }
        };
    }
}
