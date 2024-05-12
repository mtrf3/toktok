package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.api._SubPinCard_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SubPinEventMessage_ProtoDecoder implements InterfaceC31105CIr<SubPinEventMessage> {
    @Override // X.InterfaceC31105CIr
    public final SubPinEventMessage LIZ(Q9H q9h) {
        SubPinEventMessage subPinEventMessage = new SubPinEventMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                subPinEventMessage.operatorUserId = q9h.LJIIJJI();
                            }
                        } else {
                            subPinEventMessage.card = _SubPinCard_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        subPinEventMessage.actionType = q9h.LJIIJ();
                    }
                } else {
                    subPinEventMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subPinEventMessage;
            }
        }
    }
}
