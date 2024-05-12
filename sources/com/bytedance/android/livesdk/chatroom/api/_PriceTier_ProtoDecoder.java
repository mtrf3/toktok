package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PriceTier_ProtoDecoder implements InterfaceC31105CIr<PriceTier> {
    @Override // X.InterfaceC31105CIr
    public final PriceTier LIZ(Q9H q9h) {
        PriceTier priceTier = new PriceTier();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    priceTier.isDefault = Q9J.LIZ(q9h);
                                }
                            } else {
                                priceTier.priceHint = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            priceTier.localPrice = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        priceTier.usdPrice = Q9J.LIZIZ(q9h);
                    }
                } else {
                    priceTier.priceTierGrade = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return priceTier;
            }
        }
    }
}
