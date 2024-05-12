package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _Setting_ProtoDecoder implements InterfaceC31105CIr<Setting> {
    @Override // X.InterfaceC31105CIr
    public final Setting LIZ(Q9H q9h) {
        Setting setting = new Setting();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        setting.layout = q9h.LJIIJ();
                        break;
                    case 2:
                        setting.fixMicNum = q9h.LJIIJ();
                        break;
                    case 3:
                        setting.allowRequestFromUser = q9h.LJIIJ();
                        break;
                    case 4:
                        setting.allowRequestFromFollowerOnly = q9h.LJIIJ();
                        break;
                    case 5:
                        setting.backgroundStickerId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        setting.applierSortSetting = q9h.LJIIJ();
                        break;
                    case 7:
                        setting.applierGiftScoreThreshold = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return setting;
            }
        }
    }
}
