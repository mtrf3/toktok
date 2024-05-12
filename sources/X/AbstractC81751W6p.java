package X;

/* renamed from: X.W6p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81751W6p<T> extends AbstractC48384Iyq<T> {
    public final C81767W7f LJI;
    public final InterfaceC81754W6s LJII;

    @Override // X.AbstractC48384Iyq, X.W4W
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (!LIZIZ()) {
            this.LJII.LJ(this.LJI.LIZIZ);
            this.LJI.LJIIJ();
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJIILJJIL(int i, Object obj) {
        boolean LIZLLL = AbstractC81756W6u.LIZLLL(i);
        if (LJIIL(obj, LIZLLL)) {
            if (LIZLLL) {
                InterfaceC81754W6s interfaceC81754W6s = this.LJII;
                C81767W7f c81767W7f = this.LJI;
                interfaceC81754W6s.LJIIIIZZ(c81767W7f.LIZ, c81767W7f.LIZIZ, c81767W7f.LJFF());
            } else {
                InterfaceC81754W6s interfaceC81754W6s2 = this.LJII;
                if (!(interfaceC81754W6s2 instanceof UF5)) {
                    return;
                }
                C81767W7f c81767W7f2 = this.LJI;
                ((UF5) interfaceC81754W6s2).LJIIJJI(c81767W7f2.LIZ, c81767W7f2.LIZIZ, c81767W7f2.LJFF());
            }
        }
    }

    public AbstractC81751W6p(InterfaceC81759W6x interfaceC81759W6x, C81767W7f c81767W7f, C81753W6r c81753W6r) {
        C81939WDv.LIZIZ();
        this.LJI = c81767W7f;
        this.LJII = c81753W6r;
        C81939WDv.LIZIZ();
        c81753W6r.LJIIJ(c81767W7f.LIZ, c81767W7f.LIZLLL, c81767W7f.LIZIZ, c81767W7f.LJFF());
        C81939WDv.LIZIZ();
        C81939WDv.LIZIZ();
        interfaceC81759W6x.LIZIZ(new C81752W6q(this), c81767W7f);
        C81939WDv.LIZIZ();
        C81939WDv.LIZIZ();
    }
}
