package webcast.api.creator;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PushStreamInfo_ProtoDecoder implements InterfaceC31105CIr<PushStreamInfo> {
    public static PushStreamInfo LIZIZ(Q9H q9h) {
        PushStreamInfo pushStreamInfo = new PushStreamInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    pushStreamInfo.sdkParams = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return pushStreamInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PushStreamInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
