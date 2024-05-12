package com.bytedance.android.livesdkapi.host;

import X.InterfaceC06390Mx;

/* loaded from: classes6.dex */
public interface ILiveHostCrossRoomEventHelper extends InterfaceC06390Mx {
    void clearId();

    String getFromRequestId();

    String getFromRoomId();

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void setFromRoomIdAndFromRequestId(String str, String str2);
}
