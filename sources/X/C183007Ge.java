package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import java.util.HashMap;

/* renamed from: X.7Ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183007Ge extends JHL<C183007Ge> {
    public String LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public int LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public boolean LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public final int LJJZZI;
    public String LJJZZIII;
    public String LJL;
    public String LJLI;
    public int LJLIIIL;
    public int LJLIIL;
    public int LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public long LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public String LJLLJ;
    public int LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public String LJZI;
    public String LJZL;
    public String LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public Integer LLFFF;
    public Integer LLFII;

    public C183007Ge() {
        super("like");
        this.LJJZZI = 1;
        this.LJLIIIL = -1;
        this.LJLIL = -1;
        this.LJLILLLLZI = -1;
        this.LJLLI = -1;
        this.LJLZ = "";
        this.LJZ = "";
        this.LJZI = "";
        this.LJZL = "";
        this.LL = "";
        this.LLFF = -1;
        this.LLFFF = 0;
        this.LLFII = 0;
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        String str;
        Aweme aweme = this.LJJJJJ;
        if (aweme != null && aweme.getVideo() != null) {
            LIZJ(this.LJJJJJ.getVideo().getDuration() / 1000, "vDuration");
        }
        LIZLLL("now_type", this.LL);
        String str2 = this.LJJL;
        InterfaceC1798974f interfaceC1798974f = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str2, interfaceC1798974f);
        LJ("author_id", this.LJJLI, interfaceC1798974f);
        LJ("request_id", this.LJJLIIIIJ, interfaceC1798974f);
        String str3 = this.LJJLIIIJL;
        InterfaceC1798974f interfaceC1798974f2 = InterfaceC1798974f.LIZ;
        LJ("previous_page", str3, interfaceC1798974f2);
        LJ("previous_page_position", this.LJJLIIIJLJLI, interfaceC1798974f2);
        String str4 = "1";
        if (this.LJJLIIIJLLLLLLLZ) {
            LJ("is_instructive", "1", interfaceC1798974f2);
            LJ("bottom_bar_show", "1", interfaceC1798974f2);
        }
        if (this.LIZLLL.equals("creation_inspiration")) {
            LIZLLL("creation_inspiration_category", this.LJJLIIJ);
        }
        LJ("duration", String.valueOf(this.LJLJLLL), interfaceC1798974f2);
        if ("homepage_hot".equals(this.LIZLLL)) {
            LIZJ(this.LLF, "has_ad");
        }
        if (!TextUtils.isEmpty(this.LJZI)) {
            LIZLLL("news_id", this.LJZI);
        }
        if (C227768wm.LJJIIJ(this.LIZLLL)) {
            LIZIZ(this.LJJLIIIIJ);
        }
        TextUtils.equals(this.LIZ, "like_cancel");
        if (C1808377v.LIZ().LIZIZ(this.LJJL)) {
            LJ("previous_page", "push", interfaceC1798974f2);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJJI)) {
            LJ(this.LJJLIIIJJI, this.LJJLIIIJJIZ, interfaceC1798974f2);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJILLIZJL)) {
            LJ("playlist_type", this.LJJLIIIJILLIZJL, interfaceC1798974f2);
        }
        if (!TextUtils.isEmpty(this.LJLZ) && (TextUtils.equals(this.LJLZ, "click_comment_chain") || TextUtils.equals(this.LJLZ, "click_comment_bubble") || TextUtils.equals(this.LJLZ, "push") || TextUtils.equals(this.LJLZ, "web"))) {
            LIZLLL("comment_enter_method", this.LJLZ);
            LIZLLL("last_group_id", this.LJZ);
        } else if (!TextUtils.isEmpty(this.LJLZ) && TextUtils.equals(this.LJLZ, "notification_page")) {
            LIZLLL("comment_enter_method", "notification");
            LIZLLL("last_group_id", this.LJZ);
        } else if (!TextUtils.isEmpty(this.LJLZ) && TextUtils.equals(this.LJLZ, "comment")) {
            LIZLLL("comment_enter_method", "comment_panel");
            LIZLLL("last_group_id", this.LJZ);
        }
        if (!TextUtils.isEmpty(this.LJJLIL)) {
            LJ("impr_type", this.LJJLIL, interfaceC1798974f2);
        }
        LIZLLL("is_text_empty", CardStruct.IStatusCode.DEFAULT);
        if (C227768wm.LJJII(this.LIZLLL)) {
            if (!TextUtils.isEmpty(this.LJJLL)) {
                LJ("enter_method", this.LJJLL, interfaceC1798974f2);
            }
            if (!TextUtils.isEmpty(this.LJJZ)) {
                LJ("content_type", this.LJJZ, interfaceC1798974f2);
            }
            LJ("enter_fullscreen", String.valueOf(this.LJJZZI), interfaceC1798974f2);
            LIZLLL("notice_type", "");
            LIZLLL("show_cnt", String.valueOf(0));
            LIZLLL("yellow_dot_logid", "");
        }
        if (!TextUtils.isEmpty(this.LJJZZIII)) {
            LJ("is_reposted", "1", interfaceC1798974f2);
            LJ("repost_from_group_id", this.LJJZZIII, interfaceC1798974f2);
            LJ("repost_from_user_id", this.LJL, interfaceC1798974f2);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_fresh") || TextUtils.equals(this.LIZLLL, "homepage_channel")) {
            C2UL.LIZ();
        }
        if (C227768wm.LJJIFFI(this.LIZLLL)) {
            if (this.LJLJI) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            LIZLLL("relation_type", str);
            LIZLLL("video_type", this.LJLJJI);
            LIZLLL("rec_uid", this.LJLJJL);
        }
        int i = this.LJLILLLLZI;
        if (i >= 0) {
            LIZJ(i, "liked_cnt_after");
        }
        int i2 = this.LJLIL;
        if (i2 >= 0) {
            LIZJ(i2, "liked_cnt_before");
        }
        LIZJ(this.LJLIIL, "is_recommand_like");
        if (!TextUtils.isEmpty(this.LJJLL)) {
            LJ("enter_method", this.LJJLL, interfaceC1798974f2);
        }
        if (!TextUtils.isEmpty(this.LJLI)) {
            LJ("compilation_id", this.LJLI, interfaceC1798974f2);
        }
        if (this.LJLIIIL != -1) {
            StringBuilder LIZ = X1D.LIZ();
            LJ("is_logged_in", C08380Uo.LIZ(LIZ, this.LJLIIIL, "", LIZ), interfaceC1798974f2);
        }
        if (IG2.LIZ) {
            LIZLLL("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(null)) {
            LIZLLL("is_fullscreen", null);
        }
        if (!TextUtils.isEmpty(this.LJLLLL)) {
            LIZLLL("search_keyword", this.LJLLLL);
        }
        if (!TextUtils.isEmpty(this.LJLLLLLL)) {
            LIZLLL("search_type", this.LJLLLLLL);
        }
        if (!TextUtils.isEmpty(this.LJII)) {
            LIZLLL("creation_id", this.LJII);
        }
        if (!TextUtils.isEmpty(this.LJJLJ)) {
            LIZLLL("tag_id", this.LJJLJ);
        }
        if (!TextUtils.isEmpty(this.LJJLJLI)) {
            LIZLLL("parent_tag_id", this.LJJLJLI);
        }
        if (this.LJLJLJ != 0) {
            LIZLLL("is_avatar", C182617Er.LIZ());
        }
        if (!TextUtils.isEmpty(this.LJLJJLL)) {
            LIZLLL("follow_status", this.LJLJJLL);
        }
        if (!TextUtils.isEmpty(this.LJLLJ)) {
            LIZLLL("playlist_id", this.LJLLJ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJLJL);
        LIZ2.append("");
        LIZLLL("relation_tag", X1D.LIZIZ(LIZ2));
        LIZJ(this.LJLL ? 1 : 0, "is_highlighted");
        LIZJ(this.LJLLI, "rank_index");
        if (!C188587ag.LJFF(this.LJJJJJ)) {
            LIZLLL("rec_type", C188587ag.LIZJ(this.LJJJJJ));
            LIZLLL("relation_type", C188587ag.LIZ(this.LJJJJJ));
        }
        LIZJ(this.LJLLL, "is_long");
        LIZJ(this.LJLLILLLL, "is_promoted");
        LIZJ(0, "is_music");
        Aweme aweme2 = this.LJJJJJ;
        if (aweme2 != null) {
            if (aweme2.getAuthor() != null) {
                LIZJ(this.LJJJJJ.getAuthor().getFollowStatusRelation(), "follow_status_relation");
            }
            LIZJ(this.LJJJJJ.getAwemeType(), "aweme_type");
            LIZJ(C227768wm.LJIJJ(this.LJJJJJ), "text_post_content");
            LIZJ(C227768wm.LJIILIIL(this.LJJJJJ), "pic_cnt");
            if (this.LJJJJJ.getMobParams() != null) {
                LIZ(this.LJJJJJ.getMobParams());
            }
            if (!this.LJJJJJ.isAd()) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZLLL("is_ad", str4);
            LIZJ(this.LLFFF.intValue(), "artist_label");
            LIZJ(this.LLFII.intValue(), "bts_type");
            String LIZ3 = C187677Yd.LIZ(this.LJJJJJ);
            if (LIZ3 != null && !LIZ3.isEmpty()) {
                LIZLLL("photo_content_type", LIZ3);
            }
            LIZJ(this.LJJJJJ.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        }
        CommonFeedApiService.LIZ().LJIJJLI(this.LJJJJJ, this);
        if ("general_search".equals(this.LIZLLL) || "search_result".equals(this.LIZLLL)) {
            LIZLLL("last_from_group_id", this.LJZL);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        LQA.LIZIZ.LJII(this.LIZLLL, hashMap, this.LJJJJJ, false);
        if (!hashMap.isEmpty()) {
            LIZ(hashMap);
        }
        if (C51556KLg.LIZ != null) {
            C51556KLg.LIZ();
            LIZ(C51556KLg.LIZ().LJIIJJI(this.LJJJJJ, C51556KLg.LIZ().LJJIJIIJI(this.LJJJJJ.getAid())));
        }
        int i3 = this.LLFF;
        if (i3 != -1) {
            LIZJ(i3, "music_name");
        }
        LIZJ(this.LLD, "is_landscape_screen");
        C78866UxK.LJIILIIL(this, this.LJJJJJ);
        C78596Usy.LJII(this.LJJJJJ, this);
        LIZLLL("music_type", C78886Uxe.LJJJJIZL(this.LJJJJJ));
    }

    public C183007Ge(String str) {
        super(str);
        this.LJJZZI = 1;
        this.LJLIIIL = -1;
        this.LJLIL = -1;
        this.LJLILLLLZI = -1;
        this.LJLLI = -1;
        this.LJLZ = "";
        this.LJZ = "";
        this.LJZI = "";
        this.LJZL = "";
        this.LL = "";
        this.LLFF = -1;
        this.LLFFF = 0;
        this.LLFII = 0;
        this.LJI = true;
    }

    public final void LJJIIZ(Aweme aweme) {
        String LJIILL;
        int followStatus;
        LJIILL(aweme);
        if (aweme != null) {
            this.LJJL = aweme.getAid();
            this.LJJLI = JHM.LJIIIZ(aweme);
            if (TextUtils.isEmpty(C227768wm.LJIILL(this.LJJLIIIJ, aweme))) {
                LJIILL = aweme.getRequestId();
            } else {
                LJIILL = C227768wm.LJIILL(this.LJJLIIIJ, aweme);
            }
            this.LJJLIIIIJ = LJIILL;
            this.LJJLIL = C227768wm.LJFF(aweme);
            this.LJJZ = C227768wm.LJ(aweme);
            this.LJJZZIII = aweme.getRepostFromGroupId();
            this.LJL = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.LJLI = aweme.getMixInfo().mixId;
            }
            if (!C188587ag.LJI(this.LJJJJJ)) {
                this.LJLJLJ = C188587ag.LIZIZ(this.LJJJJJ).getMutualType();
            }
            this.LJLJI = AV1.LJIILJJIL(aweme);
            this.LJLJJI = C227768wm.LJII(aweme);
            this.LJLJJL = C227768wm.LJI(aweme);
            this.LJLJJLL = C227768wm.LJIIIIZZ(aweme);
            this.LJIJI = C227768wm.LJIILJJIL(aweme);
            C188587ag.LJFF(aweme);
            this.LJIJJ = "";
            if (aweme.getAuthor() == null) {
                followStatus = -2;
            } else {
                followStatus = aweme.getAuthor().getFollowStatus();
            }
            this.LJLJL = followStatus;
            this.LJLL = aweme.isHighlighted();
            this.LJLLI = aweme.getOriginalPos();
            this.LLF = aweme.getHasAd();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.LJLLILLLL = 1;
            }
            C78866UxK.LJIIZILJ(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.LJLLL = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.LJLLL = 1;
            }
            if (aweme.isPinnedByArtist()) {
                this.LLFFF = 1;
            }
            if (aweme.getIsBehindTheSongVideoType().booleanValue()) {
                this.LLFII = 1;
            }
        }
    }
}
