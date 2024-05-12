package webcast.api.creator;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _StreamResolution_ProtoDecoder implements InterfaceC31105CIr<StreamResolution> {
    public static StreamResolution LIZIZ(Q9H q9h) {
        StreamResolution streamResolution = new StreamResolution();
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
                                streamResolution.minBitRate = q9h.LJIIJ();
                            }
                        } else {
                            streamResolution.resolutionDescribe = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        streamResolution.resolutionText = Q9J.LIZIZ(q9h);
                    }
                } else {
                    streamResolution.streamResolution = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return streamResolution;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StreamResolution LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
