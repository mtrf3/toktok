package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetTotalBalanceRequest_ProtoDecoder implements InterfaceC31105CIr<GetTotalBalanceRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetTotalBalanceRequest LIZ(Q9H q9h) {
        GetTotalBalanceRequest getTotalBalanceRequest = new GetTotalBalanceRequest();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return getTotalBalanceRequest;
    }
}
