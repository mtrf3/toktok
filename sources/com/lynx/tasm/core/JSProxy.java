package com.lynx.tasm.core;

import X.VA1;
import X.VNU;
import X.X1D;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes15.dex */
public class JSProxy {
    public long LIZ;
    public long LIZIZ;
    public final WeakReference<VNU> LIZJ;
    public final ReadWriteLock LIZLLL = new ReentrantReadWriteLock();

    private native void nativeCallIntersectionObserver(long j, int i, int i2, JavaOnlyMap javaOnlyMap);

    private native void nativeCallJSApiCallbackWithValue(long j, int i, JavaOnlyMap javaOnlyMap);

    private native void nativeCallJSFunction(long j, String str, String str2, JavaOnlyArray javaOnlyArray);

    private native long nativeCreate(long j, boolean z);

    private native void nativeDestroy(long j);

    public static native void nativeEvaluateScript(long j, String str, byte[] bArr, int i);

    public static native JSProxy nativeGetProxyById(long j);

    public static native void nativeRejectDynamicComponentLoad(long j, String str, int i, int i2, String str2);

    public final void LIZLLL() {
        ((ReentrantReadWriteLock) this.LIZLLL).writeLock().lock();
        nativeDestroy(this.LIZ);
        this.LIZ = 0L;
        ((ReentrantReadWriteLock) this.LIZLLL).writeLock().unlock();
    }

    private void setRuntimeId(long j) {
        this.LIZIZ = j;
    }

    public static String LJFF(long j, String str) {
        JSProxy nativeGetProxyById = nativeGetProxyById(j);
        if (nativeGetProxyById == null) {
            return str;
        }
        VNU vnu = nativeGetProxyById.LIZJ.get();
        if (vnu == null) {
            return str;
        }
        String LIZ = VA1.LIZ(vnu, str, false);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("result:");
        LIZ2.append(LIZ);
        LLog.LIZLLL(1, "redirectUrl", X1D.LIZIZ(LIZ2));
        return LIZ;
    }

    public final void LIZ(String str, JavaOnlyArray javaOnlyArray) {
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().lock();
        long j = this.LIZ;
        if (j != 0) {
            nativeCallJSFunction(j, str, "emit", javaOnlyArray);
        }
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().unlock();
    }

    public final void LIZJ(int i, JavaOnlyMap javaOnlyMap) {
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().lock();
        long j = this.LIZ;
        if (j != 0) {
            nativeCallJSApiCallbackWithValue(j, i, javaOnlyMap);
        }
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().unlock();
    }

    public JSProxy(long j, WeakReference<VNU> weakReference, boolean z) {
        this.LIZJ = weakReference;
        this.LIZ = nativeCreate(j, z);
    }

    public final void LIZIZ(int i, int i2, JavaOnlyMap javaOnlyMap) {
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().lock();
        long j = this.LIZ;
        if (j != 0) {
            nativeCallIntersectionObserver(j, i, i2, javaOnlyMap);
        }
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().unlock();
    }

    public final void LJ(int i, String str, byte[] bArr) {
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().lock();
        long j = this.LIZ;
        if (j != 0) {
            nativeEvaluateScript(j, str, bArr, i);
        }
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().unlock();
    }

    public final void LJI(int i, int i2, String str, String str2) {
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().lock();
        long j = this.LIZ;
        if (j != 0) {
            nativeRejectDynamicComponentLoad(j, str, i, i2, str2);
        }
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().unlock();
    }
}
