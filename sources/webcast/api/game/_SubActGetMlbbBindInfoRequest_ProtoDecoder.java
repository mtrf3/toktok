package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubActGetMlbbBindInfoRequest_ProtoDecoder implements InterfaceC31105CIr<SubActGetMlbbBindInfoRequest> {
    @Override // X.InterfaceC31105CIr
    public final SubActGetMlbbBindInfoRequest LIZ(Q9H q9h) {
        SubActGetMlbbBindInfoRequest subActGetMlbbBindInfoRequest = new SubActGetMlbbBindInfoRequest();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return subActGetMlbbBindInfoRequest;
    }
}
