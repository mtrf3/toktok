package X;

import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;

/* loaded from: classes8.dex */
public final class HA2 extends HA5 {
    public HA2(HAE hae) {
        super(hae);
    }

    @Override // X.InterfaceC43634HAo
    public final void LIZ(Object obj) {
        this.LIZJ.LIZIZ();
        IAnotherMusicService iAnotherMusicService = (IAnotherMusicService) C60903NvH.LJIIJJI().LJJIJ();
        if (iAnotherMusicService == null || this.LIZ.LJ == null) {
            this.LIZJ.LIZ("upload pictures", "failed.");
            HAY hay = this.LIZ.LIZLLL;
            if (hay != null) {
                hay.onFailed();
                return;
            }
            return;
        }
        iAnotherMusicService.LJIL();
        C43014GuQ.LIZ.LJIIIIZZ(new HA1(this));
    }
}
