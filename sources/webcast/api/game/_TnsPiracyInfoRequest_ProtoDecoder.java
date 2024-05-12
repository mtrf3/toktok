package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class _TnsPiracyInfoRequest_ProtoDecoder implements InterfaceC31105CIr<TnsPiracyInfoRequest> {
    @Override // X.InterfaceC31105CIr
    public final TnsPiracyInfoRequest LIZ(Q9H q9h) {
        TnsPiracyInfoRequest tnsPiracyInfoRequest = new TnsPiracyInfoRequest();
        tnsPiracyInfoRequest.details = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 101:
                        tnsPiracyInfoRequest.details.add(_TnsPiracyDetail_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 102:
                        tnsPiracyInfoRequest.roomId = q9h.LJIIJJI();
                        break;
                    case 103:
                        tnsPiracyInfoRequest.userId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return tnsPiracyInfoRequest;
            }
        }
    }
}
