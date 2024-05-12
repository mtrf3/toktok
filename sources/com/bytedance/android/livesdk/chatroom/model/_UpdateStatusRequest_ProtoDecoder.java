package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _UpdateStatusRequest_ProtoDecoder implements InterfaceC31105CIr<UpdateStatusRequest> {
    @Override // X.InterfaceC31105CIr
    public final UpdateStatusRequest LIZ(Q9H q9h) {
        UpdateStatusRequest updateStatusRequest = new UpdateStatusRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        updateStatusRequest.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        updateStatusRequest.streamId = q9h.LJIIJJI();
                        break;
                    case 3:
                        updateStatusRequest.status = q9h.LJIIJJI();
                        break;
                    case 4:
                        updateStatusRequest.reasonNo = q9h.LJIIJJI();
                        break;
                    case 5:
                        updateStatusRequest.source = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        updateStatusRequest.frameRate = q9h.LJIIJJI();
                        break;
                    case 7:
                        updateStatusRequest.bitRate = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return updateStatusRequest;
            }
        }
    }
}
