package webcast.data.cohost_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.data.cohost_biz.BizPermitJoinGroupResponse;

/* loaded from: classes14.dex */
public final class _BizPermitJoinGroupResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BizPermitJoinGroupResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final BizPermitJoinGroupResponse.ResponseData LIZ(Q9H q9h) {
        BizPermitJoinGroupResponse.ResponseData responseData = new BizPermitJoinGroupResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
