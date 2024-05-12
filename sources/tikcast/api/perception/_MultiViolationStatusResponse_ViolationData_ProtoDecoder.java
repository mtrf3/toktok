package tikcast.api.perception;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PerceptionDialogInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import tikcast.api.perception.MultiViolationStatusResponse;

/* loaded from: classes6.dex */
public final class _MultiViolationStatusResponse_ViolationData_ProtoDecoder implements InterfaceC31105CIr<MultiViolationStatusResponse.ViolationData> {
    public static MultiViolationStatusResponse.ViolationData LIZIZ(Q9H q9h) {
        MultiViolationStatusResponse.ViolationData violationData = new MultiViolationStatusResponse.ViolationData();
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
                                    violationData.punishEvent = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                violationData.perceptionDialog = _PerceptionDialogInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            violationData.endTime = q9h.LJIIJJI();
                        }
                    } else {
                        violationData.status = q9h.LJIIJ();
                    }
                } else {
                    violationData.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return violationData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiViolationStatusResponse.ViolationData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
