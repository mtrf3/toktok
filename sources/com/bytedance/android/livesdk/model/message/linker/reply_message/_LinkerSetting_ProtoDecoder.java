package com.bytedance.android.livesdk.model.message.linker.reply_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerSetting_ProtoDecoder implements InterfaceC31105CIr<LinkerSetting> {
    public static LinkerSetting LIZIZ(Q9H q9h) {
        LinkerSetting linkerSetting = new LinkerSetting();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkerSetting.maxMemberLimit = q9h.LJIIJJI();
                        break;
                    case 2:
                        linkerSetting.linkType = q9h.LJIIJJI();
                        break;
                    case 3:
                        linkerSetting.scene = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        linkerSetting.ownerUid = q9h.LJIIJJI();
                        break;
                    case 5:
                        linkerSetting.ownerRoomId = q9h.LJIIJJI();
                        break;
                    case 6:
                        linkerSetting.vendor = (int) q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerSetting;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerSetting LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
