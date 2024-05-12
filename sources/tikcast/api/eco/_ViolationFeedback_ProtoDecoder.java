package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _ViolationFeedback_ProtoDecoder implements InterfaceC31105CIr<ViolationFeedback> {
    public static ViolationFeedback LIZIZ(Q9H q9h) {
        ViolationFeedback violationFeedback = new ViolationFeedback();
        violationFeedback.details = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    violationFeedback.details.add(_ViolationFeedbackDetail_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return violationFeedback;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ViolationFeedback LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
