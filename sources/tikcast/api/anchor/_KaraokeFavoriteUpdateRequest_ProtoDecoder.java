package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _KaraokeFavoriteUpdateRequest_ProtoDecoder implements InterfaceC31105CIr<KaraokeFavoriteUpdateRequest> {
    @Override // X.InterfaceC31105CIr
    public final KaraokeFavoriteUpdateRequest LIZ(Q9H q9h) {
        KaraokeFavoriteUpdateRequest karaokeFavoriteUpdateRequest = new KaraokeFavoriteUpdateRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        karaokeFavoriteUpdateRequest.updateType = q9h.LJIIJ();
                    }
                } else {
                    karaokeFavoriteUpdateRequest.songId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeFavoriteUpdateRequest;
            }
        }
    }
}
