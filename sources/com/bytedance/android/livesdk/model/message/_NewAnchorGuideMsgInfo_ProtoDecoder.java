package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _NewAnchorGuideMsgInfo_ProtoDecoder implements InterfaceC31105CIr<NewAnchorGuideMsgInfo> {
    public static NewAnchorGuideMsgInfo LIZIZ(Q9H q9h) {
        NewAnchorGuideMsgInfo newAnchorGuideMsgInfo = new NewAnchorGuideMsgInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        newAnchorGuideMsgInfo.guideConfig = _NewAnchorGuideConfig_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    newAnchorGuideMsgInfo.messageKey = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return newAnchorGuideMsgInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final NewAnchorGuideMsgInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
