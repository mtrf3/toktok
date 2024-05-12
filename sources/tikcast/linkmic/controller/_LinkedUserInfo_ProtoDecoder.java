package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkedUserInfo_ProtoDecoder implements InterfaceC31105CIr<LinkedUserInfo> {
    public static LinkedUserInfo LIZIZ(Q9H q9h) {
        LinkedUserInfo linkedUserInfo = new LinkedUserInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            linkedUserInfo.channelId = q9h.LJIIJJI();
                        }
                    } else {
                        linkedUserInfo.userId = q9h.LJIIJJI();
                    }
                } else {
                    linkedUserInfo.layoutId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkedUserInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkedUserInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
