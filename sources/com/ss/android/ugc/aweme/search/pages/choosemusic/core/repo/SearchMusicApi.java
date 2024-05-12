package com.ss.android.ugc.aweme.search.pages.choosemusic.core.repo;

import X.AbstractC73638SvC;
import X.C10K;
import X.C50963JzL;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.google.gson.m;
import com.ss.android.ugc.aweme.choosemusic.sug.model.MusicSearchSugResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.music.model.AwemeSearchMusicList;

/* loaded from: classes9.dex */
public interface SearchMusicApi {
    public static final C50963JzL LIZ = C50963JzL.LIZ;

    @InterfaceC195787mI
    @E4T("/aweme/v1/music/search/")
    AbstractC73638SvC<AwemeSearchMusicList> getSearchResultList(@InterfaceC64987Pex("cursor") Integer num, @InterfaceC64987Pex("count") Integer num2, @InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("search_source") String str2, @InterfaceC64987Pex("search_channel") String str3, @InterfaceC64987Pex("enter_from") String str4, @InterfaceC64987Pex("query_correct_type") Integer num3, @InterfaceC64987Pex("filter_by") Integer num4, @InterfaceC64987Pex("sort_type") Integer num5, @InterfaceC64987Pex("is_filter_search") Integer num6, @InterfaceC64987Pex("user_video_length") Long l, @InterfaceC64987Pex("user_video_created") Integer num7, @InterfaceC64987Pex("search_context") String str5, @InterfaceC64987Pex("search_id") String str6);

    @InterfaceC195787mI
    @E4T("/aweme/v1/music/search/")
    AbstractC73638SvC<m> getSearchResultListForLynx(@InterfaceC64987Pex("cursor") Integer num, @InterfaceC64987Pex("count") Integer num2, @InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("search_source") String str2, @InterfaceC64987Pex("search_channel") String str3, @InterfaceC64987Pex("enter_from") String str4, @InterfaceC64987Pex("query_correct_type") Integer num3, @InterfaceC64987Pex("filter_by") Integer num4, @InterfaceC64987Pex("sort_type") Integer num5, @InterfaceC64987Pex("is_filter_search") Integer num6, @InterfaceC64987Pex("user_video_length") Long l, @InterfaceC64987Pex("user_video_created") Integer num7, @InterfaceC64987Pex("search_context") String str5, @InterfaceC64987Pex("search_id") String str6, @InterfaceC64987Pex("is_non_personalized_search") Integer num8, @InterfaceC64987Pex("search_session_id") Long l2);

    @InterfaceC195787mI
    @E4T("/aweme/v1/search/sug/")
    C10K<MusicSearchSugResponse> getSearchSugList(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("source") String str2, @InterfaceC64987Pex("history_list") String str3, @InterfaceC64987Pex("is_non_personalized_search") Integer num);

    @InterfaceC195787mI
    @E4T("/aweme/v1/suggest/guide/")
    C10K<SuggestWordResponse> getTrendingWords(@InterfaceC64987Pex("data_type") Integer num, @InterfaceC64987Pex("req_source") String str, @InterfaceC64987Pex("history_list_v2") String str2, @InterfaceC64987Pex("business_id") String str3, @InterfaceC64987Pex("is_non_personalized_search") Integer num2);
}
