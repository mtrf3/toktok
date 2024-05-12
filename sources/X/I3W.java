package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;

/* loaded from: classes8.dex */
public final class I3W extends JHM<JHM<?>> {
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public int LJIJ;

    public I3W() {
        super("shoot");
    }

    @Override // X.JHM
    public final void LJII() {
        String str = this.LJIILJJIL;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("shoot_way", str, c1799074g);
        if (!TextUtils.isEmpty(this.LIZLLL)) {
            LIZLLL("enter_from", this.LIZLLL);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("music_id", null, InterfaceC1798974f.LIZIZ);
        }
        if (!TextUtils.isEmpty(this.LJIILL)) {
            LJ("group_id", this.LJIILL, InterfaceC1798974f.LIZIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("tag_id", null, InterfaceC1798974f.LIZIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("sticker_id", null, InterfaceC1798974f.LIZIZ);
        }
        LJ("content_type", this.LJIILLIIL, c1799074g);
        LJ("content_cnt", String.valueOf(this.LJIJ), c1799074g);
        LJ("creation_id", this.LJII, c1799074g);
        LJ("content_source", this.LJIIZILJ, c1799074g);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(0);
        LIZ.append("");
        LIZLLL("is_reposted", X1D.LIZIZ(LIZ));
        LIZLLL("repost_from_group_id", null);
        LIZLLL("repost_from_user_id", null);
        if (C1808377v.LIZ().LIZIZ(this.LJIILL)) {
            LJ("previous_page", "push", c1799074g);
        }
        if (!TextUtils.isEmpty(null)) {
            LIZLLL("coupon_code", null);
        }
        if (!TextUtils.isEmpty(null)) {
            LIZLLL("supplier_id", null);
        }
        if (!TextUtils.isEmpty(null)) {
            LIZLLL("order_id", null);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_hot")) {
            LIZLLL("play_mode", FypAutoScrollServiceImpl.LJIIZILJ().LJIIIZ());
        }
        UgCommonServiceImpl.LJIJ().LJIILIIL();
        FLJ.LIZJ("shoot", "");
    }
}
