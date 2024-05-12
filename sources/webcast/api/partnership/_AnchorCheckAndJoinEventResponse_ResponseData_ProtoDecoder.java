package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.partnership.AnchorCheckAndJoinEventResponse;

/* loaded from: classes16.dex */
public final class _AnchorCheckAndJoinEventResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AnchorCheckAndJoinEventResponse.ResponseData> {
    public static AnchorCheckAndJoinEventResponse.ResponseData LIZIZ(Q9H q9h) {
        AnchorCheckAndJoinEventResponse.ResponseData responseData = new AnchorCheckAndJoinEventResponse.ResponseData();
        responseData.failReasonList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.fansLimit = q9h.LJIIJ();
                        }
                    } else {
                        responseData.failReasonList.add(Integer.valueOf(q9h.LJIIJ()));
                    }
                } else {
                    responseData.joinSuccess = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorCheckAndJoinEventResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
