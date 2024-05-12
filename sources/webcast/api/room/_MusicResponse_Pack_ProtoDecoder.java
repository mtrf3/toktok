package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.room.MusicResponse;
import webcast.data._MusicCollection_ProtoDecoder;
import webcast.data._MusicSong_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _MusicResponse_Pack_ProtoDecoder implements InterfaceC31105CIr<MusicResponse.Pack> {
    public static MusicResponse.Pack LIZIZ(Q9H q9h) {
        MusicResponse.Pack pack = new MusicResponse.Pack();
        pack.songs = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                pack.total = q9h.LJIIJJI();
                            }
                        } else {
                            pack.hasMore = Q9J.LIZ(q9h);
                        }
                    } else {
                        pack.songs.add(_MusicSong_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    pack.collection = _MusicCollection_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return pack;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MusicResponse.Pack LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
