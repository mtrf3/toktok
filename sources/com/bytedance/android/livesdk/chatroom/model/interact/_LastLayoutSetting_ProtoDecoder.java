package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LastLayoutSetting_ProtoDecoder implements InterfaceC31105CIr<LastLayoutSetting> {
    public static LastLayoutSetting LIZIZ(Q9H q9h) {
        LastLayoutSetting lastLayoutSetting = new LastLayoutSetting();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        lastLayoutSetting.layoutId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    lastLayoutSetting.scene = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return lastLayoutSetting;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LastLayoutSetting LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
