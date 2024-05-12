package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _ActionResponse_ProtoDecoder implements InterfaceC31105CIr<ActionResponse> {
    @Override // X.InterfaceC31105CIr
    public final ActionResponse LIZ(Q9H q9h) {
        ActionResponse actionResponse = new ActionResponse();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return actionResponse;
    }
}
