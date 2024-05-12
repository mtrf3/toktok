package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _DiamondBuyRequestParams_ProtoDecoder implements InterfaceC31105CIr<DiamondBuyRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final DiamondBuyRequestParams LIZ(Q9H q9h) {
        DiamondBuyRequestParams diamondBuyRequestParams = new DiamondBuyRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        diamondBuyRequestParams.diamondId = q9h.LJIIJ();
                        break;
                    case 2:
                        diamondBuyRequestParams.way = q9h.LJIIJ();
                        break;
                    case 3:
                        diamondBuyRequestParams.currency = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        diamondBuyRequestParams.source = q9h.LJIIJ();
                        break;
                    case 5:
                        diamondBuyRequestParams.roomId = q9h.LJIIJJI();
                        break;
                    case 6:
                        diamondBuyRequestParams.priceAmountMicros = q9h.LJIIJJI();
                        break;
                    case 7:
                        diamondBuyRequestParams.firstRecharge = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        diamondBuyRequestParams.orderId = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        diamondBuyRequestParams.tradeType = q9h.LJIIJ();
                        break;
                    case 10:
                        diamondBuyRequestParams.businessType = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        diamondBuyRequestParams.skipKycReminder = Q9J.LIZ(q9h);
                        break;
                    case 12:
                        diamondBuyRequestParams.notAddGivingCount = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        diamondBuyRequestParams.coinsCount = q9h.LJIIJJI();
                        break;
                    case 14:
                        diamondBuyRequestParams.iapCountryCode = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        diamondBuyRequestParams.voucherTokenList = Q9J.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        diamondBuyRequestParams.campaignType = q9h.LJIIJ();
                        break;
                    case 17:
                        diamondBuyRequestParams.mode = q9h.LJIIJ();
                        break;
                    case 18:
                        diamondBuyRequestParams.penaltyWarningSkip = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return diamondBuyRequestParams;
            }
        }
    }
}
