package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _PunishInfo_ProtoDecoder implements InterfaceC31105CIr<PunishInfo> {
    public static PunishInfo LIZIZ(Q9H q9h) {
        PunishInfo punishInfo = new PunishInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        punishInfo.punishEventInfo = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    punishInfo.punishText = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return punishInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PunishInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
