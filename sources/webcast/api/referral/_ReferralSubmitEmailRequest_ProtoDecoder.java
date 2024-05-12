package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _ReferralSubmitEmailRequest_ProtoDecoder implements InterfaceC31105CIr<ReferralSubmitEmailRequest> {
    @Override // X.InterfaceC31105CIr
    public final ReferralSubmitEmailRequest LIZ(Q9H q9h) {
        ReferralSubmitEmailRequest referralSubmitEmailRequest = new ReferralSubmitEmailRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            referralSubmitEmailRequest.email = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        referralSubmitEmailRequest.swapRole = q9h.LJIIJJI();
                    }
                } else {
                    referralSubmitEmailRequest.actId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return referralSubmitEmailRequest;
            }
        }
    }
}
