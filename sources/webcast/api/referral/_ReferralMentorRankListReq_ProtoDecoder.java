package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ReferralMentorRankListReq_ProtoDecoder implements InterfaceC31105CIr<ReferralMentorRankListReq> {
    @Override // X.InterfaceC31105CIr
    public final ReferralMentorRankListReq LIZ(Q9H q9h) {
        ReferralMentorRankListReq referralMentorRankListReq = new ReferralMentorRankListReq();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    referralMentorRankListReq.actId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return referralMentorRankListReq;
            }
        }
    }
}
