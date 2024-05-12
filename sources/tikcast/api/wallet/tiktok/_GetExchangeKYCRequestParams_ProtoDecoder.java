package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GetExchangeKYCRequestParams_ProtoDecoder implements InterfaceC31105CIr<GetExchangeKYCRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final GetExchangeKYCRequestParams LIZ(Q9H q9h) {
        GetExchangeKYCRequestParams getExchangeKYCRequestParams = new GetExchangeKYCRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getExchangeKYCRequestParams.source = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return getExchangeKYCRequestParams;
            }
        }
    }
}
