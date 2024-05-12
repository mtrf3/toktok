package com.ss.avframework.livestreamv2.core.interact.video;

import X.C08380Uo;
import X.X1D;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.realx.video.YuvHelper;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* loaded from: classes12.dex */
public class VideoSinkPublicWrapper implements IVideoSink {
    public boolean isRelease;
    public long lastTime;
    public String mInteractId;
    public boolean mIsStart;
    public boolean mNeedVideoFrameCallback;
    public volatile boolean mOnlyDealSeiInfo;
    public RenderVideoStallStatistics mRenderVideoStallStatistics;
    public int mRtcDownHeight;
    public int mRtcDownWidth;
    public final int mRtcId;
    public VideoRenderConfig mVideoRenderConfig;
    public VideoSink mVideoSink;
    public ByteBuffer mYuvBuffer;
    public int repeatTimes;
    public volatile boolean isFirstRenderFrame = true;
    public volatile boolean mRemoteCanRender = true;

    /* loaded from: classes12.dex */
    public class RenderVideoStallStatistics {
        public long mCurrentTimeStamp;
        public boolean mHasReceivedFrame;
        public String mInteractId;
        public boolean mIsStart;
        public long mLastTimeStamp;
        public Runnable mRepeatCheckRenderVideoStall;

        public synchronized void rendVideoFrameInternal() {
            if (!this.mHasReceivedFrame) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.mCurrentTimeStamp = currentTimeMillis;
            long j = currentTimeMillis - this.mLastTimeStamp;
            if (j > 500) {
                VideoSinkPublicWrapper.this.mVideoRenderConfig.getInteractLogService().onRemoteVideoFrozen(this.mInteractId, (int) j);
            }
            this.mLastTimeStamp = this.mCurrentTimeStamp;
        }

        public synchronized void startStatistics() {
            this.mIsStart = true;
            this.mRepeatCheckRenderVideoStall = new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.video.VideoSinkPublicWrapper.RenderVideoStallStatistics.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_video_VideoSinkPublicWrapper$RenderVideoStallStatistics$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_video_VideoSinkPublicWrapper$RenderVideoStallStatistics$1__run$___twin___() {
                    RenderVideoStallStatistics.this.rendVideoFrameInternal();
                    RenderVideoStallStatistics renderVideoStallStatistics = RenderVideoStallStatistics.this;
                    if (renderVideoStallStatistics.mIsStart && VideoSinkPublicWrapper.this.mVideoRenderConfig.getWorkHandler() != null) {
                        VideoSinkPublicWrapper.this.mVideoRenderConfig.getWorkHandler().postDelayed(RenderVideoStallStatistics.this.mRepeatCheckRenderVideoStall, 2000L);
                    }
                }

                public static void com_ss_avframework_livestreamv2_core_interact_video_VideoSinkPublicWrapper$RenderVideoStallStatistics$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_avframework_livestreamv2_core_interact_video_VideoSinkPublicWrapper$RenderVideoStallStatistics$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            };
            if (VideoSinkPublicWrapper.this.mVideoRenderConfig.getWorkHandler() != null) {
                VideoSinkPublicWrapper.this.mVideoRenderConfig.getWorkHandler().post(this.mRepeatCheckRenderVideoStall);
            }
        }

        public synchronized void stopStatistics() {
            this.mIsStart = false;
            if (VideoSinkPublicWrapper.this.mVideoRenderConfig.getWorkHandler() != null) {
                VideoSinkPublicWrapper.this.mVideoRenderConfig.getWorkHandler().removeCallbacks(this.mRepeatCheckRenderVideoStall);
            }
        }

        public void rendVideoFrame() {
            if (!this.mHasReceivedFrame) {
                this.mHasReceivedFrame = true;
                long currentTimeMillis = System.currentTimeMillis();
                this.mCurrentTimeStamp = currentTimeMillis;
                this.mLastTimeStamp = currentTimeMillis;
            }
            rendVideoFrameInternal();
        }

