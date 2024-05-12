package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* renamed from: X.JyW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C50912JyW extends JHL<C50912JyW> {
    public String LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public final String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public boolean LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public int LJJLL;
    public String LJJZ;
    public String LJJZZI;
    public boolean LJJZZIII;
    public String LJL;
    public boolean LJLI;
    public String LJLIIIL;
    public String LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public int LJLJLJ;
    public String LJLJLLL;
    public int LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public boolean LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public int LJZI;
    public String LJZL;
    public int LL;
    public String LLD;
    public String LLF;
    public String LLFF;
    public final String LLFFF;
    public String LLFII;
    public int LLFZ;
    public Long LLI;
    public String LLIFFJFJJ;
    public String LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public String LLIIIJ;
    public String LLIIIL;
    public String LLIIIZ;
    public String LLIIJI;
    public String LLIIJLIL;
    public Integer LLIIL;
    public String LLIILII;
    public String LLIILZL;
    public String LLIIZ;
    public String LLIL;
    public String LLILII;
    public String LLILIL;
    public String LLILL;
    public String LLILLIZIL;
    public int LLILLJJLI;

    public C50912JyW() {
        super("video_play_finish");
        this.LJJLIIIJ = "";
        this.LJJLL = 1;
        this.LJLLI = "";
        this.LJLZ = "";
        this.LJZ = "";
        this.LJZI = -1;
        this.LJZL = "";
        this.LLD = "";
        this.LLF = "";
        this.LLFF = "";
        this.LLFFF = "";
        this.LLFII = "";
        this.LLI = 0L;
        this.LLIFFJFJJ = "";
        this.LLII = "";
        this.LLIIII = 0;
        this.LLIIIILZ = 0;
        this.LLIIIJ = "";
        this.LLIIIZ = "";
        this.LLIIJI = "";
        this.LLIIJLIL = "";
        this.LLIIL = -1;
        this.LLILLJJLI = 0;
        this.LJI = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JHM
    public final void LJII() {
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        LIZJ(EarphonePlayerControl.LJII().LIZJ() ? 1 : 0, "earphone_status");
        if (this.LJJJJJ != null && ("homepage_hot_tikbot".equals(this.LIZLLL) || "general_search_tikbot".equals(this.LIZLLL))) {
            LJ("group_id", this.LJJJJJ.getAid(), InterfaceC1798974f.LIZIZ);
        } else {
            LJ("group_id", this.LJJL, InterfaceC1798974f.LIZIZ);
        }
        String str4 = this.LJJLI;
        InterfaceC1798974f interfaceC1798974f = InterfaceC1798974f.LIZIZ;
        LJ("author_id", str4, interfaceC1798974f);
        LJ("request_id", this.LJJLIIIIJ, interfaceC1798974f);
        if (TextUtils.isEmpty(this.LJJLIIIIJ) && !TextUtils.isEmpty(this.LJLJJLL)) {
            LJ("request_id", this.LJLJJLL, interfaceC1798974f);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJ)) {
            LJ("is_auto_play", this.LJJLIIIJ, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("district_code", null, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("sub_class", null, InterfaceC1798974f.LIZ);
        }
        LJFF("is_highlighted", this.LJJZZIII);
        if (C227768wm.LJJIIJ(this.LIZLLL)) {
            LIZIZ(C50916Jya.LIZ(this.LJJLIIIIJ, this.LJLJJLL));
            if (!TextUtils.isEmpty(this.LJLJJLL)) {
                LIZLLL("impr_id", this.LJLJJLL);
            } else {
                LIZLLL("impr_id", this.LJJLIIIIJ);
            }
        }
        if ("like".equals(this.LJJLIIIJJI) || "discovery".equals(this.LIZLLL) || this.LLFZ == 1 || this.LIZLLL.equals("playlist") || "homepage_hot_tikbot".equals(this.LIZLLL) || "general_search_tikbot".equals(this.LIZLLL) || "notification_page_tikbot".equals(this.LIZLLL) || "chat_list_tikbot".equals(this.LIZLLL)) {
            LJ("enter_method", this.LJJLIIIJILLIZJL, InterfaceC1798974f.LIZ);
        }
        String str5 = this.LJJLIIIJJI;
        InterfaceC1798974f interfaceC1798974f2 = InterfaceC1798974f.LIZ;
        LJ("content_source", str5, interfaceC1798974f2);
        if (C1808377v.LIZ().LIZIZ(this.LJJL)) {
            LJ("previous_page", "push", interfaceC1798974f2);
        } else {
            LJ("previous_page", this.LJJLIIIJLLLLLLLZ, interfaceC1798974f2);
            LJ("previous_page_position", this.LJJLIIJ, interfaceC1798974f2);
        }
        if (this.LJJLIL) {
            LJ("is_instructive", "1", interfaceC1798974f2);
            LJ("bottom_bar_show", "1", interfaceC1798974f2);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJL)) {
            LJ(this.LJJLIIIJL, this.LJJLIIIJLJLI, interfaceC1798974f2);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJJIZ)) {
            LJ("playlist_type", this.LJJLIIIJJIZ, interfaceC1798974f2);
        }
        if (!TextUtils.isEmpty(this.LJJLJLI)) {
            LJ("video_type", this.LJJLJLI, interfaceC1798974f2);
        }
        LIZJ(this.LJLL, "is_promoted");
        if (!TextUtils.isEmpty(this.LJJLJ)) {
            LJ("impr_type", this.LJJLJ, interfaceC1798974f2);
        }
        if (a.LJIILL().LJIJ()) {
            LJ("is_teen_mode", "1", interfaceC1798974f2);
        }
        String str6 = "";
        if (C227768wm.LJJII(this.LIZLLL)) {
            LJ("is_auto_play", "1", interfaceC1798974f2);
            LJ("enter_fullscreen", String.valueOf(this.LJJLL), interfaceC1798974f2);
            LIZLLL("notice_type", "");
            LIZJ(0, "show_cnt");
            LIZLLL("yellow_dot_logid", "");
        }
        if (!TextUtils.isEmpty(this.LJJZ)) {
            LJ("is_reposted", "1", interfaceC1798974f2);
            LJ("repost_from_group_id", this.LJJZ, interfaceC1798974f2);
            LJ("repost_from_user_id", this.LJJZZI, interfaceC1798974f2);
        }
        if (C227768wm.LJJIFFI(this.LIZLLL)) {
            if (this.LJLI) {
                str3 = "follow";
            } else {
                str3 = "unfollow";
            }
            LIZLLL("relation_type", str3);
            LIZLLL("video_type", this.LJLIIIL);
            LIZLLL("rec_uid", this.LJLIIL);
        }
        if (!TextUtils.isEmpty(this.LJL)) {
            LJ("compilation_id", this.LJL, interfaceC1798974f2);
        }
        if (IG2.LIZ) {
            LIZLLL("is_fullscreen", "1");
        }
        if (this.LJIIZILJ.booleanValue()) {
            LIZLLL("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        }
        String str7 = this.LIZLLL;
        String str8 = this.LJLIL;
        String str9 = this.LJLILLLLZI;
        String str10 = this.LJLJI;
        if (C227768wm.LJJI(str7)) {
            LIZLLL("process_id", str8);
            LIZLLL("tag_id", str10);
            LIZLLL("rank_index", str9);
        }
        if (TextUtils.equals("single_song", this.LIZLLL)) {
            LIZLLL("process_id", this.LJLIL);
        }
        if (!TextUtils.isEmpty(this.LJLJL)) {
            LJ("search_keyword", this.LJLJL, interfaceC1798974f2);
        }
        if (!TextUtils.isEmpty(this.LJJIFFI)) {
            LJ("search_result_id", this.LJJIFFI, interfaceC1798974f2);
            if (TextUtils.isEmpty(this.LJJIII)) {
                LJ("list_item_id", this.LJJL, interfaceC1798974f2);
            } else {
                LJ("list_item_id", this.LJJIII, interfaceC1798974f2);
                LJ("search_third_item_id", this.LJJL, interfaceC1798974f2);
            }
        }
        if (!TextUtils.isEmpty(this.LJII)) {
            LIZLLL("creation_id", this.LJII);
        }
        if (!TextUtils.isEmpty(this.LJLJJI)) {
            LIZLLL("follow_status", this.LJLJJI);
        }
        if (!TextUtils.isEmpty(this.LJLJJLL)) {
            LIZLLL("impr_id", this.LJLJJLL);
        }
        if ((TextUtils.equals(this.LIZLLL, "general_search") || TextUtils.equals(this.LIZLLL, "search_result") || TextUtils.equals(this.LIZLLL, "trending_page")) && !TextUtils.isEmpty(this.LJJIL)) {
            LIZLLL("search_id", this.LJJIL);
        }
        if (this.LJLJJL != 0) {
            LIZLLL("is_avatar", C182617Er.LIZ());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJLJ);
        LIZ.append("");
        LIZLLL("relation_tag", X1D.LIZIZ(LIZ));
        if (!TextUtils.isEmpty(this.LJLJLLL)) {
            LIZLLL("search_type", this.LJLJLLL);
        }
        if (!C188587ag.LJFF(this.LJJJJJ)) {
            LIZLLL("rec_type", C188587ag.LIZJ(this.LJJJJJ));
            LIZLLL("relation_type", C188587ag.LIZ(this.LJJJJJ));
        }
        if (!TextUtils.isEmpty(this.LJLLI)) {
            LIZLLL("tag_line", this.LJLLI);
        }
        if (!TextUtils.isEmpty(this.LJLLILLLL)) {
            LIZLLL("music_id", this.LJLLILLLL);
        }
        if (!TextUtils.isEmpty(this.LJLLJ)) {
            LIZLLL("full_clip_id", this.LJLLJ);
        }
        if (!TextUtils.isEmpty(this.LJLLL)) {
            LIZLLL("meta_song_id", this.LJLLL);
        }
        if (!TextUtils.isEmpty(this.LJLLLLLL)) {
            LIZLLL("mvid", this.LJLLLLLL);
        }
        if (this.LJLLLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL("is_music", str);
        if (!TextUtils.isEmpty(this.LLIIIJ)) {
            LIZLLL("news_id", this.LLIIIJ);
        }
        if (this.LLFZ == 1) {
            LIZLLL("question_id", String.valueOf(this.LLI));
            LIZLLL("qa_type", this.LLFII);
            LIZLLL("enter_from", this.LIZLLL);
        }
        if (!TextUtils.isEmpty(this.LLD) && (TextUtils.equals(this.LLD, "click_comment_chain") || TextUtils.equals(this.LLD, "click_comment_bubble") || TextUtils.equals(this.LLD, "push") || TextUtils.equals(this.LLD, "web"))) {
            LIZLLL("comment_enter_method", this.LLD);
            LIZLLL("last_group_id", this.LLF);
        } else if (!TextUtils.isEmpty(this.LLD) && TextUtils.equals(this.LLD, "notification_page")) {
            LIZLLL("comment_enter_method", "notification");
            LIZLLL("last_group_id", this.LLF);
        } else if (!TextUtils.isEmpty(this.LLD) && TextUtils.equals(this.LLD, "comment")) {
            LIZLLL("comment_enter_method", "comment_panel");
            LIZLLL("last_group_id", this.LLF);
        }
        if (!TextUtils.isEmpty(this.LJLZ)) {
            LIZLLL("playlist_id", this.LJLZ);
            if (!TextUtils.isEmpty(this.LJZL) && TextUtils.equals(this.LIZLLL, "playlist")) {
                LIZLLL("search_id", this.LJZL);
                LIZJ(this.LJZI, "is_from_video");
            }
            if (TextUtils.equals(this.LIZLLL, "playlist")) {
                LIZLLL("playlist_previous_page", this.LLFF);
                LIZLLL("from_group_id", this.LLFFF);
            }
        }
        if (!TextUtils.isEmpty(this.LJZ)) {
            LIZLLL("category_name", this.LJZ);
        }
        int i3 = this.LLILLJJLI;
        if (i3 == 1) {
            LIZJ(i3, "is_from_playlist");
        }
        C50652JuK.Companion.getClass();
        C50650JuI LIZJ = C50651JuJ.LIZJ();
        if (LIZJ != null) {
            str6 = LIZJ.getSearchVideoModel().getGroupId();
        }
        if ("general_search".equals(this.LIZLLL) || "search_result".equals(this.LIZLLL)) {
            LIZLLL("last_from_group_id", str6);
        }
        LIZJ(this.LL, "is_long");
        LIZJ(C63081OpJ.LJJLIIIJJI(this.LJJJJJ) ? 1 : 0, "is_ad");
        LIZJ(C63081OpJ.LLIIII(this.LJJJJJ) ? 1 : 0, "is_splash");
        LIZLLL("has_cla", this.LLII);
        LIZLLL("has_tts", this.LLIFFJFJJ);
        LIZJ(this.LLIIIILZ, "caption_length");
        LIZJ(this.LLIIII, "caption_return_count");
        Aweme aweme = this.LJJJJJ;
        if (aweme != null) {
            if (aweme.getAuthor() != null) {
                LIZJ(this.LJJJJJ.getAuthor().getFollowStatusRelation(), "follow_status_relation");
            }
            LIZJ(this.LJJJJJ.getAwemeType(), "aweme_type");
            LIZJ(C227768wm.LJIJJ(this.LJJJJJ), "text_post_content");
            LIZJ(C227768wm.LJIILIIL(this.LJJJJJ), "pic_cnt");
            if (this.LJJJJJ.getMobParams() != null) {
                LIZ(this.LJJJJJ.getMobParams());
            }
            LQA.LIZIZ.LJII(this.LIZLLL, (HashMap) this.LIZIZ, this.LJJJJJ, false);
            if ("homepage_nearby".equals(this.LIZLLL)) {
                if (this.LJJJJJ.isClientCache()) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZLLL("is_client_cache", str2);
            }
            C51556KLg.LIZ.getClass();
            java.util.Map LJIIJJI = C51556KLg.LIZ().LJIIJJI(this.LJJJJJ, C51556KLg.LIZ().LJJIJIIJI(this.LJJJJJ.getAid()));
            LIZ(LJIIJJI);
            List<InteractStickerStruct> interactStickerStructs = this.LJJJJJ.getInteractStickerStructs();
            if (interactStickerStructs != null) {
                for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                    if (interactStickerStruct.getPoiStickerStruct() != null) {
                        boolean equals = TextUtils.equals(interactStickerStruct.getPoiStickerStruct().getPoiId(), (String) LJIIJJI.get("poi_id"));
                        i2 = 1;
                        i = equals;
                        break;
                    }
                }
            }
            i = 0;
            i2 = 0;
            LIZJ(i2, "is_poi_sticker");
            LIZJ(i, "is_sticker_poi");
            for (Map.Entry<String, String> entry : LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave().entrySet()) {
                LIZLLL(entry.getKey(), entry.getValue());
            }
            String LIZ2 = C187677Yd.LIZ(this.LJJJJJ);
            if (LIZ2 != null && !LIZ2.isEmpty()) {
                LIZLLL("photo_content_type", LIZ2);
            }
            LIZJ(this.LJJJJJ.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        }
        LIZJ(C227768wm.LIZ(this.LJJJJJ), "has_title");
        if (!TextUtils.isEmpty(this.LLIIIL)) {
            LIZLLL("duet_mode_type", this.LLIIIL);
        }
        CommonFeedApiService.LIZ().LJIJJLI(this.LJJJJJ, this);
        if (!TextUtils.isEmpty(this.LLIIIZ)) {
            LIZLLL("enter_from", this.LIZLLL);
            LIZLLL("tone_list", this.LLIIIZ);
        }
        if (!TextUtils.isEmpty(this.LLIIJI)) {
            LIZLLL("enter_from", this.LIZLLL);
            LIZLLL("voice_modify_id", this.LLIIJI);
        }
        String str11 = this.LLIIJLIL;
        if (str11 == null || str11.isEmpty()) {
            LIZLLL("is_paid_partnership", CardStruct.IStatusCode.DEFAULT);
        } else {
            LIZLLL("is_paid_partnership", "1");
        }
        if (CommonFeedApiService.LIZ().LJIIIIZZ(this.LJJJJJ)) {
            LIZLLL("is_ec_video", "1");
            LIZJ(CommonFeedApiService.LIZ().LJII(), "ec_bc_toggle_style");
            LIZLLL("ec_bc_toggle_content", C63081OpJ.LJJIJIIJI(this.LJJJJJ));
        } else {
            LIZLLL("is_ec_video", CardStruct.IStatusCode.DEFAULT);
        }
        if (this.LLIIL.intValue() != -1) {
            LIZJ(this.LLIIL.intValue(), "music_name");
        }
        if ("places_discover".equals(this.LIZLLL) || "poi_detail".equals(this.LIZLLL)) {
            LJ("enter_method", this.LJJLIIIJILLIZJL, InterfaceC1798974f.LIZ);
            LIZLLL("tab_code", this.LLIILII);
            LIZLLL("is_fullscreen", this.LLIIZ);
            LIZLLL("is_display_distance", this.LLIILZL);
            LIZLLL("previous_page", this.LJJLIIIJLLLLLLLZ);
            String str12 = this.LLIL;
            if (str12 != null) {
                LIZLLL("collect_info", str12);
                try {
                    JSONObject jSONObject = new JSONObject(this.LLIL);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = JSONObjectProtectorUtils.getString(jSONObject, next);
                        if (next != null && string != null) {
                            LIZLLL(next, string);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            String str13 = this.LLILII;
            if (str13 != null) {
                LIZLLL("page_collect_info", str13);
                try {
                    JSONObject jSONObject2 = new JSONObject(this.LLILII);
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        String string2 = JSONObjectProtectorUtils.getString(jSONObject2, next2);
                        if (next2 != null && string2 != null) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("page_");
                            LIZ3.append(next2);
                            LIZLLL(X1D.LIZIZ(LIZ3), string2);
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
        }
        Object obj = ((HashMap) this.LIZIZ).get("is_fullscreen");
        Object obj2 = ((HashMap) this.LIZIZ).get("search_type");
        if ((obj2 instanceof String) && obj2.equals("general")) {
            if ((obj instanceof String) && obj.equals(CardStruct.IStatusCode.DEFAULT) && !C78880UxY.LJJJJZI(this.LJJJJJ)) {
                HashMap LIZ4 = C45243HpH.LIZ("click_times", CardStruct.IStatusCode.DEFAULT, "is_slide", CardStruct.IStatusCode.DEFAULT);
                LIZ4.put("slide_rank", CardStruct.IStatusCode.DEFAULT);
                LIZ(LIZ4);
            }
        } else {
            LJIILJJIL("click_times");
            LJIILJJIL("is_slide");
            LJIILJJIL("slide_rank");
            LJIILJJIL("is_inner");
            LJIILJJIL("rank_inner");
            LJIILJJIL("inner_search_id");
        }
        LIZLLL("is_floating_window", CardStruct.IStatusCode.DEFAULT);
        if (!TextUtils.isEmpty(this.LLILIL)) {
            LIZLLL("message_id", this.LLILIL);
            LIZLLL("conversation_id", this.LLILL);
            LIZLLL("process_id", this.LLILLIZIL);
        }
        C220488l2.LIZIZ.LJII(this.LJJJJJ, this);
        C78866UxK.LJIILIIL(this, this.LJJJJJ);
    }

    @Override // X.JHL
    public final String LJIJJ() {
        return this.LJJL;
    }

    @Override // X.JHM
    public final void LJIIIIZZ(Aweme aweme) {
        super.LJIIIIZZ(aweme);
        if (TextUtils.isEmpty(this.LJIIIZ)) {
            this.LJIIIZ = JHM.LJIIJ(1, aweme);
        }
    }

    public final void LJJIIZ(M89 m89) {
        this.LJII = m89.getCreationId();
    }

    public final void LJJIIZI(Aweme aweme) {
        int i;
        LJIILL(aweme);
        if (aweme != null) {
            this.LJJL = aweme.getAid();
            this.LJJLI = JHM.LJIIIZ(aweme);
            this.LJJLIIIIJ = C227768wm.LJIIZILJ(aweme);
            this.LJJLJ = C227768wm.LJFF(aweme);
            aweme.isImage();
            this.LJJZ = aweme.getRepostFromGroupId();
            this.LJJZZI = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.LJL = aweme.getMixInfo().mixId;
            }
            if (!C188587ag.LJI(this.LJJJJJ)) {
                this.LJLJJL = C188587ag.LIZIZ(this.LJJJJJ).getMutualType();
            }
            this.LJLI = AV1.LJIILJJIL(aweme);
            this.LJLIIIL = C227768wm.LJII(aweme);
            this.LJLIIL = C227768wm.LJI(aweme);
            this.LJLJJI = C227768wm.LJIIIIZZ(aweme);
            this.LJIJI = C227768wm.LJIILJJIL(aweme);
            C188587ag.LJFF(aweme);
            this.LJIJJ = "";
            if (aweme.getAuthor() != null) {
                i = aweme.getAuthor().getFollowStatus();
            } else {
                i = -2;
            }
            this.LJLJLJ = i;
            if (TextUtils.isEmpty(this.LJIILLIIL)) {
                this.LJIILLIIL = JHM.LJIIJ(1, aweme);
            }
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.LJLL = 1;
            }
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && playListInfo.getMixId() != null) {
                this.LJLZ = aweme.playlist_info.getMixId();
            }
            if (!((Boolean) C50919Jyd.LIZ.getValue()).booleanValue()) {
                C78866UxK.LJIIZILJ(this, aweme.getAuthor());
            }
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.LL = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.LL = 1;
            }
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                this.LLIIJLIL = commerceVideoAuthInfo.getBCHashtag();
            }
            List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
            if (interactStickerStructs != null && interactStickerStructs.size() > 0) {
                for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                    if (interactStickerStruct.getQaStruct() != null) {
                        this.LLFZ = 1;
                        this.LLI = Long.valueOf(interactStickerStruct.getQaStruct().getQuestionId());
                        if (!TextUtils.equals(aweme.getAid(), String.valueOf(interactStickerStruct.getQaStruct().getItemId()))) {
                            this.LLFII = "answer";
                            return;
                        } else {
                            this.LLFII = "question";
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void LJJIJ(int i) {
        this.LLIIIILZ = i;
    }

    public final void LJJIJIIJI(int i) {
        this.LLIIII = i;
    }

    public final void LJJIJIIJIL(String str) {
        this.LJJLIIIJJI = str;
    }

    public final void LJJIJIL(String str) {
        if (TextUtils.equals(str, "from_duet_mode")) {
            this.LLIIIL = "duet";
        } else {
            if (!TextUtils.equals(str, "from_duet_mode_detail")) {
                return;
            }
            this.LLIIIL = "original";
        }
    }

    public final void LJJIJL(String str) {
        this.LJJLIIIJILLIZJL = str;
    }

    public final void LJJIJLIJ(String str) {
        this.LJLJJLL = str;
    }

    public final void LJJIL(boolean z) {
        this.LJJLIL = z;
    }

    public final void LJJIZ(int i) {
        this.LLIIL = Integer.valueOf(i);
    }

    public final void LJJJ(String str) {
        this.LJJLIIIJLJLI = str;
    }

    public final void LJJJI(String str) {
        this.LJJLIIIJL = str;
    }

    public final void LJJJIL(String str) {
        this.LJJLIIIJJIZ = str;
    }

    public final void LJJJJ(String str) {
        this.LJJLIIIJLLLLLLLZ = str;
    }

    public final void LJJJJI(String str) {
        this.LJJLIIJ = str;
    }

    public final void LJJJJIZL(String str) {
        this.LJLJL = str;
    }

    public final void LJJJJJ(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        this.LLII = str;
    }

    public final void LJJJJJL(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        this.LLIFFJFJJ = str;
    }

    public final void LJJJJL(String str) {
        this.LLIILZL = str;
    }

    public final void LJJJJLI(String str) {
        this.LLILII = str;
    }

    public final void LJJJJLL(String str) {
        this.LLIL = str;
    }

    public final void LJJJJZ(String str) {
        this.LLIIZ = str;
    }

    public final void LJJJJZI(String str) {
        this.LJLJLLL = str;
    }

    public final void LJJJLIIL(String str) {
        this.LLIILII = str;
    }
}
