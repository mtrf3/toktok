package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ComponentTaskProcess_ProtoDecoder implements InterfaceC31105CIr<ComponentTaskProcess> {
    public static ComponentTaskProcess LIZIZ(Q9H q9h) {
        ComponentTaskProcess componentTaskProcess = new ComponentTaskProcess();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        componentTaskProcess.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        componentTaskProcess.type = q9h.LJIIJ();
                        break;
                    case 3:
                        componentTaskProcess.target = q9h.LJIIJ();
                        break;
                    case 4:
                        componentTaskProcess.order = q9h.LJIIJJI();
                        break;
                    case 5:
                        componentTaskProcess.scene = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        componentTaskProcess.finishedNum = q9h.LJIIJJI();
                        break;
                    case 7:
                        componentTaskProcess.targetNum = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return componentTaskProcess;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ComponentTaskProcess LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
