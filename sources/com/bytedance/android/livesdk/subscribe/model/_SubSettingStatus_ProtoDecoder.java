package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubSettingStatus_ProtoDecoder implements InterfaceC31105CIr<SubSettingStatus> {
    public static SubSettingStatus LIZIZ(Q9H q9h) {
        SubSettingStatus subSettingStatus = new SubSettingStatus();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    subSettingStatus.currentStatus = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return subSettingStatus;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubSettingStatus LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
