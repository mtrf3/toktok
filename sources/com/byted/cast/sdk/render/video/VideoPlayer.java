package com.byted.cast.sdk.render.video;

import X.X1D;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.sdk.IRTCEngineEventListener;
import com.byted.cast.sdk.RTCSetting;
import com.byted.cast.sdk.utils.Utils;

/* loaded from: classes29.dex */
public class VideoPlayer implements VideoJitterBufferCallback {
    public boolean bInited;
    public ContextManager.CastContext mCastContext;
    public RTCSetting.VCODEC_ID mCodecId;
    public long mFrameIndexIn;
    public FrameMap mFrameMap;
    public golomb mGolomb;
    public int mHeight;
    public IRTCEngineEventListener mListener;
    public CastLogger mLogger;
    public MediaCodec mMediaCodec;
    public String mUserId;
    public IVideoFrameListener mVideoFrameListener;
    public boolean mWaitNextIDR;
    public int mWidth;

    public void startPlay() {
        this.mLogger.i("VideoPlayer", "startPlay...");
    }

    public void stopPlay() {
        this.mLogger.i("VideoPlayer", "stopPlay...");
        VideoJitterBuffer.getInstance().stop();
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.mMediaCodec = null;
        }
        this.bInited = false;
    }

    public boolean isInit() {
        return this.bInited;
    }

    @Override // com.byted.cast.sdk.render.video.VideoJitterBufferCallback
    public void onOutputFrame(long j) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onOutputFrame, pts:");
        LIZ.append(j);
        castLogger.i("VideoPlayer", X1D.LIZIZ(LIZ));
        if (this.mVideoFrameListener != null) {
            long findOnly = this.mFrameMap.findOnly(j);
            if (findOnly < 0) {
                CastLogger castLogger2 = this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onOutputFrame, Ignore output buffer because unknown frameIndex. pts=");
                LIZ2.append(j);
                castLogger2.e("VideoPlayer", X1D.LIZIZ(LIZ2));
                return;
            }
            this.mVideoFrameListener.onDecoded(this.mUserId, findOnly);
        }
    }

    @Override // com.byted.cast.sdk.render.video.VideoJitterBufferCallback
    public void onRenderFrame(long j) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRenderFrame, pts:");
        LIZ.append(j);
        castLogger.i("VideoPlayer", X1D.LIZIZ(LIZ));
        if (this.mVideoFrameListener != null) {
            long find = this.mFrameMap.find(j);
            if (find < 0) {
                CastLogger castLogger2 = this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onRenderFrame, Ignore output buffer because unknown frameIndex. pts=");
                LIZ2.append(j);
                castLogger2.e("VideoPlayer", X1D.LIZIZ(LIZ2));
                return;
            }
            this.mVideoFrameListener.onRendered(this.mUserId, find);
        }
    }

    public void setVideoFrameListener(IVideoFrameListener iVideoFrameListener) {
        this.mVideoFrameListener = iVideoFrameListener;
    }

    private void pushInputBuffer(long j, long j2) {
        IVideoFrameListener iVideoFrameListener = this.mVideoFrameListener;
        if (iVideoFrameListener != null && j > 0) {
            iVideoFrameListener.onDecodeIn(this.mUserId, j2);
            this.mFrameMap.put(j, j2);
        }
    }

    @Override // com.byted.cast.sdk.render.video.VideoJitterBufferCallback
    public void onVideoSize(int i, int i2) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoSize, w=");
        LIZ.append(i);
        LIZ.append(" h=");
        LIZ.append(i2);
        castLogger.i("VideoPlayer", X1D.LIZIZ(LIZ));
    }

    public void queueBuffer(byte[] bArr, long j) {
        SPS Parse = this.mGolomb.Parse(bArr, this.mCodecId);
        if (Parse.bVaild) {
            int i = this.mWidth;
            int i2 = Parse.width;
            if (i != i2 || this.mHeight != Parse.height) {
                this.mWidth = i2;
                int i3 = Parse.height;
                this.mHeight = i3;
                this.mListener.OnVideoSizeChanged(this.mUserId, i2, i3, 0);
            }
        }
        if (this.mMediaCodec == null) {
            this.mLogger.e("VideoPlayer", "dequeueInputBuffer, but mMediaCodec is null");
            return;
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoJitterBuffer queueBuffer...dataLen=");
        LIZ.append(bArr.length);
        LIZ.append(" pts=");
        LIZ.append(j);
        LIZ.append(" sps.bVaild=");
        LIZ.append(Parse.bVaild);
        castLogger.v("VideoPlayer", X1D.LIZIZ(LIZ));
        long j2 = j * 1000;
        VideoJitterBuffer.getInstance().append(bArr, j2, Parse.bVaild);
        if (this.mVideoFrameListener != null) {
            NAL nal = new NAL(bArr, bArr.length, this.mCodecId);
            NAL.detectNALType(nal);
            int i4 = nal.type;
            if (i4 == 7) {
                this.mWaitNextIDR = false;
                CastLogger castLogger2 = this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Feed codec config. Size=");
                LIZ2.append(nal.length);
                LIZ2.append(", last FrameIndex=");
                LIZ2.append(this.mFrameIndexIn);
                castLogger2.i("VideoPlayer", X1D.LIZIZ(LIZ2));
                pushInputBuffer(0L, this.mFrameIndexIn);
                return;
            }
            if (i4 == 6) {
                CastLogger castLogger3 = this.mLogger;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Feed SEI data. Size=");
                LIZ3.append(nal.length);
                LIZ3.append(", last FrameIndex=");
                LIZ3.append(this.mFrameIndexIn);
                castLogger3.i("VideoPlayer", X1D.LIZIZ(LIZ3));
                pushInputBuffer(0L, this.mFrameIndexIn);
                return;
            }
            if (i4 == 5) {
                this.mFrameIndexIn++;
                CastLogger castLogger4 = this.mLogger;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Feed IDR-Frame. Size=");
                LIZ4.append(nal.length);
                LIZ4.append(", PresentationTimeUs=");
                LIZ4.append(j2);
                LIZ4.append(", frameIndex=");
                LIZ4.append(this.mFrameIndexIn);
                castLogger4.i("VideoPlayer", X1D.LIZIZ(LIZ4));
                pushInputBuffer(j2, this.mFrameIndexIn);
                return;
            }
            if (this.mWaitNextIDR) {
                CastLogger castLogger5 = this.mLogger;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("Ignoring P-Frame, last frameIndex=");
                LIZ5.append(this.mFrameIndexIn);
                castLogger5.i("VideoPlayer", X1D.LIZIZ(LIZ5));
                return;
            }
            this.mFrameIndexIn++;
            CastLogger castLogger6 = this.mLogger;
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("Feed P-Frame. Size=");
            LIZ6.append(nal.length);
            LIZ6.append(", PresentationTimeUs=");
            LIZ6.append(j2);
            LIZ6.append(", frameIndex=");
            LIZ6.append(this.mFrameIndexIn);
            castLogger6.i("VideoPlayer", X1D.LIZIZ(LIZ6));
            pushInputBuffer(j2, this.mFrameIndexIn);
        }
    }

    public VideoPlayer(String str, ContextManager.CastContext castContext, IRTCEngineEventListener iRTCEngineEventListener) {
        this.mCastContext = castContext;
        CastLogger logger = ContextManager.getLogger(castContext);
        this.mLogger = logger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoPlayer ctor:");
        LIZ.append(str);
        logger.i("VideoPlayer", X1D.LIZIZ(LIZ));
        this.mUserId = str;
        this.mListener = iRTCEngineEventListener;
        this.mFrameMap = new FrameMap();
        this.mGolomb = new golomb(this.mCastContext);
    }

    public void init(Surface surface, RTCSetting.VCODEC_ID vcodec_id, byte[] bArr) {
        String str;
        this.mLogger.i("VideoPlayer", "init...");
        SPS Parse = this.mGolomb.Parse(bArr, vcodec_id);
        if (Parse.bVaild) {
            int i = this.mWidth;
            int i2 = Parse.width;
            if (i != i2 || this.mHeight != Parse.height) {
                this.mWidth = i2;
                int i3 = Parse.height;
                this.mHeight = i3;
                this.mListener.OnVideoSizeChanged(this.mUserId, i2, i3, 0);
            }
        }
        this.mCodecId = vcodec_id;
        if (vcodec_id == RTCSetting.VCODEC_ID.H264) {
            str = "video/avc";
        } else {
            str = "video/hevc";
        }
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init  width=");
        LIZ.append(this.mWidth);
        LIZ.append(" height=");
        LIZ.append(this.mHeight);
        LIZ.append(" codec is ");
        LIZ.append(str);
        castLogger.i("VideoPlayer", X1D.LIZIZ(LIZ));
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, this.mWidth, this.mHeight);
        if (Utils.getProperty("ro.product.name", "", this.mCastContext).equalsIgnoreCase("darwin")) {
            createVideoFormat.setFloat("operating-rate", 480.0f);
            createVideoFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
            createVideoFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
            this.mLogger.i("VideoPlayer", "mMediaCodec.configure, enable darwin lowlatency");
        }
        try {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(str);
            this.mMediaCodec = createDecoderByType;
            createDecoderByType.configure(createVideoFormat, surface, (MediaCrypto) null, 0);
            this.mMediaCodec.start();
            VideoJitterBuffer videoJitterBuffer = VideoJitterBuffer.getInstance();
            videoJitterBuffer.setMediaCodec(this.mMediaCodec, new MediaCodec.BufferInfo());
            videoJitterBuffer.setJitterCallback(this);
            VideoJitterBuffer.getInstance().start();
            this.bInited = true;
            CastLogger castLogger2 = this.mLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("init bInited:");
            LIZ2.append(this.bInited);
            castLogger2.i("VideoPlayer", X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            e.printStackTrace();
            this.mMediaCodec = null;
            CastLogger castLogger3 = this.mLogger;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("mMediaCodec.configure error");
            LIZ3.append(e.toString());
            castLogger3.e("VideoPlayer", X1D.LIZIZ(LIZ3));
        }
    }
}
