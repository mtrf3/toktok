package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CreateTimerRequest_ProtoDecoder implements InterfaceC31105CIr<CreateTimerRequest> {
    @Override // X.InterfaceC31105CIr
    public final CreateTimerRequest LIZ(Q9H q9h) {
        CreateTimerRequest createTimerRequest = new CreateTimerRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        createTimerRequest.startCountdownTimeS = q9h.LJIIJJI();
                        break;
                    case 2:
                        createTimerRequest.title = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        createTimerRequest.timeIncreasePerSubS = q9h.LJIIJJI();
                        break;
                    case 4:
                        createTimerRequest.timeIncreaseCapS = q9h.LJIIJJI();
                        break;
                    case 5:
                        createTimerRequest.timerStatus = q9h.LJIIJ();
                        break;
                    case 6:
                        createTimerRequest.roomId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return createTimerRequest;
            }
        }
    }
}
