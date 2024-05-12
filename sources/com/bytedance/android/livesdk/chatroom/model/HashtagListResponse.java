package com.bytedance.android.livesdk.chatroom.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.HashtagResponse;

/* loaded from: classes6.dex */
public final class HashtagListResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public HashtagResponse data;

    @Override // X.F9E
    public final Object[] getObjects() {
        HashtagResponse hashtagResponse = this.data;
        return new Object[]{hashtagResponse, hashtagResponse};
    }
}
