package com.bytedance.android.livesdk.gift.assets;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _VideoResource_ProtoDecoder implements InterfaceC31105CIr<VideoResource> {
    public static VideoResource LIZIZ(Q9H q9h) {
        VideoResource videoResource = new VideoResource();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            videoResource.videoMd5 = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        videoResource.videoUrl = _ResourceModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    videoResource.videoTypeName = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return videoResource;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final VideoResource LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
