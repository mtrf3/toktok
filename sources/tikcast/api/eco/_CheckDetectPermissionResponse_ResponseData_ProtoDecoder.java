package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.CheckDetectPermissionResponse;

/* loaded from: classes17.dex */
public final class _CheckDetectPermissionResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<CheckDetectPermissionResponse.ResponseData> {
    public static CheckDetectPermissionResponse.ResponseData LIZIZ(Q9H q9h) {
        CheckDetectPermissionResponse.ResponseData responseData = new CheckDetectPermissionResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.detectorInfo = _CheckDetectPermissionResponse_ResponseData_DetectorInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.status = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CheckDetectPermissionResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
