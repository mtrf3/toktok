package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11460cg {
    public final C1QN LIZ;
    public final InterfaceC516520z LIZIZ;
    public final int LIZJ;
    public final InterfaceC11250cL LIZLLL;

    public final C11450cf LIZ(int i, int i2, long j) {
        int LJIIIIZZ;
        Object LJII = this.LIZ.LJII(i);
        List<AbstractC39201gK> LJIJI = this.LIZIZ.LJIJI(i, j);
        if (C23360vs.LJFF(j)) {
            LJIIIIZZ = C23360vs.LJIIIZ(j);
        } else if (C23360vs.LJ(j)) {
            LJIIIIZZ = C23360vs.LJIIIIZZ(j);
        } else {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        return this.LIZLLL.LIZ(i, LJII, LJIIIIZZ, i2, LJIJI);
    }

    public C11460cg(C1QN itemProvider, InterfaceC516520z measureScope, int i, C1QF c1qf) {
        o.LJIIIZ(itemProvider, "itemProvider");
        o.LJIIIZ(measureScope, "measureScope");
        this.LIZ = itemProvider;
        this.LIZIZ = measureScope;
        this.LIZJ = i;
        this.LIZLLL = c1qf;
    }
}
