package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _ControlMessage_Extra_ProtoDecoder implements InterfaceC31105CIr<ControlMessage.Extra> {
    public static ControlMessage.Extra LIZIZ(Q9H q9h) {
        ControlMessage.Extra extra = new ControlMessage.Extra();
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
                                extra.violationReason = _Text_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            extra.title = _Text_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        extra.reasonNo = q9h.LJIIJJI();
                    }
                } else {
                    extra.banInfoUrl = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return extra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ControlMessage.Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
