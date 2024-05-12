package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _PermitApplyContent_ProtoDecoder implements InterfaceC31105CIr<PermitApplyContent> {
    public static PermitApplyContent LIZIZ(Q9H q9h) {
        PermitApplyContent permitApplyContent = new PermitApplyContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        permitApplyContent.approver = _Player_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        permitApplyContent.approverLinkMicId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        permitApplyContent.positionData = _MicPositionData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        permitApplyContent.replyStatus = q9h.LJIIJ();
                        break;
                    case 5:
                        permitApplyContent.dsl = _DSLConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        permitApplyContent.applier = _Player_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        permitApplyContent.operator = _Player_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        permitApplyContent.applierLinkMicId = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return permitApplyContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermitApplyContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
