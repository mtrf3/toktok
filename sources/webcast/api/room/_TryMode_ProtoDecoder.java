package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _TryMode_ProtoDecoder implements InterfaceC31105CIr<TryMode> {
    public static TryMode LIZIZ(Q9H q9h) {
        TryMode tryMode = new TryMode();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            tryMode.liveVideoGroup = q9h.LJIIJ();
                        }
                    } else {
                        tryMode.enableLiveVideo = Q9J.LIZ(q9h);
                    }
                } else {
                    tryMode.hasCreatedRoom = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return tryMode;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TryMode LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
