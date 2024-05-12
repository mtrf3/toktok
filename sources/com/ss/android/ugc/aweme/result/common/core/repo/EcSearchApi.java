package com.ss.android.ugc.aweme.result.common.core.repo;

import X.AbstractC36908Ee8;
import X.C10K;
import X.C221108m2;
import X.C50287JoR;
import X.C52662Kle;
import X.C62822Ol8;
import X.C76L;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC28048Azc;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC64992Pf2;
import X.InterfaceC64997Pf7;
import X.InterfaceC65002PfC;
import X.KFN;
import X.KFZ;
import X.QDX;
import com.google.gson.m;
import com.ss.android.ugc.aweme.app.api.Api;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcSearchApi {
    public static final String LIZ = Api.LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(KFZ.LJLIL);

    /* loaded from: classes9.dex */
    public interface RealApi {
        @InterfaceC195787mI
        @E4T("/aweme/v1/search/mall_live/ecom/")
        C76L<m> searchDynamicLiveList(@InterfaceC64987Pex("search_channel") String str, @InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("keyword") String str2, @InterfaceC64987Pex("enter_from") String str3, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("hot_search") int i2, @InterfaceC64987Pex("search_id") String str4, @InterfaceC64987Pex("last_search_id") String str5, @InterfaceC64987Pex("source") String str6, @InterfaceC64987Pex("search_source") String str7, @InterfaceC64987Pex("query_correct_type") int i3, @InterfaceC64987Pex("is_filter_search") int i4, @InterfaceC64987Pex("filter_by") int i5, @InterfaceC64987Pex("sort_type") int i6, @InterfaceC64992Pf2 LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC64987Pex("search_context") String str8, @InterfaceC64987Pex("sug_tag_text") String str9, @InterfaceC64987Pex("sug_type") String str10, @InterfaceC64987Pex("sug_query_state") String str11, @InterfaceC64987Pex("sug_creator_id") String str12, @InterfaceC64987Pex("attach_products") String str13, @InterfaceC64987Pex("traffic_source_list") String str14, @InterfaceC64987Pex("sug_shop_id") String str15, @InterfaceC64987Pex("ec_search_session_id") String str16, @InterfaceC64987Pex("search_session_id") String str17);

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/ecom/order/")
        C76L<m> searchDynamicOrderList(@InterfaceC64987Pex("search_channel") String str, @InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("keyword") String str2, @InterfaceC64987Pex("enter_from") String str3, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("hot_search") int i2, @InterfaceC64987Pex("search_id") String str4, @InterfaceC64987Pex("last_search_id") String str5, @InterfaceC64987Pex("source") String str6, @InterfaceC64987Pex("search_source") String str7, @InterfaceC64987Pex("query_correct_type") int i3, @InterfaceC64987Pex("is_filter_search") int i4, @InterfaceC64987Pex("filter_by") int i5, @InterfaceC64987Pex("sort_type") int i6, @InterfaceC64992Pf2 LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC64987Pex("search_context") String str8, @InterfaceC64987Pex("sug_tag_text") String str9, @InterfaceC64987Pex("sug_type") String str10, @InterfaceC64987Pex("sug_query_state") String str11, @InterfaceC64987Pex("sug_creator_id") String str12, @InterfaceC64987Pex("attach_products") String str13, @InterfaceC64987Pex("traffic_source_list") String str14, @InterfaceC64987Pex("sug_shop_id") String str15, @InterfaceC64987Pex("page_type") Integer num);

        @InterfaceC28048Azc
        @E4Q("/aweme/v1/search/stream/ecom/")
        C10K<QDX<m>> searchDynamicShopListByChunk(@InterfaceC65002PfC("x-api-version") String str, @InterfaceC64989Pez("chunk_size_list") String str2, @InterfaceC64989Pez("search_channel") String str3, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("keyword") String str4, @InterfaceC64989Pez("enter_from") String str5, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("hot_search") int i2, @InterfaceC64989Pez("search_id") String str6, @InterfaceC64989Pez("last_search_id") String str7, @InterfaceC64989Pez("source") String str8, @InterfaceC64989Pez("search_source") String str9, @InterfaceC64989Pez("query_correct_type") int i3, @InterfaceC64989Pez("is_filter_search") int i4, @InterfaceC64989Pez("filter_by") int i5, @InterfaceC64989Pez("sort_type") int i6, @InterfaceC64997Pf7 LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC64989Pez("search_context") String str10, @InterfaceC64989Pez("sug_tag_text") String str11, @InterfaceC64989Pez("sug_type") String str12, @InterfaceC64989Pez("sug_query_state") String str13, @InterfaceC64989Pez("sug_creator_id") String str14, @InterfaceC64989Pez("attach_products") String str15, @InterfaceC64989Pez("traffic_source_list") String str16, @InterfaceC64989Pez("cmpl_enc") String str17, @InterfaceC64989Pez("origin_is_mall_tab") String str18, @InterfaceC64989Pez("ec_search_session_id") String str19, @InterfaceC64989Pez("sug_shop_id") String str20, @InterfaceC64989Pez("user_rt_acts") String str21, @InterfaceC64989Pez("search_session_id") String str22, @InterfaceC64989Pez("ecom_user_actions") String str23);

        @InterfaceC28048Azc
        @InterfaceC195787mI
        @E4T("/aweme/v1/search/stream/ecom/")
        C10K<QDX<m>> searchDynamicShopListByChunkPost(@InterfaceC64987Pex("chunk_size_list") String str, @InterfaceC64987Pex("search_channel") String str2, @InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("keyword") String str3, @InterfaceC64987Pex("enter_from") String str4, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("hot_search") int i2, @InterfaceC64987Pex("search_id") String str5, @InterfaceC64987Pex("last_search_id") String str6, @InterfaceC64987Pex("source") String str7, @InterfaceC64987Pex("search_source") String str8, @InterfaceC64987Pex("query_correct_type") int i3, @InterfaceC64987Pex("is_filter_search") int i4, @InterfaceC64987Pex("filter_by") int i5, @InterfaceC64987Pex("sort_type") int i6, @InterfaceC64992Pf2 LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC64987Pex("search_context") String str9, @InterfaceC64987Pex("sug_tag_text") String str10, @InterfaceC64987Pex("sug_type") String str11, @InterfaceC64987Pex("sug_query_state") String str12, @InterfaceC64987Pex("sug_creator_id") String str13, @InterfaceC64987Pex("attach_products") String str14, @InterfaceC64987Pex("traffic_source_list") String str15, @InterfaceC64987Pex("cmpl_enc") String str16, @InterfaceC64987Pex("origin_is_mall_tab") String str17, @InterfaceC64987Pex("ec_search_session_id") String str18, @InterfaceC64987Pex("sug_shop_id") String str19, @InterfaceC64987Pex("user_rt_acts") String str20, @InterfaceC65002PfC("x-api-version") String str21, @InterfaceC64987Pex("search_session_id") String str22, @InterfaceC64987Pex("ecom_user_actions") String str23);

        @E4Q("/aweme/v1/search/single/ecom/")
        C76L<m> searchDynamicSingleShopList(@InterfaceC65002PfC("x-api-version") String str, @InterfaceC64989Pez("search_channel") String str2, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("keyword") String str3, @InterfaceC64989Pez("enter_from") String str4, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("hot_search") int i2, @InterfaceC64989Pez("search_id") String str5, @InterfaceC64989Pez("last_search_id") String str6, @InterfaceC64989Pez("source") String str7, @InterfaceC64989Pez("search_source") String str8, @InterfaceC64989Pez("query_correct_type") int i3, @InterfaceC64989Pez("is_filter_search") int i4, @InterfaceC64989Pez("filter_by") int i5, @InterfaceC64989Pez("sort_type") int i6, @InterfaceC64997Pf7 LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC64989Pez("search_context") String str9, @InterfaceC64989Pez("sug_tag_text") String str10, @InterfaceC64989Pez("sug_type") String str11, @InterfaceC64989Pez("sug_query_state") String str12, @InterfaceC64989Pez("sug_creator_id") String str13, @InterfaceC64989Pez("attach_products") String str14, @InterfaceC64989Pez("traffic_source_list") String str15, @InterfaceC64989Pez("cmpl_enc") String str16, @InterfaceC64989Pez("origin_is_mall_tab") String str17, @InterfaceC64989Pez("ec_search_session_id") String str18, @InterfaceC64989Pez("sug_shop_id") String str19, @InterfaceC64989Pez("user_rt_acts") String str20, @InterfaceC64989Pez("search_session_id") String str21, @InterfaceC64989Pez("ecom_user_actions") String str22);

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/single/ecom/")
        C76L<m> searchDynamicSingleShopListPost(@InterfaceC65002PfC("x-api-version") String str, @InterfaceC64987Pex("search_channel") String str2, @InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("keyword") String str3, @InterfaceC64987Pex("enter_from") String str4, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("hot_search") int i2, @InterfaceC64987Pex("search_id") String str5, @InterfaceC64987Pex("last_search_id") String str6, @InterfaceC64987Pex("source") String str7, @InterfaceC64987Pex("search_source") String str8, @InterfaceC64987Pex("query_correct_type") int i3, @InterfaceC64987Pex("is_filter_search") int i4, @InterfaceC64987Pex("filter_by") int i5, @InterfaceC64987Pex("sort_type") int i6, @InterfaceC64992Pf2 LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC64987Pex("search_context") String str9, @InterfaceC64987Pex("sug_tag_text") String str10, @InterfaceC64987Pex("sug_type") String str11, @InterfaceC64987Pex("sug_query_state") String str12, @InterfaceC64987Pex("sug_creator_id") String str13, @InterfaceC64987Pex("attach_products") String str14, @InterfaceC64987Pex("traffic_source_list") String str15, @InterfaceC64987Pex("cmpl_enc") String str16, @InterfaceC64987Pex("origin_is_mall_tab") String str17, @InterfaceC64987Pex("ec_search_session_id") String str18, @InterfaceC64987Pex("sug_shop_id") String str19, @InterfaceC64987Pex("user_rt_acts") String str20, @InterfaceC64987Pex("search_session_id") String str21, @InterfaceC64987Pex("ecom_user_actions") String str22);

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/mall_store/ecom/")
        C76L<m> searchDynamicStoreList(@InterfaceC64987Pex("search_channel") String str, @InterfaceC64987Pex("cursor") long j, @InterfaceC64987Pex("keyword") String str2, @InterfaceC64987Pex("enter_from") String str3, @InterfaceC64987Pex("count") int i, @InterfaceC64987Pex("hot_search") int i2, @InterfaceC64987Pex("search_id") String str4, @InterfaceC64987Pex("last_search_id") String str5, @InterfaceC64987Pex("source") String str6, @InterfaceC64987Pex("search_source") String str7, @InterfaceC64987Pex("query_correct_type") int i3, @InterfaceC64987Pex("is_filter_search") int i4, @InterfaceC64987Pex("filter_by") int i5, @InterfaceC64987Pex("sort_type") int i6, @InterfaceC64992Pf2 LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC64987Pex("search_context") String str8, @InterfaceC64987Pex("sug_tag_text") String str9, @InterfaceC64987Pex("sug_type") String str10, @InterfaceC64987Pex("sug_query_state") String str11, @InterfaceC64987Pex("sug_creator_id") String str12, @InterfaceC64987Pex("attach_products") String str13, @InterfaceC64987Pex("traffic_source_list") String str14, @InterfaceC64987Pex("sug_shop_id") String str15, @InterfaceC64987Pex("ec_search_session_id") String str16, @InterfaceC64987Pex("search_session_id") String str17);
    }

    public static RealApi LIZ() {
        return (RealApi) LIZIZ.getValue();
    }

    public static m LIZIZ(KFN param) {
        boolean z;
        int i;
        int i2;
        LinkedHashMap<String, Integer> linkedHashMap;
        o.LJIIIZ(param, "param");
        try {
            RealApi LIZ2 = LIZ();
            String searchChannel = param.getSearchChannel();
            if (searchChannel == null) {
                searchChannel = "tiktok_mall_live_tab";
            }
            long cursor = param.getCursor();
            String keyword = param.getKeyword();
            String enterFrom = param.getEnterFrom();
            int count = param.getCount();
            int hotSearch = param.getHotSearch();
            String searchId = param.getSearchId();
            String lastSearchId = param.getLastSearchId();
            String source = param.getSource();
            String searchSource = param.getSearchSource();
            int correctType = param.getCorrectType();
            C50287JoR filterOption = param.getFilterOption();
            if (filterOption != null) {
                z = filterOption.isDefaultOption();
            } else {
                z = true;
            }
            int i3 = 0;
            if (!z) {
                i = 1;
            } else {
                i = 0;
            }
            C50287JoR filterOption2 = param.getFilterOption();
            if (filterOption2 != null) {
                i2 = filterOption2.getFilterBy();
            } else {
                i2 = 0;
            }
            C50287JoR filterOption3 = param.getFilterOption();
            if (filterOption3 != null) {
                i3 = filterOption3.getSortType();
            }
            C50287JoR filterOption4 = param.getFilterOption();
            if (filterOption4 == null || (linkedHashMap = filterOption4.activityToFieldMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            m mVar = LIZ2.searchDynamicLiveList(searchChannel, cursor, keyword, enterFrom, count, hotSearch, searchId, lastSearchId, source, searchSource, correctType, i, i2, i3, linkedHashMap, param.getSearchContext(), param.getSugTagText(), param.getSugType(), param.getSugQueryState(), param.getSugCreatorId(), param.getAttachProducts(), param.getTrafficSourceList(), param.getSugShopId(), param.getEcSearchSessionId(), param.getSearchSessionId()).get();
            o.LJIIIIZZ(mVar, "RETROFIT.searchDynamicLi…onId,\n            ).get()");
            return mVar;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }

    public static m LIZJ(KFN param) {
        boolean z;
        int i;
        int i2;
        LinkedHashMap<String, Integer> linkedHashMap;
        o.LJIIIZ(param, "param");
        try {
            RealApi LIZ2 = LIZ();
            String searchChannel = param.getSearchChannel();
            if (searchChannel == null) {
                searchChannel = "tiktok_mall_live_tab";
            }
            long cursor = param.getCursor();
            String keyword = param.getKeyword();
            String enterFrom = param.getEnterFrom();
            int count = param.getCount();
            int hotSearch = param.getHotSearch();
            String searchId = param.getSearchId();
            String lastSearchId = param.getLastSearchId();
            String source = param.getSource();
            String searchSource = param.getSearchSource();
            int correctType = param.getCorrectType();
            C50287JoR filterOption = param.getFilterOption();
            if (filterOption != null) {
                z = filterOption.isDefaultOption();
            } else {
                z = true;
            }
            int i3 = 0;
            if (!z) {
                i = 1;
            } else {
                i = 0;
            }
            C50287JoR filterOption2 = param.getFilterOption();
            if (filterOption2 != null) {
                i2 = filterOption2.getFilterBy();
            } else {
                i2 = 0;
            }
            C50287JoR filterOption3 = param.getFilterOption();
            if (filterOption3 != null) {
                i3 = filterOption3.getSortType();
            }
            C50287JoR filterOption4 = param.getFilterOption();
            if (filterOption4 == null || (linkedHashMap = filterOption4.activityToFieldMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            m mVar = LIZ2.searchDynamicOrderList(searchChannel, cursor, keyword, enterFrom, count, hotSearch, searchId, lastSearchId, source, searchSource, correctType, i, i2, i3, linkedHashMap, param.getSearchContext(), param.getSugTagText(), param.getSugType(), param.getSugQueryState(), param.getSugCreatorId(), param.getAttachProducts(), param.getTrafficSourceList(), param.getSugShopId(), param.getPageType()).get();
            o.LJIIIIZZ(mVar, "RETROFIT.searchDynamicOr…eType\n            ).get()");
            return mVar;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }

    public static m LIZLLL(KFN param) {
        int i;
        int i2;
        int i3;
        LinkedHashMap<String, Integer> linkedHashMap;
        int i4;
        int i5;
        int i6;
        LinkedHashMap<String, Integer> linkedHashMap2;
        o.LJIIIZ(param, "param");
        try {
            String str = "tiktok_ecom";
            if (((Boolean) C52662Kle.LIZ.getValue()).booleanValue()) {
                RealApi LIZ2 = LIZ();
                String apiVersion = param.getApiVersion();
                String searchChannel = param.getSearchChannel();
                if (searchChannel != null) {
                    str = searchChannel;
                }
                long cursor = param.getCursor();
                String keyword = param.getKeyword();
                String enterFrom = param.getEnterFrom();
                int count = param.getCount();
                int hotSearch = param.getHotSearch();
                String searchId = param.getSearchId();
                String lastSearchId = param.getLastSearchId();
                String source = param.getSource();
                String searchSource = param.getSearchSource();
                int correctType = param.getCorrectType();
                C50287JoR filterOption = param.getFilterOption();
                if (filterOption != null && !filterOption.isDefaultOption()) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                C50287JoR filterOption2 = param.getFilterOption();
                if (filterOption2 != null) {
                    i5 = filterOption2.getFilterBy();
                } else {
                    i5 = 0;
                }
                C50287JoR filterOption3 = param.getFilterOption();
                if (filterOption3 != null) {
                    i6 = filterOption3.getSortType();
                } else {
                    i6 = 0;
                }
                C50287JoR filterOption4 = param.getFilterOption();
                if (filterOption4 == null || (linkedHashMap2 = filterOption4.activityToFieldMap()) == null) {
                    linkedHashMap2 = new LinkedHashMap<>();
                }
                m mVar = LIZ2.searchDynamicSingleShopListPost(apiVersion, str, cursor, keyword, enterFrom, count, hotSearch, searchId, lastSearchId, source, searchSource, correctType, i4, i5, i6, linkedHashMap2, param.getSearchContext(), param.getSugTagText(), param.getSugType(), param.getSugQueryState(), param.getSugCreatorId(), param.getAttachProducts(), param.getTrafficSourceList(), param.getCmplEnc(), param.getOriginIsMallTab(), param.getEcSearchSessionId(), param.getSugShopId(), param.getUserRtActs(), param.getSearchSessionId(), param.getUserActions()).get();
                o.LJIIIIZZ(mVar, "{\n                RETROF…    ).get()\n            }");
                return mVar;
            }
            RealApi LIZ3 = LIZ();
            String apiVersion2 = param.getApiVersion();
            String searchChannel2 = param.getSearchChannel();
            if (searchChannel2 == null) {
                searchChannel2 = "tiktok_ecom";
            }
            long cursor2 = param.getCursor();
            String keyword2 = param.getKeyword();
            String enterFrom2 = param.getEnterFrom();
            int count2 = param.getCount();
            int hotSearch2 = param.getHotSearch();
            String searchId2 = param.getSearchId();
            String lastSearchId2 = param.getLastSearchId();
            String source2 = param.getSource();
            String searchSource2 = param.getSearchSource();
            int correctType2 = param.getCorrectType();
            C50287JoR filterOption5 = param.getFilterOption();
            if (filterOption5 != null && !filterOption5.isDefaultOption()) {
                i = 1;
            } else {
                i = 0;
            }
            C50287JoR filterOption6 = param.getFilterOption();
            if (filterOption6 != null) {
                i2 = filterOption6.getFilterBy();
            } else {
                i2 = 0;
            }
            C50287JoR filterOption7 = param.getFilterOption();
            if (filterOption7 != null) {
                i3 = filterOption7.getSortType();
            } else {
                i3 = 0;
            }
            C50287JoR filterOption8 = param.getFilterOption();
            if (filterOption8 == null || (linkedHashMap = filterOption8.activityToFieldMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            m mVar2 = LIZ3.searchDynamicSingleShopList(apiVersion2, searchChannel2, cursor2, keyword2, enterFrom2, count2, hotSearch2, searchId2, lastSearchId2, source2, searchSource2, correctType2, i, i2, i3, linkedHashMap, param.getSearchContext(), param.getSugTagText(), param.getSugType(), param.getSugQueryState(), param.getSugCreatorId(), param.getAttachProducts(), param.getTrafficSourceList(), param.getCmplEnc(), param.getOriginIsMallTab(), param.getEcSearchSessionId(), param.getSugShopId(), param.getUserRtActs(), param.getSearchSessionId(), param.getUserActions()).get();
            o.LJIIIIZZ(mVar2, "{\n                RETROF…    ).get()\n            }");
            return mVar2;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }

    public static m LJ(KFN param) {
        boolean z;
        int i;
        int i2;
        LinkedHashMap<String, Integer> linkedHashMap;
        o.LJIIIZ(param, "param");
        try {
            RealApi LIZ2 = LIZ();
            String searchChannel = param.getSearchChannel();
            if (searchChannel == null) {
                searchChannel = "tiktok_store_tab";
            }
            long cursor = param.getCursor();
            String keyword = param.getKeyword();
            String enterFrom = param.getEnterFrom();
            int count = param.getCount();
            int hotSearch = param.getHotSearch();
            String searchId = param.getSearchId();
            String lastSearchId = param.getLastSearchId();
            String source = param.getSource();
            String searchSource = param.getSearchSource();
            int correctType = param.getCorrectType();
            C50287JoR filterOption = param.getFilterOption();
            if (filterOption != null) {
                z = filterOption.isDefaultOption();
            } else {
                z = true;
            }
            int i3 = 0;
            if (!z) {
                i = 1;
            } else {
                i = 0;
            }
            C50287JoR filterOption2 = param.getFilterOption();
            if (filterOption2 != null) {
                i2 = filterOption2.getFilterBy();
            } else {
                i2 = 0;
            }
            C50287JoR filterOption3 = param.getFilterOption();
            if (filterOption3 != null) {
                i3 = filterOption3.getSortType();
            }
            C50287JoR filterOption4 = param.getFilterOption();
            if (filterOption4 == null || (linkedHashMap = filterOption4.activityToFieldMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            m mVar = LIZ2.searchDynamicStoreList(searchChannel, cursor, keyword, enterFrom, count, hotSearch, searchId, lastSearchId, source, searchSource, correctType, i, i2, i3, linkedHashMap, param.getSearchContext(), param.getSugTagText(), param.getSugType(), param.getSugQueryState(), param.getSugCreatorId(), param.getAttachProducts(), param.getTrafficSourceList(), param.getSugShopId(), param.getEcSearchSessionId(), param.getSearchSessionId()).get();
            o.LJIIIIZZ(mVar, "RETROFIT.searchDynamicSt…onId,\n            ).get()");
            return mVar;
        } catch (ExecutionException e) {
            RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
            o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }
}
