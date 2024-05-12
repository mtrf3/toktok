package com.ss.android.ugc.aweme.ecommerce.video.dto;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CommonFeedModelResponse extends Response<CommonFeedModel> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonFeedModelResponse(int i, String message, CommonFeedModel commonFeedModel) {
        super(i, message, commonFeedModel, null, 8, null);
        o.LJIIIZ(message, "message");
    }
}
