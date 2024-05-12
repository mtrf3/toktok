package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public class MsgDetectMessage extends CR6 {

    @InterfaceC65349Pkn("d_type")
    public int detectType;

    @InterfaceC65349Pkn("from_region")
    public String fromRegion;

    @InterfaceC65349Pkn("t_info")
    public TimeInfo timeInfo;

    @InterfaceC65349Pkn("trigger_by")
    public int triggerBy;

    @InterfaceC65349Pkn("t_condition")
    public TriggerCondition triggerCondition;

    /* loaded from: classes14.dex */
    public static class TimeInfo {

        @InterfaceC65349Pkn("api_recv_time_ms")
        public long apiRecvTimeMs;

        @InterfaceC65349Pkn("api_send_to_goim_ms")
        public long apiSendToGoimMs;

        @InterfaceC65349Pkn("client_start_ms")
        public long clientStartMs;
    }

    /* loaded from: classes14.dex */
    public static class TriggerCondition {

        @InterfaceC65349Pkn("detect_p2p_msg")
        public Boolean detectP2PMsg;

        @InterfaceC65349Pkn("detect_room_msg")
        public Boolean detectRoomMsg;

        @InterfaceC65349Pkn("http_optimize")
        public Boolean httpOptimize;

        @InterfaceC65349Pkn("uplink_detect_http")
        public Boolean uplinkDetectHTTP;

        @InterfaceC65349Pkn("uplink_detect_websocket")
        public Boolean uplinkDetectWebsocket;
    }

    public MsgDetectMessage() {
        this.type = EnumC31509CYf.MSG_DETECT_MESSAGE;
    }
}
