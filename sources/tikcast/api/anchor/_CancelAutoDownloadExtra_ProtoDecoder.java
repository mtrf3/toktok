package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CancelAutoDownloadExtra_ProtoDecoder implements InterfaceC31105CIr<CancelAutoDownloadExtra> {
    public static CancelAutoDownloadExtra LIZIZ(Q9H q9h) {
        CancelAutoDownloadExtra cancelAutoDownloadExtra = new CancelAutoDownloadExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    cancelAutoDownloadExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return cancelAutoDownloadExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CancelAutoDownloadExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}