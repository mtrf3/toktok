package webcast.data.cohost_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizPermitJoinGroupParams_ProtoDecoder implements InterfaceC31105CIr<BizPermitJoinGroupParams> {
    public static BizPermitJoinGroupParams LIZIZ(Q9H q9h) {
        BizPermitJoinGroupParams bizPermitJoinGroupParams = new BizPermitJoinGroupParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        bizPermitJoinGroupParams.sourceType = q9h.LJIIJ();
                    }
                } else {
                    bizPermitJoinGroupParams.replyStatus = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizPermitJoinGroupParams;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizPermitJoinGroupParams LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
