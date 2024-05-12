package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _LinkmicSettingResult_ProtoDecoder implements InterfaceC31105CIr<LinkmicSettingResult> {
    public static LinkmicSettingResult LIZIZ(Q9H q9h) {
        LinkmicSettingResult linkmicSettingResult = new LinkmicSettingResult();
        linkmicSettingResult.settings = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 102) {
                    if (LJI != 200) {
                        Q9J.LIZJ(q9h);
                    } else {
                        linkmicSettingResult.settings.add(_LinkmicSettingmodel_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    linkmicSettingResult.linkMIcAbParams = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkmicSettingResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkmicSettingResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
