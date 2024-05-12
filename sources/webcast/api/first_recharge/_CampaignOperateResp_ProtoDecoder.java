package webcast.api.first_recharge;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.first_recharge.CampaignOperateResp;

/* loaded from: classes14.dex */
public final class _CampaignOperateResp_ProtoDecoder implements InterfaceC31105CIr<CampaignOperateResp> {
    @Override // X.InterfaceC31105CIr
    public final CampaignOperateResp LIZ(Q9H q9h) {
        CampaignOperateResp campaignOperateResp = new CampaignOperateResp();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    CampaignOperateResp.Data data = new CampaignOperateResp.Data();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    campaignOperateResp.data = data;
                }
            } else {
                q9h.LJ(LIZJ);
                return campaignOperateResp;
            }
        }
    }
}
