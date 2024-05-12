package webcast.api.creator;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _PreScheduleStream_ProtoDecoder implements InterfaceC31105CIr<PreScheduleStream> {
    public static PreScheduleStream LIZIZ(Q9H q9h) {
        PreScheduleStream preScheduleStream = new PreScheduleStream();
        preScheduleStream.streamResolutionList = new ArrayList();
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
                                preScheduleStream.recommendStreamResolution = q9h.LJIIJ();
                            }
                        } else {
                            preScheduleStream.streamResolutionList.add(_StreamResolution_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        preScheduleStream.speedProbeUrl = Q9J.LIZIZ(q9h);
                    }
                } else {
                    preScheduleStream.sdkParams = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return preScheduleStream;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PreScheduleStream LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
