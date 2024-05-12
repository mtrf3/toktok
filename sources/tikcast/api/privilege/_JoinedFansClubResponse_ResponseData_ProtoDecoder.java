package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.privilege.JoinedFansClubResponse;

/* loaded from: classes17.dex */
public final class _JoinedFansClubResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<JoinedFansClubResponse.ResponseData> {
    public static JoinedFansClubResponse.ResponseData LIZIZ(Q9H q9h) {
        JoinedFansClubResponse.ResponseData responseData = new JoinedFansClubResponse.ResponseData();
        responseData.fansClubs = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                responseData.total = q9h.LJIIJJI();
                            }
                        } else {
                            responseData.hasMore = Q9J.LIZ(q9h);
                        }
                    } else {
                        responseData.nextOffset = q9h.LJIIJJI();
                    }
                } else {
                    responseData.fansClubs.add(_JoinedFansClubResponse_FansClub_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final JoinedFansClubResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
