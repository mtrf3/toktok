package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Jyg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50922Jyg extends JHM<C50922Jyg> {
    public String LJIILJJIL;
    public String LJIILL;
    public Long LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;

    public C50922Jyg() {
        super("profile_tab_client_show");
    }

    @Override // X.JHM
    public final void LJII() {
        String str = this.LIZLLL;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("enter_from", str, c1799074g);
        String str2 = this.LJIILJJIL;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str2, c1798874e);
        LJ("author_id", this.LJIILL, c1798874e);
        if (!TextUtils.isEmpty(this.LJIJI)) {
            LJ("tab_name", this.LJIJI, c1799074g);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_fresh")) {
            C2UL.LIZ();
        }
        if (TextUtils.equals(this.LIZLLL, "sticker_profile_detail")) {
            LJ("tab_name", "effect", c1799074g);
        }
        LJ("request_id", this.LJIJ, c1798874e);
        LJ("content", this.LJIIZILJ, c1799074g);
        if (o.LJ("prop_page", this.LIZLLL)) {
            LJ("log_pb", C3A5.LIZ.LIZIZ(this.LJIJ), c1798874e);
        } else {
            LJ("music_id", String.valueOf(this.LJIILLIIL), c1798874e);
            if (o.LJ("homepage_fresh", this.LIZLLL) || ujb.o.LJJJJIZL("homepage_channel", this.LIZLLL, true)) {
                LIZIZ(this.LJIJ);
            }
        }
        if (C227768wm.LJJI(this.LIZLLL)) {
            LIZLLL("tag_id", null);
        }
    }
}
