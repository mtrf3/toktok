package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public final class _ListResult_VoucherItem_CashbackInfo_CashbackPercentage_ProtoDecoder implements InterfaceC31105CIr<ListResult.VoucherItem.CashbackInfo.CashbackPercentage> {
    public static ListResult.VoucherItem.CashbackInfo.CashbackPercentage LIZIZ(Q9H q9h) {
        ListResult.VoucherItem.CashbackInfo.CashbackPercentage cashbackPercentage = new ListResult.VoucherItem.CashbackInfo.CashbackPercentage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        cashbackPercentage.webapp = Q9J.LIZIZ(q9h);
                    }
                } else {
                    cashbackPercentage.iap = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cashbackPercentage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListResult.VoucherItem.CashbackInfo.CashbackPercentage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
