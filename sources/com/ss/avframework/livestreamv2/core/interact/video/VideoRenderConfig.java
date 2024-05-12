package com.ss.avframework.livestreamv2.core.interact.video;

import X.C48339Iy7;
import X.Q89;
import X.X1D;
import android.os.Handler;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl;
import com.ss.avframework.livestreamv2.core.interact.media.MediaEngine;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics;
import com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* loaded from: classes12.dex */
public class VideoRenderConfig {
    public RemoteYuvColorRangeReporter mColorRangeReporter;
    public InteractConfig mConfig;
    public boolean mEnableFixedSize;
    public InteractEngineImpl mInteractEngine;
    public String mInteractId;
    public InteractLogService mInteractLogService;
    public IInteractStatics mInteractStatics;
    public MediaEngine mMediaEngine;
    public boolean mOptimizeSwDecodeProcess;
    public RemoteRenderEventHandler mRemoteRenderEventHandler;
    public int mRtcDeliverType;
    public boolean mSingleViewMode;
    public Client.ICatchedVideoFrameCallback mVideoFrameCallback;
    public VideoSinkFactory mVideoSinkFactory;
    public Config.ViewType mViewType;
    public Handler mWorkHandler;

    /* loaded from: classes12.dex */
    public static class VideoRenderConfigBuilder {
        public RemoteYuvColorRangeReporter mColorRangeReporter;
        public InteractConfig mConfig;
        public boolean mEnableFixedSize;
        public InteractEngineImpl mInteractEngine;
        public String mInteractId;
        public InteractLogService mInteractLogService;
        public IInteractStatics mInteractStatics;
        public MediaEngine mMediaEngine;
        public boolean mOptimizeSwDecodeProcess;
        public RemoteRenderEventHandler mRemoteRenderEventHandler;
        public int mRtcDeliverType;
        public boolean mSingleViewMode;
        public Client.ICatchedVideoFrameCallback mVideoFrameCallback;
        public VideoSinkFactory mVideoSinkFactory;
        public Config.ViewType mViewType;
        public Handler mWorkHandler;

        public VideoRenderConfig build() {
            return new VideoRenderConfig(this);
        }

        public VideoRenderConfigBuilder(String str) {
            this.mInteractId = str;
        }

        public VideoRenderConfigBuilder enableFixedSize(boolean z) {
            this.mEnableFixedSize = z;
            return this;
        }

        public VideoRenderConfigBuilder enableOptimizeSwDecodeProcess(boolean z) {
            this.mOptimizeSwDecodeProcess = z;
            return this;
        }

        public VideoRenderConfigBuilder interactEngine(InteractEngineImpl interactEngineImpl) {
            this.mInteractEngine = interactEngineImpl;
            return this;
        }

        public VideoRenderConfigBuilder interactLogService(InteractLogService interactLogService) {
            this.mInteractLogService = interactLogService;
            return this;
        }

        public VideoRenderConfigBuilder interactStatics(IInteractStatics iInteractStatics) {
            this.mInteractStatics = iInteractStatics;
            return this;
        }

        public VideoRenderConfigBuilder mediaEngine(MediaEngine mediaEngine) {
            this.mMediaEngine = mediaEngine;
            return this;
        }

        public VideoRenderConfigBuilder remoteRenderEventHandler(RemoteRenderEventHandler remoteRenderEventHandler) {
            this.mRemoteRenderEventHandler = remoteRenderEventHandler;
            return this;
        }

        public VideoRenderConfigBuilder remoteYuvColorRangeReporter(RemoteYuvColorRangeReporter remoteYuvColorRangeReporter) {
            this.mColorRangeReporter = remoteYuvColorRangeReporter;
            return this;
        }

        public VideoRenderConfigBuilder rtcDeliverType(int i) {
            this.mRtcDeliverType = i;
            return this;
        }

        public VideoRenderConfigBuilder setInteractConfig(InteractConfig interactConfig) {
            this.mConfig = interactConfig;
            return this;
        }

