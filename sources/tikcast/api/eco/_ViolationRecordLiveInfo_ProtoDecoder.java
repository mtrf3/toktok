package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ViolationRecordLiveInfo_ProtoDecoder implements InterfaceC31105CIr<ViolationRecordLiveInfo> {
    public static ViolationRecordLiveInfo LIZIZ(Q9H q9h) {
        ViolationRecordLiveInfo violationRecordLiveInfo = new ViolationRecordLiveInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                violationRecordLiveInfo.roomId = q9h.LJIIJJI();
                            }
                        } else {
                            violationRecordLiveInfo.coverUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        violationRecordLiveInfo.startTime = q9h.LJIIJJI();
                    }
                } else {
                    violationRecordLiveInfo.title = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return violationRecordLiveInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ViolationRecordLiveInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
