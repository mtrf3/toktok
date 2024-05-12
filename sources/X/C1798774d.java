package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import java.util.HashMap;

/* renamed from: X.74d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1798774d extends JHL<C1798774d> {
    public String LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public boolean LJJLIIIJLLLLLLLZ;
    public Aweme LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public boolean LJJZZI;
    public String LJJZZIII;
    public String LJL;
    public int LJLI;
    public int LJLIIIL;
    public String LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public int LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public int LJLJLLL;
    public String LJLL;
    public int LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public Integer LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public int LJZI;
    public int LJZL;
    public String LL;
    public String LLD;
    public int LLF;
    public int LLFF;
    public String LLFFF;
    public String LLFII;
    public int LLFZ;
    public String LLI;
    public String LLIFFJFJJ;
    public String LLII;
    public String LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public String LLIIIL;
    public String LLIIIZ;
    public String LLIIJI;
    public String LLIIJLIL;
    public String LLIIL;
    public String LLIILII;
    public String LLIILZL;
    public int LLIIZ;
    public String LLIL;
    public int LLILII;
    public Integer LLILIL;
    public Integer LLILL;
    public Comment LLILLIZIL;
    public boolean LLILLJJLI;
    public String LLILLL;

    public C1798774d() {
        super("post_comment");
        this.LJJLIIIJ = "";
        this.LJLI = 1;
        this.LJLJJL = -1;
        this.LJZI = -1;
        this.LL = "";
        this.LLD = "";
        this.LLFFF = "";
        this.LLFII = "";
        this.LLI = "";
        this.LLIFFJFJJ = "";
        this.LLII = "";
        this.LLIIII = "";
        this.LLIIIL = "";
        this.LLIIIZ = "";
        this.LLIIJI = "";
        this.LLIIJLIL = "";
        this.LLIIL = "";
        this.LLIILII = "";
        this.LLIILZL = "";
        this.LLIIZ = -1;
        this.LLIL = "";
        this.LLILII = -1;
        this.LLILIL = 0;
        this.LLILL = 0;
        this.LLILLIZIL = null;
        this.LLILLJJLI = false;
        this.LLILLL = "";
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        String str;
        Aweme aweme;
        Aweme aweme2 = this.LJJJJJ;
        if (aweme2 != null && aweme2.getVideo() != null) {
            LIZJ(this.LJJJJJ.getVideo().getDuration() / 1000, "vDuration");
        }
        LIZLLL("is_casting", Boolean.toString(this.LLILLJJLI));
        LIZLLL("casting_session_id", this.LLILLL);
        String str2 = this.LJJL;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str2, c1798874e);
        LJ("author_id", this.LJJLI, c1798874e);
        LIZLLL("user_level", this.LLIIII);
        LIZLLL("now_type", this.LLIL);
        if (!TextUtils.isEmpty(this.LLIIIILZ)) {
            LIZLLL("comment_author_level", this.LLIIIILZ);
        }
        if (!TextUtils.isEmpty(this.LLIIIJ)) {
            LIZLLL("reply_comment_level", this.LLIIIJ);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJILLIZJL)) {
            LJ("comment_category", this.LJJLIIIJILLIZJL, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIIJ)) {
            LJ("reply_to_comment_id", this.LJJLIIIIJ, c1798874e);
        }
        if (C227768wm.LJJIIJ(this.LIZLLL)) {
            LIZIZ(C227768wm.LJIIZILJ(this.LJJLIIJ));
        }
        if (C1808377v.LIZ().LIZIZ(this.LJJL)) {
            LJ("previous_page", "push", InterfaceC1798974f.LIZ);
        } else {
            String str3 = this.LJJLL;
            C1799074g c1799074g = InterfaceC1798974f.LIZ;
            LJ("previous_page", str3, c1799074g);
            LJ("previous_page_position", this.LJJZ, c1799074g);
        }
        String str4 = "1";
        if (this.LJJZZI) {
            C1799074g c1799074g2 = InterfaceC1798974f.LIZ;
            LJ("is_instructive", "1", c1799074g2);
            LJ("bottom_bar_show", "1", c1799074g2);
        }
        String str5 = "";
        if (this.LJJLIIIJLJLI == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LJ("is_long_item", C08380Uo.LIZ(LIZ, this.LJJLIIIJLJLI, "", LIZ), InterfaceC1798974f.LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        String LIZ3 = C08380Uo.LIZ(LIZ2, this.LJLIIIL, "", LIZ2);
        C1799074g c1799074g3 = InterfaceC1798974f.LIZ;
        LJ("is_repost_comment", LIZ3, c1799074g3);
        if (!TextUtils.isEmpty(this.LJJLIIIJJI)) {
            LJ("emoji_times", this.LJJLIIIJJI, c1799074g3);
        }
        if (!TextUtils.isEmpty(this.LJJLJ)) {
            LJ(this.LJJLJ, this.LJJLJLI, c1799074g3);
        }
        LJ("is_retry", String.valueOf(this.LJJLIIIJLLLLLLLZ ? 1 : 0), c1799074g3);
        if (!TextUtils.isEmpty(this.LJJLIL)) {
            LJ("playlist_type", this.LJJLIL, c1799074g3);
        }
        LIZLLL("is_text_empty", CardStruct.IStatusCode.DEFAULT);
        if (!TextUtils.isEmpty(this.LJJLIIIJJIZ)) {
            LJ("enter_method", this.LJJLIIIJJIZ, c1799074g3);
        }
        if (!TextUtils.isEmpty(this.LJJZZIII)) {
            LJ("impr_type", this.LJJZZIII, c1799074g3);
        }
        BusinessComponentServiceUtils.getBusinessBridgeService().getClass();
        if (!TextUtils.isEmpty("") && (TextUtils.equals(this.LIZLLL, "homepage_fresh") || TextUtils.equals(this.LIZLLL, "homepage_channel"))) {
            C2UL.LIZ();
        }
        if (C227768wm.LJJII(this.LIZLLL)) {
            if (!TextUtils.isEmpty(this.LJL)) {
                LJ("content_type", this.LJL, c1799074g3);
            }
            LJ("enter_fullscreen", String.valueOf(this.LJLI), c1799074g3);
        }
        if (!TextUtils.isEmpty(this.LJLIIL)) {
            LJ("is_reposted", "1", c1799074g3);
            LJ("repost_from_group_id", this.LJLIIL, c1799074g3);
            LJ("repost_from_user_id", this.LJLIL, c1799074g3);
        }
        if (!TextUtils.isEmpty(this.LJLILLLLZI)) {
            LJ("compilation_id", this.LJLILLLLZI, c1799074g3);
        }
        LIZLLL("request_id", C227768wm.LJIIZILJ(this.LJJLIIJ));
        if (IG2.LIZ) {
            LIZLLL("is_fullscreen", "1");
        }
        if (this.LJIIZILJ.booleanValue()) {
            LIZLLL("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        }
        if (C227768wm.LJJIFFI(this.LIZLLL) || ((aweme = this.LJJLIIJ) != null && aweme.isFamiliar())) {
            LJ("relation_type", this.LJLJJI, c1799074g3);
            LJ("rec_uid", C227768wm.LJI(this.LJJLIIJ), c1799074g3);
            LJ("video_type", C227768wm.LJII(this.LJJLIIJ), c1799074g3);
        }
        LIZLLL("label_type", this.LJLJL);
        LIZLLL("relation_label_type", this.LJLJLJ);
        if (!TextUtils.isEmpty(this.LJII)) {
            LIZLLL("creation_id", this.LJII);
        }
        int i = this.LJLJLLL;
        if (i != -1) {
            LIZJ(i, "follow_status");
        }
        LIZLLL("send_method", this.LJLL);
        LIZLLL("is_pure_emoji", String.valueOf(this.LJLLI));
        if (!TextUtils.isEmpty(this.LJLLILLLL)) {
            LIZLLL("emoji_info", this.LJLLILLLL);
        }
        LIZLLL("emoji_order", this.LJLLJ);
        LIZLLL("reply_comment_type", this.LJLLL);
        LIZLLL("reply_method", this.LJJLIIIJL);
        LIZLLL("search_id", this.LJJIL);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(this.LJLJJL);
        LIZ4.append("");
        LIZLLL("relation_tag", X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(this.LJLJJLL);
        LIZ5.append("");
        LIZLLL("relation_tag_reply", X1D.LIZIZ(LIZ5));
        LIZLLL("group_type", this.LLIIIL);
        LIZLLL("mvid", this.LLIIIZ);
        LIZLLL("from_location", this.LLIIJI);
        LIZLLL("from_page", this.LLIIJLIL);
        if ("search_result".equals(this.LIZLLL) || "general_search".equals(this.LIZLLL)) {
            LIZLLL("last_from_group_id", this.LLIIL);
        }
        Integer num = this.LJLLLL;
        if (num != null) {
            LIZLLL("is_zero_comment", String.valueOf(num));
        }
        int i2 = this.LJLJI;
        if (i2 != 0) {
            Integer valueOf = Integer.valueOf(i2);
            if (valueOf != null) {
                if (valueOf.intValue() == 1) {
                    str5 = "friends with";
                } else if (valueOf.intValue() == 2) {
                    str5 = "followed by";
                } else if (valueOf.intValue() == 3) {
                    str5 = "follows";
                }
            }
            LIZLLL("label_text", str5);
            LIZLLL("is_avatar", C182617Er.LIZ());
        }
        LIZLLL("reply_uid", this.LJJLIIIJ);
        if (!C188587ag.LJFF(this.LJJJJJ)) {
            LIZLLL("rec_type", C188587ag.LIZJ(this.LJJJJJ));
            LIZLLL("relation_type", C188587ag.LIZ(this.LJJJJJ));
        }
        if (!TextUtils.isEmpty(this.LJLLLLLL)) {
            LIZLLL("tag_id", this.LJLLLLLL);
        }
        if (!TextUtils.isEmpty(this.LLII)) {
            LIZLLL("news_id", this.LLII);
        }
        if (!TextUtils.isEmpty(this.LJLZ)) {
            LIZLLL("parent_tag_id", this.LJLZ);
        }
        LJFF("is_highlighted", this.LJZ);
        LIZJ(this.LJZI, "rank_index");
        LIZJ(this.LJZL, "is_promoted");
        if (!TextUtils.isEmpty(this.LL)) {
            LIZLLL("playlist_id", this.LL);
        }
        if (!TextUtils.isEmpty(this.LLD)) {
            LIZLLL("category_name", this.LLD);
        }
        LIZJ(this.LLF, "is_long");
        int i3 = this.LLFF;
        if (i3 != -1) {
            LIZJ(i3, "follow_status_to_user");
        }
        if (!TextUtils.isEmpty(this.LLFFF)) {
            LIZLLL("story_type", this.LLFFF);
        }
        if (!TextUtils.isEmpty(this.LLFII)) {
            LIZLLL("story_collection_id", this.LLFII);
        }
        if (!TextUtils.isEmpty(this.LLIILII)) {
            LIZLLL("mention_user_id", this.LLIILII);
        }
        if (!TextUtils.isEmpty(this.LLIILZL)) {
            LIZLLL("message_type", this.LLIILZL);
        }
        LIZJ(this.LLIIZ, "extrainfo_valid");
        LIZJ(this.LLFZ, "is_emoji_react");
        if (!TextUtils.isEmpty(this.LLI) && (TextUtils.equals(this.LLI, "click_comment_chain") || TextUtils.equals(this.LLI, "click_comment_bubble") || TextUtils.equals(this.LLI, "push") || TextUtils.equals(this.LLI, "web"))) {
            LIZLLL("comment_enter_method", this.LLI);
            LIZLLL("last_group_id", this.LLIFFJFJJ);
        } else if (!TextUtils.isEmpty(this.LLI) && TextUtils.equals(this.LLI, "notification_page")) {
            LIZLLL("comment_enter_method", "notification");
            LIZLLL("last_group_id", this.LLIFFJFJJ);
        } else if (!TextUtils.isEmpty(this.LLI) && TextUtils.equals(this.LLI, "comment")) {
            LIZLLL("comment_enter_method", "comment_panel");
            LIZLLL("last_group_id", this.LLIFFJFJJ);
        }
        Comment comment = this.LLILLIZIL;
        if (comment != null && comment.getUser() != null) {
            LIZJ(this.LLILLIZIL.getUser().getFollowStatusRelation(), "follow_status_relation");
        } else {
            Aweme aweme3 = this.LJJJJJ;
            if (aweme3 != null && aweme3.getAuthor() != null) {
                LIZJ(this.LJJJJJ.getAuthor().getFollowStatusRelation(), "follow_status_relation");
            }
        }
        Aweme aweme4 = this.LJJJJJ;
        if (aweme4 != null) {
            LIZJ(aweme4.getAwemeType(), "aweme_type");
            LIZJ(C227768wm.LJIJJ(this.LJJLIIJ), "text_post_content");
            LIZJ(C227768wm.LJIILIIL(this.LJJJJJ), "pic_cnt");
            if (this.LJJJJJ.getMobParams() != null) {
                LIZ(this.LJJJJJ.getMobParams());
            }
            CommonFeedApiService.LIZ().LJIJJLI(this.LJJJJJ, this);
            LQA.LIZIZ.LJII(this.LIZLLL, (HashMap) this.LIZIZ, this.LJJLIIJ, false);
            if (C51556KLg.LIZ != null) {
                C51556KLg.LIZ();
                LIZ(C51556KLg.LIZ().LJIIJJI(this.LJJJJJ, C51556KLg.LIZ().LJJIJIIJI(this.LJJJJJ.getAid())));
            }
            if (this.LJJLIIJ.isAd()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZLLL("is_ad", str);
            LIZJ(this.LLILIL.intValue(), "artist_label");
            LIZJ(this.LLILL.intValue(), "bts_type");
            String LIZ6 = C187677Yd.LIZ(this.LJJJJJ);
            if (LIZ6 != null && !LIZ6.isEmpty()) {
                LIZLLL("photo_content_type", LIZ6);
            }
            LIZJ(this.LJJJJJ.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
            if (this.LJJJJJ.getIsTikTokStory() && this.LJJJJJ.getAwemeType() == 152) {
                if (TextUtils.isEmpty(this.LJJJJJ.getBatchId())) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZLLL("is_batch_sub", str4);
            }
        }
        int i4 = this.LLILII;
        if (i4 != -1) {
            LIZJ(i4, "music_name");
        }
        C78866UxK.LJIILIIL(this, this.LJJJJJ);
        LIZLLL("music_type", C78886Uxe.LJJJJIZL(this.LJJJJJ));
    }

    public final void LJJIIZ(Aweme aweme) {
        String str;
        LJIILL(aweme);
        if (aweme != null) {
            this.LJJLIIJ = aweme;
            aweme.getAid();
            this.LJJL = aweme.getAid();
            this.LJJLI = aweme.getAuthorUid();
            this.LJJZZIII = C227768wm.LJFF(aweme);
            this.LJL = C227768wm.LJ(aweme);
            this.LJLIIL = aweme.getRepostFromGroupId();
            this.LJLIL = aweme.getRepostFromUserId();
            if (AV1.LJIILJJIL(aweme)) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            this.LJLJJI = str;
            if (aweme.getAuthor() != null) {
                this.LJLJJL = aweme.getAuthor().getFollowStatus();
            }
            if (aweme.getMixInfo() != null) {
                this.LJLILLLLZI = aweme.getMixInfo().mixId;
            }
            if (!C188587ag.LJI(this.LJJJJJ)) {
                this.LJLJI = C188587ag.LIZIZ(this.LJJJJJ).getMutualType();
            }
            this.LJIJI = C227768wm.LJIILJJIL(aweme);
            C188587ag.LJFF(aweme);
            this.LJIJJ = "";
            this.LJZ = aweme.isHighlighted();
            this.LJZI = aweme.getOriginalPos();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.LJZL = 1;
            }
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && playListInfo.getMixId() != null) {
                this.LL = aweme.playlist_info.getMixId();
            }
            C78866UxK.LJIIZILJ(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.LLF = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.LLF = 1;
            }
            if (aweme.isPinnedByArtist()) {
                this.LLILIL = 1;
            }
            if (aweme.getIsBehindTheSongVideoType().booleanValue()) {
                this.LLILL = 1;
            }
        }
    }
}
