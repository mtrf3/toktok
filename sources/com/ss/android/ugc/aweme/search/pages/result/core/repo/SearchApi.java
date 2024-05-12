package com.ss.android.ugc.aweme.search.pages.result.core.repo;

import X.AbstractC36908Ee8;
import X.C10K;
import X.C221108m2;
import X.C50031JkJ;
import X.C50035JkN;
import X.C62822Ol8;
import X.C76L;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC36229EJt;
import X.InterfaceC64987Pex;
import com.google.gson.m;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.repo.SearchEffectListResponse;
import com.ss.android.ugc.aweme.search.pages.result.hashtagsearch.core.model.SearchChallengeList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchApi {
    public static final String LIZ = Api.LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C50035JkN.LJLIL);

    /* loaded from: classes9.dex */
    public interface RealApi {
        @InterfaceC195787mI
        @E4T("/aweme/v1/challenge/search/")
        C76L<SearchChallengeList> searchChallengeList(@InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("enter_from") String str2, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("hot_search") int i2, @InterfaceC64987Pex("source") String str3, @InterfaceC64987Pex("search_source") String str4, @InterfaceC64987Pex("search_id") String str5, @InterfaceC64987Pex("last_search_id") String str6, @InterfaceC64987Pex("query_correct_type") int i3, @InterfaceC64987Pex("search_context") String str7, @InterfaceC64987Pex("personal_context_info") String str8, @InterfaceC64987Pex("is_non_personalized_search") Integer num, @InterfaceC64987Pex("sug_generate_type") String str9, @InterfaceC64987Pex("search_session_id") Long l);

        @InterfaceC195787mI
        @E4T("/aweme/v1/music/search/")
        C76L<m> searchDynamicMusicList(@InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("enter_from") String str2, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("hot_search") int i2, @InterfaceC64987Pex("search_id") String str3, @InterfaceC64987Pex("last_search_id") String str4, @InterfaceC64987Pex("source") String str5, @InterfaceC64987Pex("search_source") String str6, @InterfaceC64987Pex("query_correct_type") int i3, @InterfaceC64987Pex("is_filter_search") int i4, @InterfaceC64987Pex("filter_by") int i5, @InterfaceC64987Pex("sort_type") int i6, @InterfaceC36229EJt LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC64987Pex("search_context") String str7, @InterfaceC64987Pex("personal_context_info") String str8, @InterfaceC64987Pex("is_non_personalized_search") Integer num, @InterfaceC64987Pex("sug_generate_type") String str9, @InterfaceC64987Pex("search_session_id") Long l);

        @InterfaceC195787mI
        @E4T("/aweme/v1/loadmore/wish/")
        C10K<SearchEffectListResponse> searchEffectList(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("alasrc") String str2, @InterfaceC64987Pex("source") String str3, @InterfaceC64987Pex("offset") int i, @InterfaceC64987Pex("limit") int i2, @InterfaceC64987Pex("aid") int i3, @InterfaceC64987Pex("search_id") String str4, @InterfaceC64987Pex("effect_sdk_version") String str5);

        @InterfaceC195787mI
        @E4T("/aweme/v1/live/search/")
        C76L<SearchLiveList> searchLiveList(@InterfaceC64987Pex("offset") long j, @InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("search_source") String str2, @InterfaceC64987Pex("enter_from") String str3, @InterfaceC64987Pex("search_id") String str4, @InterfaceC64987Pex("source") String str5, @InterfaceC64987Pex("live_id_list") String str6, @InterfaceC64987Pex("last_search_id") String str7, @InterfaceC64987Pex("search_context") String str8, @InterfaceC64987Pex("personal_context_info") String str9, @InterfaceC64987Pex("is_non_personalized_search") Integer num, @InterfaceC64987Pex("sug_generate_type") String str10, @InterfaceC64987Pex("search_session_id") Long l);

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/place/")
        C76L<m> searchPlaceList(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("offset") long j, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("search_source") String str2, @InterfaceC64987Pex("search_id") String str3, @InterfaceC64987Pex("last_search_id") String str4, @InterfaceC64987Pex("search_context") String str5, @InterfaceC64987Pex("personal_context_info") String str6, @InterfaceC64987Pex("is_non_personalized_search") Integer num, @InterfaceC64987Pex("sug_generate_type") String str7, @InterfaceC64987Pex("search_session_id") Long l);

        @InterfaceC195787mI
        @E4T("/aweme/v1/discover/search/")
        C76L<SearchUserList> searchUserList(@InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("enter_from") String str2, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("type") int i2, @InterfaceC64987Pex("hot_search") int i3, @InterfaceC64987Pex("search_source") String str3, @InterfaceC64987Pex("search_id") String str4, @InterfaceC64987Pex("last_search_id") String str5, @InterfaceC64987Pex("query_correct_type") int i4, @InterfaceC64987Pex("search_channel") String str6, @InterfaceC64987Pex("sug_user_id") String str7, @InterfaceC64987Pex("is_rich_sug") String str8, @InterfaceC64987Pex("search_context") String str9, @InterfaceC64987Pex("is_filter_search") int i5, @InterfaceC36229EJt LinkedHashMap<String, String> linkedHashMap, @InterfaceC64987Pex("personal_context_info") String str10, @InterfaceC64987Pex("is_non_personalized_search") Integer num, @InterfaceC64987Pex("sug_generate_type") String str11, @InterfaceC64987Pex("search_session_id") Long l);
    }

    public static RealApi LIZ() {
        return (RealApi) LIZIZ.getValue();
    }

    public static SearchLiveList LIZIZ(C50031JkJ param) {
        o.LJIIIZ(param, "param");
        try {
            SearchLiveList searchLiveList = LIZ().searchLiveList(param.LJIIIIZZ, param.LIZ, param.LJIIIZ, param.LIZJ, param.LJIIJ, param.LJI, param.LIZLLL, param.LJIJ, param.LJII, param.LJIJI, param.LJJIIJ, param.LJJIIZ, param.LJJIIZI, param.LJJIJ).get();
            o.LJIIIIZZ(searchLiveList, "RETROFIT.searchLiveList(…ionId\n            ).get()");
            return searchLiveList;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }
}
