package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.game.model.PartnershipDrops;
import com.bytedance.android.livesdk.game.model.PartnershipDropsV1;

/* loaded from: classes17.dex */
public final class DropsDetailResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("can_join")
        public boolean canJoin;

        @InterfaceC65349Pkn("detail")
        public PartnershipDropsV1 detail;

        @InterfaceC65349Pkn("drops")
        public PartnershipDrops drops;

        @InterfaceC65349Pkn("priority_region")
        public String priorityRegion = "";
    }
}
