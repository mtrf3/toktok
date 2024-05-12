package com.bytedance.android.livesdk.model.message.linker.leave_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerLeaveContent_ProtoDecoder implements InterfaceC31105CIr<LinkerLeaveContent> {
    public static LinkerLeaveContent LIZIZ(Q9H q9h) {
        LinkerLeaveContent linkerLeaveContent = new LinkerLeaveContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                linkerLeaveContent.leaveReason = q9h.LJIIJJI();
                            }
                        } else {
                            linkerLeaveContent.sendLeaveUid = q9h.LJIIJJI();
                        }
                    } else {
                        linkerLeaveContent.linkmic_id_str = Q9J.LIZIZ(q9h);
                    }
                } else {
                    linkerLeaveContent.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerLeaveContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerLeaveContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
