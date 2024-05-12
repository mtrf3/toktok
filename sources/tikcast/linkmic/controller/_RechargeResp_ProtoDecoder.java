package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._MicPositionData_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import java.util.ArrayList;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import webcast.data.cohost_biz._BizRechargeResponse_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _RechargeResp_ProtoDecoder implements InterfaceC31105CIr<RechargeResp> {
    @Override // X.InterfaceC31105CIr
    public final RechargeResp LIZ(Q9H q9h) {
        RechargeResp rechargeResp = new RechargeResp();
        rechargeResp.groupExtInfo = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 9527) {
                    switch (LJI) {
                        case 1:
                            rechargeResp.myInfo = _RTCExtraInfo_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 2:
                            rechargeResp.myLinkmicId = Q9J.LIZIZ(q9h);
                            break;
                        case 3:
                            rechargeResp.targetLinkmicId = Q9J.LIZIZ(q9h);
                            break;
                        case 4:
                            rechargeResp.targetPos = _MicPositionData_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 5:
                            rechargeResp.groupExtInfo.add(_RTCExtraInfo_ProtoDecoder.LIZIZ(q9h));
                            break;
                        case 6:
                            rechargeResp.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 7:
                            rechargeResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                            break;
                        default:
                            Q9J.LIZJ(q9h);
                            break;
                    }
                } else {
                    rechargeResp.cohostRespExtra = _BizRechargeResponse_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rechargeResp;
            }
        }
    }
}
