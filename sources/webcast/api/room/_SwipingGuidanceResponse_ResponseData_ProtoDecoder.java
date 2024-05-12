package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.room.SwipingGuidanceResponse;

/* loaded from: classes6.dex */
public final class _SwipingGuidanceResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<SwipingGuidanceResponse.ResponseData> {
    public static SwipingGuidanceResponse.ResponseData LIZIZ(Q9H q9h) {
        SwipingGuidanceResponse.ResponseData responseData = new SwipingGuidanceResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.isTargetOldAudience = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SwipingGuidanceResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
