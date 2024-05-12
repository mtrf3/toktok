package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import tikcast.api.wallet.tiktok.DiamondBuyResult;

/* loaded from: classes17.dex */
public final class _DiamondBuyResult_ABSPIPOInfo_ProtoDecoder implements InterfaceC31105CIr<DiamondBuyResult.ABSPIPOInfo> {
    public static DiamondBuyResult.ABSPIPOInfo LIZIZ(Q9H q9h) {
        DiamondBuyResult.ABSPIPOInfo aBSPIPOInfo = new DiamondBuyResult.ABSPIPOInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        aBSPIPOInfo.orderId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        aBSPIPOInfo.cashierUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        aBSPIPOInfo.paymentReference = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        aBSPIPOInfo.merchantId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        aBSPIPOInfo.nonce = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        aBSPIPOInfo.address = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        aBSPIPOInfo.taxMoney = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        aBSPIPOInfo.taxRate = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        aBSPIPOInfo.needBillingAddress = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        aBSPIPOInfo.notifyUrl = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        aBSPIPOInfo.totalMoney = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        aBSPIPOInfo.showTax = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        aBSPIPOInfo.region = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                    case 15:
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 17:
                        aBSPIPOInfo.coinNumber = q9h.LJIIJ();
                        break;
                    case 18:
                        aBSPIPOInfo.billingAddress = Q9J.LIZIZ(q9h);
                        break;
                    case 19:
                        aBSPIPOInfo.moneyBeforeTax = Q9J.LIZIZ(q9h);
                        break;
                    case 20:
                        aBSPIPOInfo.priceShowForm = Q9J.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return aBSPIPOInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DiamondBuyResult.ABSPIPOInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
