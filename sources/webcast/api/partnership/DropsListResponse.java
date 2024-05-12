package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.game.model.PartnershipBriefDrops;
import com.bytedance.android.livesdk.game.model.PartnershipDropsV1;
import java.util.List;

/* loaded from: classes17.dex */
public final class DropsListResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("drops")
        public List<PartnershipDropsV1> drops;

        @InterfaceC65349Pkn("joinable_list")
        public List<PartnershipBriefDrops> joinableList;

        @InterfaceC65349Pkn("other_list")
        public List<PartnershipBriefDrops> otherList;

        @InterfaceC65349Pkn("priority_region")
        public String priorityRegion = "";

        @InterfaceC65349Pkn("total")
        public long total;
    }
}
