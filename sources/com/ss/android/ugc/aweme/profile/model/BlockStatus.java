package com.ss.android.ugc.aweme.profile.model;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes2.dex */
public final class BlockStatus extends BaseResponse {
    public int blockStatus;
    public String userId;

    public BlockStatus(String str, int i) {
        this.userId = str;
        this.blockStatus = i;
    }
}
