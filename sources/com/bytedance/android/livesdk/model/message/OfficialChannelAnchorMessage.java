package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class OfficialChannelAnchorMessage extends CR6 {

    @InterfaceC65349Pkn("end_timestamp")
    public long endTimeStamp;

    @InterfaceC65349Pkn("exist_linkmic")
    public boolean existLinkmic;

    @InterfaceC65349Pkn("linkmic_type")
    public int linkmicType;

    @InterfaceC65349Pkn("role_type")
    public int roleType;

    @InterfaceC65349Pkn("start_timestamp")
    public long startTimeStamp;

    public OfficialChannelAnchorMessage() {
        this.type = EnumC31509CYf.OFFICIAL_CHANNEL_ANCHOR_MESSAGE;
    }
}
