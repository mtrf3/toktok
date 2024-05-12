package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public final class _ListResult_VoucherItem_VoucherStarlingContent_ProtoDecoder implements InterfaceC31105CIr<ListResult.VoucherItem.VoucherStarlingContent> {
    public static ListResult.VoucherItem.VoucherStarlingContent LIZIZ(Q9H q9h) {
        ListResult.VoucherItem.VoucherStarlingContent voucherStarlingContent = new ListResult.VoucherItem.VoucherStarlingContent();
        voucherStarlingContent.voucherTags = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        voucherStarlingContent.voucherTags.add(Q9J.LIZIZ(q9h));
                        break;
                    case 2:
                        voucherStarlingContent.discountAmount = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        voucherStarlingContent.minAmount = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        voucherStarlingContent.maxAmount = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        voucherStarlingContent.validityPeriod = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        voucherStarlingContent.termsAndConditions = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        voucherStarlingContent.voucherApplied = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return voucherStarlingContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListResult.VoucherItem.VoucherStarlingContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
