package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BizReplyResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public BizReplyResponseData responseData;

    /* JADX WARN: Multi-variable type inference failed */
    public BizReplyResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.responseData};
    }

    public BizReplyResponse(BizReplyResponseData bizReplyResponseData) {
        this.responseData = bizReplyResponseData;
    }

    public /* synthetic */ BizReplyResponse(BizReplyResponseData bizReplyResponseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bizReplyResponseData);
    }
}
