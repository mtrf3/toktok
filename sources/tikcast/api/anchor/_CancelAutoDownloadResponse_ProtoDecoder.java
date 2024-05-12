package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CancelAutoDownloadResponse_ProtoDecoder implements InterfaceC31105CIr<CancelAutoDownloadResponse> {
    @Override // X.InterfaceC31105CIr
    public final CancelAutoDownloadResponse LIZ(Q9H q9h) {
        CancelAutoDownloadResponse cancelAutoDownloadResponse = new CancelAutoDownloadResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    cancelAutoDownloadResponse.extra = _CancelAutoDownloadExtra_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cancelAutoDownloadResponse;
            }
        }
    }
}
