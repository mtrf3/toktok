package com.ss.android.ugc.aweme.search.pages.middlepage.core.repo;

import X.AbstractC73672Svk;
import X.C10K;
import X.C221108m2;
import X.C53826LAo;
import X.C62822Ol8;
import X.E4T;
import X.InterfaceC195757mF;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchResponse;

/* loaded from: classes9.dex */
public final class SuggestWordsApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53826LAo.LJLIL);

    /* loaded from: classes9.dex */
    public interface SuggestApi {
        @InterfaceC195757mF
        @E4T("/aweme/v1/search/clicksug/")
        C10K<ClickSearchResponse> fetchClickSearchData(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("aweme_id") String str2, @InterfaceC64987Pex("from_group_id") String str3, @InterfaceC64987Pex("is_non_personalized_search") Integer num, @InterfaceC64987Pex("number_of_click_sug") Integer num2);

        @InterfaceC195757mF
        @E4T("/aweme/v1/suggest/guide/")
        AbstractC73672Svk<SuggestWordResponse> fetchSuggestWords(@InterfaceC64987Pex("business_id") String str, @InterfaceC64987Pex("from_group_id") String str2, @InterfaceC64987Pex("pd") String str3, @InterfaceC64987Pex("history_list") String str4, @InterfaceC64987Pex("is_debug") String str5);

        @InterfaceC195757mF
        @E4T("/aweme/v1/suggest/guide/")
        C10K<SuggestWordResponse> getSuggestWords(@InterfaceC64987Pex("business_id") String str, @InterfaceC64987Pex("from_group_id") String str2, @InterfaceC64987Pex("word_in_box") String str3, @InterfaceC64987Pex("current_placeholder") String str4, @InterfaceC64987Pex("data_type") Integer num, @InterfaceC64987Pex("history_list") String str5, @InterfaceC64987Pex("type") String str6);

        @InterfaceC195757mF
        @E4T("/aweme/v1/suggest/guide/")
        C10K<String> getSuggestWordsWithRawString(@InterfaceC64987Pex("business_id") String str, @InterfaceC64987Pex("from_group_id") String str2, @InterfaceC64987Pex("word_in_box") String str3, @InterfaceC64987Pex("current_placeholder") String str4, @InterfaceC64987Pex("data_type") Integer num, @InterfaceC64987Pex("req_source") String str5, @InterfaceC64987Pex("history_list") String str6, @InterfaceC64987Pex("sug_signal_v2") String str7, @InterfaceC64987Pex("back_from_search") Integer num2, @InterfaceC64987Pex("last_suggest_words") String str8, @InterfaceC64987Pex("src_material_id") String str9, @InterfaceC64987Pex("src_anchor_product_id") String str10, @InterfaceC64987Pex("search_position") String str11, @InterfaceC64987Pex("type") String str12, @InterfaceC64987Pex("is_non_personalized_search") Integer num3);

        @InterfaceC195757mF
        @E4T("/aweme/v1/suggest/guide/")
        AbstractC73672Svk<String> getSuggestWordsWithRawStringSingle(@InterfaceC64987Pex("business_id") String str, @InterfaceC64987Pex("from_group_id") String str2, @InterfaceC64987Pex("word_in_box") String str3, @InterfaceC64987Pex("current_placeholder") String str4, @InterfaceC64987Pex("data_type") Integer num, @InterfaceC64987Pex("req_source") String str5, @InterfaceC64987Pex("history_list") String str6, @InterfaceC64987Pex("sug_signal_v2") String str7, @InterfaceC64987Pex("back_from_search") Integer num2, @InterfaceC64987Pex("last_suggest_words") String str8, @InterfaceC64987Pex("src_material_id") String str9, @InterfaceC64987Pex("src_anchor_product_id") String str10, @InterfaceC64987Pex("search_position") String str11, @InterfaceC64987Pex("type") String str12, @InterfaceC64987Pex("is_non_personalized_search") Integer num3);
    }
}
