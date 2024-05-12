package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _CaptionMessage_ProtoDecoder implements InterfaceC31105CIr<CaptionMessage> {
    @Override // X.InterfaceC31105CIr
    public final CaptionMessage LIZ(Q9H q9h) {
        CaptionMessage captionMessage = new CaptionMessage();
        captionMessage.content = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                captionMessage.content.add(_CaptionContent_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            captionMessage.durationMs = q9h.LJIIJJI();
                        }
                    } else {
                        captionMessage.timestampMs = q9h.LJIIJJI();
                    }
                } else {
                    captionMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return captionMessage;
            }
        }
    }
}
