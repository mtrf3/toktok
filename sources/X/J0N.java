package X;

import com.lynx.canvas.player.PlayerContext;
import java.util.TimerTask;

/* loaded from: classes9.dex */
public final class J0N extends TimerTask {
    public final /* synthetic */ PlayerContext LJLIL;

    public final void LIZ() {
        if (this.LJLIL.LJ) {
            return;
        }
        O5Y.LJJJ("PlayerContext", "video load timeout");
        PlayerContext.nativeNotifyPlayerState(this.LJLIL.LIZIZ, 2, null);
        this.LJLIL.getClass();
        synchronized (this) {
            this.LJLIL.LIZ.LIZ(null);
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public J0N(PlayerContext playerContext) {
        this.LJLIL = playerContext;
    }
}
