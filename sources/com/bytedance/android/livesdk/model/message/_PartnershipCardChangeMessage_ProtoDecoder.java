package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _PartnershipCardChangeMessage_ProtoDecoder implements InterfaceC31105CIr<PartnershipCardChangeMessage> {
    @Override // X.InterfaceC31105CIr
    public final PartnershipCardChangeMessage LIZ(Q9H q9h) {
        PartnershipCardChangeMessage partnershipCardChangeMessage = new PartnershipCardChangeMessage();
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
                                partnershipCardChangeMessage.taskId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            partnershipCardChangeMessage.sequenceId = Integer.valueOf(q9h.LJIIJ());
                        }
                    } else {
                        partnershipCardChangeMessage.changeMode = q9h.LJIIJ();
                    }
                } else {
                    partnershipCardChangeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipCardChangeMessage;
            }
        }
    }
}
