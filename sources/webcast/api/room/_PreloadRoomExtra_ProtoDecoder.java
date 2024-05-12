package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _PreloadRoomExtra_ProtoDecoder implements InterfaceC31105CIr<PreloadRoomExtra> {
    public static PreloadRoomExtra LIZIZ(Q9H q9h) {
        PreloadRoomExtra preloadRoomExtra = new PreloadRoomExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        preloadRoomExtra.reason = Q9J.LIZIZ(q9h);
                    }
                } else {
                    preloadRoomExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return preloadRoomExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PreloadRoomExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
