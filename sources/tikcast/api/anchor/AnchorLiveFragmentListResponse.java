package tikcast.api.anchor;

import X.C113554cx;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
public final class AnchorLiveFragmentListResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes16.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("room_map")
        public Map<String, AnchorFragmentListResult> roomMap = C113554cx.LJJJLIIL();

        @InterfaceC65349Pkn("post_detail_list")
        public List<AnchorLiveFragmentPostDetail> postDetailList = new ArrayList();
    }
}
