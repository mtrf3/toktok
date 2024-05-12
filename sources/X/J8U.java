package X;

import android.text.TextUtils;

/* loaded from: classes9.dex */
public final class J8U extends JHL<J8U> {
    public String LJJL;

    public J8U() {
        super("tab_stay_time");
    }

    @Override // X.JHM
    public final void LJII() {
        String str = this.LJJL;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("duration", str, c1799074g);
        LJ("enter_from", this.LIZLLL, c1799074g);
        LJ("group_id", C227768wm.LIZIZ(null), c1799074g);
        LJ("author_id", C227768wm.LIZJ(null), c1799074g);
        LJ("city_info", "", c1799074g);
        LJ("enter_method", null, c1799074g);
        if (!TextUtils.isEmpty(null)) {
            LJ("page_type", null, c1799074g);
        }
    }
}