        public RenderVideoStallStatistics(String str) {
            this.mInteractId = str;
        }
    }

    private void destroyVideoSink() {
        AVLog.debugTrace(new Object[0]);
        VideoSink videoSink = this.mVideoSink;
        this.mVideoSink = null;
        if (videoSink != null) {
            this.mVideoRenderConfig.getVideoSinkFactory().destroy(videoSink);
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoSink
    public int getRenderElapse() {
        return 0;
    }

    public SurfaceView getSurfaceView() {
        AVLog.debugTrace(new Object[0]);
        VideoSink videoSink = this.mVideoSink;
        if (videoSink != null) {
            return videoSink.getSurfaceView();
        }
        return null;
    }

    public TextureView getTextureView() {
        AVLog.debugTrace(new Object[0]);
        VideoSink videoSink = this.mVideoSink;
        if (videoSink != null) {
            return videoSink.getTextureView();
        }
        return null;
    }

    public VideoFrameRenderer getVideoFrameRender() {
        AVLog.debugTrace(new Object[0]);
        VideoSink videoSink = this.mVideoSink;
        if (videoSink != null) {
            return videoSink.getVideoFrameRender();
        }
        return null;
    }

    public synchronized void release() {
        AVLog.debugTrace(new Object[0]);
        if (!this.isRelease) {
            this.isRelease = true;
            this.mIsStart = false;
            destroyVideoSink();
            this.mRenderVideoStallStatistics.stopStatistics();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this);
            LIZ.append(" released done");
            AVLog.iow("VideoSinkWrapper", X1D.LIZIZ(LIZ));
        }
    }

    public void setFirstRenderFrame() {
        this.isFirstRenderFrame = true;
    }

    public void setNeedVideoFrameCallback() {
        this.mNeedVideoFrameCallback = true;
    }

    public boolean hasRenderFirstFrame() {
        return !this.isFirstRenderFrame;
    }

    public boolean isValid() {
        VideoSink videoSink = this.mVideoSink;
        if (videoSink != null) {
            return videoSink.isValid();
        }
        return false;
    }

    public int getRtcDownHeight() {
        return this.mRtcDownHeight;
    }

    public int getRtcDownWidth() {
        return this.mRtcDownWidth;
    }

    public VideoSink getVideoSink() {
        return this.mVideoSink;
    }

    public VideoSinkPublicWrapper(VideoRenderConfig videoRenderConfig) {
        boolean z;
        boolean z2;
        AVLog.debugTrace(new Object[0]);
        if (videoRenderConfig.checkMemberVariable()) {
            this.mVideoRenderConfig = videoRenderConfig;
            this.mInteractId = videoRenderConfig.getInteractId();
            this.mRtcId = this.mVideoRenderConfig.getInteractEngine().queryRtcId(this.mInteractId);
            if (this.mVideoRenderConfig.getViewType() == Config.ViewType.TEXTURE_VIEW) {
                z = true;
            } else {
                z = false;
            }
            int rtcDeliverType = this.mVideoRenderConfig.getRtcDeliverType();
            VideoSinkFactory videoSinkFactory = this.mVideoRenderConfig.getVideoSinkFactory();
            String str = this.mInteractId;
            boolean isSingleViewMode = videoRenderConfig.isSingleViewMode();
            boolean isEnableFixedSize = videoRenderConfig.isEnableFixedSize();
            if (videoRenderConfig.getInteractConfig().getChorusCharacter() != Config.ChorusCharacter.NO_USE && !videoRenderConfig.getInteractConfig().getChorusOnlySendPts()) {
                z2 = true;
            } else {
                z2 = false;
            }
            VideoSink create = videoSinkFactory.create(str, z, rtcDeliverType, isSingleViewMode, isEnableFixedSize, z2);
            this.mVideoSink = create;
            create.setRenderAble(this.mRemoteCanRender);
            RenderVideoStallStatistics renderVideoStallStatistics = new RenderVideoStallStatistics(this.mInteractId);
            this.mRenderVideoStallStatistics = renderVideoStallStatistics;
            renderVideoStallStatistics.startStatistics();
            this.isRelease = false;
            return;
        }
        throw new Exception("videoRenderConfig init failed");
    }

    private synchronized void checkCallbackVideoFrame(final VideoFrame videoFrame) {
        int width = videoFrame.getWidth();
        int height = videoFrame.getHeight();
        int i = (((width + 1) / 2) * ((height + 1) / 2) * 2) + (width * height);
        ByteBuffer byteBuffer = this.mYuvBuffer;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.mYuvBuffer = ByteBuffer.allocateDirect(i);
        }
        YuvHelper.I420Copy(videoFrame.getPlaneData(0), videoFrame.getPlaneStride(0), videoFrame.getPlaneData(1), videoFrame.getPlaneStride(1), videoFrame.getPlaneData(2), videoFrame.getPlaneStride(2), this.mYuvBuffer, videoFrame.getWidth(), videoFrame.getHeight());
        this.mVideoRenderConfig.getWorkHandler().post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.video.VideoSinkPublicWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_video_VideoSinkPublicWrapper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_video_VideoSinkPublicWrapper$2__run$___twin___() {
                if (VideoSinkPublicWrapper.this.mVideoRenderConfig.getVideoFrameCallback() != null) {
                    Client.ICatchedVideoFrameCallback videoFrameCallback = VideoSinkPublicWrapper.this.mVideoRenderConfig.getVideoFrameCallback();
                    VideoSinkPublicWrapper videoSinkPublicWrapper = VideoSinkPublicWrapper.this;
                    videoFrameCallback.onCatchedVideoFrameCallback(videoSinkPublicWrapper.mInteractId, videoSinkPublicWrapper.mYuvBuffer, videoFrame.getWidth(), videoFrame.getHeight());
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_video_VideoSinkPublicWrapper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_avframework_livestreamv2_core_interact_video_VideoSinkPublicWrapper$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    private void consumeVideoFrameInternal(VideoFrame videoFrame) {
        VideoSink videoSink = this.mVideoSink;
        if (videoSink == null) {
            return;
        }
        int width = videoFrame.getWidth();
        int height = videoFrame.getHeight();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((((width + 1) / 2) * ((height + 1) / 2) * 2) + (width * height));
        YuvHelper.I420Copy(videoFrame.getPlaneData(0), videoFrame.getPlaneStride(0), videoFrame.getPlaneData(1), videoFrame.getPlaneStride(1), videoFrame.getPlaneData(2), videoFrame.getPlaneStride(2), allocateDirect, width, height);
        allocateDirect.position(0);
        if (this.mNeedVideoFrameCallback) {
            checkCallbackVideoFrame(videoFrame);
            this.mNeedVideoFrameCallback = false;
        }
        this.repeatTimes++;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastTime >= 10000) {
            this.lastTime = currentTimeMillis;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" (repeat ");
            AVLog.debugTrace(allocateDirect, videoFrame.getExternalDataInfo(), videoFrame.getPixelFormat().toString(), Integer.valueOf(videoFrame.getWidth()), Integer.valueOf(videoFrame.getHeight()), videoFrame.getRotation(), Long.valueOf(videoFrame.getTimeStampUs()), C08380Uo.LIZ(LIZ, this.repeatTimes, " times)", LIZ));
            this.repeatTimes = 0;
        }
        if (!this.mIsStart || this.isRelease) {
            return;
        }
        if (videoFrame.getWidth() > 0 && videoFrame.getHeight() > 0 && videoFrame.getWidth() % 2 == 0 && videoFrame.getHeight() % 2 == 0) {
            this.mVideoRenderConfig.getColorRangeReporter().onRemoteYuvFrame(allocateDirect, videoFrame.getWidth(), videoFrame.getHeight());
            videoSink.onByteBufferVideoFrame(new ByteBuffer[]{allocateDirect}, null, Config.VideoOutputFormat.PIXEL_FORMAT_I420, this.mVideoRenderConfig.getColorRangeReporter().getColorRange(), videoFrame.getWidth(), videoFrame.getHeight(), 0, videoFrame.getTimeStampUs() / 1000);
            this.mVideoRenderConfig.getInteractStatics().calcDurationFromLiveToInteract();
            checkRemoteFrameRenderAndStatics(videoFrame.getWidth(), videoFrame.getHeight());
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Illegal yuv width ");
        LIZ2.append(videoFrame.getWidth());
        LIZ2.append(" height ");
        LIZ2.append(videoFrame.getHeight());
        throw new AndroidRuntimeException(X1D.LIZIZ(LIZ2));
    }

    @Override // com.ss.bytertc.engine.video.IVideoSink
    public void onFrame(VideoFrame videoFrame) {
        int i;
        if (this.mRtcDownWidth != videoFrame.getWidth()) {
            this.mRtcDownWidth = videoFrame.getWidth();
        }
        if (this.mRtcDownHeight != videoFrame.getHeight()) {
            this.mRtcDownHeight = videoFrame.getHeight();
        }
        if (!this.mOnlyDealSeiInfo) {
            consumeVideoFrameInternal(videoFrame);
        }
        VideoSink videoSink = this.mVideoSink;
        if (videoSink != null) {
            i = videoSink.getTextureID();
        } else {
            i = -1;
        }
        dealSeiInfo(this.mRtcId, this.mInteractId, i, videoFrame.getWidth(), videoFrame.getHeight(), videoFrame.getTimeStampUs() / 1000, ByteBuffer.wrap(StandardCharsets.UTF_8.decode(videoFrame.getExternalDataInfo()).toString().getBytes(StandardCharsets.UTF_8)));
    }

    public void setFitMode(boolean z) {
        VideoSink videoSink = this.mVideoSink;
        if (videoSink != null) {
            videoSink.setFitMode(z);
        }
    }

    public void setOnlyNeedRemoteSei(boolean z) {
        this.mOnlyDealSeiInfo = z;
    }

    public void setRenderAble(boolean z) {
        this.mRemoteCanRender = z;
        VideoSink videoSink = this.mVideoSink;
        if (videoSink != null) {
            videoSink.setRenderAble(z);
        }
    }

    public void setVideoRenderConfigCallBack(Client.ICatchedVideoFrameCallback iCatchedVideoFrameCallback) {
        VideoRenderConfig videoRenderConfig = this.mVideoRenderConfig;
        if (videoRenderConfig != null) {
            videoRenderConfig.setVideoFrameCallback(iCatchedVideoFrameCallback);
        }
    }

    private void checkRemoteFrameRenderAndStatics(final int i, final int i2) {
        if (this.mRemoteCanRender) {
            if (this.isFirstRenderFrame) {
                this.isFirstRenderFrame = false;
                this.mVideoRenderConfig.getInteractLogService().onFirstRemoteVideoRender(this.mInteractId);
                Handler workHandler = this.mVideoRenderConfig.getWorkHandler();
                if (workHandler != null) {
                    workHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.video.VideoSinkPublicWrapper.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com_ss_avframework_livestreamv2_core_interact_video_VideoSinkPublicWrapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public void com_ss_avframework_livestreamv2_core_interact_video_VideoSinkPublicWrapper$1__run$___twin___() {
                            VideoSinkPublicWrapper.this.mVideoRenderConfig.getRemoteRenderEventHandler().onFirstVideoRenderEvent(VideoSinkPublicWrapper.this.mInteractId, i, i2);
                        }

                        public static void com_ss_avframework_livestreamv2_core_interact_video_VideoSinkPublicWrapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                            boolean LIZ;
                            try {
                                anonymousClass1.com_ss_avframework_livestreamv2_core_interact_video_VideoSinkPublicWrapper$1__run$___twin___();
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    });
                } else {
                    this.mVideoRenderConfig.getRemoteRenderEventHandler().onFirstVideoRenderEvent(this.mInteractId, i, i2);
                }
            }
            RenderVideoStallStatistics renderVideoStallStatistics = this.mRenderVideoStallStatistics;
            IInteractStatics interactStatics = this.mVideoRenderConfig.getInteractStatics();
            if (this.mIsStart && !this.isRelease && renderVideoStallStatistics != null && interactStatics != null) {
                renderVideoStallStatistics.rendVideoFrame();
                interactStatics.onRemoteVideoRendered(this.mInteractId);
            }
        }
    }

    public void dealSeiInfo(int i, String str, int i2, int i3, int i4, long j, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (byteBuffer != null && !byteBuffer.isDirect()) {
            byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBuffer2.position(0);
            byteBuffer2.put(byteBuffer);
            byteBuffer.rewind();
            byteBuffer2.position(0);
        } else {
            byteBuffer2 = byteBuffer;
        }
        if (this.mVideoRenderConfig.getMediaEngine() != null) {
            this.mVideoRenderConfig.getMediaEngine().pushRtcSeiData(i, str, i2, i3, i4, null, 0, j, byteBuffer2);
        }
    }
}
