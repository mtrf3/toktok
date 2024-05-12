package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _ShowTaskResponse_ProtoDecoder implements InterfaceC31105CIr<ShowTaskResponse> {
    @Override // X.InterfaceC31105CIr
    public final ShowTaskResponse LIZ(Q9H q9h) {
        ShowTaskResponse showTaskResponse = new ShowTaskResponse();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return showTaskResponse;
    }
}
