package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _KickOutAllGuestsParam_ProtoDecoder implements InterfaceC31105CIr<KickOutAllGuestsParam> {
    @Override // X.InterfaceC31105CIr
    public final KickOutAllGuestsParam LIZ(Q9H q9h) {
        KickOutAllGuestsParam kickOutAllGuestsParam = new KickOutAllGuestsParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            kickOutAllGuestsParam.channelId = q9h.LJIIJJI();
                        }
                    } else {
                        kickOutAllGuestsParam.myself = _Player_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    kickOutAllGuestsParam.common = _LinkCommon_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return kickOutAllGuestsParam;
            }
        }
    }
}
