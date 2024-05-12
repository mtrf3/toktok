package com.ss.android.ugc.aweme.search.ecommerce.api;

import X.AbstractC73638SvC;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.model.EcommerceSuggestWordResponse;

/* loaded from: classes9.dex */
public interface EcommerceSearchApi$SuggestApi {
    @E4Q("/aweme/v1/suggest/guide/")
    AbstractC73638SvC<EcommerceSuggestWordResponse> getEcommerceSuggestSearchList(@InterfaceC64989Pez("business_id") String str, @InterfaceC64989Pez("from_group_id") String str2, @InterfaceC64989Pez("pd") String str3, @InterfaceC64989Pez("history_list") String str4, @InterfaceC64989Pez("is_debug") String str5, @InterfaceC64989Pez("req_source") String str6, @InterfaceC64989Pez("src_material_id") String str7, @InterfaceC64989Pez("ecom_user_actions") String str8);
}
