package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ApplyContent_ProtoDecoder implements InterfaceC31105CIr<ApplyContent> {
    public static ApplyContent LIZIZ(Q9H q9h) {
        ApplyContent applyContent = new ApplyContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        applyContent.applicantLinkMicId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    applyContent.applicant = _Player_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return applyContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ApplyContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
