package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public final class _ListResult_VoucherItem_CashbackInfo_USDConversionRate_ProtoDecoder implements InterfaceC31105CIr<ListResult.VoucherItem.CashbackInfo.USDConversionRate> {
    public static ListResult.VoucherItem.CashbackInfo.USDConversionRate LIZIZ(Q9H q9h) {
        ListResult.VoucherItem.CashbackInfo.USDConversionRate uSDConversionRate = new ListResult.VoucherItem.CashbackInfo.USDConversionRate();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        uSDConversionRate.rateDecimalPosition = q9h.LJIIJ();
                    }
                } else {
                    uSDConversionRate.rate = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return uSDConversionRate;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListResult.VoucherItem.CashbackInfo.USDConversionRate LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
