package webcast.data.cohost_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizLeaveJoinGroupResponse_ProtoDecoder implements InterfaceC31105CIr<BizLeaveJoinGroupResponse> {
    public static BizLeaveJoinGroupResponse LIZIZ(Q9H q9h) {
        BizLeaveJoinGroupResponse bizLeaveJoinGroupResponse = new BizLeaveJoinGroupResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizLeaveJoinGroupResponse.feedbackShowReason = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizLeaveJoinGroupResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizLeaveJoinGroupResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
