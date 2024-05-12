package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ProductSnapShot_ProtoDecoder implements InterfaceC31105CIr<ProductSnapShot> {
    public static ProductSnapShot LIZIZ(Q9H q9h) {
        ProductSnapShot productSnapShot = new ProductSnapShot();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        productSnapShot.productId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        productSnapShot.title = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        productSnapShot.cover = _Img_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        productSnapShot.stockType = q9h.LJIIJ();
                        break;
                    case 5:
                        productSnapShot.timestamp = q9h.LJIIJJI();
                        break;
                    case 6:
                        productSnapShot.addToCartButton = _AddToCartButton_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return productSnapShot;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ProductSnapShot LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
