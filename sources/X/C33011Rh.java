package X;

import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33011Rh implements InterfaceC13480fw {
    public final InterfaceC13350fj LIZ;
    public final InterfaceC13360fk LIZIZ;
    public final C13500fy LIZJ;
    public final C13530g1 LIZLLL;
    public final C13340fi LJ;
    public final IDqS416S0100000 LJFF;

    public final InterfaceC33001Rg LIZIZ(C13450ft c13450ft) {
        InterfaceC33001Rg LIZ;
        C13500fy c13500fy = this.LIZJ;
        IDqS172S0200000 iDqS172S0200000 = new IDqS172S0200000(this, c13450ft, 49);
        c13500fy.getClass();
        synchronized (c13500fy.LIZ) {
            LIZ = c13500fy.LIZIZ.LIZ(c13450ft);
            if (LIZ != null) {
                if (!LIZ.LJ()) {
                    c13500fy.LIZIZ.LIZJ(c13450ft);
                }
            }
            try {
                LIZ = (InterfaceC33001Rg) iDqS172S0200000.invoke(new IDqS172S0200000(c13500fy, c13450ft, 48));
                synchronized (c13500fy.LIZ) {
                    if (c13500fy.LIZIZ.LIZ(c13450ft) == null && LIZ.LJ()) {
                        c13500fy.LIZIZ.LIZIZ(c13450ft, LIZ);
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
        return LIZ;
    }

    public C33011Rh(C32941Ra c32941Ra, C32951Rb c32951Rb) {
        C13500fy typefaceRequestCache = C13510fz.LIZ;
        C13530g1 c13530g1 = new C13530g1(C13510fz.LIZIZ);
        C13340fi c13340fi = new C13340fi();
        o.LJIIIZ(typefaceRequestCache, "typefaceRequestCache");
        this.LIZ = c32941Ra;
        this.LIZIZ = c32951Rb;
        this.LIZJ = typefaceRequestCache;
        this.LIZLLL = c13530g1;
        this.LJ = c13340fi;
        this.LJFF = new IDqS416S0100000(this, 216);
    }

    @Override // X.InterfaceC13480fw
    public final InterfaceC33001Rg LIZ(AbstractC13490fx abstractC13490fx, C13640gC fontWeight, int i, int i2) {
        o.LJIIIZ(fontWeight, "fontWeight");
        this.LIZIZ.LLJJIII(abstractC13490fx);
        C13640gC LLZLLIL = this.LIZIZ.LLZLLIL(fontWeight);
        this.LIZIZ.LLFF(i);
        this.LIZIZ.LLJJI(i2);
        this.LIZ.getCacheKey();
        return LIZIZ(new C13450ft(abstractC13490fx, LLZLLIL, i, i2, null));
    }
}
