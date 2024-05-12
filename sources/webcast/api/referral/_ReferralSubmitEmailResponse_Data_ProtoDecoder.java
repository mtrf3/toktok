package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.referral.ReferralSubmitEmailResponse;

/* loaded from: classes14.dex */
public final class _ReferralSubmitEmailResponse_Data_ProtoDecoder implements InterfaceC31105CIr<ReferralSubmitEmailResponse.Data> {
    @Override // X.InterfaceC31105CIr
    public final ReferralSubmitEmailResponse.Data LIZ(Q9H q9h) {
        ReferralSubmitEmailResponse.Data data = new ReferralSubmitEmailResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return data;
    }
}
