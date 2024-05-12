package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ChannelInfo_ProtoDecoder implements InterfaceC31105CIr<ChannelInfo> {
    public static ChannelInfo LIZIZ(Q9H q9h) {
        ChannelInfo channelInfo = new ChannelInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            channelInfo.dimension = Integer.valueOf(q9h.LJIIJ());
                        }
                    } else {
                        channelInfo.layout = Integer.valueOf(q9h.LJIIJ());
                    }
                } else {
                    channelInfo.vendor = Integer.valueOf(q9h.LJIIJ());
                }
            } else {
                q9h.LJ(LIZJ);
                return channelInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ChannelInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
