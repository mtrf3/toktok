package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public final class _ListResult_VoucherItem_ProtoDecoder implements InterfaceC31105CIr<ListResult.VoucherItem> {
    public static ListResult.VoucherItem LIZIZ(Q9H q9h) {
        ListResult.VoucherItem voucherItem = new ListResult.VoucherItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        voucherItem.voucherToken = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        voucherItem.voucherType = q9h.LJIIJ();
                        break;
                    case 3:
                        voucherItem.voucherStarlingContent = _ListResult_VoucherItem_VoucherStarlingContent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        voucherItem.minOrderCoinsAmount = q9h.LJIIJJI();
                        break;
                    case 5:
                        voucherItem.maxOrderCoinsAmount = q9h.LJIIJJI();
                        break;
                    case 6:
                        voucherItem.expireTimestamp = q9h.LJIIJJI();
                        break;
                    case 7:
                        voucherItem.rewardDetail = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        voucherItem.voucherTemplateId = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        voucherItem.cashbackInfo = _ListResult_VoucherItem_CashbackInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        voucherItem.voucherStatus = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        voucherItem.lockExpiryUnix = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return voucherItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListResult.VoucherItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
