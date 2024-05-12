package com.bytedance.android.livesdk.game.model;

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
                switch (LJI) {
                    case 1:
                        videoInfo.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        videoInfo.height = q9h.LJIIJ();
                        break;
                    case 3:
                        videoInfo.width = q9h.LJIIJ();
                        break;
                    case 4:
                        videoInfo.durationTs = q9h.LJIIJ();
                        break;
                    case 5:
                        videoInfo.videoCover = _UrlInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        videoInfo.playAddr = _UrlInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        videoInfo.desc = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
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
