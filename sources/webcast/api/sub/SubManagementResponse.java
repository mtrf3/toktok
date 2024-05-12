package webcast.api.sub;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;

/* loaded from: classes6.dex */
public final class SubManagementResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("active_subscriber_cnt")
        public long activeSubscriberCnt;

        @InterfaceC65349Pkn("live_sub_only_config")
        public LiveSubOnlyConfig liveSubOnlyConfig;

        @InterfaceC65349Pkn("sub_only_chat_status")
        public int subOnlyChatStatus;

        @InterfaceC65349Pkn("sub_only_live_status")
        public int subOnlyLiveStatus;
    }
}
