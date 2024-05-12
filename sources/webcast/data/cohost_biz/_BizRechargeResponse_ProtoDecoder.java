package webcast.data.cohost_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizRechargeResponse_ProtoDecoder implements InterfaceC31105CIr<BizRechargeResponse> {
    public static BizRechargeResponse LIZIZ(Q9H q9h) {
        BizRechargeResponse bizRechargeResponse = new BizRechargeResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizRechargeResponse.data = _BizRechargeResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bizRechargeResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizRechargeResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
