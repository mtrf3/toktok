package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.game.model.PartnershipDropsReward;
import com.bytedance.android.livesdk.game.model.PartnershipDropsRewardV1;
import java.util.List;

/* loaded from: classes17.dex */
public final class DropsRewardsResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("drop_rewards")
        public List<PartnershipDropsRewardV1> dropRewards;

        @InterfaceC65349Pkn("rewards")
        public List<PartnershipDropsReward> rewards;

        @InterfaceC65349Pkn("total")
        public long total;
    }
}
