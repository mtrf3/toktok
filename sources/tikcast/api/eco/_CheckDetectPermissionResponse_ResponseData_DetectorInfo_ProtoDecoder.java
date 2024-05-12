package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.CheckDetectPermissionResponse;

/* loaded from: classes17.dex */
public final class _CheckDetectPermissionResponse_ResponseData_DetectorInfo_ProtoDecoder implements InterfaceC31105CIr<CheckDetectPermissionResponse.ResponseData.DetectorInfo> {
    public static CheckDetectPermissionResponse.ResponseData.DetectorInfo LIZIZ(Q9H q9h) {
        CheckDetectPermissionResponse.ResponseData.DetectorInfo detectorInfo = new CheckDetectPermissionResponse.ResponseData.DetectorInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        detectorInfo.detectorEmail = Q9J.LIZIZ(q9h);
                    }
                } else {
                    detectorInfo.detectorId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return detectorInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CheckDetectPermissionResponse.ResponseData.DetectorInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
