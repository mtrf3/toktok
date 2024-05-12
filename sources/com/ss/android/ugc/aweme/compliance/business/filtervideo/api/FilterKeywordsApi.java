package com.ss.android.ugc.aweme.compliance.business.filtervideo.api;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C237289Sy;
import X.C62822Ol8;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.model.FilterKeywordResp;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.model.FilteredKeywordsModel;

/* loaded from: classes5.dex */
public final class FilterKeywordsApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C237289Sy.LJLIL);

    /* loaded from: classes5.dex */
    public interface API {
        @InterfaceC195787mI
        @E4T("/tiktok/v1/mute/create/")
        AbstractC73672Svk<FilterKeywordResp> createKeywords(@InterfaceC64987Pex("texts") String str, @InterfaceC64987Pex("scenes") String str2);

        @InterfaceC195787mI
        @E4T("/tiktok/v1/mute/delete/")
        AbstractC73672Svk<FilterKeywordResp> deleteKeyword(@InterfaceC64987Pex("text") String str);

        @E4T("/aweme/v1/commit/dislike/item/")
        AbstractC73672Svk<BaseResponse> disLikeAweme(@InterfaceC64989Pez("aweme_id") String str);

        @E4Q("/tiktok/v1/mute/query/")
        AbstractC73672Svk<FilteredKeywordsModel> getFilteredKeywords();

        @InterfaceC195787mI
        @E4T("/tiktok/v1/mute/update/")
        AbstractC73672Svk<FilterKeywordResp> updateKeyword(@InterfaceC64987Pex("original_text") String str, @InterfaceC64987Pex("text") String str2, @InterfaceC64987Pex("scenes") String str3);
    }
}
