package com.ss.ttlivestreamer.core.engine;

import X.C00F;
import X.C06460Ne;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C61845OOz;
import X.C84763XOl;
import X.JBR;
import X.KMP;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.capture.audio.AudioFocusChangedCallBackInfo;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.LogUtil;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AudioDeviceModule extends NativeObject {
    public static String ADM_HARDWARE_AUDIOEFFECT_TABLE = "";
    public static AudioManager sAudioManager;
    public boolean aecAutoSwitch;
    public AudioFocusChangedCallBackInfo audioFocusChangedCallBackInfo;
    public int mAdmType;
    public AudioMixer mAudioMixer;
    public int mBGMMode;
    public WeakReference<AudioCapturer.AudioCaptureObserver> mCaptureObserver;
    public Context mContext;
    public int mDiagnosisSwitchFreq;
    public boolean mDisableAudioStreamForLive;
    public float mEarMonitorVolume;
    public boolean mEnableAecOnHeadset;
    public boolean mEnableMuteStatusCheck;
    public boolean mEnableNsInWorkThread;
    public boolean mEnablePipelineOpt;
    public WeakReference<AudioCapturer> mExtAudioCapture;
    public Handler mHandler;
    public boolean mHeadSetStat;
    public boolean mHeadSetStatWithVoip;
    public boolean mIsSupportHardwareEarback;
    public float mMicVolume;
    public boolean mNativObjReleased;
    public final NativeADMObserver mObserver;
    public final TEBundle mParam;
    public HeadsetPlugReceiver mReceiver;
    public List<AudioFocusChangedCallBack> mRecordCallbackList;
    public boolean mRelease;
    public boolean mServerMixStopBaestream;
    public float mSoftwareEarMonitorVolume;
    public boolean mStatusBluetoothIsConnected;
    public boolean mStatusHeadSetIsConnected;
    public boolean mStatusIsVoIPMode;

    /* loaded from: classes12.dex */
    public interface AudioFocusChangedCallBack {
        void onRecordingConfigChanged(List<AudioFocusChangedCallBackInfo.RecordCallbackInfo> list);
    }

    /* loaded from: classes12.dex */
    public static class AudioRenderSink extends AudioSink {
        public volatile boolean mReleased;
        public final Handler mWorkHandler;

        @Override // com.ss.ttlivestreamer.core.engine.AudioSink
        public void onNoData() {
        }

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public synchronized void release() {
            if (this.mReleased) {
                return;
            }
            this.mReleased = true;
            Handler handler = this.mWorkHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.AudioRenderSink.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_core_engine_AudioDeviceModule$AudioRenderSink$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$AudioRenderSink$3__run$___twin___() {
                        AudioDeviceModule.nativeRenderSinkRelease(AudioRenderSink.this.mNativeObj);
                        AudioRenderSink.this.setNativeObj(0L);
                    }

                    public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$AudioRenderSink$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                        boolean LIZ;
                        try {
                            anonymousClass3.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$AudioRenderSink$3__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            } else {
                AudioDeviceModule.nativeRenderSinkRelease(this.mNativeObj);
                setNativeObj(0L);
            }
        }

        public long getQuirks() {
            return AudioDeviceModule.nativeRenderSinkGetQuirks(this.mNativeObj);
        }

        public long getRenderDelayMs() {
            return AudioDeviceModule.nativeRenderDelayMs(this.mNativeObj);
        }

        public int getRenderTrackId() {
            return AudioDeviceModule.nativeRenderSinkTrackId(this.mNativeObj);
        }

        public boolean isEnableAGC() {
            return AudioDeviceModule.nativeRenderSinkisEnableAgc(this.mNativeObj);
        }

        public boolean isMute() {
            return AudioDeviceModule.nativeRenderSinkIsMute(this.mNativeObj);
        }

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public void finalize() {
            release();
        }

        public AudioRenderSink(long j) {
            this(j, null);
        }

        public void enableMix2Output(boolean z) {
            AudioDeviceModule.nativeRenderSinkMix2Output(this.mNativeObj, z);
        }

        public double getOption(int i) {
            return AudioDeviceModule.nativeRenderSinkGetOption(this.mNativeObj, i);
        }

        public void openForceMediaMode(Boolean bool) {
            AudioDeviceModule.nativeRenderSinkOpenForceMediaMode(this.mNativeObj, bool.booleanValue());
        }

        public void setAudioLoudNormParam(float f) {
            AudioDeviceModule.nativeSetAudioLoudNormParam(this.mNativeObj, f);
        }

        public void setAudioTrack(AudioTrack audioTrack) {
            AudioDeviceModule.nativeSetAudioTrack(this.mNativeObj, audioTrack);
        }

        public void setMute(boolean z) {
            AudioDeviceModule.nativeRenderSinkSetMute(this.mNativeObj, z);
        }

        public void setPlayerVolume(float f) {
            AudioDeviceModule.nativeRenderSinkSetPlayerVolume(this.mNativeObj, f);
        }

        public void setQuirks(final long j) {
            Handler handler = this.mWorkHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.AudioRenderSink.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_core_engine_AudioDeviceModule$AudioRenderSink$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$AudioRenderSink$2__run$___twin___() {
                        AudioDeviceModule.nativeRenderSinkSetQuirks(AudioRenderSink.this.mNativeObj, j);
                    }

                    public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$AudioRenderSink$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                        boolean LIZ;
                        try {
                            anonymousClass2.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$AudioRenderSink$2__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            } else {
                AudioDeviceModule.nativeRenderSinkSetQuirks(this.mNativeObj, j);
            }
        }

        public void setVolume(final float f) {
            Handler handler = this.mWorkHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.AudioRenderSink.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_core_engine_AudioDeviceModule$AudioRenderSink$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$AudioRenderSink$1__run$___twin___() {
                        AudioDeviceModule.nativeRenderSinkSetVolume(AudioRenderSink.this.mNativeObj, f);
                    }

                    public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$AudioRenderSink$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$AudioRenderSink$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            } else {
                AudioDeviceModule.nativeRenderSinkSetVolume(this.mNativeObj, f);
            }
        }

        public AudioRenderSink(long j, Handler handler) {
            setNativeObj(j);
            this.mWorkHandler = handler;
        }

        public void setEnableAGC(boolean z, boolean z2) {
            AudioDeviceModule.nativeRenderSinkEnableAgc(this.mNativeObj, z, z2);
        }

        @Override // com.ss.ttlivestreamer.core.engine.AudioSink
        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
            AudioDeviceModule.nativeRenderSinkData(this.mNativeObj, buffer, i, i2, i3, j);
        }
    }

    /* loaded from: classes12.dex */
    public interface Observer {
        void onADMInfo(int i, int i2, long j);
    }

    private native void nativeAddAudioSink(int i, AudioSink audioSink);

    private native void nativeClearLogState();

    private native long nativeCreate(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Context context, IntBuffer intBuffer, int i, boolean z);

    private native long nativeCreateRenderSink(int i);

    private native long nativeCreateRenderSinkV2(int i, int i2, int i3);

    private native void nativeDisableLocalAudioStream(boolean z);

    private native void nativeEnableAdmObserver(boolean z);

    private native void nativeEnableBuiltInAEC(boolean z);

    private native void nativeEnableBuiltInAGC(boolean z);

    private native void nativeEnableBuiltInNS(boolean z, TEBundle tEBundle);

    private native void nativeEnableCalculateAudioLoudness(boolean z);

    private native void nativeEnableEarMonitorRoute(boolean z);

    private native void nativeEnableEchoMode(boolean z);

    private native void nativeEnableExternalSoundCard(boolean z);

    private native void nativeEnableHardwareEchoMode(boolean z);

    private native void nativeEnableLocalRecord(boolean z);

    private native void nativeEnableNew3ARmsStatistics(boolean z);

    private native void nativeEnableOuterFarend(boolean z);

    private native void nativeEnableRemoteAudio(boolean z);

    private native void nativeEnableSoftwareEchoMode(boolean z);

    private native String nativeGetAudioDiagnosisScore();

    private native long nativeGetCaptureTimeDiff();

    private native String nativeGetDiagnosisFinalResult();

    private native long nativeGetLatestAudioPts();

    private native float nativeGetMicVolumedB();

    private native long nativeGetNowTimeDiff();

    private native double nativeGetOption(int i);

    private native TEBundle nativeGetParameter();

    private native long nativeGetRenderMixer();

    private native String nativeGetReportStats();

    private native int nativeGetResetPtsIndex();

    private native boolean nativeIsDisableLocalAudioStream();

    private native boolean nativeIsEchoMode();

    private native boolean nativeIsEnableBuiltInAEC();

    private native boolean nativeIsEnableBuiltInAGC();

    private native boolean nativeIsEnableBuiltInNS();

    private native boolean nativeIsExternalRecording();

    private native boolean nativeIsMicSilenced();

    private native boolean nativeIsPlayer();

    private native boolean nativeIsRecoding();

    private native boolean nativeIsResumeStatus();

    private native boolean nativeIsSeperateRecordingCallback();

    private native boolean nativeIsVoIPMode();

    private native void nativePushOuterAudioFarend(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    private native void nativeRegisterObserver(Observer observer);

    private native void nativeRemoveAudioSink(int i, AudioSink audioSink);

    public static native long nativeRenderDelayMs(long j);

    public static native void nativeRenderSinkData(long j, Buffer buffer, int i, int i2, int i3, long j2);

    public static native void nativeRenderSinkEnableAgc(long j, boolean z, boolean z2);

    public static native double nativeRenderSinkGetOption(long j, int i);

    public static native long nativeRenderSinkGetQuirks(long j);

    public static native boolean nativeRenderSinkIsMute(long j);

    public static native void nativeRenderSinkMix2Output(long j, boolean z);

    public static native void nativeRenderSinkOpenForceMediaMode(long j, boolean z);

    public static native void nativeRenderSinkRelease(long j);

    public static native void nativeRenderSinkSetMute(long j, boolean z);

    public static native void nativeRenderSinkSetPlayerVolume(long j, float f);

    public static native void nativeRenderSinkSetQuirks(long j, long j2);

    public static native void nativeRenderSinkSetVolume(long j, float f);

    public static native int nativeRenderSinkTrackId(long j);

    public static native boolean nativeRenderSinkisEnableAgc(long j);

    private native void nativeSetAudioCaptureMute(boolean z);

    private native void nativeSetAudioCaptureVolume(float f);

    public static native void nativeSetAudioLoudNormParam(long j, float f);

    private native void nativeSetAudioProcessor(AudioProcessor audioProcessor);

    private native void nativeSetAudioQuantizeGapPeriod(long j);

    private native void nativeSetAudioScenario(int i);

    public static native int nativeSetAudioTrack(long j, AudioTrack audioTrack);

    private native void nativeSetDiagnosisModelPath(Object obj);

    private native void nativeSetExternalRecording(boolean z);

    private native void nativeSetInputStreamMute(boolean z);

    private native void nativeSetInputStreamVolume(float f);

    private native void nativeSetParameter(TEBundle tEBundle);

    private native void nativeSetRecordingCallback(AudioSink audioSink);

    private native void nativeSetTimeSyncMode(int i);

    private native void nativeSetTuningName(Object obj);

    private native void nativeSetTuningType(int i, Object obj);

    private native void nativeUpdateOriginTrackIndex(int i);

    private native void nativesetHeadSetStat(boolean z);

    private synchronized void releaseAllAudioRecordingCbs() {
        unRegisterAudioRecordingCallback();
        this.mRecordCallbackList.clear();
    }

    private synchronized void unRegisterAudioRecordingCallback() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.mRecordCallbackList.size() == 0) {
                return;
            }
            Iterator<AudioFocusChangedCallBack> it = this.mRecordCallbackList.iterator();
            while (it.hasNext()) {
                this.mRecordCallbackList.remove(it.next());
            }
        }
    }

    public long getCaptureDelayMs() {
        return (long) getOption(5);
    }

    public float getMicVolumedB() {
        return (float) getOption(3);
    }

    public long getPlayerDelayMs() {
        return (long) getOption(4);
    }

    public synchronized AudioMixer getRenderMixer() {
        if (this.mAudioMixer == null) {
            this.mAudioMixer = new InteralAudioMixer(nativeGetRenderMixer());
        }
        return this.mAudioMixer;
    }

    public native void nativeEnableAsyncProcess(boolean z);

    public native void nativeEnableAudioPushStream(boolean z);

    public native int nativeEnableServerCfg();

    public native void nativeInitEarMonitor();

    public native boolean nativeIsMicMute();

    public native boolean nativeIsSupportHardwareEarMonitor();

    public native boolean nativeIsSupportSoftwareEarMonitor();

    public native int nativeMicVolume(float f, boolean z);

    public native void nativeRelease();

    public native void nativeResetRecordingPlayer(int i);

    public native void nativeResumeStatus(boolean z);

    public native int nativeSetHardwareEarMonitorVolume(float f);

    public native int nativeSetSoftwareEarMonitorVolume(float f);

    public native int nativeStartPlayer();

    public native int nativeStartRecording();

    public native int nativeStopPlayer();

    public native int nativeStopRecording();

    public native void nativeSwitchToVoIP(boolean z);

    public native void nativesetBluetoothState(boolean z);

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        HeadsetPlugReceiver headsetPlugReceiver;
        Handler handler = this.mHandler;
        if (handler != null && handler.getLooper().getThread() != C16880lQ.LLLLIIIILLL()) {
            String name = this.mHandler.getLooper().getThread().getName();
            String name2 = C16880lQ.LLLLIIIILLL().getName();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release ADM ");
            LIZ.append(this);
            LIZ.append(" on thread \"");
            LIZ.append(name2);
            LIZ.append("\", handler's thread is \"");
            LIZ.append(name);
            LIZ.append("\", stack: ");
            AVLog.logToIODevice(4, "AudioDeviceModule", X1D.LIZIZ(LIZ), new Throwable());
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("release ADM ");
            LIZ2.append(this);
            AVLog.ioi("AudioDeviceModule", X1D.LIZIZ(LIZ2));
        }
        AudioMixer audioMixer = this.mAudioMixer;
        if (audioMixer != null) {
            audioMixer.release();
            this.mAudioMixer = null;
        }
        nativeRegisterObserver(null);
        boolean post = this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.18
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$18__run$___twin___() {
                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                audioDeviceModule.mNativObjReleased = true;
                audioDeviceModule.nativeRelease();
                AudioDeviceModule.this.setNativeObj(0L);
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass18 anonymousClass18) {
                boolean LIZ3;
                try {
                    anonymousClass18.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$18__run$___twin___();
                } finally {
                    if (LIZ3) {
                    }
                }
            }
        });
        Context context = this.mContext;
        if (context != null && (headsetPlugReceiver = this.mReceiver) != null) {
            C16880lQ.LJJLIIIJL(context, headsetPlugReceiver);
            this.mContext = null;
            this.mReceiver = null;
        }
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.release();
        }
        if (!post) {
            nativeRelease();
            setNativeObj(0L);
        }
        this.mParam.release();
        this.mRelease = true;
    }

    /* loaded from: classes12.dex */
    public class InteralAudioMixer extends AudioMixer {
        @Override // com.ss.ttlivestreamer.core.mixer.Mixer
        public void setOriginTrackIndex(int i) {
        }

        @Override // com.ss.ttlivestreamer.core.mixer.Mixer
        public boolean enable() {
            return super.enable();
        }

        @Override // com.ss.ttlivestreamer.core.mixer.Mixer
        public void setEnable(boolean z) {
            super.setEnable(z);
            AudioDeviceModule.this.mObserver.onADMInfo(4, enable() ? 1 : 0, 0L);
        }

        public InteralAudioMixer(long j) {
            super(j);
        }
    }

    public static int getMode() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.getMode();
        }
        return 0;
    }

    public static boolean isMicMute() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.isMicrophoneMute();
        }
        return true;
    }

    public static boolean isSpeakerphoneOn() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.isSpeakerphoneOn();
        }
        return false;
    }

    public void EnableServerCfg() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.13
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$13__run$___twin___() {
                AudioDeviceModule.this.nativeEnableServerCfg();
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
                boolean LIZ;
                try {
                    anonymousClass13.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$13__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void audioRouteChanged() {
        Handler handler = this.mHandler;
        if (handler == null || !handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$1__run$___twin___() {
                AudioDeviceModule.this.onAudioRouteChanged();
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        })) {
            onAudioRouteChanged();
        }
    }

    public void checkMicrophoneMuteStatus() {
        Context context;
        AudioManager audioManager;
        if (this.mAdmType != 1 || !this.mEnableMuteStatusCheck || (context = this.mContext) == null || (audioManager = (AudioManager) C16880lQ.LLILL(context, "audio")) == null || !audioManager.isMicrophoneMute()) {
            return;
        }
        AVLog.logKibanaEvent(5, "AudioDeviceModule", "hardware_micphone_muted", false, null, null);
        audioManager.setMicrophoneMute(false);
    }

    public AudioRenderSink createRenderSink() {
        return new AudioRenderSink(nativeCreateRenderSink(0), this.mHandler);
    }

    public void disableAudioStreamForLive() {
        AVLog.logKibana(5, "AudioDeviceModule", "disableAudioStreamForLive", null);
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.22
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$22__run$___twin___() {
                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                if (!audioDeviceModule.mRelease) {
                    audioDeviceModule.nativeEnableAudioPushStream(false);
                    AudioDeviceModule.this.mDisableAudioStreamForLive = true;
                }
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass22 anonymousClass22) {
                boolean LIZ;
                try {
                    anonymousClass22.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$22__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public JSONObject getAudioDiagnosisScore() {
        try {
            return new JSONObject(nativeGetAudioDiagnosisScore()).optJSONObject("score");
        } catch (Throwable unused) {
            return null;
        }
    }

    public void onAudioRouteChanged() {
        AudioManager audioManager = sAudioManager;
        if (audioManager == null) {
            return;
        }
        boolean z = this.mStatusIsVoIPMode;
        boolean z2 = this.mStatusBluetoothIsConnected;
        boolean z3 = this.mStatusHeadSetIsConnected;
        if (LogUtil.logFilterSwitch()) {
            StringBuilder LIZLLL = C00F.LIZLLL("onAudioRouteChanged voip ", z, " bluetooth ", z2, " headset ");
            LIZLLL.append(z3);
            AVLog.iod("AudioDeviceModule", X1D.LIZIZ(LIZLLL));
        }
        if (z) {
            if (z3) {
                changeToHeadset(audioManager);
                return;
            } else if (z2) {
                changeToBluetooth(audioManager);
                return;
            } else {
                changeToSpeaker(audioManager);
                return;
            }
        }
        changeToSpeaker(audioManager);
    }

    public void pause() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.19
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$19__run$___twin___() {
                AudioDeviceModule.this.nativeResumeStatus(false);
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass19 anonymousClass19) {
                boolean LIZ;
                try {
                    anonymousClass19.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$19__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void resume() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.20
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$20__run$___twin___() {
                AudioDeviceModule.this.nativeResumeStatus(true);
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass20 anonymousClass20) {
                boolean LIZ;
                try {
                    anonymousClass20.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$20__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void setupHeadsetListener() {
        if (this.mContext != null && this.mReceiver == null) {
            this.mReceiver = new HeadsetPlugReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
            C16880lQ.LJJLIIIJILLIZJL(this.mReceiver, this.mContext, intentFilter);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setupHeadsetListener skiped  mAdmType ");
        LIZ.append(this.mAdmType);
        LIZ.append(" ");
        LIZ.append(this);
        AVLog.ioi("AudioDeviceModule", X1D.LIZIZ(LIZ));
    }

    public int startPlayer() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.15
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$15__run$___twin___() {
                AudioDeviceModule.this.nativeStartPlayer();
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass15 anonymousClass15) {
                boolean LIZ;
                try {
                    anonymousClass15.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$15__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }

    public int startRecording() {
        AVLog.logKibana(5, "AudioDeviceModule", "startRecording", null);
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.14
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$14__run$___twin___() {
                AudioCapturer.AudioCaptureObserver audioCaptureObserver;
                AudioDeviceModule.this.checkMicrophoneMuteStatus();
                int nativeStartRecording = AudioDeviceModule.this.nativeStartRecording();
                if (nativeStartRecording != 0 && (audioCaptureObserver = AudioDeviceModule.this.mCaptureObserver.get()) != null) {
                    audioCaptureObserver.onAudioCaptureError(nativeStartRecording, new Exception(KMP.LJ("ADM start recording failed: ", nativeStartRecording)));
                }
                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                if (audioDeviceModule.mDisableAudioStreamForLive) {
                    audioDeviceModule.nativeEnableAudioPushStream(false);
                }
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
                boolean LIZ;
                try {
                    anonymousClass14.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$14__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }

    public int stopPlayer() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.17
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$17__run$___twin___() {
                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                if (!audioDeviceModule.mRelease) {
                    audioDeviceModule.nativeStopPlayer();
                }
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass17 anonymousClass17) {
                boolean LIZ;
                try {
                    anonymousClass17.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$17__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }

    public int stopRecording() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.16
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$16__run$___twin___() {
                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                if (!audioDeviceModule.mRelease) {
                    audioDeviceModule.nativeStopRecording();
                }
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass16 anonymousClass16) {
                boolean LIZ;
                try {
                    anonymousClass16.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$16__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }

    public long getCaptureTimeDiff() {
        return nativeGetCaptureTimeDiff();
    }

    public String getDiagnosisFinalResult() {
        return nativeGetDiagnosisFinalResult();
    }

    public long getLatestAudioPts() {
        return nativeGetLatestAudioPts();
    }

    public long getNowTimeDiff() {
        return nativeGetNowTimeDiff();
    }

    public TEBundle getParameter() {
        TEBundle nativeGetParameter = nativeGetParameter();
        synchronized (this.mParam) {
            this.mParam.updateFrom(nativeGetParameter);
        }
        return nativeGetParameter;
    }

    public JSONObject getReportJsonStats() {
        boolean z;
        String str;
        String str2;
        String nativeGetReportStats = nativeGetReportStats();
        int admType = getAdmType();
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(nativeGetReportStats)) {
                try {
                    jSONObject = new JSONObject(nativeGetReportStats);
                } catch (JSONException unused) {
                    jSONObject.put("adm_native_exp_error", nativeGetReportStats);
                }
            }
            jSONObject.put("adm_type", admType);
            jSONObject.put("bluetooth", this.mStatusBluetoothIsConnected);
            jSONObject.put("headset", this.mStatusHeadSetIsConnected);
            jSONObject.put("is_mute", nativeIsMicMute());
            jSONObject.put("is_silenced", nativeIsMicSilenced());
            jSONObject.put("aec_enable", isEnableBuiltInAEC());
            if (!nativeIsResumeStatus()) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("is_paused", z);
            jSONObject.put("mic_volume", this.mMicVolume);
            jSONObject.put("echo_volume", this.mEarMonitorVolume);
            jSONObject.put("is_support_hardware_earback", this.mIsSupportHardwareEarback);
            jSONObject.put("stereo_process", this.mParam.getBool("enableStereoProcess"));
            if (admType == 0) {
                jSONObject.put("voip", this.mStatusIsVoIPMode);
                synchronized (this.mParam) {
                    if (this.mParam.contains("adm_recording_type")) {
                        str = this.mParam.getString("adm_recording_type");
                    } else {
                        str = "opensles";
                    }
                    if (this.mParam.contains("adm_player_type")) {
                        str2 = this.mParam.getString("adm_player_type");
                    } else {
                        str2 = "opensles";
                    }
                    jSONObject.put("adm_recording_type", str);
                    jSONObject.put("adm_player_type", str2);
                }
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public int getResetPtsIndex() {
        return nativeGetResetPtsIndex();
    }

    public boolean isDisableLocalAudioStream() {
        return nativeIsDisableLocalAudioStream();
    }

    public boolean isEchoMode() {
        return nativeIsEchoMode();
    }

    public boolean isEnableBuiltInAEC() {
        return nativeIsEnableBuiltInAEC();
    }

    public boolean isEnableBuiltInAGC() {
        return nativeIsEnableBuiltInAGC();
    }

    public boolean isEnableBuiltInNS() {
        return nativeIsEnableBuiltInNS();
    }

    public boolean isExternalRecording() {
        return nativeIsExternalRecording();
    }

    public boolean isMicOccupiedSilenced() {
        return nativeIsMicSilenced();
    }

    public boolean isMute() {
        return nativeIsMicMute();
    }

    public boolean isPlayer() {
        return nativeIsPlayer();
    }

    public boolean isRecording() {
        return nativeIsRecoding();
    }

    public boolean isSeperateRecordingCallback() {
        return nativeIsSeperateRecordingCallback();
    }

    public boolean isVoIPMode() {
        return nativeIsVoIPMode();
    }

    public int stopRecordingOnCurrentThread() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopRecordingOnCurrentThread: ");
        LIZ.append(this.mNativObjReleased);
        AVLog.iow("AudioDeviceModule", X1D.LIZIZ(LIZ));
        if (!this.mNativObjReleased) {
            nativeStopRecording();
            return 0;
        }
        return 0;
    }

    public void clearLogState() {
        nativeClearLogState();
    }

    public int getAdmType() {
        return this.mAdmType;
    }

    public boolean isBluetoothConnected() {
        return this.mStatusBluetoothIsConnected;
    }

    public boolean isHeadSet() {
        return this.mHeadSetStat;
    }

    /* loaded from: classes12.dex */
    public class HeadsetPlugReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com_ss_ttlivestreamer_core_engine_AudioDeviceModule$HeadsetPlugReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
        }

        public HeadsetPlugReceiver() {
        }

        public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$HeadsetPlugReceiver__onReceive$___twin___(Context context, Intent intent) {
            String action = intent.getAction();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("action:");
            LIZ.append(action);
            AVLog.iod("AudioDeviceModule", X1D.LIZIZ(LIZ));
            if (action.equals("android.intent.action.HEADSET_PLUG")) {
                int intExtra = intent.getIntExtra("state", 0);
                if (intExtra == 0) {
                    AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                    audioDeviceModule.mStatusHeadSetIsConnected = false;
                    audioDeviceModule.setHeadSetStat(false);
                } else if (intExtra == 1) {
                    AudioDeviceModule audioDeviceModule2 = AudioDeviceModule.this;
                    audioDeviceModule2.mStatusHeadSetIsConnected = true;
                    audioDeviceModule2.setHeadSetStat(true);
                }
            } else if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                AudioDeviceModule.this.updateBluetoothIndication(intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0));
                AudioDeviceModule audioDeviceModule3 = AudioDeviceModule.this;
                audioDeviceModule3.setBluetoothStat(audioDeviceModule3.mStatusBluetoothIsConnected);
            } else {
                "android.media.AUDIO_BECOMING_NOISY".equals(action);
            }
            AudioDeviceModule.this.audioRouteChanged();
        }

        public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$HeadsetPlugReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(HeadsetPlugReceiver headsetPlugReceiver, Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                headsetPlugReceiver.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$HeadsetPlugReceiver__onReceive$___twin___(context, intent);
            } else {
                C38523F9z.LIZ();
                headsetPlugReceiver.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$HeadsetPlugReceiver__onReceive$___twin___(context, intent);
            }
        }

        public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$HeadsetPlugReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(HeadsetPlugReceiver headsetPlugReceiver, Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            com_ss_ttlivestreamer_core_engine_AudioDeviceModule$HeadsetPlugReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(headsetPlugReceiver, context, intent);
        }
    }

    /* loaded from: classes12.dex */
    public class NativeADMObserver extends NativeObject implements Observer {
        public Observer mObserver;

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public synchronized void release() {
            this.mObserver = null;
            super.release();
        }

        public void recordCallBack(String str) {
            try {
                List<AudioFocusChangedCallBackInfo.RecordCallbackInfo> recordItemLists = AudioDeviceModule.this.audioFocusChangedCallBackInfo.getRecordItemLists();
                if (recordItemLists == null) {
                    return;
                }
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    recordItemLists.add(new AudioFocusChangedCallBackInfo.RecordCallbackInfo(JSONObjectProtectorUtils.getInt(jSONObject, "audioSessionId"), JSONObjectProtectorUtils.getInt(jSONObject, "clientAudioSource"), JSONObjectProtectorUtils.getInt(jSONObject, "audioSource"), JSONObjectProtectorUtils.getInt(jSONObject, "isClientSilenced"), JSONObjectProtectorUtils.getInt(jSONObject, "isBySelf")));
                }
                Iterator<AudioFocusChangedCallBack> it = AudioDeviceModule.this.mRecordCallbackList.iterator();
                while (it.hasNext()) {
                    it.next().onRecordingConfigChanged(recordItemLists);
                }
                recordItemLists.clear();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }

        public void registerObserver(Observer observer) {
            this.mObserver = observer;
        }

        public NativeADMObserver(Observer observer) {
            this.mObserver = observer;
        }

        @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.Observer
        public void onADMInfo(int i, final int i2, long j) {
            if (LogUtil.logFilterSwitch()) {
                StringBuilder LIZJ = C06460Ne.LIZJ("AudioDeviceModule.java onADMInfo ", i, " ", i2, " ");
                LIZJ.append(j);
                AVLog.d("AudioDeviceModule", X1D.LIZIZ(LIZJ));
            }
            Observer observer = this.mObserver;
            if (observer != null) {
                observer.onADMInfo(i, i2, j);
            }
            if (i == 8) {
                int mode = AudioDeviceModule.getMode();
                if (mode == 3 || mode == 2) {
                    AudioDeviceModule.this.mStatusIsVoIPMode = true;
                } else {
                    AudioDeviceModule.this.mStatusIsVoIPMode = false;
                }
                AudioDeviceModule.this.audioRouteChanged();
                return;
            }
            if (i == 9) {
                Handler handler = AudioDeviceModule.this.mHandler;
                if (handler == null) {
                    return;
                }
                handler.postDelayed(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.NativeADMObserver.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_core_engine_AudioDeviceModule$NativeADMObserver$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$NativeADMObserver$1__run$___twin___() {
                        AudioDeviceModule.this.nativeResetRecordingPlayer(i2);
                    }

                    public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$NativeADMObserver$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$NativeADMObserver$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                }, 200L);
                return;
            }
            if (i != 10) {
                return;
            }
            if (j == 1) {
                AudioDeviceModule.this.mIsSupportHardwareEarback = true;
            } else {
                if (j != 0) {
                    return;
                }
                AudioDeviceModule.this.mIsSupportHardwareEarback = false;
            }
        }
    }

    private void changeToBluetooth(AudioManager audioManager) {
        try {
            audioManager.startBluetoothSco();
        } catch (Throwable unused) {
        }
        try {
            audioManager.setBluetoothScoOn(true);
        } catch (Throwable unused2) {
        }
        setSpeakerphoneOn(false);
    }

    private void changeToHeadset(AudioManager audioManager) {
        try {
            audioManager.stopBluetoothSco();
        } catch (Throwable unused) {
        }
        try {
            audioManager.setBluetoothScoOn(false);
        } catch (Throwable unused2) {
        }
        setSpeakerphoneOn(false);
    }

    private void changeToSpeaker(AudioManager audioManager) {
        try {
            audioManager.stopBluetoothSco();
        } catch (Throwable unused) {
        }
        try {
            audioManager.setBluetoothScoOn(false);
        } catch (Throwable unused2) {
        }
        setSpeakerphoneOn(true);
    }

    private void enableAEC(boolean z) {
        nativeEnableBuiltInAEC(z);
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.onADMInfo(2, isEnableBuiltInAEC() ? 1 : 0, 0L);
        }
    }

    private void initAudioRouteStatus(AudioManager audioManager) {
        boolean z;
        boolean z2 = false;
        if (audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn()) {
            z = true;
        } else {
            z = false;
        }
        this.mStatusBluetoothIsConnected = z;
        if (audioManager.getMode() == 2 || audioManager.getMode() == 3) {
            z2 = true;
        }
        this.mStatusIsVoIPMode = z2;
        try {
            this.mStatusHeadSetIsConnected = audioManager.isWiredHeadsetOn();
        } catch (Throwable unused) {
        }
    }

    public static boolean isValidAdmApiType(String str) {
        if (str == null || str.equalsIgnoreCase("opensles") || str.equalsIgnoreCase("aaudio") || str.equalsIgnoreCase("audiorecord")) {
            return true;
        }
        return false;
    }

    public static void setMode(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Setup mode ");
        LIZ.append(i);
        AVLog.iod("AudioDeviceModule", X1D.LIZIZ(LIZ));
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            audioManager.setMode(i);
        }
    }

    public static void setSpeakerphoneOn(boolean z) {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            try {
                audioManager.setSpeakerphoneOn(z);
            } catch (Throwable unused) {
            }
        }
    }

    private void updateOriginTrackIndex(int i) {
        nativeUpdateOriginTrackIndex(i);
    }

    public AudioRenderSink createRenderSink(int i) {
        return new AudioRenderSink(nativeCreateRenderSink(i), this.mHandler);
    }

    public void disableLocalAudioStream(boolean z) {
        nativeDisableLocalAudioStream(z);
    }

    public void enableAdmObserver(boolean z) {
        StringBuilder LJI = JBR.LJI("enableAdmObserver:", z, ",EnablePipelineOpt:");
        LJI.append(this.mEnablePipelineOpt);
        AVLog.logKibana(5, "AudioDeviceModule", X1D.LIZIZ(LJI), null);
        if (this.mEnablePipelineOpt) {
            nativeEnableAdmObserver(z);
        }
    }

    public void enableAecAutoSwitch(boolean z) {
        this.aecAutoSwitch = z;
        if (z) {
            enableAEC(false);
        }
    }

    public void enableAecOnHeadSetMode(boolean z) {
        this.mEnableAecOnHeadset = z;
    }

    public void enableAsyncProcess(final boolean z) {
        StringBuilder LJI = JBR.LJI("enableAsyncProcess:", z, ",EnablePipelineOpt:");
        LJI.append(this.mEnablePipelineOpt);
        AVLog.logKibana(5, "AudioDeviceModule", X1D.LIZIZ(LJI), null);
        if (!this.mEnablePipelineOpt) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.23
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$23__run$___twin___() {
                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                if (!audioDeviceModule.mRelease) {
                    audioDeviceModule.nativeEnableAsyncProcess(z);
                }
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass23 anonymousClass23) {
                boolean LIZ;
                try {
                    anonymousClass23.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$23__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void enableAudioPushStream(final boolean z) {
        StringBuilder LJI = JBR.LJI("enableAudioPushStream:", z, ",cfg:");
        LJI.append(this.mServerMixStopBaestream);
        AVLog.logKibana(5, "AudioDeviceModule", X1D.LIZIZ(LJI), null);
        if (!this.mServerMixStopBaestream) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.21
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$21__run$___twin___() {
                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                if (!audioDeviceModule.mRelease) {
                    audioDeviceModule.nativeEnableAudioPushStream(z);
                }
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass21 anonymousClass21) {
                boolean LIZ;
                try {
                    anonymousClass21.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$21__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void enableBuiltInAEC(boolean z) {
        if (this.aecAutoSwitch) {
            return;
        }
        enableAEC(z);
    }

    public void enableBuiltInAGC(boolean z) {
        nativeEnableBuiltInAGC(z);
        this.mObserver.onADMInfo(6, isEnableBuiltInAGC() ? 1 : 0, 0L);
    }

    public void enableBuiltInNS(final boolean z) {
        if (this.mEnableNsInWorkThread) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.12
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_core_engine_AudioDeviceModule$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$12__run$___twin___() {
                        AudioDeviceModule.this.enableBuiltInNsInternal(z);
                    }

                    public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
                        boolean LIZ;
                        try {
                            anonymousClass12.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$12__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        enableBuiltInNsInternal(z);
    }

    public void enableBuiltInNsInternal(boolean z) {
        TEBundle tEBundle = new TEBundle();
        nativeEnableBuiltInNS(z, tEBundle);
        this.mObserver.onADMInfo(7, isEnableBuiltInNS() ? 1 : 0, 0L);
        tEBundle.release();
    }

    public void enableCalculateAudioLoudness(boolean z) {
        nativeEnableCalculateAudioLoudness(z);
    }

    public void enableEarMonitorRoute(boolean z) {
        nativeEnableEarMonitorRoute(z);
    }

    public void enableEchoMode(final boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.9
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$9__run$___twin___() {
                AudioDeviceModule.this.enableEchoModeInternal(z);
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                boolean LIZ;
                try {
                    anonymousClass9.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$9__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void enableEchoModeInternal(boolean z) {
        if (this.aecAutoSwitch && z && isEnableBuiltInAEC()) {
            enableAEC(false);
        }
        nativeEnableEchoMode(z);
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.onADMInfo(3, isEchoMode() ? 1 : 0, 0L);
        }
    }

    public void enableExternalSoundCard(boolean z) {
        nativeEnableExternalSoundCard(z);
    }

    public void enableHardwareEchoMode(final boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.10
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$10__run$___twin___() {
                AudioDeviceModule.this.enableHardwareEchoModeInternal(z);
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                boolean LIZ;
                try {
                    anonymousClass10.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$10__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void enableHardwareEchoModeInternal(boolean z) {
        if (this.aecAutoSwitch && z && isEnableBuiltInAEC()) {
            enableAEC(false);
        }
        nativeEnableHardwareEchoMode(z);
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.onADMInfo(3, isEchoMode() ? 1 : 0, 0L);
        }
    }

    public void enableLocalRecord(boolean z) {
        nativeEnableLocalRecord(z);
    }

    public void enableMicMuteStatusCheck(boolean z) {
        this.mEnableMuteStatusCheck = z;
    }

    public void enableNew3ARmsStatistics(boolean z) {
        nativeEnableNew3ARmsStatistics(z);
    }

    public void enableOuterAudioFarend(boolean z) {
        nativeEnableOuterFarend(z);
    }

    public void enableRemoteAudio(boolean z) {
        nativeEnableRemoteAudio(z);
    }

    public void enableSoftwareEchoMode(final boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.11
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$11__run$___twin___() {
                AudioDeviceModule.this.enableSoftwareEchoModeInternal(z);
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                boolean LIZ;
                try {
                    anonymousClass11.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$11__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void enableSoftwareEchoModeInternal(boolean z) {
        if (this.aecAutoSwitch && z && isEnableBuiltInAEC()) {
            enableAEC(false);
        }
        nativeEnableSoftwareEchoMode(z);
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.onADMInfo(3, isEchoMode() ? 1 : 0, 0L);
        }
    }

    public double getOption(int i) {
        return nativeGetOption(i);
    }

    public synchronized void registerAudioRecordingCallback(AudioFocusChangedCallBack audioFocusChangedCallBack) {
        if (Build.VERSION.SDK_INT >= 29 && audioFocusChangedCallBack != null && !this.mRecordCallbackList.contains(audioFocusChangedCallBack)) {
            this.mRecordCallbackList.add(audioFocusChangedCallBack);
        }
    }

    public void setAecInHeadSetStatState(boolean z) {
        isEnableBuiltInAEC();
        if (this.aecAutoSwitch && z) {
            enableAEC(false);
        }
        nativesetHeadSetStat(z);
    }

    public void setAudioCaptureMute(boolean z) {
        nativeSetAudioCaptureMute(z);
    }

    public void setAudioCaptureObserver(AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mCaptureObserver = new WeakReference<>(audioCaptureObserver);
    }

    public void setAudioCaptureVolume(float f) {
        nativeSetAudioCaptureVolume(f);
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        nativeSetAudioProcessor(audioProcessor);
    }

    public void setAudioQuantizeGapPeriod(long j) {
        nativeSetAudioQuantizeGapPeriod(j);
    }

    public void setAudioScenario(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            nativeSetAudioScenario(i);
        }
    }

    public void setBluetoothStat(final boolean z) {
        if (!this.mEnableAecOnHeadset) {
            enableAEC(!z);
        }
        StringBuilder LJI = JBR.LJI("Bluetooth status ", z, " enable aec on bluetooth mode ");
        LJI.append(this.mEnableAecOnHeadset);
        AVLog.iod("AudioDeviceModule", X1D.LIZIZ(LJI));
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.3
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$3__run$___twin___() {
                AudioDeviceModule.this.setAecInHeadSetStatState(z);
                AudioDeviceModule.this.nativesetBluetoothState(z);
                if (z) {
                    AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                    if (audioDeviceModule.mHeadSetStatWithVoip) {
                        audioDeviceModule.nativeSwitchToVoIP(false);
                        return;
                    }
                    return;
                }
                AudioDeviceModule audioDeviceModule2 = AudioDeviceModule.this;
                if (!audioDeviceModule2.mHeadSetStatWithVoip || audioDeviceModule2.isHeadSet()) {
                    return;
                }
                AudioDeviceModule.this.nativeSwitchToVoIP(true);
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void setDiagnosisModelPath(String str) {
        if (str != null && str.length() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (0 == currentTimeMillis % this.mDiagnosisSwitchFreq) {
                AVLog.logKibana(5, "LiveStream", C61845OOz.LIZ("can enable sami diagnosis because sample logic:", currentTimeMillis), null);
            } else {
                AVLog.logKibana(5, "LiveStream", C61845OOz.LIZ("can not enable sami diagnosis because sample logic:", currentTimeMillis), null);
                return;
            }
        }
        nativeSetDiagnosisModelPath(str);
    }

    public void setExternalRecording(boolean z) {
        nativeSetExternalRecording(z);
    }

    public void setHardwareEarMonitorVolume(final float f) {
        this.mEarMonitorVolume = f;
        Handler handler = this.mHandler;
        if (handler != null && handler.getLooper().getThread() != C16880lQ.LLLLIIIILLL()) {
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.5
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_engine_AudioDeviceModule$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$5__run$___twin___() {
                    AudioDeviceModule.this.nativeSetHardwareEarMonitorVolume(f);
                }

                public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                    boolean LIZ;
                    try {
                        anonymousClass5.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$5__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } else {
            nativeSetHardwareEarMonitorVolume(f);
        }
    }

    public void setHeadSetStat(final boolean z) {
        this.mHeadSetStat = z;
        if (!this.mEnableAecOnHeadset) {
            enableAEC(!z);
        }
        if (LogUtil.logFilterSwitch()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Heat set status ");
            LIZ.append(this.mHeadSetStat);
            LIZ.append(" enable aec on headset mode ");
            LIZ.append(this.mEnableAecOnHeadset);
            AVLog.iod("AudioDeviceModule", X1D.LIZIZ(LIZ));
        }
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$2__run$___twin___() {
                AudioDeviceModule.this.setAecInHeadSetStatState(z);
                if (z) {
                    AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                    if (audioDeviceModule.mHeadSetStatWithVoip) {
                        audioDeviceModule.nativeSwitchToVoIP(false);
                        return;
                    }
                    return;
                }
                AudioDeviceModule audioDeviceModule2 = AudioDeviceModule.this;
                if (!audioDeviceModule2.mHeadSetStatWithVoip || audioDeviceModule2.isBluetoothConnected()) {
                    return;
                }
                AudioDeviceModule.this.nativeSwitchToVoIP(true);
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ2;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$2__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }

    public void setInputStreamMute(boolean z) {
        nativeSetInputStreamMute(z);
    }

    public void setInputStreamVolume(float f) {
        nativeSetInputStreamVolume(f);
    }

    public void setMicMute(final boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMicMute(");
        LIZ.append(z);
        LIZ.append(")");
        AVLog.iod("AudioDeviceModule", X1D.LIZIZ(LIZ));
        Handler handler = this.mHandler;
        if (handler != null && handler.getLooper().getThread() != C16880lQ.LLLLIIIILLL()) {
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.7
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_engine_AudioDeviceModule$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$7__run$___twin___() {
                    AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                    audioDeviceModule.nativeMicVolume(audioDeviceModule.mMicVolume, z);
                }

                public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                    boolean LIZ2;
                    try {
                        anonymousClass7.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$7__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        } else {
            nativeMicVolume(this.mMicVolume, z);
        }
    }

    public void setMicVolume(final float f) {
        AudioCapturer audioCapturer = this.mExtAudioCapture.get();
        if (audioCapturer != null && !audioCapturer.isMute()) {
            audioCapturer.setVolume(f);
            return;
        }
        this.mMicVolume = f;
        Handler handler = this.mHandler;
        if (handler != null && handler.getLooper().getThread() != C16880lQ.LLLLIIIILLL()) {
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.4
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_engine_AudioDeviceModule$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$4__run$___twin___() {
                    AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                    audioDeviceModule.nativeMicVolume(f, audioDeviceModule.nativeIsMicMute());
                }

                public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                    boolean LIZ;
                    try {
                        anonymousClass4.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$4__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } else {
            nativeMicVolume(f, nativeIsMicMute());
        }
    }

    public void setParameter(TEBundle tEBundle) {
        if (tEBundle == null) {
            return;
        }
        if (tEBundle.contains("SamiDiagnosisSwitchSampleFreq")) {
            this.mDiagnosisSwitchFreq = tEBundle.getInt("SamiDiagnosisSwitchSampleFreq");
        }
        nativeSetParameter(tEBundle);
        if (!tEBundle.contains("adm_ns_type")) {
            synchronized (this.mParam) {
                this.mParam.updateFrom(tEBundle);
            }
        }
        if (tEBundle.contains("enable_ns_work_thread")) {
            this.mEnableNsInWorkThread = tEBundle.getBool("enable_ns_work_thread");
        }
    }

    public void setRecordingCallack(AudioSink audioSink) {
        nativeSetRecordingCallback(audioSink);
    }

    public void setServerMixStopBaestream(boolean z) {
        this.mServerMixStopBaestream = z;
    }

    public void setSoftwareEarMonitorVolume(final float f) {
        this.mSoftwareEarMonitorVolume = f;
        Handler handler = this.mHandler;
        if (handler != null && handler.getLooper().getThread() != C16880lQ.LLLLIIIILLL()) {
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.6
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_engine_AudioDeviceModule$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$6__run$___twin___() {
                    AudioDeviceModule.this.nativeSetSoftwareEarMonitorVolume(f);
                }

                public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                    boolean LIZ;
                    try {
                        anonymousClass6.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$6__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } else {
            nativeSetSoftwareEarMonitorVolume(f);
        }
    }

    public void setTimeSyncMode(int i) {
        nativeSetTimeSyncMode(i);
    }

    public void setTuningName(String str) {
        nativeSetTuningName(str);
    }

    public void switchToVoIP(final boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.8
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_AudioDeviceModule$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$8__run$___twin___() {
                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                audioDeviceModule.mHeadSetStatWithVoip = z;
                if ((audioDeviceModule.isHeadSet() || AudioDeviceModule.this.isBluetoothConnected()) && z) {
                    if (LogUtil.logFilterSwitch()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Head set stat ");
                        LIZ.append(AudioDeviceModule.this.isHeadSet());
                        LIZ.append(" bluetooth ");
                        LIZ.append(AudioDeviceModule.this.isBluetoothConnected());
                        LIZ.append(" and ignore switch to voip mode.");
                        AVLog.iod("AudioDeviceModule", X1D.LIZIZ(LIZ));
                        return;
                    }
                    return;
                }
                AudioDeviceModule.this.nativeSwitchToVoIP(z);
            }

            public static void com_ss_ttlivestreamer_core_engine_AudioDeviceModule$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_ss_ttlivestreamer_core_engine_AudioDeviceModule$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        Context context;
        AudioManager audioManager;
        if (Build.VERSION.SDK_INT >= 24 && (context = this.mContext) != null && (audioManager = (AudioManager) C16880lQ.LLILL(context, "audio")) != null && audioRecordingCallback != null) {
            audioManager.unregisterAudioRecordingCallback(audioRecordingCallback);
        }
    }

    public void updateBluetoothIndication(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateBluetoothIndication:");
        LIZ.append(i);
        AVLog.iod("AudioDeviceModule", X1D.LIZIZ(LIZ));
        if (i == 2) {
            this.mStatusBluetoothIsConnected = true;
        } else {
            this.mStatusBluetoothIsConnected = false;
        }
    }

    public void addAudioSink(int i, AudioSink audioSink) {
        nativeAddAudioSink(i, audioSink);
    }

    public AudioRenderSink createRenderSink(int i, int i2) {
        return new AudioRenderSink(nativeCreateRenderSinkV2(0, i, i2), this.mHandler);
    }

    public void registerAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback, Handler handler) {
        if (Build.VERSION.SDK_INT >= 24) {
            AudioManager audioManager = sAudioManager;
            if (audioManager == null) {
                Context context = this.mContext;
                if (context == null) {
                    return;
                } else {
                    audioManager = (AudioManager) C16880lQ.LLILL(context, "audio");
                }
            }
            if (audioRecordingCallback != null && handler != null) {
                audioManager.registerAudioRecordingCallback(audioRecordingCallback, handler);
            }
        }
    }

    public void removeAudioSink(int i, AudioSink audioSink) {
        nativeRemoveAudioSink(i, audioSink);
    }

    public void setExternalRecording(boolean z, AudioCapturer audioCapturer) {
        setExternalRecording(z);
        if (audioCapturer != null) {
            this.mExtAudioCapture = new WeakReference<>(audioCapturer);
        }
    }

    public void setTuningType(int i, String str) {
        nativeSetTuningType(i, str);
    }

    public AudioDeviceModule(Observer observer, Context context, Handler handler) {
        this(observer, context, handler, 0);
    }

    public AudioDeviceModule(AudioCapturer audioCapturer, Observer observer, Context context, Handler handler) {
        this(null, audioCapturer, observer, context, handler, 0, 0, false);
    }

    public AudioDeviceModule(Observer observer, Context context, Handler handler, int i) {
        this(observer, context, handler, i, 0);
    }

    public AudioDeviceModule(Observer observer, Context context, Handler handler, int i, int i2) {
        this(null, null, observer, context, handler, i, i2, false);
    }

    public void pushOuterAudioFarend(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        nativePushOuterAudioFarend(byteBuffer, i, i2, i3, j);
    }

    public AudioDeviceModule(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Observer observer, Context context, Handler handler) {
        this(audioPlayer, audioCapturer, observer, context, handler, 0, 0, false);
    }

    public AudioDeviceModule(Observer observer, Context context, Handler handler, int i, int i2, boolean z) {
        this(null, null, observer, context, handler, i, i2, z);
    }

    public AudioDeviceModule(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Observer observer, Context context, Handler handler, int i) {
        this(audioPlayer, audioCapturer, observer, context, handler, i, 0, false);
    }

    public AudioDeviceModule(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Observer observer, Context context, Handler handler, int i, int i2) {
        this(audioPlayer, audioCapturer, observer, context, handler, i, i2, false);
    }

    public AudioDeviceModule(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Observer observer, Context context, Handler handler, int i, int i2, boolean z) {
        this.mParam = new TEBundle();
        this.mEnableAecOnHeadset = false;
        AudioManager audioManager = null;
        this.mCaptureObserver = new WeakReference<>(null);
        this.mMicVolume = 1.0f;
        this.mEarMonitorVolume = 1.0f;
        this.mSoftwareEarMonitorVolume = 1.0f;
        this.mBGMMode = -2;
        this.mAdmType = 0;
        this.mStatusBluetoothIsConnected = false;
        this.mStatusHeadSetIsConnected = false;
        this.mStatusIsVoIPMode = false;
        this.aecAutoSwitch = false;
        this.audioFocusChangedCallBackInfo = null;
        this.mRecordCallbackList = new ArrayList();
        this.mEnableNsInWorkThread = true;
        this.mDiagnosisSwitchFreq = 1;
        this.mServerMixStopBaestream = false;
        this.mEnablePipelineOpt = false;
        this.mNativObjReleased = false;
        this.mEnableMuteStatusCheck = false;
        this.mDisableAudioStreamForLive = false;
        IntBuffer asIntBuffer = ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder()).asIntBuffer();
        asIntBuffer.put(i);
        asIntBuffer.position(0);
        setNativeObj(nativeCreate(audioPlayer, audioCapturer, context, asIntBuffer, i2, z));
        this.audioFocusChangedCallBackInfo = new AudioFocusChangedCallBackInfo();
        this.mHandler = handler;
        this.mContext = context;
        this.mEnablePipelineOpt = z;
        this.mAdmType = asIntBuffer.get();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdmType: ");
        LIZ.append(this.mAdmType);
        AVLog.w("AudioDeviceModule", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AdmType: ");
        LIZ2.append(this.mAdmType);
        AVLog.iow("AudioDeviceModule", X1D.LIZIZ(LIZ2));
        if (this.mHandler == null) {
            this.mHandler = new Handler(C16880lQ.LLJJJJ());
        }
        this.mExtAudioCapture = new WeakReference<>(null);
        if (audioPlayer == null) {
            if (this.mAdmType != 1 && context != null) {
                audioManager = (AudioManager) C16880lQ.LLILL(context, "audio");
            }
            sAudioManager = audioManager;
            if (audioManager != null) {
                initAudioRouteStatus(audioManager);
            }
            NativeADMObserver nativeADMObserver = new NativeADMObserver(observer);
            this.mObserver = nativeADMObserver;
            nativeRegisterObserver(nativeADMObserver);
            nativeUpdateOriginTrackIndex(-10);
            return;
        }
        throw new AndroidRuntimeException("to support at later version");
    }
}
