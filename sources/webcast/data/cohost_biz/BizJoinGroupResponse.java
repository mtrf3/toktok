package webcast.data.cohost_biz;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;

/* loaded from: classes14.dex */
public final class BizJoinGroupResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("perception_message")
        public PerceptionMessage perceptionMessage;

        @InterfaceC65349Pkn("perception_status")
        public int perceptionStatus;
    }
}
