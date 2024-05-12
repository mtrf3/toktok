package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardVideoPlayerCacheProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GZO implements GZP {
    @Override // X.GZP
    public final void LIZ(long j) {
    }

    @Override // X.GZP
    public final long LIZIZ() {
        return -1L;
    }

    @Override // X.GZP
    public final void LIZJ(long j, long j2) {
    }

    @Override // X.GZP
    public final void LIZLLL(C41831GbL c41831GbL, InterfaceC65784Pro<C76800UCe> shareResult) {
        o.LJIIIZ(shareResult, "shareResult");
    }

    @Override // X.GZP
    public final void LJFF(C41831GbL c41831GbL) {
    }

    @Override // X.GZP
    public final boolean LJII(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return false;
    }

    @Override // X.GZP
    public final long LJIIIZ(long j) {
        return -1L;
    }

    @Override // X.GZP
    public final void LJIIJ(String str, Aweme aweme, InterfaceC88472Yns<? super C41835GbP, C41835GbP> interfaceC88472Yns) {
        o.LJIIIZ(aweme, "aweme");
    }

    @Override // X.GZP
    public final ForwardImageDownloader LJ() {
        return new GZK();
    }

    @Override // X.GZP
    public final ForwardMediaDownloader LJI() {
        return new GZN();
    }

    @Override // X.GZP
    public final ForwardVideoPlayerCacheProvider LJIIIIZZ() {
        return new GZQ();
    }
}
