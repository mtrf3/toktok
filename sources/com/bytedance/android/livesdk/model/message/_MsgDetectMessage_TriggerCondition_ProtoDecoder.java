package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.MsgDetectMessage;

/* loaded from: classes14.dex */
public final class _MsgDetectMessage_TriggerCondition_ProtoDecoder implements InterfaceC31105CIr<MsgDetectMessage.TriggerCondition> {
    public static MsgDetectMessage.TriggerCondition LIZIZ(Q9H q9h) {
        MsgDetectMessage.TriggerCondition triggerCondition = new MsgDetectMessage.TriggerCondition();
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
                                    triggerCondition.httpOptimize = Boolean.valueOf(Q9J.LIZ(q9h));
                                }
                            } else {
                                triggerCondition.detectRoomMsg = Boolean.valueOf(Q9J.LIZ(q9h));
                            }
                        } else {
                            triggerCondition.detectP2PMsg = Boolean.valueOf(Q9J.LIZ(q9h));
                        }
                    } else {
                        triggerCondition.uplinkDetectWebsocket = Boolean.valueOf(Q9J.LIZ(q9h));
                    }
                } else {
                    triggerCondition.uplinkDetectHTTP = Boolean.valueOf(Q9J.LIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return triggerCondition;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MsgDetectMessage.TriggerCondition LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