        public VideoRenderConfigBuilder singleViewMode(boolean z) {
            this.mSingleViewMode = z;
            return this;
        }

        public VideoRenderConfigBuilder videoFrameCallback(Client.ICatchedVideoFrameCallback iCatchedVideoFrameCallback) {
            this.mVideoFrameCallback = iCatchedVideoFrameCallback;
            return this;
        }

        public VideoRenderConfigBuilder videoSinkFactory(VideoSinkFactory videoSinkFactory) {
            this.mVideoSinkFactory = videoSinkFactory;
            return this;
        }

        public VideoRenderConfigBuilder viewType(Config.ViewType viewType) {
            this.mViewType = viewType;
            return this;
        }

        public VideoRenderConfigBuilder workHandler(Handler handler) {
            this.mWorkHandler = handler;
            return this;
        }
    }

    public boolean checkMemberVariable() {
        String str;
        String str2;
        if (this.mInteractId != null && this.mInteractEngine != null && this.mRemoteRenderEventHandler != null) {
            return true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RTCcheckMemberVariable failed: we only have ");
        String str3 = "";
        if (this.mInteractId == null) {
            str = "";
        } else {
            str = " mInteractId,";
        }
        LIZ.append(str);
        if (this.mInteractEngine == null) {
            str2 = "";
        } else {
            str2 = " mInteractEngine,";
        }
        LIZ.append(str2);
        if (this.mRemoteRenderEventHandler != null) {
            str3 = " mRemoteRenderEventHandler,";
        }
        LIZ.append(str3);
        AVLog.logKibana(6, "VideoRenderConfig", X1D.LIZIZ(LIZ), null);
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoRenderConfig{mInteractId='");
        Q89.LIZIZ(LIZ, this.mInteractId, '\'', ", mInteractEngine=");
        LIZ.append(this.mInteractEngine);
        LIZ.append(", mVideoSinkFactory=");
        LIZ.append(this.mVideoSinkFactory);
        LIZ.append(", mSingleViewMode=");
        LIZ.append(this.mSingleViewMode);
        LIZ.append(", mInteractLogService=");
        LIZ.append(this.mInteractLogService);
        LIZ.append(", mColorRangeReporter=");
        LIZ.append(this.mColorRangeReporter);
        LIZ.append(", mViewType=");
        LIZ.append(this.mViewType);
        LIZ.append(", mRtcDeliverType=");
        LIZ.append(this.mRtcDeliverType);
        LIZ.append(", mWorkHandler=");
        LIZ.append(this.mWorkHandler);
        LIZ.append(", mInteractStatics=");
        LIZ.append(this.mInteractStatics);
        LIZ.append(", mRemoteRenderEventHandler=");
        LIZ.append(this.mRemoteRenderEventHandler);
        LIZ.append(", mVideoFrameCallback=");
        LIZ.append(this.mVideoFrameCallback);
        LIZ.append(", mEnableFixedSize=");
        LIZ.append(this.mEnableFixedSize);
        LIZ.append(", mOptimizeSwDecodeProcess=");
        return C48339Iy7.LIZJ(LIZ, this.mOptimizeSwDecodeProcess, '}', LIZ);
    }

    public RemoteYuvColorRangeReporter getColorRangeReporter() {
        return this.mColorRangeReporter;
    }

    public InteractConfig getInteractConfig() {
        return this.mConfig;
    }

    public InteractEngineImpl getInteractEngine() {
        return this.mInteractEngine;
    }

    public String getInteractId() {
        return this.mInteractId;
    }

    public InteractLogService getInteractLogService() {
        return this.mInteractLogService;
    }

    public IInteractStatics getInteractStatics() {
        return this.mInteractStatics;
    }

    public MediaEngine getMediaEngine() {
        return this.mMediaEngine;
    }

    public RemoteRenderEventHandler getRemoteRenderEventHandler() {
        return this.mRemoteRenderEventHandler;
    }

    public int getRtcDeliverType() {
        return this.mRtcDeliverType;
    }

    public Client.ICatchedVideoFrameCallback getVideoFrameCallback() {
        return this.mVideoFrameCallback;
    }

    public VideoSinkFactory getVideoSinkFactory() {
        return this.mVideoSinkFactory;
    }

    public Config.ViewType getViewType() {
        return this.mViewType;
    }

    public Handler getWorkHandler() {
        return this.mWorkHandler;
    }

    public boolean isEnableFixedSize() {
        return this.mEnableFixedSize;
    }

    public boolean isOptimizeSwDecodeProcess() {
        return this.mOptimizeSwDecodeProcess;
    }

    public boolean isSingleViewMode() {
        return this.mSingleViewMode;
    }

    public VideoRenderConfig(VideoRenderConfigBuilder videoRenderConfigBuilder) {
        this.mInteractId = videoRenderConfigBuilder.mInteractId;
        this.mInteractEngine = videoRenderConfigBuilder.mInteractEngine;
        this.mVideoSinkFactory = videoRenderConfigBuilder.mVideoSinkFactory;
        this.mSingleViewMode = videoRenderConfigBuilder.mSingleViewMode;
        this.mInteractLogService = videoRenderConfigBuilder.mInteractLogService;
        this.mColorRangeReporter = videoRenderConfigBuilder.mColorRangeReporter;
        this.mViewType = videoRenderConfigBuilder.mViewType;
        this.mRtcDeliverType = videoRenderConfigBuilder.mRtcDeliverType;
        this.mWorkHandler = videoRenderConfigBuilder.mWorkHandler;
        this.mInteractStatics = videoRenderConfigBuilder.mInteractStatics;
        this.mRemoteRenderEventHandler = videoRenderConfigBuilder.mRemoteRenderEventHandler;
        this.mVideoFrameCallback = videoRenderConfigBuilder.mVideoFrameCallback;
        this.mMediaEngine = videoRenderConfigBuilder.mMediaEngine;
        this.mEnableFixedSize = videoRenderConfigBuilder.mEnableFixedSize;
        this.mConfig = videoRenderConfigBuilder.mConfig;
        this.mOptimizeSwDecodeProcess = videoRenderConfigBuilder.mOptimizeSwDecodeProcess;
    }

    public void setColorRangeReporter(RemoteYuvColorRangeReporter remoteYuvColorRangeReporter) {
        this.mColorRangeReporter = remoteYuvColorRangeReporter;
    }

    public void setEnableFixedSize(boolean z) {
        this.mEnableFixedSize = z;
    }

    public void setInteractEngine(InteractEngineImpl interactEngineImpl) {
        this.mInteractEngine = interactEngineImpl;
    }

    public void setInteractId(String str) {
        this.mInteractId = str;
    }

    public void setInteractLogService(InteractLogService interactLogService) {
        this.mInteractLogService = interactLogService;
    }

    public void setInteractStatics(IInteractStatics iInteractStatics) {
        this.mInteractStatics = iInteractStatics;
    }

    public void setRemoteRenderEventHandler(RemoteRenderEventHandler remoteRenderEventHandler) {
        this.mRemoteRenderEventHandler = remoteRenderEventHandler;
    }

    public void setRtcDeliverType(int i) {
        this.mRtcDeliverType = i;
    }

    public void setSingleViewMode(boolean z) {
        this.mSingleViewMode = z;
    }

    public void setVideoFrameCallback(Client.ICatchedVideoFrameCallback iCatchedVideoFrameCallback) {
        this.mVideoFrameCallback = iCatchedVideoFrameCallback;
    }

    public void setVideoSinkFactory(VideoSinkFactory videoSinkFactory) {
        this.mVideoSinkFactory = videoSinkFactory;
    }

    public void setViewType(Config.ViewType viewType) {
        this.mViewType = viewType;
    }

    public void setWorkHandler(Handler handler) {
        this.mWorkHandler = handler;
    }
}
