package com.ss.android.ugc.aweme.ecomsearch.repo;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C10K;
import X.C221108m2;
import X.C53823LAl;
import X.C62822Ol8;
import X.E4T;
import X.InterfaceC195757mF;
import X.InterfaceC64987Pex;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class EcSuggestWordsApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53823LAl.LJLIL);

    /* loaded from: classes9.dex */
    public interface SuggestApi {
        @InterfaceC195757mF
        @E4T("/aweme/v1/search/clicksug/")
        C10K<Object> fetchClickSearchData(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("aweme_id") String str2, @InterfaceC64987Pex("from_group_id") String str3);

        @InterfaceC195757mF
        @E4T("/aweme/v1/suggest/guide/")
        AbstractC73672Svk<SuggestWordResponse> fetchSuggestWords(@InterfaceC64987Pex("business_id") String str, @InterfaceC64987Pex("from_group_id") String str2, @InterfaceC64987Pex("pd") String str3, @InterfaceC64987Pex("history_list") String str4, @InterfaceC64987Pex("is_debug") String str5);

        @InterfaceC195757mF
        @E4T("/aweme/v1/suggest/guide/")
        AbstractC73638SvC<SuggestWordResponse> getSuggestSearchList(@InterfaceC64987Pex("business_id") String str, @InterfaceC64987Pex("from_group_id") String str2, @InterfaceC64987Pex("pd") String str3, @InterfaceC64987Pex("history_list") String str4, @InterfaceC64987Pex("is_debug") String str5, @InterfaceC64987Pex("req_source") String str6);

        @InterfaceC195757mF
        @E4T("/aweme/v1/suggest/guide/")
        Object getSuggestWords(@InterfaceC64987Pex("business_id") String str, @InterfaceC64987Pex("from_group_id") String str2, @InterfaceC64987Pex("word_in_box") String str3, @InterfaceC64987Pex("current_placeholder") String str4, @InterfaceC64987Pex("data_type") Integer num, @InterfaceC64987Pex("req_source") String str5, @InterfaceC64987Pex("history_list") String str6, @InterfaceC64987Pex("last_search_query") String str7, @InterfaceC64987Pex("last_search_source") String str8, @InterfaceC64987Pex("last_search_group_id") String str9, @InterfaceC64987Pex("has_effective_click") Integer num2, @InterfaceC64987Pex("total_play_time") Long l, @InterfaceC64987Pex("back_from_search") Integer num3, @InterfaceC64987Pex("last_suggest_words") String str10, @InterfaceC64987Pex("src_material_id") String str11, @InterfaceC64987Pex("src_anchor_product_id") String str12, @InterfaceC64987Pex("search_position") String str13, @InterfaceC64987Pex("type") String str14, @InterfaceC64987Pex("feedback_query_list") String str15, @InterfaceC64987Pex("feedback_product_id_list") String str16, @InterfaceC64987Pex("ecom_user_actions") String str17, InterfaceC67352kd<? super String> interfaceC67352kd);

        @InterfaceC195757mF
        @E4T("/aweme/v1/suggest/guide/")
        C10K<String> getSuggestWordsWithRawString(@InterfaceC64987Pex("business_id") String str, @InterfaceC64987Pex("from_group_id") String str2, @InterfaceC64987Pex("word_in_box") String str3, @InterfaceC64987Pex("current_placeholder") String str4, @InterfaceC64987Pex("data_type") Integer num, @InterfaceC64987Pex("req_source") String str5, @InterfaceC64987Pex("history_list") String str6, @InterfaceC64987Pex("last_search_query") String str7, @InterfaceC64987Pex("last_search_source") String str8, @InterfaceC64987Pex("last_search_group_id") String str9, @InterfaceC64987Pex("has_effective_click") Integer num2, @InterfaceC64987Pex("total_play_time") Long l, @InterfaceC64987Pex("back_from_search") Integer num3, @InterfaceC64987Pex("last_suggest_words") String str10, @InterfaceC64987Pex("src_material_id") String str11, @InterfaceC64987Pex("src_anchor_product_id") String str12, @InterfaceC64987Pex("search_position") String str13, @InterfaceC64987Pex("type") String str14, @InterfaceC64987Pex("feedback_query_list") String str15, @InterfaceC64987Pex("feedback_product_id_list") String str16, @InterfaceC64987Pex("ecom_user_actions") String str17);

        @InterfaceC195757mF
        @E4T("/aweme/v1/suggest/guide/")
        AbstractC73672Svk<String> getSuggestWordsWithRawStringSingle(@InterfaceC64987Pex("business_id") String str, @InterfaceC64987Pex("from_group_id") String str2, @InterfaceC64987Pex("word_in_box") String str3, @InterfaceC64987Pex("current_placeholder") String str4, @InterfaceC64987Pex("data_type") Integer num, @InterfaceC64987Pex("req_source") String str5, @InterfaceC64987Pex("history_list") String str6, @InterfaceC64987Pex("last_search_query") String str7, @InterfaceC64987Pex("last_search_source") String str8, @InterfaceC64987Pex("last_search_group_id") String str9, @InterfaceC64987Pex("has_effective_click") Integer num2, @InterfaceC64987Pex("total_play_time") Long l, @InterfaceC64987Pex("back_from_search") Integer num3, @InterfaceC64987Pex("last_suggest_words") String str10, @InterfaceC64987Pex("src_material_id") String str11, @InterfaceC64987Pex("src_anchor_product_id") String str12, @InterfaceC64987Pex("search_position") String str13, @InterfaceC64987Pex("type") String str14, @InterfaceC64987Pex("feedback_query_list") String str15, @InterfaceC64987Pex("feedback_product_id_list") String str16, @InterfaceC64987Pex("ecom_user_actions") String str17);
    }

    static {
        new AtomicBoolean(false);
    }
}
