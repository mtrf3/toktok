package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _RoomAuthMessage_ProtoDecoder implements InterfaceC31105CIr<RoomAuthMessage> {
    public static RoomAuthMessage LIZIZ(Q9H q9h) {
        RoomAuthMessage roomAuthMessage = new RoomAuthMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        roomAuthMessage.promoteOtherMessage = _PromoteOtherMessage_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    roomAuthMessage.goldenEnvelope = _RoomAuthMessageGoldenEnvelope_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return roomAuthMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomAuthMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
