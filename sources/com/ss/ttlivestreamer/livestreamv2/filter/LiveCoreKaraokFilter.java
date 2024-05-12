package com.ss.ttlivestreamer.livestreamv2.filter;

import X.C06540Nm;
import X.X1D;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.ss.ttlivestreamer.core.effect.AudioKaraokeWrapper;
import com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice;
import com.ss.ttlivestreamer.core.effect.NativeAudioEffect;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.Receiver;
import com.ss.ttlivestreamer.core.receiver.NativeReceiver;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor;
import com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes12.dex */
public class LiveCoreKaraokFilter extends IAudioFilterManager {
    public final boolean asyncReportError;
    public boolean enableAudioFading;
    public final int enableAutoVolume;
    public final boolean enablePitchShift;
    public AudioDeviceModule mAudioDeviceModule;
    public NativeAudioEffect mAudioEffect;
    public int mAudioFadingInCurve;
    public int mAudioFadingOutCurve;
    public AudioKaraokeWrapper mAudioKaraokeWrapper;
    public ReentrantLock mAudioKaraokeWrapperFence;
    public AudioDeviceModule.AudioRenderSink mAudioRenderSink;
    public IAudioStrangeVoice mAudioStrangeVoice;
    public String mBGMFile;
    public IAudioFilterManager.IBgmPlayingStatusCallback mBgmPlayingCb;
    public AudioEffectProcessor.Callback mCallback;
    public int mChannel;
    public boolean mEnableEffectOpt;
    public final Handler mHandler;
    public IKaraokeMovie mKaraokeMovie;
    public final boolean mMixBgmWithQuirk;
    public boolean mNeedReceiver;
    public String mOriginMusicFile;
    public Receiver mOriginMusicReceiver;
    public double mPitchShift;
    public ByteBuffer mReadAudioBuffer;
    public Receiver mReceiver;
    public final KaraokeRegulator mRegulator;
    public int mSampleHz;
    public long mStartTimeMs;
    public TEBundle mStreamInfo;
    public long mTotalDurationMs;
    public boolean mUpdatePitchShift;
    public IVeLivePusher mVeLivePusher;
    public IFilterManager mVideoEffect;
    public final String TAG = "LiveCoreKaraokFilter";
    public int mAudioFadingInDuration = 1000;
    public int mAudioFadingOutDuration = 1000;
    public IntBuffer mTimeStampMs = ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder()).asIntBuffer();
    public Object mFence = new Object();
    public boolean mNeedOrigin = true;
    public boolean mNeedMixer = false;
    public boolean mLoopPlayer = true;
    public float mBGMAGC = 0.75f;
    public float mVoiceEq = 0.75f;
    public float mEarMonitorVolume = 0.75f;
    public float mSoftwareEarMonitorVolume = 0.75f;
    public float mVoice = 0.75f;
    public boolean mNeedReportEnd = false;
    public boolean mPause = false;
    public boolean mAecStatus = false;
    public long mRenderCounts = 0;
    public boolean mNeedReportStart = false;
    public boolean mStatusException = false;
    public boolean mIsChorusMode = false;
    public boolean mMusicIsOn = false;

    private void cleanStatusException() {
        this.mStatusException = false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    public boolean isDummy() {
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    public String name() {
        return "LiveCoreKaraokFilter";
    }

    public void onPause() {
    }

    public void onResume() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void pause() {
        this.mPause = true;
        notifyPlayingStatus();
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        AVLog.iod("LiveCoreKaraokFilter", "release karaoke.");
        this.mMusicIsOn = false;
        setEnable(false);
        this.mNeedReceiver = false;
        synchronized (this.mFence) {
            Receiver receiver = this.mReceiver;
            if (receiver != null) {
                receiver.closeStream();
                this.mReceiver.release();
                this.mReceiver = null;
            }
            Receiver receiver2 = this.mOriginMusicReceiver;
            if (receiver2 != null) {
                receiver2.closeStream();
                this.mOriginMusicReceiver.release();
                this.mOriginMusicReceiver = null;
            }
        }
        IAudioStrangeVoice iAudioStrangeVoice = this.mAudioStrangeVoice;
        if (iAudioStrangeVoice != null) {
            iAudioStrangeVoice.release();
            this.mAudioStrangeVoice = null;
        }
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
        if (audioRenderSink != null) {
            audioRenderSink.release();
            this.mAudioRenderSink = null;
        }
        this.mAudioDeviceModule = null;
        releaseScoringModule();
        TEBundle tEBundle = this.mStreamInfo;
        if (tEBundle != null) {
            tEBundle.release();
            this.mStreamInfo = null;
        }
        NativeAudioEffect nativeAudioEffect = this.mAudioEffect;
        if (nativeAudioEffect != null) {
            nativeAudioEffect.release();
            this.mAudioEffect = null;
        }
        super.release();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void resume() {
        this.mPause = false;
        notifyPlayingStatus();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str, long j) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setDRCEnable(boolean z) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setMusicPitch(int i) {
    }

    private boolean isAdmByteAudio() {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null && audioDeviceModule.getAdmType() == 1) {
            return true;
        }
        return false;
    }

    private void notifyPlayingStatus() {
        if (this.mBgmPlayingCb == null) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter.5
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$5__run$___twin___() {
                LiveCoreKaraokFilter liveCoreKaraokFilter = LiveCoreKaraokFilter.this;
                IAudioFilterManager.IBgmPlayingStatusCallback iBgmPlayingStatusCallback = liveCoreKaraokFilter.mBgmPlayingCb;
                if (iBgmPlayingStatusCallback != null) {
                    iBgmPlayingStatusCallback.onPlayingStatusChange(liveCoreKaraokFilter.musicIsPlaying());
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    private void releaseScoringModule() {
        this.mAudioKaraokeWrapperFence.lock();
        AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
        if (audioKaraokeWrapper != null) {
            audioKaraokeWrapper.release();
            this.mAudioKaraokeWrapper = null;
        }
        this.mAudioKaraokeWrapperFence.unlock();
    }

    private boolean supportAutoVolume() {
        int i = this.enableAutoVolume;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    public IAudioStrangeVoice getAudioStrangeVoice() {
        String str;
        IFilterManager iFilterManager;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (this.mAudioStrangeVoice == null && (iFilterManager = this.mVideoEffect) != null && iFilterManager.isValid()) {
            this.mAudioStrangeVoice = this.mVideoEffect.createAudioStrangeVoice(this.mAudioRenderSink, this.mSampleHz, this.mChannel, this.mEnableEffectOpt);
            if (audioDeviceModule != null && !audioDeviceModule.isPlayer()) {
                audioDeviceModule.startPlayer();
            }
        }
        IAudioStrangeVoice iAudioStrangeVoice = this.mAudioStrangeVoice;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Have audio strange voice ");
        if (iAudioStrangeVoice != null) {
            str = iAudioStrangeVoice.toString();
        } else {
            str = "false";
        }
        LIZ.append(str);
        AVLog.iod("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ));
        return this.mAudioStrangeVoice;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public TEBundle getStreamInfo() {
        TEBundle tEBundle = this.mStreamInfo;
        if (tEBundle != null) {
            return tEBundle.copy();
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void initEarMonitor() {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            audioDeviceModule.nativeInitEarMonitor();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public boolean isSupportHardWareEarMonitor() {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            return audioDeviceModule.nativeIsSupportHardwareEarMonitor();
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public boolean isSupportSoftWareEarMonitor() {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            return audioDeviceModule.nativeIsSupportSoftwareEarMonitor();
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    public boolean musicIsPlaying() {
        if (this.mPause || !this.mEnable) {
            return false;
        }
        return this.mMusicIsOn;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    public double getPitchShift() {
        if (!supportPitchShift()) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return this.mPitchShift;
    }

    private boolean supportPitchShift() {
        return this.enablePitchShift;
    }

    public static List<KtvMidiData> getMidiDrawingData(String str) {
        if (str == null) {
            return Collections.emptyList();
        }
        int[] iArr = new int[1];
        int[] nativeGetMidiDrawingData = AudioKaraokeWrapper.nativeGetMidiDrawingData(str, iArr);
        if (nativeGetMidiDrawingData == null) {
            return Collections.emptyList();
        }
        int i = iArr[0] / 4;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 4;
            int i4 = i3 + 1;
            int i5 = nativeGetMidiDrawingData[i3];
            int i6 = i4 + 1;
            arrayList.add(new KtvMidiData(i5, nativeGetMidiDrawingData[i4], nativeGetMidiDrawingData[i6], nativeGetMidiDrawingData[i6 + 1]));
        }
        return arrayList;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void getScoreInfo(double[] dArr) {
        this.mAudioKaraokeWrapperFence.lock();
        AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
        if (audioKaraokeWrapper != null) {
            audioKaraokeWrapper.getScoreInfo(dArr);
        }
        this.mAudioKaraokeWrapperFence.unlock();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void seek(long j) {
        long j2 = this.mTotalDurationMs;
        long j3 = 0;
        if (j > j2 && j2 > 0) {
            j = j2;
        }
        if (j >= 0) {
            j3 = j;
        }
        synchronized (this.mFence) {
            Receiver receiver = this.mReceiver;
            Receiver receiver2 = this.mOriginMusicReceiver;
            if (receiver != null) {
                receiver.seek(j3, true);
            }
            if (receiver2 != null) {
                receiver2.seek(j3, true);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void seekLyricPos(double d) {
        this.mAudioKaraokeWrapperFence.lock();
        AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
        if (audioKaraokeWrapper != null) {
            audioKaraokeWrapper.nativeSeekLyricPos(d);
        }
        this.mAudioKaraokeWrapperFence.unlock();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str) {
        setBGMMusic(str, (String) null);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMProgressListener(AudioEffectProcessor.Callback callback) {
        this.mCallback = callback;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMVolume(float f) {
        this.mBGMAGC = f;
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
        if (audioRenderSink != null) {
            audioRenderSink.setVolume(f);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    public void setBgmStatusCallback(final IAudioFilterManager.IBgmPlayingStatusCallback iBgmPlayingStatusCallback) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter.4
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$4__run$___twin___() {
                LiveCoreKaraokFilter liveCoreKaraokFilter = LiveCoreKaraokFilter.this;
                IAudioFilterManager.IBgmPlayingStatusCallback iBgmPlayingStatusCallback2 = iBgmPlayingStatusCallback;
                liveCoreKaraokFilter.mBgmPlayingCb = iBgmPlayingStatusCallback2;
                if (iBgmPlayingStatusCallback2 != null) {
                    iBgmPlayingStatusCallback2.onPlayingStatusChange(liveCoreKaraokFilter.musicIsPlaying());
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void setChorusMode(boolean z) {
        this.mIsChorusMode = z;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setEchoMode(boolean z) {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (z) {
            setHardwareEarMonitorVolume(this.mEarMonitorVolume);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EnableEarMonitoring, volume = ");
            LIZ.append(this.mEarMonitorVolume);
            AVLog.logKibana(4, "LiveCoreKaraokFilter", X1D.LIZIZ(LIZ), null);
        }
        if (audioDeviceModule != null) {
            audioDeviceModule.enableEchoMode(z);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setEchoMode ");
        LIZ2.append(z);
        AVLog.iod("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ2));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    public void setEnable(boolean z) {
        super.setEnable(z);
        if (z) {
            setVoiceVolume(this.mVoice);
            AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
            if (audioDeviceModule != null && !audioDeviceModule.isPlayer()) {
                this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$3__run$___twin___() {
                        AudioDeviceModule audioDeviceModule2 = LiveCoreKaraokFilter.this.mAudioDeviceModule;
                        if (audioDeviceModule2 != null && !audioDeviceModule2.isPlayer()) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("startPlayer adm ");
                            LIZ.append(audioDeviceModule2);
                            AVLog.iod("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ));
                            audioDeviceModule2.startPlayer();
                        }
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                        boolean LIZ;
                        try {
                            anonymousClass3.com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$3__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        } else {
            AudioDeviceModule audioDeviceModule2 = this.mAudioDeviceModule;
            if (audioDeviceModule2 != null) {
                audioDeviceModule2.setMicVolume(1.0f);
            }
        }
        AVLog.iod("LiveCoreKaraokFilter", "setEnable " + z + " adm " + this.mAudioDeviceModule + " voice " + this.mVoice);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setEnableAudioFading(boolean z) {
        this.enableAudioFading = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioFading enable:");
        LIZ.append(z);
        AVLog.ioi("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setHardwareEarMonitorVolume(float f) {
        this.mEarMonitorVolume = f;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            audioDeviceModule.setHardwareEarMonitorVolume(f);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setHardwareEchoMode(boolean z) {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (z) {
            setHardwareEarMonitorVolume(this.mEarMonitorVolume);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EnableHardwareEarMonitoring, volume = ");
            LIZ.append(this.mEarMonitorVolume);
            AVLog.logKibana(4, "LiveCoreKaraokFilter", X1D.LIZIZ(LIZ), null);
        }
        if (audioDeviceModule != null) {
            audioDeviceModule.enableHardwareEchoMode(z);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setHardwareEchoMode ");
        LIZ2.append(z);
        AVLog.iod("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ2));
    }

    public void setKaraokeMovieMode(IKaraokeMovie iKaraokeMovie) {
        this.mKaraokeMovie = iKaraokeMovie;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setLoopEnable(boolean z) {
        int i;
        this.mLoopPlayer = z;
        synchronized (this.mFence) {
            Receiver receiver = this.mReceiver;
            int i2 = -1;
            if (receiver != null) {
                TEBundle option = receiver.getOption();
                if (z) {
                    i = -1;
                } else {
                    i = 1;
                }
                option.setInt("decode_stream_loop", i);
                receiver.setOption(option);
                option.release();
            }
            Receiver receiver2 = this.mOriginMusicReceiver;
            if (receiver2 != null) {
                TEBundle option2 = receiver2.getOption();
                if (!z) {
                    i2 = 1;
                }
                option2.setInt("decode_stream_loop", i2);
                receiver2.setOption(option2);
                option2.release();
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setMixerEnable(boolean z) {
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" setMixerEnable: ");
        LIZ.append(this.mNeedMixer);
        LIZ.append(" -> ");
        LIZ.append(z);
        AVLog.iod("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ));
        this.mNeedMixer = z;
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
        if (audioRenderSink != null && this.mMixBgmWithQuirk) {
            if (!this.mIsChorusMode) {
                if (z) {
                    j = 1;
                } else {
                    j = 0;
                }
                audioRenderSink.setQuirks(j);
                return;
            }
            setOnlyMixWithRTC(true);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setOnlyMixWithRTC(boolean z) {
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" setOnlyMixWithMic: flag = ");
        LIZ.append(z);
        AVLog.iod("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ));
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
        if (audioRenderSink != null && this.mNeedMixer) {
            if (z) {
                j = 4;
            } else {
                j = 1;
            }
            audioRenderSink.setQuirks(j);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setOriginEnable(boolean z) {
        synchronized (this.mFence) {
            Receiver receiver = this.mReceiver;
            if (receiver != null && this.mOriginMusicReceiver == null) {
                TEBundle option = receiver.getOption();
                option.setBool("receiver_enable_origin_audio", z);
                receiver.setOption(option);
                option.release();
            }
        }
        this.mNeedOrigin = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001f, code lost:
    
        if (r2 != null) goto L16;
     */
    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPitchShift(double r5) {
        /*
            r4 = this;
            boolean r0 = r4.supportPitchShift()
            if (r0 != 0) goto L7
            return
        L7:
            r4.mPitchShift = r5
            com.ss.ttlivestreamer.core.effect.NativeAudioEffect r0 = r4.mAudioEffect
            if (r0 == 0) goto L10
            r0.setPitch(r5)
        L10:
            java.lang.Object r3 = r4.mFence
            monitor-enter(r3)
            com.ss.ttlivestreamer.core.engine.Receiver r2 = r4.mReceiver     // Catch: java.lang.Throwable -> L32
            boolean r0 = r4.mNeedOrigin     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L1f
            com.ss.ttlivestreamer.core.engine.Receiver r0 = r4.mOriginMusicReceiver     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L1f
            r2 = r0
            goto L21
        L1f:
            if (r2 == 0) goto L30
        L21:
            com.ss.ttlivestreamer.core.utils.TEBundle r1 = r2.getOption()     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "pitch_shift"
            r1.setDouble(r0, r5)     // Catch: java.lang.Throwable -> L32
            r2.setOption(r1)     // Catch: java.lang.Throwable -> L32
            r1.release()     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter.setPitchShift(double):void");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setSoftwareEarMonitorVolume(float f) {
        this.mSoftwareEarMonitorVolume = f;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            audioDeviceModule.setSoftwareEarMonitorVolume(f);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setSoftwareEchoMode(boolean z) {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (z) {
            setSoftwareEarMonitorVolume(this.mEarMonitorVolume);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EnableSoftwareEarMonitoring, volume = ");
            LIZ.append(this.mEarMonitorVolume);
            AVLog.logKibana(4, "LiveCoreKaraokFilter", X1D.LIZIZ(LIZ), null);
        }
        if (audioDeviceModule != null) {
            audioDeviceModule.enableSoftwareEchoMode(z);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setSoftwareEchoMode ");
        LIZ2.append(z);
        AVLog.iod("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ2));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    public void setTranspose(int i) {
        this.mAudioKaraokeWrapperFence.lock();
        AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
        if (audioKaraokeWrapper != null) {
            audioKaraokeWrapper.nativeSetTranspose(i);
        }
        this.mAudioKaraokeWrapperFence.unlock();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setTuningParams(final String str) {
        final AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$1__run$___twin___() {
                    audioDeviceModule.setTuningType(0, str);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r4 != null) goto L25;
     */
    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setVoiceAccompanySourceLufs(float r7) {
        /*
            r6 = this;
            boolean r0 = r6.supportAutoVolume()
            if (r0 != 0) goto Le
            java.lang.String r1 = "LiveCoreKaraokFilter"
            java.lang.String r0 = "AutoVolume is disabled"
            com.ss.ttlivestreamer.core.utils.AVLog.ioi(r1, r0)
            return
        Le:
            boolean r0 = r6.isAdmByteAudio()
            if (r0 == 0) goto L36
            int r1 = r6.enableAutoVolume
            r0 = 2
            if (r1 != r0) goto L36
            java.lang.String r2 = "LiveCoreKaraokFilter"
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "ByteAudio setVoiceAccompanySourceLufs:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            com.ss.ttlivestreamer.core.utils.AVLog.ioi(r2, r0)
            com.ss.ttlivestreamer.core.engine.AudioDeviceModule$AudioRenderSink r0 = r6.mAudioRenderSink
            if (r0 == 0) goto L35
            r0.setAudioLoudNormParam(r7)
        L35:
            return
        L36:
            java.lang.String r2 = "LiveCoreKaraokFilter"
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "setVoiceAccompanySourceLufs:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            com.ss.ttlivestreamer.core.utils.AVLog.ioi(r2, r0)
            com.ss.ttlivestreamer.core.effect.NativeAudioEffect r0 = r6.mAudioEffect
            if (r0 == 0) goto L52
            r0.setVoiceAccompanySourceLufs(r7)
        L52:
            java.lang.Object r5 = r6.mFence
            monitor-enter(r5)
            com.ss.ttlivestreamer.core.engine.Receiver r4 = r6.mReceiver     // Catch: java.lang.Throwable -> L75
            boolean r0 = r6.mNeedOrigin     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L61
            com.ss.ttlivestreamer.core.engine.Receiver r0 = r6.mOriginMusicReceiver     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L61
            r4 = r0
            goto L63
        L61:
            if (r4 == 0) goto L73
        L63:
            com.ss.ttlivestreamer.core.utils.TEBundle r3 = r4.getOption()     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "source_lufs"
            double r0 = (double) r7     // Catch: java.lang.Throwable -> L75
            r3.setDouble(r2, r0)     // Catch: java.lang.Throwable -> L75
            r4.setOption(r3)     // Catch: java.lang.Throwable -> L75
            r3.release()     // Catch: java.lang.Throwable -> L75
        L73:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L75
            return
        L75:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L75
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter.setVoiceAccompanySourceLufs(float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r4 != null) goto L23;
     */
    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setVoiceAccompanySourcePeak(float r7) {
        /*
            r6 = this;
            boolean r0 = r6.supportAutoVolume()
            if (r0 != 0) goto Le
            java.lang.String r1 = "LiveCoreKaraokFilter"
            java.lang.String r0 = "AutoVolume is disabled"
            com.ss.ttlivestreamer.core.utils.AVLog.ioi(r1, r0)
            return
        Le:
            boolean r0 = r6.isAdmByteAudio()
            if (r0 == 0) goto L21
            int r1 = r6.enableAutoVolume
            r0 = 2
            if (r1 != r0) goto L21
            java.lang.String r1 = "LiveCoreKaraokFilter"
            java.lang.String r0 = "ByteAudio not support setVoiceAccompanySourcePeak"
            com.ss.ttlivestreamer.core.utils.AVLog.ioi(r1, r0)
            return
        L21:
            com.ss.ttlivestreamer.core.effect.NativeAudioEffect r0 = r6.mAudioEffect
            if (r0 == 0) goto L28
            r0.setVoiceAccompanySourcePeak(r7)
        L28:
            java.lang.String r2 = "LiveCoreKaraokFilter"
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "setVoiceAccompanySourcePeak:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            com.ss.ttlivestreamer.core.utils.AVLog.ioi(r2, r0)
            java.lang.Object r5 = r6.mFence
            monitor-enter(r5)
            com.ss.ttlivestreamer.core.engine.Receiver r4 = r6.mReceiver     // Catch: java.lang.Throwable -> L60
            boolean r0 = r6.mNeedOrigin     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L4c
            com.ss.ttlivestreamer.core.engine.Receiver r0 = r6.mOriginMusicReceiver     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L4c
            r4 = r0
            goto L4e
        L4c:
            if (r4 == 0) goto L5e
        L4e:
            com.ss.ttlivestreamer.core.utils.TEBundle r3 = r4.getOption()     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "source_peak"
            double r0 = (double) r7     // Catch: java.lang.Throwable -> L60
            r3.setDouble(r2, r0)     // Catch: java.lang.Throwable -> L60
            r4.setOption(r3)     // Catch: java.lang.Throwable -> L60
            r3.release()     // Catch: java.lang.Throwable -> L60
        L5e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L60
            return
        L60:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L60
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter.setVoiceAccompanySourcePeak(float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r4 != null) goto L23;
     */
    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setVoiceAccompanyTargetLufs(float r7) {
        /*
            r6 = this;
            boolean r0 = r6.supportAutoVolume()
            if (r0 != 0) goto Le
            java.lang.String r1 = "LiveCoreKaraokFilter"
            java.lang.String r0 = "AutoVolume is disabled"
            com.ss.ttlivestreamer.core.utils.AVLog.ioi(r1, r0)
            return
        Le:
            boolean r0 = r6.isAdmByteAudio()
            if (r0 == 0) goto L21
            int r1 = r6.enableAutoVolume
            r0 = 2
            if (r1 != r0) goto L21
            java.lang.String r1 = "LiveCoreKaraokFilter"
            java.lang.String r0 = "ByteAudio not support setVoiceAccompanyTargetLufs"
            com.ss.ttlivestreamer.core.utils.AVLog.ioi(r1, r0)
            return
        L21:
            com.ss.ttlivestreamer.core.effect.NativeAudioEffect r0 = r6.mAudioEffect
            if (r0 == 0) goto L28
            r0.setVoiceAccompanyTargetLufs(r7)
        L28:
            java.lang.String r2 = "LiveCoreKaraokFilter"
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "setVoiceAccompanyTargetLufs:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            com.ss.ttlivestreamer.core.utils.AVLog.ioi(r2, r0)
            java.lang.Object r5 = r6.mFence
            monitor-enter(r5)
            com.ss.ttlivestreamer.core.engine.Receiver r4 = r6.mReceiver     // Catch: java.lang.Throwable -> L60
            boolean r0 = r6.mNeedOrigin     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L4c
            com.ss.ttlivestreamer.core.engine.Receiver r0 = r6.mOriginMusicReceiver     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L4c
            r4 = r0
            goto L4e
        L4c:
            if (r4 == 0) goto L5e
        L4e:
            com.ss.ttlivestreamer.core.utils.TEBundle r3 = r4.getOption()     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "target_lufs"
            double r0 = (double) r7     // Catch: java.lang.Throwable -> L60
            r3.setDouble(r2, r0)     // Catch: java.lang.Throwable -> L60
            r4.setOption(r3)     // Catch: java.lang.Throwable -> L60
            r3.release()     // Catch: java.lang.Throwable -> L60
        L5e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L60
            return
        L60:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L60
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter.setVoiceAccompanyTargetLufs(float):void");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager
    public void setVoiceTargetLufs(float f) {
        if (isAdmByteAudio() && this.enableAutoVolume == 2) {
            AVLog.ioi("LiveCoreKaraokFilter", "ByteAudio not support setVoiceTargetLufs");
            return;
        }
        if (this.mAudioDeviceModule != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setVoiceTargetLufs:");
            LIZ.append(f);
            AVLog.ioi("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ));
            TEBundle parameter = this.mAudioDeviceModule.getParameter();
            parameter.setDouble("target_lufs", f);
            this.mAudioDeviceModule.setParameter(parameter);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setVoiceVolume(float f) {
        this.mVoice = f;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            audioDeviceModule.setMicVolume(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reportError, reason: merged with bridge method [inline-methods] */
    public void lambda$processInternal$0(Receiver receiver, int i) {
        String str;
        TEBundle option;
        if (receiver != null) {
            if (this.asyncReportError && (option = receiver.getOption()) != null && option.contains("receiver_last_error_message")) {
                str = option.getString("receiver_last_error_message");
            } else {
                str = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("err occurs: ");
            LIZ.append(str);
            LIZ.append(",");
            LIZ.append(i);
            AVLog.logKibana(6, "LiveCoreKaraokFilter", X1D.LIZIZ(LIZ), null);
            AudioEffectProcessor.Callback callback = this.mCallback;
            if ((callback instanceof AudioEffectProcessor.CallbackV2) && !this.mStatusException) {
                this.mStatusException = true;
                ((AudioEffectProcessor.CallbackV2) callback).onError(i, new Exception(str));
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str, String str2) {
        setBGMMusic(str, str2, 0L);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setTuningParams(final String str, final String str2) {
        final AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$2__run$___twin___() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("setTuningParams: filePath:");
                    LIZ.append(str);
                    LIZ.append(" name:");
                    LIZ.append(str2);
                    AVLog.logKibana(4, "LiveCoreKaraokFilter", X1D.LIZIZ(LIZ), null);
                    audioDeviceModule.setTuningType(0, str);
                    audioDeviceModule.setTuningName(str2);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_livestreamv2_filter_LiveCoreKaraokFilter$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setTuningParams name:");
        LIZ.append(str2);
        AVLog.iod("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ));
    }

    private void createReceiver(int i, int i2, int i3) {
        int i4;
        boolean z;
        Receiver receiver;
        synchronized (this.mFence) {
            if (!this.mNeedReceiver) {
                return;
            }
            boolean z2 = false;
            this.mMusicIsOn = false;
            notifyPlayingStatus();
            Receiver receiver2 = this.mReceiver;
            if (receiver2 != null) {
                receiver2.closeStream();
                this.mReceiver.release();
                this.mReceiver = null;
            }
            Receiver receiver3 = this.mOriginMusicReceiver;
            if (receiver3 != null) {
                receiver3.closeStream();
                this.mOriginMusicReceiver.release();
                this.mOriginMusicReceiver = null;
            }
            TEBundle tEBundle = this.mStreamInfo;
            if (tEBundle != null) {
                tEBundle.clear();
            } else {
                this.mStreamInfo = new TEBundle();
            }
            cleanStatusException();
            this.mNeedReceiver = false;
            if (this.mBGMFile == null) {
                return;
            }
            NativeReceiver nativeReceiver = new NativeReceiver(null, null);
            this.mReceiver = nativeReceiver;
            TEBundle option = nativeReceiver.getOption();
            option.setInt("decode_stream_audio_channel", i2);
            option.setInt("decode_stream_audio_sample", i);
            if (this.mLoopPlayer) {
                i4 = -1;
            } else {
                i4 = 1;
            }
            option.setInt("decode_stream_loop", i4);
            if (this.mOriginMusicFile == null) {
                z = true;
            } else {
                z = false;
            }
            option.setBool("receiver_enable_origin_audio", z);
            if (this.enableAutoVolume == 1) {
                z2 = true;
            }
            option.setBool("receiver_enable_auto_volume", z2);
            option.setBool("receiver_enable_audio_fading", this.enableAudioFading);
            if (this.enableAudioFading) {
                option.setInt("receiver_audio_fading_in_curve", this.mAudioFadingInCurve);
                option.setInt("receiver_audio_fading_out_curve", this.mAudioFadingOutCurve);
                option.setInt("receiver_audio_fading_in_duration", this.mAudioFadingInDuration);
                option.setInt("receiver_audio_fading_out_duration", this.mAudioFadingOutDuration);
            }
            this.mReceiver.setOption(option);
            int openStream = this.mReceiver.openStream(this.mBGMFile);
            if (openStream != 0) {
                this.mStreamInfo.setLong("receiver_total_duration", -1L);
                lambda$processInternal$0(this.mReceiver, openStream);
                this.mReceiver.closeStream();
                this.mReceiver.release();
                this.mReceiver = null;
            } else {
                if (this.mOriginMusicFile != null) {
                    this.mOriginMusicReceiver = new NativeReceiver(null, null);
                    option.setBool("receiver_enable_origin_audio", true);
                    this.mOriginMusicReceiver.setOption(option);
                }
                this.mReadAudioBuffer = ByteBuffer.allocateDirect(i3 * 2 * i2);
                this.mReceiver.getStreamInfo(this.mStreamInfo);
                long j = this.mStreamInfo.getLong("receiver_total_duration");
                this.mTotalDurationMs = j;
                long j2 = this.mStartTimeMs;
                if (j2 > 0) {
                    if (j2 > j) {
                        this.mStartTimeMs = j;
                    }
                    this.mReceiver.seek(this.mStartTimeMs, true);
                }
                AVLog.iod("LiveCoreKaraokFilter", this.mStreamInfo.toString());
                this.mNeedReportStart = true;
            }
            option.release();
            if (this.mReceiver != null && (receiver = this.mOriginMusicReceiver) != null) {
                int openStream2 = receiver.openStream(this.mOriginMusicFile);
                if (openStream2 != 0) {
                    lambda$processInternal$0(this.mOriginMusicReceiver, openStream2);
                    this.mOriginMusicReceiver.closeStream();
                    this.mOriginMusicReceiver.release();
                    this.mOriginMusicReceiver = null;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Open OriginMusic file ");
                    LIZ.append(this.mOriginMusicFile);
                    LIZ.append(" failed ");
                    LIZ.append(openStream2);
                    AVLog.ioe("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ));
                } else {
                    TEBundle tEBundle2 = new TEBundle();
                    this.mOriginMusicReceiver.getStreamInfo(tEBundle2);
                    long j3 = tEBundle2.getLong("receiver_total_duration");
                    tEBundle2.release();
                    long j4 = this.mTotalDurationMs - j3;
                    long j5 = this.mStartTimeMs;
                    if (j5 > 0) {
                        this.mOriginMusicReceiver.seek(j5, true);
                    }
                    if (j4 != 0) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("bgm duration error(");
                        LIZ2.append(j4);
                        LIZ2.append(") at file ");
                        LIZ2.append(this.mBGMFile);
                        LIZ2.append(" VS ");
                        LIZ2.append(this.mOriginMusicFile);
                        String LIZIZ = X1D.LIZIZ(LIZ2);
                        AVLog.ioe("LiveCoreKaraokFilter", LIZIZ);
                        AVLog.logKibana(6, "LiveCoreKaraokFilter", LIZIZ, null);
                    }
                }
            }
            if (this.mPitchShift != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                this.mUpdatePitchShift = true;
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str, String str2, long j) {
        this.mBGMFile = str;
        this.mOriginMusicFile = str2;
        this.mStartTimeMs = j;
        this.mNeedReceiver = true;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("setBGMFile ", str, " origin ", str2, " startms: ");
        LIZLLL.append(j);
        LIZLLL.append(", mNeedReceiver: ");
        LIZLLL.append(this.mNeedReceiver);
        AVLog.iod("LiveCoreKaraokFilter", X1D.LIZIZ(LIZLLL));
        int i = this.mSampleHz;
        createReceiver(i, this.mChannel, i / 100);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public int setScoringSources(String str, String str2, double d) {
        AudioKaraokeWrapper create = AudioKaraokeWrapper.create(this.mSampleHz, this.mChannel, str, str2);
        if (create != null) {
            create.nativeSeekLyricPos(d);
            this.mAudioKaraokeWrapperFence.lock();
            AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
            if (audioKaraokeWrapper != null) {
                audioKaraokeWrapper.release();
            }
            this.mAudioKaraokeWrapper = create;
            this.mAudioKaraokeWrapperFence.unlock();
            return 0;
        }
        return -1;
    }

    public LiveCoreKaraokFilter(AudioDeviceModule audioDeviceModule, Handler handler, LiveStreamBuilder liveStreamBuilder, IFilterManager iFilterManager) {
        int i;
        boolean z;
        this.mEnableEffectOpt = false;
        if (liveStreamBuilder.isEnableByteAudioFilterOptimize()) {
            this.mSampleHz = 48000;
        } else {
            this.mSampleHz = liveStreamBuilder.getAudioSampleHZ();
        }
        this.mChannel = liveStreamBuilder.getAudioChannel();
        boolean isEnablePitchShift = liveStreamBuilder.isEnablePitchShift();
        this.enablePitchShift = isEnablePitchShift;
        this.asyncReportError = liveStreamBuilder.getPushBase().audioFilterAsyncReportError;
        this.mEnableEffectOpt = liveStreamBuilder.getPushBase().enableSamiEffectOpt;
        this.mAudioDeviceModule = audioDeviceModule;
        if (liveStreamBuilder.isEnableByteAudioFilterOptimize()) {
            this.mAudioRenderSink = audioDeviceModule.createRenderSink(this.mSampleHz, this.mChannel);
        } else {
            this.mAudioRenderSink = audioDeviceModule.createRenderSink();
        }
        PushBase pushBase = liveStreamBuilder.getPushBase();
        if (liveStreamBuilder.isEnableAutoVolume()) {
            if (isAdmByteAudio() && pushBase.byteAudioInternalMixBgm && pushBase.byteAudioInternalAutoVolume) {
                i = 2;
            } else {
                i = 1;
            }
        } else {
            i = 0;
        }
        this.enableAutoVolume = i;
        this.mNeedReceiver = true;
        this.mHandler = handler;
        this.mVideoEffect = iFilterManager;
        this.mAudioKaraokeWrapperFence = new ReentrantLock();
        if (liveStreamBuilder.isEnableKTV()) {
            this.mAudioEffect = new NativeAudioEffect(this.mSampleHz, this.mChannel);
        }
        NativeAudioEffect nativeAudioEffect = this.mAudioEffect;
        if (nativeAudioEffect != null) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            nativeAudioEffect.enableAutoVolume(z);
            this.mAudioEffect.enablePitchShift(isEnablePitchShift);
        }
        if (liveStreamBuilder.enableKaraokeRegulator() && (!isAdmByteAudio() || !liveStreamBuilder.getPushBase().byteAudioInternalMixBgm)) {
            this.mRegulator = new KaraokeRegulator();
            this.mMixBgmWithQuirk = false;
        } else {
            this.mRegulator = null;
            this.mMixBgmWithQuirk = true;
        }
        setMixerEnable(this.mNeedMixer);
        this.mVeLivePusher = liveStreamBuilder.getVeLivePusher();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableAutoVolume: ");
        LIZ.append(i);
        LIZ.append(", enablePitchShift: ");
        LIZ.append(isEnablePitchShift);
        LIZ.append(", mMixBgmWithQuirk: ");
        LIZ.append(this.mMixBgmWithQuirk);
        AVLog.ioi("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor
    public void setAudioFadingParams(int i, int i2, int i3, int i4) {
        if (i < 0 || i >= 3) {
            i = 2;
        }
        this.mAudioFadingInCurve = i;
        if (i2 < 0 || i2 >= 3) {
            i2 = 2;
        }
        this.mAudioFadingOutCurve = i2;
        this.mAudioFadingInDuration = i3;
        this.mAudioFadingOutDuration = i4;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioFading in_curve:");
        LIZ.append(this.mAudioFadingInCurve);
        LIZ.append(" out_curve:");
        LIZ.append(this.mAudioFadingOutCurve);
        LIZ.append(" in_duration:");
        LIZ.append(this.mAudioFadingInDuration);
        LIZ.append(" out_duration:");
        LIZ.append(this.mAudioFadingOutDuration);
        AVLog.ioi("LiveCoreKaraokFilter", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioProcessor
    public synchronized Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
        try {
            processInternal(buffer, i, i2, i3, j);
        } catch (Throwable th) {
            TTLSSladarBugReportUtils.getInstance().report(th, "LiveCoreKaraokFilter.process");
            if (!DebugLogUtils.isEnableDebugLog()) {
                return buffer;
            }
            throw th;
        }
        return buffer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0075, code lost:
    
        if (r11 != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.nio.Buffer processInternal(java.nio.Buffer r23, int r24, int r25, int r26, long r27) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.LiveCoreKaraokFilter.processInternal(java.nio.Buffer, int, int, int, long):java.nio.Buffer");
    }
}
