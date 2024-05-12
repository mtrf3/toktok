package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _MsgFilter_ProtoDecoder implements InterfaceC31105CIr<MsgFilter> {
    public static MsgFilter LIZIZ(Q9H q9h) {
        MsgFilter msgFilter = new MsgFilter();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        msgFilter.isSubscribedToAnchor = Q9J.LIZ(q9h);
                    }
                } else {
                    msgFilter.isGifter = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return msgFilter;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MsgFilter LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
