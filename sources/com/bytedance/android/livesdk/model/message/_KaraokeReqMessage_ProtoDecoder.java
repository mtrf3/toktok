package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;
import webcast.data._ReqSong_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _KaraokeReqMessage_ProtoDecoder implements InterfaceC31105CIr<KaraokeReqMessage> {
    @Override // X.InterfaceC31105CIr
    public final KaraokeReqMessage LIZ(Q9H q9h) {
        KaraokeReqMessage karaokeReqMessage = new KaraokeReqMessage();
        karaokeReqMessage.songList = new ArrayList();
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
                                karaokeReqMessage.reqTimestampSeconds = q9h.LJIIJJI();
                            }
                        } else {
                            karaokeReqMessage.totalReqCount = q9h.LJIIJJI();
                        }
                    } else {
                        karaokeReqMessage.songList.add(_ReqSong_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    karaokeReqMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeReqMessage;
            }
        }
    }
}
