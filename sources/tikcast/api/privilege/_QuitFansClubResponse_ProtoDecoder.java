package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.privilege.QuitFansClubResponse;

/* loaded from: classes14.dex */
public final class _QuitFansClubResponse_ProtoDecoder implements InterfaceC31105CIr<QuitFansClubResponse> {
    @Override // X.InterfaceC31105CIr
    public final QuitFansClubResponse LIZ(Q9H q9h) {
        QuitFansClubResponse quitFansClubResponse = new QuitFansClubResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    QuitFansClubResponse.QuitResp quitResp = new QuitFansClubResponse.QuitResp();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    quitFansClubResponse.data = quitResp;
                }
            } else {
                q9h.LJ(LIZJ);
                return quitFansClubResponse;
            }
        }
    }
}
