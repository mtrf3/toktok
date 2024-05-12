package tikcast.api.eco;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class FeatureCheckResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public ResponseExtra extra;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("result_list")
        public List<FeatureCheckResult> resultList = new ArrayList();
    }

    /* loaded from: classes17.dex */
    public static final class ResponseExtra {

        @InterfaceC65349Pkn("now")
        public long now;
    }
}
