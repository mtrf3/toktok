package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public final class _ListResult_IapUnitPrice_ProtoDecoder implements InterfaceC31105CIr<ListResult.IapUnitPrice> {
    public static ListResult.IapUnitPrice LIZIZ(Q9H q9h) {
        ListResult.IapUnitPrice iapUnitPrice = new ListResult.IapUnitPrice();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        iapUnitPrice.priceDot = q9h.LJIIJ();
                    }
                } else {
                    iapUnitPrice.price = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return iapUnitPrice;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListResult.IapUnitPrice LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
