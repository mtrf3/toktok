package webcast.api.game_station;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DownloadResponse_ProtoDecoder implements InterfaceC31105CIr<DownloadResponse> {
    @Override // X.InterfaceC31105CIr
    public final DownloadResponse LIZ(Q9H q9h) {
        DownloadResponse downloadResponse = new DownloadResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    downloadResponse.data = _DownloadResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return downloadResponse;
            }
        }
    }
}
