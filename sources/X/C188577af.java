package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import java.util.HashMap;

/* renamed from: X.7af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188577af extends JHL<C188577af> {
    public String LJJL;
    public String LJJLI;
    public boolean LJJLIIIIJ;
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public final int LJJZ;
    public final String LJJZZI;
    public int LJJZZIII;
    public final int LJL;
    public AwemeRelationRecommendModel LJLI;
    public MatchedFriendStruct LJLIIIL;
    public boolean LJLIIL;
    public int LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public final int LJLJJLL;
    public Integer LJLJL;
    public Integer LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public boolean LJLLI;
    public String LJLLILLLL;

    public C188577af() {
        super("follow");
        this.LJJZ = -1;
        this.LJJZZI = "";
        this.LJJZZIII = -1;
        this.LJL = -1;
        this.LJLIL = -1;
        this.LJLILLLLZI = "";
        this.LJLJI = "";
        this.LJLJJLL = -1;
        this.LJLJL = 0;
        this.LJLJLJ = 0;
        this.LJLJLLL = "";
        this.LJLL = "";
        this.LJLLI = false;
        this.LJLLILLLL = "";
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        Aweme aweme = this.LJJJJJ;
        if (aweme != null && aweme.getVideo() != null) {
            LIZJ(this.LJJJJJ.getVideo().getDuration() / 1000, "vDuration");
        }
        String bool = Boolean.toString(this.LJLLI);
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("is_casting", bool, c1799074g);
        LJ("casting_session_id", this.LJLLILLLL, c1799074g);
        LJ("scene_id", null, c1799074g);
        LJ("previous_page", this.LJJL, c1799074g);
        LJ("previous_page_position", this.LJJLI, c1799074g);
        String str = "1";
        if (this.LJJLIIIIJ) {
            LJ("is_instructive", "1", c1799074g);
            LJ("bottom_bar_show", "1", c1799074g);
        }
        LJ("enter_method", this.LJJLIIIJL, c1799074g);
        String str2 = this.LJJLIIIJ;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("to_user_id", str2, c1798874e);
        LJ("group_id", this.LJJLIIIJILLIZJL, c1798874e);
        LJ("author_id", this.LJJLIIIJ, c1798874e);
        LJ("author_id", this.LJJLIIIJ, c1798874e);
        LJ("follow_type", this.LJJLJ, c1799074g);
        LJ("page_status", null, c1799074g);
        LJ("request_id", this.LJJLIIIJJI, c1798874e);
        LJ("req_id", this.LJJLIIIJJIZ, c1798874e);
        LJ("enter_type", null, c1799074g);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(0);
        String str3 = "";
        LIZ.append("");
        LIZLLL("is_reposted", X1D.LIZIZ(LIZ));
        LIZLLL("repost_from_group_id", null);
        LIZLLL("repost_from_user_id", null);
        if (!TextUtils.isEmpty(this.LJLJLLL)) {
            LIZLLL("share_type", this.LJLJLLL);
        }
        if (!TextUtils.isEmpty(this.LJLL)) {
            LIZLLL("share_source", this.LJLL);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("enter_from_request", null, c1798874e);
        }
        if (!TextUtils.isEmpty(this.LJJZZI)) {
            LIZLLL("homepage_user_id", this.LJJZZI);
        }
        if (C227768wm.LJJIIJ(this.LIZLLL) || "homepage_hot".equals(this.LJJL) || "potential_friends".equals(this.LJJL) || "homepage_familiar".equals(this.LJJL)) {
            LIZIZ(this.LJJLIIIJJI);
        }
        TextUtils.equals(this.LIZ, "follow_cancel");
        if (C1808377v.LIZ().LIZIZ(this.LJJLIIIJILLIZJL)) {
            LJ("previous_page", "push", c1799074g);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ(null, null, c1799074g);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("playlist_type", null, c1799074g);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_fresh") || TextUtils.equals(this.LIZLLL, "homepage_channel")) {
            C2UL.LIZ();
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("rule_id", null, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJLLLLLLLZ)) {
            LJ("impr_type", this.LJJLIIIJLLLLLLLZ, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJLIIJ)) {
            LJ("compilation_id", this.LJJLIIJ, c1799074g);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("card_type", null, c1799074g);
        }
        if (IG2.LIZ) {
            LIZLLL("is_fullscreen", "1");
        }
        if (C227768wm.LJJIFFI(this.LIZLLL)) {
            LIZLLL("video_type", this.LJJLIL);
        }
        if (!TextUtils.isEmpty(null)) {
            LIZLLL("search_keyword", null);
        }
        if (this.LJJLIIIJLJLI != 0) {
            LIZLLL("is_avatar", C182617Er.LIZ());
        }
        if (TextUtils.equals(this.LIZLLL, "others_homepage") && !TextUtils.isEmpty(this.LJIJI)) {
            LJ("rec_type", this.LJIJI, c1799074g);
        }
        if (!TextUtils.isEmpty(null)) {
            LIZLLL("cid", null);
        }
        if (!TextUtils.isEmpty(this.LJJLJLI)) {
            LIZLLL("tag_id", this.LJJLJLI);
        }
        if (!TextUtils.isEmpty(this.LJJLL)) {
            LIZLLL("parent_tag_id", this.LJJLL);
        }
        if (!TextUtils.isEmpty(null)) {
            LIZLLL("log_extra", null);
        }
        int i = this.LJJZ;
        if (i != -1) {
            LIZLLL("is_child_mode", String.valueOf(i));
        }
        int i2 = this.LJJZZIII;
        if (i2 != -1) {
            LIZLLL("is_private", String.valueOf(i2));
        }
        int i3 = this.LJL;
        if (i3 != -1) {
            LIZLLL("cancel_type", String.valueOf(i3));
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.LJLI;
        if (awemeRelationRecommendModel != null) {
            LIZLLL("rec_type", awemeRelationRecommendModel.getRecType());
            LIZLLL("relation_type", this.LJLI.getFriendTypeStr());
        }
        MatchedFriendStruct matchedFriendStruct = this.LJLIIIL;
        if (matchedFriendStruct != null) {
            LIZLLL("rec_type", matchedFriendStruct.getRecType());
            LIZLLL("relation_type", this.LJLIIIL.getRelationType());
        }
        LIZLLL("is_highlighted", String.valueOf(this.LJLIIL));
        LIZLLL("rank_index", String.valueOf(this.LJLIL));
        if (!TextUtils.isEmpty(this.LJLILLLLZI)) {
            LIZLLL("playlist_id", this.LJLILLLLZI);
        }
        if (!TextUtils.isEmpty(null)) {
            LIZLLL("account_type", null);
        }
        if (!TextUtils.isEmpty(this.LJLJI)) {
            LIZLLL("category_name", this.LJLJI);
        }
        C50652JuK.Companion.getClass();
        C50650JuI LIZJ = C50651JuJ.LIZJ();
        if (LIZJ != null) {
            str3 = LIZJ.getSearchVideoModel().getGroupId();
        }
        if ("general_search".equals(this.LIZLLL) || "search_result".equals(this.LIZLLL) || "others_homepage" == this.LIZLLL) {
            LIZLLL("last_from_group_id", str3);
        }
        LIZJ(this.LJLJJI, "is_long");
        LIZJ(this.LJLJJL, "is_landscape_screen");
        Aweme aweme2 = this.LJJJJJ;
        if (aweme2 != null) {
            LIZJ(aweme2.getAwemeType(), "aweme_type");
            LIZJ(C227768wm.LJIJJ(this.LJJJJJ), "text_post_content");
            LIZJ(C227768wm.LJIILIIL(this.LJJJJJ), "pic_cnt");
            if (this.LJJJJJ.getMobParams() != null) {
                LIZ(this.LJJJJJ.getMobParams());
            }
            CommonFeedApiService.LIZ().LJIJJLI(this.LJJJJJ, this);
            if (!this.LJJJJJ.isAd()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZLLL("is_ad", str);
            LQA.LIZIZ.LJII(this.LIZLLL, (HashMap) this.LIZIZ, this.LJJJJJ, false);
            if (C51556KLg.LIZ != null) {
                C51556KLg.LIZ();
                LIZ(C51556KLg.LIZ().LJIIJJI(this.LJJJJJ, C51556KLg.LIZ().LJJIJIIJI(this.LJJJJJ.getAid())));
            }
            int i4 = this.LJLJJLL;
            if (i4 != -1) {
                LIZJ(i4, "music_name");
            }
            LIZJ(this.LJLJL.intValue(), "artist_label");
            LIZJ(this.LJLJLJ.intValue(), "bts_type");
            String LIZ2 = C187677Yd.LIZ(this.LJJJJJ);
            if (LIZ2 != null && !LIZ2.isEmpty()) {
                LIZLLL("photo_content_type", LIZ2);
            }
            LIZLLL("music_type", C78886Uxe.LJJJJIZL(this.LJJJJJ));
        }
    }

    public C188577af(String str) {
        super(str);
        this.LJJZ = -1;
        this.LJJZZI = "";
        this.LJJZZIII = -1;
        this.LJL = -1;
        this.LJLIL = -1;
        this.LJLILLLLZI = "";
        this.LJLJI = "";
        this.LJLJJLL = -1;
        this.LJLJL = 0;
        this.LJLJLJ = 0;
        this.LJLJLLL = "";
        this.LJLL = "";
        this.LJLLI = false;
        this.LJLLILLLL = "";
        this.LJI = true;
    }

    public final void LJJIIZ(int i, Aweme aweme) {
        MatchedFriendStruct matchedFriendStruct;
        LJIILL(aweme);
        if (aweme != null) {
            this.LJJLIIIJILLIZJL = aweme.getAid();
            this.LJJLIIIJJI = JHM.LJIIJJI(i, aweme);
            this.LJJLIIIJ = aweme.getAuthorUid();
            this.LJJLIIIJLLLLLLLZ = C227768wm.LJFF(aweme);
            if (aweme.getMixInfo() != null) {
                this.LJJLIIJ = aweme.getMixInfo().mixId;
            }
            if (!C188587ag.LJI(this.LJJJJJ)) {
                this.LJJLIIIJLJLI = C188587ag.LIZIZ(this.LJJJJJ).getMutualType();
            }
            this.LJJLIL = C227768wm.LJII(aweme);
            this.LJIJI = C227768wm.LJIILJJIL(aweme);
            C188587ag.LJFF(aweme);
            this.LJIJJ = "";
            this.LJLI = aweme.getRelationRecommendInfo();
            User author = aweme.getAuthor();
            if (author != null) {
                matchedFriendStruct = author.getMatchedFriendStruct();
            } else {
                matchedFriendStruct = null;
            }
            this.LJLIIIL = matchedFriendStruct;
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && playListInfo.getMixId() != null) {
                this.LJLILLLLZI = aweme.playlist_info.getMixId();
            }
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.LJLJJI = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.LJLJJI = 1;
            }
            if (aweme.isPinnedByArtist()) {
                this.LJLJL = 1;
            }
            if (aweme.getIsBehindTheSongVideoType().booleanValue()) {
                this.LJLJLJ = 1;
            }
        }
    }
}
