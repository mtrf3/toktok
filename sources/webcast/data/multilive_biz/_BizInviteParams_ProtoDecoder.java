package webcast.data.multilive_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizInviteParams_ProtoDecoder implements InterfaceC31105CIr<BizInviteParams> {
    @Override // X.InterfaceC31105CIr
    public final BizInviteParams LIZ(Q9H q9h) {
        BizInviteParams bizInviteParams = new BizInviteParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizInviteParams.source = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizInviteParams;
            }
        }
    }
}
