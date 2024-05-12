package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CollectionSongsRequest_ProtoDecoder implements InterfaceC31105CIr<CollectionSongsRequest> {
    @Override // X.InterfaceC31105CIr
    public final CollectionSongsRequest LIZ(Q9H q9h) {
        CollectionSongsRequest collectionSongsRequest = new CollectionSongsRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            collectionSongsRequest.count = q9h.LJIIJJI();
                        }
                    } else {
                        collectionSongsRequest.offset = q9h.LJIIJJI();
                    }
                } else {
                    collectionSongsRequest.collectionId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return collectionSongsRequest;
            }
        }
    }
}
