package com.ss.android.ugc.aweme.search.pages.result.core.repo;

import X.AbstractC36908Ee8;
import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C10K;
import X.C1FE;
import X.C49916JiS;
import X.C50031JkJ;
import X.C50272JoC;
import X.C50273JoD;
import X.C50637Ju5;
import X.C73428Sro;
import X.C76L;
import X.C78977Uz7;
import X.E4T;
import X.E6L;
import X.ENX;
import X.InterfaceC195787mI;
import X.InterfaceC36229EJt;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC789838c;
import X.O6R;
import X.QDX;
import X.T16;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchApiNew {
    public static final String LIZ;
    public static final InterfaceC789838c LIZIZ;
    public static final Set<String> LIZJ;

    /* loaded from: classes9.dex */
    public interface RealApi {
        public static final C50272JoC LIZ = C50272JoC.LIZ;

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/videosug/")
        AbstractC73672Svk<SearchSugWordResponse> fetchFeedDetailWords(@InterfaceC64987Pex("aweme_id") String str, @InterfaceC64987Pex("source") String str2, @InterfaceC64987Pex("is_non_personalized_search") Integer num);

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/horizontal/loadmore/")
        AbstractC73672Svk<String> horizontalLoadmore(@InterfaceC64987Pex("search_id") String str, @InterfaceC64987Pex("query") String str2, @InterfaceC64987Pex("backtrace") String str3, @InterfaceC64987Pex("log_id") String str4, @InterfaceC64987Pex("token_type") String str5, @InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("count") Long l);

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/item/")
        C76L<SearchMix> searchFeedList(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("offset") long j, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("source") String str2, @InterfaceC64987Pex("search_source") String str3, @InterfaceC64987Pex("hot_search") int i2, @InterfaceC64987Pex("search_id") String str4, @InterfaceC64987Pex("last_search_id") String str5, @InterfaceC64987Pex("query_correct_type") int i3, @InterfaceC64987Pex("is_filter_search") int i4, @InterfaceC64987Pex("sort_type") int i5, @InterfaceC64987Pex("publish_time") int i6, @InterfaceC64987Pex("enter_from") String str6, @InterfaceC64987Pex("search_channel") String str7, @InterfaceC64987Pex("show_results_source") String str8, @InterfaceC64987Pex("search_context") String str9, @InterfaceC36229EJt LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC64987Pex("personal_context_info") String str10, @InterfaceC64987Pex("translate_language_code") String str11, @InterfaceC64987Pex("is_non_personalized_search") Integer num, @InterfaceC64987Pex("sug_generate_type") String str12, @InterfaceC64987Pex("search_session_id") Long l, @InterfaceC64987Pex("filter_item_ids") String str13);

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/general/inflow/")
        AbstractC73638SvC<SearchMixFeedList> searchInnerFlow(@InterfaceC64987Pex("search_id") String str, @InterfaceC64987Pex("inner_search_id") String str2, @InterfaceC64987Pex("offset") int i, @InterfaceC64987Pex("preload_num") int i2, @InterfaceC64987Pex("keyword") String str3, @InterfaceC64987Pex("search_source") String str4, @InterfaceC64987Pex("inner_flow_context") String str5, @InterfaceC64987Pex("backtrace") String str6, @InterfaceC64987Pex("consume_infos") String str7, @InterfaceC64987Pex("inflow_ad_info") String str8, @InterfaceC64987Pex("ad_user_agent") String str9, @InterfaceC64987Pex("gaid") String str10, @InterfaceC64987Pex("ad_personality_mode") int i3, @InterfaceC64987Pex("cmpl_enc") String str11, @InterfaceC64987Pex("is_non_personalized_search") Integer num, @InterfaceC64987Pex("sug_generate_type") String str12);

        @E6L(3)
        @InterfaceC195787mI
        @E4T("/aweme/v1/general/search/single/")
        C10K<SearchMixFeedList> searchMTMixFeedList(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("offset") int i, @InterfaceC64987Pex("count") int i2, @InterfaceC64987Pex("enter_from") String str2, @InterfaceC64987Pex("search_source") String str3, @InterfaceC64987Pex("hot_search") int i3, @InterfaceC64987Pex("search_id") String str4, @InterfaceC64987Pex("last_search_id") String str5, @InterfaceC64987Pex("query_correct_type") int i4, @InterfaceC64987Pex("multi_mod") int i5, @InterfaceC64989Pez("sug_tag_text") String str6, @InterfaceC64987Pex("sug_user_id") String str7, @InterfaceC64987Pex("is_live_sug") String str8, @InterfaceC64987Pex("is_rich_sug") String str9, @InterfaceC64987Pex("is_filter_search") int i6, @InterfaceC64987Pex("publish_time") int i7, @InterfaceC64987Pex("sort_type") int i8, @InterfaceC64987Pex("backtrace") String str10, @InterfaceC64987Pex("words_type") String str11, @InterfaceC64987Pex("search_context") String str12, @InterfaceC64987Pex("ad_user_agent") String str13, @InterfaceC64987Pex("trending_event_id") String str14, @InterfaceC64987Pex("auto_play_user_video") int i9, @InterfaceC64987Pex("preset_queries_loaded") int i10, @InterfaceC64987Pex("in_preset_queries") int i11, @InterfaceC36229EJt LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC64987Pex("from_group_id") String str15, @InterfaceC64987Pex("research_filter_type") String str16, @InterfaceC64987Pex("general_filter_sort_type") Integer num, @InterfaceC64987Pex("personal_context_info") String str17, @InterfaceC64987Pex("prefer_layout") String str18, @InterfaceC64987Pex("hashtag_id") String str19, @InterfaceC64987Pex("search_session_id") Long l, @InterfaceC64987Pex("is_pull_refresh") Integer num2, @InterfaceC64987Pex("visible_modules") Long l2, @InterfaceC64987Pex("gaid") String str20, @InterfaceC64987Pex("ad_personality_mode") int i12, @InterfaceC64987Pex("cmpl_enc") String str21, @InterfaceC64987Pex("translate_language_code") String str22, @InterfaceC64987Pex("song_id") String str23, @InterfaceC64987Pex("app_theme") String str24, @InterfaceC64987Pex("app_name") String str25, @InterfaceC64987Pex("screen_width") Integer num3, @InterfaceC64987Pex("screen_height") Integer num4, @InterfaceC64987Pex("cache_prompt") Integer num5, @InterfaceC64987Pex("effect_sdk_version") String str26, @InterfaceC64987Pex("is_non_personalized_search") Integer num6, @InterfaceC64987Pex("sug_generate_type") String str27, @InterfaceC64987Pex("user_rt_acts") String str28);

        @E6L(3)
        @E4T("/aweme/v1/general/search/stream/")
        @ENX
        @InterfaceC195787mI
        C10K<QDX<SearchMixFeedList>> searchMTMixFeedListByChunk(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("offset") int i, @InterfaceC64987Pex("count") int i2, @InterfaceC64987Pex("enter_from") String str2, @InterfaceC64987Pex("search_source") String str3, @InterfaceC64987Pex("hot_search") int i3, @InterfaceC64987Pex("search_id") String str4, @InterfaceC64987Pex("last_search_id") String str5, @InterfaceC64987Pex("query_correct_type") int i4, @InterfaceC64987Pex("multi_mod") int i5, @InterfaceC64987Pex("sug_tag_text") String str6, @InterfaceC64987Pex("sug_user_id") String str7, @InterfaceC64987Pex("is_live_sug") String str8, @InterfaceC64987Pex("is_rich_sug") String str9, @InterfaceC64987Pex("is_filter_search") int i6, @InterfaceC64987Pex("publish_time") int i7, @InterfaceC64987Pex("sort_type") int i8, @InterfaceC64987Pex("ad_user_agent") String str10, @InterfaceC64987Pex("trending_event_id") String str11, @InterfaceC64987Pex("search_context") String str12, @InterfaceC64987Pex("backtrace") String str13, @InterfaceC64987Pex("words_type") String str14, @InterfaceC64987Pex("auto_play_user_video") int i9, @InterfaceC64987Pex("preset_queries_loaded") int i10, @InterfaceC64987Pex("in_preset_queries") int i11, @InterfaceC36229EJt LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC64987Pex("from_group_id") String str15, @InterfaceC64987Pex("with_raw_data") int i12, @InterfaceC64987Pex("research_filter_type") String str16, @InterfaceC64987Pex("general_filter_sort_type") Integer num, @InterfaceC64987Pex("personal_context_info") String str17, @InterfaceC64987Pex("prefer_layout") String str18, @InterfaceC64987Pex("hashtag_id") String str19, @InterfaceC64987Pex("search_session_id") Long l, @InterfaceC64987Pex("is_pull_refresh") Integer num2, @InterfaceC64987Pex("visible_modules") Long l2, @InterfaceC64987Pex("gaid") String str20, @InterfaceC64987Pex("ad_personality_mode") int i13, @InterfaceC64987Pex("cmpl_enc") String str21, @InterfaceC64987Pex("translate_language_code") String str22, @InterfaceC64987Pex("song_id") String str23, @InterfaceC64987Pex("app_theme") String str24, @InterfaceC64987Pex("app_name") String str25, @InterfaceC64987Pex("screen_width") Integer num3, @InterfaceC64987Pex("screen_height") Integer num4, @InterfaceC64987Pex("cache_prompt") Integer num5, @InterfaceC64987Pex("effect_sdk_version") String str26, @InterfaceC64987Pex("is_non_personalized_search") Integer num6, @InterfaceC64987Pex("prefetch_type") String str27, @InterfaceC64987Pex("prefetch_id") String str28, @InterfaceC64987Pex("sug_generate_type") String str29, @InterfaceC64987Pex("user_rt_acts") String str30);

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/prefetch/ack/")
        AbstractC73672Svk<String> searchPressPrefetchAck(@InterfaceC64987Pex("prefetch_id") String str, @InterfaceC64987Pex("prefetch_result") String str2, @InterfaceC64987Pex("search_source") String str3, @InterfaceC64987Pex("cancel_reason") String str4);
    }

    static {
        String SEARCH_HOST = Api.LIZ;
        LIZ = SEARCH_HOST;
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        o.LJIIIIZZ(SEARCH_HOST, "SEARCH_HOST");
        LIZIZ = LIZLLL.create(SEARCH_HOST);
        LIZJ = new LinkedHashSet();
    }

    public static final RealApi LIZ() {
        RealApi.LIZ.getClass();
        return C50272JoC.LIZIZ;
    }

    public static AbstractC73638SvC LIZIZ(C50273JoD c50273JoD) {
        try {
            return LIZ().searchInnerFlow(c50273JoD.LIZ, c50273JoD.LIZJ, c50273JoD.LIZLLL, c50273JoD.LJ, c50273JoD.LJFF, c50273JoD.LJIILL, c50273JoD.LJI, c50273JoD.LJII, c50273JoD.LJIIIIZZ, c50273JoD.LJIIIZ, c50273JoD.LJIIJ, c50273JoD.LJIIJJI, c50273JoD.LJIIL, c50273JoD.LJIILIIL, c50273JoD.LJIILJJIL, c50273JoD.LIZIZ);
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }

    public static C73428Sro LIZJ(C50031JkJ c50031JkJ, int i, SearchMixFeedList searchMixFeedList) {
        C10K<SearchMixFeedList> c10k;
        if (searchMixFeedList != null) {
            c10k = searchMixFeedList.LJLILLLLZI;
            searchMixFeedList.LJLILLLLZI = null;
        } else {
            c10k = null;
        }
        return AbstractC73672Svk.LJIIJ(new C49916JiS(i, c10k, c50031JkJ, new C50637Ju5())).LJJIJL(new C1FE(searchMixFeedList)).LJJIJL(O6R.LJLIL).LJJIJL(C78977Uz7.LJLIL).LJJL(T16.LIZ());
    }
}
