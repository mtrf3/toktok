package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _PermitJoinGroupBizContent_ProtoDecoder implements InterfaceC31105CIr<PermitJoinGroupBizContent> {
    public static PermitJoinGroupBizContent LIZIZ(Q9H q9h) {
        PermitJoinGroupBizContent permitJoinGroupBizContent = new PermitJoinGroupBizContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        permitJoinGroupBizContent.sourceType = q9h.LJIIJ();
                    }
                } else {
                    permitJoinGroupBizContent.replyStatus = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return permitJoinGroupBizContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermitJoinGroupBizContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
