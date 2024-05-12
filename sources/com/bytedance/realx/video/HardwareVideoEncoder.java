package com.bytedance.realx.video;

import X.C16880lQ;
import X.V0N;
import X.X1D;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.realx.RXVideoSurfaceController;
import com.bytedance.realx.base.RXDeviceInfoAndroid;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase14;
import com.bytedance.realx.video.EncodedImage;
import com.bytedance.realx.video.VideoEncoder;
import com.bytedance.realx.video.VideoFrame;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes33.dex */
public class HardwareVideoEncoder implements VideoEncoder {
    public int adjustedBitrate;
    public boolean automaticResizeOn;
    public VideoEncoder.BitrateMode bitrateMode;
    public VideoEncoder.Callback callback;
    public MediaCodecWrapper codec;
    public final RXVideoCodecDesc codecDesc;
    public final String codecName;
    public ByteBuffer configBuffer;
    public final ThreadUtils.ThreadChecker encodeThreadChecker;
    public Boolean forceSurfaceInput;
    public final long forcedKeyFrameNs;
    public int height;
    public final int keyFrameIntervalSec;
    public long lastKeyFrameNs;
    public final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    public Thread outputThread;
    public final ThreadUtils.ThreadChecker outputThreadChecker;
    public HashMap<String, String> privateParams;
    public volatile boolean running;
    public VideoEncoder.ScaleMode scaleMode;
    public VideoEncoder.Settings settings;
    public EglBase14.Context sharedContext;
    public volatile Exception shutdownException;
    public final Integer surfaceColorFormat;
    public EglBase14 textureEglBase;
    public Surface textureInputSurface;
    public boolean useSurfaceMode;
    public int width;
    public final Integer yuvColorFormat;
    public final YuvFormat yuvFormat;
    public GlRectDrawer textureDrawer = new GlRectDrawer();
    public VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();

