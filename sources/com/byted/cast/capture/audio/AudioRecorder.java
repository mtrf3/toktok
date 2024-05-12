package com.byted.cast.capture.audio;

import X.C03880Dg;
import X.C65300Pk0;
import X.X1D;
import android.media.AudioRecord;
import android.media.AudioRouting;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.media.projection.MediaProjection;
import com.byted.cast.capture.encoder.AudioEncoder;
import com.byted.cast.common.config.Config;
import com.byted.cast.mediacommon.AudioProfile;
import com.byted.cast.mediacommon.ISafetyInterface;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.utils.Logger;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.Arrays;

/* loaded from: classes29.dex */
public final class AudioRecorder {
    public static final int[] AUDIO_SOURCES = {8, 5, 1, 0, 7, 6};
    public AudioEncoder mAudioEncoder;
    public IAudioRecordFrameCallback mAudioFrameCallback;
    public AudioProfile mAudioProfile;
    public Thread mCaptureThread;
    public Config mConfig;
    public AcousticEchoCanceler mEchoCanceler;
    public boolean mIsCaptureStarted;
    public volatile boolean mIsLoopExit;
    public boolean mIsMuted;
    public MediaProjection mMediaProjection;
    public NoiseSuppressor mNoiseSuppressor;
    public ISafetyInterface mSafetyInterface;
    public long mStartPTS;
    public long mTotalSamplesNum;
    public volatile double mFactor = 0.5d;
    public final Object mRecordingExit = new Object();

