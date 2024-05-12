package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _LiveInfo_ProtoDecoder implements InterfaceC31105CIr<LiveInfo> {
    public static LiveInfo LIZIZ(Q9H q9h) {
        LiveInfo liveInfo = new LiveInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        liveInfo.roomId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    liveInfo.onLive = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
