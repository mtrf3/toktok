package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FeatureCheckResponse_ProtoDecoder implements InterfaceC31105CIr<FeatureCheckResponse> {
    @Override // X.InterfaceC31105CIr
    public final FeatureCheckResponse LIZ(Q9H q9h) {
        FeatureCheckResponse featureCheckResponse = new FeatureCheckResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        featureCheckResponse.extra = _FeatureCheckResponse_ResponseExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    featureCheckResponse.data = _FeatureCheckResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return featureCheckResponse;
            }
        }
    }
}