    /* renamed from: com.bytedance.realx.video.HardwareVideoEncoder$2, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile;

        static {
            int[] iArr = new int[RXVideoCodecProfile.values().length];
            $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile = iArr;
            try {
                iArr[RXVideoCodecProfile.ProfileHigh.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ProfileConstrainedHigh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ProfileBaseline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ProfileConstrainedBaseline.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ProfileMain.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ByteVC1ProfileMain.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ByteVC1ProfileMain10.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ByteVC1ProfileMain10HDR10.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private boolean canUseSurface() {
        if (this.sharedContext != null && this.surfaceColorFormat != null) {
            return true;
        }
        return false;
    }

    private Thread createOutputThread() {
        return new PthreadThread("video_encoded_thread") { // from class: com.bytedance.realx.video.HardwareVideoEncoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                com_bytedance_realx_video_HardwareVideoEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_realx_video_HardwareVideoEncoder$1__run$___twin___() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }

            public static void com_bytedance_realx_video_HardwareVideoEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_bytedance_realx_video_HardwareVideoEncoder$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
    }

    private VideoCodecStatus initEncodeInternal() {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.lastKeyFrameNs = -1L;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecDesc.getStandard().mimeType(), this.width, this.height);
                initMediaFormat(createVideoFormat);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Format: ");
                LIZ.append(createVideoFormat);
                RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
                this.codec.configure(createVideoFormat, null, null, 1);
                if (RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
                    this.textureInputSurface = this.codec.createInputSurface();
                    RXVideoSurfaceController.getInstance().setSurface(this.textureInputSurface);
                } else if (this.useSurfaceMode) {
                    this.textureInputSurface = this.codec.createInputSurface();
                    EglBase14 eglBase14 = new EglBase14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
                    this.textureEglBase = eglBase14;
                    eglBase14.createSurface(this.textureInputSurface);
                    this.textureEglBase.makeCurrent();
                }
                this.codec.start();
                VideoEncoder.Settings settings = this.settings;
                setQPRangeForHisi(settings.maxQp, settings.minQp);
                this.running = true;
                this.outputThreadChecker.detachThread();
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                return VideoCodecStatus.OK;
            } catch (Exception e) {
                RXLogging.e("HardwareVideoEncoder", "initEncodeInternal failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Cannot create media encoder ");
            LIZ2.append(this.codecName);
            RXLogging.e("HardwareVideoEncoder", X1D.LIZIZ(LIZ2), e2);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private void initForceUseSurfaceInput() {
        boolean z;
        if (this.forceSurfaceInput == null) {
            String GetCpuModel = RXDeviceInfoAndroid.GetCpuModel();
            if (GetCpuModel == null) {
                this.forceSurfaceInput = Boolean.FALSE;
                return;
            }
            if (GetCpuModel.contains("MT6785V/CC") || GetCpuModel.contains("MT6833V/ZA") || GetCpuModel.contains("MT6833V/PNZA") || GetCpuModel.contains("MT6853V/ZA")) {
                z = true;
            } else {
                z = false;
            }
            this.forceSurfaceInput = Boolean.valueOf(z);
        }
    }

    public void deliverEncodedImage() {
        EncodedImage.FrameType frameType;
        ByteBuffer byteBuffer;
        try {
            this.outputThreadChecker.checkIsOnValidThread();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
                if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.codec.getOutputFormat();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("output format changed: ");
                    LIZ.append(outputFormat.toString());
                    RXLogging.i("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
                    return;
                }
                if (dequeueOutputBuffer == -1) {
                    return;
                }
                if (dequeueOutputBuffer != -3 && dequeueOutputBuffer < 0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("should not be here: index:");
                    LIZ2.append(dequeueOutputBuffer);
                    RXLogging.e("HardwareVideoEncoder", X1D.LIZIZ(LIZ2));
                    return;
                }
                ByteBuffer byteBuffer2 = this.codec.getOutputBuffers()[dequeueOutputBuffer];
                byteBuffer2.position(bufferInfo.offset);
                byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
                int i = bufferInfo.flags;
                if ((i & 2) != 0) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Config frame generated. Offset: ");
                    LIZ3.append(bufferInfo.offset);
                    LIZ3.append(". Size: ");
                    LIZ3.append(bufferInfo.size);
                    RXLogging.i("HardwareVideoEncoder", X1D.LIZIZ(LIZ3));
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    this.configBuffer = allocateDirect;
                    allocateDirect.put(byteBuffer2);
                } else {
                    boolean z = true;
                    if ((i & 1) == 0) {
                        z = false;
                    } else {
                        RXLogging.i("HardwareVideoEncoder", "Sync frame generated");
                        if (this.codecDesc.getStandard() == RXVideoCodecStandard.H264 || this.codecDesc.getStandard() == RXVideoCodecStandard.ByteVC1) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("Prepending config frame of size ");
                            LIZ4.append(this.configBuffer.capacity());
                            LIZ4.append(" to output buffer with offset ");
                            LIZ4.append(bufferInfo.offset);
                            LIZ4.append(", size ");
                            LIZ4.append(bufferInfo.size);
                            RXLogging.i("HardwareVideoEncoder", X1D.LIZIZ(LIZ4));
                            byteBuffer = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                            this.configBuffer.rewind();
                            byteBuffer.put(this.configBuffer);
                            byteBuffer.put(byteBuffer2);
                            byteBuffer.rewind();
                            frameType = EncodedImage.FrameType.VideoFrameKey;
                            EncodedImage.Builder builder = EncodedImage.builder();
                            builder.setEncodedWidth(this.width);
                            builder.setEncodedHeight(this.height);
                            builder.setCaptureTimeNs(bufferInfo.presentationTimeUs * 1000);
                            builder.setBuffer(byteBuffer);
                            builder.setFrameType(frameType);
                            this.callback.onEncodedFrame(builder.createEncodedImage(), new VideoEncoder.CodecSpecificInfo(this.codecDesc.getStandard()));
                        }
                    }
                    byteBuffer = byteBuffer2.slice();
                    if (!z) {
                        frameType = EncodedImage.FrameType.VideoFrameDelta;
                        EncodedImage.Builder builder2 = EncodedImage.builder();
                        builder2.setEncodedWidth(this.width);
                        builder2.setEncodedHeight(this.height);
                        builder2.setCaptureTimeNs(bufferInfo.presentationTimeUs * 1000);
                        builder2.setBuffer(byteBuffer);
                        builder2.setFrameType(frameType);
                        this.callback.onEncodedFrame(builder2.createEncodedImage(), new VideoEncoder.CodecSpecificInfo(this.codecDesc.getStandard()));
                    } else {
                        frameType = EncodedImage.FrameType.VideoFrameKey;
                        EncodedImage.Builder builder22 = EncodedImage.builder();
                        builder22.setEncodedWidth(this.width);
                        builder22.setEncodedHeight(this.height);
                        builder22.setCaptureTimeNs(bufferInfo.presentationTimeUs * 1000);
                        builder22.setBuffer(byteBuffer);
                        builder22.setFrameType(frameType);
                        this.callback.onEncodedFrame(builder22.createEncodedImage(), new VideoEncoder.CodecSpecificInfo(this.codecDesc.getStandard()));
                    }
                }
                this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
            } catch (Exception e) {
                if (System.currentTimeMillis() - currentTimeMillis < 100) {
                    RXLogging.e("HardwareVideoEncoder", "deliverOutput failed", e);
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                }
            }
        } catch (IllegalStateException unused) {
            RXLogging.e("HardwareVideoEncoder", "the encoded image is last encoder data, drop it");
        }
    }

    public VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            RXVideoCodecStandard standard = this.codecDesc.getStandard();
            RXVideoCodecStandard rXVideoCodecStandard = RXVideoCodecStandard.VP8;
            if (standard == rXVideoCodecStandard) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (this.codecDesc.getStandard() == rXVideoCodecStandard) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        RXLogging.w("HardwareVideoEncoder", "hardware video encoder release start.");
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                RXLogging.e("HardwareVideoEncoder", "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                RXLogging.e("HardwareVideoEncoder", "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = VideoCodecStatus.OK;
            }
        }
        RXLogging.w("HardwareVideoEncoder", "Media encoder release ok.");
        this.textureDrawer.release();
        RXLogging.w("HardwareVideoEncoder", "textureDrawer release ok.");
        this.videoFrameDrawer.release();
        RXLogging.w("HardwareVideoEncoder", "videoFrameDrawer release ok.");
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        RXLogging.w("HardwareVideoEncoder", "textureEglBase release ok.");
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        RXLogging.w("HardwareVideoEncoder", "textureInputSurface release ok.");
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        RXLogging.w("HardwareVideoEncoder", "hardware video encoder release end.");
        return videoCodecStatus;
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        RXLogging.i("HardwareVideoEncoder", "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            RXLogging.e("HardwareVideoEncoder", "Media encoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            RXLogging.e("HardwareVideoEncoder", "Media encoder release failed", e2);
            this.shutdownException = e2;
        }
        this.configBuffer = null;
        RXLogging.i("HardwareVideoEncoder", "Release on output thread done");
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus requestKeyFrame() {
        requestKeyFrame(System.currentTimeMillis());
        return VideoCodecStatus.OK;
    }

    /* loaded from: classes33.dex */
    public enum YuvFormat {
        I420 { // from class: com.bytedance.realx.video.HardwareVideoEncoder.YuvFormat.1
            @Override // com.bytedance.realx.video.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420;
                if (buffer == null || (i420 = buffer.toI420()) == null) {
                    return;
                }
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 { // from class: com.bytedance.realx.video.HardwareVideoEncoder.YuvFormat.2
            @Override // com.bytedance.realx.video.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                if (buffer == null) {
                    return;
                }
                if (buffer instanceof VideoFrame.NV12Buffer) {
                    VideoFrame.NV12Buffer nv12 = buffer.toNV12();
                    YuvHelper.NV12Copy(nv12.getDataY(), nv12.getStrideY(), nv12.getDataUV(), nv12.getStrideUV(), byteBuffer, nv12.getWidth(), nv12.getHeight());
                    nv12.release();
                } else {
                    VideoFrame.I420Buffer i420 = buffer.toI420();
                    if (i420 == null) {
                        return;
                    }
                    YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                    i420.release();
                }
            }
        };

