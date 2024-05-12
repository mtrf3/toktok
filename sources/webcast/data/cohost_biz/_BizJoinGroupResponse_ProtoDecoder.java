package webcast.data.cohost_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizJoinGroupResponse_ProtoDecoder implements InterfaceC31105CIr<BizJoinGroupResponse> {
    public static BizJoinGroupResponse LIZIZ(Q9H q9h) {
        BizJoinGroupResponse bizJoinGroupResponse = new BizJoinGroupResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizJoinGroupResponse.data = _BizJoinGroupResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bizJoinGroupResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizJoinGroupResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
