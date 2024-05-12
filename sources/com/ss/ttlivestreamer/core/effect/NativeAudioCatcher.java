package com.ss.ttlivestreamer.core.effect;

import X.C06490Nh;
import X.C1EU;
import X.X1D;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.AudioSink;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.nio.Buffer;

/* loaded from: classes12.dex */
public class NativeAudioCatcher extends AudioSink {
    public WeakReference<AudioDeviceModule> mAdmWeakRef;
    public int mCatchAudioType;
    public long mNativeAudioCature;
    public int mStatus;

    /* loaded from: classes12.dex */
    public static class NativeObserver extends NativeObject implements Observer {
        public final Observer mObserver;

        @Override // com.ss.ttlivestreamer.core.effect.NativeAudioCatcher.Observer
        public void onCompleteAll() {
            this.mObserver.onCompleteAll();
        }

        public NativeObserver(Observer observer) {
            this.mObserver = observer;
        }

        @Override // com.ss.ttlivestreamer.core.effect.NativeAudioCatcher.Observer
        public void onError(int i, String str) {
            this.mObserver.onError(i, str);
        }

        @Override // com.ss.ttlivestreamer.core.effect.NativeAudioCatcher.Observer
        public void onCompleteOnce(String str, long j, long j2, int i, int i2, int i3) {
            this.mObserver.onCompleteOnce(str, j, j2, i, i2, i3);
        }
    }

    /* loaded from: classes12.dex */
    public interface Observer {
        void onCompleteAll();

        void onCompleteOnce(String str, long j, long j2, int i, int i2, int i3);

        void onError(int i, String str);
    }

    private native long nativeCreate();

    private native boolean nativeInit(long j, String str, long j2, int i, boolean z, long j3, int i2, int i3);

    private native void nativeProcess(long j, Buffer buffer, int i, int i2, int i3, long j2);

    private native void nativeRelease(long j);

    private native void nativeStart(long j, Observer observer);

    private native void nativeStop(long j);

    @Override // com.ss.ttlivestreamer.core.engine.AudioSink
    public void onNoData() {
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        int i = this.mStatus;
        if (i == 3 || i == -1) {
            return;
        }
        this.mStatus = 3;
        AudioDeviceModule audioDeviceModule = this.mAdmWeakRef.get();
        if (audioDeviceModule != null) {
            audioDeviceModule.removeAudioSink(this.mCatchAudioType, this);
        }
        AVLog.iod("NativeAudioCatcher", "release invoked.");
        nativeStop(this.mNativeAudioCature);
        long j = this.mNativeAudioCature;
        if (j != 0) {
            nativeRelease(j);
            this.mNativeAudioCature = 0L;
        }
        super.release();
    }

    public void complete() {
        int i = this.mStatus;
        if (i != -1 && i != 3) {
            this.mStatus = 2;
        }
    }

    public int getStatus() {
        return this.mStatus;
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioSink
    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        int i4;
        long j2 = this.mNativeAudioCature;
        if (j2 != 0 && (i4 = this.mStatus) != -1 && i4 != 2) {
            this.mStatus = 1;
            nativeProcess(j2, buffer, i, i2, i3, j);
        }
    }

    public NativeAudioCatcher(Observer observer, int i, String str, long j, int i2, boolean z, long j2, int i3, int i4, AudioDeviceModule audioDeviceModule) {
        if (LogUtil.logFilterSwitch()) {
            StringBuilder LIZJ = C06490Nh.LIZJ("create NativeAudioCatcher, filePath=", str, ",durationMs=", j);
            LIZJ.append(",format=");
            LIZJ.append(i2);
            LIZJ.append(",periodCatch=");
            LIZJ.append(z);
            C1EU.LIZJ(LIZJ, ",outSampleRate=", i3, "outChannel", i4);
            AVLog.iod("NativeAudioCatcher", X1D.LIZIZ(LIZJ));
        }
        long nativeCreate = nativeCreate();
        if (nativeCreate != 0 && audioDeviceModule != null) {
            this.mNativeAudioCature = nativeCreate;
            if (nativeInit(nativeCreate, str, j, i2, z, j2, i3, i4)) {
                nativeStart(this.mNativeAudioCature, new NativeObserver(observer));
            }
            this.mAdmWeakRef = new WeakReference<>(audioDeviceModule);
            this.mCatchAudioType = i;
            audioDeviceModule.addAudioSink(i, this);
            return;
        }
        this.mStatus = -1;
    }
}