        public abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);

        public static YuvFormat valueOf(int i) {
            if (i != 19) {
                if (i == 21 || i == 2141391872 || i == 2141391876) {
                    return NV12;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unsupported colorFormat: ");
                LIZ.append(i);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
            return I420;
        }

        public static YuvFormat valueOf(String str) {
            return (YuvFormat) V0N.LJJJ(YuvFormat.class, str);
        }
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("got egl err:");
                LIZ.append(glGetError);
                RXLogging.e("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
            }
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(videoFrame.getTimestampNs());
            return VideoCodecStatus.OK;
        } catch (Exception e) {
            RXLogging.e("HardwareVideoEncoder", "encodeTexture failed", e);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private void initMediaFormat(MediaFormat mediaFormat) {
        Integer num;
        if (this.useSurfaceMode) {
            num = this.surfaceColorFormat;
        } else {
            num = this.yuvColorFormat;
        }
        int intValue = num.intValue();
        RXVideoCodecStandard standard = this.codecDesc.getStandard();
        setIntegerParam(mediaFormat, "bitrate", Integer.valueOf(this.settings.targetBps));
        setBitrateMode(mediaFormat);
        setIntegerParam(mediaFormat, "color-format", Integer.valueOf(intValue));
        setIntegerParam(mediaFormat, "frame-rate", Integer.valueOf(this.settings.targetFps));
        int i = this.settings.targetKeyFrameIntervalMs;
        if (i <= 0) {
            setIntegerParam(mediaFormat, "i-frame-interval", Integer.valueOf(this.keyFrameIntervalSec));
        } else {
            int i2 = i / 1000;
            if (i2 <= 1) {
                i2 = 1;
            }
            setIntegerParam(mediaFormat, "i-frame-interval", Integer.valueOf(i2));
        }
        setIntegerParam(mediaFormat, "max-bframes", 0);
        if (!this.useSurfaceMode && this.codecName.contains("OMX.hisi.") && this.settings.rangeId == 0 && (this.yuvColorFormat.intValue() == 19 || this.yuvColorFormat.intValue() == 21)) {
            RXLogging.w("HardwareVideoEncoder", "kirin chips skip setting MediaFormat COLOR_RANGE");
        } else if (this.settings.rangeId == 1) {
            RXLogging.w("HardwareVideoEncoder", "setting MediaFormat COLOR_RANGE_FULL");
            setIntegerParam(mediaFormat, "color-range", 1);
        } else {
            RXLogging.w("HardwareVideoEncoder", "setting MediaFormat COLOR_RANGE_LIMITED");
            setIntegerParam(mediaFormat, "color-range", 2);
        }
        setIntegerParam(mediaFormat, "color-standard", 4);
        setIntegerParam(mediaFormat, "color-transfer", 3);
        RXLogging.w("HardwareVideoEncoder", "close setting profile:" + this.settings.closeSetProfile);
        if (!this.settings.closeSetProfile) {
            if (standard == RXVideoCodecStandard.H264) {
                RXVideoCodecProfile profile = this.codecDesc.getProfile();
                int i3 = AnonymousClass2.$SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[profile.ordinal()];
                if (i3 != 1 && i3 != 2) {
                    if (i3 != 3 && i3 != 4 && i3 != 5) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Unknown profile level id: ");
                        LIZ.append(profile);
                        LIZ.append("default to baseline profile");
                        RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
                        setIntegerParam(mediaFormat, "profile", 1);
                        setIntegerParam(mediaFormat, "level", 256);
                    } else {
                        RXLogging.w("HardwareVideoEncoder", "setting baseline profile ");
                        setIntegerParam(mediaFormat, "profile", 1);
                        setIntegerParam(mediaFormat, "level", 256);
                    }
                } else {
                    RXLogging.w("HardwareVideoEncoder", "setting high profile ");
                    setIntegerParam(mediaFormat, "profile", 8);
                    setIntegerParam(mediaFormat, "level", 256);
                }
            } else if (standard == RXVideoCodecStandard.ByteVC1) {
                RXVideoCodecProfile profile2 = this.codecDesc.getProfile();
                int i4 = AnonymousClass2.$SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[profile2.ordinal()];
                if (i4 != 6) {
                    if (i4 != 7) {
                        if (i4 != 8) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Unknown profile level id: ");
                            LIZ2.append(profile2);
                            LIZ2.append("default to Main profile");
                            RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ2));
                            setIntegerParam(mediaFormat, "profile", 1);
                            setIntegerParam(mediaFormat, "level", 8);
                        } else {
                            setIntegerParam(mediaFormat, "profile", 4096);
                            setIntegerParam(mediaFormat, "level", 8);
                        }
                    } else {
                        setIntegerParam(mediaFormat, "profile", 2);
                        setIntegerParam(mediaFormat, "level", 8);
                    }
                } else {
                    setIntegerParam(mediaFormat, "profile", 1);
                    setIntegerParam(mediaFormat, "level", 8);
                }
            } else if (standard == RXVideoCodecStandard.VP8) {
                setIntegerParam(mediaFormat, "profile", 1);
            }
        }
        if (standard != RXVideoCodecStandard.VP8) {
            RXLogging.w("HardwareVideoEncoder", "maxqp:" + this.settings.maxQp + " minqp:" + this.settings.minQp);
            if (this.codecName.contains("OMX.hisi.")) {
                setIntegerParam(mediaFormat, "vendor.hisi.hisi-ext-codec-vendor-configure", 1);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                setIntegerParam(mediaFormat, "video-qp-i-min", Integer.valueOf(this.settings.minQp));
                setIntegerParam(mediaFormat, "video-qp-i-max", Integer.valueOf(this.settings.maxQp));
                setIntegerParam(mediaFormat, "video-qp-p-min", Integer.valueOf(this.settings.minQp));
                setIntegerParam(mediaFormat, "video-qp-p-max", Integer.valueOf(this.settings.maxQp));
            }
            setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-i-min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-i-max", Integer.valueOf(this.settings.maxQp));
            setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-p-min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-p-max", Integer.valueOf(this.settings.maxQp));
            setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-i-min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-i-max", Integer.valueOf(this.settings.maxQp));
            setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-p-min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-p-max", Integer.valueOf(this.settings.maxQp));
            setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-low-latency.enable", 1);
            if (this.codecName.toLowerCase().contains("exynos")) {
                setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.I-minQP", Integer.valueOf(this.settings.minQp));
                setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.I-maxQP", Integer.valueOf(this.settings.maxQp));
                setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.P-maxQP", Integer.valueOf(this.settings.maxQp));
                setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.P-minQP", Integer.valueOf(this.settings.minQp));
            }
            if (this.codecName.toLowerCase().contains("mtk")) {
                setIntegerParam(mediaFormat, "vendor.mtk.venc.dynamic.qpbound.min", Integer.valueOf(this.settings.minQp));
                setIntegerParam(mediaFormat, "vendor.mtk.venc.dynamic.qpbound.max", Integer.valueOf(this.settings.maxQp));
            }
        }
        if (this.settings.temporalLayerNum > 1) {
            setStringParam(mediaFormat, "ts-schema", "android.generic." + this.settings.temporalLayerNum);
        }
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("set android hardware encoder private param with Key:");
            LIZ3.append(entry.getKey());
            LIZ3.append(" Value:");
            LIZ3.append(entry.getValue());
            RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ3));
            if (isNumeric(entry.getValue())) {
                mediaFormat.setInteger(entry.getKey(), CastIntegerProtector.parseInt(entry.getValue()));
            } else if (entry.getValue().length() > 0) {
                mediaFormat.setString(entry.getKey(), entry.getValue());
            }
        }
    }

    private boolean isForceUseSurfaceInput(int i) {
        if (this.forceSurfaceInput.booleanValue() && i % 16 != 0) {
            return true;
        }
        return false;
    }

    private boolean isNumeric(String str) {
        if (str != null && str.matches("[0-9]+")) {
            return true;
        }
        return false;
    }

    private void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (Exception e) {
            RXLogging.e("HardwareVideoEncoder", "requestKeyFrame failed", e);
        }
    }

    private void setBitrateMode(MediaFormat mediaFormat) {
        this.codec.getCodecInfo();
        VideoEncoder.BitrateMode bitrateMode = VideoEncoder.BitrateMode.CBR;
        VideoEncoder.BitrateMode bitrateMode2 = this.settings.bitrateMode;
        if (bitrateMode == bitrateMode2 || VideoEncoder.BitrateMode.AUTO == bitrateMode2) {
            setIntegerParam(mediaFormat, "bitrate-mode", 2);
        } else {
            setIntegerParam(mediaFormat, "bitrate-mode", 1);
        }
    }

    private boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        if (j2 > 0 && j > this.lastKeyFrameNs + j2) {
            return true;
        }
        return false;
    }

    private VideoCodecStatus updateBitrate(int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (Exception e) {
            RXLogging.e("HardwareVideoEncoder", "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    private void setQPRangeForHisi(int i, int i2) {
        MediaCodecWrapper mediaCodecWrapper;
        if (!this.codecName.contains("OMX.hisi.") || (mediaCodecWrapper = this.codec) == null) {
            return;
        }
        try {
            MediaFormat outputFormat = mediaCodecWrapper.getOutputFormat();
            if (outputFormat != null) {
                RXLogging.i("HardwareVideoEncoder", "output format before start: " + outputFormat.toString());
                if (!outputFormat.containsKey("vendor.hisi.hisi-ext-codec-qp-regulation-supported") || outputFormat.getInteger("vendor.hisi.hisi-ext-codec-qp-regulation-supported") != 1) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("vendor.hisi.hisi-ext-codec-max-qp", i);
                bundle.putInt("vendor.hisi.hisi-ext-codec-min-qp", i2);
                try {
                    this.codec.setParameters(bundle);
                } catch (Exception e) {
                    RXLogging.e("HardwareVideoEncoder", "setQPRangeForHisi failed", e);
                }
            }
        } catch (Exception e2) {
            RXLogging.e("HardwareVideoEncoder", "getOutputFormat failed", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f1, code lost:
    
        if (shouldForceKeyFrame(r13.getTimestampNs()) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    @Override // com.bytedance.realx.video.VideoEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.realx.video.VideoCodecStatus encode(com.bytedance.realx.video.VideoFrame r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.video.HardwareVideoEncoder.encode(com.bytedance.realx.video.VideoFrame, boolean):com.bytedance.realx.video.VideoCodecStatus");
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer);
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        boolean z = true;
        this.automaticResizeOn = true;
        this.width = settings.width;
        this.height = settings.height;
        this.scaleMode = settings.scaleMode;
        this.bitrateMode = settings.bitrateMode;
        if (RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
            RXLogging.e("HardwareVideoEncoder", "using pass surface mode");
            this.useSurfaceMode = true;
        } else {
            if (!canUseSurface() || !settings.useSurfaceMode) {
                z = false;
            }
            this.useSurfaceMode = z;
        }
        this.settings = settings;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initEncode, codec name:");
        LIZ.append(this.codecName);
        LIZ.append(", with resolution:");
        LIZ.append(this.width);
        LIZ.append(" x ");
        LIZ.append(this.height);
        LIZ.append(". @ ");
        LIZ.append(settings.targetBps);
        LIZ.append("kbps. Fps: ");
        LIZ.append(settings.targetFps);
        LIZ.append(" Use surface mode: ");
        LIZ.append(this.useSurfaceMode);
        LIZ.append(" initUseSurfaceMode: ");
        LIZ.append(settings.useSurfaceMode);
        LIZ.append(" settings.bitrateMode:");
        LIZ.append(settings.bitrateMode);
        LIZ.append(" qp_min:");
        LIZ.append(settings.minQp);
        LIZ.append(" qp_max:");
        LIZ.append(settings.maxQp);
        RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
        return initEncodeInternal();
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus setPrivateParam(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("got android hardware encoder setPrivateParam with key:");
        LIZ.append(str);
        LIZ.append(" value:");
        LIZ.append(str2);
        RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
        if ("realx.force.surface.input".equalsIgnoreCase(str)) {
            if (str2 == null) {
                return VideoCodecStatus.OK;
            }
            if (str2.equalsIgnoreCase("true")) {
                this.forceSurfaceInput = Boolean.TRUE;
            } else {
                this.forceSurfaceInput = Boolean.FALSE;
            }
        } else {
            this.privateParams.put(str, str2);
        }
        return VideoCodecStatus.OK;
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus setRateAllocation(int i, int i2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        updateBitrate(i);
        return VideoCodecStatus.OK;
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, VideoFrame.Buffer buffer, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long timestampNs = videoFrame.getTimestampNs() / 1000;
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (dequeueInputBuffer == -1) {
                RXLogging.i("HardwareVideoEncoder", "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffers()[dequeueInputBuffer], buffer);
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, i, timestampNs, 0);
                    return VideoCodecStatus.OK;
                } catch (Exception e) {
                    RXLogging.e("HardwareVideoEncoder", "queueInputBuffer failed", e);
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            } catch (Exception e2) {
                RXLogging.e("HardwareVideoEncoder", "getInputBuffers failed", e2);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e3) {
            RXLogging.e("HardwareVideoEncoder", "dequeueInputBuffer failed", e3);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        this.width = i;
        this.height = i2;
        this.useSurfaceMode = z;
        return initEncodeInternal();
    }

    private void setIntegerParam(MediaFormat mediaFormat, String str, Integer num) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (isNumeric(entry.getValue())) {
                    mediaFormat.setInteger(entry.getKey(), CastIntegerProtector.parseInt(entry.getValue()));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("the encoder params ");
                    LIZ.append(entry.getKey());
                    LIZ.append(" is coverd by vpaas with value:");
                    LIZ.append(entry.getValue());
                    RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
                    this.privateParams.remove(str);
                    return;
                }
                this.privateParams.remove(str);
                if (entry.getValue().length() > 0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("the encoder params ");
                    LIZ2.append(entry.getKey());
                    LIZ2.append(" set by vpaas is invalid with value:");
                    LIZ2.append(entry.getValue());
                    LIZ2.append(",skip it");
                    RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ2));
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("the encoder params ");
                    LIZ3.append(entry.getKey());
                    LIZ3.append(" is disabled by vpaas,skip it");
                    RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ3));
                    return;
                }
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("encoder int params has been set with Key:");
        LIZ4.append(str);
        LIZ4.append(" Value:");
        LIZ4.append(num);
        RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ4));
        mediaFormat.setInteger(str, num.intValue());
    }

    private void setStringParam(MediaFormat mediaFormat, String str, String str2) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (entry.getValue().length() > 0) {
                    mediaFormat.setString(entry.getKey(), entry.getValue());
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("the encoder params ");
                    LIZ.append(entry.getKey());
                    LIZ.append(" is coverd by vpaas with value:");
                    LIZ.append(entry.getValue());
                    RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ));
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("the encoder params ");
                    LIZ2.append(entry.getKey());
                    LIZ2.append(" is disabled by vpaas,skip it");
                    RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ2));
                }
                this.privateParams.remove(str);
                return;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("encoder string params has been set with Key:");
        LIZ3.append(str);
        LIZ3.append(" Value:");
        LIZ3.append(str2);
        RXLogging.w("HardwareVideoEncoder", X1D.LIZIZ(LIZ3));
        mediaFormat.setString(str, str2);
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, RXVideoCodecDesc rXVideoCodecDesc, Integer num, Integer num2, int i, int i2, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.privateParams = new HashMap<>();
        this.forceSurfaceInput = null;
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecDesc = rXVideoCodecDesc;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i2);
        this.sharedContext = context;
        initForceUseSurfaceInput();
        threadChecker.detachThread();
    }
}
