package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ViolationRecord_ProtoDecoder implements InterfaceC31105CIr<ViolationRecord> {
    public static ViolationRecord LIZIZ(Q9H q9h) {
        ViolationRecord violationRecord = new ViolationRecord();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        violationRecord.violationId = q9h.LJIIJJI();
                        break;
                    case 2:
                        violationRecord.liveInfo = _ViolationRecordLiveInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        violationRecord.punishInfo = _ViolationRecordPunishInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        violationRecord.canFeedback = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        violationRecord.hasFeedback = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        violationRecord.submittedFeedbackDetailId = q9h.LJIIJJI();
                        break;
                    case 7:
                        violationRecord.violationIdStr = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return violationRecord;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ViolationRecord LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
