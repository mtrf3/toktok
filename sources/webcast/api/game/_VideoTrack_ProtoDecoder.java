package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _VideoTrack_ProtoDecoder implements InterfaceC31105CIr<VideoTrack> {
    public static VideoTrack LIZIZ(Q9H q9h) {
        VideoTrack videoTrack = new VideoTrack();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 3) {
                    if (LJI != 4) {
                        Q9J.LIZJ(q9h);
                    } else {
                        videoTrack.endTime = q9h.LJIIJJI();
                    }
                } else {
                    videoTrack.startTime = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return videoTrack;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final VideoTrack LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
