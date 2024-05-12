package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ApplyParams_ProtoDecoder implements InterfaceC31105CIr<ApplyParams> {
    @Override // X.InterfaceC31105CIr
    public final ApplyParams LIZ(Q9H q9h) {
        ApplyParams applyParams = new ApplyParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        applyParams.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        applyParams.linkType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        applyParams.guestSupportedVendor = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        applyParams.guestSupportedLayout = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        applyParams.payedMoney = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        applyParams.linkDuration = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        applyParams.position = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 8:
                        applyParams.layout = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 9:
                        applyParams.anchorId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 10:
                        applyParams.requiredMicIdx = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return applyParams;
            }
        }
    }
}
