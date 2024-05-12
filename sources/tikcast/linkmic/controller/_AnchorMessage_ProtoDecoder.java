package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _AnchorMessage_ProtoDecoder implements InterfaceC31105CIr<AnchorMessage> {
    public static AnchorMessage LIZIZ(Q9H q9h) {
        AnchorMessage anchorMessage = new AnchorMessage();
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
                                    anchorMessage.source = q9h.LJIIJ();
                                }
                            } else {
                                anchorMessage.status = q9h.LJIIJ();
                            }
                        } else {
                            anchorMessage.rtcStatus = q9h.LJIIJ();
                        }
                    } else {
                        anchorMessage.linkMicId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    anchorMessage.uid = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
