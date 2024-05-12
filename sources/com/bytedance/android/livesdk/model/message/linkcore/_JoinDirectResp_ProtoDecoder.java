package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizJoinDirectResponse_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _JoinDirectResp_ProtoDecoder implements InterfaceC31105CIr<JoinDirectResp> {
    @Override // X.InterfaceC31105CIr
    public final JoinDirectResp LIZ(Q9H q9h) {
        JoinDirectResp joinDirectResp = new JoinDirectResp();
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
                                        joinDirectResp.multiGuestRespExtra = _BizJoinDirectResponse_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    joinDirectResp.allUsers = _AllListUser_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                joinDirectResp.position = _MicPositionData_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            joinDirectResp.selfLinkMicId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        joinDirectResp.rtcInfo = _RTCExtraInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    joinDirectResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return joinDirectResp;
            }
        }
    }
}
