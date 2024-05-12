package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _NotifyHighlightContent_ProtoDecoder implements InterfaceC31105CIr<NotifyHighlightContent> {
    public static NotifyHighlightContent LIZIZ(Q9H q9h) {
        NotifyHighlightContent notifyHighlightContent = new NotifyHighlightContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        notifyHighlightContent.needHighlight = Q9J.LIZ(q9h);
                    }
                } else {
                    notifyHighlightContent.content = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return notifyHighlightContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final NotifyHighlightContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
