package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _CohostReserveMessage_ProtoDecoder implements InterfaceC31105CIr<CohostReserveMessage> {
    @Override // X.InterfaceC31105CIr
    public final CohostReserveMessage LIZ(Q9H q9h) {
        CohostReserveMessage cohostReserveMessage = new CohostReserveMessage();
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
                                    cohostReserveMessage.replyContent = _ReplyContent_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                cohostReserveMessage.reserveContent = _ReserveContent_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            cohostReserveMessage.reservationId = q9h.LJIIJJI();
                        }
                    } else {
                        cohostReserveMessage.reserveType = q9h.LJIIJ();
                    }
                } else {
                    cohostReserveMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cohostReserveMessage;
            }
        }
    }
}
