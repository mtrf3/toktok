package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _PreloadRoomParams_ProtoDecoder implements InterfaceC31105CIr<PreloadRoomParams> {
    @Override // X.InterfaceC31105CIr
    public final PreloadRoomParams LIZ(Q9H q9h) {
        PreloadRoomParams preloadRoomParams = new PreloadRoomParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            preloadRoomParams.scene = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        preloadRoomParams.ownerUserId = q9h.LJIIJJI();
                    }
                } else {
                    preloadRoomParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return preloadRoomParams;
            }
        }
    }
}
