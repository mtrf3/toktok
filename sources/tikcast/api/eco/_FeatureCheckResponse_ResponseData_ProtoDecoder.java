package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.eco.FeatureCheckResponse;

/* loaded from: classes17.dex */
public final class _FeatureCheckResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<FeatureCheckResponse.ResponseData> {
    public static FeatureCheckResponse.ResponseData LIZIZ(Q9H q9h) {
        FeatureCheckResponse.ResponseData responseData = new FeatureCheckResponse.ResponseData();
        responseData.resultList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.resultList.add(_FeatureCheckResult_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FeatureCheckResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
