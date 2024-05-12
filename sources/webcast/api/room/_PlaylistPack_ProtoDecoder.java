package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.data._MusicSong_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _PlaylistPack_ProtoDecoder implements InterfaceC31105CIr<PlaylistPack> {
    public static PlaylistPack LIZIZ(Q9H q9h) {
        PlaylistPack playlistPack = new PlaylistPack();
        playlistPack.songs = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            playlistPack.currSongOffset = q9h.LJIIJJI();
                        }
                    } else {
                        playlistPack.total = q9h.LJIIJJI();
                    }
                } else {
                    playlistPack.songs.add(_MusicSong_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return playlistPack;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PlaylistPack LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
