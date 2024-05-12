package webcast.api.linkmic;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;

/* loaded from: classes14.dex */
public final class ApplyResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ApplyExtra {

        @InterfaceC65349Pkn("log_pb")
        public LogPb logPb;

        /* loaded from: classes14.dex */
        public static final class LogPb {

            @InterfaceC65349Pkn("client_log_id")
            public String clientLogId = "";
        }
    }

    /* loaded from: classes14.dex */
    public static final class ResponseData extends F9E {

        @InterfaceC65349Pkn("action_id")
        public Long actionId;

        @InterfaceC65349Pkn("channel_id")
        public Long channelId;

        @InterfaceC65349Pkn("extra")
        public ApplyExtra extra;

        @InterfaceC65349Pkn("linkmic_id_str")
        public String linkMicIdStr;

        @InterfaceC65349Pkn("perception_message")
        public PerceptionMessage perceptionMessage;

        @InterfaceC65349Pkn("perception_status")
        public int perceptionStatus;

        @InterfaceC65349Pkn("rivals_linkmic_id_str")
        public String rivalsLinkMicIdStr;

        @InterfaceC65349Pkn("rtc_ext_info")
        public String rtcExtInfo;

        @Override // X.F9E
        public final Object[] getObjects() {
            Long l = this.actionId;
            Long l2 = this.channelId;
            return new Object[]{l, l, l2, l2};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        ResponseData responseData = this.data;
        return new Object[]{responseData, responseData};
    }
}
