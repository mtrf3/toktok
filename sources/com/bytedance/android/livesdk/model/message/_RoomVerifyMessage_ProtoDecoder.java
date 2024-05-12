package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _RoomVerifyMessage_ProtoDecoder implements InterfaceC31105CIr<RoomVerifyMessage> {
    @Override // X.InterfaceC31105CIr
    public final RoomVerifyMessage LIZ(Q9H q9h) {
        RoomVerifyMessage roomVerifyMessage = new RoomVerifyMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    roomVerifyMessage.closeRoom = Boolean.valueOf(Q9J.LIZ(q9h));
                                }
                            } else {
                                roomVerifyMessage.noticeType = Long.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            roomVerifyMessage.content = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        roomVerifyMessage.verifyAction = q9h.LJIIJ();
                    }
                } else {
                    roomVerifyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return roomVerifyMessage;
            }
        }
    }
}
