package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _BenefitsInfo_ProtoDecoder implements InterfaceC31105CIr<BenefitsInfo> {
    public static BenefitsInfo LIZIZ(Q9H q9h) {
        BenefitsInfo benefitsInfo = new BenefitsInfo();
        benefitsInfo.customizedBenefits = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            benefitsInfo.isDefaultBenefits = Q9J.LIZ(q9h);
                        }
                    } else {
                        benefitsInfo.isSubscribe = Q9J.LIZ(q9h);
                    }
                } else {
                    benefitsInfo.customizedBenefits.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return benefitsInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BenefitsInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
