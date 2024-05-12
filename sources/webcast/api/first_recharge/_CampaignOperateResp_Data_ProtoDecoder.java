package webcast.api.first_recharge;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.first_recharge.CampaignOperateResp;

/* loaded from: classes14.dex */
public final class _CampaignOperateResp_Data_ProtoDecoder implements InterfaceC31105CIr<CampaignOperateResp.Data> {
    @Override // X.InterfaceC31105CIr
    public final CampaignOperateResp.Data LIZ(Q9H q9h) {
        CampaignOperateResp.Data data = new CampaignOperateResp.Data();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return data;
    }
}
