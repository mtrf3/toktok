package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GetABSStatusRequestParams_ProtoDecoder implements InterfaceC31105CIr<GetABSStatusRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final GetABSStatusRequestParams LIZ(Q9H q9h) {
        GetABSStatusRequestParams getABSStatusRequestParams = new GetABSStatusRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getABSStatusRequestParams.iapCurrency = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getABSStatusRequestParams;
            }
        }
    }
}
