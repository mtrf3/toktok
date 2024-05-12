package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _BenefitClaimRequest_ProtoDecoder implements InterfaceC31105CIr<BenefitClaimRequest> {
    @Override // X.InterfaceC31105CIr
    public final BenefitClaimRequest LIZ(Q9H q9h) {
        BenefitClaimRequest benefitClaimRequest = new BenefitClaimRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        benefitClaimRequest.giftId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    benefitClaimRequest.benefitActivityId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return benefitClaimRequest;
            }
        }
    }
}
