package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.referral.ReferralMentorRankListResp;

/* loaded from: classes17.dex */
public final class _ReferralMentorRankListResp_MentorRankItem_ProtoDecoder implements InterfaceC31105CIr<ReferralMentorRankListResp.MentorRankItem> {
    public static ReferralMentorRankListResp.MentorRankItem LIZIZ(Q9H q9h) {
        ReferralMentorRankListResp.MentorRankItem mentorRankItem = new ReferralMentorRankListResp.MentorRankItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    mentorRankItem.rankNumber = q9h.LJIIJ();
                                }
                            } else {
                                mentorRankItem.score = q9h.LJIIJJI();
                            }
                        } else {
                            mentorRankItem.liveInfo = _LiveInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        mentorRankItem.mentorInfo = _UserInfoMeta_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    mentorRankItem.mentorId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return mentorRankItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReferralMentorRankListResp.MentorRankItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
