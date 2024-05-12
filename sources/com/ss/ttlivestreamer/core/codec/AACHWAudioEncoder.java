package com.ss.ttlivestreamer.core.codec;

import X.C012403c;
import X.C08380Uo;
import X.C15890jp;
import X.C16880lQ;
import X.C1EU;
import X.KMP;
import X.X1D;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.Surface;
import com.ss.ttlivestreamer.core.engine.AudioEncoder;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.LogUtil;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AACHWAudioEncoder extends AudioEncoder {
    public static final String TAG = C16880lQ.LJLLJ(AACHWAudioEncoder.class);
    public int mBitWidth;
    public int mBitrateBps;
    public int mChannelCount;
    public MediaCodec mCodec;
    public Runnable mEncodeRunnable;
    public SafeHandlerThread mEncodeThread;
    public Handler mHandler;
    public int mProfile;
    public int mSampleRateHz;
    public final String mCodecMime = "audio/mp4a-latm";
    public final Queue<AudioFrameBuffer> mBufferQueue = new LinkedList();
    public final MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();
    public final int MAX_BUFFER_SIZE = 50;
    public final int FRAME_PARAM_ERROR = -101;
    public final int FRAME_SIZE_ERROR = -102;
    public final int NO_AVAILABLE_BUFFER_ERROR = -103;
    public final int POST_RUNNABLE_ERROR = -104;
    public final int BYTEBUFFER_OPERATION_ERROR = -105;
    public boolean mHardware = true;

    public static String GetSupportedFormats() {
        return "audio_type=audio/mp4a-latm";
    }

    public int convertAacProfile(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? -1 : 29;
        }
        return 5;
    }

    public boolean setupCodecName() {
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            try {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null && codecInfoAt.isEncoder()) {
                    for (String str : codecInfoAt.getSupportedTypes()) {
                        if ("audio/mp4a-latm".equals(str)) {
                            return true;
                        }
                    }
                }
            } catch (IllegalArgumentException e) {
                String str2 = TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Cannot retrieve encoder codec info ");
                LIZ.append(e);
                AVLog.ioe(str2, X1D.LIZIZ(LIZ));
            }
        }
        return false;
    }

    private AudioFrameBuffer getAvailableFrameBuffer() {
        AudioFrameBuffer next;
        Iterator<AudioFrameBuffer> it = this.mBufferQueue.iterator();
        do {
            AudioFrameBuffer audioFrameBuffer = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                if (this.mBufferQueue.size() < 50) {
                    AudioFrameBuffer audioFrameBuffer2 = new AudioFrameBuffer();
                    this.mBufferQueue.add(audioFrameBuffer2);
                    return audioFrameBuffer2;
                }
                int i = 0;
                int i2 = 0;
                for (AudioFrameBuffer audioFrameBuffer3 : this.mBufferQueue) {
                    if (audioFrameBuffer3.mUsed == 1) {
                        i2++;
                        audioFrameBuffer3.mUsed = 0;
                        if (audioFrameBuffer == null) {
                            audioFrameBuffer = audioFrameBuffer3;
                        }
                    } else {
                        i++;
                    }
                }
                if (audioFrameBuffer != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Buffer queue size ");
                    LIZ.append(this.mBufferQueue.size());
                    LIZ.append(", dropped ");
                    LIZ.append(i2);
                    LIZ.append(" audio frames.");
                    AVLog2.logToIODevice2(5, TAG, X1D.LIZIZ(LIZ), null, 58, 10000);
                    return audioFrameBuffer;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Buffer queue size ");
                LIZ2.append(this.mBufferQueue.size());
                LIZ2.append(", ");
                LIZ2.append(i);
                LIZ2.append(" frames are in use.");
                AVLog2.logToIODevice2(6, TAG, X1D.LIZIZ(LIZ2), null, 59, 10000);
                return audioFrameBuffer;
            }
        } while (next.mUsed != 0);
        return next;
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder
    public String getEncoderInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaCodec mediaCodec = this.mCodec;
            if (mediaCodec != null) {
                jSONObject.put("codec_name", mediaCodec.getName());
            }
            jSONObject.put("hardware", this.mHardware);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject.toString();
    }

    public AudioFrameBuffer pollFilledFrameBuffer() {
        AudioFrameBuffer audioFrameBuffer = null;
        for (AudioFrameBuffer audioFrameBuffer2 : this.mBufferQueue) {
            if (audioFrameBuffer2.mUsed == 1 && (audioFrameBuffer == null || audioFrameBuffer.mTimestampUs > audioFrameBuffer2.mTimestampUs)) {
                audioFrameBuffer = audioFrameBuffer2;
            }
        }
        return audioFrameBuffer;
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder, com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
        Thread thread;
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this.mEncodeRunnable);
        final Object obj = new Object();
        final boolean[] zArr = {true};
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.codec.AACHWAudioEncoder.3
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_codec_AACHWAudioEncoder$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_codec_AACHWAudioEncoder$3__run$___twin___() {
                AACHWAudioEncoder.this.releaseInternal();
                synchronized (obj) {
                    zArr[0] = false;
                    obj.notifyAll();
                }
            }

            public static void com_ss_ttlivestreamer_core_codec_AACHWAudioEncoder$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_ttlivestreamer_core_codec_AACHWAudioEncoder$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        synchronized (obj) {
            try {
                obj.wait(1000L);
                if (zArr[0] && (thread = this.mHandler.getLooper().getThread()) != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Thread \"");
                    LIZ.append(thread.getName());
                    LIZ.append("\" id: ");
                    LIZ.append(thread.getId());
                    LIZ.append(", status: ");
                    LIZ.append(thread.getState());
                    LIZ.append(", stack: ");
                    LIZ.append(Arrays.toString(thread.getStackTrace()));
                    AVLog.logKibana(6, TAG, X1D.LIZIZ(LIZ), null);
                }
            } catch (InterruptedException unused) {
            }
        }
        SafeHandlerThreadPoolExecutor.unlockThread(this.mEncodeThread);
        this.mEncodeThread = null;
        this.mHandler = null;
    }

    public void releaseInternal() {
        MediaCodec mediaCodec = this.mCodec;
        if (mediaCodec == null) {
            return;
        }
        try {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(1000000L);
            if (dequeueInputBuffer >= 0) {
                ByteBuffer byteBuffer = this.mCodec.getInputBuffers()[dequeueInputBuffer];
                if (byteBuffer != null) {
                    byteBuffer.position(0);
                    byteBuffer.limit(0);
                }
                this.mCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            } else {
                AVLog.ioe(TAG, "Failed to get an available input buffer in 1 second.");
            }
            tryFetchEncodedFrame(true);
        } catch (Exception e) {
            String str = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("signalEndOfInputStream failed\n");
            LIZ.append(e.getMessage());
            AVLog.ioe(str, X1D.LIZIZ(LIZ));
        }
        try {
            MediaCodec mediaCodec2 = this.mCodec;
            if (mediaCodec2 != null) {
                mediaCodec2.stop();
            }
        } catch (Exception e2) {
            String str2 = TAG;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Encoder stop failed. message: ");
            LIZ2.append(e2.getMessage());
            LIZ2.append(", cause: ");
            LIZ2.append(e2.getCause());
            LIZ2.append(", stack: ");
            LIZ2.append(Log.getStackTraceString(e2));
            AVLog.logKibana(6, str2, X1D.LIZIZ(LIZ2), null);
        }
        try {
            MediaCodec mediaCodec3 = this.mCodec;
            this.mCodec = null;
            if (mediaCodec3 != null) {
                mediaCodec3.release();
            }
        } catch (Exception e3) {
            String str3 = TAG;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Encoder release failed. message: ");
            LIZ3.append(e3.getMessage());
            LIZ3.append(", cause: ");
            LIZ3.append(e3.getCause());
            LIZ3.append(", stack: ");
            LIZ3.append(Log.getStackTraceString(e3));
            AVLog.logKibana(6, str3, X1D.LIZIZ(LIZ3), null);
        }
    }

    public AACHWAudioEncoder() {
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("AACHardwareEncodeThread");
        this.mEncodeThread = lockThread;
        lockThread.start();
        this.mHandler = this.mEncodeThread.getHandler();
    }

    /* loaded from: classes12.dex */
    public class AudioFrameBuffer {
        public ByteBuffer mFrame;
        public int mSamplesPerChannel;
        public long mTimestampUs;
        public volatile int mUsed;

        public AudioFrameBuffer() {
        }
    }

    private void parseRealAACProfile(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 3;
        int i2 = byteBuffer.get() >> 3;
        byteBuffer.position(position);
        boolean z = true;
        if (i2 == 2) {
            z = false;
            i = 1;
        } else {
            if (i2 != 5) {
                if (i2 == 29) {
                    i = 4;
                } else {
                    i = i2 + 100;
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(KMP.LJ("Unsupported audioObjectType ", i2));
                    TTLSSladarBugReportUtils tTLSSladarBugReportUtils = TTLSSladarBugReportUtils.getInstance();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(TAG);
                    LIZ.append(".parseRealAACProfile");
                    tTLSSladarBugReportUtils.report(androidRuntimeException, X1D.LIZIZ(LIZ));
                    if (TTLSBuildConfig.canThrowException()) {
                        throw androidRuntimeException;
                    }
                }
            }
            z = false;
        }
        if (i != this.mProfile) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("preset_audio_profile", this.mProfile);
                jSONObject.put("real_audio_profile", i);
                AVLog.logKibana(5, TAG, jSONObject.toString(), null);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (!z) {
                nativeEncodeWarning(20, this.mProfile, i);
                this.mProfile = i;
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        this.mSampleRateHz = tEBundle.getInt("audio_sample");
        this.mChannelCount = tEBundle.getInt("audio_channels");
        this.mBitWidth = tEBundle.getInt("audio_bit_width");
        this.mBitrateBps = tEBundle.getInt("audio_bit_rate");
        int i = tEBundle.getInt("audio_profileLevel");
        this.mProfile = i;
        return initEncoderInternal(this.mSampleRateHz, this.mChannelCount, this.mBitWidth, this.mBitrateBps, i);
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder
    public int SetBitrate(int i) {
        if (i >= 0 && this.mBitrateBps != i && this.mCodec != null) {
            boolean initEncoderInternal = initEncoderInternal(this.mSampleRateHz, this.mChannelCount, this.mBitWidth, i, this.mProfile);
            if (LogUtil.logFilterSwitch()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("try setAudioBitrate from ");
                C15890jp.LIZIZ(LIZ, this.mBitrateBps, " to ", i, "，returns ");
                LIZ.append(initEncoderInternal);
                AVLog.iod("AACHWAudioEncoder", X1D.LIZIZ(LIZ));
            }
            if (initEncoderInternal) {
                this.mBitrateBps = i;
                return 0;
            }
        }
        return -1;
    }

    public String getAacProfileName(int i) {
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    return KMP.LJ("Unknown profile ", i);
                }
                return "AAC-HEv2";
            }
            return "AAC-HE";
        }
        return "AAC-LC";
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void setNativeObj(long j) {
        if (j == 0) {
            release();
        }
        super.setNativeObj(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r3 >= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r3 >= 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tryFetchEncodedFrame(boolean r14) {
        /*
            r13 = this;
            r7 = r13
            android.media.MediaCodec r3 = r7.mCodec
            if (r3 != 0) goto L6
            return
        L6:
            android.media.MediaCodec$BufferInfo r2 = r7.mBufferInfo
            r0 = 0
            int r3 = r3.dequeueOutputBuffer(r2, r0)
            r6 = 0
            r5 = 0
        L10:
            if (r14 == 0) goto L69
            r2 = 20
            if (r5 >= r2) goto L45
            if (r3 < 0) goto L3d
        L18:
            android.media.MediaCodec r2 = r7.mCodec
            java.nio.ByteBuffer r2 = r2.getOutputBuffer(r3)
            java.nio.ByteBuffer r8 = r2.slice()
            android.media.MediaCodec$BufferInfo r2 = r7.mBufferInfo
            int r2 = r2.flags
            r2 = r2 & 2
            if (r2 == 0) goto L2d
            r7.parseRealAACProfile(r8)
        L2d:
            android.media.MediaCodec$BufferInfo r2 = r7.mBufferInfo
            int r9 = r2.size
            int r10 = r2.flags
            long r11 = r2.presentationTimeUs
            r7.nativeEncoded(r8, r9, r10, r11)
            android.media.MediaCodec r2 = r7.mCodec
            r2.releaseOutputBuffer(r3, r6)
        L3d:
            android.media.MediaCodec$BufferInfo r4 = r7.mBufferInfo
            int r2 = r4.flags
            r2 = r2 & 4
            if (r2 == 0) goto L60
        L45:
            if (r3 >= 0) goto L5f
        L47:
            r0 = -1
            if (r3 == r0) goto L5f
            r0 = -2
            if (r3 == r0) goto L5f
            java.lang.String r1 = com.ss.ttlivestreamer.core.codec.AACHWAudioEncoder.TAG
            java.lang.String r0 = "dequeueOutputBuffer failed: outputIndex "
            java.lang.String r2 = X.KMP.LJ(r0, r3)
            r3 = 0
            r0 = 6
            r4 = 57
            r5 = 10000(0x2710, float:1.4013E-41)
            com.ss.ttlivestreamer.core.utils.AVLog2.logToIODevice2(r0, r1, r2, r3, r4, r5)
        L5f:
            return
        L60:
            android.media.MediaCodec r2 = r7.mCodec
            int r3 = r2.dequeueOutputBuffer(r4, r0)
            int r5 = r5 + 1
            goto L10
        L69:
            if (r3 < 0) goto L47
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.core.codec.AACHWAudioEncoder.tryFetchEncodedFrame(boolean):void");
    }

    private boolean initEncoderInternal(final int i, final int i2, int i3, final int i4, final int i5) {
        final boolean[] zArr = new boolean[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.core.codec.AACHWAudioEncoder.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_codec_AACHWAudioEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_codec_AACHWAudioEncoder$1__run$___twin___() {
                MediaCodec mediaCodec = AACHWAudioEncoder.this.mCodec;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                    AACHWAudioEncoder.this.mCodec.release();
                    AACHWAudioEncoder.this.mCodec = null;
                }
                if (i5 != 1 && AACHWAudioEncoder.this.mProfile != 3) {
                    String str = AACHWAudioEncoder.TAG;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("MediaCodec doesn't support profile ");
                    LIZ.append(AACHWAudioEncoder.this.mProfile);
                    AVLog.ioe(str, X1D.LIZIZ(LIZ));
                    zArr[0] = false;
                    return;
                }
                try {
                    MediaCodecInfo findCodecForType = MediaCodecUtils.findCodecForType("audio/mp4a-latm");
                    AACHWAudioEncoder.this.mCodec = MediaCodec.createByCodecName(findCodecForType.getName());
                } catch (Exception e) {
                    AACHWAudioEncoder.this.mHardware = false;
                    AVLog.logKibana(6, AACHWAudioEncoder.TAG, "MediaCodec.createByCodecName(audio/mp4a-latm) failed", e);
                    try {
                        AACHWAudioEncoder.this.mCodec = MediaCodec.createByCodecName("OMX.google.aac.encoder");
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                        String str2 = AACHWAudioEncoder.TAG;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("MediaCodec.createEncoderByType(\"OMX.google.aac.encoder\") failed: ");
                        LIZ2.append(e2);
                        AVLog.ioe(str2, X1D.LIZIZ(LIZ2));
                        zArr[0] = false;
                        return;
                    }
                }
                try {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = AACHWAudioEncoder.this.mCodec.getCodecInfo().getCapabilitiesForType("audio/mp4a-latm");
                    int convertAacProfile = AACHWAudioEncoder.this.convertAacProfile(i5);
                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                    int length = codecProfileLevelArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            String str3 = AACHWAudioEncoder.TAG;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("AAC Profile ");
                            LIZ3.append(AACHWAudioEncoder.this.getAacProfileName(i5));
                            LIZ3.append(" not found. Use default LC profile.");
                            AVLog.ioe(str3, X1D.LIZIZ(LIZ3));
                            if (i5 != 1) {
                                AACHWAudioEncoder.this.mCodec.release();
                                AACHWAudioEncoder.this.mCodec = null;
                                zArr[0] = false;
                                return;
                            }
                        } else {
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i6];
                            String str4 = AACHWAudioEncoder.TAG;
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("Find profile = ");
                            LIZ4.append(codecProfileLevel.profile);
                            AVLog.iod(str4, X1D.LIZIZ(LIZ4));
                            if (codecProfileLevel.profile == convertAacProfile) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                    }
                    MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
                    createAudioFormat.setInteger("bitrate", i4);
                    createAudioFormat.setInteger("profile", convertAacProfile);
                    createAudioFormat.setInteger("aac-profile", convertAacProfile);
                    if (convertAacProfile == 29) {
                        createAudioFormat.setInteger("aac-sbr-mode", 2);
                    }
                    createAudioFormat.setInteger("max-input-size", ((i * i2) * 2) / 20);
                    AACHWAudioEncoder.this.mCodec.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
                    AACHWAudioEncoder.this.mCodec.start();
                    zArr[0] = true;
                } catch (Exception e3) {
                    String str5 = AACHWAudioEncoder.TAG;
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("init AAC Encoder failed. message: ");
                    LIZ5.append(e3.getMessage());
                    LIZ5.append(", cause: ");
                    LIZ5.append(e3.getCause());
                    LIZ5.append(", stack: ");
                    LIZ5.append(Log.getStackTraceString(e3));
                    AVLog.logKibana(6, str5, X1D.LIZIZ(LIZ5), null);
                    zArr[0] = false;
                    AACHWAudioEncoder.this.releaseInternal();
                }
            }

            public static void com_ss_ttlivestreamer_core_codec_AACHWAudioEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_codec_AACHWAudioEncoder$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return zArr[0];
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder
    public int Encode(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i2;
        if (i != this.mSampleRateHz || i8 != this.mChannelCount) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Target sample rate ");
            LIZ.append(this.mSampleRateHz);
            LIZ.append("Hz, channel count ");
            C15890jp.LIZIZ(LIZ, this.mChannelCount, "; Actual sample rate ", i, "Hz, channel count ");
            AVLog2.logToIODevice2(6, TAG, C08380Uo.LIZ(LIZ, i8, ".", LIZ), null, 52, 10000);
            return -101;
        }
        int i9 = i3 * i8 * 2;
        if (byteBuffer.remaining() != i9) {
            if (byteBuffer.remaining() > i9) {
                byteBuffer.limit(byteBuffer.position() + i9);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("frame.position() ");
                LIZ2.append(byteBuffer.position());
                LIZ2.append(", frame.limit() ");
                LIZ2.append(byteBuffer.limit());
                LIZ2.append(", frame.capacity() ");
                LIZ2.append(byteBuffer.capacity());
                C1EU.LIZJ(LIZ2, "; samplesPerChannel ", i3, ", channelCount ", i8);
                AVLog2.logToIODevice2(6, TAG, X1D.LIZIZ(LIZ2), null, 51, 10000);
                return -102;
            }
        }
        try {
            try {
                synchronized (this.mBufferQueue) {
                    try {
                        AudioFrameBuffer availableFrameBuffer = getAvailableFrameBuffer();
                        if (availableFrameBuffer != null) {
                            ByteBuffer byteBuffer2 = availableFrameBuffer.mFrame;
                            if (byteBuffer2 == null || byteBuffer2.capacity() < byteBuffer.capacity()) {
                                availableFrameBuffer.mFrame = ByteBuffer.allocateDirect(byteBuffer.capacity());
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                availableFrameBuffer.mFrame.clear();
                                i4 = availableFrameBuffer.mFrame.position();
                            } catch (Throwable th) {
                                th = th;
                                i4 = 0;
                                i5 = 0;
                                i6 = 0;
                                i7 = 0;
                                i8 = 0;
                                i9 = 0;
                                try {
                                    throw th;
                                } catch (Exception e) {
                                    e = e;
                                    String LLLZ = C16880lQ.LLLZ("Fill AudioFrameBuffer error: newAllocated %b, bufferPosition %d, bufferLimit %d, bufferCapacity %d, framePosition %d, frameLimit %d, frameCapacity %d", new Object[]{Boolean.valueOf(z), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)});
                                    String str = TAG;
                                    int logToIODevice2 = AVLog2.logToIODevice2(6, str, LLLZ, e, 53, 10000);
                                    if (logToIODevice2 > 0) {
                                        AVLog.logKibana(6, str, C012403c.LIZLLL("[repeat ", logToIODevice2, " times] ", LLLZ), e);
                                        return -105;
                                    }
                                    return -105;
                                }
                            }
                            try {
                                i5 = availableFrameBuffer.mFrame.limit();
                            } catch (Throwable th2) {
                                th = th2;
                                i5 = 0;
                                i6 = 0;
                                i7 = 0;
                                i8 = 0;
                                i9 = 0;
                                throw th;
                            }
                            try {
                                i6 = availableFrameBuffer.mFrame.capacity();
                                try {
                                    i7 = byteBuffer.position();
                                } catch (Throwable th3) {
                                    th = th3;
                                    i7 = 0;
                                    i8 = 0;
                                    i9 = 0;
                                    throw th;
                                }
                                try {
                                    i8 = byteBuffer.limit();
                                } catch (Throwable th4) {
                                    th = th4;
                                    i8 = 0;
                                    i9 = 0;
                                    throw th;
                                }
                                try {
                                    byteBuffer.capacity();
                                    availableFrameBuffer.mFrame.put(byteBuffer);
                                    availableFrameBuffer.mFrame.flip();
                                    availableFrameBuffer.mSamplesPerChannel = i3;
                                    availableFrameBuffer.mTimestampUs = j;
                                    availableFrameBuffer.mUsed = 1;
                                } catch (Throwable th5) {
                                    th = th5;
                                    i9 = 0;
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                i6 = 0;
                                i7 = 0;
                                i8 = 0;
                                i9 = 0;
                                throw th;
                            }
                        } else {
                            return -103;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        z = false;
                    }
                }
                if (this.mEncodeRunnable == null) {
                    this.mEncodeRunnable = new Runnable() { // from class: com.ss.ttlivestreamer.core.codec.AACHWAudioEncoder.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com_ss_ttlivestreamer_core_codec_AACHWAudioEncoder$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public void com_ss_ttlivestreamer_core_codec_AACHWAudioEncoder$2__run$___twin___() {
                            AudioFrameBuffer pollFilledFrameBuffer;
                            int i10;
                            String LIZIZ;
                            if (AACHWAudioEncoder.this.mCodec == null) {
                                return;
                            }
                            do {
                                try {
                                    synchronized (AACHWAudioEncoder.this.mBufferQueue) {
                                        pollFilledFrameBuffer = AACHWAudioEncoder.this.pollFilledFrameBuffer();
                                        if (pollFilledFrameBuffer != null) {
                                            i10 = AACHWAudioEncoder.this.mCodec.dequeueInputBuffer(0L);
                                            if (i10 >= 0) {
                                                pollFilledFrameBuffer.mUsed = 2;
                                            }
                                        } else {
                                            i10 = -1;
                                        }
                                    }
                                    if (i10 >= 0) {
                                        int i11 = pollFilledFrameBuffer.mSamplesPerChannel;
                                        AACHWAudioEncoder aACHWAudioEncoder = AACHWAudioEncoder.this;
                                        int i12 = i11 * aACHWAudioEncoder.mChannelCount * 2;
                                        ByteBuffer inputBuffer = aACHWAudioEncoder.mCodec.getInputBuffer(i10);
                                        if (inputBuffer != null && inputBuffer.capacity() >= i12) {
                                            inputBuffer.clear();
                                            inputBuffer.put(pollFilledFrameBuffer.mFrame);
                                            inputBuffer.flip();
                                            AACHWAudioEncoder.this.mCodec.queueInputBuffer(i10, 0, i12, pollFilledFrameBuffer.mTimestampUs, 0);
                                            pollFilledFrameBuffer.mFrame.clear();
                                            pollFilledFrameBuffer.mUsed = 0;
                                        } else {
                                            pollFilledFrameBuffer.mUsed = 1;
                                            AACHWAudioEncoder.this.mCodec.queueInputBuffer(i10, 0, 0, 0L, 0);
                                            if (inputBuffer != null) {
                                                StringBuilder LIZ3 = X1D.LIZ();
                                                LIZ3.append("mCodec.getInputBuffer(");
                                                LIZ3.append(i10);
                                                LIZ3.append(").capacity() ");
                                                LIZ3.append(inputBuffer.capacity());
                                                LIZ3.append(" < audio frame size ");
                                                LIZ3.append(i12);
                                                LIZIZ = X1D.LIZIZ(LIZ3);
                                            } else {
                                                StringBuilder LIZ4 = X1D.LIZ();
                                                LIZ4.append("mCodec.getInputBuffer(");
                                                LIZ4.append(i10);
                                                LIZ4.append(") is null");
                                                LIZIZ = X1D.LIZIZ(LIZ4);
                                            }
                                            AVLog2.logToIODevice2(6, AACHWAudioEncoder.TAG, LIZIZ, null, 54, 10000);
                                        }
                                    } else if (i10 != -1 && i10 != -2) {
                                        String str2 = AACHWAudioEncoder.TAG;
                                        StringBuilder LIZ5 = X1D.LIZ();
                                        LIZ5.append("dequeueInputBuffer failed: inputIndex ");
                                        LIZ5.append(i10);
                                        AVLog2.logToIODevice2(6, str2, X1D.LIZIZ(LIZ5), null, 55, 10000);
                                    }
                                    AACHWAudioEncoder.this.tryFetchEncodedFrame(false);
                                } catch (Exception e2) {
                                    TTLSSladarBugReportUtils tTLSSladarBugReportUtils = TTLSSladarBugReportUtils.getInstance();
                                    StringBuilder LIZ6 = X1D.LIZ();
                                    String str3 = AACHWAudioEncoder.TAG;
                                    LIZ6.append(str3);
                                    LIZ6.append(".Encode");
                                    tTLSSladarBugReportUtils.report(e2, X1D.LIZIZ(LIZ6));
                                    if (!TTLSBuildConfig.canThrowException()) {
                                        StringBuilder LIZ7 = X1D.LIZ();
                                        LIZ7.append("AACHWAudioEncoder.Encode exception. cause: ");
                                        LIZ7.append(e2.getCause());
                                        LIZ7.append(", message: ");
                                        LIZ7.append(e2.getMessage());
                                        LIZ7.append(", stack: ");
                                        LIZ7.append(Log.getStackTraceString(e2));
                                        String LIZIZ2 = X1D.LIZIZ(LIZ7);
                                        int logToIODevice22 = AVLog2.logToIODevice2(6, str3, LIZIZ2, null, 56, 10000);
                                        if (logToIODevice22 > 0) {
                                            AVLog.logKibana(6, str3, C012403c.LIZLLL("[repeat ", logToIODevice22, " times] ", LIZIZ2), null);
                                            return;
                                        }
                                        return;
                                    }
                                    throw new AndroidRuntimeException(e2);
                                }
                            } while (i10 >= 0);
                        }

                        public static void com_ss_ttlivestreamer_core_codec_AACHWAudioEncoder$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                            boolean LIZ3;
                            try {
                                anonymousClass2.com_ss_ttlivestreamer_core_codec_AACHWAudioEncoder$2__run$___twin___();
                            } finally {
                                if (LIZ3) {
                                }
                            }
                        }
                    };
                }
                Handler handler = this.mHandler;
                if (handler != null && handler.post(this.mEncodeRunnable)) {
                    return 0;
                }
                return -104;
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
    }
}
