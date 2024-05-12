package com.bytedance.android.livesdk.model.message;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _EffectPreloadingMessage_ProtoDecoder implements InterfaceC31105CIr<EffectPreloadingMessage> {
    @Override // X.InterfaceC31105CIr
    public final EffectPreloadingMessage LIZ(Q9H q9h) {
        EffectPreloadingMessage effectPreloadingMessage = new EffectPreloadingMessage();
        effectPreloadingMessage.giftId = new ArrayList();
        effectPreloadingMessage.effectId = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 14) {
                                if (LJI != 16) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    effectPreloadingMessage.logId = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                effectPreloadingMessage.priority = _GiftIMPriority_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            C29991Fr.LIZ(q9h, effectPreloadingMessage.effectId);
                        }
                    } else {
                        C29991Fr.LIZ(q9h, effectPreloadingMessage.giftId);
                    }
                } else {
                    effectPreloadingMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return effectPreloadingMessage;
            }
        }
    }
}
