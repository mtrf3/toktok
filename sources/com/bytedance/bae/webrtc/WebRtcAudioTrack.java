package com.bytedance.bae.webrtc;

import X.C06460Ne;
import X.C16880lQ;
import X.C19U;
import X.JBR;
import X.V0N;
import X.X1D;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.ExceptionUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class WebRtcAudioTrack {
    public static final int DEFAULT_USAGE;
    public static ErrorCallback errorCallback;
    public static WebRtcAudioTrackErrorCallback errorCallbackOld;
    public static boolean sForbidVoip;
    public static volatile boolean speakerMute;
    public static int usageAttribute;
    public String apiResult;
    public final AudioManager audioManager;
    public AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    public byte[] emptyBytes;
    public final long nativeAudioTrack;
    public final ThreadUtils.ThreadChecker threadChecker;

    /* loaded from: classes12.dex */
    public class AudioTrackThread extends Thread {
        public volatile boolean keepAlive;

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com_bytedance_bae_webrtc_WebRtcAudioTrack$AudioTrackThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void stopThread() {
            synchronized (this) {
                RXLogging.i("WebRtcAudioTrack", "stopThread");
                this.keepAlive = false;
            }
        }

        public void com_bytedance_bae_webrtc_WebRtcAudioTrack$AudioTrackThread__run$___twin___() {
            int i;
            if (WebRtcAudioTrack.this.audioTrack == null) {
                RXLogging.e("WebRtcAudioTrack", "null audio track instance");
                this.keepAlive = false;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AudioTrackThread");
                LIZ.append(WebRtcAudioUtils.getThreadInfo());
                RXLogging.i("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("AudioTrack state: ");
                LIZ2.append(WebRtcAudioTrack.this.audioTrack.getPlayState());
                RXLogging.i("WebRtcAudioTrack", X1D.LIZIZ(LIZ2));
            }
            Process.setThreadPriority(-19);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                synchronized (this) {
                    if (this.keepAlive) {
                        WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                        webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                    }
                }
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                    webRtcAudioTrack2.byteBuffer.put(webRtcAudioTrack2.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                try {
                    WebRtcAudioTrack webRtcAudioTrack3 = WebRtcAudioTrack.this;
                    i = writeBytes(webRtcAudioTrack3.audioTrack, webRtcAudioTrack3.byteBuffer, capacity);
                } catch (Exception e) {
                    this.keepAlive = false;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("AudioTrack.write error, Exception: ");
                    LIZ3.append(e.getMessage());
                    RXLogging.e("WebRtcAudioTrack", X1D.LIZIZ(LIZ3));
                    WebRtcAudioTrack webRtcAudioTrack4 = WebRtcAudioTrack.this;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("AudioTrack.write error, Exception: ");
                    LIZ4.append(e.getMessage());
                    webRtcAudioTrack4.reportWebRtcAudioTrackError(X1D.LIZIZ(LIZ4));
                    i = -1;
                }
                if (i != capacity && i < 0) {
                    this.keepAlive = false;
                    RXLogging.e("WebRtcAudioTrack", "AudioTrack.write played invalid number of bytes: " + i);
                    WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + i);
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                RXLogging.i("WebRtcAudioTrack", "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    RXLogging.i("WebRtcAudioTrack", "AudioTrack.stop is done.");
                } catch (Exception e2) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("AudioTrack.stop failed: ");
                    LIZ5.append(e2.getMessage());
                    RXLogging.e("WebRtcAudioTrack", X1D.LIZIZ(LIZ5));
                }
            }
        }

        public static void com_bytedance_bae_webrtc_WebRtcAudioTrack$AudioTrackThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AudioTrackThread audioTrackThread) {
            boolean LIZ;
            try {
                audioTrackThread.com_bytedance_bae_webrtc_WebRtcAudioTrack$AudioTrackThread__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            if (audioTrack == null) {
                return -1;
            }
            return audioTrack.write(byteBuffer, i, 0);
        }
    }

    /* loaded from: classes12.dex */
    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    /* loaded from: classes12.dex */
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    public static int getDefaultUsageAttribute() {
        return 2;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    public native void nativeGetPlayoutData(int i, long j);

    private String getApiResult() {
        this.threadChecker.checkIsOnValidThread();
        return this.apiResult;
    }

    private int getAudioSessionId() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            return -1;
        }
        return audioTrack.getAudioSessionId();
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.i("WebRtcAudioTrack", "getStreamMaxVolume");
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return -1;
        }
        return C16880lQ.LLLLLLZZ(audioManager, 0);
    }

    private int getStreamType() {
        this.threadChecker.checkIsOnValidThread();
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            return -1;
        }
        return audioTrack.getStreamType();
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.i("WebRtcAudioTrack", "getStreamVolume");
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return -1;
        }
        return audioManager.getStreamVolume(0);
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioTrack: buffer capacity in frames: ");
            LIZ.append(this.audioTrack.getBufferCapacityInFrames());
            RXLogging.i("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
        }
    }

    private void logBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioTrack: buffer size in frames: ");
            LIZ.append(this.audioTrack.getBufferSizeInFrames());
            RXLogging.i("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
        }
    }

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24 && this.audioTrack != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("underrun count: ");
            LIZ.append(this.audioTrack.getUnderrunCount());
            RXLogging.i("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
        }
    }

    private void releaseAudioResources() {
        RXLogging.i("WebRtcAudioTrack", "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.i("WebRtcAudioTrack", "startPlayout");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            RXLogging.e("WebRtcAudioTrack", "null audio track object");
            return false;
        }
        if (this.audioThread != null) {
            RXLogging.e("WebRtcAudioTrack", "the previous audio thread leak");
            return false;
        }
        this.apiResult = "StartPlayout:";
        try {
            audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                AudioTrackStartErrorCode audioTrackStartErrorCode = AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AudioTrack.play failed - incorrect state :");
                LIZ.append(this.audioTrack.getPlayState());
                reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, X1D.LIZIZ(LIZ));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.apiResult);
                LIZ2.append("AudioTrack.play failed - incorrect state :");
                LIZ2.append(this.audioTrack.getPlayState());
                this.apiResult = X1D.LIZIZ(LIZ2);
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("BaeTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioTrackStartErrorCode audioTrackStartErrorCode2 = AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("AudioTrack.play failed: ");
            LIZ3.append(e.getMessage());
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, X1D.LIZIZ(LIZ3));
            releaseAudioResources();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(this.apiResult);
            LIZ4.append("AudioTrack.play failed: ");
            LIZ4.append(e.getMessage());
            this.apiResult = X1D.LIZIZ(LIZ4);
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.i("WebRtcAudioTrack", "stopPlayout");
        this.apiResult = "StopPlayout:";
        logUnderrunCount();
        if (this.audioThread != null) {
            RXLogging.i("WebRtcAudioTrack", "Stopping the AudioTrackThread...");
            this.audioThread.stopThread();
            RXLogging.i("WebRtcAudioTrack", "interrupt the AudioTrackThread...");
            this.audioThread.interrupt();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                RXLogging.e("WebRtcAudioTrack", "Join of AudioTrackThread timed out.");
                WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
                StringBuilder LIZ = X1D.LIZ();
                this.apiResult = JBR.LJFF(LIZ, this.apiResult, "Join of AudioTrackThread timed out.", LIZ);
            }
            RXLogging.i("WebRtcAudioTrack", "AudioTrackThread has now been stopped.");
            this.audioThread = null;
        }
        releaseAudioResources();
        RXLogging.i("WebRtcAudioTrack", "stopPlayout release done.");
        return true;
    }

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
    }

    private void logMainParameters() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioTrack: session ID: ");
        LIZ.append(this.audioTrack.getAudioSessionId());
        LIZ.append(", channels: ");
        LIZ.append(this.audioTrack.getChannelCount());
        LIZ.append(", sample rate: ");
        LIZ.append(this.audioTrack.getSampleRate());
        LIZ.append(", max gain: ");
        LIZ.append(AudioTrack.getMaxVolume());
        RXLogging.i("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    /* loaded from: classes9.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH;

        public static AudioTrackStartErrorCode valueOf(String str) {
            return (AudioTrackStartErrorCode) V0N.LJJJ(AudioTrackStartErrorCode.class, str);
        }
    }

    public WebRtcAudioTrack(long j) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.apiResult = "";
        threadChecker.checkIsOnValidThread();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ctor");
        LIZ.append(WebRtcAudioUtils.getThreadInfo());
        RXLogging.i("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) C16880lQ.LLILL(ContextUtils.getApplicationContext(), "audio");
    }

    public static void assertTrue(boolean z) {
        if (z) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Init playout error: ");
        LIZ.append(str);
        RXLogging.e("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Default usage attribute is changed from: ");
            LIZ.append(DEFAULT_USAGE);
            LIZ.append(" to ");
            LIZ.append(i);
            RXLogging.w("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
            usageAttribute = i;
        }
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        RXLogging.i("WebRtcAudioTrack", "Set extended error callback");
        errorCallback = errorCallback2;
    }

    public static void setSpeakerMute(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSpeakerMute(");
        LIZ.append(z);
        LIZ.append(")");
        RXLogging.w("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setStreamVolume(");
        LIZ.append(i);
        LIZ.append(")");
        RXLogging.i("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
        if (this.audioManager == null) {
            return false;
        }
        if (isVolumeFixed()) {
            RXLogging.e("WebRtcAudioTrack", "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    public void reportWebRtcAudioTrackError(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Run-time playback error: ");
        LIZ.append(str);
        RXLogging.e("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        RXLogging.i("WebRtcAudioTrack", "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Start playout error: ");
        LIZ.append(audioTrackStartErrorCode);
        LIZ.append(". ");
        LIZ.append(str);
        RXLogging.e("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        int i4;
        RXLogging.i("WebRtcAudioTrack", "createAudioTrackOnLollipopOrHigher");
        if (sForbidVoip) {
            i4 = 3;
        } else {
            i4 = 0;
        }
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(i4);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("nativeOutputSampleRate: ");
        LIZ.append(nativeOutputSampleRate);
        RXLogging.i("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
        if (i != nativeOutputSampleRate) {
            RXLogging.w("WebRtcAudioTrack", "Unable to use fast mode since requested sample rate is not native");
        }
        if (sForbidVoip) {
            usageAttribute = 1;
        } else {
            usageAttribute = DEFAULT_USAGE;
        }
        if (usageAttribute != DEFAULT_USAGE) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("A non default usage attribute is used: ");
            LIZ2.append(usageAttribute);
            RXLogging.w("WebRtcAudioTrack", X1D.LIZIZ(LIZ2));
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    public static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        if (sForbidVoip) {
            return new AudioTrack(3, i, i2, 2, i3, 1);
        }
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private boolean initPlayout(int i, int i2, boolean z) {
        StringBuilder LIZJ = C06460Ne.LIZJ("InitPlayout(sampleRate=", i, ", channels=", i2, ", forbidVoip=");
        this.apiResult = C19U.LIZ(LIZJ, z, "):", LIZJ);
        sForbidVoip = z;
        try {
            this.threadChecker.checkIsOnValidThread();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initPlayout(sampleRate=");
            LIZ.append(i);
            LIZ.append(", channels=");
            LIZ.append(i2);
            LIZ.append(")");
            RXLogging.i("WebRtcAudioTrack", X1D.LIZIZ(LIZ));
            this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("byteBuffer.capacity: ");
            LIZ2.append(this.byteBuffer.capacity());
            RXLogging.i("WebRtcAudioTrack", X1D.LIZIZ(LIZ2));
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
            int channelCountToConfiguration = channelCountToConfiguration(i2);
            int minBufferSize = AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("AudioTrack.getMinBufferSize: ");
            LIZ3.append(minBufferSize);
            RXLogging.i("WebRtcAudioTrack", X1D.LIZIZ(LIZ3));
            if (minBufferSize < this.byteBuffer.capacity()) {
                reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(this.apiResult);
                LIZ4.append("AudioTrack.getMinBufferSize returns an invalid value.");
                this.apiResult = X1D.LIZIZ(LIZ4);
                return false;
            }
            if (this.audioTrack != null) {
                reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(this.apiResult);
                LIZ5.append("Conflict with existing AudioTrack.");
                this.apiResult = X1D.LIZIZ(LIZ5);
                return false;
            }
            try {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(this.apiResult);
                LIZ6.append("minBufferSizeInBytes: ");
                LIZ6.append(minBufferSize);
                this.apiResult = X1D.LIZIZ(LIZ6);
                AudioTrack createAudioTrackOnLollipopOrHigher = createAudioTrackOnLollipopOrHigher(i, channelCountToConfiguration, minBufferSize);
                this.audioTrack = createAudioTrackOnLollipopOrHigher;
                if (createAudioTrackOnLollipopOrHigher == null || createAudioTrackOnLollipopOrHigher.getState() != 1) {
                    reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                    releaseAudioResources();
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append(this.apiResult);
                    LIZ7.append("Initialization of audio track failed.");
                    this.apiResult = X1D.LIZIZ(LIZ7);
                    return false;
                }
                logMainParameters();
                logMainParametersExtended();
                return true;
            } catch (IllegalArgumentException e) {
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append(ExceptionUtils.stackTrace(e));
                LIZ8.append(e.getMessage());
                reportWebRtcAudioTrackInitError(X1D.LIZIZ(LIZ8));
                releaseAudioResources();
                return false;
            }
        } catch (Exception e2) {
            RXLogging.w("WebRtcAudioTrack", "initPlayout exception", e2);
            reportWebRtcAudioTrackInitError(ExceptionUtils.stackTrace(e2));
            StringBuilder LIZ9 = X1D.LIZ();
            this.apiResult = JBR.LJFF(LIZ9, this.apiResult, "initPlayout exception", LIZ9);
            return false;
        }
    }
}
