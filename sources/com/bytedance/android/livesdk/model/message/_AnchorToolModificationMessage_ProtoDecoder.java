package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _AnchorToolModificationMessage_ProtoDecoder implements InterfaceC31105CIr<AnchorToolModificationMessage> {
    @Override // X.InterfaceC31105CIr
    public final AnchorToolModificationMessage LIZ(Q9H q9h) {
        AnchorToolModificationMessage anchorToolModificationMessage = new AnchorToolModificationMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        anchorToolModificationMessage.modification = _AnchorToolModification_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    anchorToolModificationMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorToolModificationMessage;
            }
        }
    }
}
