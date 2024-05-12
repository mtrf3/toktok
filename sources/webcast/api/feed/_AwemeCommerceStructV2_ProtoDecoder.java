package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AwemeCommerceStructV2_ProtoDecoder implements InterfaceC31105CIr<AwemeCommerceStructV2> {
    public static AwemeCommerceStructV2 LIZIZ(Q9H q9h) {
        AwemeCommerceStructV2 awemeCommerceStructV2 = new AwemeCommerceStructV2();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 17) {
                    if (LJI != 18) {
                        Q9J.LIZJ(q9h);
                    } else {
                        awemeCommerceStructV2.pseudoAdData = _PseudoAdData_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    awemeCommerceStructV2.isPseudoAd = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return awemeCommerceStructV2;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AwemeCommerceStructV2 LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
