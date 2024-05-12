package webcast.data.multilive_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizResumeParams_ProtoDecoder implements InterfaceC31105CIr<BizResumeParams> {
    public static BizResumeParams LIZIZ(Q9H q9h) {
        BizResumeParams bizResumeParams = new BizResumeParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizResumeParams.needShowInfo = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bizResumeParams;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizResumeParams LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
