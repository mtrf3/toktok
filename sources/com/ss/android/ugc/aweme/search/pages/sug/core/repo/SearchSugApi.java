package com.ss.android.ugc.aweme.search.pages.sug.core.repo;

import X.AXA;
import X.C10K;
import X.C221108m2;
import X.C62822Ol8;
import X.C76L;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC37276Ek4;
import X.InterfaceC64987Pex;
import X.ORZ;
import android.net.Uri;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes5.dex */
public final class SearchSugApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(AXA.LJLIL);

    /* loaded from: classes9.dex */
    public interface Api {
        @InterfaceC195787mI
        @E4T("/aweme/v1/search/sug/")
        C76L<SearchSugResponse> fetchSug(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("source") String str2, @InterfaceC64987Pex("history_list") String str3, @InterfaceC64987Pex("from_group_id") String str4, @InterfaceC64987Pex("count") Integer num, @InterfaceC64987Pex("sug_session_params") String str5, @InterfaceC64987Pex("sug_request_params") String str6, @InterfaceC64987Pex("rich_sug_count") Integer num2, @InterfaceC64987Pex("request_order") Long l, @InterfaceC64987Pex("enter_from") String str7, @InterfaceC64987Pex("sug_cost_degradation") int i, @InterfaceC64987Pex("new_sug_session_id") String str8, @InterfaceC64987Pex("src_material_id") String str9, @InterfaceC64987Pex("src_anchor_product_id") String str10, @InterfaceC64987Pex("search_position") String str11, @InterfaceC64987Pex("is_non_personalized_search") Integer num3);

        @E4T("/aweme/v1/search/sug_cached_words/")
        C10K<String> fetchSugCache();

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/user/sug/")
        InterfaceC37276Ek4<SearchUserSugResponse> fetchUserSug(@InterfaceC64987Pex("mention_type") long j, @InterfaceC64987Pex("aweme_id") Long l, @InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("source") String str2, @InterfaceC64987Pex("count") long j2, @InterfaceC64987Pex("uid_filter_list") String str3, @InterfaceC64987Pex("is_non_personalized_search") Integer num);

        @InterfaceC195787mI
        @E4T("/aweme/v1/search/user/sug/")
        C10K<SearchUserSugResponse> fetchUserSugAsync(@InterfaceC64987Pex("mention_type") long j, @InterfaceC64987Pex("aweme_id") Long l, @InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("source") String str2, @InterfaceC64987Pex("count") long j2, @InterfaceC64987Pex("uid_filter_list") String str3);
    }

    public static String LIZ(List list) {
        List LLILLL;
        if (list != null && (!list.isEmpty()) && (LLILLL = ORZ.LLILLL(list, 100)) != null) {
            String encode = Uri.encode(new JSONArray((Collection) LLILLL).toString());
            o.LJIIIIZZ(encode, "encode(JSONArray(list).toString())");
            return encode;
        }
        return "";
    }
}
