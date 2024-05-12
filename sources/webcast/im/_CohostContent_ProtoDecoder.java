package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _CohostContent_ProtoDecoder implements InterfaceC31105CIr<CohostContent> {
    public static CohostContent LIZIZ(Q9H q9h) {
        CohostContent cohostContent = new CohostContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 11) {
                            Q9J.LIZJ(q9h);
                        } else {
                            cohostContent.listChangeBizContent = _ListChangeBizContent_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        cohostContent.permitJoinGroupBizContent = _PermitJoinGroupBizContent_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    cohostContent.joinGroupBizContent = _JoinGroupBizContent_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cohostContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CohostContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
