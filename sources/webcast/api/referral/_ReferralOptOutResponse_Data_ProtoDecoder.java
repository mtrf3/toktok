package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.referral.ReferralOptOutResponse;

/* loaded from: classes14.dex */
public final class _ReferralOptOutResponse_Data_ProtoDecoder implements InterfaceC31105CIr<ReferralOptOutResponse.Data> {
    @Override // X.InterfaceC31105CIr
    public final ReferralOptOutResponse.Data LIZ(Q9H q9h) {
        ReferralOptOutResponse.Data data = new ReferralOptOutResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return data;
    }
}
