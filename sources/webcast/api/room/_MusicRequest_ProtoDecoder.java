package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _MusicRequest_ProtoDecoder implements InterfaceC31105CIr<MusicRequest> {
    @Override // X.InterfaceC31105CIr
    public final MusicRequest LIZ(Q9H q9h) {
        MusicRequest musicRequest = new MusicRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    musicRequest.lastPlaylistSongId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return musicRequest;
            }
        }
    }
}
