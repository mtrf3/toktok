package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _QuickChatListMessage_ProtoDecoder implements InterfaceC31105CIr<QuickChatListMessage> {
    @Override // X.InterfaceC31105CIr
    public final QuickChatListMessage LIZ(Q9H q9h) {
        QuickChatListMessage quickChatListMessage = new QuickChatListMessage();
        quickChatListMessage.contentList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    quickChatListMessage.scene = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                quickChatListMessage.priority = q9h.LJIIJJI();
                            }
                        } else {
                            quickChatListMessage.contentList.add(_QuickChatContent_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        quickChatListMessage.duration = q9h.LJIIJJI();
                    }
                } else {
                    quickChatListMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return quickChatListMessage;
            }
        }
    }
}
