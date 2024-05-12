package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _SingleBrowserInfo_ProtoDecoder implements InterfaceC31105CIr<SingleBrowserInfo> {
    public static SingleBrowserInfo LIZIZ(Q9H q9h) {
        SingleBrowserInfo singleBrowserInfo = new SingleBrowserInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        singleBrowserInfo.coverRatio = Double.longBitsToDouble(q9h.LJIIIZ());
                    }
                } else {
                    singleBrowserInfo.url = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return singleBrowserInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SingleBrowserInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
