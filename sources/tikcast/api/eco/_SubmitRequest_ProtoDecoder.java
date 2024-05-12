package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _SubmitRequest_ProtoDecoder implements InterfaceC31105CIr<SubmitRequest> {
    @Override // X.InterfaceC31105CIr
    public final SubmitRequest LIZ(Q9H q9h) {
        SubmitRequest submitRequest = new SubmitRequest();
        submitRequest.answers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        submitRequest.detectorUserId = q9h.LJIIJJI();
                        break;
                    case 2:
                        submitRequest.anchorId = q9h.LJIIJJI();
                        break;
                    case 3:
                        submitRequest.roomId = q9h.LJIIJJI();
                        break;
                    case 4:
                        submitRequest.reportTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        submitRequest.screenshotUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        submitRequest.answers.add(_Answer_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return submitRequest;
            }
        }
    }
}
