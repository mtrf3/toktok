package com.bytedance.android.livesdk.model.message.ext;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes13.dex */
public final class _PopProduct_ProtoDecoder implements InterfaceC31105CIr<PopProduct> {
    public static PopProduct LIZIZ(Q9H q9h) {
        PopProduct popProduct = new PopProduct();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        popProduct.title = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        popProduct.price = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        popProduct.imageUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        popProduct.openUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        popProduct.productType = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        popProduct.productId = q9h.LJIIJJI();
                        break;
                    case 7:
                        popProduct.source = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        popProduct.sourceFrom = (int) q9h.LJIIJJI();
                        break;
                    case 9:
                        popProduct.schema = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        popProduct.platform = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        popProduct.productStatus = (int) q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return popProduct;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PopProduct LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
