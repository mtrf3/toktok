package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallFeedResponse extends Response<MallCommonFeedModel> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallFeedResponse(int i, String message, MallCommonFeedModel mallCommonFeedModel) {
        super(i, message, mallCommonFeedModel, null, 8, null);
        o.LJIIIZ(message, "message");
    }
}
