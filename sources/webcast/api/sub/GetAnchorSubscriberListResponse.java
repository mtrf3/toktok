package webcast.api.sub;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class GetAnchorSubscriberListResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("goal_count")
        public long goalCount;

        @InterfaceC65349Pkn("reach_count")
        public long reachCount;

        @InterfaceC65349Pkn("subscriber_msg")
        public List<SubscriberMsg> subscriberMsg;

        @InterfaceC65349Pkn("total_sub_count")
        public long totalSubCount;
    }
}
