package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _UpdateABSStatusRequestParams_ProtoDecoder implements InterfaceC31105CIr<UpdateABSStatusRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final UpdateABSStatusRequestParams LIZ(Q9H q9h) {
        UpdateABSStatusRequestParams updateABSStatusRequestParams = new UpdateABSStatusRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            updateABSStatusRequestParams.isAbsOn = Q9J.LIZ(q9h);
                        }
                    } else {
                        updateABSStatusRequestParams.isAgreed = Q9J.LIZ(q9h);
                    }
                } else {
                    updateABSStatusRequestParams.iapCurrency = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return updateABSStatusRequestParams;
            }
        }
    }
}
