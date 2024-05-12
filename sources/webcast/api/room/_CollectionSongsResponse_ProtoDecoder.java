package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CollectionSongsResponse_ProtoDecoder implements InterfaceC31105CIr<CollectionSongsResponse> {
    @Override // X.InterfaceC31105CIr
    public final CollectionSongsResponse LIZ(Q9H q9h) {
        CollectionSongsResponse collectionSongsResponse = new CollectionSongsResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    collectionSongsResponse.data = _CollectionSongsResponse_PageSongs_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return collectionSongsResponse;
            }
        }
    }
}
