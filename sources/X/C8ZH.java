package X;

/* renamed from: X.8ZH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8ZH {
    public final C80675VlP LIZ;
    public final C0CM LIZIZ;
    public final C8ZZ LIZJ;
    public AbstractC029409q<?> LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        this.LIZ.LJIILIIL();
        AbstractC029409q<?> abstractC029409q = this.LIZLLL;
        if (abstractC029409q != null) {
            int itemCount = abstractC029409q.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                C80675VlP c80675VlP = this.LIZ;
                C80674VlO LJIIJJI = c80675VlP.LJIIJJI(c80675VlP.LL);
                this.LIZJ.LIZ(LJIIJJI, i);
                this.LIZ.LIZJ(LJIIJJI, false);
            }
            if (itemCount > 0) {
                int tabCount = this.LIZ.getTabCount() - 1;
                int currentItem = this.LIZIZ.getCurrentItem();
                if (currentItem <= tabCount) {
                    tabCount = currentItem;
                }
                if (tabCount != this.LIZ.getSelectedTabPosition()) {
                    C80675VlP c80675VlP2 = this.LIZ;
                    c80675VlP2.LJIILJJIL(c80675VlP2.LJIIJ(tabCount), true);
                }
            }
        }
    }

    public C8ZH(C80675VlP c80675VlP, C0CM c0cm, C8ZO c8zo) {
        this.LIZ = c80675VlP;
        this.LIZIZ = c0cm;
        this.LIZJ = c8zo;
    }
}
