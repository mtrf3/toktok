package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class _BrowserInfo_ProtoDecoder implements InterfaceC31105CIr<BrowserInfo> {
    public static BrowserInfo LIZIZ(Q9H q9h) {
        BrowserInfo browserInfo = new BrowserInfo();
        browserInfo.singleBrowserInfo = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        browserInfo.totalCoverRatio = Double.longBitsToDouble(q9h.LJIIIZ());
                    }
                } else {
                    browserInfo.singleBrowserInfo.add(_SingleBrowserInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return browserInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BrowserInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
