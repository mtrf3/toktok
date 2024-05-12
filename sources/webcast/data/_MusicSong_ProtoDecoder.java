package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _MusicSong_ProtoDecoder implements InterfaceC31105CIr<MusicSong> {
    public static MusicSong LIZIZ(Q9H q9h) {
        MusicSong musicSong = new MusicSong();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        musicSong.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        musicSong.title = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        musicSong.author = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        musicSong.previewUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        musicSong.coverUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        musicSong.isFavourite = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        musicSong.duration = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return musicSong;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MusicSong LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
