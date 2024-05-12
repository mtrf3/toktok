package com.lynx.animax;

import X.C77125UOr;
import X.FC1;
import X.VTF;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.lynx.canvas.FirstFrameAwareSurfaceTexture;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public class AnimaXElement {
    public long LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    private native long nativeCreate(UIAnimaX uIAnimaX, long j, float f);

    private native void nativeDestroy(long j);

    private native double nativeGetCurrentFrame(long j);

    private native double nativeGetDurationMs(long j);

    private native ReadableMap nativeGetPerfMetrics(long j);

    private native boolean nativeIsAnimating(long j);

    private native void nativeOnSurfaceChanged(long j, int i, int i2);

    private native void nativeOnSurfaceCreated(long j, Surface surface, FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture, int i, int i2);

    private native void nativePause(long j);

    private native void nativePlay(long j);

    private native void nativeResume(long j);

    private native void nativeSeek(long j, int i);

    private native void nativeSetAutoPlay(long j, boolean z);

    private native void nativeSetAutoReverse(long j, boolean z);

    private native void nativeSetEndFrame(long j, int i);

    private native void nativeSetFpsEventInterval(long j, long j2);

    private native void nativeSetJson(long j, String str);

    private native void nativeSetKeepLastFrame(long j, boolean z);

    private native void nativeSetLoop(long j, boolean z);

    private native void nativeSetLoopCount(long j, int i);

    private native void nativeSetObjectFit(long j, int i);

    private native void nativeSetProgress(long j, float f);

    private native void nativeSetSpeed(long j, float f);

    private native void nativeSetSrc(long j, String str);

    private native void nativeSetSrcPolyfill(long j, JavaOnlyMap javaOnlyMap);

    private native void nativeSetStartFrame(long j, int i);

    private native void nativeStop(long j);

    private native void nativeSubscribeUpdateEvent(long j, int i);

    private native void nativeUnsubscribeUpdateEvent(long j, int i);

    public final boolean LIZ() {
        if (this.LIZJ) {
            return false;
        }
        if (this.LIZ == 0) {
            C77125UOr.LJIILJJIL("AnimaXElement", "checkNativeReady failed, ptr is 0");
        }
        if (this.LIZ == 0) {
            return false;
        }
        return true;
    }

    public final void LIZIZ() {
        if (!LIZ()) {
            return;
        }
        nativeDestroy(this.LIZ);
        this.LIZJ = true;
        this.LIZ = 0L;
    }

    public final double LIZJ() {
        if (!LIZ()) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return nativeGetCurrentFrame(this.LIZ);
    }

    public final double LIZLLL() {
        if (!LIZ()) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return nativeGetDurationMs(this.LIZ);
    }

    public final FC1 LJ() {
        if (!LIZ()) {
            return null;
        }
        return new FC1(nativeGetPerfMetrics(this.LIZ));
    }

    public final boolean LJFF() {
        if (!LIZ()) {
            return false;
        }
        return nativeIsAnimating(this.LIZ);
    }

    public final void LJIIIIZZ() {
        if (!LIZ()) {
            return;
        }
        nativePause(this.LIZ);
    }

    public final void LJIIIZ() {
        if (!LIZ()) {
            return;
        }
        nativePlay(this.LIZ);
    }

    public final void LJIIJ() {
        if (!LIZ()) {
            return;
        }
        nativeResume(this.LIZ);
    }

    public final void LJJII() {
        if (!LIZ()) {
            return;
        }
        nativeStop(this.LIZ);
    }

    public final void LJIIJJI(int i) {
        if (!LIZ()) {
            return;
        }
        nativeSeek(this.LIZ, i);
    }

    public final void LJIIL(boolean z) {
        if (!LIZ()) {
            return;
        }
        nativeSetAutoPlay(this.LIZ, z);
        this.LIZIZ = z;
    }

    public final void LJIILIIL(boolean z) {
        if (!LIZ()) {
            return;
        }
        nativeSetAutoReverse(this.LIZ, z);
    }

    public final void LJIILJJIL(int i) {
        if (!LIZ()) {
            return;
        }
        nativeSetEndFrame(this.LIZ, i);
    }

    public final void LJIILL(long j) {
        if (!LIZ()) {
            return;
        }
        nativeSetFpsEventInterval(this.LIZ, j);
    }

    public final void LJIILLIIL(String str) {
        if (!LIZ()) {
            return;
        }
        nativeSetJson(this.LIZ, str);
    }

    public final void LJIIZILJ(boolean z) {
        if (!LIZ()) {
            return;
        }
        nativeSetKeepLastFrame(this.LIZ, z);
    }

    public final void LJIJ(boolean z) {
        if (!LIZ()) {
            return;
        }
        nativeSetLoop(this.LIZ, z);
    }

    public final void LJIJI(int i) {
        if (!LIZ()) {
            return;
        }
        nativeSetLoopCount(this.LIZ, i);
    }

    public final void LJIJJ(String str) {
        VTF vtf = VTF.CENTER;
        if ("cover".equals(str)) {
            vtf = VTF.COVER;
        } else if ("contain".equals(str)) {
            vtf = VTF.CONTAIN;
        }
        if (!LIZ()) {
            return;
        }
        nativeSetObjectFit(this.LIZ, vtf.ordinal());
    }

    public final void LJIJJLI(float f) {
        if (!LIZ()) {
            return;
        }
        nativeSetProgress(this.LIZ, f);
    }

    public final void LJIL(float f) {
        if (!LIZ()) {
            return;
        }
        nativeSetSpeed(this.LIZ, f);
    }

    public final void LJJ(String str) {
        if (!LIZ()) {
            return;
        }
        nativeSetSrc(this.LIZ, str);
    }

    public final void LJJI(JavaOnlyMap javaOnlyMap) {
        if (!LIZ()) {
            return;
        }
        nativeSetSrcPolyfill(this.LIZ, javaOnlyMap);
    }

    public final void LJJIFFI(int i) {
        if (!LIZ()) {
            return;
        }
        nativeSetStartFrame(this.LIZ, i);
    }

    public final void LJJIII(int i) {
        if (!LIZ()) {
            return;
        }
        nativeSubscribeUpdateEvent(this.LIZ, i);
    }

    public final void LJJIIJ(int i) {
        if (!LIZ()) {
            return;
        }
        nativeUnsubscribeUpdateEvent(this.LIZ, i);
    }

    public final void LJI(int i, int i2) {
        if (!LIZ()) {
            return;
        }
        nativeOnSurfaceChanged(this.LIZ, i, i2);
    }

    public AnimaXElement(UIAnimaX uIAnimaX, long j, float f) {
        if (0 != j) {
            this.LIZ = nativeCreate(uIAnimaX, j, f);
        }
    }

    public final void LJII(Surface surface, FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture, int i, int i2) {
        if (!LIZ()) {
            return;
        }
        nativeOnSurfaceCreated(this.LIZ, surface, firstFrameAwareSurfaceTexture, i, i2);
    }
}
