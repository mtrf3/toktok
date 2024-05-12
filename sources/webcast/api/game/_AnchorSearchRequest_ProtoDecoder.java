package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AnchorSearchRequest_ProtoDecoder implements InterfaceC31105CIr<AnchorSearchRequest> {
    @Override // X.InterfaceC31105CIr
    public final AnchorSearchRequest LIZ(Q9H q9h) {
        AnchorSearchRequest anchorSearchRequest = new AnchorSearchRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        anchorSearchRequest.userId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        anchorSearchRequest.deviceId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        anchorSearchRequest.country = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        anchorSearchRequest.lan = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        anchorSearchRequest.creationId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        anchorSearchRequest.offset = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        anchorSearchRequest.limit = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        anchorSearchRequest.searchContent = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorSearchRequest;
            }
        }
    }
}
