package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _UpdateTimerRequest_ProtoDecoder implements InterfaceC31105CIr<UpdateTimerRequest> {
    @Override // X.InterfaceC31105CIr
    public final UpdateTimerRequest LIZ(Q9H q9h) {
        UpdateTimerRequest updateTimerRequest = new UpdateTimerRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        updateTimerRequest.type = q9h.LJIIJ();
                        break;
                    case 2:
                        updateTimerRequest.timerId = q9h.LJIIJJI();
                        break;
                    case 3:
                        updateTimerRequest.title = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        updateTimerRequest.opType = q9h.LJIIJ();
                        break;
                    case 5:
                        updateTimerRequest.stickerX = q9h.LJIIJJI();
                        break;
                    case 6:
                        updateTimerRequest.stickerY = q9h.LJIIJJI();
                        break;
                    case 7:
                        updateTimerRequest.screenW = q9h.LJIIJJI();
                        break;
                    case 8:
                        updateTimerRequest.screenH = q9h.LJIIJJI();
                        break;
                    case 9:
                        updateTimerRequest.roomId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return updateTimerRequest;
            }
        }
    }
}
