package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _EnvelopePortalMessage_ProtoDecoder implements InterfaceC31105CIr<EnvelopePortalMessage> {
    @Override // X.InterfaceC31105CIr
    public final EnvelopePortalMessage LIZ(Q9H q9h) {
        EnvelopePortalMessage envelopePortalMessage = new EnvelopePortalMessage();
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
                                    envelopePortalMessage.portalDisplay = q9h.LJIIJ();
                                }
                            } else {
                                envelopePortalMessage.portalView = q9h.LJIIJ();
                            }
                        } else {
                            envelopePortalMessage.portalTransTarget = _EnvelopePortalMessage_PortalTransTarget_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        envelopePortalMessage.portalInfo = _EnvelopePortalMessage_PortalInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    envelopePortalMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return envelopePortalMessage;
            }
        }
    }
}
