package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _FavouritesDeleteResponse_ProtoDecoder implements InterfaceC31105CIr<FavouritesDeleteResponse> {
    @Override // X.InterfaceC31105CIr
    public final FavouritesDeleteResponse LIZ(Q9H q9h) {
        FavouritesDeleteResponse favouritesDeleteResponse = new FavouritesDeleteResponse();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return favouritesDeleteResponse;
    }
}
