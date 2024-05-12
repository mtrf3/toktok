package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _UpdateRoomLayoutSettings_ProtoDecoder implements InterfaceC31105CIr<UpdateRoomLayoutSettings> {
    public static UpdateRoomLayoutSettings LIZIZ(Q9H q9h) {
        UpdateRoomLayoutSettings updateRoomLayoutSettings = new UpdateRoomLayoutSettings();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    updateRoomLayoutSettings.rtcExtInfo = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return updateRoomLayoutSettings;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpdateRoomLayoutSettings LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
