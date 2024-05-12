package webcast.api.game_station;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DownloadRequest_ProtoDecoder implements InterfaceC31105CIr<DownloadRequest> {
    @Override // X.InterfaceC31105CIr
    public final DownloadRequest LIZ(Q9H q9h) {
        DownloadRequest downloadRequest = new DownloadRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        downloadRequest.scene = q9h.LJIIJ();
                        break;
                    case 2:
                        downloadRequest.srcId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        downloadRequest.siteId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        downloadRequest.gameId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        downloadRequest.androidId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        downloadRequest.adId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        downloadRequest.idfv = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        downloadRequest.ua = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return downloadRequest;
            }
        }
    }
}
