package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class InRoomBannerRefreshMessage extends CR6 {

    @InterfaceC65349Pkn("max_delay_seconds")
    public int delaySeconds;

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 1;
    }

    public InRoomBannerRefreshMessage() {
        this.type = EnumC31509CYf.IN_ROOM_BANNER_REFRESH_MESSAGE;
    }
}
