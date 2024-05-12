package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.api;

import X.AbstractC73672Svk;
import X.C778533t;
import X.E4Q;
import X.E4T;
import X.InterfaceC64989Pez;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes13.dex */
public final class CommentFilterApi {
    public static final API LIZ = (API) RetrofitFactory.LIZLLL().create(C778533t.LIZ).create(API.class);

    /* loaded from: classes13.dex */
    public interface API {
        @E4Q("/aweme/v2/comment/filter/get_words/")
        AbstractC73672Svk<Words> getCommentFilterKeywords();

        @E4T("/aweme/v2/comment/filter/update_words/")
        AbstractC73672Svk<BaseResponse> setCommentFilterKeywords(@InterfaceC64989Pez("words") String str);

        @E4T("/tiktok/v1/comment/filter/trigger/")
        AbstractC73672Svk<BaseResponse> triggerSyncServerCommentFilter();
    }
}
