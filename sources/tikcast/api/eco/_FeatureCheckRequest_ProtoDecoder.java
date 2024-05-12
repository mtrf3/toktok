package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class _FeatureCheckRequest_ProtoDecoder implements InterfaceC31105CIr<FeatureCheckRequest> {
    @Override // X.InterfaceC31105CIr
    public final FeatureCheckRequest LIZ(Q9H q9h) {
        FeatureCheckRequest featureCheckRequest = new FeatureCheckRequest();
        featureCheckRequest.featureList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            featureCheckRequest.isFailRetry = Q9J.LIZ(q9h);
                        }
                    } else {
                        featureCheckRequest.featureList.add(Integer.valueOf(q9h.LJIIJ()));
                    }
                } else {
                    featureCheckRequest.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return featureCheckRequest;
            }
        }
    }
}
