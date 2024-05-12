package com.bytedance.android.live.wallet.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _CurrencyPriceItem_ProtoDecoder implements InterfaceC31105CIr<CurrencyPriceItem> {
    public static CurrencyPriceItem LIZIZ(Q9H q9h) {
        CurrencyPriceItem currencyPriceItem = new CurrencyPriceItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        currencyPriceItem.currency = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        currencyPriceItem.priceShowForm = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        currencyPriceItem.price = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 4:
                        currencyPriceItem.originalPrice = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 5:
                        currencyPriceItem.priceDot = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 6:
                        currencyPriceItem.keepDot = Integer.valueOf(q9h.LJIIJ());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return currencyPriceItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CurrencyPriceItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
