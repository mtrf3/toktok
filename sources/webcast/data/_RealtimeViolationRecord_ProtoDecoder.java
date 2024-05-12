package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _RealtimeViolationRecord_ProtoDecoder implements InterfaceC31105CIr<RealtimeViolationRecord> {
    public static RealtimeViolationRecord LIZIZ(Q9H q9h) {
        RealtimeViolationRecord realtimeViolationRecord = new RealtimeViolationRecord();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        realtimeViolationRecord.startTime = q9h.LJIIJJI();
                        break;
                    case 2:
                        realtimeViolationRecord.endTime = q9h.LJIIJJI();
                        break;
                    case 3:
                        realtimeViolationRecord.title = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        realtimeViolationRecord.reason = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        realtimeViolationRecord.suggestion = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        realtimeViolationRecord.type = q9h.LJIIJ();
                        break;
                    case 7:
                        realtimeViolationRecord.punishInfo = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        realtimeViolationRecord.status = q9h.LJIIJ();
                        break;
                    case 9:
                        realtimeViolationRecord.appealInfo = _AppealInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        realtimeViolationRecord.issueTimeText = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return realtimeViolationRecord;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RealtimeViolationRecord LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
