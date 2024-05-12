package com.bytedance.android.live.wallet.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _CustomizedDiamond_ProtoDecoder implements InterfaceC31105CIr<CustomizedDiamond> {
    public static CustomizedDiamond LIZIZ(Q9H q9h) {
        CustomizedDiamond customizedDiamond = new CustomizedDiamond();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        customizedDiamond.id = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        customizedDiamond.priceMin = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 3:
                        customizedDiamond.priceMax = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 4:
                        customizedDiamond.diamondCountRate = Float.valueOf(Float.intBitsToFloat(q9h.LJIIIIZZ()));
                        break;
                    case 5:
                        customizedDiamond.givingCount = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 6:
                        customizedDiamond.describe = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        customizedDiamond.couponId = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return customizedDiamond;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CustomizedDiamond LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