    /* loaded from: classes29.dex */
    public class AudioThread extends PthreadThread {
        public static void com_byted_cast_capture_audio_AudioRecorder$AudioThread_android_media_AudioRecord_release(AudioRecord audioRecord) {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = new Object[0];
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-6720754794295227229");
            if (c03880Dg.LIZJ(100403, "android/media/AudioRecord", "release", audioRecord, objArr, "void", c65300Pk0).LIZ) {
                c03880Dg.LIZIZ(100403, "android/media/AudioRecord", "release", null, objArr, audioRecord, c65300Pk0, false);
            } else {
                audioRecord.release();
                c03880Dg.LIZIZ(100403, "android/media/AudioRecord", "release", null, objArr, audioRecord, c65300Pk0, true);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com_byted_cast_capture_audio_AudioRecorder$AudioThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:15|(2:17|18)(1:260)|19|(2:23|(6:27|28|29|(5:31|(1:33)|34|(1:36)|38)|39|(2:41|42)(6:43|(2:45|(1:47))|48|(2:50|(1:52))|53|(2:55|56)(16:57|(1:59)(1:234)|60|61|(8:63|(1:65)(1:203)|66|(2:68|69)(2:199|(1:201)(1:202))|70|(1:(1:74)(2:75|(1:77)(1:78)))|79|(3:80|81|(1:161)(3:85|(3:89|(4:93|(1:95)|96|97)|(3:99|100|101)(1:103))(3:104|105|(5:142|143|(4:145|(1:147)|148|149)|150|(6:152|153|(1:155)|156|157|158)(1:159))(6:107|108|(4:110|111|112|114)|135|136|(3:138|139|140)(1:141)))|102)))|204|(2:206|207)(1:232)|208|(1:(2:212|213)(1:214))|215|(1:217)(1:231)|218|(1:220)|221|67e|226))))|236|237|238|(7:240|241|242|(1:(4:244|245|246|(3:248|249|250)(2:251|252))(1:256))|253|39|(0)(0))(4:258|253|39|(0)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:162:0x052b, code lost:
        
            com.byted.cast.mediacommon.utils.Logger.i("AudioRecorder", "mAudioRecord stop...");
         */
        /* JADX WARN: Code restructure failed: missing block: B:164:0x0532, code lost:
        
            if (r8 == null) goto L142;
         */
        /* JADX WARN: Code restructure failed: missing block: B:165:0x0534, code lost:
        
            r8.stopAudioRecord(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x0554, code lost:
        
            if (r20.this$0.mAudioProfile.isEnabledAudioMix() == false) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:169:0x0556, code lost:
        
            if (r6 == null) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:170:0x0558, code lost:
        
            if (r8 == null) goto L153;
         */
        /* JADX WARN: Code restructure failed: missing block: B:171:0x055a, code lost:
        
            r8.stopAudioRecord(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:172:0x055e, code lost:
        
            r0 = r20.this$0.mSafetyInterface;
         */
        /* JADX WARN: Code restructure failed: missing block: B:173:0x0562, code lost:
        
            if (r0 == null) goto L156;
         */
        /* JADX WARN: Code restructure failed: missing block: B:174:0x0564, code lost:
        
            r0.stop(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:175:0x0568, code lost:
        
            com.byted.cast.mediacommon.utils.Logger.e("AudioRecorder", "stop Error !!!");
         */
        /* JADX WARN: Code restructure failed: missing block: B:178:0x0538, code lost:
        
            r0 = r20.this$0.mSafetyInterface;
         */
        /* JADX WARN: Code restructure failed: missing block: B:179:0x053c, code lost:
        
            if (r0 == null) goto L147;
         */
        /* JADX WARN: Code restructure failed: missing block: B:180:0x053e, code lost:
        
            r0.stop(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:181:0x0545, code lost:
        
            com.byted.cast.mediacommon.utils.Logger.e("AudioRecorder", "stop Error !!!");
         */
        /* JADX WARN: Code restructure failed: missing block: B:182:0x0542, code lost:
        
            r2 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:183:0x0624, code lost:
        
            com.byted.cast.mediacommon.utils.Logger.i("AudioRecorder", "mAudioRecord release...");
         */
        /* JADX WARN: Code restructure failed: missing block: B:184:0x062b, code lost:
        
            if (r8 != null) goto L201;
         */
        /* JADX WARN: Code restructure failed: missing block: B:186:0x0632, code lost:
        
            r8.releaseAudioRecord(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:188:0x063d, code lost:
        
            if (r20.this$0.mAudioProfile.isEnabledAudioMix() != false) goto L206;
         */
        /* JADX WARN: Code restructure failed: missing block: B:190:0x0641, code lost:
        
            if (r8 != null) goto L208;
         */
        /* JADX WARN: Code restructure failed: missing block: B:192:0x0648, code lost:
        
            r8.releaseAudioRecord(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:193:0x0644, code lost:
        
            com_byted_cast_capture_audio_AudioRecorder$AudioThread_android_media_AudioRecord_release(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:194:0x064b, code lost:
        
            throw r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:195:0x062e, code lost:
        
            com_byted_cast_capture_audio_AudioRecorder$AudioThread_android_media_AudioRecord_release(r4);
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0273 A[Catch: Exception -> 0x064c, all -> 0x068b, TryCatch #5 {Exception -> 0x064c, blocks: (B:4:0x000a, B:7:0x0086, B:10:0x0095, B:12:0x00b9, B:18:0x00d4, B:19:0x00dc, B:21:0x0102, B:23:0x0106, B:25:0x010c, B:27:0x0114, B:29:0x0155, B:31:0x0174, B:33:0x019a, B:34:0x01a8, B:36:0x01ba, B:41:0x0273, B:43:0x0289, B:45:0x0291, B:47:0x02a3, B:48:0x02b1, B:50:0x02b9, B:52:0x02cb, B:53:0x02d9, B:55:0x02df, B:57:0x02f5, B:59:0x02fb, B:183:0x0624, B:186:0x0632, B:187:0x0635, B:192:0x0648, B:193:0x0644, B:194:0x064b, B:195:0x062e, B:204:0x05b8, B:207:0x05c6, B:208:0x05c9, B:213:0x05dc, B:214:0x05d8, B:215:0x05df, B:217:0x05e5, B:218:0x0600, B:220:0x0606, B:232:0x05c2, B:236:0x01cd, B:238:0x01ea, B:240:0x020c, B:258:0x0210, B:242:0x022b, B:244:0x0231, B:246:0x0233, B:248:0x024e, B:252:0x0255), top: B:3:0x000a, outer: #10 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0289 A[Catch: Exception -> 0x064c, all -> 0x068b, TryCatch #5 {Exception -> 0x064c, blocks: (B:4:0x000a, B:7:0x0086, B:10:0x0095, B:12:0x00b9, B:18:0x00d4, B:19:0x00dc, B:21:0x0102, B:23:0x0106, B:25:0x010c, B:27:0x0114, B:29:0x0155, B:31:0x0174, B:33:0x019a, B:34:0x01a8, B:36:0x01ba, B:41:0x0273, B:43:0x0289, B:45:0x0291, B:47:0x02a3, B:48:0x02b1, B:50:0x02b9, B:52:0x02cb, B:53:0x02d9, B:55:0x02df, B:57:0x02f5, B:59:0x02fb, B:183:0x0624, B:186:0x0632, B:187:0x0635, B:192:0x0648, B:193:0x0644, B:194:0x064b, B:195:0x062e, B:204:0x05b8, B:207:0x05c6, B:208:0x05c9, B:213:0x05dc, B:214:0x05d8, B:215:0x05df, B:217:0x05e5, B:218:0x0600, B:220:0x0606, B:232:0x05c2, B:236:0x01cd, B:238:0x01ea, B:240:0x020c, B:258:0x0210, B:242:0x022b, B:244:0x0231, B:246:0x0233, B:248:0x024e, B:252:0x0255), top: B:3:0x000a, outer: #10 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void com_byted_cast_capture_audio_AudioRecorder$AudioThread__run$___twin___() {
            /*
                Method dump skipped, instructions count: 1677
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.capture.audio.AudioRecorder.AudioThread.com_byted_cast_capture_audio_AudioRecorder$AudioThread__run$___twin___():void");
        }

        public AudioThread() {
            super("AudioRecorder$AudioThread");
        }

        public static void com_byted_cast_capture_audio_AudioRecorder$AudioThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AudioThread audioThread) {
            boolean LIZ;
            try {
                audioThread.com_byted_cast_capture_audio_AudioRecorder$AudioThread__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* loaded from: classes29.dex */
    public interface IAudioRecordFrameCallback {
        void onAudioEncoder(String str, int i, int i2, int i3, int i4);

        void onAudioEncoderStop();

        void onAudioFrameAvailable(byte[] bArr, MediaCodec.BufferInfo bufferInfo, MediaSetting.ACODEC_ID acodec_id, long j);

        void onAudioOutputFormatChange(MediaFormat mediaFormat);

        void onAudioPcm(byte[] bArr, int i, int i2, int i3, int i4, long j);

        void onAudioRecordFailed(int i);
    }

    public short clamp16(int i) {
        int i2 = i >> 31;
        if (((i >> 15) ^ i2) != 0) {
            i = i2 ^ 32767;
        }
        return (short) i;
    }

    public int getCurrentSampleRate() {
        return -1;
    }

    public void setOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
    }

    public boolean isAECEnabled() {
        AudioProfile audioProfile = this.mAudioProfile;
        if (audioProfile != null && audioProfile.isHwAECEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isNSEnabled() {
        AudioProfile audioProfile = this.mAudioProfile;
        if (audioProfile != null && audioProfile.isHwNSEnabled()) {
            return true;
        }
        return false;
    }

    public void pause() {
        if (this.mAudioEncoder != null && this.mAudioProfile.isEnableAudioPause()) {
            this.mAudioEncoder.pause();
        }
    }

    public void resume() {
        if (this.mAudioEncoder != null && this.mAudioProfile.isEnableAudioPause()) {
            this.mAudioEncoder.resume();
        }
    }

    public void stop() {
        Logger.i("AudioRecorder", "stop audio recording +");
        if (!this.mIsCaptureStarted) {
            Logger.w("AudioRecorder", "recording already stopped !");
            return;
        }
        MediaMonitor.onMonitor("MediaCapture_AudioRecorder_Stop", "");
        this.mIsLoopExit = true;
        this.mIsCaptureStarted = false;
        try {
            Thread thread = this.mCaptureThread;
            if (thread != null) {
                thread.join(500L);
                this.mCaptureThread.interrupt();
                this.mCaptureThread = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.mCaptureThread = null;
        }
        AudioEncoder audioEncoder = this.mAudioEncoder;
        if (audioEncoder != null) {
            audioEncoder.release();
        }
        this.mAudioEncoder = null;
        this.mMediaProjection = null;
        Logger.i("AudioRecorder", "stop audio recording -");
    }

    public boolean isCaptureStarted() {
        return this.mIsCaptureStarted;
    }

    public void enableAudioMix(boolean z) {
        AudioProfile audioProfile = this.mAudioProfile;
        if (audioProfile != null) {
            audioProfile.setEnableAudioMix(z);
        }
    }

    public void mute(boolean z) {
        this.mIsMuted = z;
    }

    public void onAudioRecordFailed(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioRecordFailed: ");
        LIZ.append(i);
        Logger.e("AudioRecorder", X1D.LIZIZ(LIZ));
        IAudioRecordFrameCallback iAudioRecordFrameCallback = this.mAudioFrameCallback;
        if (iAudioRecordFrameCallback != null) {
            iAudioRecordFrameCallback.onAudioRecordFailed(i);
        }
    }

    public void setAudioMixScale(int i) {
        if (i < 0 || i > 100) {
            Logger.e("AudioRecorder", "setAudioMixScale Error!!! factor should in range[0, 100]");
        } else {
            this.mFactor = i / 100.0d;
        }
    }

    public void setAudioSource(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioSource: ");
        LIZ.append(i);
        Logger.i("AudioRecorder", X1D.LIZIZ(LIZ));
        if (this.mAudioProfile.getAudioSource() == i) {
            return;
        }
        this.mAudioProfile.setAudioSource(i);
        if (this.mIsCaptureStarted) {
            this.mIsLoopExit = true;
            this.mIsCaptureStarted = false;
            try {
                Thread thread = this.mCaptureThread;
                if (thread != null) {
                    thread.join(1000L);
                    this.mCaptureThread.interrupt();
                    this.mCaptureThread = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.mCaptureThread = null;
            }
            start(this.mMediaProjection);
        }
    }

    public void setConfig(Config config) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setConfig: ");
        LIZ.append(config);
        Logger.i("AudioRecorder", X1D.LIZIZ(LIZ));
        this.mConfig = config;
    }

    public void setSeparateAudio(boolean z) {
        AudioProfile audioProfile = this.mAudioProfile;
        if (audioProfile != null) {
            audioProfile.setSeparateAudio(z);
        }
    }

    public boolean start(MediaProjection mediaProjection) {
        Logger.i("AudioRecorder", "start audio recording");
        if (!this.mAudioProfile.isEnabled()) {
            return true;
        }
        if (this.mIsCaptureStarted) {
            Logger.w("AudioRecorder", "recording already started !");
            return true;
        }
        MediaMonitor.onMonitor("MediaCapture_AudioRecorder_Start", "");
        AudioEncoder audioEncoder = new AudioEncoder(this.mAudioProfile, new AudioEncoder.IRecorderListener() { // from class: com.byted.cast.capture.audio.AudioRecorder.1
            @Override // com.byted.cast.capture.encoder.AudioEncoder.IRecorderListener
            public void onEncoderStop() {
                AudioRecorder.this.mAudioFrameCallback.onAudioEncoderStop();
            }

            @Override // com.byted.cast.capture.encoder.AudioEncoder.IRecorderListener
            public void onAudioRecordFailed(int i) {
                AudioRecorder.this.mAudioFrameCallback.onAudioRecordFailed(i);
            }

            @Override // com.byted.cast.capture.encoder.AudioEncoder.IRecorderListener
            public void onOutputFormatChange(MediaFormat mediaFormat) {
                AudioRecorder.this.mAudioFrameCallback.onAudioOutputFormatChange(mediaFormat);
            }

            @Override // com.byted.cast.capture.encoder.AudioEncoder.IRecorderListener
            public void onAudioFrameAvailable(byte[] bArr, MediaCodec.BufferInfo bufferInfo, MediaSetting.ACODEC_ID acodec_id, long j) {
                AudioRecorder.this.mAudioFrameCallback.onAudioFrameAvailable(bArr, bufferInfo, acodec_id, j);
            }

            @Override // com.byted.cast.capture.encoder.AudioEncoder.IRecorderListener
            public void onAudioEncoder(String str, int i, int i2, int i3, int i4) {
                AudioRecorder.this.mAudioFrameCallback.onAudioEncoder(str, i, i2, i3, i4);
            }
        });
        this.mAudioEncoder = audioEncoder;
        audioEncoder.prepare();
        this.mMediaProjection = mediaProjection;
        this.mTotalSamplesNum = 0L;
        this.mStartPTS = 0L;
        this.mIsLoopExit = false;
        this.mIsCaptureStarted = true;
        if (this.mCaptureThread == null) {
            AudioThread audioThread = new AudioThread();
            this.mCaptureThread = audioThread;
            audioThread.start();
        }
        this.mAudioEncoder.start();
        return true;
    }

    public AudioRecorder(MediaSetting mediaSetting, IAudioRecordFrameCallback iAudioRecordFrameCallback) {
        this.mConfig = mediaSetting.getConfig();
        this.mAudioProfile = mediaSetting.getAudioProfile();
        this.mAudioFrameCallback = iAudioRecordFrameCallback;
        try {
            this.mSafetyInterface = (ISafetyInterface) Class.forName("com.byted.cast.capture.safetyinterface.SafetyInterface").newInstance();
        } catch (Throwable th) {
            this.mSafetyInterface = null;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("create safetyinterface fail : ");
            LIZ.append(th.toString());
            Logger.e("AudioRecorder", X1D.LIZIZ(LIZ));
        }
    }

    private long getJitterFreePTS(long j, long j2) {
        if (!this.mAudioProfile.isAudioPtsOptimizeEnabled()) {
            return j;
        }
        long recordSampleRate = (j2 * 1000000) / this.mAudioProfile.getRecordSampleRate();
        long j3 = j - recordSampleRate;
        if (this.mTotalSamplesNum == 0) {
            this.mStartPTS = j3;
            this.mTotalSamplesNum = 0L;
        }
        long recordSampleRate2 = this.mStartPTS + ((this.mTotalSamplesNum * 1000000) / this.mAudioProfile.getRecordSampleRate());
        if (j3 - recordSampleRate2 >= recordSampleRate * 2 || j3 < recordSampleRate2 || this.mTotalSamplesNum * 10000000 > Long.MAX_VALUE) {
            this.mStartPTS = j3;
            this.mTotalSamplesNum = 0L;
        } else {
            j3 = recordSampleRate2;
        }
        this.mTotalSamplesNum += j2;
        return j3;
    }

    public byte[] appendAudioType(String str, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + str.length()];
        System.arraycopy(str.getBytes(), 0, bArr2, 0, str.length());
        System.arraycopy(bArr, 0, bArr2, str.length(), bArr.length);
        return bArr2;
    }

    public void onAudioFrameAvailable(byte[] bArr, int i) {
        if (this.mIsMuted) {
            Arrays.fill(bArr, (byte) 0);
        }
        long jitterFreePTS = getJitterFreePTS(System.nanoTime() / 1000, (bArr.length / this.mAudioProfile.getNumberOfChannels()) / 2);
        IAudioRecordFrameCallback iAudioRecordFrameCallback = this.mAudioFrameCallback;
        if (iAudioRecordFrameCallback != null) {
            iAudioRecordFrameCallback.onAudioPcm(bArr, this.mAudioProfile.getRecordSampleRate(), this.mAudioProfile.getNumberOfChannels(), this.mAudioProfile.getBitwidth(), this.mAudioProfile.getBitrate(), jitterFreePTS);
            AudioEncoder audioEncoder = this.mAudioEncoder;
            if (audioEncoder != null) {
                if (i != 0) {
                    int length = bArr.length - i;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, i, bArr2, 0, length);
                    this.mAudioEncoder.encode(bArr2, length, jitterFreePTS);
                    return;
                }
                audioEncoder.encode(bArr, bArr.length, jitterFreePTS);
            }
        }
    }
}
