package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _VideoLiveGoodsRcmdMessage_ProtoDecoder implements InterfaceC31105CIr<VideoLiveGoodsRcmdMessage> {
    @Override // X.InterfaceC31105CIr
    public final VideoLiveGoodsRcmdMessage LIZ(Q9H q9h) {
        VideoLiveGoodsRcmdMessage videoLiveGoodsRcmdMessage = new VideoLiveGoodsRcmdMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        videoLiveGoodsRcmdMessage.rcmdGoodsId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    videoLiveGoodsRcmdMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return videoLiveGoodsRcmdMessage;
            }
        }
    }
}
