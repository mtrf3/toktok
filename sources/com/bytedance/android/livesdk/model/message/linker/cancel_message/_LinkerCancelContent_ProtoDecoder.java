package com.bytedance.android.livesdk.model.message.linker.cancel_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerCancelContent_ProtoDecoder implements InterfaceC31105CIr<LinkerCancelContent> {
    public static LinkerCancelContent LIZIZ(Q9H q9h) {
        LinkerCancelContent linkerCancelContent = new LinkerCancelContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            linkerCancelContent.cancelType = (int) q9h.LJIIJJI();
                        }
                    } else {
                        linkerCancelContent.inviteeUid = q9h.LJIIJJI();
                    }
                } else {
                    linkerCancelContent.inviterUid = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerCancelContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerCancelContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
