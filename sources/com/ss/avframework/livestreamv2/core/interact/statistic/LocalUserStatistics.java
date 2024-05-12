package com.ss.avframework.livestreamv2.core.interact.statistic;

import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.avframework.livestreamv2.core.interact.InteractEngine;
import com.ss.bytertc.engine.type.LocalAudioStats;
import com.ss.bytertc.engine.type.LocalVideoStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamReport;
import com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl;
import com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.utils.NumberUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LocalUserStatistics {
    public long mLastStatTimestamp;
    public LocalUserInteractConnectionStatisticInfo mLocalUserInteractConnectionStatisticInfo;
    public final boolean mNeedReportLiveCoreInfo;
    public int mNetWorkQuality;
    public int mOnLocalVideoStatsCount;
    public int mOnRtcStatsCount;
    public float mReceiveAudioBitrate;
    public float mReceiveVideoBitrate;
    public float mSendAudioBitrate;
    public float mSendVideoBitrate;
    public int mSendVideoEncoderHeight;
    public float mSendVideoEncoderOutputFrameRate;
    public int mSendVideoEncoderWidth;
    public float mSendVideoFrameRate;
    public float mSendVideoRendererOutputFrameRate;
    public final LiveStreamReport mStaticReport = new LiveStreamReport();
    public int mUserCount;
    public int mVideoSourceFrameCount;
    public int mVideoSourceHeight;
    public int mVideoSourceWidth;

    public LocalUserInteractConnectionStatisticInfo getInteractConnectionStatistic() {
        if (this.mLocalUserInteractConnectionStatisticInfo == null) {
            this.mLocalUserInteractConnectionStatisticInfo = new LocalUserInteractConnectionStatisticInfo();
        }
        return this.mLocalUserInteractConnectionStatisticInfo;
    }

    /* loaded from: classes12.dex */
    public class LocalUserStatisticInfo {
        public int mAdaptResHeight;
        public int mAdaptResWidth;
        public JSONObject mAdmStatus;
        public int mAudioSourceFrameRate;
        public long mCamAvgFps;
        public long mCamCaptureHeight;
        public long mCamCaptureWidth;
        public long mCamExposureTime;
        public long mCamISOInfo;
        public double mCamResultFps;
        public int mCamType;
        public JSONObject mCameraStatus;
        public int mCurrentCaptureDevice;
        public int mEncodeHeight;
        public int mEncodeWidth;
        public long mFilterNoBufferCnt;
        public String mFpsRange;
        public float mInCapFps;
        public String mLastMessage;
        public boolean mLiveCoreAecStatus;
        public boolean mLiveCoreHeadset;
        public String mLocalMicVolumedB;
        public int mNetWorkQuality;
        public float mOutCapFps;
        public float mPreviewFps;
        public String mRMS;
        public int mReceiveAudioBitrate;
        public int mReceiveVideoBitrate;
        public int mRtcPushElapseMs;
        public int mSendAudioBitrate;
        public int mSendVideoBitrate;
        public int mSendVideoEncoderOutputFrameRate;
        public int mSendVideoFrameRate;
        public int mSendVideoRendererOutputFrameRate;
        public int mUserCount;
        public String mVideoFrameElapse;
        public int mVideoSourceFrameRate;
        public int mVideoSourceHeight;
        public int mVideoSourceWidth;

        public LocalUserStatisticInfo() {
        }
    }

    public LocalUserStatistics(boolean z) {
        this.mNeedReportLiveCoreInfo = z;
    }

    public synchronized LocalUserStatisticInfo getStatisticResult(LiveCore liveCore) {
        LocalUserStatisticInfo localUserStatisticInfo;
        long j;
        double d;
        IAudioDeviceControl.IAudioTrack track;
        localUserStatisticInfo = new LocalUserStatisticInfo();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.mLastStatTimestamp;
        if (j2 > 0 && currentTimeMillis > j2) {
            j = currentTimeMillis - j2;
        } else {
            j = 0;
        }
        localUserStatisticInfo.mSendAudioBitrate = (int) this.mSendAudioBitrate;
        localUserStatisticInfo.mReceiveAudioBitrate = (int) this.mReceiveAudioBitrate;
        localUserStatisticInfo.mSendVideoBitrate = (int) this.mSendVideoBitrate;
        localUserStatisticInfo.mReceiveVideoBitrate = (int) this.mReceiveVideoBitrate;
        localUserStatisticInfo.mUserCount = this.mUserCount;
        localUserStatisticInfo.mSendVideoFrameRate = (int) this.mSendVideoFrameRate;
        localUserStatisticInfo.mSendVideoEncoderOutputFrameRate = (int) this.mSendVideoEncoderOutputFrameRate;
        localUserStatisticInfo.mSendVideoRendererOutputFrameRate = (int) this.mSendVideoRendererOutputFrameRate;
        localUserStatisticInfo.mNetWorkQuality = this.mNetWorkQuality;
        localUserStatisticInfo.mVideoSourceWidth = this.mVideoSourceWidth;
        localUserStatisticInfo.mVideoSourceHeight = this.mVideoSourceHeight;
        if (j <= 0) {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } else {
            d = (this.mVideoSourceFrameCount * 1000.0d) / j;
        }
        localUserStatisticInfo.mVideoSourceFrameRate = (int) d;
        localUserStatisticInfo.mEncodeWidth = this.mSendVideoEncoderWidth;
        localUserStatisticInfo.mEncodeHeight = this.mSendVideoEncoderHeight;
        if (liveCore != null) {
            if (this.mNeedReportLiveCoreInfo) {
                liveCore.getLiveCoreReportInfo(this.mStaticReport);
                this.mStaticReport.getVideoSourceDeliverFps();
                float precision = (float) NumberUtils.setPrecision(this.mStaticReport.getVideoSourceDeliverFps(), 2);
                localUserStatisticInfo.mOutCapFps = precision;
                localUserStatisticInfo.mPreviewFps = precision;
                localUserStatisticInfo.mVideoFrameElapse = this.mStaticReport.getVideoFrameElapseV2();
                localUserStatisticInfo.mCamExposureTime = this.mStaticReport.getLong("camera_average_exposure_time");
                localUserStatisticInfo.mCamAvgFps = this.mStaticReport.getLong("camera_average_fps");
                localUserStatisticInfo.mCamISOInfo = this.mStaticReport.getLong("camera_iso_info");
                localUserStatisticInfo.mCamCaptureWidth = this.mStaticReport.getInt("camera_capture_width");
                localUserStatisticInfo.mCamCaptureHeight = this.mStaticReport.getInt("camera_capture_height");
                localUserStatisticInfo.mCamType = this.mStaticReport.getInt("camera_type");
                localUserStatisticInfo.mCurrentCaptureDevice = this.mStaticReport.getInt("current_capture_device");
                localUserStatisticInfo.mCamResultFps = this.mStaticReport.getDouble("camera_avg_result_fps");
                localUserStatisticInfo.mFpsRange = this.mStaticReport.getString("camera_fps_range");
                localUserStatisticInfo.mFilterNoBufferCnt = this.mStaticReport.getLong("nobuffercnt");
            }
            AudioDeviceModule adm = liveCore.getADM();
            if (adm != null) {
                int option = (int) adm.getOption(1);
                int option2 = (int) adm.getOption(2);
                int option3 = (int) adm.getOption(3);
                int option4 = (int) adm.getOption(8);
                int option5 = (int) adm.getOption(9);
                IAudioDeviceControl audioDeviceControl = liveCore.getAudioDeviceControl();
                if (audioDeviceControl != null && (track = audioDeviceControl.getTrack(InteractEngine.AUDIO_LAYER_NAME)) != null) {
                    option5 = (int) track.getOption(1);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(option);
                LIZ.append(",");
                LIZ.append(option2);
                LIZ.append(",");
                LIZ.append(option3);
                LIZ.append(",");
                LIZ.append(0);
                LIZ.append(",");
                LIZ.append(option5);
                LIZ.append(",");
                LIZ.append(option4);
                localUserStatisticInfo.mRMS = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("");
                LIZ2.append(option);
                LIZ2.append(",");
                LIZ2.append(option2);
                LIZ2.append(",");
                LIZ2.append(option3);
                LIZ2.append(",-");
                localUserStatisticInfo.mLocalMicVolumedB = X1D.LIZIZ(LIZ2);
                localUserStatisticInfo.mLiveCoreAecStatus = adm.isEnableBuiltInAEC();
                localUserStatisticInfo.mLiveCoreHeadset = adm.isHeadSet();
                localUserStatisticInfo.mAdmStatus = adm.getReportJsonStats();
            }
            IVideoCapturerControl videoCapturerControl = liveCore.getVideoCapturerControl();
            if (videoCapturerControl != null) {
                localUserStatisticInfo.mInCapFps = videoCapturerControl.getInCaptureRealFps();
                JSONObject realCameraStatus = videoCapturerControl.getRealCameraStatus();
                if (realCameraStatus != null) {
                    localUserStatisticInfo.mCameraStatus = new JSONObject();
                    try {
                        synchronized (realCameraStatus) {
                            if (!realCameraStatus.isNull("mipmap")) {
                                localUserStatisticInfo.mCameraStatus.put("mipmap", realCameraStatus.get("mipmap"));
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        this.mLastStatTimestamp = currentTimeMillis;
        this.mOnRtcStatsCount = 0;
        this.mSendAudioBitrate = 0.0f;
        this.mReceiveAudioBitrate = 0.0f;
        this.mSendVideoBitrate = 0.0f;
        this.mReceiveVideoBitrate = 0.0f;
        this.mUserCount = 0;
        this.mOnLocalVideoStatsCount = 0;
        this.mSendVideoFrameRate = 0.0f;
        this.mSendVideoEncoderOutputFrameRate = 0.0f;
        this.mSendVideoRendererOutputFrameRate = 0.0f;
        this.mNetWorkQuality = 0;
        this.mVideoSourceWidth = 0;
        this.mVideoSourceHeight = 0;
        this.mVideoSourceFrameCount = 0;
        return localUserStatisticInfo;
    }

    public synchronized void onLocalAudioStats(LocalAudioStats localAudioStats) {
    }

    public synchronized void onLocalNetworkQuality(int i) {
        this.mNetWorkQuality = i;
    }

    public synchronized void onLocalVideoStats(LocalVideoStats localVideoStats) {
        float f = localVideoStats.sentFrameRate;
        float f2 = this.mSendVideoFrameRate;
        int i = this.mOnLocalVideoStatsCount;
        this.mSendVideoFrameRate = ((f2 * i) + f) / (i + 1);
        this.mSendVideoEncoderOutputFrameRate = ((this.mSendVideoEncoderOutputFrameRate * i) + localVideoStats.encoderOutputFrameRate) / (i + 1);
        this.mSendVideoRendererOutputFrameRate = ((this.mSendVideoRendererOutputFrameRate * i) + localVideoStats.rendererOutputFrameRate) / (i + 1);
        this.mOnLocalVideoStatsCount = i + 1;
        this.mSendVideoEncoderWidth = localVideoStats.encodedFrameWidth;
        this.mSendVideoEncoderHeight = localVideoStats.encodedFrameHeight;
    }

    public synchronized void onRtcStats(RTCRoomStats rTCRoomStats) {
        float f = rTCRoomStats.txAudioKBitRate;
        float f2 = this.mSendAudioBitrate;
        int i = this.mOnRtcStatsCount;
        this.mSendAudioBitrate = ((f2 * i) + f) / (i + 1);
        this.mReceiveAudioBitrate = ((this.mReceiveAudioBitrate * i) + rTCRoomStats.rxAudioKBitRate) / (i + 1);
        this.mSendVideoBitrate = ((this.mSendVideoBitrate * i) + rTCRoomStats.txVideoKBitRate) / (i + 1);
        this.mReceiveVideoBitrate = ((this.mReceiveVideoBitrate * i) + rTCRoomStats.rxVideoKBitRate) / (i + 1);
        this.mUserCount = rTCRoomStats.users;
        this.mOnRtcStatsCount = i + 1;
    }

    public synchronized void onVideoSourceFrame(int i, int i2, long j) {
        this.mVideoSourceWidth = i;
        this.mVideoSourceHeight = i2;
        this.mVideoSourceFrameCount++;
    }
}
