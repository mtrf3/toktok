package X;

/* renamed from: X.7ik, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193587ik extends JHM {
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;

    public C193587ik() {
        super("enter_personal_detail_backup");
    }

    @Override // X.JHM
    public final void LJII() {
        String str = this.LJIILL;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str, c1798874e);
        LJ("to_user_id", this.LJIILJJIL, c1798874e);
        String str2 = this.LIZLLL;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("enter_from", str2, c1799074g);
        LJ("enter_method", null, c1799074g);
        LJ("request_id", this.LJIILLIIL, c1798874e);
        if (C227768wm.LJJIIJ(this.LIZLLL)) {
            LIZIZ(this.LJIILL);
        }
    }
}
