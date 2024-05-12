package com.byted.cast.capture.video;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.projection.MediaProjection;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import com.byted.cast.capture.encoder.VideoEncoder;
import com.byted.cast.capture.surface.GLSurfaceManager;
import com.byted.cast.capture.video.VideoRecorderManager;
import com.byted.cast.common.config.Config;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.VideoProfile;
import com.byted.cast.mediacommon.utils.Logger;

/* loaded from: classes29.dex */
public abstract class VideoRecorderBase {
    public String mCodecType;
    public Context mContext;
    public byte[] mHeadBuffer;
    public VideoRecorderManager.IVideoCallback mVideoCallback;
    public VideoProfile mVideoProfile;
    public final String TAG = getTag();
    public Point mScreenSize = new Point();
    public int mWidth = 0;
    public int mHeight = 0;
    public int mDpi = 0;
    public int mFps = 0;
    public int mBitrate = 0;
    public int mOriented = 0;
    public boolean bSetReSize = false;
    public int mVirtualDisplayFlag = 0;
    public int vitrualDisplayW = 1920;
    public int vitrualDisplayH = 1080;
    public String vitrualDisplayName = "";
    public volatile boolean mNeedSPS = false;
    public VideoEncoder mVideoEncoder = null;
    public VideoEncoder.IRecorderListener mVideoListener = new VideoEncoder.IRecorderListener() { // from class: com.byted.cast.capture.video.VideoRecorderBase.1
        @Override // com.byted.cast.capture.encoder.VideoEncoder.IRecorderListener
        public void onEncoderStop() {
            VideoRecorderBase.this.mVideoCallback.onVideoEncoderStop();
        }

        @Override // com.byted.cast.capture.encoder.VideoEncoder.IRecorderListener
        public void onRecevieFrameTimeout() {
            VideoRecorderBase.this.mVideoCallback.onRecevieFrameTimeout();
        }

        @Override // com.byted.cast.capture.encoder.VideoEncoder.IRecorderListener
        public void onOutputFormatChange(MediaFormat mediaFormat) {
            VideoRecorderBase.this.mVideoCallback.onVideoOutputFormatChange(mediaFormat);
        }

        @Override // com.byted.cast.capture.encoder.VideoEncoder.IRecorderListener
        public void onVideoRecordError(int i, String str) {
            String str2 = VideoRecorderBase.this.TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onVideoRecordError code:");
            LIZ.append(i);
            LIZ.append("message:");
            LIZ.append(str);
            Logger.e(str2, X1D.LIZIZ(LIZ));
            VideoRecorderBase.this.stop();
            VideoRecorderManager.IVideoCallback iVideoCallback = VideoRecorderBase.this.mVideoCallback;
            if (iVideoCallback != null) {
                iVideoCallback.onVideoRecordError(i, str);
            }
        }

        @Override // com.byted.cast.capture.encoder.VideoEncoder.IRecorderListener
        public void onVideoFrameAvailable(byte[] bArr, MediaCodec.BufferInfo bufferInfo, int i, int i2) {
            if (i2 == 1) {
                VideoRecorderBase videoRecorderBase = VideoRecorderBase.this;
                byte[] bArr2 = new byte[bArr.length];
                videoRecorderBase.mHeadBuffer = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                VideoRecorderBase videoRecorderBase2 = VideoRecorderBase.this;
                VideoRecorderManager.IVideoCallback iVideoCallback = videoRecorderBase2.mVideoCallback;
                if (iVideoCallback != null) {
                    byte[] bArr3 = videoRecorderBase2.mHeadBuffer;
                    iVideoCallback.onVideoFrameCodec(bArr3, bArr3.length, videoRecorderBase2.mWidth, videoRecorderBase2.mHeight, videoRecorderBase2.tranportCodecType(videoRecorderBase2.mCodecType), bufferInfo.presentationTimeUs, VideoRecorderBase.this.mOriented);
                }
                String str = "";
                for (byte b : VideoRecorderBase.this.mHeadBuffer) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(C16880lQ.LLLZ("%02x ", new Object[]{Byte.valueOf(b)}));
                    str = X1D.LIZIZ(LIZ);
                }
                String str2 = VideoRecorderBase.this.TAG;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("codec:");
                LIZ2.append(str);
                Logger.i(str2, X1D.LIZIZ(LIZ2));
            } else {
                if (i == 1 && VideoRecorderBase.this.mNeedSPS) {
                    Logger.i(VideoRecorderBase.this.TAG, "need send Codec:");
                    VideoRecorderBase videoRecorderBase3 = VideoRecorderBase.this;
                    VideoRecorderManager.IVideoCallback iVideoCallback2 = videoRecorderBase3.mVideoCallback;
                    if (iVideoCallback2 != null) {
                        byte[] bArr4 = videoRecorderBase3.mHeadBuffer;
                        iVideoCallback2.onVideoFrameCodec(bArr4, bArr4.length, videoRecorderBase3.mWidth, videoRecorderBase3.mHeight, videoRecorderBase3.tranportCodecType(videoRecorderBase3.mCodecType), bufferInfo.presentationTimeUs, VideoRecorderBase.this.mOriented);
                    }
                    VideoRecorderBase.this.mNeedSPS = false;
                }
                VideoRecorderBase videoRecorderBase4 = VideoRecorderBase.this;
                VideoRecorderManager.IVideoCallback iVideoCallback3 = videoRecorderBase4.mVideoCallback;
                if (iVideoCallback3 != null) {
                    iVideoCallback3.onVideoFrameAvailable(bArr, bufferInfo, videoRecorderBase4.mWidth, videoRecorderBase4.mHeight, videoRecorderBase4.tranportCodecType(videoRecorderBase4.mCodecType), bufferInfo.presentationTimeUs, VideoRecorderBase.this.mOriented, i);
                }
            }
            Point point = new Point();
            int oriented = VideoRecorderBase.this.getOriented(point, false);
            VideoRecorderBase videoRecorderBase5 = VideoRecorderBase.this;
            if (!videoRecorderBase5.bSetReSize) {
                int i3 = point.x;
                Point point2 = videoRecorderBase5.mScreenSize;
                if (i3 != point2.x && point.y != point2.y && videoRecorderBase5.mVideoProfile.getSourceType() == MediaSetting.VIDEO_SOURCE_TYPE.SCREEN) {
                    String str3 = VideoRecorderBase.this.TAG;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("video size changed from w:");
                    LIZ3.append(VideoRecorderBase.this.mScreenSize.x);
                    LIZ3.append("h:");
                    LIZ3.append(VideoRecorderBase.this.mScreenSize.y);
                    LIZ3.append("to w:");
                    LIZ3.append(point.x);
                    LIZ3.append("h:");
                    LIZ3.append(point.y);
                    LIZ3.append("mOriented:");
                    LIZ3.append(oriented);
                    Logger.i(str3, X1D.LIZIZ(LIZ3));
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(point.x);
                    LIZ4.append("x");
                    LIZ4.append(point.y);
                    MediaMonitor.onMonitor("MediaCapture_Size_Changed", X1D.LIZIZ(LIZ4));
                    VideoRecorderManager.IVideoCallback iVideoCallback4 = VideoRecorderBase.this.mVideoCallback;
                    if (iVideoCallback4 != null) {
                        iVideoCallback4.onVideoSizeChanged(oriented);
                    }
                    VideoRecorderBase.this.bSetReSize = true;
                }
            }
        }

