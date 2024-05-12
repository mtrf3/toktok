package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import tikcast.linkmic.common._PositionConfig_ProtoDecoder;
import webcast.data.multilive_biz._BizChangeLayoutParams_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ChangeLayoutReq_ProtoDecoder implements InterfaceC31105CIr<ChangeLayoutReq> {
    @Override // X.InterfaceC31105CIr
    public final ChangeLayoutReq LIZ(Q9H q9h) {
        ChangeLayoutReq changeLayoutReq = new ChangeLayoutReq();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 9527) {
                    switch (LJI) {
                        case 1:
                            changeLayoutReq.common = _LinkCommon_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 2:
                            changeLayoutReq.myself = _Player_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 3:
                            changeLayoutReq.channelId = q9h.LJIIJJI();
                            break;
                        case 4:
                            changeLayoutReq.posConfig = _PositionConfig_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 5:
                            changeLayoutReq.layoutId = Q9J.LIZIZ(q9h);
                            break;
                        case 6:
                            changeLayoutReq.sceneVersion = q9h.LJIIJ();
                            break;
                        default:
                            Q9J.LIZJ(q9h);
                            break;
                    }
                } else {
                    changeLayoutReq.multiGuestReqExtra = _BizChangeLayoutParams_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return changeLayoutReq;
            }
        }
    }
}
