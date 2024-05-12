package com.ss.ttlivestreamer.core.codec;

import X.AnonymousClass028;
import X.C0H1;
import X.C132805Jc;
import X.C16880lQ;
import X.JBR;
import X.KMP;
import X.V0N;
import X.V10;
import X.X1D;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder;
import com.ss.ttlivestreamer.core.codec.MediaCodecUtils;
import com.ss.ttlivestreamer.core.engine.VideoEncoder;
import com.ss.ttlivestreamer.core.opengl.GLSurface;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.YuvHelper;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.LogUtil;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.ScopeMonitor;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusiness;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class HardwareVideoEncoder extends VideoEncoder {
    public int adjustedBitrate;
    public MediaCodec codec;
    public String codecName;
    public String codecType;
    public boolean constTimePeriod;
    public EGLDisplay currDisplay;
    public EGLSurface currSurface;
    public GlRenderDrawer drawer;
    public boolean enableBFrame;
    public GLSurface encoder_surface;
    public long forcedKeyFrameNs;
    public long frameInCount;
    public long frameOutCount;
    public int height;
    public MediaCodecInfo info;
    public boolean isCBR;
    public int keyFrameIntervalSec;
    public long lastKeyFrameNs;
    public boolean lossless;
    public HardwareVideoEncodeRoi mRoi;
    public MediaCodecUtils.HardwareEncoderSelector mSelector;
    public ThreadUtils.ThreadChecker mThreadChecker;
    public boolean noDropFrame;
    public SafeHandlerThread outputThread;
    public byte[] pps;
    public boolean realHasBFrame;
    public volatile boolean requestIDRFrame;
    public byte[] sps;
    public Integer surfaceColorFormat;
    public Surface textureInputSurface;
    public boolean useSurfaceMode;
    public byte[] vps_sps_pps;
    public int width;
    public Integer yuvColorFormat;
    public YuvFormat yuvFormat;
    public double roiBitrateRatio = -1.0d;
    public double bitrateRatio = -1.0d;
    public double bFrameBitrateRatio = -1.0d;
    public DtsQueue mDtsQueue = new DtsQueue();
    public boolean lockOptimize = false;
    public int mIsMultiSlice = -1;
    public int fps = 0;
    public byte[] configbyte = null;
    public boolean mSwap = false;
    public final EncoderSummary mSummary = new EncoderSummary();

    /* loaded from: classes12.dex */
    public class EncoderSummary {
        public Throwable e;
        public int encodeStatus;
        public long firstConfigTime;
        public long firstKeyFrameTime;
        public boolean gotConfig;
        public boolean gotKeyFrame;
        public int initStatus;
        public long initSuccessTime;
        public int inputFrameCount;
        public int outputFrameCount;
        public final JSONObject initParams = new JSONObject();
        public final JSONArray failedCodecs = new JSONArray();

        public void onFailedCodec() {
            try {
                JSONObject jSONObject = new JSONObject();
                fillCodecInfo(jSONObject);
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "codecInfos");
                fillInitStatus(jSONObject2);
                this.failedCodecs.put(jSONObject2);
            } catch (Exception unused) {
            }
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                fillDeviceInfo(jSONObject);
                fillInitStatus(jSONObject);
                fillInitParams(jSONObject);
                fillCodecInfo(jSONObject);
                jSONObject.put("codecType", HardwareVideoEncoder.this.codecType);
                if (this.failedCodecs.length() > 0) {
                    jSONObject.put("failedCodecs", this.failedCodecs);
                }
            } catch (Exception unused) {
            }
            if (this.initStatus != 200) {
                return jSONObject.toString();
            }
            jSONObject.put("firstConfigDelay", this.firstConfigTime - this.initSuccessTime);
            jSONObject.put("firstKeyFrameDelay", this.firstKeyFrameTime - this.initSuccessTime);
            long currentTimeMillis = System.currentTimeMillis() - this.initSuccessTime;
            jSONObject.put("duration", currentTimeMillis);
            if (currentTimeMillis >= 10000) {
                float f = (float) currentTimeMillis;
                jSONObject.put("inputFps", (this.inputFrameCount * 1000.0f) / f);
                jSONObject.put("outputFps", (this.outputFrameCount * 1000.0f) / f);
            } else {
                jSONObject.put("inputFrames", this.inputFrameCount);
                jSONObject.put("outputFrames", this.outputFrameCount);
            }
            jSONObject.put("encodeStatus", this.encodeStatus);
            return jSONObject.toString();
        }

        public EncoderSummary() {
        }

        private void fillCodecInfo(JSONObject jSONObject) {
            try {
                MediaCodecInfo mediaCodecInfo = HardwareVideoEncoder.this.info;
                if (mediaCodecInfo == null) {
                    return;
                }
                JSONObject json = MediaCodecUtils.toJSON(mediaCodecInfo);
                json.put("useSurfaceMode", HardwareVideoEncoder.this.useSurfaceMode);
                HardwareVideoEncoder hardwareVideoEncoder = HardwareVideoEncoder.this;
                if (hardwareVideoEncoder.useSurfaceMode) {
                    json.put("surfaceColorFormat", hardwareVideoEncoder.surfaceColorFormat);
                } else {
                    json.put("yuvColorFormat", hardwareVideoEncoder.yuvColorFormat);
                    json.put("yuvFormat", HardwareVideoEncoder.this.yuvFormat);
                }
                jSONObject.put("codecInfos", json);
            } catch (Exception unused) {
            }
        }

        private void fillDeviceInfo(JSONObject jSONObject) {
            try {
                jSONObject.put("device_name", Build.MODEL).put("gpu_render", GLThreadManager.getGPURender()).put("gpu_vendor", GLThreadManager.getGPUVendor()).put("os_version", Build.VERSION.RELEASE);
            } catch (Exception unused) {
            }
        }

        private void fillInitParams(JSONObject jSONObject) {
            int i;
            int i2;
            try {
                if (this.initParams.length() <= 0) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(this.initParams.toString());
                jSONObject2.put("width", HardwareVideoEncoder.this.width);
                jSONObject2.put("height", HardwareVideoEncoder.this.height);
                jSONObject2.put("fps", HardwareVideoEncoder.this.fps);
                HardwareVideoEncoder hardwareVideoEncoder = HardwareVideoEncoder.this;
                if (hardwareVideoEncoder.constTimePeriod) {
                    i = -1;
                } else {
                    i = hardwareVideoEncoder.keyFrameIntervalSec;
                }
                jSONObject2.put("gopSec", i);
                jSONObject2.put("bitrateRatio", HardwareVideoEncoder.this.bitrateRatio);
                jSONObject2.put("enableBFrame", HardwareVideoEncoder.this.enableBFrame);
                jSONObject2.put("realHasBFrame", HardwareVideoEncoder.this.realHasBFrame);
                jSONObject2.put("bFrameBitrateRatio", HardwareVideoEncoder.this.bFrameBitrateRatio);
                if (HardwareVideoEncoder.this.isCBR) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                jSONObject2.put("bitrateMode", i2);
                jSONObject.put("initParams", jSONObject2);
            } catch (Exception unused) {
            }
        }

        private void fillInitStatus(JSONObject jSONObject) {
            jSONObject.put("initStatus", this.initStatus);
            Throwable th = this.e;
            if (th != null) {
                jSONObject.put("initException", th.getMessage());
            }
        }

        public void onInitFail(int i) {
            onInitFail(i, null);
        }

        public void onInitStep(int i) {
            this.initStatus = Math.abs(i);
        }

        public void parseInitParams(TEBundle tEBundle) {
            String str;
            int i;
            try {
                this.initParams.put("profileLevel", tEBundle.getInt("video_profileLevel"));
                JSONObject jSONObject = this.initParams;
                if (tEBundle.getInt("configuration_type") == 0) {
                    str = "avcc";
                } else {
                    str = "annex-b";
                }
                jSONObject.put("configurationType", str);
                this.initParams.put("fixHWEncDts", tEBundle.getBool("video_fix_hardware_enc_dts"));
                this.initParams.put("enablePerfPrior", tEBundle.getBool("video_encode_perf_prior"));
                TEBundle bundle = tEBundle.getBundle("roi_settings");
                if (bundle != null) {
                    i = bundle.getInt("roi_on");
                } else {
                    i = 0;
                }
                this.initParams.put("enableROI", i);
            } catch (Exception unused) {
            }
        }

        public void reportEncoderCreate(String str) {
            JSONObject jSONObject = new JSONObject();
            try {
                fillDeviceInfo(jSONObject);
                fillInitStatus(jSONObject);
            } catch (Exception unused) {
            }
            AVLog.logKibana(5, str, jSONObject.toString(), null);
        }

        public void summaryEncoder(String str) {
            AVLog.logKibana(5, str, toString(), null);
        }

        public void onInitFail(int i, Throwable th) {
            this.initStatus = -Math.abs(i);
            this.e = th;
        }
    }

    private int signalEndOfInputStream() {
        String str;
        long j;
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec == null) {
            return 0;
        }
        try {
            if (this.useSurfaceMode) {
                GLSurface gLSurface = this.encoder_surface;
                if (gLSurface != null) {
                    gLSurface.nativeSwapBuffers();
                }
                this.codec.signalEndOfInputStream();
                AVLog.ioi("HardwareVideoEncoder", "Texture codec signalEndOfInputStream ok");
            } else {
                if (this.noDropFrame) {
                    j = -1;
                } else {
                    j = 0;
                }
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer = this.codec.getInputBuffers()[dequeueInputBuffer];
                    if (byteBuffer != null) {
                        byteBuffer.position(0);
                        byteBuffer.limit(0);
                    }
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                    AVLog.ioi("HardwareVideoEncoder", "Yuv codec signalEndOfInputStream ok");
                }
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            if (this.useSurfaceMode) {
                str = "Texture";
            } else {
                str = "Yuv";
            }
            LIZ.append(str);
            LIZ.append(" codec signalEndOfInputStream failed: ");
            LIZ.append(e.getMessage());
            AVLog.ioe("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public void RequestIDRFrame() {
        AVLog.iow("HardwareVideoEncoder", "RequestIDRFrame");
        this.requestIDRFrame = true;
    }

    public void deliverEncodedImage() {
        int i;
        boolean z;
        long j;
        long j2;
        try {
            if (this.codec == null) {
                return;
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            try {
                MediaCodec mediaCodec = this.codec;
                if (this.noDropFrame) {
                    j2 = -1;
                } else {
                    j2 = 0;
                }
                i = mediaCodec.dequeueOutputBuffer(bufferInfo, j2);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                i = -1;
            }
            while (i >= 0) {
                this.mSummary.outputFrameCount++;
                ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i];
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.size);
                ByteBuffer slice = byteBuffer.slice();
                if (!slice.isDirect()) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    allocateDirect.position(0);
                    allocateDirect.put(slice);
                    allocateDirect.position(0);
                    slice = allocateDirect;
                }
                int i2 = bufferInfo.flags;
                if ((i2 & 2) != 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Config frame generated. Offset: ");
                    LIZ.append(bufferInfo.offset);
                    LIZ.append(". Size: ");
                    LIZ.append(bufferInfo.size);
                    AVLog.d("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
                    EncoderSummary encoderSummary = this.mSummary;
                    if (!encoderSummary.gotConfig) {
                        encoderSummary.gotConfig = true;
                        encoderSummary.firstConfigTime = System.currentTimeMillis();
                    }
                    if (this.configbyte == null) {
                        byte[] bArr = new byte[bufferInfo.size];
                        this.configbyte = bArr;
                        slice.get(bArr);
                        slice.position(0);
                    }
                    z = false;
                    nativeEncoded(slice, bufferInfo.size, bufferInfo.flags, 0, 0L, 0L);
                } else {
                    z = false;
                    if (i2 == 4) {
                        return;
                    }
                    if (i2 == 1) {
                        EncoderSummary encoderSummary2 = this.mSummary;
                        if (!encoderSummary2.gotKeyFrame) {
                            encoderSummary2.gotKeyFrame = true;
                            encoderSummary2.firstKeyFrameTime = System.currentTimeMillis();
                        }
                        if (this.configbyte != null) {
                            if (this.codecType.equals("video/avc")) {
                                if (bufferInfo.size > this.configbyte.length) {
                                    byte b = slice.get(4);
                                    byte[] bArr2 = this.configbyte;
                                    if (b == bArr2[4] && isKeyFrame(slice.get(bArr2.length + 4))) {
                                        slice.position(this.configbyte.length);
                                        slice.limit(slice.limit() - this.configbyte.length);
                                        slice = slice.slice();
                                    }
                                }
                            } else if (this.codecType.equals(MediaCodecUtils.ByteVC1Mime) && bufferInfo.size > this.configbyte.length) {
                                byte b2 = slice.get(4);
                                byte[] bArr3 = this.configbyte;
                                if (b2 == bArr3[4] && isKeyFrame(slice.get(bArr3.length + 4))) {
                                    slice.position(this.configbyte.length);
                                    slice.limit(slice.limit() - this.configbyte.length);
                                    slice = slice.slice();
                                }
                            }
                        } else {
                            DebugLogUtils.isEnableDebugLog();
                        }
                    }
                    if (isKeyFrame(slice.get(4))) {
                        bufferInfo.flags |= 1;
                    }
                    if (this.noDropFrame) {
                        this.frameOutCount++;
                    }
                    checkMultiSlice(slice);
                    if (this.lockOptimize) {
                        this.mDtsQueue.unSynchronizedEncoded(slice, bufferInfo);
                    } else {
                        this.mDtsQueue.encoded(slice, bufferInfo);
                    }
                }
                this.codec.releaseOutputBuffer(i, z);
                MediaCodec mediaCodec2 = this.codec;
                if (this.noDropFrame) {
                    j = -1;
                } else {
                    j = 0;
                }
                i = mediaCodec2.dequeueOutputBuffer(bufferInfo, j);
            }
            if (i == -2) {
                MediaFormat outputFormat = this.codec.getOutputFormat();
                ByteBuffer byteBuffer2 = outputFormat.getByteBuffer("csd-0");
                ByteBuffer byteBuffer3 = outputFormat.getByteBuffer("csd-1");
                if (this.codecType.equals("video/avc") && byteBuffer2 != null && byteBuffer3 != null) {
                    this.sps = (byte[]) byteBuffer2.array().clone();
                    byte[] bArr4 = (byte[]) byteBuffer3.array().clone();
                    this.pps = bArr4;
                    byte[] bArr5 = this.sps;
                    byte[] bArr6 = new byte[bArr5.length + bArr4.length];
                    this.configbyte = bArr6;
                    System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                    byte[] bArr7 = this.pps;
                    System.arraycopy(bArr7, 0, this.configbyte, this.sps.length, bArr7.length);
                    return;
                }
                if (this.codecType.equals(MediaCodecUtils.ByteVC1Mime) && byteBuffer2 != null) {
                    byte[] bArr8 = (byte[]) byteBuffer2.array().clone();
                    this.vps_sps_pps = bArr8;
                    byte[] bArr9 = new byte[bArr8.length];
                    this.configbyte = bArr9;
                    System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length);
                }
            }
        } catch (IllegalStateException e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("deliverOutput failed\n");
            LIZ2.append(e2.getMessage());
            AVLog.e("HardwareVideoEncoder", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public String getEncoderInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("codec_name", this.info.getName());
            jSONObject.put("hardware", true);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject.toString();
    }

    public byte[] getExtraData() {
        byte[] bArr = this.configbyte;
        if (bArr != null) {
            return bArr;
        }
        return new byte[0];
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder, com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
        ThreadUtils.ThreadChecker threadChecker = this.mThreadChecker;
        if (threadChecker == null) {
            return;
        }
        threadChecker.checkIsOnValidThread();
        signalEndOfInputStream();
        MediaCodec mediaCodec = this.codec;
        SafeHandlerThread safeHandlerThread = this.outputThread;
        if (safeHandlerThread != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(safeHandlerThread.getHandler(), new Runnable() { // from class: com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_codec_HardwareVideoEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_codec_HardwareVideoEncoder$1__run$___twin___() {
                    HardwareVideoEncoder.this.codec = null;
                }

                public static void com_ss_ttlivestreamer_core_codec_HardwareVideoEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_core_codec_HardwareVideoEncoder$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        releaseCodec(mediaCodec);
        SafeHandlerThread safeHandlerThread2 = this.outputThread;
        if (safeHandlerThread2 != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread2);
        }
        if (this.noDropFrame) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("input frame count ");
            LIZ.append(this.frameInCount);
            LIZ.append(", output frame count ");
            LIZ.append(this.frameOutCount);
            AVLog.ioi("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
        }
    }

    public boolean setupCodecType() {
        boolean hasCodecForType = MediaCodecUtils.hasCodecForType(this.codecType);
        if (hasCodecForType) {
            this.mSummary.onInitStep(10);
        } else {
            this.mSummary.onInitFail(10);
        }
        return hasCodecForType;
    }

    /* loaded from: classes12.dex */
    public class DtsQueue {
        public int bFrameCount;
        public long lastPtsIn;
        public long lastPtsInQueue;
        public final ArrayList<Long> ptsInQueue;
        public final LinkedList<Long> ptsOutQueue;
        public StringBuilder sb;

        public DtsQueue() {
            this.ptsInQueue = new ArrayList<>();
            this.ptsOutQueue = new LinkedList<>();
            this.bFrameCount = -1;
        }

        public synchronized long getPtsIn(long j) {
            long j2 = this.lastPtsIn;
            this.lastPtsIn = j;
            if (j <= this.lastPtsInQueue) {
                if (this.sb == null) {
                    this.sb = new StringBuilder();
                }
                this.sb.setLength(0);
                StringBuilder sb = this.sb;
                sb.append("pts input is not monotonically increasing: last pts in queue ");
                sb.append(this.lastPtsInQueue);
                sb.append(", last pts input ");
                sb.append(j2);
                sb.append(", current pts input ");
                sb.append(j);
                String sb2 = this.sb.toString();
                int logToIODevice2 = AVLog2.logToIODevice2(6, "HardwareVideoEncoder", sb2, null, 14, 60000);
                if (logToIODevice2 > 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("[repeat ");
                    LIZ.append(logToIODevice2);
                    LIZ.append(" times] ");
                    LIZ.append(sb2);
                    AVLog.logKibana(6, "HardwareVideoEncoder", X1D.LIZIZ(LIZ), null);
                }
                j = this.lastPtsInQueue + 10000;
            }
            this.lastPtsInQueue = j;
            savePtsIn(j);
            return j;
        }

        public void savePtsIn(long j) {
            if (this.bFrameCount < 0) {
                this.ptsInQueue.add(Long.valueOf(j));
            }
        }

        public int checkBFrameCount(long j, boolean z) {
            String str;
            if (this.bFrameCount < 0) {
                if (!z) {
                    if (this.ptsOutQueue.isEmpty()) {
                        return this.bFrameCount;
                    }
                    long longValue = this.ptsOutQueue.get(0).longValue();
                    int indexOf = this.ptsInQueue.indexOf(Long.valueOf(longValue));
                    int indexOf2 = this.ptsInQueue.indexOf(Long.valueOf(j));
                    if (indexOf < 0 || indexOf2 < 0) {
                        StringBuilder LIZJ = V10.LIZJ("Can't find I frame pts ", longValue, " or P frame pts ");
                        AVLog.logKibana(6, "HardwareVideoEncoder", C0H1.LIZJ(LIZJ, j, " in ptsInQueue.", LIZJ), null);
                        this.bFrameCount = 0;
                        return 0;
                    }
                    int i = indexOf + 1;
                    if (indexOf2 > i) {
                        this.bFrameCount = (indexOf2 - indexOf) - 1;
                        StringBuilder sb = new StringBuilder("Encoder output pts disorder. pts between I frame ");
                        sb.append(((Long) ListProtector.get(this.ptsInQueue, indexOf)).longValue() / 1000);
                        sb.append("ms and P frame ");
                        sb.append(((Long) ListProtector.get(this.ptsInQueue, indexOf2)).longValue() / 1000);
                        sb.append("ms: ");
                        while (i < indexOf2) {
                            sb.append(((Long) ListProtector.get(this.ptsInQueue, i)).longValue() / 1000);
                            i++;
                            if (i >= indexOf2) {
                                str = "ms.";
                            } else {
                                str = "ms, ";
                            }
                            sb.append(str);
                        }
                        AVLog.logKibana(5, "HardwareVideoEncoder", sb.toString(), null);
                    } else {
                        this.bFrameCount = 0;
                    }
                }
                this.ptsOutQueue.offer(Long.valueOf(j));
            }
            return this.bFrameCount;
        }

        public synchronized void encoded(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            long j = bufferInfo.presentationTimeUs;
            boolean z = true;
            if ((bufferInfo.flags & 1) == 0) {
                z = false;
            }
            checkBFrameCount(j, z);
            HardwareVideoEncoder.this.nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, j, j);
        }

        public void unSynchronizedEncoded(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            long j = bufferInfo.presentationTimeUs;
            boolean z = true;
            if ((bufferInfo.flags & 1) == 0) {
                z = false;
            }
            synchronized (this) {
                checkBFrameCount(j, z);
            }
            HardwareVideoEncoder.this.nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, j, j);
        }
    }

    /* loaded from: classes12.dex */
    public class DtsQueueFixed extends DtsQueue {
        public final LinkedList<EncodedFrame> encodedFrameList;
        public long lastDtsOut;
        public int minusIntervalCount;
        public final LinkedList<Long> ptsInQueue;

        public DtsQueueFixed() {
            super();
            this.encodedFrameList = new LinkedList<>();
            this.ptsInQueue = new LinkedList<>();
            this.minusIntervalCount = -1;
        }

        @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder.DtsQueue
        public void savePtsIn(long j) {
            super.savePtsIn(j);
            this.ptsInQueue.offer(Long.valueOf(j));
        }

        @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder.DtsQueue
        public synchronized void encoded(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            long j = bufferInfo.presentationTimeUs;
            boolean z = true;
            if ((bufferInfo.flags & 1) == 0) {
                z = false;
            }
            int checkBFrameCount = checkBFrameCount(j, z);
            if (checkBFrameCount < 0) {
                EncodedFrame encodedFrame = new EncodedFrame();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.limit());
                encodedFrame.encodedData = allocateDirect;
                allocateDirect.put(byteBuffer);
                encodedFrame.encodedInfo = bufferInfo;
                this.encodedFrameList.offer(encodedFrame);
            } else {
                EncodedFrame pollFirst = this.encodedFrameList.pollFirst();
                while (pollFirst != null) {
                    encodedWithBFrameCount(pollFirst.encodedData, pollFirst.encodedInfo, checkBFrameCount);
                    pollFirst = this.encodedFrameList.pollFirst();
                }
                encodedWithBFrameCount(byteBuffer, bufferInfo, checkBFrameCount);
            }
        }

        @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder.DtsQueue
        public void unSynchronizedEncoded(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            long j = bufferInfo.presentationTimeUs;
            boolean z = true;
            if ((bufferInfo.flags & 1) == 0) {
                z = false;
            }
            int checkBFrameCount = checkBFrameCount(j, z);
            if (checkBFrameCount < 0) {
                EncodedFrame encodedFrame = new EncodedFrame();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.limit());
                encodedFrame.encodedData = allocateDirect;
                allocateDirect.put(byteBuffer);
                encodedFrame.encodedInfo = bufferInfo;
                this.encodedFrameList.offer(encodedFrame);
                return;
            }
            EncodedFrame pollFirst = this.encodedFrameList.pollFirst();
            while (pollFirst != null) {
                nonSynchronizedEncodedWithBFrameCount(pollFirst.encodedData, pollFirst.encodedInfo, checkBFrameCount);
                pollFirst = this.encodedFrameList.pollFirst();
            }
            nonSynchronizedEncodedWithBFrameCount(byteBuffer, bufferInfo, checkBFrameCount);
        }

        private void encodedWithBFrameCount(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
            long j;
            long longValue;
            long j2 = bufferInfo.presentationTimeUs;
            if (i >= 0) {
                if (i == 0) {
                    HardwareVideoEncoder.this.nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, j2, j2);
                    return;
                }
                long j3 = 1000000 / HardwareVideoEncoder.this.fps;
                if (this.minusIntervalCount < 0) {
                    this.minusIntervalCount = (i + 1) / 2;
                }
                if (!this.ptsInQueue.isEmpty()) {
                    if (this.minusIntervalCount > 0) {
                        long longValue2 = this.ptsInQueue.getFirst().longValue();
                        int i2 = this.minusIntervalCount;
                        longValue = longValue2 - (i2 * j3);
                        this.minusIntervalCount = i2 - 1;
                    } else {
                        longValue = this.ptsInQueue.poll().longValue();
                    }
                    j = longValue - 100000;
                } else {
                    j = this.lastDtsOut + j3;
                }
                if (j < this.lastDtsOut) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("last dts out: ");
                    LIZ.append(this.lastDtsOut);
                    AVLog2.logToIODevice2(6, "HardwareVideoEncoder", C132805Jc.LIZLLL(LIZ, ", current dts out: ", j, LIZ), null, 12, 30000);
                    j = this.lastDtsOut + 10000;
                }
                if (j > j2) {
                    StringBuilder LIZJ = V10.LIZJ("pts out: ", j2, ", dts out: ");
                    LIZJ.append(j);
                    AVLog2.logToIODevice2(6, "HardwareVideoEncoder", X1D.LIZIZ(LIZJ), null, 13, 30000);
                    j = j2;
                }
                this.lastDtsOut = j;
                HardwareVideoEncoder.this.nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, j2, j);
                return;
            }
            throw new AndroidRuntimeException(KMP.LJ("why bFrameCount < 0? ", i));
        }

        private void nonSynchronizedEncodedWithBFrameCount(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
            long j;
            long longValue;
            long j2 = bufferInfo.presentationTimeUs;
            if (i >= 0) {
                if (i == 0) {
                    HardwareVideoEncoder.this.nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, j2, j2);
                    return;
                }
                synchronized (this) {
                    long j3 = 1000000 / HardwareVideoEncoder.this.fps;
                    if (this.minusIntervalCount < 0) {
                        this.minusIntervalCount = (i + 1) / 2;
                    }
                    if (!this.ptsInQueue.isEmpty()) {
                        if (this.minusIntervalCount > 0) {
                            long longValue2 = this.ptsInQueue.getFirst().longValue();
                            int i2 = this.minusIntervalCount;
                            longValue = longValue2 - (i2 * j3);
                            this.minusIntervalCount = i2 - 1;
                        } else {
                            longValue = this.ptsInQueue.poll().longValue();
                        }
                        j = longValue - 100000;
                    } else {
                        j = this.lastDtsOut + j3;
                    }
                    if (j < this.lastDtsOut) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("last dts out: ");
                        LIZ.append(this.lastDtsOut);
                        LIZ.append(", current dts out: ");
                        LIZ.append(j);
                        AVLog2.logToIODevice2(6, "HardwareVideoEncoder", X1D.LIZIZ(LIZ), null, 12, 30000);
                        j = this.lastDtsOut + 10000;
                    }
                    if (j > j2) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("pts out: ");
                        LIZ2.append(j2);
                        LIZ2.append(", dts out: ");
                        LIZ2.append(j);
                        AVLog2.logToIODevice2(6, "HardwareVideoEncoder", X1D.LIZIZ(LIZ2), null, 13, 30000);
                        j = j2;
                    }
                    this.lastDtsOut = j;
                }
                HardwareVideoEncoder.this.nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, j2, j);
                return;
            }
            throw new AndroidRuntimeException(KMP.LJ("why bFrameCount < 0? ", i));
        }
    }

    /* loaded from: classes12.dex */
    public class EncodedFrame {
        public ByteBuffer encodedData;
        public MediaCodec.BufferInfo encodedInfo;

        public EncodedFrame() {
        }
    }

    /* loaded from: classes12.dex */
    public enum YuvFormat {
        I420 { // from class: com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder.YuvFormat.1
            @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 { // from class: com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder.YuvFormat.2
            @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };

        public abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);

        public static YuvFormat valueOf(int i) {
            if (i != 19) {
                if (i == 21 || i == 2141391872 || i == 2141391876) {
                    return NV12;
                }
                throw new IllegalArgumentException(KMP.LJ("Unsupported colorFormat: ", i));
            }
            return I420;
        }

        public static YuvFormat valueOf(String str) {
            return (YuvFormat) V0N.LJJJ(YuvFormat.class, str);
        }
    }

    private int bitrateWithRatio(int i) {
        double d = i;
        double d2 = this.bitrateRatio;
        if (d2 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            d *= d2;
        }
        if (this.realHasBFrame) {
            double d3 = this.bFrameBitrateRatio;
            if (d3 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                d *= d3;
            }
        }
        double d4 = this.roiBitrateRatio;
        if (d4 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            d *= d4;
        }
        return (int) d;
    }

    private void checkMultiSlice(ByteBuffer byteBuffer) {
        int i;
        int i2;
        if (this.mIsMultiSlice >= 0) {
            return;
        }
        if (this.codecType.equals("video/avc")) {
            this.mIsMultiSlice = 0;
            return;
        }
        if (!this.codecType.equals(MediaCodecUtils.ByteVC1Mime)) {
            return;
        }
        int i3 = 0;
        for (int position = byteBuffer.position(); position != byteBuffer.limit(); position++) {
            byte b = byteBuffer.get(position);
            if (b == 0) {
                i3++;
                if (i3 > 3) {
                    this.mIsMultiSlice = 2;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Lack of anti-conflict byte detected: model ");
                    LIZ.append(Build.MODEL);
                    AVLog.logKibana(5, "HardwareVideoEncoder", X1D.LIZIZ(LIZ), null);
                    return;
                }
            } else {
                if (b == 1 && ((i3 == 2 || i3 == 3) && ((i = (byteBuffer.get(position + 1) & 126) >> 1) <= 9 || (i >= 16 && i <= 21)))) {
                    if (((byteBuffer.get(position + 3) >> 7) & 1) == 0) {
                        i2 = 1;
                    } else {
                        int i4 = this.mIsMultiSlice;
                        i2 = i4 == -2 ? 0 : i4 - 1;
                    }
                    this.mIsMultiSlice = i2;
                    if (i2 == 1) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Multi-slice detected: model ");
                        LIZ2.append(Build.MODEL);
                        LIZ2.append(", width ");
                        LIZ2.append(this.width);
                        LIZ2.append(", height ");
                        LIZ2.append(this.height);
                        LIZ2.append(", fps ");
                        LIZ2.append(this.fps);
                        LIZ2.append(", bitrate ");
                        LIZ2.append(this.adjustedBitrate / 1000);
                        LIZ2.append("kbps");
                        AVLog.logKibana(5, "HardwareVideoEncoder", X1D.LIZIZ(LIZ2), null);
                    }
                    if (this.mIsMultiSlice >= 0) {
                        return;
                    }
                }
                i3 = 0;
            }
        }
    }

    private boolean createEncoderInternal(TEBundle tEBundle) {
        int i;
        int i2;
        int i3;
        String str;
        this.lastKeyFrameNs = -1L;
        this.mSummary.onInitStep(51);
        try {
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType, this.width, this.height);
            createVideoFormat.setInteger("bitrate", this.adjustedBitrate);
            if (this.isCBR) {
                i = 2;
            } else {
                i = 1;
            }
            createVideoFormat.setInteger("bitrate-mode", i);
            if (DebugLogUtils.isEnableDebugLog()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Set bitrate mode: ");
                if (this.isCBR) {
                    str = "CBR";
                } else {
                    str = "VBR";
                }
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
            }
            createVideoFormat.setInteger("frame-rate", this.fps);
            if (this.constTimePeriod) {
                i2 = -1;
            } else {
                i2 = this.keyFrameIntervalSec;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Using constant time period [");
            LIZ2.append(this.constTimePeriod);
            LIZ2.append("] with i frame interval [");
            LIZ2.append(i2);
            LIZ2.append("s]");
            AVLog.iow("HardwareVideoEncoder", X1D.LIZIZ(LIZ2));
            createVideoFormat.setInteger("i-frame-interval", i2);
            if (this.enableBFrame) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            createVideoFormat.setInteger("max-bframes", i3);
            if (this.codecType.equals("video/avc")) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : this.info.getCapabilitiesForType(this.codecType).profileLevels) {
                    if (LogUtil.logFilterSwitch()) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("Profile = ");
                        LIZ3.append(codecProfileLevel.profile);
                        LIZ3.append(", Level = ");
                        LIZ3.append(codecProfileLevel.level);
                        AVLog.d("HardwareVideoEncoder", X1D.LIZIZ(LIZ3));
                    }
                    int i4 = codecProfileLevel.profile;
                    if (i4 == 1) {
                        AVLog.d("HardwareVideoEncoder", "Support Baseline Profile!");
                    } else if (i4 == 2) {
                        AVLog.d("HardwareVideoEncoder", "Support Main Profile!");
                    } else if (i4 == 8) {
                        AVLog.d("HardwareVideoEncoder", "Support High Profile!");
                    }
                    if (codecProfileLevel.profile == mapProfileLevel(tEBundle.getInt("video_profileLevel"))) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("Set Profile: ");
                        LIZ4.append(codecProfileLevel.profile);
                        LIZ4.append(", Level = ");
                        LIZ4.append(codecProfileLevel.level);
                        AVLog.d("HardwareVideoEncoder", X1D.LIZIZ(LIZ4));
                        createVideoFormat.setInteger("profile", codecProfileLevel.profile);
                        createVideoFormat.setInteger("level", codecProfileLevel.level);
                    }
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("Android SDK version ");
                LIZ5.append(Build.VERSION.SDK_INT);
                LIZ5.append(", dstProfileLevel ");
                LIZ5.append((Object) null);
                this.mSummary.onInitFail(51, new Throwable(X1D.LIZIZ(LIZ5)));
                return false;
            }
            if (this.codecType.equals(MediaCodecUtils.ByteVC1Mime)) {
                if (tEBundle.getInt("video_profileLevel") != 5) {
                    createVideoFormat.setInteger("profile", 1);
                } else {
                    createVideoFormat.setInteger("profile", 2);
                }
                createVideoFormat.setInteger("level", 256);
            } else {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("Unsupported codec type: ");
                LIZ6.append(this.codecType);
                AVLog.ioe("HardwareVideoEncoder", X1D.LIZIZ(LIZ6));
                this.mSummary.onInitFail(52);
                return false;
            }
            try {
                if (this.mRoi == null) {
                    this.mRoi = HardwareVideoEncodeRoi.createRoiProcessor(this.codecName, tEBundle);
                }
                HardwareVideoEncodeRoi hardwareVideoEncodeRoi = this.mRoi;
                if (hardwareVideoEncodeRoi != null) {
                    hardwareVideoEncodeRoi.configureRoi(createVideoFormat);
                }
                setupEncodeQPIfNeeded(this.codecName, createVideoFormat, tEBundle);
            } catch (Exception e) {
                AVLog.ioe("HardwareVideoEncoder", "init roi or qp range failed. ", e);
            }
            if (this.useSurfaceMode) {
                this.mSummary.onInitStep(52);
                createVideoFormat.setInteger("color-format", this.surfaceColorFormat.intValue());
                MediaCodec createByCodecName = MediaCodec.createByCodecName(this.codecName);
                this.codec = createByCodecName;
                createByCodecName.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.mSummary.onInitStep(53);
                try {
                    this.textureInputSurface = this.codec.createInputSurface();
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                this.drawer = new GlRenderDrawer();
                GLSurface gLSurface = new GLSurface();
                this.encoder_surface = gLSurface;
                gLSurface.nativeSurfaceCreate(this.width, this.height, this.textureInputSurface);
                this.encoder_surface.nativeMakeCurrent();
                this.mSummary.onInitStep(54);
                this.currDisplay = EGL14.eglGetCurrentDisplay();
                EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
                this.currSurface = eglGetCurrentSurface;
                if (eglGetCurrentSurface != null && this.currDisplay != null) {
                    this.mSummary.onInitStep(55);
                    this.codec.start();
                } else {
                    throw new IllegalStateException("currSurface " + this.currSurface + ", currDisplay " + this.currDisplay);
                }
            } else {
                this.mSummary.onInitStep(56);
                createVideoFormat.setInteger("color-format", this.yuvColorFormat.intValue());
                MediaCodec createByCodecName2 = MediaCodec.createByCodecName(this.codecName);
                this.codec = createByCodecName2;
                createByCodecName2.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.mSummary.onInitStep(57);
                this.codec.start();
            }
            AVLog.d("HardwareVideoEncoder", "Format: " + createVideoFormat);
            try {
                HardwareVideoEncodeRoi hardwareVideoEncodeRoi2 = this.mRoi;
                if (hardwareVideoEncodeRoi2 != null) {
                    hardwareVideoEncodeRoi2.checkSupportRoi(this.codec, tEBundle);
                    this.roiBitrateRatio = this.mRoi.getRoiSettingBitrateRatio();
                } else {
                    this.roiBitrateRatio = HardwareVideoEncodeRoi.getRoiSettingBitrateRatio(tEBundle);
                }
            } catch (Exception unused) {
            }
            SetBitrate(this.adjustedBitrate);
            SafeHandlerThread thread = TTLSPreInitBusiness.getInstance().getThread("HwEncoderReadThread");
            this.outputThread = thread;
            if (thread == null) {
                SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("HwEncoderReadThread");
                this.outputThread = lockThread;
                lockThread.start();
            }
            this.mSummary.onInitStep(200);
            this.mSummary.initSuccessTime = System.currentTimeMillis();
            return true;
        } catch (Exception e3) {
            this.mSummary.onInitFail(54, e3);
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("initEncodeInternal failed: ");
            LIZ7.append(e3.getMessage());
            AVLog.ioe("HardwareVideoEncoder", X1D.LIZIZ(LIZ7));
            MediaCodec mediaCodec = this.codec;
            this.codec = null;
            releaseCodec(mediaCodec);
            return false;
        }
    }

    private int encodeByteBuffer(VideoFrame videoFrame) {
        long j;
        if (this.noDropFrame) {
            this.frameInCount++;
        }
        long ptsIn = this.mDtsQueue.getPtsIn(videoFrame.getTimestampNs() / 1000) * 1000;
        long j2 = (500 + ptsIn) / 1000;
        try {
            MediaCodec mediaCodec = this.codec;
            if (this.noDropFrame) {
                j = -1;
            } else {
                j = 0;
            }
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j);
            if (dequeueInputBuffer == -1) {
                return 0;
            }
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            int width = ((buffer.getWidth() * buffer.getHeight()) * 3) / 2;
            try {
                this.yuvFormat.fillBuffer(this.codec.getInputBuffers()[dequeueInputBuffer], buffer);
                if (this.requestIDRFrame) {
                    requestKeyFrame(ptsIn);
                    this.requestIDRFrame = false;
                }
                HardwareVideoEncodeRoi hardwareVideoEncodeRoi = this.mRoi;
                if (hardwareVideoEncodeRoi != null) {
                    try {
                        hardwareVideoEncodeRoi.encodeWithRoi(this.codec, videoFrame, this.adjustedBitrate);
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, width, j2, 0);
                    return 0;
                } catch (IllegalStateException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("queueInputBuffer failed\n");
                    LIZ.append(e);
                    AVLog.e("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
                    return -4;
                }
            } catch (IllegalStateException e2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("getInputBuffers failed\n");
                LIZ2.append(e2);
                AVLog.e("HardwareVideoEncoder", X1D.LIZIZ(LIZ2));
                return -3;
            }
        } catch (IllegalStateException e3) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("dequeueInputBuffer failed\n");
            LIZ3.append(e3.getMessage());
            AVLog.e("HardwareVideoEncoder", X1D.LIZIZ(LIZ3));
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: RuntimeException -> 0x00ac, TryCatch #1 {RuntimeException -> 0x00ac, blocks: (B:5:0x000b, B:9:0x0023, B:11:0x0030, B:13:0x0035, B:14:0x003a, B:16:0x0043, B:18:0x0060, B:19:0x0063, B:21:0x007f, B:24:0x00a4, B:25:0x0085, B:27:0x008d, B:28:0x00a8), top: B:4:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int encodeTextureBuffer(com.ss.ttlivestreamer.core.buffer.VideoFrame r12) {
        /*
            r11 = this;
            boolean r0 = r11.noDropFrame
            if (r0 == 0) goto Lb
            long r2 = r11.frameInCount
            r0 = 1
            long r2 = r2 + r0
            r11.frameInCount = r2
        Lb:
            com.ss.ttlivestreamer.core.buffer.VideoFrame$Buffer r4 = r12.getBuffer()     // Catch: java.lang.RuntimeException -> Lac
            com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder$DtsQueue r5 = r11.mDtsQueue     // Catch: java.lang.RuntimeException -> Lac
            long r0 = r12.getTimestampNs()     // Catch: java.lang.RuntimeException -> Lac
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r0 = r5.getPtsIn(r0)     // Catch: java.lang.RuntimeException -> Lac
            long r0 = r0 * r2
            boolean r2 = r4 instanceof com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer     // Catch: java.lang.RuntimeException -> Lac
            if (r2 != 0) goto L23
            r0 = -1
            return r0
        L23:
            com.ss.ttlivestreamer.core.buffer.VideoFrame$TextureBuffer r4 = (com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer) r4     // Catch: java.lang.RuntimeException -> Lac
            com.ss.ttlivestreamer.core.codec.HardwareVideoEncodeRoi r5 = r11.mRoi     // Catch: java.lang.RuntimeException -> Lac
            if (r5 == 0) goto L30
            android.media.MediaCodec r3 = r11.codec     // Catch: java.lang.Exception -> L30
            int r2 = r11.adjustedBitrate     // Catch: java.lang.Exception -> L30
            r5.encodeWithRoi(r3, r12, r2)     // Catch: java.lang.Exception -> L30
        L30:
            boolean r3 = r11.mSwap     // Catch: java.lang.RuntimeException -> Lac
            r2 = 1
            if (r3 == 0) goto La8
            com.ss.ttlivestreamer.core.opengl.GLSurface r2 = r11.encoder_surface     // Catch: java.lang.RuntimeException -> Lac
            r2.nativeSwapBuffers()     // Catch: java.lang.RuntimeException -> Lac
        L3a:
            com.ss.ttlivestreamer.core.buffer.VideoFrame$TextureBuffer$Type r3 = r4.getType()     // Catch: java.lang.RuntimeException -> Lac
            com.ss.ttlivestreamer.core.buffer.VideoFrame$TextureBuffer$Type r2 = com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer.Type.OES     // Catch: java.lang.RuntimeException -> Lac
            r7 = 0
            if (r3 != r2) goto L85
            android.graphics.Matrix r2 = r4.getTransformMatrix()     // Catch: java.lang.RuntimeException -> Lac
            float[] r6 = com.ss.ttlivestreamer.core.opengl.RendererCommon.convertMatrixFromAndroidGraphicsMatrix(r2)     // Catch: java.lang.RuntimeException -> Lac
            com.ss.ttlivestreamer.core.opengl.GlRenderDrawer r3 = r11.drawer     // Catch: java.lang.RuntimeException -> Lac
            int r4 = r4.getTextureId()     // Catch: java.lang.RuntimeException -> Lac
            r5 = 0
            int r9 = r11.width     // Catch: java.lang.RuntimeException -> Lac
            int r10 = r11.height     // Catch: java.lang.RuntimeException -> Lac
            r8 = r7
            r3.drawOes(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.RuntimeException -> Lac
            boolean r2 = com.ss.ttlivestreamer.core.opengl.GLThreadManager.isNeedFinish()     // Catch: java.lang.RuntimeException -> Lac
            if (r2 == 0) goto La4
            android.opengl.GLES20.glFinish()     // Catch: java.lang.RuntimeException -> Lac
        L63:
            com.ss.ttlivestreamer.core.buffer.VideoFrame$Buffer r2 = r12.getBuffer()     // Catch: java.lang.RuntimeException -> Lac
            long r4 = r2.getCaptureMs()     // Catch: java.lang.RuntimeException -> Lac
            long r2 = com.ss.ttlivestreamer.core.utils.TimeUtils.currentTimeMs()     // Catch: java.lang.RuntimeException -> Lac
            r6 = 12
            com.ss.ttlivestreamer.core.utils.ScopeMonitor.CalcElapse(r6, r4, r2)     // Catch: java.lang.RuntimeException -> Lac
            android.opengl.EGLDisplay r3 = r11.currDisplay     // Catch: java.lang.RuntimeException -> Lac
            android.opengl.EGLSurface r2 = r11.currSurface     // Catch: java.lang.RuntimeException -> Lac
            android.opengl.EGLExt.eglPresentationTimeANDROID(r3, r2, r0)     // Catch: java.lang.RuntimeException -> Lac
            boolean r2 = r11.requestIDRFrame     // Catch: java.lang.RuntimeException -> Lac
            if (r2 == 0) goto Lab
            r11.requestKeyFrame(r0)     // Catch: java.lang.RuntimeException -> Lac
            r11.requestIDRFrame = r7     // Catch: java.lang.RuntimeException -> Lac
            goto Lab
        L85:
            com.ss.ttlivestreamer.core.buffer.VideoFrame$TextureBuffer$Type r3 = r4.getType()     // Catch: java.lang.RuntimeException -> Lac
            com.ss.ttlivestreamer.core.buffer.VideoFrame$TextureBuffer$Type r2 = com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer.Type.RGB     // Catch: java.lang.RuntimeException -> Lac
            if (r3 != r2) goto La4
            android.graphics.Matrix r2 = r4.getTransformMatrix()     // Catch: java.lang.RuntimeException -> Lac
            float[] r6 = com.ss.ttlivestreamer.core.opengl.RendererCommon.convertMatrixFromAndroidGraphicsMatrix(r2)     // Catch: java.lang.RuntimeException -> Lac
            com.ss.ttlivestreamer.core.opengl.GlRenderDrawer r3 = r11.drawer     // Catch: java.lang.RuntimeException -> Lac
            int r4 = r4.getTextureId()     // Catch: java.lang.RuntimeException -> Lac
            r5 = 0
            int r9 = r11.width     // Catch: java.lang.RuntimeException -> Lac
            int r10 = r11.height     // Catch: java.lang.RuntimeException -> Lac
            r8 = r7
            r3.drawRgb(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.RuntimeException -> Lac
        La4:
            android.opengl.GLES20.glFlush()     // Catch: java.lang.RuntimeException -> Lac
            goto L63
        La8:
            r11.mSwap = r2     // Catch: java.lang.RuntimeException -> Lac
            goto L3a
        Lab:
            return r7
        Lac:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "encodeTexture failed\n"
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "HardwareVideoEncoder"
            com.ss.ttlivestreamer.core.utils.AVLog.e(r0, r1)
            r0 = -2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder.encodeTextureBuffer(com.ss.ttlivestreamer.core.buffer.VideoFrame):int");
    }

    private boolean isKeyFrame(byte b) {
        if (this.codecType.equals("video/avc")) {
            if ((b & 31) == 5) {
                return true;
            }
            return false;
        }
        if (!this.codecType.equals(MediaCodecUtils.ByteVC1Mime)) {
            return false;
        }
        int i = (b & 126) >> 1;
        if (i == 16 || i == 17 || i == 18 || i == 19 || i == 20 || i == 21) {
            return true;
        }
        return false;
    }

    private synchronized int mapProfileLevel(int i) {
        int i2;
        i2 = 2;
        if (i != 2) {
            if (i != 3) {
                i2 = 1;
            } else {
                i2 = 8;
            }
        }
        return i2;
    }

    private void parseEncoderStrategy(TEBundle tEBundle) {
        String str;
        if (tEBundle.contains("videoEncoderStrategy")) {
            try {
                if (this.codecType.equalsIgnoreCase(MediaCodecUtils.ByteVC1Mime)) {
                    str = "hardBytevc1";
                } else {
                    str = "hardH264";
                }
                JSONObject optJSONObject = new JSONObject(tEBundle.getString("videoEncoderStrategy")).optJSONObject(str);
                if (optJSONObject != null) {
                    if (!optJSONObject.isNull("bitrateRatio")) {
                        this.bitrateRatio = JSONObjectProtectorUtils.getDouble(optJSONObject, "bitrateRatio");
                    }
                    if (!optJSONObject.isNull("enableBFrame")) {
                        this.enableBFrame = JSONObjectProtectorUtils.getBoolean(optJSONObject, "enableBFrame");
                    }
                    if (!optJSONObject.isNull("bFrameBitrateRatio")) {
                        this.bFrameBitrateRatio = JSONObjectProtectorUtils.getDouble(optJSONObject, "bFrameBitrateRatio");
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void releaseCodec(MediaCodec mediaCodec) {
        AVLog.iod("HardwareVideoEncoder", "Releasing MediaCodec on output thread");
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                mediaCodec.release();
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("codecTexture stop failed: ");
                LIZ.append(e);
                AVLog.ioe("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
            }
        }
        GlRenderDrawer glRenderDrawer = this.drawer;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.drawer = null;
        }
        if (this.encoder_surface != null) {
            GLES20.glFinish();
            this.encoder_surface.release();
            this.encoder_surface = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        AVLog.iod("HardwareVideoEncoder", "Release on output thread done");
    }

    private void requestKeyFrame(long j) {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            MediaCodec mediaCodec = this.codec;
            if (mediaCodec != null) {
                mediaCodec.setParameters(bundle);
            }
            this.lastKeyFrameNs = j;
        } catch (IllegalStateException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("requestKeyFrame failed\n");
            LIZ.append(e.getMessage());
            AVLog.e("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
        }
    }

    private boolean shouldForceKeyFrame(long j) {
        long j2 = this.forcedKeyFrameNs;
        if (j2 > 0 && j > this.lastKeyFrameNs + j2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public int Encode(VideoFrame videoFrame) {
        int encodeByteBuffer;
        int i;
        String str;
        ScopeMonitor.CalcElapse(11, videoFrame.getBuffer().getCaptureMs(), TimeUtils.currentTimeMs());
        if (this.codec == null) {
            this.mSummary.encodeStatus = -1;
            return -1;
        }
        this.mThreadChecker.checkIsOnValidThread();
        this.mSummary.inputFrameCount++;
        boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        if (z != this.useSurfaceMode) {
            this.mSummary.encodeStatus = -2;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("useSurfaceMode ");
            LIZ.append(this.useSurfaceMode);
            LIZ.append(", frame is ");
            if (z) {
                str = "texture";
            } else {
                str = "yuv";
            }
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(JBR.LJFF(LIZ, str, " buffer.", LIZ));
            if (!AnonymousClass028.LJI(androidRuntimeException, "HardwareVideoEncoder.Encode")) {
                return -2;
            }
            throw androidRuntimeException;
        }
        SafeHandlerThread safeHandlerThread = this.outputThread;
        if (safeHandlerThread != null) {
            safeHandlerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_codec_HardwareVideoEncoder$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_codec_HardwareVideoEncoder$2__run$___twin___() {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }

                public static void com_ss_ttlivestreamer_core_codec_HardwareVideoEncoder$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ2;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_core_codec_HardwareVideoEncoder$2__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
        if (z) {
            encodeByteBuffer = encodeTextureBuffer(videoFrame);
        } else {
            encodeByteBuffer = encodeByteBuffer(videoFrame);
        }
        EncoderSummary encoderSummary = this.mSummary;
        if (encodeByteBuffer < 0) {
            i = encodeByteBuffer - 100;
        } else {
            i = encodeByteBuffer;
        }
        encoderSummary.encodeStatus = i;
        return encodeByteBuffer;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public boolean InitEncoder(final TEBundle tEBundle) {
        boolean z;
        DtsQueue dtsQueueFixed;
        String str;
        this.mSummary.onInitStep(31);
        this.mSummary.parseInitParams(tEBundle);
        if (this.mThreadChecker == null) {
            this.mThreadChecker = new ThreadUtils.ThreadChecker();
        }
        this.width = tEBundle.getInt("video_width");
        this.height = tEBundle.getInt("video_height");
        int i = tEBundle.getInt("video_fps");
        this.fps = i;
        if (i <= 0) {
            i = 25;
        }
        this.fps = i;
        this.noDropFrame = tEBundle.getBool("video_no_drop_frame");
        boolean z2 = true;
        if (tEBundle.getInt("video_is_cbr") == 1) {
            z = true;
        } else {
            z = false;
        }
        this.isCBR = z;
        this.enableBFrame = tEBundle.getBool("enableBFrame");
        if (tEBundle.getInt("video_enable_hard_enc_bframe") >= 0) {
            if (tEBundle.getInt("video_enable_hard_enc_bframe") <= 0) {
                z2 = false;
            }
            this.enableBFrame = z2;
        }
        if (tEBundle.contains("video_const_time_period_gop")) {
            this.constTimePeriod = tEBundle.getBool("video_const_time_period_gop");
        }
        boolean bool = tEBundle.getBool("video_lossless_encode");
        this.lossless = bool;
        if (bool) {
            this.adjustedBitrate = ((((this.width * this.height) * this.fps) * 3) / 2) * 8;
        } else {
            this.adjustedBitrate = (int) tEBundle.getLong("video_bitrate");
        }
        this.keyFrameIntervalSec = tEBundle.getInt("video_gop") / this.fps;
        this.forcedKeyFrameNs = ((r0 * 1000) * 1000) / 1000;
        parseEncoderStrategy(tEBundle);
        if (tEBundle.contains("video_hw_encode_lock_optimize")) {
            this.lockOptimize = tEBundle.getBool("video_hw_encode_lock_optimize");
            DebugLogUtils.isEnableDebugLog();
        } else {
            DebugLogUtils.isEnableDebugLog();
        }
        if (tEBundle.getInt("configuration_type") == 0) {
            AVLog.ioe("HardwareVideoEncoder", "Value of TEBundle.kKeyVideoConfigurationType error, should be 1 (Annex-B)");
            this.mSummary.onInitFail(31);
            return false;
        }
        if (tEBundle.getBool("video_fix_hardware_enc_dts") || this.enableBFrame) {
            dtsQueueFixed = new DtsQueueFixed();
        } else {
            dtsQueueFixed = new DtsQueue();
        }
        this.mDtsQueue = dtsQueueFixed;
        boolean bool2 = tEBundle.getBool("video_encode_perf_prior");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("videoEncodePerfPrior ");
        if (bool2) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        LIZ.append(str);
        AVLog.iow("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
        if (!bool2) {
            return initEncoderWithInfo(tEBundle, MediaCodecUtils.findCodecForType(this.codecType));
        }
        if (this.mSelector == null) {
            this.mSelector = new MediaCodecUtils.HardwareEncoderSelector(this.codecType);
        }
        return this.mSelector.selectEncoder(new MediaCodecUtils.HardwareEncoderSelector.CodecInfoHandler() { // from class: X.P3E
            @Override // com.ss.ttlivestreamer.core.codec.MediaCodecUtils.HardwareEncoderSelector.CodecInfoHandler
            public final boolean initEncoderWithCodecInfo(MediaCodecInfo mediaCodecInfo) {
                boolean lambda$InitEncoder$0;
                lambda$InitEncoder$0 = HardwareVideoEncoder.this.lambda$InitEncoder$0(tEBundle, mediaCodecInfo);
                return lambda$InitEncoder$0;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public void SetBitrate(int i) {
        if (this.lossless || this.codec == null) {
            return;
        }
        try {
            int bitrateWithRatio = bitrateWithRatio(i);
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", bitrateWithRatio);
            this.codec.setParameters(bundle);
            this.adjustedBitrate = i;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("update bitrate: ");
            LIZ.append(bitrateWithRatioLog(i, bitrateWithRatio));
            AVLog.ioi("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
        } catch (IllegalStateException e) {
            try {
                int bitrateWithRatio2 = bitrateWithRatio(this.adjustedBitrate);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("video-bitrate", bitrateWithRatio2);
                this.codec.setParameters(bundle2);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("reset bitrate: ");
                LIZ2.append(bitrateWithRatioLog(this.adjustedBitrate, bitrateWithRatio2));
                AVLog.ioi("HardwareVideoEncoder", X1D.LIZIZ(LIZ2));
            } catch (Throwable unused) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("update bitrate failed");
                LIZ3.append(e);
                AVLog.e("HardwareVideoEncoder", X1D.LIZIZ(LIZ3));
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Update bitrate failed new bitrate ");
                LIZ4.append(i);
                LIZ4.append(" old bitrate ");
                LIZ4.append(this.adjustedBitrate);
                LIZ4.append(" cause:");
                LIZ4.append(e.getMessage());
                AVLog.ioe("HardwareVideoEncoder", X1D.LIZIZ(LIZ4));
            }
        }
    }

    private String bitrateWithRatioLog(int i, int i2) {
        return C16880lQ.LLLZI(Locale.getDefault(), "%d = %d * %.2f * %.2f * %.2f", new Object[]{Integer.valueOf(i2), Integer.valueOf(i), Double.valueOf(this.bitrateRatio), Double.valueOf(this.bFrameBitrateRatio), Double.valueOf(this.roiBitrateRatio)});
    }

    private boolean initEncoderWithInfo(TEBundle tEBundle, MediaCodecInfo mediaCodecInfo) {
        this.mSummary.onInitStep(41);
        this.info = mediaCodecInfo;
        if (mediaCodecInfo == null) {
            this.mSummary.onInitFail(41);
            return false;
        }
        String name = mediaCodecInfo.getName();
        Integer selectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, this.info.getCapabilitiesForType(this.codecType), name);
        Integer selectColorFormat2 = MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, this.info.getCapabilitiesForType(this.codecType), name);
        setupCodecName(name, selectColorFormat, selectColorFormat2);
        boolean z = !tEBundle.getBool("video_is_yuv_frame");
        this.useSurfaceMode = z;
        if (!z ? selectColorFormat2 != null : selectColorFormat != null) {
            return createEncoderInternal(tEBundle);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("useSurfaceMode ");
        LIZ.append(this.useSurfaceMode);
        LIZ.append(", surfaceColorFormat ");
        LIZ.append(selectColorFormat);
        LIZ.append(", yuvColorFormat ");
        LIZ.append(selectColorFormat2);
        AVLog.ioe("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
        this.mSummary.onInitFail(42);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$InitEncoder$0(TEBundle tEBundle, MediaCodecInfo mediaCodecInfo) {
        boolean initEncoderWithInfo = initEncoderWithInfo(tEBundle, mediaCodecInfo);
        if (!initEncoderWithInfo) {
            this.mSummary.onFailedCodec();
        }
        return initEncoderWithInfo;
    }

    private void setupCodecName(String str, Integer num, Integer num2) {
        this.codecName = str;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
    }

    private void setupEncodeQPIfNeeded(String str, MediaFormat mediaFormat, TEBundle tEBundle) {
        if (!tEBundle.contains("video_qp_settings")) {
            return;
        }
        Chipset.create(str).setupQPConfig(mediaFormat, tEBundle.getString("video_qp_settings"));
    }
}
