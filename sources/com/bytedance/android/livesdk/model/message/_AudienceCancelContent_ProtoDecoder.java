package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _AudienceCancelContent_ProtoDecoder implements InterfaceC31105CIr<AudienceCancelContent> {
    public static AudienceCancelContent LIZIZ(Q9H q9h) {
        AudienceCancelContent audienceCancelContent = new AudienceCancelContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        audienceCancelContent.user = _User_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    audienceCancelContent.fromUserId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return audienceCancelContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AudienceCancelContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
