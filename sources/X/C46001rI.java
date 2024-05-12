package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1rI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46001rI extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC538029g, C76800UCe> {
    public static final C46001rI LJLIL = new C46001rI();

    public C46001rI() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC538029g abstractC538029g) {
        AbstractC538029g coordinator = abstractC538029g;
        o.LJIIIZ(coordinator, "coordinator");
        if (coordinator.isValid()) {
            C0DB c0db = coordinator.LL;
            if (c0db == null) {
                coordinator.LLIILII();
            } else {
                C0DB c0db2 = AbstractC538029g.LLI;
                c0db2.getClass();
                c0db2.LIZ = c0db.LIZ;
                c0db2.LIZIZ = c0db.LIZIZ;
                c0db2.LIZJ = c0db.LIZJ;
                c0db2.LIZLLL = c0db.LIZLLL;
                c0db2.LJ = c0db.LJ;
                c0db2.LJFF = c0db.LJFF;
                c0db2.LJI = c0db.LJI;
                c0db2.LJII = c0db.LJII;
                c0db2.LJIIIIZZ = c0db.LJIIIIZZ;
                coordinator.LLIILII();
                if (c0db2.LIZ != c0db.LIZ || c0db2.LIZIZ != c0db.LIZIZ || c0db2.LIZJ != c0db.LIZJ || c0db2.LIZLLL != c0db.LIZLLL || c0db2.LJ != c0db.LJ || c0db2.LJFF != c0db.LJFF || c0db2.LJI != c0db.LJI || c0db2.LJII != c0db.LJII || c0db2.LJIIIIZZ != c0db.LJIIIIZZ) {
                    C29321Dc c29321Dc = coordinator.LJLJL;
                    C0DV c0dv = c29321Dc.LLIFFJFJJ;
                    if (c0dv.LJIIIZ > 0) {
                        if (c0dv.LJIIIIZZ) {
                            c29321Dc.LJJJJIZL(false);
                        }
                        c0dv.LJIIJ.LJLIL();
                    }
                    C0DR c0dr = c29321Dc.LJLJLJ;
                    if (c0dr != null) {
                        c0dr.LJ(c29321Dc);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
