package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _WaveReward_ProtoDecoder implements InterfaceC31105CIr<WaveReward> {
    public static WaveReward LIZIZ(Q9H q9h) {
        WaveReward waveReward = new WaveReward();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    waveReward.emote = _EmoteModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return waveReward;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final WaveReward LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
