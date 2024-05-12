package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RealtimeLiveCenterShopData_ProtoDecoder implements InterfaceC31105CIr<RealtimeLiveCenterShopData> {
    public static RealtimeLiveCenterShopData LIZIZ(Q9H q9h) {
        RealtimeLiveCenterShopData realtimeLiveCenterShopData = new RealtimeLiveCenterShopData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 6) {
                                Q9J.LIZJ(q9h);
                            } else {
                                realtimeLiveCenterShopData.buyers = q9h.LJIIJJI();
                            }
                        } else {
                            realtimeLiveCenterShopData.unitSales = q9h.LJIIJJI();
                        }
                    } else {
                        realtimeLiveCenterShopData.revenueAmount = Q9J.LIZIZ(q9h);
                    }
                } else {
                    realtimeLiveCenterShopData.showShopData = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return realtimeLiveCenterShopData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RealtimeLiveCenterShopData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
