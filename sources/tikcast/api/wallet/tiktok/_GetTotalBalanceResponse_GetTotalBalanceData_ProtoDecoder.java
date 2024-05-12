package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.GetTotalBalanceResponse;

/* loaded from: classes6.dex */
public final class _GetTotalBalanceResponse_GetTotalBalanceData_ProtoDecoder implements InterfaceC31105CIr<GetTotalBalanceResponse.GetTotalBalanceData> {
    public static GetTotalBalanceResponse.GetTotalBalanceData LIZIZ(Q9H q9h) {
        GetTotalBalanceResponse.GetTotalBalanceData getTotalBalanceData = new GetTotalBalanceResponse.GetTotalBalanceData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getTotalBalanceData.balance = _GetTotalBalanceResponse_BalanceInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    getTotalBalanceData.hasIncomeBefore = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getTotalBalanceData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetTotalBalanceResponse.GetTotalBalanceData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
