package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _OpenLsNotifyInfo_ProtoDecoder implements InterfaceC31105CIr<OpenLsNotifyInfo> {
    public static OpenLsNotifyInfo LIZIZ(Q9H q9h) {
        OpenLsNotifyInfo openLsNotifyInfo = new OpenLsNotifyInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        openLsNotifyInfo.openLsNotifyWindow = Q9J.LIZ(q9h);
                    }
                } else {
                    openLsNotifyInfo.fitLiveStudioRule = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return openLsNotifyInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OpenLsNotifyInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
