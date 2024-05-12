package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _AudienceReserveContent_ProtoDecoder implements InterfaceC31105CIr<AudienceReserveContent> {
    public static AudienceReserveContent LIZIZ(Q9H q9h) {
        AudienceReserveContent audienceReserveContent = new AudienceReserveContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        audienceReserveContent.user = _User_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    audienceReserveContent.fromUserId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return audienceReserveContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AudienceReserveContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
