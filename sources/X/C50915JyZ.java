package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.JyZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50915JyZ extends AbstractC49253JUr<C50915JyZ> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public Aweme LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public boolean LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public boolean LJJLL;
    public String LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public boolean LJL;
    public String LJLI;
    public String LJLIIIL;
    public boolean LJLIIL;
    public int LJLIL;
    public java.util.Map<String, String> LJLILLLLZI;
    public String LJLJI;

    public C50915JyZ() {
        super("enter_music_detail");
        this.LJJZ = "";
        this.LJLIIIL = "";
        this.LJLIL = -1;
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        Aweme aweme;
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5 = this.LJJLIIIJ;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str5, c1798874e);
        LJ("music_id", this.LJJLIIIJJI, c1798874e);
        LJ("author_id", this.LJJLIIIJILLIZJL, c1798874e);
        String str6 = this.LJLI;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("category_name", str6, c1799074g);
        LJ("request_id", this.LJJLIIIJJIZ, c1798874e);
        StringBuilder LIZ = X1D.LIZ();
        boolean z2 = false;
        LIZ.append(0);
        LIZ.append("");
        LIZLLL("is_reposted", X1D.LIZIZ(LIZ));
        LIZLLL("repost_from_group_id", null);
        LIZLLL("repost_from_user_id", null);
        LIZLLL("from_page", this.LJLIIIL);
        BusinessComponentServiceUtils.getBusinessBridgeService().getClass();
        if ((!C85990Xow.LIZ().toUpperCase(Locale.ROOT).equals("US") || ((RBX) HG3.LJIILL()).isLogin()) && (aweme = this.LJJLIIIJLJLI) != null && aweme.getStickerEntranceInfo() != null && this.LJJJJJ.getStickerEntranceInfo().id != null) {
            LIZLLL("from_prop_id", this.LJJLIIIJLJLI.getStickerEntranceInfo().id);
        }
        if (C1808377v.LIZ().LIZIZ(this.LJJLIIIJ)) {
            LJ("previous_page", "push", c1799074g);
        } else if (!TextUtils.isEmpty(this.LJJLIIIJLLLLLLLZ)) {
            LJ("previous_page", this.LJJLIIIJLLLLLLLZ, c1799074g);
            LJ("previous_page_position", this.LJJLIIJ, c1799074g);
        }
        String str7 = "1";
        if (this.LJJLIL) {
            LJ("is_instructive", "1", c1799074g);
            LJ("bottom_bar_show", "1", c1799074g);
        }
        if (C227768wm.LJJIIJ(this.LIZLLL)) {
            LIZIZ(this.LJJLIIIJJIZ);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_fresh") || TextUtils.equals(this.LIZLLL, "homepage_channel")) {
            C2UL.LIZ();
        }
        if (!TextUtils.isEmpty(this.LJIILL)) {
            LIZLLL("tab_name", this.LJIILL);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ(null, null, c1799074g);
        }
        if (!TextUtils.isEmpty(null)) {
            LJ("playlist_type", null, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJLJ)) {
            LJ("impr_type", this.LJJLJ, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJLJLI)) {
            LJ("compilation_id", this.LJJLJLI, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJL)) {
            LJ("process_id", this.LJJLIIIJL, c1799074g);
        }
        if (LJIJI() && !TextUtils.isEmpty(null)) {
            LIZLLL("enter_position", null);
        }
        java.util.Map<String, String> map = this.LJLILLLLZI;
        if (map != null) {
            LIZ(map);
        }
        LIZLLL("impr_id", this.LJJLIIIJJIZ);
        if (IG2.LIZ) {
            LIZLLL("is_fullscreen", "1");
        }
        if (C227768wm.LJJIFFI(this.LIZLLL)) {
            if (this.LJJLL) {
                str4 = "follow";
            } else {
                str4 = "unfollow";
            }
            LIZLLL("relation_type", str4);
            LIZLLL("video_type", this.LJJZZI);
            LIZLLL("rec_uid", this.LJJZZIII);
        }
        if (this.LJL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL("ugc_to_pgc_meta", str);
        if ("search_result".equals(this.LIZLLL) || "general_search".equals(this.LIZLLL)) {
            LIZLLL("last_from_group_id", null);
            LIZLLL("is_search_scene", "1");
        }
        LIZLLL("follow_status", this.LJJZ);
        Aweme aweme2 = this.LJJLIIIJLJLI;
        if (aweme2 != null) {
            LIZJ(aweme2.getAwemeType(), "aweme_type");
            LIZJ(C227768wm.LJIJJ(this.LJJLIIIJLJLI), "text_post_content");
            LIZJ(C227768wm.LJIILIIL(this.LJJLIIIJLJLI), "pic_cnt");
            if (this.LJJJJJ.getMobParams() != null) {
                LIZ(this.LJJLIIIJLJLI.getMobParams());
            }
            CommonFeedApiService.LIZ().LJIJJLI(this.LJJJJJ, this);
            LQA.LIZIZ.LJII(this.LIZLLL, (HashMap) this.LIZIZ, this.LJJJJJ, true);
            if (C51556KLg.LIZ != null) {
                C51556KLg.LIZ();
                LIZ(C51556KLg.LIZ().LJIIJJI(this.LJJJJJ, null));
            }
            if (this.LJJLIIIJLJLI.getOriginVolume() != null && !this.LJJLIIIJLJLI.getOriginVolume().isEmpty() && CastFloatProtector.parseFloat(this.LJJLIIIJLJLI.getOriginVolume()) > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (this.LJJLIIIJLJLI.getMusicVolume() != null && !this.LJJLIIIJLJLI.getMusicVolume().isEmpty() && CastFloatProtector.parseFloat(this.LJJLIIIJLJLI.getMusicVolume()) > 0.0f) {
                z2 = true;
            }
            Boolean valueOf2 = Boolean.valueOf(z2);
            if (valueOf.booleanValue() && valueOf2.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZLLL("is_original_and_added_sound", str2);
            if (valueOf.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZLLL("original_sound_volume", str3);
            if (!valueOf2.booleanValue()) {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZLLL("added_sound_volume", str7);
            LIZJ(this.LJJLIIIJLJLI.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        }
        LIZJ(this.LJLIIL ? 1 : 0, "is_long_press");
        int i = this.LJLIL;
        if (i != -1) {
            LIZJ(i, "music_name");
        }
        String str8 = this.LJLJI;
        if (str8 != null) {
            LIZLLL("search_enter_position", str8);
        }
    }

    public final void LJJIIZI(Aweme aweme) {
        String valueOf;
        LJIILL(aweme);
        this.LJJLIIIJLJLI = aweme;
        this.LJJLIIIJJIZ = C227768wm.LJIIZILJ(aweme);
        this.LJJLIIIJ = aweme.getAid();
        this.LJJLIIIJILLIZJL = aweme.getAuthorUid();
        if (aweme.getMusic() == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(aweme.getMusic().getId());
        }
        this.LJJLIIIJJI = valueOf;
        this.LJJLJ = C227768wm.LJFF(aweme);
        if (aweme.getMixInfo() != null) {
            this.LJJLJLI = aweme.getMixInfo().mixId;
        }
        this.LJJLL = AV1.LJIILJJIL(aweme);
        this.LJJZ = C227768wm.LJIJ(aweme.getAuthor());
        this.LJJZZI = C227768wm.LJII(aweme);
        this.LJJZZIII = C227768wm.LJI(aweme);
        Music music = aweme.getMusic();
        if (music != null) {
            this.LJLILLLLZI = music.getLogExtraMap();
        }
    }
}
