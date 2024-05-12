package com.ss.avframework.livestreamv2.core.interact.video;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.realx.video.YuvHelper;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class VideoSinkWrapper implements IVideoSink {
    public boolean isRelease;
    public long lastTime;
    public String mInteractId;
    public boolean mNeedVideoFrameCallback;
    public volatile boolean mOnlyDealSeiInfo;
    public boolean mOptimizeSwDecodeProcess;
    public RenderVideoStallStatistics mRenderVideoStallStatistics;
    public int mRtcDownHeight;
    public int mRtcDownWidth;
    public final int mRtcId;
    public VideoRenderConfig mVideoRenderConfig;
    public VideoSink mVideoSink;
    public ByteBuffer mYuvBuffer;
    public int repeatTimes;
    public boolean mIsStart = true;
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
                VideoSinkWrapper.this.mVideoRenderConfig.getInteractLogService().onRemoteVideoFrozen(this.mInteractId, (int) j);
            }
            this.mLastTimeStamp = this.mCurrentTimeStamp;
        }

        public synchronized void startStatistics() {
            this.mIsStart = true;
            this.mRepeatCheckRenderVideoStall = new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.video.VideoSinkWrapper.RenderVideoStallStatistics.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_avframework_livestreamv2_core_interact_video_VideoSinkWrapper$RenderVideoStallStatistics$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_avframework_livestreamv2_core_interact_video_VideoSinkWrapper$RenderVideoStallStatistics$1__run$___twin___() {
                    RenderVideoStallStatistics.this.rendVideoFrameInternal();
                    RenderVideoStallStatistics renderVideoStallStatistics = RenderVideoStallStatistics.this;
                    if (renderVideoStallStatistics.mIsStart && VideoSinkWrapper.this.mVideoRenderConfig.getWorkHandler() != null) {
                        VideoSinkWrapper.this.mVideoRenderConfig.getWorkHandler().postDelayed(RenderVideoStallStatistics.this.mRepeatCheckRenderVideoStall, 2000L);
                    }
                }

                public static void com_ss_avframework_livestreamv2_core_interact_video_VideoSinkWrapper$RenderVideoStallStatistics$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_avframework_livestreamv2_core_interact_video_VideoSinkWrapper$RenderVideoStallStatistics$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            };
            if (VideoSinkWrapper.this.mVideoRenderConfig.getWorkHandler() != null) {
                VideoSinkWrapper.this.mVideoRenderConfig.getWorkHandler().post(this.mRepeatCheckRenderVideoStall);
            }
        }

        public synchronized void stopStatistics() {
            this.mIsStart = false;
            if (VideoSinkWrapper.this.mVideoRenderConfig.getWorkHandler() != null) {
                VideoSinkWrapper.this.mVideoRenderConfig.getWorkHandler().removeCallbacks(this.mRepeatCheckRenderVideoStall);
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

    public VideoSinkWrapper(VideoRenderConfig videoRenderConfig) {
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
            this.mOptimizeSwDecodeProcess = this.mVideoRenderConfig.isOptimizeSwDecodeProcess();
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
        this.mVideoRenderConfig.getWorkHandler().post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.video.VideoSinkWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_video_VideoSinkWrapper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_video_VideoSinkWrapper$2__run$___twin___() {
                if (VideoSinkWrapper.this.mVideoRenderConfig.getVideoFrameCallback() != null) {
                    Client.ICatchedVideoFrameCallback videoFrameCallback = VideoSinkWrapper.this.mVideoRenderConfig.getVideoFrameCallback();
                    VideoSinkWrapper videoSinkWrapper = VideoSinkWrapper.this;
                    videoFrameCallback.onCatchedVideoFrameCallback(videoSinkWrapper.mInteractId, videoSinkWrapper.mYuvBuffer, videoFrame.getWidth(), videoFrame.getHeight());
                }
            }

            public static void com_ss_avframework_livestreamv2_core_interact_video_VideoSinkWrapper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_avframework_livestreamv2_core_interact_video_VideoSinkWrapper$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void consumeVideoFrameInternal(com.ss.bytertc.engine.video.VideoFrame r29) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.video.VideoSinkWrapper.consumeVideoFrameInternal(com.ss.bytertc.engine.video.VideoFrame):void");
    }

    private void dealVideoCaptureNtpSeiInfo(ByteBuffer byteBuffer) {
        IInteractStatics interactStatics;
        if (byteBuffer != null && !byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            allocateDirect.position(0);
            allocateDirect.put(byteBuffer);
            byteBuffer.rewind();
            allocateDirect.position(0);
            byteBuffer = allocateDirect;
        }
        String nativeParseStringFromByteBuffer = EffectWrapper.nativeParseStringFromByteBuffer(0, byteBuffer);
        if (!TextUtils.isEmpty(nativeParseStringFromByteBuffer)) {
            try {
                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(nativeParseStringFromByteBuffer), "video_e2e_delay");
                if (jSONObject != null) {
                    long optLong = jSONObject.optLong("capture_ntp_ts");
                    if (optLong > 0 && (interactStatics = this.mVideoRenderConfig.getInteractStatics()) != null) {
                        interactStatics.onVideoE2EDelayInfo(this.mInteractId, optLong, TimeUtils.getServerTimeMSec());
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.bytertc.engine.video.IVideoSink
    public void onFrame(VideoFrame videoFrame) {
        int i;
        try {
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
            String charBuffer = StandardCharsets.UTF_8.decode(videoFrame.getExternalDataInfo()).toString();
            dealSeiInfo(this.mRtcId, this.mInteractId, i, videoFrame.getWidth(), videoFrame.getHeight(), videoFrame.getTimeStampUs() / 1000, ByteBuffer.wrap(charBuffer.getBytes(StandardCharsets.UTF_8)));
            if (!charBuffer.isEmpty()) {
                dealVideoCaptureNtpSeiInfo(ByteBuffer.wrap(charBuffer.getBytes(StandardCharsets.UTF_8)));
            }
        } catch (Throwable th) {
            AVLog.logKibana(6, "VideoSinkWrapper", Log.getStackTraceString(th), null);
        }
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
                    workHandler.post(new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.video.VideoSinkWrapper.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com_ss_avframework_livestreamv2_core_interact_video_VideoSinkWrapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public void com_ss_avframework_livestreamv2_core_interact_video_VideoSinkWrapper$1__run$___twin___() {
                            VideoSinkWrapper.this.mVideoRenderConfig.getRemoteRenderEventHandler().onFirstVideoRenderEvent(VideoSinkWrapper.this.mInteractId, i, i2);
                        }

                        public static void com_ss_avframework_livestreamv2_core_interact_video_VideoSinkWrapper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                            boolean LIZ;
                            try {
                                anonymousClass1.com_ss_avframework_livestreamv2_core_interact_video_VideoSinkWrapper$1__run$___twin___();
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
        String nativeParseStringFromByteBuffer;
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
            if (this.mVideoRenderConfig.getInteractConfig().getChorusOnlySendPts() && this.mVideoRenderConfig.getInteractConfig().getMixStreamType() == Config.MixStreamType.CLIENT_MIX && (nativeParseStringFromByteBuffer = EffectWrapper.nativeParseStringFromByteBuffer(0, byteBuffer2)) != null) {
                try {
                    if (new JSONObject(nativeParseStringFromByteBuffer).has("ktv_sei")) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(nativeParseStringFromByteBuffer.getBytes().length);
                        allocateDirect.put(nativeParseStringFromByteBuffer.getBytes());
                        allocateDirect.rewind();
                        this.mVideoRenderConfig.getMediaEngine().pushRtcSeiData(9999, str, 0, 0, 0, null, 0, j, allocateDirect);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            this.mVideoRenderConfig.getMediaEngine().pushRtcSeiData(i, str, i2, i3, i4, null, 0, j, byteBuffer2);
        }
    }
}
