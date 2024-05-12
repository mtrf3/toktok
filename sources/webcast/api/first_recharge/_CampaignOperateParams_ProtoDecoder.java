package webcast.api.first_recharge;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _CampaignOperateParams_ProtoDecoder implements InterfaceC31105CIr<CampaignOperateParams> {
    @Override // X.InterfaceC31105CIr
    public final CampaignOperateParams LIZ(Q9H q9h) {
        CampaignOperateParams campaignOperateParams = new CampaignOperateParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    campaignOperateParams.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return campaignOperateParams;
            }
        }
    }
}
