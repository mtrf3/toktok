package X;

/* renamed from: X.4Xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111114Xr {
    public final C80261Vej LIZ;
    public final C0CM LIZIZ;
    public AbstractC029409q<?> LIZJ;
    public boolean LIZLLL;

    public final void LIZ() {
        this.LIZ.removeAllTabs();
        AbstractC029409q<?> abstractC029409q = this.LIZJ;
        if (abstractC029409q != null) {
            int itemCount = abstractC029409q.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                C78856UxA newTab = this.LIZ.newTab();
                HHD.LJLIL.LJIIJ(newTab);
                this.LIZ.addTab(newTab, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.LIZIZ.getCurrentItem(), this.LIZ.getTabCount() - 1);
                if (min != this.LIZ.getSelectedTabPosition()) {
                    C80261Vej c80261Vej = this.LIZ;
                    c80261Vej.selectTab(c80261Vej.getTabAt(min));
                }
            }
        }
    }

    public C111114Xr(C80261Vej c80261Vej, C0CM c0cm) {
        this.LIZ = c80261Vej;
        this.LIZIZ = c0cm;
    }
}
