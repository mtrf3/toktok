package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PunishEventInfo_ProtoDecoder implements InterfaceC31105CIr<PunishEventInfo> {
    public static PunishEventInfo LIZIZ(Q9H q9h) {
        PunishEventInfo punishEventInfo = new PunishEventInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        punishEventInfo.punishType = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        punishEventInfo.punishReason = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        punishEventInfo.punishId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        punishEventInfo.violationUid = q9h.LJIIJJI();
                        break;
                    case 5:
                        punishEventInfo.punishTypeId = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 6:
                        punishEventInfo.duration = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        punishEventInfo.punishPerceptionCode = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        punishEventInfo.endTime = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return punishEventInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PunishEventInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
