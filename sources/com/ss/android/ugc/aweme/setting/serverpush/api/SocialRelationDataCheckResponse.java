package com.ss.android.ugc.aweme.setting.serverpush.api;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes14.dex */
public final class SocialRelationDataCheckResponse extends BaseResponse {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("has_remaining_data")
    public boolean hasRemainingData;

    public final boolean getHasRemainingData() {
        return this.hasRemainingData;
    }

    public final void setHasRemainingData(boolean z) {
        this.hasRemainingData = z;
    }
}
