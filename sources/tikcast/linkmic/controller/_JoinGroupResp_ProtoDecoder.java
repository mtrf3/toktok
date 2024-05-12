package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import webcast.data.cohost_biz._BizJoinGroupResponse_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _JoinGroupResp_ProtoDecoder implements InterfaceC31105CIr<JoinGroupResp> {
    @Override // X.InterfaceC31105CIr
    public final JoinGroupResp LIZ(Q9H q9h) {
        JoinGroupResp joinGroupResp = new JoinGroupResp();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 9527) {
                            Q9J.LIZJ(q9h);
                        } else {
                            joinGroupResp.cohostRespExtra = _BizJoinGroupResponse_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        joinGroupResp.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    joinGroupResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return joinGroupResp;
            }
        }
    }
}
