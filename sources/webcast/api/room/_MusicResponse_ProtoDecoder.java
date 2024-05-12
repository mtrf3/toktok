package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _MusicResponse_ProtoDecoder implements InterfaceC31105CIr<MusicResponse> {
    @Override // X.InterfaceC31105CIr
    public final MusicResponse LIZ(Q9H q9h) {
        MusicResponse musicResponse = new MusicResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    musicResponse.data = _MusicResponse_Packs_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return musicResponse;
            }
        }
    }
}
