package com.bytedance.realx.video;

import X.C16880lQ;
import X.C90008ZUe;
import X.X1D;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.VideoDecoder;
import com.bytedance.realx.video.VideoFrame;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes33.dex */
public class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    public static int curEglContextNum = 0;
    public static int maxEglContextNum = 16;
    public VideoDecoder.Callback callback;
    public MediaCodecWrapper codec;
    public final String codecName;
    public final RXVideoCodecStandard codecType;
    public int colorFormat;
    public ThreadUtils.ThreadChecker decoderThreadChecker;
    public Surface ex_surface;
    public boolean hasDecodedFirstFrame;
    public int height;
    public boolean keyFrameRequired;
    public int maxExSurfaceRecreateDecoderCount;
    public final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    public Thread outputThread;
    public ThreadUtils.ThreadChecker outputThreadChecker;
    public DecodedTextureMetadata renderedTextureMetadata;
    public volatile boolean running;
    public VideoDecoder.Settings settings;
    public final EglBase.Context sharedContext;
    public volatile Exception shutdownException;
    public int sliceHeight;
    public int stride;
    public Surface surface;
    public SurfaceTextureHelper surfaceTextureHelper;
    public int width;
    public boolean enableHisiEndCode = true;
    public final Object dimensionLock = new Object();
    public int encoded_width = 0;
    public int encoded_height = 0;
    public final Object surfaceTextureHelperLock = new Object();
    public long lastOutputTime = 0;
    public long currentOutputTime = 0;
    public long lastInputTime = 0;
    public long currentInputTimeDelta = 0;
    public long packetCount2s = 0;
    public long timeForAvg = 0;
    public long avgInputTimeDelta = 0;
    public long inputFrameCount = 0;
    public long outputFrameCount = 0;
    public long dropDecodedFrameCount = 0;
    public long callbackDecodedFrameCount = 0;
    public long minFrameCache = -1;
    public long currentFrameCache = -1;
    public final Object smoothOutputLock = new Object();
    public boolean usingInternalSurfaceLast = true;
    public HashMap<String, String> privateParams = new HashMap<>();
    public boolean mustUseYUVoutput = false;
    public final Object renderedTextureMetadataLock = new Object();

    @Override // com.bytedance.realx.video.VideoDecoder
    public final /* synthetic */ long createNativeVideoDecoder() {
        return C90008ZUe.LIZ(this);
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public boolean getPrefersLateDecoding() {
        return true;
    }

    private Thread createOutputThread() {
        return new PthreadThread("AndroidVideoDecoder.outputThread") { // from class: com.bytedance.realx.video.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                com_bytedance_realx_video_AndroidVideoDecoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_realx_video_AndroidVideoDecoder$1__run$___twin___() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }

            public static void com_bytedance_realx_video_AndroidVideoDecoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_bytedance_realx_video_AndroidVideoDecoder$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            RXLogging.d("AndroidVideoDecoder", "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 6000L)) {
                RXLogging.e("AndroidVideoDecoder", "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            }
            if (this.shutdownException != null) {
                RXLogging.e("AndroidVideoDecoder", "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                return VideoCodecStatus.ERROR;
            }
            this.codec = null;
            this.outputThread = null;
            return VideoCodecStatus.OK;
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    public void deliverDecodedFrame() {
        long j;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            MediaCodecWrapper mediaCodecWrapper = this.codec;
            if (this.settings.latencyInsensitiveMode) {
                j = 25000;
            } else {
                j = 100000;
            }
            int dequeueOutputBuffer = mediaCodecWrapper.dequeueOutputBuffer(bufferInfo, j);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
                return;
            }
            if (dequeueOutputBuffer < 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("dequeueOutputBuffer err, returned ");
                LIZ.append(dequeueOutputBuffer);
                RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ));
                return;
            }
            this.outputFrameCount++;
            if (this.ex_surface != null) {
                try {
                    this.codec.releaseOutputBuffer(dequeueOutputBuffer, true);
                    if (!this.hasDecodedFirstFrame) {
                        this.hasDecodedFirstFrame = true;
                    }
                    NullBuffer nullBuffer = new NullBuffer(this.width, this.height, null);
                    nullBuffer.getBufferType();
                    VideoFrame videoFrame = new VideoFrame(nullBuffer, 0, bufferInfo.presentationTimeUs * 1000);
                    this.callbackDecodedFrameCount++;
                    this.callback.onDecodedFrame(videoFrame);
                    videoFrame.release();
                    return;
                } catch (IllegalStateException e) {
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    this.callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_EXCEPTION, stringWriter.toString());
                    this.callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "releaseOutputBuffer err");
                    this.dropDecodedFrameCount++;
                    return;
                }
            }
            if (!this.hasDecodedFirstFrame) {
                this.hasDecodedFirstFrame = true;
            }
            if (this.surfaceTextureHelper != null) {
                deliverTextureFrame(dequeueOutputBuffer, bufferInfo);
            } else {
                deliverByteFrame(dequeueOutputBuffer, bufferInfo);
            }
        } catch (IllegalStateException e2) {
            RXLogging.e("AndroidVideoDecoder", "deliverDecodedFrame failed", e2);
        }
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public void disableExternalSurface() {
        RXLogging.w("AndroidVideoDecoder", "disable external surface.");
        this.ex_surface = null;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus release() {
        RXLogging.d("AndroidVideoDecoder", "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        releaseSurface();
        releaseSurfaceTextureHelper();
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.encoded_width = 0;
        this.encoded_height = 0;
        return releaseInternal;
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        RXLogging.i("AndroidVideoDecoder", "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            RXLogging.e("AndroidVideoDecoder", "Media decoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            RXLogging.e("AndroidVideoDecoder", "Media decoder release failed", e2);
            this.shutdownException = e2;
        }
        releaseSurface();
        RXLogging.i("AndroidVideoDecoder", "Release on output thread done");
    }

    public void releaseSurface() {
        RXLogging.w("AndroidVideoDecoder", "releaseSurface start");
        if (this.surface != null) {
            RXLogging.w("AndroidVideoDecoder", "release surface");
            this.surface.release();
            this.surface = null;
        }
        synchronized (this.surfaceTextureHelperLock) {
            if (this.surfaceTextureHelper != null) {
                RXLogging.w("AndroidVideoDecoder", "surfaceTextureHelper.stopListening()");
                this.surfaceTextureHelper.stopListening();
            }
        }
        if (!this.settings.enableSurfaceTextureReuse) {
            releaseSurfaceTextureHelper();
        }
    }

    public void releaseSurfaceTextureHelper() {
        synchronized (this.surfaceTextureHelperLock) {
            if (this.surfaceTextureHelper != null) {
                RXLogging.w("AndroidVideoDecoder", "release surfaceTextureHelper");
                this.surfaceTextureHelper.dispose();
                this.surfaceTextureHelper = null;
                curEglContextNum--;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("release surfaceTextureHelper done, curEglContextNum:");
                LIZ.append(curEglContextNum);
                RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ));
            }
        }
    }

    private void smoothOutputFrame() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.currentOutputTime = elapsedRealtime;
        long j = this.outputFrameCount;
        long j2 = this.inputFrameCount;
        if (j > j2) {
            this.outputFrameCount = j2;
        }
        long j3 = this.minFrameCache;
        if (j3 < 0) {
            this.minFrameCache = this.currentFrameCache;
        } else {
            long j4 = this.currentFrameCache;
            if (j3 > j4 && j4 >= 0) {
                j3 = j4;
            }
            this.minFrameCache = j3;
        }
        long j5 = this.lastOutputTime;
        long j6 = elapsedRealtime - j5;
        long j7 = this.avgInputTimeDelta;
        if (j7 <= 0) {
            j7 = this.currentInputTimeDelta;
            if (j7 <= 0) {
                j7 = 16;
            }
        } else {
            long j8 = this.currentInputTimeDelta;
            if (j8 < j7) {
                j7 = 10;
                if (j8 > 10) {
                    j7 = j8;
                }
            }
        }
        if (j5 > 0 && j6 < j7) {
            long j9 = j7 - j6;
            if (this.currentFrameCache > this.minFrameCache) {
                j9 /= 2;
            }
            if (j9 > 1300) {
                j9 = 1300;
            }
            try {
                synchronized (this.smoothOutputLock) {
                    this.smoothOutputLock.wait(j9);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        this.lastOutputTime = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    /* loaded from: classes33.dex */
    public static class DecodedTextureMetadata {
        public final long presentationTimestampUs;

        public DecodedTextureMetadata(long j) {
            this.presentationTimestampUs = j;
        }
    }

    private void initMediaFormat(MediaFormat mediaFormat) {
        if (this.sharedContext == null) {
            setIntegerParam(mediaFormat, "color-format", Integer.valueOf(this.colorFormat));
        }
        VideoDecoder.Settings settings = this.settings;
        if (settings.outputByDts && !settings.latencyInsensitiveMode) {
            setIntegerParam(mediaFormat, "low-latency", 1);
            setIntegerParam(mediaFormat, "vendor.qti-ext-dec-picture-order.enable", 1);
            setIntegerParam(mediaFormat, "vendor.qti-ext-dec-low-latency.enable", 1);
            setIntegerParam(mediaFormat, "vendor.rtc-ext-dec-low-latency.enable", 1);
            if (this.width < this.height) {
                setIntegerParam(mediaFormat, "vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
            }
            setIntegerParam(mediaFormat, "vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
            setIntegerParam(mediaFormat, "fast-output-mode", 1);
            setStringParam(mediaFormat, "vendor.vdec.example-ext-dec-low-latency.enable", "true");
        }
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("set android hardware decoder private param with Key:");
            LIZ.append(entry.getKey());
            LIZ.append(" Value:");
            LIZ.append(entry.getValue());
            RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ));
            if (entry.getValue().equals("bytertc.hisi.decoder.endcode.enable") && entry.getValue() == CardStruct.IStatusCode.DEFAULT) {
                this.enableHisiEndCode = false;
                RXLogging.w("AndroidVideoDecoder", "set android hardware decoder close hisi hw decoder endcode");
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("set android hardware decoder private param with Key:");
                LIZ2.append(entry.getKey());
                LIZ2.append(" Value:");
                LIZ2.append(entry.getValue());
                RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ2));
                if (isNumeric(entry.getValue())) {
                    mediaFormat.setInteger(entry.getKey(), CastIntegerProtector.parseInt(entry.getValue()));
                } else if (entry.getValue().length() > 0) {
                    mediaFormat.setString(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    private boolean isNumeric(String str) {
        if (str != null && str.matches("[0-9]+")) {
            return true;
        }
        return false;
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") + 1) - mediaFormat.getInteger("crop-left");
            integer2 = (mediaFormat.getInteger("crop-bottom") + 1) - mediaFormat.getInteger("crop-top");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stream have crop info newWidth:");
            LIZ.append(integer);
            LIZ.append(" newHeight:");
            LIZ.append(integer2);
            RXLogging.i("AndroidVideoDecoder", X1D.LIZIZ(LIZ));
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            if (this.hasDecodedFirstFrame && (this.width != integer || this.height != integer2)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Unexpected size change. Configured ");
                LIZ2.append(this.width);
                LIZ2.append("*");
                LIZ2.append(this.height);
                LIZ2.append(". New ");
                LIZ2.append(integer);
                LIZ2.append("*");
                LIZ2.append(integer2);
                stopOnOutputThread(new RuntimeException(X1D.LIZIZ(LIZ2)));
                return;
            }
            this.width = integer;
            this.height = integer2;
            if (this.surfaceTextureHelper == null && this.ex_surface == null && mediaFormat.containsKey("color-format")) {
                this.colorFormat = mediaFormat.getInteger("color-format");
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Color: 0x");
                LIZ3.append(Integer.toHexString(this.colorFormat));
                RXLogging.i("AndroidVideoDecoder", X1D.LIZIZ(LIZ3));
                if (!isSupportedColorFormat(this.colorFormat)) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Unsupported color format: ");
                    LIZ4.append(this.colorFormat);
                    stopOnOutputThread(new IllegalStateException(X1D.LIZIZ(LIZ4)));
                    return;
                }
            }
            synchronized (this.dimensionLock) {
                if (mediaFormat.containsKey("stride")) {
                    this.stride = mediaFormat.getInteger("stride");
                }
                if (mediaFormat.containsKey("slice-height")) {
                    this.sliceHeight = mediaFormat.getInteger("slice-height");
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("Frame stride and slice height: ");
                LIZ5.append(this.stride);
                LIZ5.append(" x ");
                LIZ5.append(this.sliceHeight);
                RXLogging.i("AndroidVideoDecoder", X1D.LIZIZ(LIZ5));
                this.stride = Math.max(this.width, this.stride);
                this.sliceHeight = Math.max(this.height, this.sliceHeight);
            }
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01a7 A[Catch: Exception -> 0x0244, TryCatch #5 {Exception -> 0x0244, blocks: (B:13:0x003c, B:15:0x0044, B:17:0x0071, B:19:0x007c, B:21:0x00a5, B:23:0x00a9, B:26:0x00b3, B:28:0x00b9, B:30:0x00c3, B:32:0x00c7, B:34:0x00cd, B:36:0x00d7, B:38:0x00db, B:41:0x00e5, B:44:0x00f4, B:46:0x00fa, B:49:0x0104, B:50:0x010c, B:52:0x0112, B:54:0x011c, B:56:0x0125, B:58:0x012f, B:60:0x018b, B:62:0x0190, B:63:0x01a3, B:65:0x01a7, B:66:0x01a9, B:68:0x01af, B:70:0x01b3, B:72:0x01bc, B:88:0x01fa, B:89:0x01c1, B:90:0x021b, B:94:0x0224, B:99:0x022f, B:104:0x023a, B:106:0x0080, B:108:0x008b, B:111:0x004a, B:114:0x0052, B:117:0x005d, B:118:0x005f, B:126:0x0070, B:78:0x01cc, B:79:0x01ce, B:87:0x01f9, B:81:0x01cf, B:82:0x01f5, B:120:0x0060, B:121:0x006c), top: B:12:0x003c, inners: #0, #1, #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c1 A[Catch: Exception -> 0x0244, TryCatch #5 {Exception -> 0x0244, blocks: (B:13:0x003c, B:15:0x0044, B:17:0x0071, B:19:0x007c, B:21:0x00a5, B:23:0x00a9, B:26:0x00b3, B:28:0x00b9, B:30:0x00c3, B:32:0x00c7, B:34:0x00cd, B:36:0x00d7, B:38:0x00db, B:41:0x00e5, B:44:0x00f4, B:46:0x00fa, B:49:0x0104, B:50:0x010c, B:52:0x0112, B:54:0x011c, B:56:0x0125, B:58:0x012f, B:60:0x018b, B:62:0x0190, B:63:0x01a3, B:65:0x01a7, B:66:0x01a9, B:68:0x01af, B:70:0x01b3, B:72:0x01bc, B:88:0x01fa, B:89:0x01c1, B:90:0x021b, B:94:0x0224, B:99:0x022f, B:104:0x023a, B:106:0x0080, B:108:0x008b, B:111:0x004a, B:114:0x0052, B:117:0x005d, B:118:0x005f, B:126:0x0070, B:78:0x01cc, B:79:0x01ce, B:87:0x01f9, B:81:0x01cf, B:82:0x01f5, B:120:0x0060, B:121:0x006c), top: B:12:0x003c, inners: #0, #1, #2, #4, #6 }] */
    @Override // com.bytedance.realx.video.VideoDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.realx.video.VideoCodecStatus decode(com.bytedance.realx.video.EncodedImage r23) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.video.AndroidVideoDecoder.decode(com.bytedance.realx.video.EncodedImage):com.bytedance.realx.video.VideoCodecStatus");
    }

    @Override // com.bytedance.realx.video.VideoDecoder, com.bytedance.realx.video.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("renderedTextureMetadata is null drop current decoded frame,running:");
                LIZ.append(this.running);
                RXLogging.e("AndroidVideoDecoder", X1D.LIZIZ(LIZ));
                this.callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "renderedTextureMetadata is null");
                this.dropDecodedFrameCount++;
                return;
            }
            long j = decodedTextureMetadata.presentationTimestampUs * 1000;
            this.renderedTextureMetadata = null;
            this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), 0, j));
            this.callbackDecodedFrameCount++;
        }
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public void setExternalSurface(Surface surface) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set external surface . surface:");
        LIZ.append(surface);
        RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ));
        if (surface != null) {
            this.ex_surface = surface;
            this.surface = null;
        }
    }

    private void deliverByteFrame(int i, MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        int i4;
        int i5;
        VideoFrame.Buffer copyNV12ToI420Buffer;
        synchronized (this.dimensionLock) {
            i2 = this.width;
            i3 = this.height;
            i4 = this.stride;
            i5 = this.sliceHeight;
        }
        int i6 = bufferInfo.size;
        if (i6 < ((i2 * i3) * 3) / 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Insufficient output buffer size: ");
            LIZ.append(bufferInfo.size);
            RXLogging.e("AndroidVideoDecoder", X1D.LIZIZ(LIZ));
            return;
        }
        if (i6 < ((i4 * i3) * 3) / 2 && i5 == i3 && i4 > i2) {
            i4 = (i6 * 2) / (i3 * 3);
        }
        ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = byteBuffer.slice();
        if (this.colorFormat == 19) {
            copyNV12ToI420Buffer = copyI420Buffer(slice, i4, i5, i2, i3);
        } else {
            copyNV12ToI420Buffer = copyNV12ToI420Buffer(slice, i4, i5, i2, i3);
        }
        if (copyNV12ToI420Buffer == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("frameBuffer is null, colorFormat:");
            LIZ2.append(this.colorFormat);
            RXLogging.e("AndroidVideoDecoder", X1D.LIZIZ(LIZ2));
            this.dropDecodedFrameCount++;
            return;
        }
        this.codec.releaseOutputBuffer(i, false);
        VideoFrame videoFrame = new VideoFrame(copyNV12ToI420Buffer, 0, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame);
        this.callbackDecodedFrameCount++;
        videoFrame.release();
    }

    private void deliverTextureFrame(int i, MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        boolean z;
        synchronized (this.dimensionLock) {
            i2 = this.width;
            i3 = this.height;
        }
        VideoDecoder.Settings settings = this.settings;
        if (settings.enableSmoothOutput && !settings.latencyInsensitiveMode) {
            smoothOutputFrame();
        }
        if (this.settings.latencyInsensitiveMode && this.running) {
            int i4 = 0;
            do {
                i4++;
                synchronized (this.renderedTextureMetadataLock) {
                    if (this.renderedTextureMetadata == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    break;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } while (i4 < 200);
        }
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                try {
                    this.codec.releaseOutputBuffer(i, false);
                } catch (IllegalStateException e2) {
                    RXLogging.e("AndroidVideoDecoder", "releaseOutputBuffer failed", e2);
                }
                this.dropDecodedFrameCount++;
                this.callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "waiting for texture for the previous frame");
                return;
            }
            synchronized (this.surfaceTextureHelperLock) {
                SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.setTextureSize(i2, i3);
                    this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs);
                    try {
                        this.codec.releaseOutputBuffer(i, true);
                    } catch (IllegalStateException e3) {
                        RXLogging.e("AndroidVideoDecoder", "releaseOutputBuffer failed!", e3);
                    }
                    return;
                }
                this.dropDecodedFrameCount++;
                this.callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "surfaceTextureHelper is null");
                RXLogging.e("AndroidVideoDecoder", "surfaceTextureHelper is null, drop current decoded frame.");
                try {
                    this.codec.releaseOutputBuffer(i, false);
                } catch (IllegalStateException e4) {
                    RXLogging.e("AndroidVideoDecoder", "releaseOutputBuffer failed", e4);
                }
                return;
            }
        }
    }

    private VideoCodecStatus initDecodeInternal(int i, int i2) {
        if (this.callback == null) {
            RXLogging.d("AndroidVideoDecoder", "callback uninitalized");
            return VideoCodecStatus.UNINITIALIZED;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        if (this.sharedContext != null && this.ex_surface == null) {
            VideoDecoder.Settings settings = this.settings;
            if (!settings.enableYUVOutput && curEglContextNum < maxEglContextNum && (this.surfaceTextureHelper == null || !settings.enableSurfaceTextureReuse)) {
                SurfaceTextureHelper createSurfaceTextureHelper = createSurfaceTextureHelper();
                this.surfaceTextureHelper = createSurfaceTextureHelper;
                if (createSurfaceTextureHelper == null) {
                    RXLogging.w("AndroidVideoDecoder", "surfaceTextureHelper create fail,egl context maybe is full, the hw decoder should use yuvoutput mode");
                    this.mustUseYUVoutput = true;
                } else {
                    RXLogging.w("AndroidVideoDecoder", "surfaceTextureHelper create successful.");
                    curEglContextNum++;
                    this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
                    this.surfaceTextureHelper.startListening(this);
                }
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initDecodeInternal name: ");
        LIZ.append(this.codecName);
        LIZ.append(" type: ");
        LIZ.append(this.codecType);
        LIZ.append(" width: ");
        LIZ.append(i);
        LIZ.append(" height: ");
        LIZ.append(i2);
        LIZ.append(" sharedContext:");
        LIZ.append(this.sharedContext);
        LIZ.append(" outputByDts:");
        LIZ.append(this.settings.outputByDts);
        LIZ.append(", external surface:");
        LIZ.append(this.ex_surface);
        LIZ.append(", internal surface:");
        LIZ.append(this.surface);
        LIZ.append(" smoothOutput:");
        LIZ.append(this.settings.enableSmoothOutput);
        LIZ.append(" yuv mode:");
        LIZ.append(this.settings.enableYUVOutput);
        LIZ.append(" mustUseYUVoutput:");
        LIZ.append(this.mustUseYUVoutput);
        LIZ.append(", latencyInsensitiveMode:");
        LIZ.append(this.settings.latencyInsensitiveMode);
        LIZ.append(", enableRecreateByResolution:");
        LIZ.append(this.settings.enableRecreateByResolution);
        LIZ.append(", curEglContextNum:");
        LIZ.append(curEglContextNum);
        RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ));
        if (this.outputThread != null) {
            RXLogging.e("AndroidVideoDecoder", "initDecodeInternal called while the codec is already running");
            releaseSurface();
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i;
        this.height = i2;
        this.stride = i;
        this.sliceHeight = i2;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        this.inputFrameCount = 0L;
        this.outputFrameCount = 0L;
        this.dropDecodedFrameCount = 0L;
        this.callbackDecodedFrameCount = 0L;
        this.minFrameCache = -1L;
        this.currentFrameCache = -1L;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                initMediaFormat(createVideoFormat);
                int i3 = this.maxExSurfaceRecreateDecoderCount;
                if (i3 >= 2) {
                    this.ex_surface = null;
                }
                Surface surface = this.ex_surface;
                if (surface != null) {
                    this.maxExSurfaceRecreateDecoderCount = i3 + 1;
                    this.codec.configure(createVideoFormat, surface, null, 0);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("init codec done with external surface:");
                    LIZ2.append(this.ex_surface);
                    RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ2));
                } else {
                    this.codec.configure(createVideoFormat, this.surface, null, 0);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("init codec done with internal surface:");
                    LIZ3.append(this.surface);
                    RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ3));
                }
                this.codec.start();
            } catch (IllegalArgumentException | IllegalStateException unused) {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = this.codec.getCodecInfo().getCapabilitiesForType(this.codecType.mimeType());
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("current decoder SupportedHeights:");
                LIZ4.append(capabilitiesForType.getVideoCapabilities().getSupportedHeights());
                RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ4));
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("current decoder SupportedWidths:");
                LIZ5.append(capabilitiesForType.getVideoCapabilities().getSupportedWidths());
                RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ5));
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("current decoder SupportedFrameRates:");
                LIZ6.append(capabilitiesForType.getVideoCapabilities().getSupportedFrameRates());
                RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ6));
                if (!capabilitiesForType.getVideoCapabilities().getSupportedHeights().contains((Range<Integer>) Integer.valueOf(i2)) || !capabilitiesForType.getVideoCapabilities().getSupportedWidths().contains((Range<Integer>) Integer.valueOf(i))) {
                    VideoDecoder.Callback callback = this.callback;
                    VideoCodecStatus videoCodecStatus = VideoCodecStatus.MEDIACODEC_OUT_OF_RESOLUTION;
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("hardware decoder not support the resolution:");
                    LIZ7.append(i);
                    LIZ7.append("x");
                    LIZ7.append(i2);
                    callback.onMediaCodecStatus(videoCodecStatus, X1D.LIZIZ(LIZ7));
                    this.codec.release();
                    releaseSurface();
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append("initDecodeInternal err,decoder not support the resolution:");
                    LIZ8.append(i);
                    LIZ8.append("xheight, fallback software");
                    RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ8));
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
                RXLogging.e("AndroidVideoDecoder", "initDecode Argument err, try reset Argument and reconfig");
                this.callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_EXCEPTION, "initDecode Argument err, try reset Argument and reconfig");
                MediaFormat createVideoFormat2 = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                if (this.sharedContext == null) {
                    createVideoFormat2.setInteger("color-format", this.colorFormat);
                }
                try {
                    this.codec.configure(createVideoFormat2, this.surface, null, 0);
                    this.codec.start();
                } catch (IllegalArgumentException | IllegalStateException e) {
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append("initDecode failed when retry config:");
                    LIZ9.append(e);
                    RXLogging.e("AndroidVideoDecoder", X1D.LIZIZ(LIZ9));
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    this.callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_EXCEPTION, stringWriter.toString());
                    this.codec.release();
                    releaseSurface();
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            }
            this.running = true;
            this.maxExSurfaceRecreateDecoderCount = 0;
            Thread createOutputThread = createOutputThread();
            this.outputThread = createOutputThread;
            createOutputThread.start();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            this.callback.onDecoderInited(elapsedRealtime2);
            StringBuilder LIZ10 = X1D.LIZ();
            LIZ10.append("initDecodeInternal done,init video decoder cost time:");
            LIZ10.append(elapsedRealtime2);
            RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ10));
            if (this.ex_surface != null) {
                if (this.surface == null) {
                    this.usingInternalSurfaceLast = false;
                }
            } else if (this.surface != null && !this.usingInternalSurfaceLast) {
                this.usingInternalSurfaceLast = true;
                this.callback.onMediaCodecStatus(VideoCodecStatus.USING_INTERNAL_SURFACE, "using internal surface");
            }
            return VideoCodecStatus.OK;
        } catch (IOException | IllegalArgumentException | IllegalStateException | NullPointerException unused2) {
            StringBuilder LIZ11 = X1D.LIZ();
            LIZ11.append("Cannot create media decoder ");
            LIZ11.append(this.codecName);
            RXLogging.e("AndroidVideoDecoder", X1D.LIZIZ(LIZ11));
            releaseSurface();
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private VideoCodecStatus reinitDecode(int i, int i2) {
        VideoCodecStatus initDecodeInternal;
        VideoCodecStatus releaseInternal = releaseInternal();
        if (!this.settings.enableSurfaceTextureReuse) {
            releaseSurface();
        }
        if (releaseInternal != VideoCodecStatus.OK) {
            RXLogging.e("AndroidVideoDecoder", "releaseInternal err");
            return releaseInternal;
        }
        int i3 = 0;
        do {
            initDecodeInternal = initDecodeInternal(i, i2);
            if (VideoCodecStatus.OK == initDecodeInternal) {
                break;
            }
            releaseSurface();
            i3++;
        } while (i3 < 5);
        return initDecodeInternal;
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i, int i2) {
        return JavaI420Buffer.allocate(i, i2);
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.callback = callback;
        this.settings = settings;
        return VideoCodecStatus.OK;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus setPrivateParam(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("got android hardware decoder setPrivateParam key:");
        LIZ.append(str);
        LIZ.append(" value:");
        LIZ.append(str2);
        RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ));
        if (str.equals("bytertc.hw.decoder.maxeglnum")) {
            if (isNumeric(str2)) {
                maxEglContextNum = CastIntegerProtector.parseInt(str2);
            }
            RXLogging.w("AndroidVideoDecoder", "this is not a param set to HW Decoder, only for control.");
            return VideoCodecStatus.OK;
        }
        this.privateParams.put(str, str2);
        return VideoCodecStatus.OK;
    }

    private void setIntegerParam(MediaFormat mediaFormat, String str, Integer num) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (isNumeric(entry.getValue())) {
                    mediaFormat.setInteger(entry.getKey(), CastIntegerProtector.parseInt(entry.getValue()));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("the decoder params ");
                    LIZ.append(entry.getKey());
                    LIZ.append(" is coverd by vpaas with value:");
                    LIZ.append(entry.getValue());
                    RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ));
                    this.privateParams.remove(str);
                    return;
                }
                this.privateParams.remove(str);
                if (entry.getValue().length() > 0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("the decoder params ");
                    LIZ2.append(entry.getKey());
                    LIZ2.append(" set by vpaas is invalid with value:");
                    LIZ2.append(entry.getValue());
                    LIZ2.append(",skip it");
                    RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ2));
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("the decoder params ");
                    LIZ3.append(entry.getKey());
                    LIZ3.append(" is disabled by vpaas,skip it");
                    RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ3));
                    return;
                }
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("decoder int params has been set with Key:");
        LIZ4.append(str);
        LIZ4.append(" Value:");
        LIZ4.append(num);
        RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ4));
        mediaFormat.setInteger(str, num.intValue());
    }

    private void setStringParam(MediaFormat mediaFormat, String str, String str2) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (entry.getValue().length() > 0) {
                    mediaFormat.setString(entry.getKey(), entry.getValue());
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("the decoder params ");
                    LIZ.append(entry.getKey());
                    LIZ.append(" is coverd by vpaas with value:");
                    LIZ.append(entry.getValue());
                    RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ));
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("the decoder params ");
                    LIZ2.append(entry.getKey());
                    LIZ2.append(" is disabled by vpaas,skip it");
                    RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ2));
                }
                this.privateParams.remove(str);
                return;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("decoder string params has been set with Key:");
        LIZ3.append(str);
        LIZ3.append(" Value:");
        LIZ3.append(str2);
        RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ3));
        mediaFormat.setString(str, str2);
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, RXVideoCodecStandard rXVideoCodecStandard, int i, EglBase.Context context) {
        if (isSupportedColorFormat(i)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ctor name: ");
            LIZ.append(str);
            LIZ.append(" type: ");
            LIZ.append(rXVideoCodecStandard);
            LIZ.append(" color format: ");
            LIZ.append(i);
            LIZ.append(" context: ");
            LIZ.append(context);
            RXLogging.w("AndroidVideoDecoder", X1D.LIZIZ(LIZ));
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
            this.codecName = str;
            this.codecType = rXVideoCodecStandard;
            this.colorFormat = i;
            this.sharedContext = context;
            this.width = 0;
            this.height = 0;
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Unsupported color format: ");
        LIZ2.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5;
        if (i % 2 == 0) {
            int i6 = (i3 + 1) / 2;
            int i7 = i2 % 2;
            if (i7 == 0) {
                i5 = (i4 + 1) / 2;
            } else {
                i5 = i4 / 2;
            }
            int i8 = i / 2;
            int i9 = i * i4;
            int i10 = i * i2;
            int i11 = i8 * i5;
            int i12 = i10 + i11;
            int i13 = i10 + ((i8 * i2) / 2);
            int i14 = i11 + i13;
            VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i3, i4);
            if (allocateI420Buffer == null) {
                return null;
            }
            byteBuffer.limit(i9);
            byteBuffer.position(0);
            copyPlane(byteBuffer.slice(), i, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i3, i4);
            byteBuffer.limit(i12);
            byteBuffer.position(i10);
            copyPlane(byteBuffer.slice(), i8, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i6, i5);
            if (i7 == 1) {
                byteBuffer.position(i10 + ((i5 - 1) * i8));
                ByteBuffer dataU = allocateI420Buffer.getDataU();
                dataU.position(allocateI420Buffer.getStrideU() * i5);
                dataU.put(byteBuffer);
            }
            byteBuffer.limit(i14);
            byteBuffer.position(i13);
            copyPlane(byteBuffer.slice(), i8, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i6, i5);
            if (i7 == 1) {
                byteBuffer.position(i13 + (i8 * (i5 - 1)));
                ByteBuffer dataV = allocateI420Buffer.getDataV();
                dataV.position(allocateI420Buffer.getStrideV() * i5);
                dataV.put(byteBuffer);
            }
            return allocateI420Buffer;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Stride is not divisible by two: ");
        LIZ.append(i);
        throw new AssertionError(X1D.LIZIZ(LIZ));
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new NV12Buffer(i3, i4, i, i2, byteBuffer, null).toI420();
    }

    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.nativeCopyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }
}
