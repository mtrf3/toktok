package X;

/* renamed from: X.aU5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93637aU5 {
    public final C93635aU3 LIZ;
    public final C0CM LIZIZ;
    public final InterfaceC93636aU4 LIZJ;
    public AbstractC029409q<?> LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        if (!this.LJ) {
            AbstractC029409q<?> adapter = this.LIZIZ.getAdapter();
            this.LIZLLL = adapter;
            if (adapter != null) {
                this.LJ = true;
                this.LIZIZ.LIZIZ(new C94170acg(this.LIZ));
                this.LIZ.LIZIZ(new C94171ach(this.LIZIZ, true));
                this.LIZLLL.registerAdapterDataObserver(new C94169acf(this));
                LIZIZ();
                this.LIZ.LJIILL(this.LIZIZ.getCurrentItem(), 0.0f, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public final void LIZIZ() {
        this.LIZ.LJIIL();
        AbstractC029409q<?> abstractC029409q = this.LIZLLL;
        if (abstractC029409q != null) {
            int itemCount = abstractC029409q.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                C93633aU1 LJIIJ = this.LIZ.LJIIJ();
                this.LIZJ.LIZ(LJIIJ, i);
                this.LIZ.LIZJ(LJIIJ, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.LIZIZ.getCurrentItem(), this.LIZ.getTabCount() - 1);
                if (min != this.LIZ.getSelectedTabPosition()) {
                    C93635aU3 c93635aU3 = this.LIZ;
                    c93635aU3.LJIILIIL(c93635aU3.LJIIIZ(min), true, false);
                }
            }
        }
    }

    public C93637aU5(C93635aU3 c93635aU3, C0CM c0cm, InterfaceC93636aU4 interfaceC93636aU4) {
        this.LIZ = c93635aU3;
        this.LIZIZ = c0cm;
        this.LIZJ = interfaceC93636aU4;
    }
}
