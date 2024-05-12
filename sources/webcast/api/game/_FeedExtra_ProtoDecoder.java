package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FeedExtra_ProtoDecoder implements InterfaceC31105CIr<FeedExtra> {
    public static FeedExtra LIZIZ(Q9H q9h) {
        FeedExtra feedExtra = new FeedExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        feedExtra.hasMore = Q9J.LIZ(q9h);
                    }
                } else {
                    feedExtra.logPb = _FeedExtra_LogPb_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return feedExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FeedExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
