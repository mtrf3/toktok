package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ProductAtmosphereTag_ProtoDecoder implements InterfaceC31105CIr<ProductAtmosphereTag> {
    public static ProductAtmosphereTag LIZIZ(Q9H q9h) {
        ProductAtmosphereTag productAtmosphereTag = new ProductAtmosphereTag();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            productAtmosphereTag.count = q9h.LJIIJJI();
                        }
                    } else {
                        productAtmosphereTag.tagDesc = Q9J.LIZIZ(q9h);
                    }
                } else {
                    productAtmosphereTag.productId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return productAtmosphereTag;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ProductAtmosphereTag LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
