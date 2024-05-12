package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class BizJoinDirectResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public BizJoinDirectResponseData responseData;

    /* JADX WARN: Multi-variable type inference failed */
    public BizJoinDirectResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.responseData};
    }

    public BizJoinDirectResponse(BizJoinDirectResponseData bizJoinDirectResponseData) {
        this.responseData = bizJoinDirectResponseData;
    }

    public /* synthetic */ BizJoinDirectResponse(BizJoinDirectResponseData bizJoinDirectResponseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bizJoinDirectResponseData);
    }
}
