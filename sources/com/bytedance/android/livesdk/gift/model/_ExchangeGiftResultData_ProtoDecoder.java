package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _ExchangeGiftResultData_ProtoDecoder implements InterfaceC31105CIr<ExchangeGiftResultData> {
    public static ExchangeGiftResultData LIZIZ(Q9H q9h) {
        ExchangeGiftResultData exchangeGiftResultData = new ExchangeGiftResultData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        exchangeGiftResultData.balance = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    exchangeGiftResultData.sourceType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return exchangeGiftResultData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ExchangeGiftResultData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
