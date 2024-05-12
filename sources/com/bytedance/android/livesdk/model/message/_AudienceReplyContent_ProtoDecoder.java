package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _AudienceReplyContent_ProtoDecoder implements InterfaceC31105CIr<AudienceReplyContent> {
    public static AudienceReplyContent LIZIZ(Q9H q9h) {
        AudienceReplyContent audienceReplyContent = new AudienceReplyContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    audienceReplyContent.fromUserId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return audienceReplyContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AudienceReplyContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
