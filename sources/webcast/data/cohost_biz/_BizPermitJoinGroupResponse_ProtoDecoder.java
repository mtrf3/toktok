package webcast.data.cohost_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.data.cohost_biz.BizPermitJoinGroupResponse;

/* loaded from: classes14.dex */
public final class _BizPermitJoinGroupResponse_ProtoDecoder implements InterfaceC31105CIr<BizPermitJoinGroupResponse> {
    public static BizPermitJoinGroupResponse LIZIZ(Q9H q9h) {
        BizPermitJoinGroupResponse bizPermitJoinGroupResponse = new BizPermitJoinGroupResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    BizPermitJoinGroupResponse.ResponseData responseData = new BizPermitJoinGroupResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    bizPermitJoinGroupResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return bizPermitJoinGroupResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizPermitJoinGroupResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
