package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _PlaylistSongsRequest_ProtoDecoder implements InterfaceC31105CIr<PlaylistSongsRequest> {
    @Override // X.InterfaceC31105CIr
    public final PlaylistSongsRequest LIZ(Q9H q9h) {
        PlaylistSongsRequest playlistSongsRequest = new PlaylistSongsRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        playlistSongsRequest.count = q9h.LJIIJJI();
                    }
                } else {
                    playlistSongsRequest.offset = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return playlistSongsRequest;
            }
        }
    }
}
