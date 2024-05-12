package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.profit.ListResult;

/* loaded from: classes17.dex */
public final class _ListResult_IapCustomData_ProtoDecoder implements InterfaceC31105CIr<ListResult.IapCustomData> {
    public static ListResult.IapCustomData LIZIZ(Q9H q9h) {
        ListResult.IapCustomData iapCustomData = new ListResult.IapCustomData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        iapCustomData.enableCustomRecharge = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        iapCustomData.customRechargeScenariosKey = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        iapCustomData.customRechargePopupUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        iapCustomData.customRechargePanelUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        iapCustomData.hasIapCustomRecharge = q9h.LJIIJ();
                        break;
                    case 6:
                        iapCustomData.balancePageCustomRechargePanelUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        iapCustomData.balancePageCustomRechargePopupUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        iapCustomData.balancePageWebRechargeUrl = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return iapCustomData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListResult.IapCustomData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
