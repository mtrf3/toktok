package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;

/* loaded from: classes14.dex */
public final class _SubPinCard_Text_ProtoDecoder implements InterfaceC31105CIr<SubPinCard.Text> {
    public static SubPinCard.Text LIZIZ(Q9H q9h) {
        SubPinCard.Text text = new SubPinCard.Text();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        text.content = Q9J.LIZIZ(q9h);
                    }
                } else {
                    text.type = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return text;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubPinCard.Text LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
