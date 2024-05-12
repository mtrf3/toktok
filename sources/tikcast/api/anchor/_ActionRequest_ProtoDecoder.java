package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _ActionRequest_ProtoDecoder implements InterfaceC31105CIr<ActionRequest> {
    @Override // X.InterfaceC31105CIr
    public final ActionRequest LIZ(Q9H q9h) {
        ActionRequest actionRequest = new ActionRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        actionRequest.action = q9h.LJIIJ();
                    }
                } else {
                    actionRequest.actionType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return actionRequest;
            }
        }
    }
}
