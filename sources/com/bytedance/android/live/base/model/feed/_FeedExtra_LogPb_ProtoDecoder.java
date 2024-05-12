package com.bytedance.android.live.base.model.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.feed.FeedExtra;

/* loaded from: classes.dex */
public final class _FeedExtra_LogPb_ProtoDecoder implements InterfaceC31105CIr<FeedExtra.LogPb> {
    public static FeedExtra.LogPb LIZIZ(Q9H q9h) {
        FeedExtra.LogPb logPb = new FeedExtra.LogPb();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        logPb.sessionId = q9h.LJIIJJI();
                    }
                } else {
                    logPb.content = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return logPb;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FeedExtra.LogPb LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
