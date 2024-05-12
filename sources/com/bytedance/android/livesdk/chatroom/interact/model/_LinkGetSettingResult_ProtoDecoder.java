package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkGetSettingResult_ProtoDecoder implements InterfaceC31105CIr<LinkGetSettingResult> {
    public static LinkGetSettingResult LIZIZ(Q9H q9h) {
        LinkGetSettingResult linkGetSettingResult = new LinkGetSettingResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    linkGetSettingResult.settings = _AnchorLinkmicUserSettings_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkGetSettingResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkGetSettingResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
