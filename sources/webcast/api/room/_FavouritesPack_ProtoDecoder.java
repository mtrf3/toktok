package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.data._MusicSong_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _FavouritesPack_ProtoDecoder implements InterfaceC31105CIr<FavouritesPack> {
    public static FavouritesPack LIZIZ(Q9H q9h) {
        FavouritesPack favouritesPack = new FavouritesPack();
        favouritesPack.songs = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            favouritesPack.total = q9h.LJIIJJI();
                        }
                    } else {
                        favouritesPack.hasMore = Q9J.LIZ(q9h);
                    }
                } else {
                    favouritesPack.songs.add(_MusicSong_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return favouritesPack;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FavouritesPack LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
