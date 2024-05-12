package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;
import webcast.data._MsgFilter_ProtoDecoder;
import webcast.data._UserIdentity_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _EmoteChatMessage_ProtoDecoder implements InterfaceC31105CIr<EmoteChatMessage> {
    @Override // X.InterfaceC31105CIr
    public final EmoteChatMessage LIZ(Q9H q9h) {
        EmoteChatMessage emoteChatMessage = new EmoteChatMessage();
        emoteChatMessage.emoteList = new ArrayList();
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
                                    emoteChatMessage.userIdentity = _UserIdentity_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                emoteChatMessage.msgFilter = _MsgFilter_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            emoteChatMessage.emoteList.add(_EmoteModel_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        emoteChatMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    emoteChatMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return emoteChatMessage;
            }
        }
    }
}
