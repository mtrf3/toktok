package tikcast.api.anchor;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class AnchorLiveReplayFrameResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes13.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("req_id")
        public String reqId = "";

        @InterfaceC65349Pkn("frame_list")
        public List<FrameInfo> frameList = new ArrayList();
    }
}
