package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ChannelMessage_ProtoDecoder implements InterfaceC31105CIr<ChannelMessage> {
    public static ChannelMessage LIZIZ(Q9H q9h) {
        ChannelMessage channelMessage = new ChannelMessage();
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
                                channelMessage.layout_version = q9h.LJIIJ();
                            }
                        } else {
                            channelMessage.layoutId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        channelMessage.reportType = q9h.LJIIJ();
                    }
                } else {
                    channelMessage.channelId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return channelMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ChannelMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
