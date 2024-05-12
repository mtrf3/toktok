package webcast.data.cohost_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizLeaveJoinGroupParams_ProtoDecoder implements InterfaceC31105CIr<BizLeaveJoinGroupParams> {
    public static BizLeaveJoinGroupParams LIZIZ(Q9H q9h) {
        BizLeaveJoinGroupParams bizLeaveJoinGroupParams = new BizLeaveJoinGroupParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizLeaveJoinGroupParams.notSuggestToUid = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizLeaveJoinGroupParams;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizLeaveJoinGroupParams LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
