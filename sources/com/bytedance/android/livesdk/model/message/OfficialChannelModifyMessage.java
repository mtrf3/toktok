package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class OfficialChannelModifyMessage extends CR6 {

    @InterfaceC65349Pkn("channel_uid")
    public long channelUid;

    @InterfaceC65349Pkn("end_timestamp")
    public long endTimeStamp;

    public OfficialChannelModifyMessage() {
        this.type = EnumC31509CYf.OFFICIAL_CHANNEL_MODIFY_MESSAGE;
    }
}
