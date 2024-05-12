package com.lynx.tasm.lepus;

import X.C16880lQ;
import X.F57;
import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public final class LepusApiActor implements F57 {
    public long LIZ;
    public final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());

    private native long nativeCreate(long j);

    public native void nativeDestroy(long j);

    public native void nativeInvokeLepusApiCallback(long j, int i, String str, Object obj);

    public native void nativeOnPseudoStatusChanged(long j, int i, int i2, int i3);

    public native void nativeSendCustomEvent(long j, String str, int i, ByteBuffer byteBuffer, int i2, String str2);

    public native void nativeSendTouchEvent(long j, String str, int i, float f, float f2, float f3, float f4, float f5, float f6);

    public LepusApiActor(long j) {
        this.LIZ = nativeCreate(j);
    }

    public final void LIZIZ(Runnable runnable) {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            runnable.run();
        } else {
            this.LIZIZ.post(runnable);
        }
    }

    @Override // X.F57
    public final void LIZ(int i, String str, Object obj) {
        nativeInvokeLepusApiCallback(this.LIZ, i, str, obj);
    }
}
