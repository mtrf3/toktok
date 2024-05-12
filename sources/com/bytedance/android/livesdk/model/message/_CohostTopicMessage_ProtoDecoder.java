package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostTopic_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TopicSessionStatus_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _CohostTopicMessage_ProtoDecoder implements InterfaceC31105CIr<CohostTopicMessage> {
    @Override // X.InterfaceC31105CIr
    public final CohostTopicMessage LIZ(Q9H q9h) {
        CohostTopicMessage cohostTopicMessage = new CohostTopicMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 5) {
                                if (LJI != 6) {
                                    if (LJI != 21) {
                                        Q9J.LIZJ(q9h);
                                    } else {
                                        cohostTopicMessage.sessionStatus = _TopicSessionStatus_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    cohostTopicMessage.heatUpdateContent = _HeatUpdateContent_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                cohostTopicMessage.topicSetContent = _TopicSetContent_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            cohostTopicMessage.topic = _CohostTopic_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        cohostTopicMessage.action = q9h.LJIIJ();
                    }
                } else {
                    cohostTopicMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cohostTopicMessage;
            }
        }
    }
}
