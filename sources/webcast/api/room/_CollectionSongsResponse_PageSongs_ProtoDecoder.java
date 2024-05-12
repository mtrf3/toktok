package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.room.CollectionSongsResponse;
import webcast.data._MusicSong_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _CollectionSongsResponse_PageSongs_ProtoDecoder implements InterfaceC31105CIr<CollectionSongsResponse.PageSongs> {
    public static CollectionSongsResponse.PageSongs LIZIZ(Q9H q9h) {
        CollectionSongsResponse.PageSongs pageSongs = new CollectionSongsResponse.PageSongs();
        pageSongs.songs = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            pageSongs.total = q9h.LJIIJJI();
                        }
                    } else {
                        pageSongs.hasMore = Q9J.LIZ(q9h);
                    }
                } else {
                    pageSongs.songs.add(_MusicSong_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return pageSongs;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CollectionSongsResponse.PageSongs LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
