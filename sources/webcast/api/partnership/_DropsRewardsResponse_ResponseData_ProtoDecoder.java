package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._PartnershipDropsRewardV1_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsReward_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.partnership.DropsRewardsResponse;

/* loaded from: classes17.dex */
public final class _DropsRewardsResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<DropsRewardsResponse.ResponseData> {
    public static DropsRewardsResponse.ResponseData LIZIZ(Q9H q9h) {
        DropsRewardsResponse.ResponseData responseData = new DropsRewardsResponse.ResponseData();
        responseData.dropRewards = new ArrayList();
        responseData.rewards = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.total = q9h.LJIIJJI();
                        }
                    } else {
                        responseData.dropRewards.add(_PartnershipDropsRewardV1_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    responseData.rewards.add(_PartnershipDropsReward_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DropsRewardsResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
