package webcast.api.goody_bag;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;

/* loaded from: classes6.dex */
public final class GetRoomGoodyBagResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("base_info")
        public GoodyBagBaseInfo baseInfo;

        @InterfaceC65349Pkn("goody_bag_id")
        public String goodyBagId = "";

        @InterfaceC65349Pkn("joined")
        public boolean joined;
    }
}
