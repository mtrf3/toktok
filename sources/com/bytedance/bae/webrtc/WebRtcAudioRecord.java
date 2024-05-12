package com.bytedance.bae.webrtc;

import X.C03880Dg;
import X.C06460Ne;
import X.C08380Uo;
import X.C40084FoG;
import X.C65300Pk0;
import X.JBR;
import X.KMP;
import X.V0N;
import X.X1D;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Process;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class WebRtcAudioRecord {
    public static final int DEFAULT_AUDIO_SOURCE;
    public static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    public static int defaultMediaModeAudioSource;
    public static WebRtcAudioRecordErrorCallback errorCallback;
    public static volatile boolean microphoneMute;
    public String apiResult = "";
    public AudioRecord audioRecord;
    public AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    public WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    public final long nativeAudioRecord;

    /* loaded from: classes12.dex */
    public class AudioRecordThread extends PthreadThread {
        public volatile boolean keepAlive;

        public static void com_bytedance_bae_webrtc_WebRtcAudioRecord$AudioRecordThread_android_media_AudioRecord_stop(AudioRecord audioRecord) {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = new Object[0];
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "7707548096646799891");
            if (c03880Dg.LIZJ(100401, "android/media/AudioRecord", "stop", audioRecord, objArr, "void", c65300Pk0).LIZ) {
                c03880Dg.LIZIZ(100401, "android/media/AudioRecord", "stop", null, objArr, audioRecord, c65300Pk0, false);
            } else {
                audioRecord.stop();
                c03880Dg.LIZIZ(100401, "android/media/AudioRecord", "stop", null, objArr, audioRecord, c65300Pk0, true);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com_bytedance_bae_webrtc_WebRtcAudioRecord$AudioRecordThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void stopThread() {
            synchronized (this) {
                RXLogging.i("WebRtcAudioRecord", "stopThread");
                this.keepAlive = false;
            }
        }

        public void com_bytedance_bae_webrtc_WebRtcAudioRecord$AudioRecordThread__run$___twin___() {
            Object valueOf;
            int i;
            Process.setThreadPriority(-19);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioRecordThread");
            LIZ.append(WebRtcAudioUtils.getThreadInfo());
            RXLogging.i("WebRtcAudioRecord", X1D.LIZIZ(LIZ));
            AudioRecord audioRecord = WebRtcAudioRecord.this.audioRecord;
            if (audioRecord == null || audioRecord.getRecordingState() != 3) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("AudioRecord.run failed: incorrect state :");
                AudioRecord audioRecord2 = WebRtcAudioRecord.this.audioRecord;
                if (audioRecord2 == null) {
                    valueOf = "null";
                } else {
                    valueOf = Integer.valueOf(audioRecord2.getRecordingState());
                }
                LIZ2.append(valueOf);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                RXLogging.e("WebRtcAudioRecord", LIZIZ);
                this.keepAlive = false;
                WebRtcAudioRecord.this.reportWebRtcAudioRecordError(LIZIZ);
            }
            System.nanoTime();
            while (this.keepAlive) {
                try {
                    WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                    AudioRecord audioRecord3 = webRtcAudioRecord.audioRecord;
                    ByteBuffer byteBuffer = webRtcAudioRecord.byteBuffer;
                    i = audioRecord3.read(byteBuffer, byteBuffer.capacity());
                } catch (Exception e) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("audioRecord.read failed: ");
                    LIZ3.append(e.getMessage());
                    RXLogging.e("WebRtcAudioRecord", X1D.LIZIZ(LIZ3));
                    this.keepAlive = false;
                    i = -1;
                }
                if (i == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord webRtcAudioRecord2 = WebRtcAudioRecord.this;
                        webRtcAudioRecord2.byteBuffer.put(webRtcAudioRecord2.emptyBytes);
                    }
                    synchronized (this) {
                        if (this.keepAlive) {
                            WebRtcAudioRecord webRtcAudioRecord3 = WebRtcAudioRecord.this;
                            webRtcAudioRecord3.nativeDataIsRecorded(i, webRtcAudioRecord3.nativeAudioRecord);
                        }
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else if (i == -3 || i == -6) {
                    this.keepAlive = false;
                    String str = "AudioRecord.read failed: " + i;
                    RXLogging.e("WebRtcAudioRecord", str);
                    WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                }
            }
            try {
                AudioRecord audioRecord4 = WebRtcAudioRecord.this.audioRecord;
                if (audioRecord4 != null) {
                    com_bytedance_bae_webrtc_WebRtcAudioRecord$AudioRecordThread_android_media_AudioRecord_stop(audioRecord4);
                }
            } catch (Exception e2) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("AudioRecord.stop failed: ");
                LIZ4.append(e2.getMessage());
                RXLogging.e("WebRtcAudioRecord", X1D.LIZIZ(LIZ4));
            }
        }

        public static void com_bytedance_bae_webrtc_WebRtcAudioRecord$AudioRecordThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AudioRecordThread audioRecordThread) {
            boolean LIZ;
            try {
                audioRecordThread.com_bytedance_bae_webrtc_WebRtcAudioRecord$AudioRecordThread__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }
    }

    /* loaded from: classes12.dex */
    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    /* loaded from: classes12.dex */
    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    public static void com_bytedance_bae_webrtc_WebRtcAudioRecord_android_media_AudioRecord_release(AudioRecord audioRecord) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "7707548096646799891");
        if (c03880Dg.LIZJ(100403, "android/media/AudioRecord", "release", audioRecord, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100403, "android/media/AudioRecord", "release", null, objArr, audioRecord, c65300Pk0, false);
        } else {
            audioRecord.release();
            c03880Dg.LIZIZ(100403, "android/media/AudioRecord", "release", null, objArr, audioRecord, c65300Pk0, true);
        }
    }

    public static void com_bytedance_bae_webrtc_WebRtcAudioRecord_android_media_AudioRecord_startRecording(AudioRecord audioRecord) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "7707548096646799891");
        if (c03880Dg.LIZJ(100400, "android/media/AudioRecord", "startRecording", audioRecord, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100400, "android/media/AudioRecord", "startRecording", null, objArr, audioRecord, c65300Pk0, false);
        } else {
            audioRecord.startRecording();
            c03880Dg.LIZIZ(100400, "android/media/AudioRecord", "startRecording", null, objArr, audioRecord, c65300Pk0, true);
        }
    }

    public static int getDefaultAudioSource() {
        return 0;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    public native void nativeDataIsRecorded(int i, long j);

    private int getAudioSessionId() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null) {
            return -1;
        }
        return audioRecord.getAudioSessionId();
    }

    private int getAudioSource() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null) {
            return -1;
        }
        return audioRecord.getAudioSource();
    }

    private void logMainParametersExtended() {
        if (Build.VERSION.SDK_INT >= 23) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioRecord: buffer size in frames: ");
            LIZ.append(this.audioRecord.getBufferSizeInFrames());
            RXLogging.w("WebRtcAudioRecord", X1D.LIZIZ(LIZ));
        }
    }

    private void releaseAudioResources() {
        RXLogging.i("WebRtcAudioRecord", "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            com_bytedance_bae_webrtc_WebRtcAudioRecord_android_media_AudioRecord_release(audioRecord);
            this.audioRecord = null;
        }
    }

    private boolean startRecording() {
        this.apiResult = "StartRecording:";
        RXLogging.i("WebRtcAudioRecord", "StartRecording:");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null) {
            RXLogging.e("WebRtcAudioRecord", "null audio record object");
            return false;
        }
        if (this.audioThread != null) {
            RXLogging.e("WebRtcAudioRecord", "the previous audio thread leak");
            return false;
        }
        try {
            com_bytedance_bae_webrtc_WebRtcAudioRecord_android_media_AudioRecord_startRecording(audioRecord);
            if (this.audioRecord.getRecordingState() != 3) {
                AudioRecordStartErrorCode audioRecordStartErrorCode = AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AudioRecord.startRecording failed - incorrect state :");
                LIZ.append(this.audioRecord.getRecordingState());
                reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, X1D.LIZIZ(LIZ));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.apiResult);
                LIZ2.append("AudioRecord.startRecording failed - incorrect state :");
                LIZ2.append(this.audioRecord.getRecordingState());
                this.apiResult = X1D.LIZIZ(LIZ2);
                WebRtcAudioEffects webRtcAudioEffects = this.effects;
                if (webRtcAudioEffects != null) {
                    webRtcAudioEffects.release();
                }
                releaseAudioResources();
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("BaeRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioRecordStartErrorCode audioRecordStartErrorCode2 = AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("AudioRecord.startRecording failed: ");
            LIZ3.append(e.getMessage());
            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode2, X1D.LIZIZ(LIZ3));
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(this.apiResult);
            LIZ4.append("AudioRecord.startRecording failed: ");
            LIZ4.append(e.getMessage());
            this.apiResult = X1D.LIZIZ(LIZ4);
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopRecording() {
        this.apiResult = "StopRecording:";
        RXLogging.i("WebRtcAudioRecord", "StopRecording:");
        AudioRecordThread audioRecordThread = this.audioThread;
        if (audioRecordThread != null) {
            audioRecordThread.stopThread();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                RXLogging.e("WebRtcAudioRecord", "Join of AudioRecordJavaThread timed out");
                WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
                StringBuilder LIZ = X1D.LIZ();
                this.apiResult = JBR.LJFF(LIZ, this.apiResult, "Join of AudioRecordJavaThread timed out", LIZ);
            }
            this.audioThread = null;
        }
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        RXLogging.i("WebRtcAudioRecord", "stopRecording release done.");
        return true;
    }

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        defaultMediaModeAudioSource = defaultAudioSource;
    }

    private void logMainParameters() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioRecord: session ID: ");
        LIZ.append(this.audioRecord.getAudioSessionId());
        LIZ.append(", channels: ");
        LIZ.append(this.audioRecord.getChannelCount());
        LIZ.append(", sample rate: ");
        LIZ.append(this.audioRecord.getSampleRate());
        LIZ.append(", source:");
        LIZ.append(this.audioRecord.getAudioSource());
        RXLogging.w("WebRtcAudioRecord", X1D.LIZIZ(LIZ));
    }

    /* loaded from: classes12.dex */
    public static class AudioSamples {
        public final int audioFormat;
        public final int channelCount;
        public final byte[] data;
        public final int sampleRate;

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        public AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }
    }

    private String getApiResult() {
        return this.apiResult;
    }

    /* loaded from: classes12.dex */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH;

        public static AudioRecordStartErrorCode valueOf(String str) {
            return (AudioRecordStartErrorCode) V0N.LJJJ(AudioRecordStartErrorCode.class, str);
        }
    }

    public WebRtcAudioRecord(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ctor");
        LIZ.append(WebRtcAudioUtils.getThreadInfo());
        RXLogging.i("WebRtcAudioRecord", X1D.LIZIZ(LIZ));
        this.nativeAudioRecord = j;
        if (WebRtcAudioEffects.IsAudioEffectSupported()) {
            this.effects = WebRtcAudioEffects.create();
        }
    }

    public static void assertTrue(boolean z) {
        if (z) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableBuiltInAEC(");
        LIZ.append(z);
        LIZ.append(')');
        RXLogging.i("WebRtcAudioRecord", X1D.LIZIZ(LIZ));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            RXLogging.e("WebRtcAudioRecord", "Built-in AEC is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableBuiltInNS(");
        LIZ.append(z);
        LIZ.append(')');
        RXLogging.i("WebRtcAudioRecord", X1D.LIZIZ(LIZ));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            RXLogging.e("WebRtcAudioRecord", "Built-in NS is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setNS(z);
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Init recording error: ");
        LIZ.append(str);
        RXLogging.e("WebRtcAudioRecord", X1D.LIZIZ(LIZ));
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        RXLogging.i("WebRtcAudioRecord", "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMicrophoneMute(");
        LIZ.append(z);
        LIZ.append(")");
        RXLogging.w("WebRtcAudioRecord", X1D.LIZIZ(LIZ));
        microphoneMute = z;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    public void reportWebRtcAudioRecordError(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Run-time recording error: ");
        LIZ.append(str);
        RXLogging.e("WebRtcAudioRecord", X1D.LIZIZ(LIZ));
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private int cvtNativeSetAudioSource(int i, boolean z) {
        int i2 = defaultMediaModeAudioSource;
        if (!z) {
            i2 = 7;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 5) {
                    if (i != 6) {
                        if (i == 7) {
                            return 7;
                        }
                        if (i == 9) {
                            return 9;
                        }
                        if (i == 10) {
                            return 10;
                        }
                        return i2;
                    }
                    return 6;
                }
                return 5;
            }
            return 1;
        }
        return 0;
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Start recording error: ");
        LIZ.append(audioRecordStartErrorCode);
        LIZ.append(". ");
        LIZ.append(str);
        RXLogging.e("WebRtcAudioRecord", X1D.LIZIZ(LIZ));
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private int initRecording(int i, int i2, int i3, boolean z, int i4) {
        AudioRecord audioRecord;
        Object valueOf;
        StringBuilder LIZJ = C06460Ne.LIZJ("InitRecording(sampleRate=", i, ", channels=", i2, ", frameSizeMs=");
        LIZJ.append(i3);
        LIZJ.append(", forbidVoip=");
        LIZJ.append(z);
        LIZJ.append(", preferredSource=");
        String LIZ = C08380Uo.LIZ(LIZJ, i4, "):", LIZJ);
        this.apiResult = LIZ;
        RXLogging.w("WebRtcAudioRecord", LIZ);
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i5 = i2 * 2;
        int i6 = i / 100;
        if (i3 > 0 && i3 % 10 == 0) {
            i6 = (i3 * i) / 1000;
        }
        this.byteBuffer = ByteBuffer.allocateDirect(i5 * i6);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("byteBuffer.capacity: ");
        LIZ2.append(this.byteBuffer.capacity());
        RXLogging.i("WebRtcAudioRecord", X1D.LIZIZ(LIZ2));
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError(KMP.LJ("AudioRecord.getMinBufferSize failed: ", minBufferSize));
            StringBuilder LIZ3 = X1D.LIZ();
            this.apiResult = C40084FoG.LIZ(LIZ3, this.apiResult, "AudioRecord.getMinBufferSize failed: ", minBufferSize, LIZ3);
            return -1;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("AudioRecord.getMinBufferSize: ");
        LIZ4.append(minBufferSize);
        RXLogging.i("WebRtcAudioRecord", X1D.LIZIZ(LIZ4));
        int max = Math.max(minBufferSize, this.byteBuffer.capacity() * 2);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("bufferSizeInBytes: ");
        LIZ5.append(max);
        RXLogging.i("WebRtcAudioRecord", X1D.LIZIZ(LIZ5));
        try {
            synchronized (this) {
                int cvtNativeSetAudioSource = cvtNativeSetAudioSource(i4, z);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(this.apiResult);
                LIZ6.append(",AudioSource:");
                LIZ6.append(cvtNativeSetAudioSource);
                LIZ6.append(",MinBufferSize:");
                LIZ6.append(minBufferSize);
                LIZ6.append(",byteBuffer.capcity:");
                LIZ6.append(this.byteBuffer.capacity());
                LIZ6.append(", bufferSizeInBytes:");
                LIZ6.append(max);
                this.apiResult = X1D.LIZIZ(LIZ6);
                audioRecord = this.audioRecord;
                if (audioRecord == null) {
                    audioRecord = new AudioRecord(cvtNativeSetAudioSource, i, channelCountToConfiguration, 2, max);
                }
                this.audioRecord = audioRecord;
            }
            if (audioRecord.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources();
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append(this.apiResult);
                LIZ7.append("Failed to create a new AudioRecord instance state:");
                AudioRecord audioRecord2 = this.audioRecord;
                if (audioRecord2 == null) {
                    valueOf = "null";
                } else {
                    valueOf = Integer.valueOf(audioRecord2.getState());
                }
                LIZ7.append(valueOf);
                this.apiResult = X1D.LIZIZ(LIZ7);
                return -1;
            }
            WebRtcAudioEffects webRtcAudioEffects = this.effects;
            if (webRtcAudioEffects != null) {
                webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
            }
            logMainParameters();
            logMainParametersExtended();
            return i6;
        } catch (IllegalArgumentException e) {
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("AudioRecord ctor error: ");
            LIZ8.append(e.getMessage());
            reportWebRtcAudioRecordInitError(X1D.LIZIZ(LIZ8));
            releaseAudioResources();
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append(this.apiResult);
            LIZ9.append("AudioRecord ctor error: ");
            LIZ9.append(e.getMessage());
            this.apiResult = X1D.LIZIZ(LIZ9);
            return -1;
        }
    }
}
