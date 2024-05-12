package webcast.data.multilive_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizChangeLayoutParams_ProtoDecoder implements InterfaceC31105CIr<BizChangeLayoutParams> {
    public static BizChangeLayoutParams LIZIZ(Q9H q9h) {
        BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizChangeLayoutParams.displayId = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizChangeLayoutParams;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizChangeLayoutParams LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
