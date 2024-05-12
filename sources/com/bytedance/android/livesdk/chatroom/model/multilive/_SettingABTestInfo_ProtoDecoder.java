package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SettingABTestInfo_ProtoDecoder implements InterfaceC31105CIr<SettingABTestInfo> {
    @Override // X.InterfaceC31105CIr
    public final SettingABTestInfo LIZ(Q9H q9h) {
        SettingABTestInfo settingABTestInfo = new SettingABTestInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    settingABTestInfo.useNewLayoutSetting = Boolean.valueOf(Q9J.LIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return settingABTestInfo;
            }
        }
    }
}
