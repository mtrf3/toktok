package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.BenefitClaimResponse;

/* loaded from: classes17.dex */
public final class _BenefitClaimResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BenefitClaimResponse.ResponseData> {
    public static BenefitClaimResponse.ResponseData LIZIZ(Q9H q9h) {
        BenefitClaimResponse.ResponseData responseData = new BenefitClaimResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.giftCode = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BenefitClaimResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}