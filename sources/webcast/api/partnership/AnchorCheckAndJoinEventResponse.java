package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes16.dex */
public final class AnchorCheckAndJoinEventResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes16.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("fail_reason_list")
        public List<Integer> failReasonList;

        @InterfaceC65349Pkn("fans_limit")
        public int fansLimit;

        @InterfaceC65349Pkn("join_success")
        public boolean joinSuccess;
    }
}
