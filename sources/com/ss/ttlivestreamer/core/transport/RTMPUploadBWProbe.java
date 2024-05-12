package com.ss.ttlivestreamer.core.transport;

import X.AnonymousClass028;
import X.C06460Ne;
import X.C65232Piu;
import X.KMP;
import X.X1D;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import com.ss.ttlivestreamer.core.engine.Transport;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public class RTMPUploadBWProbe extends NativeObject {
    public Listener mListener;
    public Transport.EventObserver mObserver;

    /* loaded from: classes12.dex */
    public interface Listener {
        void onMessage(int i, int i2, long j, String str);
    }

    private native int nativeCreate(boolean z);

    private native void nativeOnEvent(int i, int i2, long j, String str);

    private native void nativeSendLogInfo(TEBundle tEBundle);

    private native void nativeSetEndNodeOptimizeTime1970(long j);

    private native void nativeSetParameter(TEBundle tEBundle, TEBundle tEBundle2);

    private native void nativeSetStartNativeApiCallTime1970(long j);

    private native void nativeStartBWTest(String str);

    private native void nativeStartPrePushStream(String str);

    private native void nativeStopBWTest();

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        this.mListener = null;
        super.release();
    }

    public void stopBWTest() {
        nativeStopBWTest();
    }

    public void SendLogInfo(TEBundle tEBundle) {
        nativeSendLogInfo(tEBundle);
    }

    public void SetEndNodeOptimizeTime1970(long j) {
        nativeSetEndNodeOptimizeTime1970(j);
    }

    public void SetStartNativeApiCallTime1970(long j) {
        nativeSetStartNativeApiCallTime1970(j);
    }

    public void startBWTest(String str) {
        nativeStartBWTest(str);
    }

    public void startPrePushStream(String str) {
        nativeStartPrePushStream(str);
    }

    public RTMPUploadBWProbe(boolean z, Listener listener) {
        this.mListener = listener;
        int nativeCreate = nativeCreate(z);
        if (nativeCreate != 0) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(KMP.LJ("BUG with ret ", nativeCreate));
            if (AnonymousClass028.LJI(androidRuntimeException, "RTMPUploadBWProbe.RTMPUploadBWProbe@1")) {
                throw androidRuntimeException;
            }
        }
        if (this.mNativeObj == 0) {
            AndroidRuntimeException androidRuntimeException2 = new AndroidRuntimeException(KMP.LJ("Bad alloc with ", nativeCreate));
            if (!AnonymousClass028.LJI(androidRuntimeException2, "RTMPUploadBWProbe.RTMPUploadBWProbe@2")) {
            } else {
                throw androidRuntimeException2;
            }
        }
    }

    public void setParameter(TEBundle tEBundle, TEBundle tEBundle2) {
        nativeSetParameter(tEBundle, tEBundle2);
    }

    private void onMessage(int i, int i2, long j, String str) {
        Listener listener = this.mListener;
        if (listener != null) {
            StringBuilder LIZJ = C06460Ne.LIZJ("onMessage from c++ RTMPUploadBWProbe code1: ", i, " , code2: ", i2, " , code3 : ");
            C65232Piu.LIZLLL(LIZJ, j, ", msg: ", str);
            AVLog.logKibana(4, "RTMPUploadBWProbe", X1D.LIZIZ(LIZJ), null);
            listener.onMessage(i, i2, j, str);
        }
    }

    public void OnEvent(int i, int i2, long j, String str) {
        nativeOnEvent(i, i2, j, str);
    }
}
