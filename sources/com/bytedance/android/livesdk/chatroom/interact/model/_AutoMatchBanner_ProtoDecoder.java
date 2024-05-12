package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _AutoMatchBanner_ProtoDecoder implements InterfaceC31105CIr<AutoMatchBanner> {
    public static AutoMatchBanner LIZIZ(Q9H q9h) {
        AutoMatchBanner autoMatchBanner = new AutoMatchBanner();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            autoMatchBanner.buttonText = _Text_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        autoMatchBanner.subGuideText = _Text_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    autoMatchBanner.mainGuideText = _Text_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return autoMatchBanner;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AutoMatchBanner LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
