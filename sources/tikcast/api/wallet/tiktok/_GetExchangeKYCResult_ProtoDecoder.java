package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetExchangeKYCResult_ProtoDecoder implements InterfaceC31105CIr<GetExchangeKYCResult> {
    @Override // X.InterfaceC31105CIr
    public final GetExchangeKYCResult LIZ(Q9H q9h) {
        GetExchangeKYCResult getExchangeKYCResult = new GetExchangeKYCResult();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return getExchangeKYCResult;
    }
}