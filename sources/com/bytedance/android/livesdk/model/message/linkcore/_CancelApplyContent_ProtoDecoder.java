package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _CancelApplyContent_ProtoDecoder implements InterfaceC31105CIr<CancelApplyContent> {
    public static CancelApplyContent LIZIZ(Q9H q9h) {
        CancelApplyContent cancelApplyContent = new CancelApplyContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        cancelApplyContent.applicantLinkMicId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    cancelApplyContent.applicant = _Player_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cancelApplyContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CancelApplyContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
