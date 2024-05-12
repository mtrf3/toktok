package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RulesAndGuidanceContentDetail_ProtoDecoder implements InterfaceC31105CIr<RulesAndGuidanceContentDetail> {
    public static RulesAndGuidanceContentDetail LIZIZ(Q9H q9h) {
        RulesAndGuidanceContentDetail rulesAndGuidanceContentDetail = new RulesAndGuidanceContentDetail();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rulesAndGuidanceContentDetail.contentId = q9h.LJIIJJI();
                        break;
                    case 2:
                        rulesAndGuidanceContentDetail.imageUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        rulesAndGuidanceContentDetail.title = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        rulesAndGuidanceContentDetail.subTitle = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        rulesAndGuidanceContentDetail.linkUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        rulesAndGuidanceContentDetail.canFeedback = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        rulesAndGuidanceContentDetail.hasFeedback = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rulesAndGuidanceContentDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RulesAndGuidanceContentDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
