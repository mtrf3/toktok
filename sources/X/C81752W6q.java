package X;

/* renamed from: X.W6q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81752W6q extends AbstractC81756W6u<Object> {
    public final /* synthetic */ AbstractC81751W6p LIZIZ;

    @Override // X.AbstractC81756W6u
    public final void LJFF() {
        AbstractC81751W6p abstractC81751W6p = this.LIZIZ;
        synchronized (abstractC81751W6p) {
            C32151Nz.LJIIIZ(abstractC81751W6p.LJIIIIZZ());
        }
    }

    public C81752W6q(AbstractC81751W6p abstractC81751W6p) {
        this.LIZIZ = abstractC81751W6p;
    }

    @Override // X.AbstractC81756W6u
    public final void LJI(Throwable th) {
        AbstractC81751W6p abstractC81751W6p = this.LIZIZ;
        if (abstractC81751W6p.LJIIJ(th)) {
            InterfaceC81754W6s interfaceC81754W6s = abstractC81751W6p.LJII;
            C81767W7f c81767W7f = abstractC81751W6p.LJI;
            interfaceC81754W6s.LJFF(c81767W7f.LIZ, c81767W7f.LIZIZ, th, c81767W7f.LJFF());
        }
    }

    @Override // X.AbstractC81756W6u
    public final void LJIIIIZZ(float f) {
        this.LIZIZ.LJIIJJI(f);
    }

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        this.LIZIZ.LJIILJJIL(i, obj);
    }
}
