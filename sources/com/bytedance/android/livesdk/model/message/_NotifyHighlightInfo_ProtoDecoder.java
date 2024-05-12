package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _NotifyHighlightInfo_ProtoDecoder implements InterfaceC31105CIr<NotifyHighlightInfo> {
    public static NotifyHighlightInfo LIZIZ(Q9H q9h) {
        NotifyHighlightInfo notifyHighlightInfo = new NotifyHighlightInfo();
        notifyHighlightInfo.contents = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        notifyHighlightInfo.color = Q9J.LIZIZ(q9h);
                    }
                } else {
                    notifyHighlightInfo.contents.add(_NotifyHighlightContent_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return notifyHighlightInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final NotifyHighlightInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
