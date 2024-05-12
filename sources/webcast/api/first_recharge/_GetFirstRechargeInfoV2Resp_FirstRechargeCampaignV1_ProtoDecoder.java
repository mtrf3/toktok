package webcast.api.first_recharge;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.wallet._Diamond_ProtoDecoder;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* loaded from: classes14.dex */
public final class _GetFirstRechargeInfoV2Resp_FirstRechargeCampaignV1_ProtoDecoder implements InterfaceC31105CIr<GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1> {
    @Override // X.InterfaceC31105CIr
    public final GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1 LIZ(Q9H q9h) {
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1 firstRechargeCampaignV1 = new GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                firstRechargeCampaignV1.firstChargeGiftStyle = q9h.LJIIJ();
                            }
                        } else {
                            firstRechargeCampaignV1.defaultDiamond = _Diamond_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        firstRechargeCampaignV1.guideEffectRule = _GetFirstRechargeInfoV2Resp_FirstChargeGuideEffectRule_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    firstRechargeCampaignV1.isFirstCharge = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return firstRechargeCampaignV1;
            }
        }
    }
}
