package com.ss.android.ugc.aweme.compliance.business.commentfilter.api;

import X.AbstractC73672Svk;
import X.E4T;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes10.dex */
public final class CommentFilterApi {
    public static final API LIZ = (API) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(API.class);

    /* loaded from: classes10.dex */
    public interface API {
        @E4T("/tiktok/v1/comment/filter/trigger/")
        AbstractC73672Svk<BaseResponse> triggerSyncServerCommentFilter();
    }
}
