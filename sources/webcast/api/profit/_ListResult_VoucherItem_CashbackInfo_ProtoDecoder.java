package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.HashMap;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public final class _ListResult_VoucherItem_CashbackInfo_ProtoDecoder implements InterfaceC31105CIr<ListResult.VoucherItem.CashbackInfo> {
    public static ListResult.VoucherItem.CashbackInfo LIZIZ(Q9H q9h) {
        ListResult.VoucherItem.CashbackInfo cashbackInfo = new ListResult.VoucherItem.CashbackInfo();
        cashbackInfo.diamondIdToCashbackUsdAmt = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                cashbackInfo.usdConversionRate = _ListResult_VoucherItem_CashbackInfo_USDConversionRate_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            cashbackInfo.showCashback = Q9J.LIZ(q9h);
                        }
                    } else {
                        long LIZJ2 = q9h.LIZJ();
                        Long l = null;
                        String str = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 == -1) {
                                break;
                            }
                            if (LJI2 != 1) {
                                if (LJI2 == 2) {
                                    str = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                l = Long.valueOf(q9h.LJIIJJI());
                            }
                        }
                        q9h.LJ(LIZJ2);
                        if (l != null) {
                            if (str != null) {
                                cashbackInfo.diamondIdToCashbackUsdAmt.put(l, str);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    cashbackInfo.cashbackPercentage = _ListResult_VoucherItem_CashbackInfo_CashbackPercentage_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cashbackInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListResult.VoucherItem.CashbackInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
