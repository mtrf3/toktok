package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FeatureCheckResult_ProtoDecoder implements InterfaceC31105CIr<FeatureCheckResult> {
    public static FeatureCheckResult LIZIZ(Q9H q9h) {
        FeatureCheckResult featureCheckResult = new FeatureCheckResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        featureCheckResult.featureStatus = q9h.LJIIJ();
                    }
                } else {
                    featureCheckResult.featureType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return featureCheckResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FeatureCheckResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
