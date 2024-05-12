package webcast.api.sub;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.subscribe.model.SubscriberInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GetTimerSubscriberListResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("has_next")
        public boolean hasNext;

        @InterfaceC65349Pkn("next_cursor")
        public long nextCursor;

        @InterfaceC65349Pkn("subscriber_count")
        public long subscriberCount;

        @InterfaceC65349Pkn("subscribers")
        public List<SubscriberInfo> subscribers = new ArrayList();
    }
}
