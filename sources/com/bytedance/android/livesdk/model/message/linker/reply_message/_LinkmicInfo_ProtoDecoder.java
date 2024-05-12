package com.bytedance.android.livesdk.model.message.linker.reply_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkmicInfo_ProtoDecoder implements InterfaceC31105CIr<LinkmicInfo> {
    public static LinkmicInfo LIZIZ(Q9H q9h) {
        LinkmicInfo linkmicInfo = new LinkmicInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkmicInfo.accessKey = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        linkmicInfo.linkmicId = q9h.LJIIJJI();
                        break;
                    case 3:
                        linkmicInfo.joinable = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        linkmicInfo.confluenceType = q9h.LJIIJ();
                        break;
                    case 5:
                        linkmicInfo.rtcExtInfo = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        linkmicInfo.rtcAppId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        linkmicInfo.rtcAppSign = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        linkmicInfo.linkmicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        linkmicInfo.vendor = (int) q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkmicInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkmicInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
