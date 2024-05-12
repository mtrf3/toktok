package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BizApplyResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public BizApplyResponseData responseData;

    /* JADX WARN: Multi-variable type inference failed */
    public BizApplyResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.responseData};
    }

    public BizApplyResponse(BizApplyResponseData bizApplyResponseData) {
        this.responseData = bizApplyResponseData;
    }

    public /* synthetic */ BizApplyResponse(BizApplyResponseData bizApplyResponseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bizApplyResponseData);
    }
}
