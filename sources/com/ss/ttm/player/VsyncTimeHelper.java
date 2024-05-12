package com.ss.ttm.player;

import X.C16880lQ;
import X.J2K;
import X.J2L;
import X.J2M;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Message;
import android.view.WindowManager;

/* loaded from: classes9.dex */
public final class VsyncTimeHelper {
    public final WindowManager LIZ;
    public final J2K LIZIZ;
    public final J2L LIZJ;
    public long LIZLLL;

    public final void LIZ() {
        if (this.LIZ.getDefaultDisplay() != null) {
            this.LIZLLL = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            this.LIZLLL = 62500000L;
        }
        J2K j2k = this.LIZIZ;
        j2k.LJLJLJ.putLong("vsync", this.LIZLLL);
        Message obtainMessage = j2k.LJLJL.obtainMessage(4);
        obtainMessage.setData(j2k.LJLJLJ);
        obtainMessage.sendToTarget();
    }

    public void disable() {
        if (this.LIZ != null) {
            J2L j2l = this.LIZJ;
            if (j2l != null) {
                j2l.LJLIL.unregisterDisplayListener(j2l);
            }
            this.LIZIZ.LJLJL.sendEmptyMessage(1);
        }
    }

    public void enable() {
        if (this.LIZ != null) {
            this.LIZIZ.LJLJL.sendEmptyMessage(0);
            J2L j2l = this.LIZJ;
            if (j2l != null) {
                j2l.LJLIL.registerDisplayListener(j2l, null);
            }
            LIZ();
        }
    }

    public int getLowestUIFps() {
        return this.LIZIZ.LJLJJLL;
    }

    public int getUIFps() {
        return this.LIZIZ.LJLJJL;
    }

    public long getVsyncDurationNs() {
        return this.LIZLLL;
    }

    public VsyncTimeHelper(TTPlayer tTPlayer) {
        Context context;
        DisplayManager displayManager;
        J2L j2l = null;
        if (tTPlayer != null) {
            context = tTPlayer.LIZLLL;
        } else {
            context = null;
        }
        if (context != null) {
            context = C16880lQ.LLLLL(context);
            this.LIZ = (WindowManager) C16880lQ.LLILL(context, "window");
        } else {
            this.LIZ = null;
        }
        if (this.LIZ != null) {
            if (J2M.LIZ >= 17 && (displayManager = (DisplayManager) C16880lQ.LLILL(context, "display")) != null) {
                j2l = new J2L(this, displayManager);
            }
            this.LIZJ = j2l;
            this.LIZIZ = J2K.LJLLI;
        } else {
            this.LIZJ = null;
            this.LIZIZ = null;
        }
        this.LIZLLL = -9223372036854775807L;
    }
}
