package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.AnchorToggleInfoResponse;

/* loaded from: classes6.dex */
public final class _AnchorToggleInfoResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AnchorToggleInfoResponse.ResponseData> {
    public static AnchorToggleInfoResponse.ResponseData LIZIZ(Q9H q9h) {
        AnchorToggleInfoResponse.ResponseData responseData = new AnchorToggleInfoResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.eventCount = q9h.LJIIJ();
                        }
                    } else {
                        responseData.taskCount = q9h.LJIIJ();
                    }
                } else {
                    responseData.status = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorToggleInfoResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
