package tikcast.api.anchor;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _PlaylistAddReq_ProtoDecoder implements InterfaceC31105CIr<PlaylistAddReq> {
    @Override // X.InterfaceC31105CIr
    public final PlaylistAddReq LIZ(Q9H q9h) {
        PlaylistAddReq playlistAddReq = new PlaylistAddReq();
        playlistAddReq.songIds = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            C29991Fr.LIZ(q9h, playlistAddReq.songIds);
                        }
                    } else {
                        playlistAddReq.lastSongOffset = q9h.LJIIJJI();
                    }
                } else {
                    playlistAddReq.lastSongId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return playlistAddReq;
            }
        }
    }
}
