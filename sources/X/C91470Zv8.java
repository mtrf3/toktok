package X;

import com.ss.android.ugc.aweme.dsp.playerservice.NewDspPlayerService;
import kotlin.jvm.internal.o;

/* renamed from: X.Zv8, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91470Zv8 implements InterfaceC91288ZsC {
    public final NewDspPlayerService LJLIL;

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptPause(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSeek(long j) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSetStartPlayTime(int i) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptStop(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final InterfaceC91296ZsK processPlayable(InterfaceC91296ZsK interfaceC91296ZsK) {
        return interfaceC91296ZsK;
    }

    public final C91613ZxR LIZ() {
        return this.LJLIL.getSubPlayerController();
    }

    public C91470Zv8(NewDspPlayerService dspPlayerService) {
        o.LJIIIZ(dspPlayerService, "dspPlayerService");
        this.LJLIL = dspPlayerService;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptResume(C91299ZsN c91299ZsN) {
        if (!this.LJLIL.isMainCanPlay()) {
            return true;
        }
        if (LIZ().LJIJI().startPlaying() || LIZ().LJIJJLI()) {
            LIZ().LJIL(new C91299ZsN("PAUSE_FROM_MAIN_PLAYER"));
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptPlay(C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK) {
        if (!this.LJLIL.isMainCanPlay() || !C91222Zr8.LIZ(c91299ZsN, interfaceC91296ZsK)) {
            return true;
        }
        if (LIZ().LJIJI().startPlaying() || LIZ().LJIJJLI()) {
            LIZ().LJIL(new C91299ZsN("PAUSE_FROM_MAIN_PLAYER"));
        }
        InterfaceC91296ZsK LIZ = this.LJLIL.getMainPlayerController().LIZ();
        if (LIZ != null) {
            int duration = LIZ.getDuration();
            Integer startTime = (Integer) LIZ.LJIILLIIL().first;
            if (LIZ.LJIILIIL()) {
                o.LJIIIIZZ(startTime, "startTime");
                int intValue = startTime.intValue();
                if (1 <= intValue && intValue < duration) {
                    this.LJLIL.getMainPlayerController().LJJIFFI(startTime.intValue());
                }
            }
            this.LJLIL.getMainPlayerController().LJJIFFI(0);
        }
        return false;
    }
}
