package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import webcast.data.cohost_biz._BizLeaveJoinGroupResponse_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LeaveJoinGroupResp_ProtoDecoder implements InterfaceC31105CIr<LeaveJoinGroupResp> {
    @Override // X.InterfaceC31105CIr
    public final LeaveJoinGroupResp LIZ(Q9H q9h) {
        LeaveJoinGroupResp leaveJoinGroupResp = new LeaveJoinGroupResp();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 9527) {
                        Q9J.LIZJ(q9h);
                    } else {
                        leaveJoinGroupResp.cohostBizResp = _BizLeaveJoinGroupResponse_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    leaveJoinGroupResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return leaveJoinGroupResp;
            }
        }
    }
}
