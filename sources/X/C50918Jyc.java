package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Jyc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50918Jyc extends JHM {
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public Long LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public String LJJIIJ;

    public C50918Jyc() {
        super("client_show");
    }

    @Override // X.JHM
    public final void LJII() {
        if (!TextUtils.isEmpty(this.LJIILJJIL)) {
            LIZLLL("content_type", this.LJIILJJIL);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("rank_index", null, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("banner_id", null, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("previous_page", null, InterfaceC1798974f.LIZ);
        }
        String str = this.LIZLLL;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("enter_from", str, c1799074g);
        String str2 = this.LJIILL;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str2, c1798874e);
        LJ("author_id", this.LJIILLIIL, c1798874e);
        if (!TextUtils.isEmpty(this.LJJIIJ)) {
            LJ("topic_name", this.LJJIIJ, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJIII)) {
            LJ("tab_name", this.LJJIII, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJIIZILJ)) {
            LIZLLL("repost_from_group_id", this.LJIIZILJ);
        }
        if (!TextUtils.isEmpty(this.LJIJ)) {
            LIZLLL("repost_from_user_id", this.LJIJ);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_fresh")) {
            C2UL.LIZ();
        }
        if (TextUtils.equals(this.LIZLLL, "sticker_profile_detail")) {
            LJ("tab_name", "effect", c1799074g);
        }
        LJ("request_id", this.LJIL, c1798874e);
        LJ("content", this.LJIJJ, c1799074g);
        if ("prop_page".equals(this.LIZLLL)) {
            LJ("prop_id", null, c1798874e);
            LJ("log_pb", C3A5.LIZ.LIZIZ(this.LJIL), c1798874e);
        } else {
            LJ("music_id", String.valueOf(this.LJIJI), c1798874e);
            if ("homepage_fresh".equals(this.LIZLLL) || "homepage_channel".equalsIgnoreCase(this.LIZLLL)) {
                LIZIZ(this.LJIL);
            }
        }
        LJ("display", this.LJIJJLI, c1799074g);
        if (!TextUtils.isEmpty(null)) {
            LJ("distance_km", null, c1799074g);
        }
        String str3 = this.LIZLLL;
        String str4 = this.LJJ;
        String str5 = this.LJJIFFI;
        String str6 = this.LJJI;
        if (C227768wm.LJJI(str3)) {
            LIZLLL("process_id", str4);
            LIZLLL("tag_id", str5);
            LIZLLL("rank_index", str6);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("parent_tag_id", this.LJJII, c1799074g);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("page_type", null, c1799074g);
        }
    }

    public final void LJIILL(int i, Aweme aweme) {
        String str;
        long id;
        if (aweme != null) {
            this.LJIILJJIL = aweme.getLiveType();
            this.LJIILL = aweme.getAid();
            this.LJIILLIIL = JHM.LJIIIZ(aweme);
            this.LJIL = JHM.LJIIJJI(i, aweme);
            int awemeType = aweme.getAwemeType();
            if (awemeType != 2) {
                if (awemeType != 101) {
                    str = "video";
                } else {
                    str = "live";
                }
            } else {
                str = "photo";
            }
            this.LJIJJ = str;
            if (aweme.getMusic() == null) {
                id = 0;
            } else {
                id = aweme.getMusic().getId();
            }
            this.LJIJI = Long.valueOf(id);
            aweme.getAid();
            if (aweme.isForwardAweme()) {
                this.LJIIZILJ = aweme.getRepostFromGroupId();
                this.LJIJ = aweme.getRepostFromUserId();
            }
            if (aweme.getHotListStruct() != null && aweme.getHotListStruct().getType() == 9) {
                this.LJJIIJ = aweme.getHotListStruct().getTitile();
            }
        }
    }
}
