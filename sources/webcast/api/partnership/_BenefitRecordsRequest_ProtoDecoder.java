package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _BenefitRecordsRequest_ProtoDecoder implements InterfaceC31105CIr<BenefitRecordsRequest> {
    @Override // X.InterfaceC31105CIr
    public final BenefitRecordsRequest LIZ(Q9H q9h) {
        BenefitRecordsRequest benefitRecordsRequest = new BenefitRecordsRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    benefitRecordsRequest.gameId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return benefitRecordsRequest;
            }
        }
    }
}
