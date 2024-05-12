package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _AnchorReplayDeleteRequest_ProtoDecoder implements InterfaceC31105CIr<AnchorReplayDeleteRequest> {
    @Override // X.InterfaceC31105CIr
    public final AnchorReplayDeleteRequest LIZ(Q9H q9h) {
        AnchorReplayDeleteRequest anchorReplayDeleteRequest = new AnchorReplayDeleteRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    anchorReplayDeleteRequest.replayId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorReplayDeleteRequest;
            }
        }
    }
}
