package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import java.util.ArrayList;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import webcast.data.cohost_biz._BizPermitJoinGroupResponse_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _PermitJoinGroupResp_ProtoDecoder implements InterfaceC31105CIr<PermitJoinGroupResp> {
    @Override // X.InterfaceC31105CIr
    public final PermitJoinGroupResp LIZ(Q9H q9h) {
        PermitJoinGroupResp permitJoinGroupResp = new PermitJoinGroupResp();
        permitJoinGroupResp.groupRtcInfo = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 9527) {
                                Q9J.LIZJ(q9h);
                            } else {
                                permitJoinGroupResp.cohostRespExtra = _BizPermitJoinGroupResponse_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            permitJoinGroupResp.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        permitJoinGroupResp.groupRtcInfo.add(_RTCExtraInfo_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    permitJoinGroupResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return permitJoinGroupResp;
            }
        }
    }
}
