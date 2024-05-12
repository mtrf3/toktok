package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ViolationFeedbackDetail_ProtoDecoder implements InterfaceC31105CIr<ViolationFeedbackDetail> {
    public static ViolationFeedbackDetail LIZIZ(Q9H q9h) {
        ViolationFeedbackDetail violationFeedbackDetail = new ViolationFeedbackDetail();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        violationFeedbackDetail.content = Q9J.LIZIZ(q9h);
                    }
                } else {
                    violationFeedbackDetail.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return violationFeedbackDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ViolationFeedbackDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
