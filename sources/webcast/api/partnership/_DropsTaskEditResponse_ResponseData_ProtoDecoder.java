package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.partnership.DropsTaskEditResponse;

/* loaded from: classes17.dex */
public final class _DropsTaskEditResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<DropsTaskEditResponse.ResponseData> {
    public static DropsTaskEditResponse.ResponseData LIZIZ(Q9H q9h) {
        DropsTaskEditResponse.ResponseData responseData = new DropsTaskEditResponse.ResponseData();
        responseData.results = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.results.add(_DropsTaskEditResponse_TaskResult_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DropsTaskEditResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
