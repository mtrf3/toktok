package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;

/* renamed from: X.Jyf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50921Jyf extends JHL<C50921Jyf> {
    public String LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public int LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public int LJJLJLI;
    public String LJJLL;
    public int LJJZ;
    public int LJJZZI;
    public String LJJZZIII;
    public String LJL;
    public int LJLI;
    public int LJLIIIL;
    public Aweme LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public String LJLJL;
    public int LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public boolean LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public String LJZI;
    public String LJZL;
    public int LL;
    public int LLD;
    public Boolean LLF;
    public String LLFF;
    public String LLFFF;
    public String LLFII;
    public String LLFZ;
    public String LLI;
    public final String LLIFFJFJJ;
    public int LLII;
    public final int LLIIII;
    public Boolean LLIIIILZ;
    public String LLIIIJ;
    public String LLIIIL;

    public C50921Jyf() {
        super("share_video");
        this.LJJLIL = "normal_share";
        this.LJZ = -1;
        this.LJZI = "";
        this.LJZL = "";
        Boolean bool = Boolean.FALSE;
        this.LLF = bool;
        this.LLFFF = "";
        this.LLFII = "";
        this.LLFZ = CardStruct.IStatusCode.DEFAULT;
        this.LLI = "";
        this.LLIFFJFJJ = "";
        this.LLII = 0;
        this.LLIIII = -1;
        this.LLIIIILZ = bool;
        this.LLIIIJ = "";
        this.LLIIIL = null;
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        String str;
        String str2;
        String str3;
        String str4 = this.LJJL;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str4, c1798874e);
        LJ("author_id", this.LJJLI, c1798874e);
        String str5 = this.LJJLIIIIJ;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("platform", str5, c1799074g);
        LJ("content_type", this.LJJLL, c1799074g);
        LJ("share_mode", null, c1799074g);
        LJ("reflow_flag", String.valueOf(this.LJJZZI), c1799074g);
        LJ("enter_method", this.LJJLIL, c1799074g);
        C50652JuK.Companion.getClass();
        C50650JuI LIZJ = C50651JuJ.LIZJ();
        if (LIZJ == null) {
            str = "";
        } else {
            str = LIZJ.getSearchVideoModel().getGroupId();
        }
        if ("search_result".equals(this.LIZLLL) || "general_search".equals(this.LIZLLL)) {
            LIZLLL("last_from_group_id", str);
        }
        if ("homepage_hot".equals(this.LIZLLL)) {
            LIZJ(this.LLII, "has_ad");
        }
        if (C227768wm.LJJIIJ(this.LIZLLL)) {
            LIZIZ(C227768wm.LJIIZILJ(this.LJLIIL));
        }
        if (this.LJJZ != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LJ("is_long_item", C08380Uo.LIZ(LIZ, this.LJJZ, "", LIZ), c1799074g);
        }
        if (C1808377v.LIZ().LIZIZ(this.LJJL)) {
            LJ("previous_page", "push", c1799074g);
        } else {
            LJ("previous_page", this.LJLJJI, c1799074g);
            LJ("previous_page_position", this.LJLJJL, c1799074g);
        }
        String str6 = "1";
        if (this.LJLJJLL) {
            LJ("is_instructive", "1", c1799074g);
            LJ("bottom_bar_show", "1", c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJZZIII)) {
            LJ("share_url", this.LJJZZIII, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJL)) {
            LJ("news_id", this.LJL, c1799074g);
        }
        LIZJ(this.LJJLIIIJ, "platform_flag");
        if (!TextUtils.isEmpty(this.LJJLIIIJILLIZJL)) {
            LIZLLL("now_type", this.LJJLIIIJILLIZJL);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LJ("is_landscape_screen", C08380Uo.LIZ(LIZ2, this.LJJLJLI, "", LIZ2), c1799074g);
        if (!TextUtils.isEmpty(this.LJJLIIIJJI)) {
            LIZLLL("og_type", this.LJJLIIIJJI);
        }
        LIZJ(this.LJJLIIIJJIZ, "is_today");
        if (!TextUtils.isEmpty(this.LJJLIIIJL)) {
            LIZLLL("is_self", this.LJJLIIIJL);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJLJLI)) {
            LIZLLL("privacy_setting", this.LJJLIIIJLJLI);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJLLLLLLLZ)) {
            LIZLLL("detail_tab_name", this.LJJLIIIJLLLLLLLZ);
        }
        if (!TextUtils.isEmpty(this.LJJLIIJ)) {
            LIZLLL("cover_template_id", this.LJJLIIJ);
        }
        if (!TextUtils.isEmpty(this.LJJLJ)) {
            LJ("panel_source", this.LJJLJ, c1799074g);
        }
        LIZJ(this.LJLI, "aweme_type");
        LIZJ(this.LJLIIIL, "pic_cnt");
        if (!TextUtils.isEmpty(this.LJLILLLLZI)) {
            LJ(this.LJLILLLLZI, this.LJLJI, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJLIL)) {
            LJ("playlist_type", this.LJLIL, c1799074g);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_fresh") || TextUtils.equals(this.LIZLLL, "homepage_channel")) {
            C2UL.LIZ();
        }
        LJ("sector", null, c1799074g);
        if (!TextUtils.isEmpty(this.LJLJL)) {
            LJ("impr_type", this.LJLJL, c1799074g);
        }
        if (this.LIZLLL.equals("creation_inspiration")) {
            LIZLLL("creation_inspiration_category", this.LLIIIL);
        }
        if (!TextUtils.isEmpty(this.LJLJLLL)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LJ("is_reposted", C08380Uo.LIZ(LIZ3, this.LJLJLJ, "", LIZ3), c1799074g);
            LJ("repost_from_group_id", this.LJLJLLL, c1799074g);
            LJ("repost_from_user_id", this.LJLL, c1799074g);
        }
        LIZLLL("is_horizontal_screen", CardStruct.IStatusCode.DEFAULT);
        LJ("request_id", C227768wm.LJIIZILJ(this.LJLIIL), c1798874e);
        if (IG2.LIZ) {
            LIZLLL("is_fullscreen", "1");
        }
        if (C227768wm.LJJIFFI(this.LIZLLL)) {
            if (this.LJLLI) {
                str3 = "follow";
            } else {
                str3 = "unfollow";
            }
            LIZLLL("relation_type", str3);
            LIZLLL("video_type", this.LJLLILLLL);
            LIZLLL("rec_uid", this.LJLLJ);
        }
        if (!TextUtils.isEmpty(this.LJII)) {
            LIZLLL("creation_id", this.LJII);
        }
        if (!TextUtils.isEmpty(this.LJLLL)) {
            LIZLLL("share_form", this.LJLLL);
        }
        if (!TextUtils.isEmpty(this.LJLLLL)) {
            LIZLLL("tag_id", this.LJLLLL);
        }
        if (!TextUtils.isEmpty(this.LJLLLLLL)) {
            LIZLLL("parent_tag_id", this.LJLLLLLL);
        }
        if (!C188587ag.LJFF(this.LJJJJJ)) {
            LIZLLL("rec_type", C188587ag.LIZJ(this.LJJJJJ));
            LIZLLL("relation_type", C188587ag.LIZ(this.LJJJJJ));
        }
        LIZJ(this.LJLZ ? 1 : 0, "is_highlighted");
        LIZJ(this.LJZ, "rank_index");
        LIZJ(this.LLD, "is_promoted");
        if (!TextUtils.isEmpty(this.LJZI)) {
            LIZLLL("playlist_id", this.LJZI);
        }
        if (!TextUtils.isEmpty(this.LJZL)) {
            LIZLLL("category_name", this.LJZL);
        }
        LIZJ(this.LL, "is_long");
        if (!TextUtils.isEmpty(this.LLFFF) && (TextUtils.equals(this.LLFFF, "click_comment_chain") || TextUtils.equals(this.LLFFF, "click_comment_bubble") || TextUtils.equals(this.LLFFF, "push") || TextUtils.equals(this.LLFFF, "web"))) {
            LIZLLL("comment_enter_method", this.LLFFF);
            LIZLLL("last_group_id", this.LLFII);
        } else if (!TextUtils.isEmpty(this.LLFFF) && TextUtils.equals(this.LLFFF, "notification_page")) {
            LIZLLL("comment_enter_method", "notification");
            LIZLLL("last_group_id", this.LLFII);
        } else if (!TextUtils.isEmpty(this.LLFFF) && TextUtils.equals(this.LLFFF, "comment")) {
            LIZLLL("comment_enter_method", "comment_panel");
            LIZLLL("last_group_id", this.LLFII);
        }
        if (this.LLF.booleanValue()) {
            LIZLLL("story_type", "story");
        } else {
            LIZLLL("story_type", "post");
        }
        if (this.LLIIIILZ.booleanValue()) {
            LIZLLL("is_casting", "true");
            LIZLLL("casting_session_id", this.LLIIIJ);
        } else {
            LIZLLL("is_casting", "false");
        }
        Aweme aweme = this.LJJJJJ;
        if (aweme != null && aweme.getMobParams() != null) {
            LIZ(this.LJJJJJ.getMobParams());
        }
        if (!TextUtils.isEmpty(this.LLFF)) {
            LIZLLL("story_collection_id", this.LLFF);
        }
        LIZLLL("is_invite", this.LLFZ);
        if (!TextUtils.isEmpty(this.LLI)) {
            LIZLLL("follow_status", this.LLI);
        }
        if (!this.LLIFFJFJJ.isEmpty()) {
            LIZLLL("share_id", this.LLIFFJFJJ);
        }
        Aweme aweme2 = this.LJJJJJ;
        if (aweme2 != null) {
            if (aweme2.isAd()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZLLL("is_ad", str2);
            LIZJ(this.LJJJJJ.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
            if (this.LJJJJJ.getIsTikTokStory() && this.LJJJJJ.getAwemeType() == 152) {
                if (TextUtils.isEmpty(this.LJJJJJ.getBatchId())) {
                    str6 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZLLL("is_batch_sub", str6);
            }
        }
        CommonFeedApiService.LIZ().LJIJJLI(this.LJJJJJ, this);
        int i = this.LLIIII;
        if (i != -1) {
            LIZJ(i, "music_name");
        }
        C78866UxK.LJIILIIL(this, this.LJJJJJ);
    }

    public final void LJJIIZ(Aweme aweme) {
        LJIILL(aweme);
        if (aweme != null) {
            this.LJLIIL = aweme;
            this.LJJL = aweme.getAid();
            this.LJJLI = JHM.LJIIIZ(aweme);
            this.LJJLL = C227768wm.LJ(aweme);
            this.LJLJL = C227768wm.LJFF(aweme);
            this.LJLJLJ = aweme.isForwardAweme() ? 1 : 0;
            this.LJLJLLL = aweme.getRepostFromGroupId();
            this.LJLL = aweme.getRepostFromUserId();
            this.LJLLI = AV1.LJIILJJIL(aweme);
            this.LJLLILLLL = C227768wm.LJII(aweme);
            this.LJLLJ = C227768wm.LJI(aweme);
            this.LJLZ = aweme.isHighlighted();
            this.LJZ = aweme.getOriginalPos();
            this.LLII = aweme.getHasAd();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.LLD = 1;
            }
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && playListInfo.getMixId() != null) {
                this.LJZI = aweme.playlist_info.getMixId();
            }
            C78866UxK.LJIIZILJ(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.LL = 2;
            } else {
                if (aweme.getVideo() == null || !aweme.getVideo().isLongVideo()) {
                    return;
                }
                this.LL = 1;
            }
        }
    }
}
