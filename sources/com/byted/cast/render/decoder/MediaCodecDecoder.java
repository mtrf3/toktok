package com.byted.cast.render.decoder;

import X.X1D;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.render.MediaRenderState;
import com.byted.cast.mediacommon.render.parameters.CodecId;
import com.byted.cast.mediacommon.render.parameters.MediaRenderErrorCode;
import com.byted.cast.render.jitterbuffer.VideoJitterBuffer;
import com.byted.cast.render.utils.Logger;
import com.byted.cast.render.utils.Utils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class MediaCodecDecoder implements IMediaDecoder {
    public static int instanceNum;
    public String TAG;
    public int audioProfile;
    public final CodecId codecId;
    public DecodeThread decodeThread;
    public String decoderName;
    public int isADTS;
    public boolean isInit;
    public boolean isNeedCodec;
    public boolean isNeedResetDeocder;
    public boolean isVideo;
    public IMediaDecoderListener listener;
    public MediaCodec mediaCodec;
    public String mime;
    public RenderThread renderThread;
    public Surface surface;
    public final String userId;
    public VideoJitterBuffer videoJitterBuffer;
    public int width = 1920;
    public int height = 1080;
    public int fps = 30;
    public int channels = 2;
    public int sampleRate = 48000;
    public int samplePerFrame = 1024;
    public final Object renderLock = new Object();
    public final Object decodeLock = new Object();
    public MediaRenderState state = MediaRenderState.STATE_UNINITIALIZED;
    public final ConcurrentSkipListMap<Long, byte[]> packets = new ConcurrentSkipListMap<>();
    public SortedSet<Long> mPtsSet = new ConcurrentSkipListSet();
    public boolean inputWait = false;
    public boolean outputWait = false;
    public boolean isSendIdr = false;
    public long lastRecvTime = 0;
    public final Map<Long, Long> decodeTimeMaps = new HashMap();
    public int decodingFrames = 0;
    public long decodeLogTime = 0;
    public long sumDecodeTimes = 0;
    public long decodeFrames = 0;
    public long recvLogTime = 0;
    public long sumRecvTimes = 0;
    public long recvFrames = 0;
    public long sendFirstIFrameTime = 0;

    /* loaded from: classes29.dex */
    public class DecodeThread extends PthreadThread {
        public int errorNumbers;
        public boolean isRunning;
        public int waitTimes;

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com_byted_cast_render_decoder_MediaCodecDecoder$DecodeThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public synchronized void stopThread() {
            this.isRunning = false;
        }

        public void com_byted_cast_render_decoder_MediaCodecDecoder$DecodeThread__run$___twin___() {
            MediaCodec mediaCodec;
            Logger.i(MediaCodecDecoder.this.TAG, "DecodeThread start");
            while (this.isRunning) {
                try {
                    if (MediaCodecDecoder.this.packets.isEmpty()) {
                        synchronized (MediaCodecDecoder.this.decodeLock) {
                            MediaCodecDecoder mediaCodecDecoder = MediaCodecDecoder.this;
                            mediaCodecDecoder.inputWait = true;
                            mediaCodecDecoder.decodeLock.wait(500L);
                            int i = this.waitTimes + 1;
                            this.waitTimes = i;
                            if (i > 10) {
                                Logger.w(MediaCodecDecoder.this.TAG, "long time no input data");
                                this.waitTimes = 0;
                            }
                            MediaCodecDecoder.this.inputWait = false;
                        }
                    } else {
                        MediaCodecDecoder mediaCodecDecoder2 = MediaCodecDecoder.this;
                        if (mediaCodecDecoder2.isInit && (mediaCodec = mediaCodecDecoder2.mediaCodec) != null) {
                            this.waitTimes = 0;
                            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(100000L);
                            if (dequeueInputBuffer >= 0) {
                                ByteBuffer inputBuffer = MediaCodecDecoder.this.mediaCodec.getInputBuffer(dequeueInputBuffer);
                                long longValue = MediaCodecDecoder.this.packets.firstKey().longValue();
                                Map.Entry<Long, byte[]> pollFirstEntry = MediaCodecDecoder.this.packets.pollFirstEntry();
                                Objects.requireNonNull(pollFirstEntry);
                                byte[] value = pollFirstEntry.getValue();
                                MediaCodecDecoder.this.decodeTimeMaps.put(Long.valueOf(longValue), Long.valueOf(System.currentTimeMillis()));
                                if (inputBuffer != null) {
                                    inputBuffer.put(value, 0, value.length);
                                }
                                MediaCodecDecoder.this.mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, value.length, longValue, 0);
                                MediaCodecDecoder.this.decodingFrames++;
                                this.errorNumbers = 0;
                            } else {
                                int i2 = this.errorNumbers + 1;
                                this.errorNumbers = i2;
                                if (i2 > 100) {
                                    Logger.w(MediaCodecDecoder.this.TAG, "cannot send pkt to mediacodec");
                                    this.errorNumbers = 0;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    MediaCodecDecoder.this.listener.OnError(MediaRenderErrorCode.MEDIARENDER_DECODE_ERROR, "processThread error");
                }
            }
            Logger.i(MediaCodecDecoder.this.TAG, "DecoderThread stop");
        }

        public DecodeThread() {
            super("MediaCodecDecoder$DecodeThread");
            this.isRunning = true;
        }

        public static void com_byted_cast_render_decoder_MediaCodecDecoder$DecodeThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(DecodeThread decodeThread) {
            boolean LIZ;
            try {
                decodeThread.com_byted_cast_render_decoder_MediaCodecDecoder$DecodeThread__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* loaded from: classes29.dex */
    public class RenderThread extends PthreadThread {
        public int errorNumber;
        public boolean isFirstFrame;
        public boolean isRunning;

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com_byted_cast_render_decoder_MediaCodecDecoder$RenderThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public synchronized void stopThread() {
            this.isRunning = false;
        }

        public void com_byted_cast_render_decoder_MediaCodecDecoder$RenderThread__run$___twin___() {
            long j;
            boolean z;
            int i;
            int i2;
            int integer;
            Logger.i(MediaCodecDecoder.this.TAG, "RenderThread start");
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                if (!this.isRunning) {
                    break;
                }
                try {
                    MediaCodecDecoder mediaCodecDecoder = MediaCodecDecoder.this;
                    if (!mediaCodecDecoder.isInit) {
                        synchronized (mediaCodecDecoder.renderLock) {
                            MediaCodecDecoder mediaCodecDecoder2 = MediaCodecDecoder.this;
                            mediaCodecDecoder2.outputWait = true;
                            mediaCodecDecoder2.renderLock.wait();
                            MediaCodecDecoder.this.outputWait = false;
                        }
                    } else {
                        MediaCodec mediaCodec = mediaCodecDecoder.mediaCodec;
                        if (mediaCodec == null) {
                            Logger.e(mediaCodecDecoder.TAG, "dequeueOutputBuffer failed, mediacodec is null");
                            MediaCodecDecoder.this.listener.OnError(MediaRenderErrorCode.MEDIARENDER_DECODE_ERROR, "mediacodec is null");
                            break;
                        }
                        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 1000000 / mediaCodecDecoder.fps);
                        String str = MediaCodecDecoder.this.TAG;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("dequeueOutputBuffer outputBufferId=");
                        LIZ.append(dequeueOutputBuffer);
                        LIZ.append(", info.presentationTimeUs=");
                        LIZ.append(bufferInfo.presentationTimeUs);
                        Logger.v(str, X1D.LIZIZ(LIZ));
                        if (dequeueOutputBuffer >= 0) {
                            ByteBuffer outputBuffer = MediaCodecDecoder.this.mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                            long currentTimeMillis = System.currentTimeMillis();
                            if (this.isFirstFrame) {
                                MediaCodecDecoder mediaCodecDecoder3 = MediaCodecDecoder.this;
                                long j2 = currentTimeMillis - mediaCodecDecoder3.sendFirstIFrameTime;
                                String str2 = mediaCodecDecoder3.TAG;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("firstFrameDecodeTime: ");
                                LIZ2.append(j2);
                                LIZ2.append(", mediacodec frameQueue size: ");
                                LIZ2.append(MediaCodecDecoder.this.decodingFrames);
                                Logger.i(str2, X1D.LIZIZ(LIZ2));
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("userId", MediaCodecDecoder.this.userId);
                                jSONObject.put("firstFrameDecodeTime", j2);
                                MediaMonitor.onSinkMonitor("MediaRender_FirstDecodedFrame", jSONObject.toString());
                                this.isFirstFrame = false;
                            }
                            MediaCodecDecoder mediaCodecDecoder4 = MediaCodecDecoder.this;
                            if (mediaCodecDecoder4.surface != null || outputBuffer == null || (i = bufferInfo.size) <= 0) {
                                mediaCodecDecoder4.listener.OnAVFrameAvailable(null, bufferInfo.presentationTimeUs);
                            } else {
                                byte[] bArr = new byte[i];
                                outputBuffer.get(bArr, 0, i);
                                outputBuffer.clear();
                                MediaCodecDecoder.this.listener.OnAVFrameAvailable(bArr, bufferInfo.presentationTimeUs);
                            }
                            VideoJitterBuffer videoJitterBuffer = MediaCodecDecoder.this.videoJitterBuffer;
                            if (videoJitterBuffer != null && this.isRunning) {
                                j = videoJitterBuffer.doRender(bufferInfo.presentationTimeUs);
                            } else {
                                j = 0;
                            }
                            MediaCodecDecoder mediaCodecDecoder5 = MediaCodecDecoder.this;
                            mediaCodecDecoder5.decodingFrames--;
                            Long l = mediaCodecDecoder5.decodeTimeMaps.get(Long.valueOf(bufferInfo.presentationTimeUs));
                            if (l != null) {
                                long longValue = currentTimeMillis - l.longValue();
                                MediaCodecDecoder mediaCodecDecoder6 = MediaCodecDecoder.this;
                                long j3 = mediaCodecDecoder6.decodeFrames + 1;
                                mediaCodecDecoder6.decodeFrames = j3;
                                long j4 = mediaCodecDecoder6.sumDecodeTimes + longValue;
                                mediaCodecDecoder6.sumDecodeTimes = j4;
                                if (j4 / j3 > 200 && currentTimeMillis - mediaCodecDecoder6.decodeLogTime > 5000) {
                                    long j5 = j4 / j3;
                                    String str3 = mediaCodecDecoder6.TAG;
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("decode too slow, 5s average decodeTime is ");
                                    LIZ3.append(j5);
                                    LIZ3.append("ms, decode frames is ");
                                    LIZ3.append(MediaCodecDecoder.this.decodeFrames);
                                    LIZ3.append(", mediacodec save frames: ");
                                    LIZ3.append(MediaCodecDecoder.this.decodingFrames);
                                    LIZ3.append(", wait decode packet is ");
                                    LIZ3.append(MediaCodecDecoder.this.packets.size());
                                    Logger.w(str3, X1D.LIZIZ(LIZ3));
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("userId", MediaCodecDecoder.this.userId);
                                    jSONObject2.put("averDecodeTime", j5);
                                    jSONObject2.put("decodeFrames", MediaCodecDecoder.this.decodeFrames);
                                    jSONObject2.put("mediacodecSaveFrames", MediaCodecDecoder.this.decodingFrames);
                                    jSONObject2.put("waitDecodePackets", MediaCodecDecoder.this.packets.size());
                                    MediaMonitor.onSinkMonitor("MediaRender_DecodeTime", jSONObject2.toString());
                                    MediaCodecDecoder mediaCodecDecoder7 = MediaCodecDecoder.this;
                                    mediaCodecDecoder7.decodeLogTime = currentTimeMillis;
                                    mediaCodecDecoder7.decodeFrames = 0L;
                                    mediaCodecDecoder7.sumDecodeTimes = 0L;
                                }
                                MediaCodecDecoder.this.decodeTimeMaps.remove(Long.valueOf(bufferInfo.presentationTimeUs));
                            }
                            Surface surface = MediaCodecDecoder.this.surface;
                            if (surface != null && !surface.isValid()) {
                                Logger.e(MediaCodecDecoder.this.TAG, "surface is inValid!!!");
                                MediaCodecDecoder.this.listener.OnError(MediaRenderErrorCode.MEDIARENDER_SURFACE_ERROR, "renderThread surface is inValid");
                            }
                            this.errorNumber = 0;
                            MediaCodec mediaCodec2 = MediaCodecDecoder.this.mediaCodec;
                            if (mediaCodec2 != null) {
                                if (j <= 0) {
                                    if (bufferInfo.size != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer, z);
                                } else {
                                    mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer, j);
                                }
                                IMediaDecoderListener iMediaDecoderListener = MediaCodecDecoder.this.listener;
                                if (iMediaDecoderListener != null) {
                                    iMediaDecoderListener.OnAVFrameRendered(null, bufferInfo.presentationTimeUs);
                                }
                            }
                        } else if (dequeueOutputBuffer == -2) {
                            MediaFormat outputFormat = MediaCodecDecoder.this.mediaCodec.getOutputFormat();
                            if (outputFormat.containsKey("width") && outputFormat.containsKey("height")) {
                                MediaCodecDecoder mediaCodecDecoder8 = MediaCodecDecoder.this;
                                int i3 = mediaCodecDecoder8.width;
                                int i4 = mediaCodecDecoder8.height;
                                if (Build.VERSION.SDK_INT >= 23 && outputFormat.containsKey("stride") && outputFormat.containsKey("slice-height")) {
                                    i3 = outputFormat.getInteger("stride");
                                    i4 = outputFormat.getInteger("slice-height");
                                }
                                String str4 = MediaCodecDecoder.this.TAG;
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("mediacodec videoSizeChanged format: width: ");
                                LIZ4.append(outputFormat.getInteger("width"));
                                LIZ4.append(", height: ");
                                LIZ4.append(outputFormat.getInteger("height"));
                                LIZ4.append(", colorFormat: 0x");
                                LIZ4.append(Integer.toHexString(outputFormat.getInteger("color-format")));
                                LIZ4.append(", stride: ");
                                LIZ4.append(i3);
                                LIZ4.append(", sliceHeight: ");
                                LIZ4.append(i4);
                                Logger.i(str4, X1D.LIZIZ(LIZ4));
                                if (outputFormat.containsKey("color-format") && ((integer = outputFormat.getInteger("color-format")) == 2135033992 || integer == 17 || integer == 18 || integer == 19 || integer == 20 || integer == 21 || integer == 39)) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                MediaCodecDecoder mediaCodecDecoder9 = MediaCodecDecoder.this;
                                mediaCodecDecoder9.listener.OnVideoSizeChanged(mediaCodecDecoder9.width, mediaCodecDecoder9.height, i3, i4, i2);
                            }
                            if (outputFormat.containsKey("channel-count") && outputFormat.containsKey("sample-rate") && outputFormat.containsKey("bit-width")) {
                                String str5 = MediaCodecDecoder.this.TAG;
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("mediacodec audioSizeChanged sampleRate: ");
                                LIZ5.append(outputFormat.getInteger("sample-rate"));
                                LIZ5.append(", channels: ");
                                LIZ5.append(outputFormat.getInteger("channel-count"));
                                LIZ5.append(", bitwidth: ");
                                LIZ5.append(outputFormat.getInteger("bit-width"));
                                Logger.i(str5, X1D.LIZIZ(LIZ5));
                            }
                        } else if (dequeueOutputBuffer == -1) {
                            int i5 = this.errorNumber + 1;
                            this.errorNumber = i5;
                            if (i5 > 200) {
                                String str6 = MediaCodecDecoder.this.TAG;
                                StringBuilder LIZ6 = X1D.LIZ();
                                LIZ6.append(MediaCodecDecoder.this.mime);
                                LIZ6.append(": always no outFrame");
                                Logger.w(str6, X1D.LIZIZ(LIZ6));
                                this.errorNumber = 0;
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    MediaCodecDecoder.this.listener.OnError(MediaRenderErrorCode.MEDIARENDER_DECODE_ERROR, "renderThread error");
                }
            }
            Logger.i(MediaCodecDecoder.this.TAG, "RenderThread stop");
        }

        public RenderThread() {
            super("MediaCodecDecoder$RenderThread");
            this.isRunning = true;
            this.isFirstFrame = true;
        }

        public static void com_byted_cast_render_decoder_MediaCodecDecoder$RenderThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RenderThread renderThread) {
            boolean LIZ;
            try {
                renderThread.com_byted_cast_render_decoder_MediaCodecDecoder$RenderThread__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    private void resetDecoder() {
        this.isInit = false;
        this.packets.clear();
        this.mPtsSet.clear();
        try {
            if (this.mediaCodec == null) {
                return;
            }
            while (true) {
                if (!this.inputWait || !this.outputWait) {
                    Thread.sleep(2L);
                } else {
                    this.mediaCodec.reset();
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean deInit() {
        try {
            MediaCodec mediaCodec = this.mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e(this.TAG, "deInit, flush Error");
        }
        try {
            try {
                MediaCodec mediaCodec2 = this.mediaCodec;
                if (mediaCodec2 != null) {
                    mediaCodec2.stop();
                }
                MediaCodec mediaCodec3 = this.mediaCodec;
                if (mediaCodec3 != null) {
                    mediaCodec3.release();
                }
                this.mediaCodec = null;
                this.isInit = false;
                this.state = MediaRenderState.STATE_UNINITIALIZED;
                instanceNum--;
                Logger.i(this.TAG, "deInit: success");
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                Logger.e(this.TAG, "deInit, stop Error");
                MediaCodec mediaCodec4 = this.mediaCodec;
                if (mediaCodec4 != null) {
                    mediaCodec4.release();
                }
                this.mediaCodec = null;
                this.isInit = false;
                this.state = MediaRenderState.STATE_UNINITIALIZED;
                instanceNum--;
                Logger.i(this.TAG, "deInit: success");
                return false;
            }
        } catch (Throwable th) {
            MediaCodec mediaCodec5 = this.mediaCodec;
            if (mediaCodec5 != null) {
                mediaCodec5.release();
            }
            this.mediaCodec = null;
            this.isInit = false;
            this.state = MediaRenderState.STATE_UNINITIALIZED;
            instanceNum--;
            Logger.i(this.TAG, "deInit: success");
            throw th;
        }
    }

    @Override // com.byted.cast.render.decoder.IMediaDecoder
    public boolean start() {
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start mime: ");
        LIZ.append(this.mime);
        Logger.i(str, X1D.LIZIZ(LIZ));
        if (!this.isNeedCodec) {
            return true;
        }
        MediaRenderState mediaRenderState = this.state;
        MediaRenderState mediaRenderState2 = MediaRenderState.STATE_EXECUTING;
        if (mediaRenderState == mediaRenderState2) {
            Logger.e(this.TAG, "start failed, reason: isStarted");
            return true;
        }
        if (this.renderThread == null) {
            RenderThread renderThread = new RenderThread();
            this.renderThread = renderThread;
            renderThread.setPriority(10);
            this.renderThread.start();
        }
        if (this.decodeThread == null) {
            DecodeThread decodeThread = new DecodeThread();
            this.decodeThread = decodeThread;
            decodeThread.start();
        }
        this.state = mediaRenderState2;
        if (this.isInit) {
            return true;
        }
        if (this.isVideo) {
            if (initDecoder(false)) {
                String str2 = this.TAG;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("hw video decoder init success, resolution: ");
                LIZ2.append(this.width);
                LIZ2.append("x");
                LIZ2.append(this.height);
                Logger.d(str2, X1D.LIZIZ(LIZ2));
                return true;
            }
            String str3 = this.TAG;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("hw video decoder init failure, resolution: ");
            LIZ3.append(this.width);
            LIZ3.append("x");
            LIZ3.append(this.height);
            Logger.e(str3, X1D.LIZIZ(LIZ3));
            if (initDecoder(true)) {
                String str4 = this.TAG;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("sw video decoder init success, resolution: ");
                LIZ4.append(this.width);
                LIZ4.append("x");
                LIZ4.append(this.height);
                Logger.d(str4, X1D.LIZIZ(LIZ4));
                return true;
            }
            String str5 = this.TAG;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("sw video decoder init failure, resolution: ");
            LIZ5.append(this.width);
            LIZ5.append("x");
            LIZ5.append(this.height);
            Logger.e(str5, X1D.LIZIZ(LIZ5));
            this.listener.OnError(MediaRenderErrorCode.MEDIARENDER_INIT_ERROR, "init failed");
        } else {
            if (initDecoder(false)) {
                Logger.i(this.TAG, "hw audio decoder init success");
                return true;
            }
            Logger.i(this.TAG, "hw audio decoder init failure");
        }
        return false;
    }

    @Override // com.byted.cast.render.decoder.IMediaDecoder
    public boolean stop() {
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop, mime: ");
        LIZ.append(this.mime);
        Logger.i(str, X1D.LIZIZ(LIZ));
        if (!this.isNeedCodec || this.state != MediaRenderState.STATE_EXECUTING) {
            return true;
        }
        try {
            DecodeThread decodeThread = this.decodeThread;
            if (decodeThread != null) {
                decodeThread.stopThread();
                synchronized (this.decodeLock) {
                    this.decodeLock.notify();
                }
                this.decodeThread.join(100L);
                this.decodeThread = null;
            }
            RenderThread renderThread = this.renderThread;
            if (renderThread != null) {
                renderThread.stopThread();
                synchronized (this.decodeLock) {
                    this.decodeLock.notify();
                }
                this.renderThread.join(100L);
                this.renderThread = null;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.isSendIdr = false;
        synchronized (this.decodeLock) {
            this.packets.clear();
            this.mPtsSet.clear();
        }
        return deInit();
    }

    @Override // com.byted.cast.render.decoder.IMediaDecoder
    public MediaRenderState getState() {
        return this.state;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r1 != r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        com.byted.cast.render.utils.Logger.i(r9.TAG, "Feed I frame");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0049, code lost:
    
        if (r1 == com.byted.cast.mediacommon.render.parameters.CodecId.H265) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean checkInputData(byte[] r10) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.render.decoder.MediaCodecDecoder.checkInputData(byte[]):boolean");
    }

    private void configAudioFormat(MediaFormat mediaFormat) {
        mediaFormat.setInteger("channel-count", this.channels);
        mediaFormat.setInteger("sample-rate", this.sampleRate);
        mediaFormat.setInteger("is-adts", this.isADTS);
        mediaFormat.setInteger("aac-profile", this.audioProfile);
        int i = 4;
        byte[] bArr = new byte[4];
        CodecId codecId = this.codecId;
        if (codecId == CodecId.AACELD) {
            bArr[0] = -8;
            bArr[1] = -24;
            bArr[2] = 80;
            bArr[3] = 0;
        } else if (codecId == CodecId.AACLC) {
            bArr[0] = 17;
            bArr[1] = -112;
            i = 2;
        }
        mediaFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr, 0, i));
    }

    private void configVideoFormat(MediaFormat mediaFormat) {
        mediaFormat.setInteger("width", this.width);
        mediaFormat.setInteger("height", this.height);
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("config video width = ");
        LIZ.append(this.width);
        LIZ.append(", height = ");
        LIZ.append(this.height);
        Logger.i(str, X1D.LIZIZ(LIZ));
        mediaFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
        mediaFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
        mediaFormat.setInteger("vendor.low-latency.enable", 1);
        mediaFormat.setInteger("vdec-lowlatency", 1);
        mediaFormat.setInteger("need_hwcomposer", 0);
    }

    private boolean initDecoder(boolean z) {
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init: mime: ");
        LIZ.append(this.mime);
        Logger.i(str, X1D.LIZIZ(LIZ));
        if (this.mime == null) {
            this.listener.OnError(MediaRenderErrorCode.MEDIARENDER_INIT_ERROR, "no mime");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = new MediaCodecInfo.CodecCapabilities();
            if (instanceNum >= codecCapabilities.getMaxSupportedInstances()) {
                String str2 = this.TAG;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" max support instances is ");
                LIZ2.append(codecCapabilities.getMaxSupportedInstances());
                Logger.e(str2, X1D.LIZIZ(LIZ2));
            }
        }
        try {
            if (z & this.isVideo) {
                this.mediaCodec = MediaCodec.createDecoderByType("OMX.google.h264.decoder");
            } else {
                this.mediaCodec = MediaCodec.createDecoderByType(this.mime);
            }
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", this.mime);
            if (this.mime.contains("video")) {
                configVideoFormat(mediaFormat);
            } else if (this.mime.contains("audio")) {
                configAudioFormat(mediaFormat);
            }
            Surface surface = this.surface;
            if (surface != null && !surface.isValid()) {
                Logger.e(this.TAG, "surface is unValid!");
                this.listener.OnError(MediaRenderErrorCode.MEDIARENDER_SURFACE_ERROR, "surface is unValid");
                this.surface = null;
            }
            if (CheckFormat(this.mime, mediaFormat)) {
                this.mediaCodec.configure(mediaFormat, this.surface, (MediaCrypto) null, 0);
                this.mediaCodec.start();
                synchronized (this.renderLock) {
                    this.isInit = true;
                    this.renderLock.notifyAll();
                }
                instanceNum++;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("userId", this.userId);
                    jSONObject.put("decoderName", this.decoderName);
                    MediaMonitor.onSinkMonitor("MediaRender_InitDecoder", jSONObject.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Logger.i(this.TAG, "init: success!");
                return true;
            }
            Logger.e(this.TAG, "unsupported format, config failed");
            this.listener.OnError(MediaRenderErrorCode.MEDIARENDER_INIT_ERROR, "configure failed");
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            Logger.e(this.TAG, "mediacodec configure failed");
            this.listener.OnError(MediaRenderErrorCode.MEDIARENDER_INIT_ERROR, "configure failed");
            return false;
        }
    }

    @Override // com.byted.cast.render.decoder.IMediaDecoder
    public void setMediaDecoderListener(IMediaDecoderListener iMediaDecoderListener) {
        this.listener = iMediaDecoderListener;
    }

    public MediaCodecDecoder setSurface(Surface surface) {
        String str;
        if (surface != null && surface.isValid()) {
            this.surface = surface;
            str = "succ";
        } else {
            Logger.e(this.TAG, "[setSurface]: surface is unValid");
            str = "failed";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", this.userId);
            jSONObject.put("result", str);
            MediaMonitor.onSinkMonitor("MediaRender_SetSurface", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public MediaCodecDecoder setVideoJitterBuffer(VideoJitterBuffer videoJitterBuffer) {
        this.videoJitterBuffer = videoJitterBuffer;
        return this;
    }

    public MediaCodecDecoder(String str, CodecId codecId) {
        this.TAG = "MediaCodecDecoder";
        this.audioProfile = 39;
        this.isNeedCodec = true;
        this.isVideo = true;
        this.isNeedResetDeocder = false;
        this.userId = str;
        this.codecId = codecId;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("_");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (codecId == CodecId.H264) {
            this.mime = "video/avc";
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ);
            LIZ2.append("/video");
            LIZIZ = X1D.LIZIZ(LIZ2);
            this.isNeedCodec = true;
            this.isVideo = true;
        } else if (codecId == CodecId.H265) {
            this.mime = "video/hevc";
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZIZ);
            LIZ3.append("/video");
            LIZIZ = X1D.LIZIZ(LIZ3);
            this.isNeedCodec = true;
            this.isVideo = true;
        } else if (codecId == CodecId.AACLC) {
            this.mime = "audio/mp4a-latm";
            this.audioProfile = 2;
            this.isADTS = 1;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LIZIZ);
            LIZ4.append("/audio");
            LIZIZ = X1D.LIZIZ(LIZ4);
            this.isNeedCodec = true;
            this.isVideo = false;
        } else if (codecId == CodecId.AACELD) {
            this.mime = "audio/mp4a-latm";
            this.audioProfile = 39;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(LIZIZ);
            LIZ5.append("/audio");
            LIZIZ = X1D.LIZIZ(LIZ5);
            this.isNeedCodec = true;
            this.isVideo = false;
        } else if (codecId == CodecId.PCM) {
            this.mime = "";
            this.isNeedCodec = false;
            this.isVideo = false;
        } else {
            Logger.i(this.TAG, "unsupported CodecId");
            return;
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append(this.TAG);
        LIZ6.append(LIZIZ);
        this.TAG = X1D.LIZIZ(LIZ6);
        if (Utils.getProperty("ro.product.name", "").equals("CHM-TL00")) {
            Logger.i(this.TAG, "device need reset decoder");
            this.isNeedResetDeocder = true;
        }
    }

    public boolean CheckFormat(String str, MediaFormat mediaFormat) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder() && Arrays.binarySearch(mediaCodecInfo.getSupportedTypes(), str) >= 0) {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                if (capabilitiesForType.isFormatSupported(mediaFormat)) {
                    String str2 = this.TAG;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("find Codec: ");
                    LIZ.append(mediaCodecInfo.getName());
                    Logger.i(str2, X1D.LIZIZ(LIZ));
                    if (this.isVideo && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
                        String str3 = this.TAG;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Codec: ");
                        LIZ2.append(mediaCodecInfo.getName());
                        LIZ2.append(" ,video resolution format -> maxWidth: ");
                        LIZ2.append(videoCapabilities.getSupportedWidths().getUpper());
                        LIZ2.append(" ,maxHeight: ");
                        LIZ2.append(videoCapabilities.getSupportedHeights().getUpper());
                        LIZ2.append(" ,minWidth: ");
                        LIZ2.append(videoCapabilities.getSupportedWidths().getLower());
                        LIZ2.append(" ,minHeight: ");
                        LIZ2.append(videoCapabilities.getSupportedHeights().getLower());
                        Logger.i(str3, X1D.LIZIZ(LIZ2));
                    }
                    this.decoderName = mediaCodecInfo.getName();
                    return true;
                }
                if (str.contains("video")) {
                    String str4 = this.TAG;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Codec: ");
                    LIZ3.append(mediaCodecInfo.getName());
                    LIZ3.append(" ,video resolution is not support, setWidth: ");
                    LIZ3.append(mediaFormat.getInteger("width"));
                    LIZ3.append(" ,setHeight: ");
                    LIZ3.append(mediaFormat.getInteger("height"));
                    LIZ3.append(" -> maxWidth: ");
                    LIZ3.append(capabilitiesForType.getVideoCapabilities().getSupportedWidths().getUpper());
                    LIZ3.append(" ,maxHeight: ");
                    LIZ3.append(capabilitiesForType.getVideoCapabilities().getSupportedHeights().getUpper());
                    LIZ3.append(" ,minWidth: ");
                    LIZ3.append(capabilitiesForType.getVideoCapabilities().getSupportedWidths().getLower());
                    LIZ3.append(" ,minHeight: ");
                    LIZ3.append(capabilitiesForType.getVideoCapabilities().getSupportedHeights().getLower());
                    Logger.w(str4, X1D.LIZIZ(LIZ3));
                } else {
                    String str5 = this.TAG;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("audio format is not support, sampleRate: ");
                    LIZ4.append(mediaFormat.getInteger("sample-rate"));
                    LIZ4.append(" ,channel: ");
                    LIZ4.append(mediaFormat.getInteger("channel-count"));
                    LIZ4.append(" ,supported sampleRate: ");
                    LIZ4.append(capabilitiesForType.getAudioCapabilities().getSupportedSampleRates().toString());
                    LIZ4.append(" ,channel: ");
                    LIZ4.append(capabilitiesForType.getAudioCapabilities().getMaxInputChannelCount());
                    Logger.w(str5, X1D.LIZIZ(LIZ4));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.byted.cast.render.decoder.IMediaDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean sendPacket(byte[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.render.decoder.MediaCodecDecoder.sendPacket(byte[], long):boolean");
    }

    public MediaCodecDecoder config_video_parameters(int i, int i2, int i3) {
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[config_video_parameters]: width = ");
        LIZ.append(i);
        LIZ.append(", height = ");
        LIZ.append(i2);
        LIZ.append(", fps = ");
        LIZ.append(i3);
        Logger.i(str, X1D.LIZIZ(LIZ));
        this.width = i;
        this.height = i2;
        if (i3 == 0) {
            i3 = 30;
        }
        this.fps = i3;
        return this;
    }

    public MediaCodecDecoder config_audio_parameters(int i, int i2, int i3, int i4) {
        this.sampleRate = i;
        this.channels = i2;
        this.samplePerFrame = (i4 / i2) / (i3 / 8);
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[config_audio_parameters]: sampleRate = ");
        LIZ.append(i);
        LIZ.append(", channels = ");
        LIZ.append(i2);
        LIZ.append(", bitwidth = ");
        LIZ.append(i3);
        LIZ.append(", frameSize = ");
        LIZ.append(i4);
        LIZ.append(", samplePerFrame = ");
        LIZ.append(this.samplePerFrame);
        Logger.i(str, X1D.LIZIZ(LIZ));
        return this;
    }
}
