package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;
import webcast.data.cohost_biz._BizJoinGroupParams_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _JoinGroupReq_ProtoDecoder implements InterfaceC31105CIr<JoinGroupReq> {
    @Override // X.InterfaceC31105CIr
    public final JoinGroupReq LIZ(Q9H q9h) {
        JoinGroupReq joinGroupReq = new JoinGroupReq();
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
                                        joinGroupReq.cohostReqExtra = _BizJoinGroupParams_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    joinGroupReq.groupChannelId = q9h.LJIIJJI();
                                }
                            } else {
                                joinGroupReq.type = q9h.LJIIJ();
                            }
                        } else {
                            joinGroupReq.target = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        joinGroupReq.myself = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    joinGroupReq.common = _LinkCommon_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return joinGroupReq;
            }
        }
    }
}
