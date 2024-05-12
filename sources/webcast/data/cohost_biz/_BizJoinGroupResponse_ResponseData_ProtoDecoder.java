package webcast.data.cohost_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import webcast.data.cohost_biz.BizJoinGroupResponse;

/* loaded from: classes14.dex */
public final class _BizJoinGroupResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BizJoinGroupResponse.ResponseData> {
    public static BizJoinGroupResponse.ResponseData LIZIZ(Q9H q9h) {
        BizJoinGroupResponse.ResponseData responseData = new BizJoinGroupResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.perceptionMessage = _PerceptionMessage_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.perceptionStatus = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizJoinGroupResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
