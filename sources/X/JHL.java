package X;

import X.JHL;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.ss.android.ugc.aweme.profile.model.HotListStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class JHL<E extends JHL> extends JHM {
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public Boolean LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public int LJIJJLI;
    public String LJIL;
    public String LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public String LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public String LJJIJIIJI;
    public String LJJIJIIJIL;
    public String LJJIJIL;
    public String LJJIJL;
    public String LJJIJLIJ;
    public String LJJIL;
    public String LJJIZ;
    public String LJJJ;
    public String LJJJI;
    public String LJJJIL;
    public String LJJJJ;
    public String LJJJJI;
    public String LJJJJIZL;
    public Aweme LJJJJJ;
    public String LJJJJJL;
    public String LJJJJL;
    public String LJJJJLI;
    public String LJJJJLL;
    public int LJJJJZ;
    public String LJJJJZI;
    public String LJJJLIIL;
    public int LJJJLL;
    public int LJJJLZIJ;
    public String LJJJZ;

    public String LJIJJ() {
        return "";
    }

    @Override // X.JHM
    public void LJI() {
        String str;
        int i;
        List<AnchorCommonStruct> anchors;
        if ("homepage_country".equals(this.LIZLLL) && !TextUtils.isEmpty(this.LJIILJJIL)) {
            LJ("country_name", this.LJIILJJIL, InterfaceC1798974f.LIZ);
        }
        if (("others_homepage".equals(this.LIZLLL) || "collection_video".equals(this.LIZLLL) || "personal_homepage".equals(this.LIZLLL) || "playlist".equals(this.LIZLLL)) && !TextUtils.isEmpty(this.LJIILL)) {
            String str2 = this.LJIILL;
            C1799074g c1799074g = InterfaceC1798974f.LIZ;
            LJ("tab_name", str2, c1799074g);
            LJ("order", this.LJIILLIIL, c1799074g);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_fresh") || TextUtils.equals(this.LIZLLL, "homepage_channel")) {
            C2UL.LIZ();
        }
        if (!TextUtils.isEmpty(this.LJ)) {
            if (TextUtils.equals(this.LIZLLL, "homepage_fresh_topic") || this.LJFF) {
                LJ("topic_name", this.LJ, InterfaceC1798974f.LIZ);
            } else {
                LJ("trending_topic", this.LJ, InterfaceC1798974f.LIZ);
            }
        }
        if ("discovery_category".equals(this.LIZLLL) && !TextUtils.isEmpty(this.LJIILL)) {
            String str3 = this.LJIILL;
            C1799074g c1799074g2 = InterfaceC1798974f.LIZ;
            LJ("discovery_category", str3, c1799074g2);
            LJ("order", this.LJIILLIIL, c1799074g2);
        }
        String str4 = this.LIZLLL;
        C1799074g c1799074g3 = InterfaceC1798974f.LIZ;
        LJ("enter_from", str4, c1799074g3);
        if (!TextUtils.isEmpty(this.LJJIIZI)) {
            LIZLLL("is_from_trending_card", this.LJJIIZI);
        }
        if (!TextUtils.isEmpty(this.LJJIJ)) {
            LIZLLL("trending_topic", this.LJJIJ);
        }
        if (!TextUtils.isEmpty(this.LJJIJIIJI)) {
            LIZLLL("trending_topic_id", this.LJJIJIIJI);
        }
        LIZJ(this.LJIJJLI, "is_long");
        String str5 = "1";
        if (C84763XOl.LJIIJJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL("is_background", str);
        if (TextUtils.equals(this.LIZLLL, "general_search")) {
            LIZLLL("video_tag", this.LJIIIIZZ);
        }
        if (LJIJI()) {
            LJ("rank", this.LJIIIZ, c1799074g3);
            if (!IG2.LIZ) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZLLL("is_fullscreen", str5);
            if (!TextUtils.isEmpty(this.LJJIFFI)) {
                LJ("search_result_id", this.LJJIFFI, c1799074g3);
                if (TextUtils.isEmpty(this.LJJIII)) {
                    LJ("list_item_id", LJIJJ(), c1799074g3);
                } else {
                    LJ("list_item_id", this.LJJIII, c1799074g3);
                }
            }
            if (!TextUtils.isEmpty(this.LJJII)) {
                LJ("list_result_type", this.LJJII, c1799074g3);
            }
            if (!TextUtils.isEmpty(this.LJJIIJ)) {
                LJ("search_third_item_id", LJIJJ(), c1799074g3);
            }
            if (!TextUtils.isEmpty(this.LJJIIJZLJL)) {
                LIZLLL("impr_id", this.LJJIIJZLJL);
            } else {
                LIZLLL("impr_id", this.LJJIIZ);
            }
        }
        if (!TextUtils.isEmpty(this.LJJIL)) {
            LIZLLL("search_id", this.LJJIL);
        }
        if (!TextUtils.isEmpty(this.LJJI)) {
            LIZLLL("search_keyword", this.LJJI);
        }
        if (!TextUtils.isEmpty(this.LJJ)) {
            LIZLLL("search_type", this.LJJ);
        }
        if (!TextUtils.isEmpty(this.LJIL)) {
            LIZLLL("is_search_scene", this.LJIL);
        }
        if (!TextUtils.isEmpty(this.LJJIFFI)) {
            LIZLLL("search_result_id", this.LJJIFFI);
        }
        if (!TextUtils.isEmpty(this.LJIIIZ)) {
            LIZLLL("rank", this.LJIIIZ);
        }
        if (!TextUtils.isEmpty(this.LJIIJ)) {
            LIZLLL("search_rank", this.LJIIJ);
        }
        if (!TextUtils.isEmpty(this.LJJIJIIJIL)) {
            LIZLLL("activity_keyword", this.LJJIJIIJIL);
        }
        if (!TextUtils.isEmpty(this.LJJIJIL)) {
            LIZLLL("video_card_type", this.LJJIJIL);
        }
        if (!TextUtils.isEmpty(this.LJJIJL)) {
            LIZLLL("search_tab_name", this.LJJIJL);
        }
        if (!TextUtils.isEmpty(this.LJJIJLIJ)) {
            LIZLLL("search_tab_rank", this.LJJIJLIJ);
        }
        if (!TextUtils.isEmpty(this.LJJIZ)) {
            LIZLLL("enter_from", this.LJJIZ);
        }
        if (!TextUtils.isEmpty(this.LJJJ)) {
            LIZLLL("vs_entrance_type", this.LJJJ);
        }
        if (!TextUtils.isEmpty(this.LJJJI)) {
            LIZLLL("vs_session_id", this.LJJJI);
        }
        if (!TextUtils.isEmpty(this.LJJJIL)) {
            LIZLLL("result_id", this.LJJJIL);
        }
        if (!TextUtils.isEmpty(this.LJJJJ)) {
            LIZLLL("vs_group_id", this.LJJJJ);
        }
        if (!TextUtils.isEmpty(this.LJJJJI)) {
            LIZLLL("news_id", this.LJJJJI);
        }
        if (this.LJIIZILJ.booleanValue()) {
            LIZLLL("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        }
        if (!TextUtils.isEmpty(this.LJIJ)) {
            LIZLLL("is_pinned", this.LJIJ);
        }
        if (TextUtils.equals(this.LIZLLL, "homepage_hot") || TextUtils.equals(this.LIZLLL, "homepage_follow")) {
            if (!TextUtils.isEmpty(this.LJIJI)) {
                LJ("rec_type", this.LJIJI, c1799074g3);
            }
            if (!TextUtils.isEmpty(this.LJIJJ)) {
                LJ("label_text", this.LJIJJ, c1799074g3);
            }
        }
        int i2 = this.LJJJJZ;
        if (i2 >= 0) {
            LIZJ(i2, "follow_status");
        }
        if (!TextUtils.isEmpty(this.LJJJJZI)) {
            LIZLLL("story_type", this.LJJJJZI);
        }
        if (!TextUtils.isEmpty(this.LJJJLIIL)) {
            LIZLLL("story_collection_id", this.LJJJLIIL);
        }
        int i3 = this.LJJJLL;
        if (i3 >= 0) {
            LIZJ(i3, "is_share_to_story");
        }
        LIZJ(this.LJJJLZIJ, "is_story_to_normal");
        if (!TextUtils.isEmpty(this.LJJJJIZL)) {
            LIZLLL("play_mode", this.LJJJJIZL);
        }
        if (!TextUtils.isEmpty(this.LJJJZ)) {
            LIZLLL("from_group_id", this.LJJJZ);
        }
        if (!TextUtils.isEmpty(this.LJJJJJL)) {
            LIZLLL("collection_id", this.LJJJJJL);
        }
        if (!TextUtils.isEmpty(this.LJJJJL)) {
            LIZLLL("collection_name", this.LJJJJL);
        }
        if (!TextUtils.isEmpty(this.LJJJJLL)) {
            LIZLLL("prop_id", this.LJJJJLL);
        }
        if (!TextUtils.isEmpty(this.LJJJJLI)) {
            LIZLLL("effect_id", this.LJJJJLI);
        }
        Aweme aweme = this.LJJJJJ;
        if (aweme != null && (anchors = aweme.getAnchors()) != null && !anchors.isEmpty()) {
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().getComponentKey(), "anchor_aigc_avatar")) {
                    i = 1;
                    break;
                }
            }
        }
        i = 0;
        LIZJ(i, "is_ai_avatar");
    }

    public final boolean LJIJI() {
        if (TextUtils.equals(this.LIZLLL, "general_search") || TextUtils.equals(this.LIZLLL, "search_result") || TextUtils.equals(this.LIZLLL, "search_ecommerce") || TextUtils.equals(this.LIZLLL, "search_music")) {
            return true;
        }
        if (TextUtils.equals(this.LIZLLL, "others_homepage") && !TextUtils.isEmpty(this.LJJIL)) {
            return true;
        }
        if (TextUtils.equals(this.LIZLLL, "single_song") && !TextUtils.isEmpty(this.LJJIL)) {
            return true;
        }
        if (TextUtils.equals(this.LIZLLL, "challenge") && !TextUtils.isEmpty(this.LJJIL)) {
            return true;
        }
        return false;
    }

    public JHL(String str) {
        super(str);
        this.LJIIZILJ = Boolean.FALSE;
        this.LJJJJZ = -1;
        this.LJJJJZI = "";
        this.LJJJLIIL = "";
        this.LJJJLL = -1;
        this.LJJJLZIJ = -1;
        this.LJJJZ = "";
    }

    public final void LJIILL(Aweme aweme) {
        String str;
        if (aweme != null) {
            if (aweme.getAuthor() != null) {
                this.LJIILJJIL = aweme.getAuthor().getRegion();
            }
            this.LJJIIZI = aweme.isFromTrendingCard();
            this.LJJIJ = aweme.getTrendingName();
            this.LJJIJIIJI = aweme.getTrendingId();
            this.LJJJJJ = aweme;
            this.LJJJLZIJ = aweme.getIsStoryToNormal() ? 1 : 0;
            if (aweme.getIsTikTokStory() || aweme.getAwemeType() == 40) {
                str = "story";
            } else {
                str = "post";
            }
            this.LJJJJZI = str;
            HotSearchInfo hotSearchInfo = aweme.getHotSearchInfo();
            if (hotSearchInfo != null && hotSearchInfo.getSentence() != null) {
                this.LJ = hotSearchInfo.getSentence();
            } else {
                this.LJ = aweme.getHotSpot();
            }
            HotListStruct hotListStruct = aweme.getHotListStruct();
            if (hotListStruct != null) {
                if (hotListStruct.getType() == 9) {
                    this.LJFF = true;
                }
                if (hotListStruct.getType() == 9 && TextUtils.isEmpty(this.LJ)) {
                    this.LJ = hotListStruct.getTitile();
                }
            }
        }
        LJIIIIZZ(aweme);
    }

    public final void LJIILLIIL(String str) {
        this.LJJJJJL = str;
    }

    public final void LJIIZILJ(String str) {
        this.LJJJJL = str;
    }

    public final void LJIJ(String str) {
        this.LJJJJLI = str;
    }

    public final void LJIJJLI(java.util.Map map) {
        if (map != null && !map.isEmpty()) {
            if (!TextUtils.isEmpty((CharSequence) map.get("search_id"))) {
                this.LJJIL = (String) map.get("search_id");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("search_keyword"))) {
                this.LJJI = (String) map.get("search_keyword");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("search_result_id"))) {
                this.LJJIFFI = (String) map.get("search_result_id");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("is_search_scene"))) {
                this.LJIL = (String) map.get("is_search_scene");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("search_type"))) {
                this.LJJ = (String) map.get("search_type");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("rank"))) {
                this.LJIIIZ = (String) map.get("rank");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("search_rank"))) {
                this.LJIIJ = (String) map.get("search_rank");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("list_item_id"))) {
                this.LJJIII = (String) map.get("list_item_id");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("activity_keyword"))) {
                this.LJJIJIIJIL = (String) map.get("activity_keyword");
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("video_card_type"))) {
                this.LJJIJIL = (String) map.get("video_card_type");
            }
        }
    }

    public final void LJIL(String str) {
        this.LJJIII = str;
    }

    public final void LJJ(String str) {
        this.LJJII = str;
    }

    public final void LJJI(String str) {
        this.LJIILLIIL = str;
    }

    public final void LJJIFFI(String str) {
        this.LJJJJLL = str;
    }

    public final void LJJII(String str) {
        this.LJJIL = str;
    }

    public final void LJJIII(String str) {
        this.LJJIFFI = str;
    }

    public final void LJJIIJ(String str) {
        this.LJJIIJ = str;
    }

    public final void LJJIIJZLJL(String str) {
        this.LJIILL = str;
    }
}
