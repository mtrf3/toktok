package com.bytedance.android.livesdk.model.message.ext;

import X.CR6;
import X.InterfaceC65349Pkn;

/* loaded from: classes13.dex */
public final class ECShortItemRefreshMessage extends CR6 {

    @InterfaceC65349Pkn("message_entity")
    public ShortItemRefreshEntity entity;

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int getIntType() {
        return 100002;
    }
}
