package com.bytedance.android.livesdk.model.message;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _ImDeleteMessage_ProtoDecoder implements InterfaceC31105CIr<ImDeleteMessage> {
    @Override // X.InterfaceC31105CIr
    public final ImDeleteMessage LIZ(Q9H q9h) {
        ImDeleteMessage imDeleteMessage = new ImDeleteMessage();
        imDeleteMessage.deleteMsgIds = new ArrayList();
        imDeleteMessage.deleteUserIds = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            C29991Fr.LIZ(q9h, imDeleteMessage.deleteUserIds);
                        }
                    } else {
                        C29991Fr.LIZ(q9h, imDeleteMessage.deleteMsgIds);
                    }
                } else {
                    imDeleteMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return imDeleteMessage;
            }
        }
    }
}
