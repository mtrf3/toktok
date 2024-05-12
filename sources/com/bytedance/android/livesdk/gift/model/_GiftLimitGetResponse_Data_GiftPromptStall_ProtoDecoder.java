package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.GiftLimitGetResponse;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GiftLimitGetResponse_Data_GiftPromptStall_ProtoDecoder implements InterfaceC31105CIr<GiftLimitGetResponse.Data.GiftPromptStall> {
    public static GiftLimitGetResponse.Data.GiftPromptStall LIZIZ(Q9H q9h) {
        GiftLimitGetResponse.Data.GiftPromptStall giftPromptStall = new GiftLimitGetResponse.Data.GiftPromptStall();
        giftPromptStall.amountStalls = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftPromptStall.currencyCode = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        giftPromptStall.amountStalls.add(Integer.valueOf(q9h.LJIIJ()));
                        break;
                    case 3:
                        giftPromptStall.selectedStall = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 4:
                        giftPromptStall.currencySymbol = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        giftPromptStall.region = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        giftPromptStall.pastMaxMoney = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 7:
                        giftPromptStall.suggestedStallThreshold = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 8:
                        giftPromptStall.selectedCode = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        giftPromptStall.coinExchangeRate = Double.longBitsToDouble(q9h.LJIIIZ());
                        break;
                    case 10:
                        giftPromptStall.useCoinLimit = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        giftPromptStall.selectedStallInCoin = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftPromptStall;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftLimitGetResponse.Data.GiftPromptStall LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
