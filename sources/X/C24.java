package X;

import com.ss.ttlivestreamer.core.player.IAVPlayer;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C24 extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC21020s6, C76800UCe> {
    public static final C24 LJLIL = new C24();

    public C24() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC21020s6 interfaceC21020s6) {
        IAVPlayer iAVPlayer;
        InterfaceC21020s6 it = interfaceC21020s6;
        o.LJIIIZ(it, "it");
        LiveCore liveCore = it.getLiveCore();
        if (liveCore != null) {
            iAVPlayer = liveCore.createPlayer();
        } else {
            iAVPlayer = null;
        }
        C2R.LIZIZ = iAVPlayer;
        if (iAVPlayer != null) {
            iAVPlayer.setVolume(0.6f);
        }
        return C76800UCe.LIZ;
    }
}
