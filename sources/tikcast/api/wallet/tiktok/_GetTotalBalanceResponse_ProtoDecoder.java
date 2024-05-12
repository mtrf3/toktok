package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetTotalBalanceResponse_ProtoDecoder implements InterfaceC31105CIr<GetTotalBalanceResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetTotalBalanceResponse LIZ(Q9H q9h) {
        GetTotalBalanceResponse getTotalBalanceResponse = new GetTotalBalanceResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getTotalBalanceResponse.data = _GetTotalBalanceResponse_GetTotalBalanceData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getTotalBalanceResponse;
            }
        }
    }
}
