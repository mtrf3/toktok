package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;
import webcast.data.cohost_biz._BizPermitJoinGroupParams_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _PermitJoinGroupReq_ProtoDecoder implements InterfaceC31105CIr<PermitJoinGroupReq> {
    @Override // X.InterfaceC31105CIr
    public final PermitJoinGroupReq LIZ(Q9H q9h) {
        PermitJoinGroupReq permitJoinGroupReq = new PermitJoinGroupReq();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 9527) {
                    switch (LJI) {
                        case 1:
                            permitJoinGroupReq.common = _LinkCommon_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 2:
                            permitJoinGroupReq.type = q9h.LJIIJ();
                            break;
                        case 3:
                            permitJoinGroupReq.myself = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 4:
                            permitJoinGroupReq.joinUser = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 5:
                            permitJoinGroupReq.status = q9h.LJIIJ();
                            break;
                        case 6:
                            permitJoinGroupReq.groupChannelId = q9h.LJIIJJI();
                            break;
                        default:
                            Q9J.LIZJ(q9h);
                            break;
                    }
                } else {
                    permitJoinGroupReq.cohostReqExtra = _BizPermitJoinGroupParams_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return permitJoinGroupReq;
            }
        }
    }
}
