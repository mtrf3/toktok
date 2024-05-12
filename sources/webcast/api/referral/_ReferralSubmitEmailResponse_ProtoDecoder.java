package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.referral.ReferralSubmitEmailResponse;

/* loaded from: classes14.dex */
public final class _ReferralSubmitEmailResponse_ProtoDecoder implements InterfaceC31105CIr<ReferralSubmitEmailResponse> {
    @Override // X.InterfaceC31105CIr
    public final ReferralSubmitEmailResponse LIZ(Q9H q9h) {
        ReferralSubmitEmailResponse referralSubmitEmailResponse = new ReferralSubmitEmailResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    ReferralSubmitEmailResponse.Data data = new ReferralSubmitEmailResponse.Data();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    referralSubmitEmailResponse.data = data;
                }
            } else {
                q9h.LJ(LIZJ);
                return referralSubmitEmailResponse;
            }
        }
    }
}
