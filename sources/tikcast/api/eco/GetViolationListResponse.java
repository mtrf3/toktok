package tikcast.api.eco;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GetViolationListResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public ResponseExtra extra;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("active_count")
        public int activeCount;

        @InterfaceC65349Pkn("feedback")
        public ViolationFeedback feedback;

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("history_count")
        public int historyCount;

        @InterfaceC65349Pkn("is_eea")
        public boolean isEea;

        @InterfaceC65349Pkn("records")
        public List<ViolationRecord> records = new ArrayList();

        @InterfaceC65349Pkn("next_last_id")
        public String nextLastId = "";

        @InterfaceC65349Pkn("guide_detail_list")
        public List<GuideDetail> guideDetailList = new ArrayList();
    }

    /* loaded from: classes17.dex */
    public static final class ResponseExtra {

        @InterfaceC65349Pkn("now")
        public long now;
    }
}
