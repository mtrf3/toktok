package webcast.api.goody_bag;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCoinDetail;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagUserInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class GetGoodyBagDetailResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("biz")
        public int biz;

        @InterfaceC65349Pkn("coin_detail")
        public GoodyBagCoinDetail coinDetail;

        @InterfaceC65349Pkn("common_detail")
        public GoodyBagCommonDetail commonDetail;

        @InterfaceC65349Pkn("joined")
        public boolean joined;

        @InterfaceC65349Pkn("goody_bag_id")
        public String goodyBagId = "";

        @InterfaceC65349Pkn("audience")
        public List<GoodyBagUserInfo> audience = new ArrayList();
    }
}
