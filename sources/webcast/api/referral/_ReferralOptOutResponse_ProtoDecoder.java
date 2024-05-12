package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.referral.ReferralOptOutResponse;

/* loaded from: classes14.dex */
public final class _ReferralOptOutResponse_ProtoDecoder implements InterfaceC31105CIr<ReferralOptOutResponse> {
    @Override // X.InterfaceC31105CIr
    public final ReferralOptOutResponse LIZ(Q9H q9h) {
        ReferralOptOutResponse referralOptOutResponse = new ReferralOptOutResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    ReferralOptOutResponse.Data data = new ReferralOptOutResponse.Data();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    referralOptOutResponse.data = data;
                }
            } else {
                q9h.LJ(LIZJ);
                return referralOptOutResponse;
            }
        }
    }
}
