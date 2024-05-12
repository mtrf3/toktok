package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _ChangeLayoutResp_ProtoDecoder implements InterfaceC31105CIr<ChangeLayoutResp> {
    @Override // X.InterfaceC31105CIr
    public final ChangeLayoutResp LIZ(Q9H q9h) {
        ChangeLayoutResp changeLayoutResp = new ChangeLayoutResp();
        changeLayoutResp.userPosition = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        changeLayoutResp.userPosition.add(_UserPosition_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    changeLayoutResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return changeLayoutResp;
            }
        }
    }
}
