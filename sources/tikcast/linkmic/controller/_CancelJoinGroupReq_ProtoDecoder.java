package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _CancelJoinGroupReq_ProtoDecoder implements InterfaceC31105CIr<CancelJoinGroupReq> {
    @Override // X.InterfaceC31105CIr
    public final CancelJoinGroupReq LIZ(Q9H q9h) {
        CancelJoinGroupReq cancelJoinGroupReq = new CancelJoinGroupReq();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    cancelJoinGroupReq.groupChannelId = q9h.LJIIJJI();
                                }
                            } else {
                                cancelJoinGroupReq.type = q9h.LJIIJ();
                            }
                        } else {
                            cancelJoinGroupReq.target = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        cancelJoinGroupReq.myself = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    cancelJoinGroupReq.common = _LinkCommon_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cancelJoinGroupReq;
            }
        }
    }
}
