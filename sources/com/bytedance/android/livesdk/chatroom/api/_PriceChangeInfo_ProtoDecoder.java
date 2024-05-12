package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _PriceChangeInfo_ProtoDecoder implements InterfaceC31105CIr<PriceChangeInfo> {
    public static PriceChangeInfo LIZIZ(Q9H q9h) {
        PriceChangeInfo priceChangeInfo = new PriceChangeInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        priceChangeInfo.isPriceChanged = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        priceChangeInfo.newPrice = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        priceChangeInfo.oldPrice = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        priceChangeInfo.nextBillingDate = q9h.LJIIJJI();
                        break;
                    case 5:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 6:
                        priceChangeInfo.daysLeftToAgreeChange = q9h.LJIIJJI();
                        break;
                    case 7:
                        priceChangeInfo.isFirstEntrance = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        priceChangeInfo.isConsentRequired = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        priceChangeInfo.contractId = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        priceChangeInfo.orderId = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        priceChangeInfo.noConfirmCancelContractDate = q9h.LJIIJJI();
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return priceChangeInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PriceChangeInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
