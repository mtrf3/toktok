package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import tikcast.api.privilege.JoinedFansClubResponse;

/* loaded from: classes17.dex */
public final class _JoinedFansClubResponse_FansClub_ProtoDecoder implements InterfaceC31105CIr<JoinedFansClubResponse.FansClub> {
    public static JoinedFansClubResponse.FansClub LIZIZ(Q9H q9h) {
        JoinedFansClubResponse.FansClub fansClub = new JoinedFansClubResponse.FansClub();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 9) {
                                Q9J.LIZJ(q9h);
                            } else {
                                fansClub.roomId = q9h.LJIIJJI();
                            }
                        } else {
                            fansClub.fansLevel = q9h.LJIIJJI();
                        }
                    } else {
                        fansClub.fansClubName = Q9J.LIZIZ(q9h);
                    }
                } else {
                    fansClub.anchor = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansClub;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final JoinedFansClubResponse.FansClub LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
