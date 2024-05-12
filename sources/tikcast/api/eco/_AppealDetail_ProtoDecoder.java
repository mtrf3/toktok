package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _AppealDetail_ProtoDecoder implements InterfaceC31105CIr<AppealDetail> {
    public static AppealDetail LIZIZ(Q9H q9h) {
        AppealDetail appealDetail = new AppealDetail();
        appealDetail.violationReason = new ArrayList();
        appealDetail.rankDetails = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        appealDetail.status = q9h.LJIIJ();
                        break;
                    case 2:
                        appealDetail.violationReason.add(Q9J.LIZIZ(q9h));
                        break;
                    case 3:
                        appealDetail.penaltyTime = q9h.LJIIJJI();
                        break;
                    case 4:
                        appealDetail.restoreTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        appealDetail.isAppealed = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        appealDetail.showAppealButton = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        appealDetail.userId = q9h.LJIIJJI();
                        break;
                    case 8:
                        appealDetail.scene = q9h.LJIIJJI();
                        break;
                    case 9:
                        appealDetail.subfeatureName = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        appealDetail.violationType = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        appealDetail.rankDetails.add(_RankDetail_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return appealDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AppealDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
