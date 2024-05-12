package com.bytedance.android.livesdk.wallet;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.wallet.model._CurrencyPriceItem_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _Diamond_ProtoDecoder implements InterfaceC31105CIr<Diamond> {
    public static Diamond LIZIZ(Q9H q9h) {
        Diamond diamond = new Diamond();
        diamond.currencyPrice = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        diamond.id = (int) q9h.LJIIJJI();
                        break;
                    case 2:
                        diamond.iapId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        diamond.price = String.valueOf(q9h.LJIIJ());
                        break;
                    case 4:
                        diamond.exchangePrice = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 5:
                        diamond.count = q9h.LJIIJ();
                        break;
                    case 6:
                        diamond.givingCount = q9h.LJIIJ();
                        break;
                    case 7:
                        diamond.describe = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        diamond.currencyPrice.add(_CurrencyPriceItem_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 9:
                        diamond.couponId = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        diamond.discountPrice = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        diamond.stallType = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return diamond;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Diamond LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
