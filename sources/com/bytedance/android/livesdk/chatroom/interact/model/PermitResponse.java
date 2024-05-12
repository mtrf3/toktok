package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class PermitResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ResponseData extends F9E {

        @InterfaceC65349Pkn("action_id")
        public Long actionId;

        @InterfaceC65349Pkn("channel_id")
        public Long channelId;

        @InterfaceC65349Pkn("linkmic_id_str")
        public String linkmicIdStr;

        @InterfaceC65349Pkn("rival_linkmic_id_str")
        public String rivalLinkmicIdStr;

        @InterfaceC65349Pkn("rtc_ext_info")
        public String rtcExtInfo;

        @Override // X.F9E
        public final Object[] getObjects() {
            String str = this.rtcExtInfo;
            Long l = this.channelId;
            String str2 = this.linkmicIdStr;
            Long l2 = this.actionId;
            String str3 = this.rivalLinkmicIdStr;
            return new Object[]{str, str, l, l, str2, str2, l2, l2, str3, str3};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        ResponseData responseData = this.data;
        return new Object[]{responseData, responseData};
    }
}
