package com.ss.ttlivestreamer.core.transport;

import X.AnonymousClass028;
import X.KMP;
import X.X1D;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public class RTMPReconnectHelper extends NativeObject {
    public Listener mListener;

    /* loaded from: classes12.dex */
    public interface Listener {
        void onMessage(int i, int i2, long j, String str);
    }

    private native int nativeCreate(TEBundle tEBundle);

    private native int nativeGetCurrentRetryCount();

    private native int nativeGetStreamRetryCount();

    private native void nativeOnEvent(int i, int i2, long j, String str);

    private native void nativeResetLightWeightReconnectParams();

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        this.mListener = null;
        super.release();
    }

    public int getCurrentRetryCount() {
        return nativeGetCurrentRetryCount();
    }

    public int getStreamRetryCount() {
        return nativeGetStreamRetryCount();
    }

    public void resetLightWeightReconnectParams() {
        nativeResetLightWeightReconnectParams();
    }

    public RTMPReconnectHelper(TEBundle tEBundle, Listener listener) {
        this.mListener = listener;
        int nativeCreate = nativeCreate(tEBundle);
        if (nativeCreate != 0) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(KMP.LJ("BUG with ret ", nativeCreate));
            if (AnonymousClass028.LJI(androidRuntimeException, "RTMPReconnectHelper.RTMPReconnectHelper@1")) {
                throw androidRuntimeException;
            }
        }
        if (this.mNativeObj == 0) {
            AndroidRuntimeException androidRuntimeException2 = new AndroidRuntimeException(KMP.LJ("Bad alloc with ", nativeCreate));
            if (!AnonymousClass028.LJI(androidRuntimeException2, "RTMPReconnectHelper.RTMPReconnectHelper@2")) {
            } else {
                throw androidRuntimeException2;
            }
        }
    }

    private void onMessage(int i, int i2, long j, String str) {
        Listener listener = this.mListener;
        if (listener != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[RTMPRec] onMessagehelper event1:");
            LIZ.append(i);
            AVLog.ioi("helper", X1D.LIZIZ(LIZ));
            listener.onMessage(i, i2, j, str);
        }
    }

    public void OnEvent(int i, int i2, long j, String str) {
        nativeOnEvent(i, i2, j, str);
    }
}
