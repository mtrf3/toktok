package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _VideoInfo_ProtoDecoder implements InterfaceC31105CIr<VideoInfo> {
    public static VideoInfo LIZIZ(Q9H q9h) {
        VideoInfo videoInfo = new VideoInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    videoInfo.resolution = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return videoInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final VideoInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
