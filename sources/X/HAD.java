package X;

import Y.AfS59S0100000_7;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes8.dex */
public final class HAD extends HA5 {
    public HAD(HAE hae) {
        super(hae);
    }

    @Override // X.InterfaceC43634HAo
    public final void LIZ(Object obj) {
        MusicModel musicModel = this.LIZ.LJIIJJI;
        if (musicModel != null) {
            HA5 ha5 = this.LIZIZ;
            if (ha5 != null) {
                ha5.LIZ(musicModel);
                return;
            }
            return;
        }
        this.LIZJ.LIZIZ();
        C43619H9z c43619H9z = this.LIZ.LIZ;
        if (c43619H9z != null) {
            c43619H9z.LJIIJJI = 3;
        }
        IAnotherMusicService iAnotherMusicService = (IAnotherMusicService) C60903NvH.LJIIJJI().LJJIJ();
        if (iAnotherMusicService == null || C5WB.LIZ()) {
            long LIZ = this.LIZJ.LIZ("fetch hot music", "failed.");
            HAE hae = this.LIZ;
            C43619H9z c43619H9z2 = hae.LIZ;
            if (c43619H9z2 != null) {
                c43619H9z2.LIZLLL = (int) LIZ;
                c43619H9z2.LJIIJ = "musicService null";
                c43619H9z2.LJIIIZ = 5;
            }
            HAY hay = hae.LIZLLL;
            if (hay != null) {
                hay.onFailed();
                return;
            }
            return;
        }
        iAnotherMusicService.LJIL();
        C43014GuQ.LIZ.LIZLLL("", true, 5, 0, this.LIZ.LJFF).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0100000_7(this, 84), new AfS59S0100000_7(this, 85));
    }
}
