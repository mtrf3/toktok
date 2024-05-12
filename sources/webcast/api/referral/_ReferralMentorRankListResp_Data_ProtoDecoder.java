package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.referral.ReferralMentorRankListResp;

/* loaded from: classes17.dex */
public final class _ReferralMentorRankListResp_Data_ProtoDecoder implements InterfaceC31105CIr<ReferralMentorRankListResp.Data> {
    public static ReferralMentorRankListResp.Data LIZIZ(Q9H q9h) {
        ReferralMentorRankListResp.Data data = new ReferralMentorRankListResp.Data();
        data.mentorRanklist = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        data.mentorRanklist.add(_ReferralMentorRankListResp_MentorRankItem_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 2:
                        data.currentRankNumber = q9h.LJIIJJI();
                        break;
                    case 3:
                        data.currentRankScore = q9h.LJIIJJI();
                        break;
                    case 4:
                        data.rankText = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        data.userInfo = _UserInfoMeta_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        data.userLiveInfo = _LiveInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReferralMentorRankListResp.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
