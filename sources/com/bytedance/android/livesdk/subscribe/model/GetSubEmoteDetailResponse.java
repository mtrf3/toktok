package com.bytedance.android.livesdk.subscribe.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import emotes.model.SubEmoteDetailResult;

/* loaded from: classes6.dex */
public final class GetSubEmoteDetailResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public SubEmoteDetailResult data;

    @Override // X.F9E
    public final Object[] getObjects() {
        SubEmoteDetailResult subEmoteDetailResult = this.data;
        return new Object[]{subEmoteDetailResult, subEmoteDetailResult};
    }
}
