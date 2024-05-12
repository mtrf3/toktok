package webcast.api.creator;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PreScheduleStreamResponse_ProtoDecoder implements InterfaceC31105CIr<PreScheduleStreamResponse> {
    @Override // X.InterfaceC31105CIr
    public final PreScheduleStreamResponse LIZ(Q9H q9h) {
        PreScheduleStreamResponse preScheduleStreamResponse = new PreScheduleStreamResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        preScheduleStreamResponse.extra = _PreScheduleStreamExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    preScheduleStreamResponse.data = _PreScheduleStream_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return preScheduleStreamResponse;
            }
        }
    }
}
