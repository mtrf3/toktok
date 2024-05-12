package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.privilege.QuitFansClubResponse;

/* loaded from: classes14.dex */
public final class _QuitFansClubResponse_QuitResp_ProtoDecoder implements InterfaceC31105CIr<QuitFansClubResponse.QuitResp> {
    @Override // X.InterfaceC31105CIr
    public final QuitFansClubResponse.QuitResp LIZ(Q9H q9h) {
        QuitFansClubResponse.QuitResp quitResp = new QuitFansClubResponse.QuitResp();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return quitResp;
    }
}
