package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.anchor.service.EcommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7ZV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7ZV extends AbstractC49253JUr<C7ZV> {
    public Aweme LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public boolean LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public boolean LJL;
    public String LJLI;
    public String LJLIIIL;
    public String LJLIIL;
    public String LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public int LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public Boolean LJLLLL;
    public Integer LJLLLLLL;
    public Integer LJLZ;
    public int LJZ;
    public int LJZI;

    public C7ZV() {
        super("enter_personal_detail");
        this.LJLLI = "";
        this.LJLLLLLL = 0;
        this.LJLZ = 0;
        this.LJZ = -1;
        this.LJZI = -1;
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        String str;
        String str2;
        String str3;
        String str4 = this.LJJLIIIJILLIZJL;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str4, c1798874e);
        LJ("author_id", this.LJJLIIIJJI, c1798874e);
        LJ("to_user_id", this.LJJLIIIJJIZ, c1798874e);
        LJ("request_id", this.LJJLIIIJL, c1798874e);
        LJ("req_id", this.LJJLIIIJLJLI, c1798874e);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(0);
        LIZ.append("");
        LIZLLL("is_reposted", X1D.LIZIZ(LIZ));
        LIZLLL("repost_from_group_id", null);
        LIZLLL("repost_from_user_id", null);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(0);
        LIZ2.append("");
        LIZLLL("is_original_author_homepage", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(this.LJLILLLLZI);
        LIZ3.append("");
        LIZLLL("relation_tag", X1D.LIZIZ(LIZ3));
        boolean z = this.LJLJJL;
        String str5 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL("is_live_record", str);
        LIZJ(this.LJLLILLLL, "is_landscape_screen");
        if (C1808377v.LIZ().LIZIZ(this.LJJLIIIJILLIZJL)) {
            LJ("previous_page", "push", InterfaceC1798974f.LIZ);
        } else if (!TextUtils.isEmpty(this.LJJLJLI)) {
            String str6 = this.LJJLJLI;
            C1799074g c1799074g = InterfaceC1798974f.LIZ;
            LJ("previous_page", str6, c1799074g);
            LJ("previous_page_position", this.LJJLL, c1799074g);
        }
        if (this.LJJZ) {
            C1799074g c1799074g2 = InterfaceC1798974f.LIZ;
            LJ("is_instructive", "1", c1799074g2);
            LJ("bottom_bar_show", "1", c1799074g2);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_fresh") || TextUtils.equals(this.LIZLLL, "homepage_channel")) {
            C2UL.LIZ();
        }
        if (C227768wm.LJJIIJ(this.LIZLLL)) {
            LIZIZ(this.LJJLIIIJL);
        }
        if (!TextUtils.isEmpty(this.LJJLIIJ)) {
            LJ(this.LJJLIIJ, this.LJJLIL, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJLLLLLLLZ)) {
            LJ("playlist_type", this.LJJLIIIJLLLLLLLZ, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLJ)) {
            LJ("scene_id", this.LJJLJ, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJZZI)) {
            LJ("impr_type", this.LJJZZI, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJZZIII)) {
            LJ("compilation_id", this.LJJZZIII, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("card_type", null, InterfaceC1798974f.LIZ);
        }
        if (IG2.LIZ) {
            LIZLLL("is_fullscreen", "1");
        }
        if (C227768wm.LJJIFFI(this.LIZLLL)) {
            if (this.LJL) {
                str3 = "follow";
            } else {
                str3 = "unfollow";
            }
            LIZLLL("relation_type", str3);
            LIZLLL("video_type", this.LJLI);
            LIZLLL("rec_uid", this.LJLIIIL);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("rec_user_type", null, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJLIL)) {
            LIZLLL("follow_status", this.LJLIL);
        }
        if (!TextUtils.isEmpty(this.LJIILL)) {
            LIZLLL("tab_name", this.LJIILL);
        }
        if (this.LJLJI != 0) {
            LIZLLL("is_avatar", C182617Er.LIZ());
        }
        if (TextUtils.equals(this.LIZLLL, "general_search") || TextUtils.equals(this.LIZLLL, "search_result") || TextUtils.equals(this.LIZLLL, "trending_page")) {
            if (!TextUtils.isEmpty(this.LJLJJI)) {
                LIZLLL("user_tag", this.LJLJJI);
            } else {
                LIZLLL("user_tag", "");
            }
            if (!TextUtils.isEmpty(this.LJJIL)) {
                LIZLLL("search_id", this.LJJIL);
            } else if (!TextUtils.isEmpty(this.LJJIIJZLJL)) {
                LIZLLL("search_id", this.LJJIIJZLJL);
            } else {
                LIZLLL("search_id", this.LJJLIIIJL);
            }
        }
        if (!C188587ag.LJFF(this.LJJJJJ)) {
            LIZLLL("rec_type", C188587ag.LIZJ(this.LJJJJJ));
            LIZLLL("relation_type", C188587ag.LIZ(this.LJJJJJ));
        }
        if ("general_search".equals(this.LIZLLL) || "search_result".equals(this.LIZLLL)) {
            LIZLLL("last_from_group_id", this.LJLLI);
        }
        LJFF("is_highlighted", this.LJLJL);
        LIZJ(this.LJLJLJ, "rank_index");
        LIZJ(this.LJLJJLL, "is_promoted");
        LIZLLL("category_name", this.LJLJLLL);
        String str7 = this.LJLL;
        if (str7 != null && !"".equals(str7)) {
            LIZLLL("new_sug_session_id", this.LJLL);
        }
        Aweme aweme = this.LJJLIIIJ;
        if (aweme != null) {
            if (aweme.getAuthor() != null) {
                LIZJ(this.LJJLIIIJ.getAuthor().getFollowStatusRelation(), "follow_status_relation");
            }
            LIZJ(this.LJJLIIIJ.getAwemeType(), "aweme_type");
            LIZJ(C227768wm.LJIJJ(this.LJJLIIIJ), "text_post_content");
            LIZJ(C227768wm.LJIILIIL(this.LJJLIIIJ), "pic_cnt");
            LIZJ(C227768wm.LIZ(this.LJJJJJ), "has_title");
            String str8 = this.LJLIIL;
            if (str8 != null && !str8.isEmpty()) {
                LIZLLL("from_page", this.LJLIIL);
            }
            HashMap<String, String> mobParams = this.LJJLIIIJ.getMobParams();
            if (mobParams != null) {
                LIZ(mobParams);
            }
            java.util.Map<String, Object> LJ = EcommerceAnchorService.LIZ().LJ(this.LJJJJJ);
            if (LJ != null) {
                for (Map.Entry<String, Object> entry : LJ.entrySet()) {
                    LIZLLL(entry.getKey(), entry.getValue().toString());
                }
            }
            LIZ(C190807eG.LIZ(this.LJJLIIIJ, this.LIZLLL));
            java.util.Map LIZ4 = C191847fw.LIZ(this.LJJJJJ);
            if (!LIZ4.isEmpty()) {
                LIZ(LIZ4);
            }
            LIZJ(this.LJLLLLLL.intValue(), "artist_label");
            LIZJ(this.LJLZ.intValue(), "bts_type");
            String LIZ5 = C187677Yd.LIZ(this.LJJLIIIJ);
            if (LIZ5 != null && !LIZ5.isEmpty()) {
                LIZLLL("photo_content_type", LIZ5);
            }
            LIZJ(this.LJJLIIIJ.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
            if (this.LJJLIIIJ.getIsTikTokStory() && this.LJJLIIIJ.getAwemeType() == 152) {
                if (!TextUtils.isEmpty(this.LJJLIIIJ.getBatchId())) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZLLL("is_batch_sub", str2);
            }
        }
        Boolean bool = this.LJLLLL;
        if (bool != null) {
            if (bool.booleanValue()) {
                str5 = "1";
            }
            LIZLLL("has_label", str5);
        }
        String str9 = this.LJIJI;
        if (str9 != null) {
            LIZLLL("rec_type", str9);
        }
        String str10 = this.LJLLJ;
        if (str10 != null) {
            LIZLLL("position", str10);
        }
        String str11 = this.LJLLL;
        if (str11 != null) {
            LIZLLL("account_type", str11);
        }
        int i = this.LJZ;
        if (i != -1) {
            LIZJ(i, "unread_num");
        }
        int i2 = this.LJZI;
        if (i2 != -1) {
            LIZJ(i2, "is_unread_post_show");
        }
        C78866UxK.LJIILIIL(this, this.LJJLIIIJ);
    }

    public final void LJJIJ(Aweme aweme) {
        LJIILL(aweme);
        if (aweme != null) {
            this.LJJLIIIJL = C227768wm.LJIIZILJ(aweme);
            LJJIJIIJI(aweme);
        }
    }

    public final void LJJIJIIJI(Aweme aweme) {
        int i;
        boolean z;
        if (aweme != null) {
            this.LJJLIIIJ = aweme;
            this.LJJLIIIJILLIZJL = aweme.getAid();
            this.LJJLIIIJJI = JHM.LJIIIZ(aweme);
            this.LJJLIIIJJIZ = aweme.getAuthorUid();
            if (aweme.getAuthor() != null) {
                i = aweme.getAuthor().getFollowStatus();
            } else {
                i = -2;
            }
            this.LJLILLLLZI = i;
            this.LJJZZI = C227768wm.LJFF(aweme);
            if (aweme.getMixInfo() != null) {
                this.LJJZZIII = aweme.getMixInfo().mixId;
            }
            if (!C188587ag.LJI(this.LJJJJJ)) {
                this.LJLJI = C188587ag.LIZIZ(this.LJJJJJ).getMutualType();
            }
            this.LJL = AV1.LJIILJJIL(aweme);
            this.LJLI = C227768wm.LJII(aweme);
            this.LJLIIIL = C227768wm.LJI(aweme);
            this.LJLIL = C227768wm.LJIIIIZZ(aweme);
            this.LJIJI = C227768wm.LJIILJJIL(aweme);
            C188587ag.LJFF(aweme);
            this.LJIJJ = "";
            if (aweme.getAwemeType() == 63) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJJL = z;
            this.LJLJL = aweme.isHighlighted();
            this.LJLJLJ = aweme.getOriginalPos();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.LJLJJLL = 1;
            }
            C78866UxK.LJIIZILJ(this, aweme.getAuthor());
            if (aweme.isPinnedByArtist()) {
                this.LJLLLLLL = 1;
            }
            if (aweme.getIsBehindTheSongVideoType().booleanValue()) {
                this.LJLZ = 1;
            }
        }
    }

    public final void LJJIIZI(int i, Aweme aweme) {
        LJIILL(aweme);
        if (aweme != null) {
            this.LJJLIIIJL = JHM.LJIIJJI(i, aweme);
            LJJIJIIJI(aweme);
        }
    }
}
