package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkmicSettingmodel_ProtoDecoder implements InterfaceC31105CIr<LinkmicSettingmodel> {
    public static LinkmicSettingmodel LIZIZ(Q9H q9h) {
        LinkmicSettingmodel linkmicSettingmodel = new LinkmicSettingmodel();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        linkmicSettingmodel.value = q9h.LJIIJ();
                    }
                } else {
                    linkmicSettingmodel.key = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkmicSettingmodel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkmicSettingmodel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
