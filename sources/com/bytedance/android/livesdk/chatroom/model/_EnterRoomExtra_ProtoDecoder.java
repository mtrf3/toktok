package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _EnterRoomExtra_ProtoDecoder implements InterfaceC31105CIr<EnterRoomExtra> {
    @Override // X.InterfaceC31105CIr
    public final EnterRoomExtra LIZ(Q9H q9h) {
        EnterRoomExtra enterRoomExtra = new EnterRoomExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 4:
                        enterRoomExtra.isOfficialChannel = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        enterRoomExtra.region = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        enterRoomExtra.isSameAppLanguage = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        enterRoomExtra.finishedPerceptionMsg = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        enterRoomExtra.punishInfo = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        enterRoomExtra.now = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return enterRoomExtra;
            }
        }
    }
}
