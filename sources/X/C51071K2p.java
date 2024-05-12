package X;

import kotlin.jvm.internal.o;

/* renamed from: X.K2p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51071K2p {
    public final C74053T4n LIZ;
    public final C0CM LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC51078K2w LIZLLL;
    public final boolean LJ;
    public AbstractC029409q<?> LJFF;
    public boolean LJI;

    public final void LIZ() {
        this.LIZ.LJIIIZ();
        AbstractC029409q<?> abstractC029409q = this.LJFF;
        if (abstractC029409q != null) {
            int itemCount = abstractC029409q.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                KEI LJII = this.LIZ.LJII();
                ((C51217K8f) this.LIZLLL).LIZLLL(LJII, i);
                C74053T4n.LIZJ(this.LIZ, LJII, 0, false, 2);
            }
            if (itemCount > 0) {
                int tabCount = this.LIZ.getTabCount() - 1;
                int currentItem = this.LIZIZ.getCurrentItem();
                if (currentItem <= tabCount) {
                    tabCount = currentItem;
                }
                if (tabCount != this.LIZ.getSelectedTabPosition()) {
                    C74053T4n c74053T4n = this.LIZ;
                    c74053T4n.LJIIJJI(c74053T4n.LJI(tabCount), true);
                }
            }
        }
    }

    public C51071K2p(C74053T4n tabLayout, C0CM viewPager, C51217K8f c51217K8f, boolean z) {
        o.LJIIIZ(tabLayout, "tabLayout");
        o.LJIIIZ(viewPager, "viewPager");
        this.LIZ = tabLayout;
        this.LIZIZ = viewPager;
        this.LIZJ = true;
        this.LIZLLL = c51217K8f;
        this.LJ = z;
    }
}
