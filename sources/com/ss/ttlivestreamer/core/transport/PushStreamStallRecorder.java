package com.ss.ttlivestreamer.core.transport;

import X.C16880lQ;
import X.KMP;
import X.X1D;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;

/* loaded from: classes12.dex */
public class PushStreamStallRecorder extends NativeObject {
    public static final String TAG = C16880lQ.LJLLJ(PushStreamStallRecorder.class);
    public Listener mListener;

    /* loaded from: classes12.dex */
    public interface Listener {
        void onMessage(int i, int i2, long j, String str);
    }

    private native int nativeCreate(TEBundle tEBundle);

    private native void nativeStartRecorder();

    private native void nativeStopRecorder();

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        this.mListener = null;
        super.release();
    }

    public void start() {
        nativeStartRecorder();
    }

    public void stop() {
        nativeStopRecorder();
    }

    public PushStreamStallRecorder(TEBundle tEBundle, Listener listener) {
        this.mListener = listener;
        int nativeCreate = nativeCreate(tEBundle);
        if (nativeCreate != 0) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(KMP.LJ("BUG with ret ", nativeCreate));
            TTLSSladarBugReportUtils tTLSSladarBugReportUtils = TTLSSladarBugReportUtils.getInstance();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(TAG);
            LIZ.append(".PushStreamStallRecorder@1");
            tTLSSladarBugReportUtils.report(androidRuntimeException, X1D.LIZIZ(LIZ));
            if (TTLSBuildConfig.canThrowException()) {
                throw androidRuntimeException;
            }
        }
        if (this.mNativeObj == 0) {
            AndroidRuntimeException androidRuntimeException2 = new AndroidRuntimeException(KMP.LJ("Bad alloc with ", nativeCreate));
            TTLSSladarBugReportUtils tTLSSladarBugReportUtils2 = TTLSSladarBugReportUtils.getInstance();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(TAG);
            LIZ2.append(".PushStreamStallRecorder@2");
            tTLSSladarBugReportUtils2.report(androidRuntimeException2, X1D.LIZIZ(LIZ2));
            if (!TTLSBuildConfig.canThrowException()) {
            } else {
                throw androidRuntimeException2;
            }
        }
    }

    private void onMessage(int i, int i2, long j, String str) {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onMessage(i, i2, j, str);
        }
    }
}
