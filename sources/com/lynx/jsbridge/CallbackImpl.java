package com.lynx.jsbridge;

import X.C03880Dg;
import X.C65300Pk0;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.WritableArray;
import com.lynx.tasm.base.LLog;

/* loaded from: classes7.dex */
public final class CallbackImpl implements Callback {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public boolean mInvoked = false;
    public long mNativePtr;

    private native void nativeInvoke(long j, WritableArray writableArray);

    private native void nativeReleaseNativePtr(long j);

    public void resetNativePtr() {
        this.mNativePtr = 0L;
    }

    public void finalize() {
        super.finalize();
        nativeReleaseNativePtr(this.mNativePtr);
    }

    public CallbackImpl(long j) {
        this.mNativePtr = j;
    }

    @Override // com.lynx.react.bridge.Callback
    public void invoke(Object... objArr) {
        if (new C03880Dg(2).LIZJ(300003, "com/lynx/jsbridge/CallbackImpl", "invoke", this, new Object[]{objArr}, "void", new C65300Pk0(false, "([Ljava/lang/Object;)V", "-592469914025621928")).LIZ) {
            return;
        }
        if (this.mInvoked) {
            LLog.LIZLLL(4, "LynxModule", "Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
            return;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            LLog.LIZLLL(4, "LynxModule", "callback invoke failed: mNativePtr is NULL");
        } else {
            nativeInvoke(j, JavaOnlyArray.of(objArr));
            this.mInvoked = true;
        }
    }

    public void invokeCallback(Object... objArr) {
        if (this.mInvoked) {
            LLog.LIZLLL(4, "LynxModule", "Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
            return;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            LLog.LIZLLL(4, "LynxModule", "callback invoke failed: mNativePtr is NULL");
        } else {
            nativeInvoke(j, JavaOnlyArray.of(objArr));
            this.mInvoked = true;
        }
    }
}
