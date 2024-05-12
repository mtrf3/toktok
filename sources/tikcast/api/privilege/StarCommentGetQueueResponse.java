package tikcast.api.privilege;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class StarCommentGetQueueResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("advanced_interval_between_msg_ms")
        public long advancedIntervalBetweenMsgMs;

        @InterfaceC65349Pkn("client_reserve")
        public String clientReserve = "";

        @InterfaceC65349Pkn("lagging_interval_between_msg_ms")
        public long laggingIntervalBetweenMsgMs;

        @InterfaceC65349Pkn("normal_interval_between_msg_ms")
        public long normalIntervalBetweenMsgMs;

        @InterfaceC65349Pkn("polling_interval_ms")
        public long pollingIntervalMs;

        @InterfaceC65349Pkn("queue")
        public StarCommentQueue queue;

        @InterfaceC65349Pkn("server_cur_msg_start_time_ms")
        public long serverCurMsgStartTimeMs;
    }
}
