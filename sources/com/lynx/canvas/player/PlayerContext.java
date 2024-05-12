package com.lynx.canvas.player;

import X.J0O;
import android.content.Context;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.lynx.canvas.KryptonApp;
import com.lynx.canvas.SurfaceTextureWrapper;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;

/* loaded from: classes9.dex */
public class PlayerContext {
    public J0O LIZ;
    public long LIZIZ;
    public final KryptonApp LIZJ;
    public final boolean LJFF;
    public final Context LJI;
    public boolean LJ = false;
    public double LIZLLL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public PthreadTimer LJII = new PthreadTimer("PlayerContext");

    public static native void nativeNotifyPlayerState(long j, int i, int[] iArr);

    public void release() {
        synchronized (this) {
            J0O j0o = this.LIZ;
            if (j0o != null) {
                j0o.LIZ(null);
                this.LIZ.release();
                this.LIZ = null;
            }
            this.LIZIZ = 0L;
        }
        PthreadTimer pthreadTimer = this.LJII;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
            this.LJII = null;
        }
    }

    public double getCurrentTime() {
        J0O j0o = this.LIZ;
        if (j0o == null || !j0o.isPlaying()) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return this.LIZ.LIZLLL();
    }

    public boolean getLoop() {
        J0O j0o = this.LIZ;
        if (j0o == null) {
            return false;
        }
        return j0o.LIZIZ();
    }

    public void pause() {
        J0O j0o = this.LIZ;
        if (j0o == null || !j0o.isPlaying()) {
            return;
        }
        this.LIZ.pause();
    }

    public void play() {
        J0O j0o = this.LIZ;
        if (j0o == null) {
            return;
        }
        j0o.play();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:3|(2:5|(10:7|8|9|10|(2:16|(5:18|19|(1:21)|22|(2:24|25)(1:27)))|31|19|(0)|22|(0)(0))(1:34))(1:36)|35|8|9|10|(4:12|14|16|(0))|31|19|(0)|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("checkTTEngineHardwareDecodeDisabled error ");
        r1.append(r2.toString());
        X.O5Y.LJJLIIIJJI("PlayerContext", X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void load(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.canvas.player.PlayerContext.load(java.lang.String):void");
    }

    public void setCurrentTime(double d) {
        J0O j0o = this.LIZ;
        if (j0o == null || !this.LJ) {
            this.LIZLLL = d;
        } else {
            j0o.LJ(d);
        }
    }

    public void setLoop(boolean z) {
        J0O j0o = this.LIZ;
        if (j0o == null) {
            return;
        }
        j0o.setLooping(z);
    }

    public void setVolume(double d) {
        J0O j0o = this.LIZ;
        if (j0o == null) {
            return;
        }
        j0o.LIZJ(d);
    }

    public void setupSurface(SurfaceTextureWrapper surfaceTextureWrapper) {
        J0O j0o = this.LIZ;
        if (surfaceTextureWrapper.LIZIZ == null) {
            surfaceTextureWrapper.LIZIZ = new Surface(surfaceTextureWrapper.LIZ);
        }
        j0o.setSurface(surfaceTextureWrapper.LIZIZ);
    }

    public PlayerContext(long j, KryptonApp kryptonApp, boolean z) {
        this.LIZIZ = j;
        this.LIZJ = kryptonApp;
        this.LJI = kryptonApp.LIZ;
        this.LJFF = z;
    }

    public static PlayerContext create(long j, KryptonApp kryptonApp, boolean z) {
        return new PlayerContext(j, kryptonApp, z);
    }
}
