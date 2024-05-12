package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;
import webcast.data.cohost_biz._BizLeaveJoinGroupParams_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LeaveJoinGroupReq_ProtoDecoder implements InterfaceC31105CIr<LeaveJoinGroupReq> {
    @Override // X.InterfaceC31105CIr
    public final LeaveJoinGroupReq LIZ(Q9H q9h) {
        LeaveJoinGroupReq leaveJoinGroupReq = new LeaveJoinGroupReq();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    if (LJI != 9527) {
                                        Q9J.LIZJ(q9h);
                                    } else {
                                        leaveJoinGroupReq.cohostReqExtra = _BizLeaveJoinGroupParams_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    leaveJoinGroupReq.curGroupChannelId = q9h.LJIIJJI();
                                }
                            } else {
                                leaveJoinGroupReq.groupChannelId = q9h.LJIIJJI();
                            }
                        } else {
                            leaveJoinGroupReq.leaver = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        leaveJoinGroupReq.myself = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    leaveJoinGroupReq.common = _LinkCommon_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return leaveJoinGroupReq;
            }
        }
    }
}
