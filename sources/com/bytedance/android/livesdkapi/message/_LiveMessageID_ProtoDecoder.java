package com.bytedance.android.livesdkapi.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _LiveMessageID_ProtoDecoder implements InterfaceC31105CIr<LiveMessageID> {
    public static LiveMessageID LIZIZ(Q9H q9h) {
        LiveMessageID liveMessageID = new LiveMessageID();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        liveMessageID.messageScene = Q9J.LIZIZ(q9h);
                    }
                } else {
                    liveMessageID.primaryID = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveMessageID;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveMessageID LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
