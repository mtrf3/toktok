package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _MGetABInfosReq_ProtoDecoder implements InterfaceC31105CIr<MGetABInfosReq> {
    @Override // X.InterfaceC31105CIr
    public final MGetABInfosReq LIZ(Q9H q9h) {
        MGetABInfosReq mGetABInfosReq = new MGetABInfosReq();
        mGetABInfosReq.cdidList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    mGetABInfosReq.cdidList.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return mGetABInfosReq;
            }
        }
    }
}
