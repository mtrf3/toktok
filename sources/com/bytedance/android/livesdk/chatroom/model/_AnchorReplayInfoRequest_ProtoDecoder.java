package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AnchorReplayInfoRequest_ProtoDecoder implements InterfaceC31105CIr<AnchorReplayInfoRequest> {
    @Override // X.InterfaceC31105CIr
    public final AnchorReplayInfoRequest LIZ(Q9H q9h) {
        AnchorReplayInfoRequest anchorReplayInfoRequest = new AnchorReplayInfoRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        anchorReplayInfoRequest.needPromotionRule = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        anchorReplayInfoRequest.roomIds = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        anchorReplayInfoRequest.offset = q9h.LJIIJJI();
                        break;
                    case 4:
                        anchorReplayInfoRequest.count = q9h.LJIIJJI();
                        break;
                    case 5:
                        anchorReplayInfoRequest.needSuffix = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        anchorReplayInfoRequest.needNoDelay = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorReplayInfoRequest;
            }
        }
    }
}
