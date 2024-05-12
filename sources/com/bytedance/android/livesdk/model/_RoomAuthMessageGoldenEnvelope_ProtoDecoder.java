package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _RoomAuthMessageGoldenEnvelope_ProtoDecoder implements InterfaceC31105CIr<RoomAuthMessageGoldenEnvelope> {
    public static RoomAuthMessageGoldenEnvelope LIZIZ(Q9H q9h) {
        RoomAuthMessageGoldenEnvelope roomAuthMessageGoldenEnvelope = new RoomAuthMessageGoldenEnvelope();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    roomAuthMessageGoldenEnvelope.revokeEndTime = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return roomAuthMessageGoldenEnvelope;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomAuthMessageGoldenEnvelope LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
