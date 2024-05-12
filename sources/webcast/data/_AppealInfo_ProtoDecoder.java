package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _AppealInfo_ProtoDecoder implements InterfaceC31105CIr<AppealInfo> {
    public static AppealInfo LIZIZ(Q9H q9h) {
        AppealInfo appealInfo = new AppealInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            appealInfo.roomId = q9h.LJIIJJI();
                        }
                    } else {
                        appealInfo.appealStatus = q9h.LJIIJ();
                    }
                } else {
                    appealInfo.showAppeal = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return appealInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AppealInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