        @Override // com.byted.cast.capture.encoder.VideoEncoder.IRecorderListener
        public void onVideoEncoder(String str, int i, int i2, int i3, int i4) {
            VideoRecorderManager.IVideoCallback iVideoCallback = VideoRecorderBase.this.mVideoCallback;
            if (iVideoCallback != null) {
                iVideoCallback.onVideoEncoder(str, i, i2, i3, i4);
            }
        }
    };

    public abstract String getTag();

    public abstract void prepare(GLSurfaceManager gLSurfaceManager, int i);

    public abstract void setConfig(Config config);

    public abstract void setFlashEnable(boolean z);

    public abstract void start(MediaProjection mediaProjection);

    public abstract void stop();

    public void init() {
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" avsync=");
        LIZ.append(this.mVideoProfile.getAVSyncType());
        LIZ.append(" streamType=");
        LIZ.append(this.mVideoProfile.getStreamType());
        LIZ.append(" h=");
        LIZ.append(this.mVideoProfile.getHeight());
        LIZ.append(" w=");
        LIZ.append(this.mVideoProfile.getWidth());
        LIZ.append(" fps=");
        LIZ.append(this.mVideoProfile.getFps());
        LIZ.append(" kbps=");
        LIZ.append(this.mVideoProfile.getBitrate());
        Logger.i(str, X1D.LIZIZ(LIZ));
        if (this.mVideoProfile.getCodecId() == MediaSetting.VCODEC_ID.H265) {
            this.mCodecType = "video/hevc";
        } else {
            this.mCodecType = "video/avc";
        }
        this.mWidth = this.mVideoProfile.getWidth();
        this.mHeight = this.mVideoProfile.getHeight();
        this.mDpi = this.mVideoProfile.getDpi();
        this.mFps = this.mVideoProfile.getFps();
        this.mBitrate = this.mVideoProfile.getBitrate();
        this.mVirtualDisplayFlag = this.mVideoProfile.getVirtualDisplayFlag();
        this.vitrualDisplayName = this.mVideoProfile.getVirtualDisplayName();
        this.vitrualDisplayW = this.mVideoProfile.getVirtualDisplayWidth();
        this.vitrualDisplayH = this.mVideoProfile.getVirtualDisplayHeight();
        this.mOriented = getOriented(this.mScreenSize, true);
        this.bSetReSize = false;
        if (this.mWidth == 0 || this.mHeight == 0) {
            Point point = this.mScreenSize;
            this.mWidth = point.x;
            this.mHeight = point.y;
        }
        String str2 = this.TAG;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("init capture");
        LIZ2.append(this.vitrualDisplayName);
        LIZ2.append(" width:");
        LIZ2.append(this.mWidth);
        LIZ2.append(" height:");
        LIZ2.append(this.mHeight);
        LIZ2.append("mScreenSize:");
        LIZ2.append(this.mScreenSize.x);
        LIZ2.append("x");
        LIZ2.append(this.mScreenSize.y);
        LIZ2.append("mOriented:");
        LIZ2.append(this.mOriented);
        LIZ2.append(" mDpi:");
        LIZ2.append(this.mDpi);
        LIZ2.append(" mFps:");
        LIZ2.append(this.mFps);
        LIZ2.append(" mBitrate: ");
        LIZ2.append(this.mBitrate);
        LIZ2.append(" mVirtualDisplayFlag:");
        LIZ2.append(this.mVirtualDisplayFlag);
        LIZ2.append(" vitrualDisplayName: ");
        LIZ2.append(this.vitrualDisplayName);
        Logger.i(str2, X1D.LIZIZ(LIZ2));
    }

    public void pause() {
        Logger.i(this.TAG, "pause");
        VideoEncoder videoEncoder = this.mVideoEncoder;
        if (videoEncoder != null) {
            videoEncoder.pause();
        }
    }

    public void requestIDR() {
        if (this.mVideoEncoder != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.mVideoEncoder.setParameters(bundle);
        }
        this.mNeedSPS = true;
    }

    public void resume() {
        Logger.i(this.TAG, "resume");
        VideoEncoder videoEncoder = this.mVideoEncoder;
        if (videoEncoder != null) {
            videoEncoder.resume();
        }
        this.mNeedSPS = true;
    }

    public void setBitrateKbps(int i) {
        if (this.mVideoEncoder != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i * 1000);
            this.mVideoEncoder.setParameters(bundle);
        }
    }

    public MediaSetting.VideoFormat tranportCodecType(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1662541442) {
            if (hashCode == 1331836730 && str.equals("video/avc")) {
            }
        } else if (str.equals("video/hevc")) {
            return MediaSetting.VideoFormat.VIDEO_FORMAT_ES_H265;
        }
        return MediaSetting.VideoFormat.VIDEO_FORMAT_ES_H264;
    }

    public int getOriented(Point point, boolean z) {
        Display defaultDisplay = ((WindowManager) C16880lQ.LLILL(this.mContext, "window")).getDefaultDisplay();
        defaultDisplay.getRealSize(point);
        if (z) {
            String str = this.TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("zhy test getRealSize:");
            LIZ.append(point);
            Logger.i(str, X1D.LIZIZ(LIZ));
            String str2 = this.TAG;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("zhy test display:");
            LIZ2.append(defaultDisplay);
            Logger.i(str2, X1D.LIZIZ(LIZ2));
        }
        return defaultDisplay.getRotation();
    }

    public VideoRecorderBase(Context context, VideoProfile videoProfile, VideoRecorderManager.IVideoCallback iVideoCallback) {
        this.mContext = context;
        this.mVideoProfile = videoProfile;
        this.mVideoCallback = iVideoCallback;
    }
}
