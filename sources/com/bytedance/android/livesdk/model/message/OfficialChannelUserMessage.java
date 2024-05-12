package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class OfficialChannelUserMessage extends CR6 {

    @InterfaceC65349Pkn("max_enter_time")
    public long maxEnterTime;

    @InterfaceC65349Pkn("start_timestamp")
    public long startTimeStamp;

    public OfficialChannelUserMessage() {
        this.type = EnumC31509CYf.OFFICIAL_CHANNEL_USER_MESSAGE;
    }
}
