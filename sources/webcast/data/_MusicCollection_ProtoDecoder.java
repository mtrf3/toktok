package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _MusicCollection_ProtoDecoder implements InterfaceC31105CIr<MusicCollection> {
    public static MusicCollection LIZIZ(Q9H q9h) {
        MusicCollection musicCollection = new MusicCollection();
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
                                musicCollection.engName = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            musicCollection.coverUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        musicCollection.name = Q9J.LIZIZ(q9h);
                    }
                } else {
                    musicCollection.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return musicCollection;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MusicCollection LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
