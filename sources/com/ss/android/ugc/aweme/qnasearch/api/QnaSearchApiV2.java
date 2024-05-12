package com.ss.android.ugc.aweme.qnasearch.api;

import X.AbstractC73672Svk;
import X.C36339ENz;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;

/* loaded from: classes9.dex */
public interface QnaSearchApiV2 {
    public static final C36339ENz LIZ = C36339ENz.LIZ;

    @InterfaceC195787mI
    @E4T("/aweme/v1/search/sug/")
    AbstractC73672Svk<QnaSearchSuggestionResponse> fetchQnaSearchResults(@InterfaceC64987Pex("keyword") String str, @InterfaceC64987Pex("source") String str2, @InterfaceC64987Pex("request_order") int i, @InterfaceC64987Pex("sug_signal") String str3, @InterfaceC64987Pex("from_group_id") String str4, @InterfaceC64987Pex("history_list") String str5, @InterfaceC64987Pex("sug_cost_degradation") int i2, @InterfaceC64987Pex("rich_sug_count") String str6, @InterfaceC64987Pex("from_business") String str7, @InterfaceC64987Pex("count") Integer num);
}
