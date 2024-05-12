package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._DonationSticker_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _DecorationModifyMessage_ProtoDecoder implements InterfaceC31105CIr<DecorationModifyMessage> {
    @Override // X.InterfaceC31105CIr
    public final DecorationModifyMessage LIZ(Q9H q9h) {
        DecorationModifyMessage decorationModifyMessage = new DecorationModifyMessage();
        decorationModifyMessage.decorationList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        decorationModifyMessage.decorationList.add(_DonationSticker_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    decorationModifyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return decorationModifyMessage;
            }
        }
    }
}
