package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _RoomExtra_ProtoDecoder implements InterfaceC31105CIr<RoomExtra> {
    @Override // X.InterfaceC31105CIr
    public final RoomExtra LIZ(Q9H q9h) {
        RoomExtra roomExtra = new RoomExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        roomExtra.deprecated1 = _EnterRegionMatch_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    roomExtra.isSandbox = Boolean.valueOf(Q9J.LIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return roomExtra;
            }
        }
    }
}
