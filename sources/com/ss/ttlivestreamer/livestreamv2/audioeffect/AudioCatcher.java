package com.ss.ttlivestreamer.livestreamv2.audioeffect;

import X.C16880lQ;
import X.X1D;
import Y.ARunnableS0S0001000_5;
import Y.ARunnableS14S0101000_10;
import Y.ARunnableS2S0202000_8;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.ttlivestreamer.core.effect.NativeAudioCatcher;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioCatcher;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class AudioCatcher {
    public static AudioCatcher instance;
    public final WeakReference<AudioDeviceModule> mADM;
    public ILiveStream.CatchMediaDataCallback mCallback;
    public final Handler mWorkThreadHandler;
    public final HashMap<Integer, NativeAudioCatcher> mAudioSinks = new HashMap<>();
    public int mStatus = 0;

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioCatcher$1 */
    /* loaded from: classes12.dex */
    public class AnonymousClass1 implements NativeAudioCatcher.Observer {
        public final /* synthetic */ int val$audioSinkType;
        public final /* synthetic */ ILiveStream.CatchMediaDataCallback val$callback;

        @Override // com.ss.ttlivestreamer.core.effect.NativeAudioCatcher.Observer
        public void onCompleteAll() {
            DebugLogUtils.isEnableDebugLog();
            AudioCatcher.this.lambda$onComplete$3(r3);
        }

        @Override // com.ss.ttlivestreamer.core.effect.NativeAudioCatcher.Observer
        public void onError(int i, String str) {
            DebugLogUtils.isEnableDebugLog();
            r2.onError(i, str);
        }

        public AnonymousClass1(ILiveStream.CatchMediaDataCallback catchMediaDataCallback, int i) {
            r2 = catchMediaDataCallback;
            r3 = i;
        }

        @Override // com.ss.ttlivestreamer.core.effect.NativeAudioCatcher.Observer
        public void onCompleteOnce(String str, long j, long j2, int i, int i2, int i3) {
            r2.onCompleteOnce(str, j, j2, i, i2, i3);
            DebugLogUtils.isEnableDebugLog();
        }
    }

    public static /* synthetic */ void lambda$Stop$1() {
        AudioCatcher audioCatcher = instance;
        if (audioCatcher != null) {
            audioCatcher.stop();
        }
    }

    public void stop() {
        if (C16880lQ.LLLLIIIILLL() != this.mWorkThreadHandler.getLooper().getThread()) {
            this.mWorkThreadHandler.post(new ARunnableS14S0101000_10(8, this, 0));
            return;
        }
        DebugLogUtils.isEnableDebugLog();
        for (NativeAudioCatcher nativeAudioCatcher : this.mAudioSinks.values()) {
            if (nativeAudioCatcher.getStatus() != 3) {
                nativeAudioCatcher.release();
            }
        }
        instance = null;
        AVLog.ioi("AudioCatcher", "stop done.");
    }

    public static void Stop(Handler handler) {
        handler.post(new ARunnableS0S0001000_5(1, 2));
    }

    /* renamed from: onComplete */
    public void lambda$onComplete$3(final int i) {
        if (C16880lQ.LLLLIIIILLL() != this.mWorkThreadHandler.getLooper().getThread()) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: X.P32
                @Override // java.lang.Runnable
                public final void run() {
                    AudioCatcher.this.lambda$onComplete$3(i);
                }
            });
            return;
        }
        int i2 = this.mStatus;
        if (i2 == -1 || i2 == 2) {
            return;
        }
        NativeAudioCatcher nativeAudioCatcher = this.mAudioSinks.get(Integer.valueOf(i));
        if (nativeAudioCatcher != null) {
            nativeAudioCatcher.complete();
            nativeAudioCatcher.release();
            this.mAudioSinks.remove(Integer.valueOf(i));
        }
        Iterator<NativeAudioCatcher> it = this.mAudioSinks.values().iterator();
        while (it.hasNext()) {
            if (it.next().getStatus() != 2) {
                return;
            }
        }
        AVLog.ioi("AudioCatcher", "All NativeAudioCatcher onComplete");
        this.mStatus = 2;
        ILiveStream.CatchMediaDataCallback catchMediaDataCallback = this.mCallback;
        if (catchMediaDataCallback != null) {
            catchMediaDataCallback.onComplete();
        }
        stop();
    }

    public AudioCatcher(WeakReference<AudioDeviceModule> weakReference, Handler handler) {
        this.mADM = weakReference;
        this.mWorkThreadHandler = handler;
    }

    private void catchAudio(Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        this.mCallback = catchMediaDataCallback;
        if (this.mADM.get() == null || this.mWorkThreadHandler == null || bundle == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("param error: mADM.get() ");
            LIZ.append(this.mADM.get());
            LIZ.append(", mWorkThreadHandler ");
            LIZ.append(this.mWorkThreadHandler);
            LIZ.append(", param ");
            LIZ.append(bundle);
            lambda$onError$2(-201, new Exception(X1D.LIZIZ(LIZ)));
            return;
        }
        float f = bundle.getFloat("duration");
        if (((int) f) <= 0) {
            lambda$onError$2(-201, new Exception("duration should be greater than 0."));
            return;
        }
        String[] strArr = {"outputPathOrigin", "outputPathWith3A", "outputPathWithEffect", "outputPathForLinkMic", "outputPathForPushStream"};
        int[] iArr = {0, 1, 2, 3, 4};
        boolean z = false;
        for (int i = 0; i < 5; i++) {
            String string = bundle.getString(strArr[i]);
            if (!TextUtils.isEmpty(string)) {
                int i2 = bundle.getInt("sampleRate", 16000);
                int i3 = bundle.getInt("sampleChannel", 1);
                long j = bundle.getFloat("segmentDuration") * 1000;
                boolean z2 = bundle.getBoolean("periodCatch", false);
                long j2 = f * 1000;
                if (j == 0 && !z2) {
                    j = j2;
                }
                int i4 = iArr[i];
                this.mAudioSinks.put(Integer.valueOf(i4), new NativeAudioCatcher(new NativeAudioCatcher.Observer() { // from class: com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioCatcher.1
                    public final /* synthetic */ int val$audioSinkType;
                    public final /* synthetic */ ILiveStream.CatchMediaDataCallback val$callback;

                    @Override // com.ss.ttlivestreamer.core.effect.NativeAudioCatcher.Observer
                    public void onCompleteAll() {
                        DebugLogUtils.isEnableDebugLog();
                        AudioCatcher.this.lambda$onComplete$3(r3);
                    }

                    @Override // com.ss.ttlivestreamer.core.effect.NativeAudioCatcher.Observer
                    public void onError(int i5, String str) {
                        DebugLogUtils.isEnableDebugLog();
                        r2.onError(i5, str);
                    }

                    public AnonymousClass1(ILiveStream.CatchMediaDataCallback catchMediaDataCallback2, int i42) {
                        r2 = catchMediaDataCallback2;
                        r3 = i42;
                    }

                    @Override // com.ss.ttlivestreamer.core.effect.NativeAudioCatcher.Observer
                    public void onCompleteOnce(String str, long j3, long j22, int i5, int i22, int i32) {
                        r2.onCompleteOnce(str, j3, j22, i5, i22, i32);
                        DebugLogUtils.isEnableDebugLog();
                    }
                }, i42, string, j, 1, z2, j2, i2, i3, this.mADM.get()));
                z = true;
            }
        }
        if (!z) {
            lambda$onError$2(-201, new Exception("one of \"outputPathOrigin\", \"outputPathWith3A\", \"outputPathWithEffect\", \"outputPathForLinkMic\", \"outputPathForPushStream\" should be specified."));
        } else {
            this.mStatus = 1;
        }
    }

    /* renamed from: onError */
    public void lambda$onError$2(int i, Exception exc) {
        if (C16880lQ.LLLLIIIILLL() != this.mWorkThreadHandler.getLooper().getThread()) {
            this.mWorkThreadHandler.post(new ARunnableS2S0202000_8(i, 2, this, exc, 1));
            return;
        }
        int i2 = this.mStatus;
        if (i2 == -1 || i2 == 2) {
            return;
        }
        this.mStatus = -1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError: error code ");
        LIZ.append(i);
        AVLog.logToIODevice(6, "AudioCatcher", X1D.LIZIZ(LIZ), exc);
        ILiveStream.CatchMediaDataCallback catchMediaDataCallback = this.mCallback;
        if (catchMediaDataCallback != null) {
            catchMediaDataCallback.onError(i, exc.getMessage());
        }
        stop();
    }

    public static void CatchAudio(AudioDeviceModule audioDeviceModule, final Handler handler, final Bundle bundle, final ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        final WeakReference weakReference = new WeakReference(audioDeviceModule);
        handler.post(new Runnable() { // from class: X.P31
            @Override // java.lang.Runnable
            public final void run() {
                AudioCatcher.lambda$CatchAudio$0(ILiveStream.CatchMediaDataCallback.this, weakReference, handler, bundle);
            }
        });
    }

    public static /* synthetic */ void lambda$CatchAudio$0(ILiveStream.CatchMediaDataCallback catchMediaDataCallback, WeakReference weakReference, Handler handler, Bundle bundle) {
        if (instance != null) {
            if (catchMediaDataCallback != null) {
                catchMediaDataCallback.onError(-202, "Already started a catching task.");
            }
        } else {
            AudioCatcher audioCatcher = new AudioCatcher(weakReference, handler);
            instance = audioCatcher;
            audioCatcher.catchAudio(bundle, catchMediaDataCallback);
        }
    }
}
