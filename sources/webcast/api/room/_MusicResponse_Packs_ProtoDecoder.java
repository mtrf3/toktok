package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.room.MusicResponse;

/* loaded from: classes17.dex */
public final class _MusicResponse_Packs_ProtoDecoder implements InterfaceC31105CIr<MusicResponse.Packs> {
    public static MusicResponse.Packs LIZIZ(Q9H q9h) {
        MusicResponse.Packs packs = new MusicResponse.Packs();
        packs.packs = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            packs.favourites = _FavouritesPack_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        packs.playlist = _PlaylistPack_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    packs.packs.add(_MusicResponse_Pack_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return packs;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MusicResponse.Packs LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
