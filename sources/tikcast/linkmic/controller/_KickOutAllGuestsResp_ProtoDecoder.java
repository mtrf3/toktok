package tikcast.linkmic.controller;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _KickOutAllGuestsResp_ProtoDecoder implements InterfaceC31105CIr<KickOutAllGuestsResp> {
    @Override // X.InterfaceC31105CIr
    public final KickOutAllGuestsResp LIZ(Q9H q9h) {
        KickOutAllGuestsResp kickOutAllGuestsResp = new KickOutAllGuestsResp();
        kickOutAllGuestsResp.removedUserIds = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        C29991Fr.LIZ(q9h, kickOutAllGuestsResp.removedUserIds);
                    }
                } else {
                    kickOutAllGuestsResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return kickOutAllGuestsResp;
            }
        }
    }
}
