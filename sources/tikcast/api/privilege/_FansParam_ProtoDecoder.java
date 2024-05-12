package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FansParam_ProtoDecoder implements InterfaceC31105CIr<FansParam> {
    public static FansParam LIZIZ(Q9H q9h) {
        FansParam fansParam = new FansParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        fansParam.fansLevel = q9h.LJIIJJI();
                    }
                } else {
                    fansParam.anchorId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
