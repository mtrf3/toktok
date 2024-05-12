package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpotInfo;
import com.ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import java.util.List;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JPJ extends AbstractC49114JPi implements JJK {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public SearchSpot LJLLILLLL;
    public int LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;

    public final JKA LJIILLIIL() {
        return (JKA) this.LJLLLL.getValue();
    }

    public final String LJIIZILJ() {
        String str;
        SearchSpot searchSpot = this.LJLLILLLL;
        if (searchSpot == null || (str = searchSpot.docId) == null) {
            return "";
        }
        return str;
    }

    public JPJ(JTI jti, JIB jib, JGU jgu) {
        super(jti, jib, jgu);
        this.LJLLJ = -1;
        this.LJLLL = C221108m2.LIZIZ(C49040JMm.LJLIL);
        this.LJLLLL = C221108m2.LIZIZ(new AqS155S0200000_8(jti, this, 0));
    }

    @Override // X.JJK
    public final void LIZIZ(int i, View view, Aweme aweme, List<? extends Aweme> awemeList) {
        String str;
        String str2;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(awemeList, "awemeList");
        View view2 = this.LJLIL.itemView;
        o.LJIIIIZZ(view2, "viewHolder.itemView");
        JQA LIZ = JY2.LIZ(view2);
        SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) this.LJLJI.getValue();
        if (searchGlobalViewModel != null) {
            str = searchGlobalViewModel.jv0();
        } else {
            str = null;
        }
        LIZ.LIZ(str);
        JN8 LIZIZ = JND.LIZIZ(LIZ);
        SearchSpot searchSpot = this.LJLLILLLL;
        if (searchSpot == null || (str2 = searchSpot.alaSrc) == null) {
            str2 = "";
        }
        LIZIZ.LJIIZILJ("token_type", str2);
        LIZIZ.LJIIZILJ("list_result_type", "video");
        LIZIZ.LIZLLL("aladdin_words", aweme.getDesc());
        LIZIZ.LJJI(Integer.valueOf(this.LJLLJ));
        LIZIZ.LJJIII(Integer.valueOf(i));
        LIZIZ.LJIIZILJ("list_item_id", aweme.getAid());
        LIZIZ.LJIJ("search_result_id", LJIIZILJ());
        LIZIZ.LJIILIIL();
    }

    @Override // X.JJK
    public final void LIZJ(int i, View view, Aweme aweme, List<? extends Aweme> awemeList) {
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(awemeList, "awemeList");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        LJIJ(context, view, aweme, awemeList);
        View view2 = this.LJLIL.itemView;
        o.LJIIIIZZ(view2, "viewHolder.itemView");
        JQA LIZ = JY2.LIZ(view2);
        SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) this.LJLJI.getValue();
        if (searchGlobalViewModel != null) {
            str = searchGlobalViewModel.jv0();
        } else {
            str = null;
        }
        LIZ.LIZ(str);
        JNB LIZ2 = JND.LIZ(LIZ);
        SearchSpot searchSpot = this.LJLLILLLL;
        if (searchSpot == null || (str2 = searchSpot.alaSrc) == null) {
            str2 = "";
        }
        LIZ2.LJIIZILJ("token_type", str2);
        LIZ2.LJIIZILJ("list_result_type", "video");
        LIZ2.LJIIZILJ("aladdin_button_type", "click_video");
        LIZ2.LIZLLL("aladdin_words", aweme.getDesc());
        LIZ2.LJJI(Integer.valueOf(this.LJLLJ));
        LIZ2.LJJIII(Integer.valueOf(i));
        LIZ2.LJIIZILJ("list_item_id", aweme.getAid());
        LIZ2.LJIJ("search_result_id", LJIIZILJ());
        LIZ2.LJIILIIL();
        JNW.LIZLLL(this.LJLLJ, view, aweme, "general_search", LIZ.LJ, LJIIZILJ(), aweme.getAid(), "aladdin_card");
    }

    public final void LJIJ(Context context, View view, Aweme aweme, List<? extends Aweme> awemeList) {
        C020506f c020506f;
        Bundle bundle;
        String str;
        SearchSpotInfo searchSpotInfo;
        SearchSpotInfo searchSpotInfo2;
        Long l;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(awemeList, "awemeList");
        JQA jqa = LJIILLIIL().LJLL;
        String str2 = "general_search";
        if (!TextUtils.equals(jqa.LJFF, "general_search")) {
            str2 = "search_result";
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("id", aweme.getAid());
        bundle2.putString("video_from", "from_search_ad_no_request");
        bundle2.putString("enter_from", str2);
        bundle2.putString("search_keyword", jqa.LJ);
        bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 70);
        bundle2.putString("search_id", jqa.LJII);
        bundle2.putString("key_search_type", jqa.LIZLLL);
        bundle2.putString("list_item_id", aweme.getAid());
        bundle2.putString("search_result_id", aweme.getAuthorUid());
        String str3 = null;
        if (view != null) {
            c020506f = C020506f.LIZ(view, view.getWidth(), view.getHeight());
        } else {
            c020506f = null;
        }
        C78966Uyw.LJLJJL = awemeList;
        C49823Jgx c49823Jgx = new C49823Jgx();
        c49823Jgx.LJIJJ(awemeList);
        C55457Lpd.LJLJJLL = c49823Jgx;
        SmartRoute smartRoute = new SmartRoute(context);
        smartRoute.withParam(bundle2);
        if (c020506f != null) {
            bundle = c020506f.LIZLLL();
        } else {
            bundle = null;
        }
        smartRoute.withBundleAnimation(bundle);
        smartRoute.withParam("activity_has_activity_options", true);
        SearchSpot searchSpot = this.LJLLILLLL;
        if (searchSpot != null && (searchSpotInfo2 = searchSpot.searchSpotInfo) != null && (l = searchSpotInfo2.eventId) != null) {
            str = l.toString();
        } else {
            str = null;
        }
        if (TrendingDetailServiceImpl.LIZLLL().LIZ() && !TextUtils.isEmpty(str)) {
            this.LJLJJL = aweme;
            smartRoute.withUrl("//trending/detail");
            smartRoute.withParam("outer_aweme_id", aweme.getAid());
            smartRoute.withParam("is_from_trending_card", "1");
            smartRoute.withParam("trending_event_id", str);
            SearchSpot searchSpot2 = this.LJLLILLLL;
            if (searchSpot2 != null && (searchSpotInfo = searchSpot2.searchSpotInfo) != null) {
                str3 = searchSpotInfo.sentence;
            }
            smartRoute.withParam("trending_event_name", str3);
            smartRoute.withParam("video_from", "from_trending_inflow");
            smartRoute.withParam("search_result_id", LJIIZILJ());
            Bundle bundle3 = new Bundle();
            bundle3.putSerializable("feed_param_extra", C113554cx.LJJJLZIJ(new OSZ("token_type", "tt_trendingcontent")));
            smartRoute.withParam(bundle3);
        } else {
            smartRoute.withUrl("//aweme/detail");
        }
        smartRoute.open();
        C77125UOr.LJIJ(aweme);
        SearchSpot searchSpot3 = this.LJLLILLLL;
        if (searchSpot3 != null && searchSpot3.searchSpotInfo != null) {
            JQA jqa2 = this.LJLILLLLZI;
            AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8(this, 4);
            jqa2.getClass();
            jqa2.LJJIIZ = aqS174S0100000_8;
            C49621Jdh.LIZ(this.LJLILLLLZI);
            JPT jpt = LJIIL().LJLLI;
            if (jpt == null) {
                return;
            }
            jpt.xe();
        }
    }
}
