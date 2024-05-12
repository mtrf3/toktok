package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _ReferralOptOutRequest_ProtoDecoder implements InterfaceC31105CIr<ReferralOptOutRequest> {
    @Override // X.InterfaceC31105CIr
    public final ReferralOptOutRequest LIZ(Q9H q9h) {
        ReferralOptOutRequest referralOptOutRequest = new ReferralOptOutRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            referralOptOutRequest.scene = q9h.LJIIJ();
                        }
                    } else {
                        referralOptOutRequest.roleType = q9h.LJIIJJI();
                    }
                } else {
                    referralOptOutRequest.actId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return referralOptOutRequest;
            }
        }
    }
}
