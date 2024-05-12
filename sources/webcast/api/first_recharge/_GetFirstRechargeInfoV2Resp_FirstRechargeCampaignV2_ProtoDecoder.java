package webcast.api.first_recharge;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* loaded from: classes17.dex */
public final class _GetFirstRechargeInfoV2Resp_FirstRechargeCampaignV2_ProtoDecoder implements InterfaceC31105CIr<GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2> {
    @Override // X.InterfaceC31105CIr
    public final GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 LIZ(Q9H q9h) {
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2 = new GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        firstRechargeCampaignV2.isCashFirstCharge = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        firstRechargeCampaignV2.giftId = q9h.LJIIJJI();
                        break;
                    case 3:
                        firstRechargeCampaignV2.isShowCountdown = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        firstRechargeCampaignV2.expireTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        firstRechargeCampaignV2.totalFrozenCoins = q9h.LJIIJ();
                        break;
                    case 6:
                        firstRechargeCampaignV2.remainingFrozenCoins = q9h.LJIIJ();
                        break;
                    case 7:
                        firstRechargeCampaignV2.minimumNumberOfCoinsToUnlockFrozenCoins = q9h.LJIIJ();
                        break;
                    case 8:
                        firstRechargeCampaignV2.frozenCoinsForLargePackages = q9h.LJIIJ();
                        break;
                    case 9:
                        firstRechargeCampaignV2.frozenCoinsForSmallPackages = q9h.LJIIJ();
                        break;
                    case 10:
                        firstRechargeCampaignV2.rechargeCoinsForLargePackages = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        firstRechargeCampaignV2.rechargeCoinsForSmallPackages = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return firstRechargeCampaignV2;
            }
        }
    }
}
