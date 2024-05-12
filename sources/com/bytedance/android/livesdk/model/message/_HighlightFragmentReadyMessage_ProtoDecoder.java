package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._GameLiveFragment_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _HighlightFragmentReadyMessage_ProtoDecoder implements InterfaceC31105CIr<HighlightFragmentReadyMessage> {
    @Override // X.InterfaceC31105CIr
    public final HighlightFragmentReadyMessage LIZ(Q9H q9h) {
        HighlightFragmentReadyMessage highlightFragmentReadyMessage = new HighlightFragmentReadyMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        highlightFragmentReadyMessage.gameLiveFragment = _GameLiveFragment_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    highlightFragmentReadyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return highlightFragmentReadyMessage;
            }
        }
    }
}
