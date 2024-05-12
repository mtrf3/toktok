package com.bytedance.android.livesdk.replay.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _VideoMetaInfo_ProtoDecoder implements InterfaceC31105CIr<VideoMetaInfo> {
    public static VideoMetaInfo LIZIZ(Q9H q9h) {
        VideoMetaInfo videoMetaInfo = new VideoMetaInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    videoMetaInfo.duration = Float.intBitsToFloat(q9h.LJIIIIZZ());
                                }
                            } else {
                                videoMetaInfo.size = q9h.LJIIJJI();
                            }
                        } else {
                            videoMetaInfo.width = q9h.LJIIJJI();
                        }
                    } else {
                        videoMetaInfo.height = q9h.LJIIJJI();
                    }
                } else {
                    videoMetaInfo.url = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return videoMetaInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final VideoMetaInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
