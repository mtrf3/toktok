package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _RechargeReq_ProtoDecoder implements InterfaceC31105CIr<RechargeReq> {
    @Override // X.InterfaceC31105CIr
    public final RechargeReq LIZ(Q9H q9h) {
        RechargeReq rechargeReq = new RechargeReq();
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
                                    rechargeReq.type = q9h.LJIIJ();
                                }
                            } else {
                                rechargeReq.target = _Player_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            rechargeReq.myself = _Player_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        rechargeReq.channelId = q9h.LJIIJJI();
                    }
                } else {
                    rechargeReq.common = _LinkCommon_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rechargeReq;
            }
        }
    }
}
