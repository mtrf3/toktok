package X;

import Y.ARunnableS27S0200000_8;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.lynx.canvas.player.PlayerContext;

/* loaded from: classes9.dex */
public final class J0M implements J0I {
    public final /* synthetic */ Looper LIZ;
    public final /* synthetic */ PlayerContext LIZIZ;

    public final void LIZ(J0O j0o) {
        PlayerContext playerContext = this.LIZIZ;
        playerContext.LJ = true;
        double d = playerContext.LIZLLL;
        if (d != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            playerContext.setCurrentTime(d);
        }
        new Handler(this.LIZ).post(new ARunnableS27S0200000_8(this, new int[]{j0o.getVideoWidth(), j0o.getVideoHeight(), j0o.getDuration(), j0o.LJIJ()}, 77));
    }

    public J0M(PlayerContext playerContext, Looper looper) {
        this.LIZIZ = playerContext;
        this.LIZ = looper;
    }
}
