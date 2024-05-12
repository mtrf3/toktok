package X;

/* renamed from: X.Jif, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49929Jif {
    public final C49915JiR LIZ;

    public C49929Jif() {
        C49915JiR c49915JiR = new C49915JiR();
        this.LIZ = c49915JiR;
        c49915JiR.LJLLLL = C49939Jip.LIZ;
    }

    public final void LIZ(C50287JoR c50287JoR) {
        int i;
        if (c50287JoR != null) {
            C49915JiR c49915JiR = this.LIZ;
            c49915JiR.LJLJLLL = c50287JoR;
            c49915JiR.LJLLJ = Integer.valueOf(c50287JoR.getSortType());
            this.LIZ.LJLLL = Integer.valueOf(c50287JoR.getFilterBy());
            C49915JiR c49915JiR2 = this.LIZ;
            if (!c50287JoR.isDefaultOption() || !c50287JoR.isDefaultResearchOption()) {
                i = 1;
            } else {
                i = 0;
            }
            c49915JiR2.LJLLILLLL = Integer.valueOf(i);
        }
    }
}
