package webcast.api.goody_bag;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagWinnerInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class GetGoodyBagWinnerListResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("next_offset")
        public long nextOffset;

        @InterfaceC65349Pkn("winners")
        public List<GoodyBagWinnerInfo> winners = new ArrayList();
    }
}
