package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _FrameInfo_ProtoDecoder implements InterfaceC31105CIr<FrameInfo> {
    public static FrameInfo LIZIZ(Q9H q9h) {
        FrameInfo frameInfo = new FrameInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        frameInfo.timestamp = q9h.LJIIJJI();
                    }
                } else {
                    frameInfo.frameImgUrl = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return frameInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FrameInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
