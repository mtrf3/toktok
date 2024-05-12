package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.DiamondBuyResult;

/* loaded from: classes16.dex */
public final class _DiamondBuyResult_APPartnerAPIInAppRequest_ProtoDecoder implements InterfaceC31105CIr<DiamondBuyResult.APPartnerAPIInAppRequest> {
    @Override // X.InterfaceC31105CIr
    public final DiamondBuyResult.APPartnerAPIInAppRequest LIZ(Q9H q9h) {
        DiamondBuyResult.APPartnerAPIInAppRequest aPPartnerAPIInAppRequest = new DiamondBuyResult.APPartnerAPIInAppRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        aPPartnerAPIInAppRequest.genericProductId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    aPPartnerAPIInAppRequest.requestBody = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return aPPartnerAPIInAppRequest;
            }
        }
    }
}
