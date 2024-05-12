package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.anchor.KaraokeQueueUpdateResponse;

/* loaded from: classes17.dex */
public final class _KaraokeQueueUpdateResponse_Data_ProtoDecoder implements InterfaceC31105CIr<KaraokeQueueUpdateResponse.Data> {
    public static KaraokeQueueUpdateResponse.Data LIZIZ(Q9H q9h) {
        KaraokeQueueUpdateResponse.Data data = new KaraokeQueueUpdateResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.songId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final KaraokeQueueUpdateResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
