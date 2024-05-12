package com.ss.ttlivestreamer.livestreamv2.log;

import X.AnonymousClass028;
import X.C06460Ne;
import X.C0NY;
import X.C15890jp;
import X.C16880lQ;
import X.C770830u;
import X.V0N;
import X.X1D;
import Y.IDRunnableS6S0101000;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.core.codec.MediaCodecUtils;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.engine.VideoFrameStatistics;
import com.ss.ttlivestreamer.core.opengl.VideoColorRange;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.Monitor;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamReport;
import com.ss.ttlivestreamer.livestreamv2.TransportSendStallStatics;
import com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.filter.FilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService;
import com.ss.ttlivestreamer.livestreamv2.utils.NumberUtils;
import defpackage.b1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LiveStreamLogService implements Handler.Callback {
    public int mAudioBitrate;
    public final TransportSendStallStatics mConnectEndStatistic;
    public int mDefaultVideoBitrate;
    public int mFpsAdjustTimes;
    public long mInCapFps0Count;
    public long mInterval;
    public long mLastBitRate;
    public final LiveCore mLiveCore;
    public final LiveStream mLiveStream;
    public final int mLogFieldMask;
    public final Handler mLogUploadThreadHandler;
    public final ILogUploader mLogUploader;
    public int mLongerPackageDelayTimes;
    public int mMaxVideoBitrate;
    public int mMinVideoBitrate;
    public final boolean mNeedReportVideoMixerInfo;
    public long mPreFpsNon0EncFps0Count;
    public long mPushStartTime;
    public long mPushStreamCount;
    public int mPushStreamFlag;
    public int mPushStreamResultReportSecond;
    public final TransportSendStallStatics mPushStreamStatistic;
    public int mRateAdjustTimes;
    public int mRateAdjustUpTimes;
    public int mReconnectTimes;
    public boolean mStarted;
    public final LiveStreamReport mStaticsReport;
    public int mTextureFrameCallbackCount;
    public int mVideoHeight;
    public int mVideoWidth;
    public Handler mWorkThreadHandler;
    public String mRemoteIP = "";
    public final StringBuffer mTransportStats = new StringBuffer();
    public final StringBuffer mPushStreamStallStats = new StringBuffer();
    public final StringBuffer mPushAvoCacheInfo = new StringBuffer();
    public long mRtmpConnectingTime = 0;
    public long mRtmpReConnectingTime = 0;
    public int mLastErrorCode = 200;
    public int mErrorCount = 0;
    public boolean mIsFirstConnect = false;
    public int mEnableCertVerify = 0;
    public int[] mAdaptedResolution = new int[2];
    public long mAudioEncoderErrorCode = 0;
    public long mVideoEncoderErrorCode = 0;
    public int mAudioDeviceOpenErrorCode = 0;
    public int mVideoDeviceOpenErrorCode = 0;
    public int mEnableReportSenStallLog = 0;
    public long mSandboxProceedCost = -1;
    public long mPreBwe = 0;
    public long mPreRTT = 0;
    public double mPreLossRate = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public final Runnable mPushStreamResultTimer = new IDRunnableS6S0101000(11, this, 4);
    public int mPushStreamResultErrorCode = -1;
    public int mIsStopPushStreamManually = 0;
    public long mPushStreamResultStartTime = -1;
    public boolean mReportPublishInfo = false;
    public final String VELIVE_LOG_TAG = "velive_log_tag";
    public final String[] appendInfoEventKeys = {"connect_start", "connect_end", "connect_result"};

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$1 */
    /* loaded from: classes12.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ JSONObject val$msg;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$1__run$___twin___() {
            AVLog.logKibana(4, "Adjust videoEncodeFps", r2.toString(), null);
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            boolean LIZ;
            try {
                anonymousClass1.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$1__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass1(JSONObject jSONObject) {
            r2 = jSONObject;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$10 */
    /* loaded from: classes12.dex */
    public class AnonymousClass10 implements Runnable {
        public final /* synthetic */ int val$errorCode;
        public final /* synthetic */ int val$errorType;
        public final /* synthetic */ String val$finalMsg;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$10__run$___twin___() {
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    createCommonLog.put("event_key", "live_ext_shutdown").put("error_type", r4).put("error_code", r5).put("msg", r6);
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
            boolean LIZ;
            try {
                anonymousClass10.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$10__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass10(long j, int i, int i2, String str) {
            r2 = j;
            r4 = i;
            r5 = i2;
            r6 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$11 */
    /* loaded from: classes12.dex */
    public class AnonymousClass11 implements Runnable {
        public final /* synthetic */ int val$adjust;
        public final /* synthetic */ String val$adjustment;
        public final /* synthetic */ long val$bitRate;
        public final /* synthetic */ int val$maxBitrate;
        public final /* synthetic */ int val$minBitrate;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$11__run$___twin___() {
            StringBuilder LIZ;
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    JSONObject put = createCommonLog.put("event_key", "bitrate_adjust").put("bitrate_beforeadjust", LiveStreamLogService.this.mLastBitRate).put("bitrate_afteradjust", r4).put("min_bitrate", r6).put("max_bitrate", r7);
                    if (r8 > 0) {
                        LIZ = X1D.LIZ();
                        LIZ.append("up-");
                        LIZ.append(r9);
                    } else {
                        LIZ = X1D.LIZ();
                        LIZ.append("down-");
                        LIZ.append(r9);
                    }
                    put.put("adjustment", X1D.LIZIZ(LIZ));
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            LiveStreamLogService.this.mLastBitRate = r4;
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
            boolean LIZ;
            try {
                anonymousClass11.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$11__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass11(long j, long j2, int i, int i2, int i3, String str) {
            r2 = j;
            r4 = j2;
            r6 = i;
            r7 = i2;
            r8 = i3;
            r9 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$12 */
    /* loaded from: classes12.dex */
    public class AnonymousClass12 implements Runnable {
        public final /* synthetic */ int val$adjustFps;
        public final /* synthetic */ String val$adjustment;
        public final /* synthetic */ int val$maxFps;
        public final /* synthetic */ int val$minFps;
        public final /* synthetic */ int val$oldFps;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$12__run$___twin___() {
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    createCommonLog.put("event_key", "fps_adjust").put("fps_beforeadjust", r4).put("fps_afteradjust", r5).put("min_fps", r6).put("max_fps", r7).put("adjustment", r8).put("adjust_step", Math.abs(r5 - r4));
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
            boolean LIZ;
            try {
                anonymousClass12.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$12__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass12(long j, int i, int i2, int i3, int i4, String str) {
            r2 = j;
            r4 = i;
            r5 = i2;
            r6 = i3;
            r7 = i4;
            r8 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$13 */
    /* loaded from: classes12.dex */
    public class AnonymousClass13 implements Runnable {
        public final /* synthetic */ int val$adjustBitrate;
        public final /* synthetic */ long val$timeCost;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$13__run$___twin___() {
            int i;
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    JSONObject put = createCommonLog.put("event_key", "bitrate_adjust_timecost");
                    if (r4 > 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    put.put("adjustment", i).put("adjust_step", Math.abs(r4)).put("adjust_time_cost", r5);
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
            boolean LIZ;
            try {
                anonymousClass13.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$13__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass13(long j, int i, long j2) {
            r2 = j;
            r4 = i;
            r5 = j2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$14 */
    /* loaded from: classes12.dex */
    public class AnonymousClass14 implements Runnable {
        public final /* synthetic */ int val$errorCode;
        public final /* synthetic */ String val$message;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$14__run$___twin___() {
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    createCommonLog.put("event_key", "push_stream_fail").put("message", r4).put("error_code", r5);
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
            boolean LIZ;
            try {
                anonymousClass14.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$14__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass14(long j, String str, int i) {
            r2 = j;
            r4 = str;
            r5 = i;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$15 */
    /* loaded from: classes12.dex */
    public class AnonymousClass15 implements Runnable {
        public final /* synthetic */ int val$timeCost;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$15__run$___twin___() {
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    createCommonLog.put("event_key", "send_package_slow").put("send_package_duration", r4);
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass15 anonymousClass15) {
            boolean LIZ;
            try {
                anonymousClass15.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$15__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass15(long j, int i) {
            r2 = j;
            r4 = i;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$16 */
    /* loaded from: classes12.dex */
    public class AnonymousClass16 implements Runnable {
        public final /* synthetic */ float val$capture0FpsRatio;
        public final /* synthetic */ float val$encode0FpsRatio;
        public final /* synthetic */ int val$height;
        public final /* synthetic */ long val$pushStreamCount;
        public final /* synthetic */ int val$status;
        public final /* synthetic */ long val$timestamp;
        public final /* synthetic */ int val$width;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$16__run$___twin___() {
            TransportSendStallStatics transportSendStallStatics;
            TransportSendStallStatics transportSendStallStatics2;
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    JSONObject put = createCommonLog.put("event_key", "connect_end").put("state", r4).put("reconnect_count", LiveStreamLogService.this.mReconnectTimes).put("width", r5).put("height", r6).put("error_code", LiveStreamLogService.this.mLastErrorCode).put("error_count", LiveStreamLogService.this.mErrorCount).put("first_connect", LiveStreamLogService.this.mIsFirstConnect).put("rate_adjust_times", LiveStreamLogService.this.mRateAdjustTimes).put("rate_adjust_up_times", LiveStreamLogService.this.mRateAdjustUpTimes);
                    LiveStreamLogService liveStreamLogService = LiveStreamLogService.this;
                    put.put("rate_adjust_down_times", liveStreamLogService.mRateAdjustTimes - liveStreamLogService.mRateAdjustUpTimes).put("fps_adjust_times", LiveStreamLogService.this.mFpsAdjustTimes).put("video_encode_error_code", LiveStreamLogService.this.mVideoEncoderErrorCode).put("audio_encode_error_code", LiveStreamLogService.this.mAudioEncoderErrorCode).put("send_package_slow_times", LiveStreamLogService.this.mLongerPackageDelayTimes).put("push_duration", r2 - LiveStreamLogService.this.mPushStartTime).put("push_stream_count", r7).put("capture_0fps_ratio", r9).put("encode_0fps_ratio", r10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("omx_info", MediaCodecUtils.getOmxInfo());
                    createCommonLog.put("message", jSONObject);
                    LiveStreamLogService liveStreamLogService2 = LiveStreamLogService.this;
                    if (liveStreamLogService2.mEnableReportSenStallLog > 0 && (transportSendStallStatics = liveStreamLogService2.mPushStreamStatistic) != null && (transportSendStallStatics2 = liveStreamLogService2.mConnectEndStatistic) != null) {
                        transportSendStallStatics2.accumulate(transportSendStallStatics);
                        LiveStreamLogService.this.mConnectEndStatistic.getTransportSendStallLog(createCommonLog);
                        LiveStreamLogService.this.mConnectEndStatistic.reset();
                    }
                    LiveStreamLogService.this.appendAVCodecProfileToLog(createCommonLog);
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                LiveStreamLogService liveStreamLogService3 = LiveStreamLogService.this;
                liveStreamLogService3.mPushStartTime = 0L;
                liveStreamLogService3.mLastErrorCode = 200;
                liveStreamLogService3.mErrorCount = 0;
                liveStreamLogService3.mIsFirstConnect = false;
                liveStreamLogService3.mPushStreamCount = 0L;
                liveStreamLogService3.mInCapFps0Count = 0L;
                liveStreamLogService3.mPreFpsNon0EncFps0Count = 0L;
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass16 anonymousClass16) {
            boolean LIZ;
            try {
                anonymousClass16.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$16__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass16(long j, int i, int i2, int i3, long j2, float f, float f2) {
            r2 = j;
            r4 = i;
            r5 = i2;
            r6 = i3;
            r7 = j2;
            r9 = f;
            r10 = f2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$2 */
    /* loaded from: classes12.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ long val$clockMs;
        public final /* synthetic */ boolean val$isInterrupt;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$2__run$___twin___() {
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("clockMs", r4);
                    jSONObject.put("interrupt", r6);
                    createCommonLog.put("event_key", "session_interrupt").put("message", jSONObject.toString());
                    ILogUploader iLogUploader = LiveStreamLogService.this.mLogUploader;
                    if (iLogUploader != null) {
                        iLogUploader.uploadLog(createCommonLog);
                    }
                } catch (JSONException unused) {
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
            boolean LIZ;
            try {
                anonymousClass2.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$2__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass2(long j, long j2, boolean z) {
            r2 = j;
            r4 = j2;
            r6 = z;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$3 */
    /* loaded from: classes12.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ long val$clockMs;
        public final /* synthetic */ int val$error_code;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$3__run$___twin___() {
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("clockMs", r4);
                    jSONObject.put("error_code", r6);
                    createCommonLog.put("event_key", "lw_reconnect_start").put("message", jSONObject.toString()).put("error_code", r6);
                    ILogUploader iLogUploader = LiveStreamLogService.this.mLogUploader;
                    if (iLogUploader != null) {
                        iLogUploader.uploadLog(createCommonLog);
                    }
                } catch (JSONException unused) {
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
            boolean LIZ;
            try {
                anonymousClass3.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$3__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass3(long j, long j2, int i) {
            r2 = j;
            r4 = j2;
            r6 = i;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$4 */
    /* loaded from: classes12.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ long val$clockMs;
        public final /* synthetic */ int val$costTime;
        public final /* synthetic */ long val$count;
        public final /* synthetic */ boolean val$success;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$4__run$___twin___() {
            int i;
            int i2;
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    JSONObject put = createCommonLog.put("event_key", "lw_reconnect_stop");
                    if (r4) {
                        i = 0;
                    } else {
                        i = r5;
                    }
                    JSONObject put2 = put.put("error_code", i);
                    if (r4) {
                        i2 = r5;
                    } else {
                        i2 = -1;
                    }
                    put2.put("cost_time", i2).put("reconnect_count", r6).put("clockMs", r8);
                    createCommonLog.put("message", createCommonLog.toString());
                    ILogUploader iLogUploader = LiveStreamLogService.this.mLogUploader;
                    if (iLogUploader != null) {
                        iLogUploader.uploadLog(createCommonLog);
                    }
                } catch (JSONException unused) {
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
            boolean LIZ;
            try {
                anonymousClass4.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$4__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass4(long j, boolean z, int i, long j2, long j3) {
            r2 = j;
            r4 = z;
            r5 = i;
            r6 = j2;
            r8 = j3;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$5 */
    /* loaded from: classes12.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ long val$clockMs;
        public final /* synthetic */ int val$level;
        public final /* synthetic */ String val$msg;
        public final /* synthetic */ String val$tag;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$5__run$___twin___() {
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("clockMs", r4);
                    jSONObject.put("level", r6);
                    jSONObject.put("tag", r7);
                    jSONObject.put("msg", r8);
                    createCommonLog.put("event_key", "live_sdk_log").put("message", jSONObject.toString());
                    ILogUploader iLogUploader = LiveStreamLogService.this.mLogUploader;
                    if (iLogUploader != null) {
                        iLogUploader.uploadLog(createCommonLog);
                    }
                } catch (JSONException unused) {
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
            boolean LIZ;
            try {
                anonymousClass5.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$5__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass5(long j, long j2, int i, String str, String str2) {
            r2 = j;
            r4 = j2;
            r6 = i;
            r7 = str;
            r8 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$6 */
    /* loaded from: classes12.dex */
    public class AnonymousClass6 implements Runnable {
        public final /* synthetic */ long val$clockMs;
        public final /* synthetic */ String val$event;
        public final /* synthetic */ int val$level;
        public final /* synthetic */ String val$msg;
        public final /* synthetic */ String val$tag;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$6__run$___twin___() {
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("clockMs", r4);
                    jSONObject.put("level", r6);
                    jSONObject.put("tag", r7);
                    jSONObject.put("msg", r8);
                    createCommonLog.put("event_key", r9).put("message", jSONObject.toString());
                    ILogUploader iLogUploader = LiveStreamLogService.this.mLogUploader;
                    if (iLogUploader != null) {
                        iLogUploader.uploadLog(createCommonLog);
                    }
                } catch (JSONException unused) {
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
            boolean LIZ;
            try {
                anonymousClass6.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$6__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass6(long j, long j2, int i, String str, String str2, String str3) {
            r2 = j;
            r4 = j2;
            r6 = i;
            r7 = str;
            r8 = str2;
            r9 = str3;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$7 */
    /* loaded from: classes12.dex */
    public class AnonymousClass7 implements Runnable {
        public final /* synthetic */ int val$hasFirstConnected;
        public final /* synthetic */ LiveStreamConnectResultEventResult val$result;
        public final /* synthetic */ LiveStreamConnectResultEventSource val$source;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$7__run$___twin___() {
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    createCommonLog.put("event_key", "connect_result").put("scene_code", r4.mScene).put("connect_success", r5.mConnectSuccess).put("has_first_connected", r6).put("retry_cnt", r5.mRetryCount).put("stream_retry_cnt", r5.mStreamRetryCount).put("rtmp_code1", r4.mRtmpCode1).put("rtmp_code2", r4.mRtmpCode2).put("rtmp_code3", r4.mRtmpCode3).put("rtmp_msg", r4.mRtmpMsg);
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
            boolean LIZ;
            try {
                anonymousClass7.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$7__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass7(long j, LiveStreamConnectResultEventSource liveStreamConnectResultEventSource, LiveStreamConnectResultEventResult liveStreamConnectResultEventResult, int i) {
            r2 = j;
            r4 = liveStreamConnectResultEventSource;
            r5 = liveStreamConnectResultEventResult;
            r6 = i;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$8 */
    /* loaded from: classes12.dex */
    public class AnonymousClass8 implements Runnable {
        public final /* synthetic */ long val$dnsTime;
        public final /* synthetic */ int val$errorCode;
        public final /* synthetic */ int val$finalHappenProtocolDowngrade;
        public final /* synthetic */ int val$finalProtocolDowngradeType;
        public final /* synthetic */ boolean val$firstConnect;
        public final /* synthetic */ String val$msg;
        public final /* synthetic */ int val$reconnectCount;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$8__run$___twin___() {
            boolean z;
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    JSONObject put = createCommonLog.put("event_key", "connect_fail");
                    if (r4 == 200) {
                        z = true;
                    } else {
                        z = false;
                    }
                    put.put("connect_status", z).put("error_code", r4).put("error_count", r5).put("first_connect", r6).put("dns_parse_time", r7).put("default_bitrate", LiveStreamLogService.this.mDefaultVideoBitrate).put("min_bitrate", LiveStreamLogService.this.mMinVideoBitrate).put("max_bitrate", LiveStreamLogService.this.mMaxVideoBitrate).put("audio_bitrate", LiveStreamLogService.this.mAudioBitrate).put("message", r9).put("enable_cert_verify", LiveStreamLogService.this.mEnableCertVerify).put("sandbox_proceed_cost", LiveStreamLogService.this.mSandboxProceedCost).put("protocol_downgraded", r10).put("protocol_downgraded_type", r11);
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
            boolean LIZ;
            try {
                anonymousClass8.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$8__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass8(long j, int i, int i2, boolean z, long j2, String str, int i3, int i4) {
            r2 = j;
            r4 = i;
            r5 = i2;
            r6 = z;
            r7 = j2;
            r9 = str;
            r10 = i3;
            r11 = i4;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$9 */
    /* loaded from: classes12.dex */
    public class AnonymousClass9 implements Runnable {
        public final /* synthetic */ int val$quicDownGradeErrorCode;
        public final /* synthetic */ int val$reconnectCount;
        public final /* synthetic */ long val$timestamp;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$9__run$___twin___() {
            JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
            if (createCommonLog != null) {
                try {
                    createCommonLog.put("event_key", "protocol_downgrade").put("error_code", r4).put("error_count", r5);
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
            boolean LIZ;
            try {
                anonymousClass9.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$9__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass9(long j, int i, int i2) {
            r2 = j;
            r4 = i;
            r5 = i2;
        }
    }

    public void reportPushStreamResult() {
        boolean z;
        long nativeNanoTime = TimeUtils.nativeNanoTime() / 1000000;
        long currentTimeMillis = System.currentTimeMillis();
        LiveStream liveStream = this.mLiveStream;
        boolean z2 = false;
        if (liveStream != null) {
            z = liveStream.getStartServerMixWhilePushStream();
        } else {
            z = false;
        }
        int i = this.mPushStreamResultErrorCode;
        if (i == 200 || z) {
            z2 = true;
        }
        int i2 = this.mIsStopPushStreamManually;
        JSONObject createCommonLog = createCommonLog(currentTimeMillis);
        if (createCommonLog != null) {
            try {
                new JSONObject().put("clockMs", nativeNanoTime);
                createCommonLog.put("event_key", "push_stream_result").put("success", z2).put("error_code", i).put("is_cancelled_manually", i2).put("is_server_mix_started", z).put("upload_interval_mill_second", currentTimeMillis - this.mPushStreamResultStartTime).put("report_time_mill_second", this.mPushStreamResultReportSecond * 1000);
                ILogUploader iLogUploader = this.mLogUploader;
                if (iLogUploader != null) {
                    iLogUploader.uploadLog(createCommonLog);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public void resetPushStreamResultVariable() {
        this.mPushStreamResultErrorCode = -1;
        this.mIsStopPushStreamManually = 0;
    }

    /* loaded from: classes12.dex */
    public enum LongField {
        message,
        adm,
        avo_cache_info,
        transport_layer_status,
        video_filter,
        url,
        video_frame_elapse,
        camera,
        rms,
        adm_status,
        adm_pts_info,
        transport_send_stall,
        push_stream_stall_status,
        roi;

        public static void PrintAllFieldMask() {
            String str;
            LongField[] values = values();
            int length = values.length;
            String str2 = "All LongField's mask: ";
            int i = 0;
            boolean z = true;
            while (i < length) {
                LongField longField = values[i];
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                if (z) {
                    str = "";
                } else {
                    str = ", ";
                }
                LIZ.append(str);
                LIZ.append(longField.name());
                LIZ.append(": ");
                LIZ.append(1 << longField.ordinal());
                str2 = X1D.LIZIZ(LIZ);
                i++;
                z = false;
            }
            StringBuilder LIZJ = b1.LIZJ(str2, ", all: ");
            LIZJ.append((1 << (values[values.length - 1].ordinal() + 1)) - 1);
            LIZJ.append(".");
            AVLog.ioi(C16880lQ.LJLLJ(LongField.class), X1D.LIZIZ(LIZJ));
        }

        public static void PrintAllMaskedField(int i) {
            String str;
            String LIZIZ = C0NY.LIZIZ("mask: ", i, ". These fields are in the mask: ");
            String str2 = "These fields escaped the mask: ";
            boolean z = false;
            boolean z2 = false;
            for (LongField longField : values()) {
                String str3 = ", ";
                if (CheckMask(i, longField)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LIZIZ);
                    if (!z) {
                        str3 = "";
                    }
                    LIZ.append(str3);
                    LIZ.append(longField.name());
                    LIZIZ = X1D.LIZIZ(LIZ);
                    z = true;
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str2);
                    if (!z2) {
                        str3 = "";
                    }
                    LIZ2.append(str3);
                    LIZ2.append(longField.name());
                    str2 = X1D.LIZIZ(LIZ2);
                    z2 = true;
                }
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZIZ);
            String str4 = ".";
            if (z) {
                str = ".";
            } else {
                str = "none.";
            }
            LIZ3.append(str);
            String LIZIZ2 = X1D.LIZIZ(LIZ3);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(str2);
            if (!z2) {
                str4 = "none.";
            }
            LIZ4.append(str4);
            String LIZIZ3 = X1D.LIZIZ(LIZ4);
            String LJLLJ = C16880lQ.LJLLJ(LongField.class);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(LIZIZ2);
            LIZ5.append(" ");
            LIZ5.append(LIZIZ3);
            AVLog.ioi(LJLLJ, X1D.LIZIZ(LIZ5));
        }

        public static LongField valueOf(String str) {
            return (LongField) V0N.LJJJ(LongField.class, str);
        }

        public static boolean CheckMask(int i, LongField longField) {
            if ((i & (1 << longField.ordinal())) != 0) {
                return true;
            }
            return false;
        }
    }

    public /* synthetic */ void lambda$addTextureFrameAvailable$0() {
        this.mTextureFrameCallbackCount++;
    }

    public void pushStreamTimerWork() {
        LiveStream liveStream = this.mLiveStream;
        if (liveStream != null && liveStream.getPushStreamStart()) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("should not report push_stream_result!");
            if (AnonymousClass028.LJI(androidRuntimeException, "LiveStreamLogService.pushStreamTimerWork")) {
                throw androidRuntimeException;
            }
        }
        reportPushStreamResult();
        resetPushStreamResultVariable();
        LiveStream liveStream2 = this.mLiveStream;
        if (liveStream2 != null) {
            liveStream2.setPushStreamStart(true);
        }
    }

    private void report() {
        if (this.mLiveCore == null || this.mLogUploader == null || this.mStaticsReport == null || !this.mStarted) {
            return;
        }
        if (this.mLiveStream.getLiveStreamBuilder().isEnableVelivePusher()) {
            DebugLogUtils.isEnableDebugLog();
            return;
        }
        try {
            this.mLiveCore.getLiveStreamInfo(this.mStaticsReport);
            JSONObject createLog = createLog(this.mStaticsReport);
            if (createLog != null) {
                this.mLogUploader.uploadLog(createLog);
            }
        } catch (JSONException unused) {
        }
        this.mLogUploadThreadHandler.sendEmptyMessageDelayed(101, this.mInterval);
    }

    private void reportVideoMixerInfo() {
        ILayerControl layerControl;
        if (this.mReportPublishInfo) {
            LiveStream liveStream = this.mLiveStream;
            if (liveStream != null) {
                liveStream.reportInputVideoStreamLayersInfo();
            }
        } else {
            LiveCore liveCore = this.mLiveCore;
            if (liveCore != null && (layerControl = liveCore.getLayerControl()) != null) {
                layerControl.reportLayerControlLayersInfo();
            }
        }
        this.mReportPublishInfo = !this.mReportPublishInfo;
    }

    public void addTextureFrameAvailable() {
        Handler handler = this.mLogUploadThreadHandler;
        if (handler == null || !handler.post(new IDRunnableS6S0101000(9, this, 19))) {
            this.mTextureFrameCallbackCount++;
        }
    }

    public void onReconnect() {
        this.mReconnectTimes++;
    }

    public void release() {
        try {
            this.mLogUploadThreadHandler.removeMessages(101);
            this.mLogUploadThreadHandler.removeMessages(102);
        } catch (Throwable unused) {
        }
        reset();
    }

    public void removePushStreamResultTimer() {
        this.mWorkThreadHandler.removeCallbacks(this.mPushStreamResultTimer);
    }

    public void reset() {
        this.mLastBitRate = 0L;
        this.mRateAdjustTimes = 0;
        this.mRateAdjustUpTimes = 0;
        this.mFpsAdjustTimes = 0;
        this.mLongerPackageDelayTimes = 0;
        this.mReconnectTimes = 0;
        this.mRtmpConnectingTime = 0L;
        this.mRtmpReConnectingTime = 0L;
        this.mLastErrorCode = 200;
        this.mErrorCount = 0;
        this.mIsFirstConnect = false;
        this.mAudioEncoderErrorCode = 0L;
        this.mVideoEncoderErrorCode = 0L;
        this.mAudioDeviceOpenErrorCode = 0;
        this.mVideoDeviceOpenErrorCode = 0;
        this.mSandboxProceedCost = -1L;
        this.mEnableReportSenStallLog = 0;
    }

    public void startPeriodReport() {
        this.mLogUploadThreadHandler.removeMessages(101);
        this.mStarted = true;
        this.mLogUploadThreadHandler.sendEmptyMessageDelayed(101, this.mInterval);
    }

    public void stopPeriodReport() {
        this.mLogUploadThreadHandler.removeMessages(101);
        this.mStarted = false;
    }

    public long getPushDuration() {
        return System.currentTimeMillis() - this.mPushStartTime;
    }

    public void onRTMPConnecting() {
        this.mRtmpConnectingTime = System.currentTimeMillis();
    }

    public void reportPushStreamResultLater() {
        this.mPushStreamResultStartTime = System.currentTimeMillis();
        this.mWorkThreadHandler.postDelayed(this.mPushStreamResultTimer, this.mPushStreamResultReportSecond * 1000);
    }

    public int getReconnectTime() {
        return this.mReconnectTimes;
    }

    /* loaded from: classes12.dex */
    public static class LiveStreamLogFilter implements AVLog.ILogFilter {
        public WeakReference<LiveStreamLogService> mLogService;

        public LiveStreamLogFilter(LiveStreamLogService liveStreamLogService) {
            setLogService(liveStreamLogService);
        }

        public void setLogService(LiveStreamLogService liveStreamLogService) {
            this.mLogService = new WeakReference<>(liveStreamLogService);
        }

        @Override // com.ss.ttlivestreamer.core.utils.AVLog.ILogFilter
        public void print(int i, String str, String str2, Throwable th) {
            if (th != null) {
                StringBuilder LIZJ = b1.LIZJ(str2, " Cause:");
                LIZJ.append(Log.getStackTraceString(th));
                str2 = X1D.LIZIZ(LIZJ);
            }
            LiveStreamLogService liveStreamLogService = this.mLogService.get();
            if (liveStreamLogService != null) {
                liveStreamLogService.uploadSDKLog(i, str, str2);
            }
        }

        @Override // com.ss.ttlivestreamer.core.utils.AVLog.ILogFilter
        public void print(int i, String str, String str2, String str3, Throwable th) {
            if (th != null) {
                StringBuilder LIZJ = b1.LIZJ(str3, " Cause:");
                LIZJ.append(Log.getStackTraceString(th));
                str3 = X1D.LIZIZ(LIZJ);
            }
            LiveStreamLogService liveStreamLogService = this.mLogService.get();
            if (liveStreamLogService != null) {
                liveStreamLogService.uploadSDKLogEvent(i, str, str2, str3);
            }
        }
    }

    private void appendNetInfo(JSONObject jSONObject) {
        LiveStream liveStream = this.mLiveStream;
        if (liveStream == null) {
            return;
        }
        if (liveStream.isRtmPush()) {
            long int64Value = this.mLiveStream.getInt64Value(5);
            this.mPreBwe = (int) (4294967295L & int64Value);
            this.mPreRTT = (int) ((281470681743360L & int64Value) >> 32);
            this.mPreLossRate = ((int64Value & (-281474976710656L)) >> 48) / 10000.0d;
        } else {
            long int64Value2 = this.mLiveStream.getInt64Value(2999);
            long int64Value3 = this.mLiveStream.getInt64Value(2001);
            long int64Value4 = this.mLiveStream.getInt64Value(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            long int64Value5 = this.mLiveStream.getInt64Value(2002);
            if (int64Value2 > 0) {
                this.mPreRTT = int64Value3 / int64Value2;
                this.mPreBwe = int64Value4 / int64Value2;
                this.mPreLossRate = int64Value5 / (int64Value2 * 100);
                this.mLiveStream.clearNetInfo();
            }
        }
        try {
            jSONObject.put("rtt", this.mPreRTT).put("bwe", this.mPreBwe).put("loss_rate", this.mPreLossRate);
        } catch (JSONException unused) {
        }
    }

    private String appendNodeOptimizedInfo(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        Long l;
        HashMap<String, List<String>> preparedList = this.mLiveStream.getPreparedList();
        boolean z4 = false;
        if (this.mLiveStream.getLiveStreamBuilder() != null && this.mLiveStream.getLiveStreamBuilder().getNodeOptParams() != null) {
            z = this.mLiveStream.getLiveStreamBuilder().getNodeOptParams().getPreparedIp();
            z2 = this.mLiveStream.getLiveStreamBuilder().getNodeOptParams().getStrategyNodeOpt();
            z3 = this.mLiveStream.getLiveStreamBuilder().getNodeOptParams().getEnableWaitStrategyCallback();
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        String dNSServerIP = this.mLiveStream.getDNSServerIP();
        if (this.mLiveStream.isDnsOptOpen()) {
            z4 = this.mLiveStream.isDnsOptHit();
            str = this.mLiveStream.getEvaluatorSymbol();
            str2 = this.mLiveStream.getRequestId();
        } else {
            str = "";
            str2 = "";
        }
        JSONObject strategynodeOptimizerInfos = this.mLiveStream.getStrategynodeOptimizerInfos();
        long waitStrategyCallbackMs = this.mLiveStream.getWaitStrategyCallbackMs();
        try {
            JSONObject put = new JSONObject().put("hit_node_optimize", z4).put("evaluator_symbol", str).put("enable_node_probe_poll", z).put("node_probe_ips", preparedList).put("enable_strategy_node_opt", z2).put("request_id", str2).put("dns_server_ip", dNSServerIP).put("strategy_node_optimizer_infos", strategynodeOptimizerInfos).put("enable_wait_strategy_callback", z3);
            if (z3) {
                l = Long.valueOf(waitStrategyCallbackMs);
            } else {
                l = null;
            }
            jSONObject.put("node_optimize_info", put.put("wait_strategy_callback_ms", l));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return str;
    }

    private JSONObject appendVeLivePusherMonitorLog(JSONObject jSONObject) {
        double precision;
        String str;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        int i;
        JSONObject jSONObject4;
        JSONObject status;
        AudioDeviceModule adm;
        JSONObject reportJsonStats;
        int i2;
        int i3;
        LiveStreamBuilder liveStreamBuilder = this.mLiveStream.getLiveStreamBuilder();
        String str2 = "";
        String optString = jSONObject.optString("event_key", "");
        for (String str3 : this.appendInfoEventKeys) {
            if (TextUtils.equals(optString, str3)) {
                try {
                    String str4 = liveStreamBuilder.mProjectKey;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    jSONObject.put("project_key", str2);
                } catch (Exception unused) {
                    DebugLogUtils.isEnableDebugLog();
                }
                return jSONObject;
            }
        }
        if (!TextUtils.equals(optString, "push_stream")) {
            DebugLogUtils.isEnableDebugLog();
            return jSONObject;
        }
        IVideoCapturerControl videoCapturerControl = this.mLiveStream.getVideoCapturerControl();
        this.mLiveCore.getLiveStreamInfo(this.mStaticsReport);
        LiveStreamReport liveStreamReport = this.mStaticsReport;
        if (videoCapturerControl == null) {
            precision = -1.0d;
        } else {
            precision = NumberUtils.setPrecision(videoCapturerControl.getInCaptureRealFps(), 2);
        }
        try {
            JSONObject put = jSONObject.put("audio_capture_channel", liveStreamBuilder.getAudioCaptureChannel()).put("audio_capture_sample", liveStreamBuilder.getAudioCaptureSampleHZ()).put("drop_source_fps", NumberUtils.setPrecision(liveStreamReport.getVideoSourceDropFps(), 2)).put("in_cap_fps", precision).put("preview_fps", NumberUtils.setPrecision(liveStreamReport.getVideoSourceDeliverFps(), 2)).put("out_cap_fps", NumberUtils.setPrecision(liveStreamReport.getVideoSourceDeliverFps(), 2)).put("video_capture_width", liveStreamBuilder.getVideoCaptureWidth()).put("video_capture_height", liveStreamBuilder.getVideoCaptureHeight()).put("video_capture_fps", liveStreamBuilder.getVideoCaptureFps()).put("camera_start_error_code", this.mVideoDeviceOpenErrorCode).put("mic_start_error_code", this.mAudioDeviceOpenErrorCode);
            String str5 = liveStreamBuilder.mProjectKey;
            if (str5 == null) {
                str5 = "";
            }
            put.put("project_key", str5);
            if (liveStreamBuilder.getSdkSetting().cameraSizeOptLog && videoCapturerControl != null) {
                jSONObject.put("camera_capture_width", videoCapturerControl.getCameraCaptureWidth());
                jSONObject.put("camera_capture_height", videoCapturerControl.getCameraCaptureHeight());
                jSONObject.put("camera_real_fps_range", videoCapturerControl.getRealCameraFpsRangeStr());
                int videoCaptureDevice = liveStreamBuilder.getVideoCaptureDevice();
                if (videoCaptureDevice == 1 || videoCaptureDevice == 2) {
                    if (videoCapturerControl.isCamera2Like()) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    jSONObject.put("camera_type", i3);
                }
                jSONObject.put("camera_avg_result_fps", videoCapturerControl.getCameraAvgCaptureResultFps());
            }
            if (!jSONObject.has("message")) {
                str = "";
            } else {
                str = JSONObjectProtectorUtils.getString(jSONObject, "message");
            }
            if (TextUtils.isEmpty(str)) {
                jSONObject2 = new JSONObject();
            } else {
                jSONObject2 = new JSONObject(str);
            }
            LiveCore liveCore = this.mLiveCore;
            if (liveCore != null) {
                jSONObject.put("screen_audio_level", liveCore.getScreenAudioLevel());
                if (true == liveStreamBuilder.getPushBase().enableScreenAudioStereoCapture) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                jSONObject.put("screen_audio_channel", i2);
            }
            LiveCore liveCore2 = this.mLiveCore;
            if (liveCore2 != null && (adm = liveCore2.getADM()) != null && !LongField.CheckMask(this.mLogFieldMask, LongField.adm)) {
                int option = (int) adm.getOption(1);
                int option2 = (int) adm.getOption(2);
                int option3 = (int) adm.getOption(3);
                int audioStreamdB = liveStreamReport.getAudioStreamdB();
                int option4 = (int) adm.getOption(9);
                int option5 = (int) adm.getOption(8);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(option);
                LIZ.append(",");
                LIZ.append(option2);
                LIZ.append(",");
                LIZ.append(option3);
                LIZ.append(",");
                LIZ.append(audioStreamdB);
                LIZ.append(",");
                LIZ.append(option4);
                LIZ.append(",");
                LIZ.append(option5);
                String LIZIZ = X1D.LIZIZ(LIZ);
                if (LongField.CheckMask(this.mLogFieldMask, LongField.rms)) {
                    LIZIZ = null;
                }
                jSONObject.put("rms", LIZIZ);
                if (LongField.CheckMask(this.mLogFieldMask, LongField.adm_status)) {
                    reportJsonStats = null;
                } else {
                    reportJsonStats = adm.getReportJsonStats();
                }
                jSONObject2.put("adm_status", reportJsonStats);
                jSONObject2.put("mic_start_error_code", (int) adm.getOption(10));
                jSONObject2.put("au_ahs", adm.isHeadSet());
                jSONObject2.put("enable_ear_monitoring", adm.isEchoMode());
                jSONObject2.put("is_support_hardware_ear_monitoring", adm.nativeIsSupportHardwareEarMonitor());
                jSONObject2.put("au_rnfe", (int) adm.getOption(12));
                jSONObject2.put("au_pnfe", (int) adm.getOption(13));
                jSONObject2.put("au_pe", (int) adm.getOption(14));
                jSONObject2.put("au_iee", (int) adm.getOption(15));
                JSONObject put2 = new JSONObject().put("reset_pts_index", adm.getResetPtsIndex()).put("syn_mode", liveStreamBuilder.getPushBase().timestampSynMode).put("capture_time", adm.getLatestAudioPts() / 1000).put("capture_time_diff", adm.getCaptureTimeDiff()).put("now_time_diff", adm.getNowTimeDiff());
                if (LongField.CheckMask(this.mLogFieldMask, LongField.adm_pts_info)) {
                    put2 = null;
                }
                jSONObject2.put("adm_pts_info", put2);
                adm.clearLogState();
            }
            jSONObject2.put("ttlivestreamer_live_sdk_version", MediaEngineFactory.nativeGetVersion());
            int videoCaptureDevice2 = liveStreamBuilder.getVideoCaptureDevice();
            if ((videoCaptureDevice2 == 1 || videoCaptureDevice2 == 2) && !LongField.CheckMask(this.mLogFieldMask, LongField.camera)) {
                if (videoCapturerControl == null || (jSONObject3 = videoCapturerControl.getRealCameraStatus()) == null) {
                    jSONObject3 = new JSONObject();
                }
                if (liveStreamBuilder.isVECamera2API()) {
                    i = 2;
                } else {
                    i = 1;
                }
                jSONObject3.put("expected_camera_type", i);
                jSONObject2.put("camera", jSONObject3);
            }
            if (!LongField.CheckMask(this.mLogFieldMask, LongField.camera)) {
                jSONObject2.put("averageExposureTime", liveStreamReport.getCameraAverageExposureTime());
                jSONObject2.put("averageCameraFps", liveStreamReport.getCameraAvgFps());
                jSONObject2.put("cameraISOInfo", liveStreamReport.getISOInfo());
            }
            if (liveStreamBuilder.isEnableVideoFrameStatistics() && !LongField.CheckMask(this.mLogFieldMask, LongField.video_frame_elapse)) {
                String optString2 = jSONObject2.optString("video_frame_elapse", "");
                String optString3 = jSONObject2.optString("video_frame_elapse_v2", "");
                jSONObject2.put("video_frame_elapse", liveStreamReport.getVideoFrameElapseTTLiveStreamerFixed(optString2));
                jSONObject2.put("video_frame_elapse_v2", liveStreamReport.getVideoFrameElapseV2TTLiveStreamerFixed(optString3));
                jSONObject2.put("nobuffercnt", this.mLiveStream.getFilterNoBufferCountAndClear());
            }
            String optString4 = jSONObject2.optString("video_filter", "");
            if (TextUtils.isEmpty(optString4)) {
                jSONObject4 = new JSONObject();
            } else {
                jSONObject4 = new JSONObject(optString4);
            }
            IFilterManager videoFilterMgr = this.mLiveStream.getVideoFilterMgr();
            if ((videoFilterMgr instanceof FilterManager) && (status = ((FilterManager) videoFilterMgr).getStatus()) != null && !LongField.CheckMask(this.mLogFieldMask, LongField.video_filter)) {
                Iterator<String> keys = status.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject4.put(next, status.optString(next, ""));
                }
                jSONObject2.put("video_filter", jSONObject4);
            }
            jSONObject.put("message", jSONObject2.toString());
        } catch (Exception unused2) {
            DebugLogUtils.isEnableDebugLog();
        }
        return jSONObject;
    }

    private JSONObject createLog(LiveStreamReport liveStreamReport) {
        LiveStream liveStream;
        double precision;
        int i;
        String str;
        int i2;
        String str2;
        String str3;
        AudioDeviceModule audioDeviceModule;
        JSONObject jSONObject;
        int i3;
        JSONObject jSONObject2;
        String jSONObject3;
        JSONObject reportJsonStats;
        int i4;
        int videoCaptureDevice;
        int i5;
        JSONObject createCommonLog = createCommonLog(System.currentTimeMillis());
        if (createCommonLog == null || liveStreamReport == null || (liveStream = this.mLiveStream) == null) {
            return null;
        }
        LiveStreamBuilder liveStreamBuilder = liveStream.getLiveStreamBuilder();
        IVideoCapturerControl videoCapturerControl = this.mLiveStream.getVideoCapturerControl();
        if (liveStreamBuilder == null) {
            return null;
        }
        appendAVCodecProfileToLog(createCommonLog);
        JSONObject put = createCommonLog.put("video_capture_type", liveStreamBuilder.getVideoCaptureDevice()).put("cpu", Monitor.getAppPrecentageOnCPU()).put("memory", Monitor.nativeGetAppRSSKB());
        int i6 = this.mPushStreamFlag;
        this.mPushStreamFlag = 0;
        if (videoCapturerControl == null) {
            precision = -1.0d;
        } else {
            precision = NumberUtils.setPrecision(videoCapturerControl.getInCaptureRealFps(), 2);
        }
        double precision2 = NumberUtils.setPrecision(liveStreamReport.getVideoSourceDeliverFps(), 2);
        double precision3 = NumberUtils.setPrecision(liveStreamReport.getVideoEncodeRealFps(), 2);
        if (this.mPushStartTime != 0) {
            this.mPushStreamCount++;
            if (precision == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                this.mInCapFps0Count++;
            }
            if (precision2 != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && precision3 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                this.mPreFpsNon0EncFps0Count++;
            }
        }
        int videoTransportRealBps = ((int) liveStreamReport.getVideoTransportRealBps()) / 1000;
        int videoEncodeRealBps = ((int) liveStreamReport.getVideoEncodeRealBps()) / 1000;
        this.mDefaultVideoBitrate = liveStreamBuilder.getVideoBitrate() / 1000;
        this.mMinVideoBitrate = liveStreamBuilder.getVideoMinBitrate() / 1000;
        this.mMaxVideoBitrate = liveStreamBuilder.getVideoMaxBitrate() / 1000;
        this.mAudioBitrate = liveStreamBuilder.getAudioBitrate() / 1000;
        if (!liveStreamBuilder.isEnableVideoEncodeAccelera()) {
            i = VideoColorRange.checkRgb2YuvFormulaColorRange();
        } else {
            i = -1;
        }
        if (i == 0) {
            str = "FullRange";
        } else if (i == 1) {
            str = "VideoRange";
        } else {
            str = "Unknown";
        }
        JSONObject put2 = put.put("event_key", "push_stream").put("flag", i6).put("audio_channel", liveStreamBuilder.getAudioChannel()).put("audio_enc_bitrate", ((int) liveStreamReport.getAudioEncodeRealBps()) / 1000).put("audio_sample", liveStreamBuilder.getAudioSampleHZ()).put("audio_capture_channel", liveStreamBuilder.getAudioCaptureChannel()).put("audio_capture_sample", liveStreamBuilder.getAudioCaptureSampleHZ()).put("drop_source_fps", NumberUtils.setPrecision(liveStreamReport.getVideoSourceDropFps(), 2)).put("drop_count", ((int) liveStreamReport.getVideoDropCount()) + ((int) liveStreamReport.getTransportDropCount())).put("transport_drop_count", (int) liveStreamReport.getTransportDropCount()).put("duration", liveStreamReport.getTransportDuration()).put("encode_fps", precision3).put("height", liveStreamBuilder.getVideoHeight());
        if (liveStreamBuilder.getVideoFps() != 0) {
            i2 = this.mLiveStream.getVideoGop() / liveStreamBuilder.getVideoFps();
        } else {
            i2 = 0;
        }
        JSONObject put3 = put2.put("i_key_frame_max", i2).put("in_cap_fps", precision).put("meta_audio_bitrate", this.mAudioBitrate).put("meta_video_bitrate", this.mLiveStream.getVideoMetaBitRate() / 1000).put("max_video_bitrate", this.mMaxVideoBitrate).put("min_video_bitrate", this.mMinVideoBitrate).put("meta_video_framerate", liveStreamBuilder.getVideoFps()).put("preview_fps", precision2).put("out_cap_fps", NumberUtils.setPrecision(liveStreamReport.getVideoSourceDeliverFps(), 2)).put("package_delay", (int) (liveStreamReport.getTransportPackageAverageDelay() + 0.5d)).put("real_bitrate", videoTransportRealBps).put("network_quality", this.mLiveStream.getInt64Value(3000)).put("real_video_framerate", NumberUtils.setPrecision(liveStreamReport.getVideoTransportRealFps(), 2)).put("rtmp_buffer_time", this.mLiveStream.getInt64Value(1)).put("venc_max_cont_b", this.mLiveStream.getInt64Value(1001));
        String str4 = "null";
        if (this.mTransportStats.length() == 0 || LongField.CheckMask(this.mLogFieldMask, LongField.transport_layer_status)) {
            str2 = "null";
        } else {
            str2 = this.mTransportStats.toString();
        }
        JSONObject put4 = put3.put("transport_layer_status", str2);
        if (this.mPushStreamStallStats.length() == 0 || LongField.CheckMask(this.mLogFieldMask, LongField.push_stream_stall_status)) {
            str3 = "null";
        } else {
            str3 = this.mPushStreamStallStats.toString();
        }
        JSONObject put5 = put4.put("push_stream_stall_status", str3);
        if (this.mPushAvoCacheInfo.length() != 0 && !LongField.CheckMask(this.mLogFieldMask, LongField.avo_cache_info)) {
            str4 = this.mPushAvoCacheInfo.toString();
        }
        JSONObject put6 = put5.put("avo_cache_info", str4).put("video_capture_width", liveStreamBuilder.getVideoCaptureWidth()).put("video_capture_height", liveStreamBuilder.getVideoCaptureHeight()).put("video_capture_fps", liveStreamBuilder.getVideoCaptureFps()).put("video_enc_bitrate", videoEncodeRealBps).put("camera_start_error_code", this.mVideoDeviceOpenErrorCode).put("mic_start_error_code", this.mAudioDeviceOpenErrorCode).put("width", liveStreamBuilder.getVideoWidth()).put("transform_color_range", str).put("iframe_psnr", liveStreamReport.getVideoEncodePSNRFromKeyFrame()).put("pframe_psnr", liveStreamReport.getVideoEncodePSNRFromNoKeyFrame()).put("transport_last_audio_dts", this.mLiveStream.getInt64Value(3)).put("transport_last_video_dts", this.mLiveStream.getInt64Value(4)).put("real_gop_ms", liveStreamReport.getRealVideoGopMs()).put("transport_last_video_dts", this.mLiveStream.getInt64Value(4));
        if (liveStreamBuilder.getSdkSetting().cameraSizeOptLog && videoCapturerControl != null && ((videoCaptureDevice = liveStreamBuilder.getVideoCaptureDevice()) == 1 || videoCaptureDevice == 2)) {
            if (videoCapturerControl.isCamera2Like()) {
                i5 = 2;
            } else {
                i5 = 1;
            }
            put6.put("camera_type", i5);
            put6.put("camera_capture_width", videoCapturerControl.getCameraCaptureWidth());
            put6.put("camera_capture_height", videoCapturerControl.getCameraCaptureHeight());
            put6.put("camera_real_fps_range", videoCapturerControl.getRealCameraFpsRangeStr());
            put6.put("camera_avg_result_fps", videoCapturerControl.getCameraAvgCaptureResultFps());
        }
        try {
            this.mLiveCore.getAdaptedVideoResolution(this.mAdaptedResolution);
            put6.put("adpt_res_w", this.mAdaptedResolution[0]);
            put6.put("adpt_res_h", this.mAdaptedResolution[1]);
        } catch (Throwable unused) {
        }
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null) {
            put6.put("screen_audio_level", liveCore.getScreenAudioLevel());
            if (true == liveStreamBuilder.getPushBase().enableScreenAudioStereoCapture) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            put6.put("screen_audio_channel", i4);
        }
        this.mTextureFrameCallbackCount = 0;
        if (this.mEnableReportSenStallLog > 0 && this.mPushStreamStatistic != null && this.mConnectEndStatistic != null) {
            if (!LongField.CheckMask(this.mLogFieldMask, LongField.transport_send_stall)) {
                this.mPushStreamStatistic.getTransportSendStallLog(put6);
            }
            this.mConnectEndStatistic.accumulate(this.mPushStreamStatistic);
            this.mPushStreamStatistic.reset();
        }
        if (this.mPushStartTime != 0) {
            put6.put("time_diff", System.currentTimeMillis() - this.mPushStartTime);
        }
        appendNetInfo(put6);
        JSONObject jSONObject4 = new JSONObject();
        LiveCore liveCore2 = this.mLiveCore;
        if (liveCore2 != null) {
            audioDeviceModule = liveCore2.getADM();
        } else {
            audioDeviceModule = null;
        }
        if (audioDeviceModule != null && !LongField.CheckMask(this.mLogFieldMask, LongField.adm)) {
            int option = (int) audioDeviceModule.getOption(1);
            int option2 = (int) audioDeviceModule.getOption(2);
            int option3 = (int) audioDeviceModule.getOption(3);
            int audioStreamdB = liveStreamReport.getAudioStreamdB();
            int option4 = (int) audioDeviceModule.getOption(9);
            int option5 = (int) audioDeviceModule.getOption(8);
            StringBuilder LIZJ = C06460Ne.LIZJ("", option, ",", option2, ",");
            C15890jp.LIZIZ(LIZJ, option3, ",", audioStreamdB, ",");
            LIZJ.append(option4);
            LIZJ.append(",");
            LIZJ.append(option5);
            String LIZIZ = X1D.LIZIZ(LIZJ);
            if (LongField.CheckMask(this.mLogFieldMask, LongField.rms)) {
                LIZIZ = null;
            }
            put6.put("rms", LIZIZ);
            put6.put("enable_ns", audioDeviceModule.isEnableBuiltInNS());
            if (LongField.CheckMask(this.mLogFieldMask, LongField.adm_status)) {
                reportJsonStats = null;
            } else {
                reportJsonStats = audioDeviceModule.getReportJsonStats();
            }
            jSONObject4.put("adm_status", reportJsonStats);
            jSONObject4.put("mic_start_error_code", (int) audioDeviceModule.getOption(10));
            jSONObject4.put("au_ahs", audioDeviceModule.isHeadSet());
            jSONObject4.put("enable_ear_monitoring", audioDeviceModule.isEchoMode());
            jSONObject4.put("is_support_hardware_ear_monitoring", audioDeviceModule.nativeIsSupportHardwareEarMonitor());
            jSONObject4.put("au_rnfe", (int) audioDeviceModule.getOption(12));
            jSONObject4.put("au_pnfe", (int) audioDeviceModule.getOption(13));
            jSONObject4.put("au_pe", (int) audioDeviceModule.getOption(14));
            jSONObject4.put("au_iee", (int) audioDeviceModule.getOption(15));
            JSONObject put7 = new JSONObject().put("reset_pts_index", audioDeviceModule.getResetPtsIndex()).put("syn_mode", liveStreamBuilder.getPushBase().timestampSynMode).put("capture_time", audioDeviceModule.getLatestAudioPts() / 1000).put("capture_time_diff", audioDeviceModule.getCaptureTimeDiff()).put("now_time_diff", audioDeviceModule.getNowTimeDiff());
            if (LongField.CheckMask(this.mLogFieldMask, LongField.adm_pts_info)) {
                put7 = null;
            }
            jSONObject4.put("adm_pts_info", put7);
            jSONObject4.put("native_live_sdk_version", MediaEngineFactory.nativeGetVersion());
            audioDeviceModule.clearLogState();
        }
        int videoCaptureDevice2 = liveStreamBuilder.getVideoCaptureDevice();
        if ((videoCaptureDevice2 == 1 || videoCaptureDevice2 == 2) && !LongField.CheckMask(this.mLogFieldMask, LongField.camera)) {
            if (videoCapturerControl != null) {
                jSONObject = videoCapturerControl.getRealCameraStatus();
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (liveStreamBuilder.isVECamera2API()) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            jSONObject.put("expected_camera_type", i3);
            jSONObject4.put("camera", jSONObject);
        }
        if (liveStreamBuilder.getVideoEncoder() == 1 && !liveStreamBuilder.isEnableVideoEncodeAccelera()) {
            jSONObject4.put("video_codec", "bytevc0");
        }
        int roiOn = liveStreamBuilder.getRoiOn();
        if (roiOn != 0 && !LongField.CheckMask(this.mLogFieldMask, LongField.roi)) {
            TEBundle roiSettings = liveStreamBuilder.getRoiSettings();
            JSONObject LIZLLL = C770830u.LIZLLL("roi_on", roiOn);
            LIZLLL.put("roi_qp", roiSettings.getInt("roi_qp"));
            LIZLLL.put("roi_bitrate_ratio", roiSettings.getDouble("roi_bitrate_ratio"));
            jSONObject4.put("roi", LIZLLL);
            roiSettings.release();
        }
        jSONObject4.put("native_live_sdk_version", MediaEngineFactory.nativeGetVersion());
        if (liveStreamBuilder.isEnableVideoFrameStatistics() && !LongField.CheckMask(this.mLogFieldMask, LongField.video_frame_elapse)) {
            jSONObject4.put("video_frame_elapse", liveStreamReport.getVideoFrameElapse());
            jSONObject4.put("video_frame_elapse_v2", liveStreamReport.getVideoFrameElapseV2());
            jSONObject4.put("nobuffercnt", this.mLiveStream.getFilterNoBufferCountAndClear());
        }
        jSONObject4.put("cur_categoty", this.mLiveStream.getCurCplxCategory());
        String stringValue = this.mLiveStream.getStringValue(3400);
        if (stringValue != null) {
            jSONObject4.put("video_cplx_performance", stringValue);
        }
        IFilterManager videoFilterMgr = this.mLiveStream.getVideoFilterMgr();
        if (videoFilterMgr instanceof FilterManager) {
            jSONObject2 = ((FilterManager) videoFilterMgr).getStatus();
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 != null && !LongField.CheckMask(this.mLogFieldMask, LongField.video_filter)) {
            jSONObject4.put("video_filter", jSONObject2);
        }
        if (!LongField.CheckMask(this.mLogFieldMask, LongField.camera)) {
            jSONObject4.put("averageExposureTime", liveStreamReport.getCameraAverageExposureTime());
            jSONObject4.put("averageCameraFps", liveStreamReport.getCameraAvgFps());
            jSONObject4.put("cameraISOInfo", liveStreamReport.getISOInfo());
        }
        jSONObject4.put("video_codec_info", this.mLiveStream.getVideoEncoderInfo()).put("audio_codec_info", this.mLiveStream.getAudioEncoderInfo());
        if (LongField.CheckMask(this.mLogFieldMask, LongField.message)) {
            jSONObject3 = null;
        } else {
            jSONObject3 = jSONObject4.toString();
        }
        put6.put("message", jSONObject3);
        JSONObject put8 = put6.put("render_fps", (int) (liveStreamReport.getMiniGameRenderFps() + 0.5d));
        this.mTransportStats.setLength(0);
        this.mPushStreamStallStats.setLength(0);
        this.mPushAvoCacheInfo.setLength(0);
        if (liveStreamBuilder.isEnableVideoFrameStatistics()) {
            VideoFrameStatistics.nativeReset();
        }
        DebugLogUtils.isEnableDebugLog();
        return put8;
    }

    public void appendAVCodecProfileToLog(JSONObject jSONObject) {
        LiveStreamBuilder liveStreamBuilder;
        LiveStream liveStream = this.mLiveStream;
        if (liveStream == null || (liveStreamBuilder = liveStream.getLiveStreamBuilder()) == null) {
            return;
        }
        String[] strArr = {"", "h264", "bytevc1"};
        String[] strArr2 = {"", "base", "main", "high", "main", "main10"};
        String[] strArr3 = {"", "LC", "HE", "HEv2"};
        String[] strArr4 = {"", "", "", ""};
        int i = 1;
        strArr4[1] = "aacFdk";
        strArr4[2] = "aacMediaCodec";
        strArr4[3] = "aacFFmpeg";
        try {
            JSONObject put = jSONObject.put("audio_codec", strArr4[liveStreamBuilder.getAudioEncoder()]).put("audio_profile", strArr3[liveStreamBuilder.getAudioProfile()]).put("video_codec", strArr[liveStreamBuilder.getVideoEncoder()]).put("video_profile", strArr2[liveStreamBuilder.getVideoProfile()]);
            if (!liveStreamBuilder.isEnableVideoEncodeAccelera()) {
                i = 0;
            }
            put.put("hardware", i);
        } catch (ArrayIndexOutOfBoundsException | JSONException unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:6|(16:35|36|9|10|11|12|13|14|15|(1:17)|18|(1:20)|21|(1:23)|24|25)|8|9|10|11|12|13|14|15|(0)|18|(0)|21|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Type inference failed for: r1v15, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject createCommonLog(long r11) {
        /*
            r10 = this;
            java.lang.String r5 = ""
            com.ss.ttlivestreamer.livestreamv2.LiveStream r0 = r10.mLiveStream
            com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder r6 = r0.getLiveStreamBuilder()
            if (r6 != 0) goto L10
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
        L10:
            com.ss.ttlivestreamer.livestreamv2.LiveStream r0 = r10.mLiveStream
            java.lang.String r7 = r0.getLiveStreamUrl()
            com.ss.ttlivestreamer.livestreamv2.LiveStream r0 = r10.mLiveStream
            java.lang.String r2 = r0.getRtmpTcUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L41
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L3d
            r1.append(r2)     // Catch: java.lang.Exception -> L3d
            r0 = 47
            int r0 = r7.lastIndexOf(r0)     // Catch: java.lang.Exception -> L3d
            int r0 = r0 + 1
            java.lang.String r0 = r7.substring(r0)     // Catch: java.lang.Exception -> L3d
            r1.append(r0)     // Catch: java.lang.Exception -> L3d
            java.lang.String r8 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L3d
            goto L42
        L3d:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L41:
            r8 = r7
        L42:
            java.lang.String r1 = "h264"
            java.lang.String r0 = "bytevc1"
            java.lang.String[] r1 = new java.lang.String[]{r5, r1, r0}     // Catch: java.lang.Exception -> L55
            int r0 = r6.getVideoEncoder()     // Catch: java.lang.Exception -> L55
            r4 = r1[r0]     // Catch: java.lang.Exception -> L55
            boolean r3 = r6.isEnableVideoEncodeAccelera()     // Catch: java.lang.Exception -> L56
            goto L57
        L55:
            r4 = r5
        L56:
            r3 = -1
        L57:
            r9 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lf2
            r2.<init>()     // Catch: org.json.JSONException -> Lf2
            java.lang.String r1 = "product_line"
            java.lang.String r0 = "live"
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r1 = "version"
            java.lang.String r0 = "2.0.0"
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r1 = "live_sdk_version"
            com.ss.ttlivestreamer.livestreamv2.LiveStream r0 = r10.mLiveStream     // Catch: org.json.JSONException -> Lf2
            java.lang.String r0 = r0.getVersion()     // Catch: org.json.JSONException -> Lf2
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r1 = "report_version"
            r0 = 5
            org.json.JSONObject r1 = r2.put(r1, r0)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r0 = "timestamp"
            org.json.JSONObject r2 = r1.put(r0, r11)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r1 = "mode"
            java.lang.String r0 = "push"
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r1 = "project_key"
            java.lang.String r0 = r6.mProjectKey     // Catch: org.json.JSONException -> Lf2
            if (r0 == 0) goto L96
            r5 = r0
        L96:
            org.json.JSONObject r2 = r2.put(r1, r5)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r1 = "cdn_ip"
            java.lang.String r0 = r10.mRemoteIP     // Catch: org.json.JSONException -> Lf2
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r1 = "url"
            int r0 = r10.mLogFieldMask     // Catch: org.json.JSONException -> Lf2
            com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService$LongField r5 = com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.LongField.url     // Catch: org.json.JSONException -> Lf2
            boolean r0 = com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.LongField.CheckMask(r0, r5)     // Catch: org.json.JSONException -> Lf2
            if (r0 == 0) goto Laf
            r8 = r9
        Laf:
            org.json.JSONObject r2 = r2.put(r1, r8)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r1 = "publish_url"
            int r0 = r10.mLogFieldMask     // Catch: org.json.JSONException -> Lf2
            boolean r0 = com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.LongField.CheckMask(r0, r5)     // Catch: org.json.JSONException -> Lf2
            if (r0 == 0) goto Lbe
            r7 = r9
        Lbe:
            org.json.JSONObject r2 = r2.put(r1, r7)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r1 = "qId"
            java.lang.String r0 = r6.getQosId()     // Catch: org.json.JSONException -> Lf2
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r1 = "quic_load_succ"
            com.ss.ttlivestreamer.livestreamv2.LiveStream r0 = r10.mLiveStream     // Catch: org.json.JSONException -> Lf2
            int r0 = r0.getQuicFlag()     // Catch: org.json.JSONException -> Lf2
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r1 = "live_stream_session_id"
            com.ss.ttlivestreamer.livestreamv2.LiveStream r0 = r10.mLiveStream     // Catch: org.json.JSONException -> Lf2
            java.lang.String r0 = r0.getStreamUniqueId()     // Catch: org.json.JSONException -> Lf2
            org.json.JSONObject r1 = r2.put(r1, r0)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r0 = "video_codec"
            org.json.JSONObject r1 = r1.put(r0, r4)     // Catch: org.json.JSONException -> Lf2
            java.lang.String r0 = "hardware"
            org.json.JSONObject r0 = r1.put(r0, r3)     // Catch: org.json.JSONException -> Lf2
            return r0
        Lf2:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.createCommonLog(long):org.json.JSONObject");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (101 == message.what) {
            report();
            if (this.mNeedReportVideoMixerInfo) {
                reportVideoMixerInfo();
                return true;
            }
            return true;
        }
        return true;
    }

    public void onConnectEnd(int i) {
        float f;
        float f2;
        int i2;
        int i3;
        if (this.mLiveStream.getLiveStreamBuilder().isEnableVelivePusher()) {
            DebugLogUtils.isEnableDebugLog();
            return;
        }
        if (this.mPushStartTime == 0) {
            return;
        }
        long j = this.mPushStreamCount;
        if (j == 0) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = (((float) this.mInCapFps0Count) * 1.0f) / ((float) j);
            f2 = (((float) this.mPreFpsNon0EncFps0Count) * 1.0f) / ((float) j);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mEnableReportSenStallLog > 0 && this.mRtmpReConnectingTime == 0) {
            this.mRtmpReConnectingTime = currentTimeMillis;
        }
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null) {
            i2 = liveCore.getBuilder().getVideoWidth();
            i3 = liveCore.getBuilder().getVideoHeight();
        } else {
            i2 = 0;
            i3 = 0;
        }
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.16
            public final /* synthetic */ float val$capture0FpsRatio;
            public final /* synthetic */ float val$encode0FpsRatio;
            public final /* synthetic */ int val$height;
            public final /* synthetic */ long val$pushStreamCount;
            public final /* synthetic */ int val$status;
            public final /* synthetic */ long val$timestamp;
            public final /* synthetic */ int val$width;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$16__run$___twin___() {
                TransportSendStallStatics transportSendStallStatics;
                TransportSendStallStatics transportSendStallStatics2;
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        JSONObject put = createCommonLog.put("event_key", "connect_end").put("state", r4).put("reconnect_count", LiveStreamLogService.this.mReconnectTimes).put("width", r5).put("height", r6).put("error_code", LiveStreamLogService.this.mLastErrorCode).put("error_count", LiveStreamLogService.this.mErrorCount).put("first_connect", LiveStreamLogService.this.mIsFirstConnect).put("rate_adjust_times", LiveStreamLogService.this.mRateAdjustTimes).put("rate_adjust_up_times", LiveStreamLogService.this.mRateAdjustUpTimes);
                        LiveStreamLogService liveStreamLogService = LiveStreamLogService.this;
                        put.put("rate_adjust_down_times", liveStreamLogService.mRateAdjustTimes - liveStreamLogService.mRateAdjustUpTimes).put("fps_adjust_times", LiveStreamLogService.this.mFpsAdjustTimes).put("video_encode_error_code", LiveStreamLogService.this.mVideoEncoderErrorCode).put("audio_encode_error_code", LiveStreamLogService.this.mAudioEncoderErrorCode).put("send_package_slow_times", LiveStreamLogService.this.mLongerPackageDelayTimes).put("push_duration", r2 - LiveStreamLogService.this.mPushStartTime).put("push_stream_count", r7).put("capture_0fps_ratio", r9).put("encode_0fps_ratio", r10);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("omx_info", MediaCodecUtils.getOmxInfo());
                        createCommonLog.put("message", jSONObject);
                        LiveStreamLogService liveStreamLogService2 = LiveStreamLogService.this;
                        if (liveStreamLogService2.mEnableReportSenStallLog > 0 && (transportSendStallStatics = liveStreamLogService2.mPushStreamStatistic) != null && (transportSendStallStatics2 = liveStreamLogService2.mConnectEndStatistic) != null) {
                            transportSendStallStatics2.accumulate(transportSendStallStatics);
                            LiveStreamLogService.this.mConnectEndStatistic.getTransportSendStallLog(createCommonLog);
                            LiveStreamLogService.this.mConnectEndStatistic.reset();
                        }
                        LiveStreamLogService.this.appendAVCodecProfileToLog(createCommonLog);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    LiveStreamLogService liveStreamLogService3 = LiveStreamLogService.this;
                    liveStreamLogService3.mPushStartTime = 0L;
                    liveStreamLogService3.mLastErrorCode = 200;
                    liveStreamLogService3.mErrorCount = 0;
                    liveStreamLogService3.mIsFirstConnect = false;
                    liveStreamLogService3.mPushStreamCount = 0L;
                    liveStreamLogService3.mInCapFps0Count = 0L;
                    liveStreamLogService3.mPreFpsNon0EncFps0Count = 0L;
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass16 anonymousClass16) {
                boolean LIZ;
                try {
                    anonymousClass16.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$16__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass16(long currentTimeMillis2, int i4, int i22, int i32, long j2, float f3, float f22) {
                r2 = currentTimeMillis2;
                r4 = i4;
                r5 = i22;
                r6 = i32;
                r7 = j2;
                r9 = f3;
                r10 = f22;
            }
        });
    }

    public void onKCPMessage(String str) {
        StringBuffer stringBuffer = this.mTransportStats;
        stringBuffer.append(str);
        stringBuffer.append("\n");
    }

    public void onLWReconnectStart(int i) {
        long nativeNanoTime = TimeUtils.nativeNanoTime() / 1000000;
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.3
            public final /* synthetic */ long val$clockMs;
            public final /* synthetic */ int val$error_code;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$3__run$___twin___() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("clockMs", r4);
                        jSONObject.put("error_code", r6);
                        createCommonLog.put("event_key", "lw_reconnect_start").put("message", jSONObject.toString()).put("error_code", r6);
                        ILogUploader iLogUploader = LiveStreamLogService.this.mLogUploader;
                        if (iLogUploader != null) {
                            iLogUploader.uploadLog(createCommonLog);
                        }
                    } catch (JSONException unused) {
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass3(long j, long nativeNanoTime2, int i2) {
                r2 = j;
                r4 = nativeNanoTime2;
                r6 = i2;
            }
        });
    }

    public void onOtherMessage(String str) {
        StringBuffer stringBuffer = this.mTransportStats;
        stringBuffer.append(str);
        stringBuffer.append("\n");
    }

    public void onQUICMessage(String str) {
        StringBuffer stringBuffer = this.mTransportStats;
        stringBuffer.append(str);
        stringBuffer.append("\n");
    }

    public void onRTMPConnectResult(int i) {
        if (this.mLiveStream.getLiveStreamBuilder().isEnableVelivePusher()) {
            DebugLogUtils.isEnableDebugLog();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LiveStream liveStream = this.mLiveStream;
        if (liveStream != null) {
            LiveStreamEventTracker liveStreamEventTracker = liveStream.getLiveStreamEventTracker();
            LiveStreamConnectResultEventSource connectResultEventSource = liveStreamEventTracker.getConnectResultEventSource();
            LiveStreamConnectResultEventResult connectResultEventResult = liveStreamEventTracker.getConnectResultEventResult();
            if (connectResultEventSource != null && connectResultEventResult != null) {
                this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.7
                    public final /* synthetic */ int val$hasFirstConnected;
                    public final /* synthetic */ LiveStreamConnectResultEventResult val$result;
                    public final /* synthetic */ LiveStreamConnectResultEventSource val$source;
                    public final /* synthetic */ long val$timestamp;

                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$7__run$___twin___() {
                        JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                        if (createCommonLog != null) {
                            try {
                                createCommonLog.put("event_key", "connect_result").put("scene_code", r4.mScene).put("connect_success", r5.mConnectSuccess).put("has_first_connected", r6).put("retry_cnt", r5.mRetryCount).put("stream_retry_cnt", r5.mStreamRetryCount).put("rtmp_code1", r4.mRtmpCode1).put("rtmp_code2", r4.mRtmpCode2).put("rtmp_code3", r4.mRtmpCode3).put("rtmp_msg", r4.mRtmpMsg);
                                LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                            } catch (JSONException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                        boolean LIZ;
                        try {
                            anonymousClass7.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$7__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }

                    public AnonymousClass7(long currentTimeMillis2, LiveStreamConnectResultEventSource connectResultEventSource2, LiveStreamConnectResultEventResult connectResultEventResult2, int i2) {
                        r2 = currentTimeMillis2;
                        r4 = connectResultEventSource2;
                        r5 = connectResultEventResult2;
                        r6 = i2;
                    }
                });
            }
        }
    }

    public void onRTMPMessage(String str) {
        StringBuffer stringBuffer = this.mTransportStats;
        stringBuffer.append(str);
        stringBuffer.append("\n");
    }

    public void onSendPktSlow(int i) {
        this.mLongerPackageDelayTimes++;
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.15
            public final /* synthetic */ int val$timeCost;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$15__run$___twin___() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_key", "send_package_slow").put("send_package_duration", r4);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass15 anonymousClass15) {
                boolean LIZ;
                try {
                    anonymousClass15.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$15__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass15(long j, int i2) {
                r2 = j;
                r4 = i2;
            }
        });
    }

    public void onSessionInterrupt(boolean z) {
        long nativeNanoTime = TimeUtils.nativeNanoTime() / 1000000;
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.2
            public final /* synthetic */ long val$clockMs;
            public final /* synthetic */ boolean val$isInterrupt;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$2__run$___twin___() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("clockMs", r4);
                        jSONObject.put("interrupt", r6);
                        createCommonLog.put("event_key", "session_interrupt").put("message", jSONObject.toString());
                        ILogUploader iLogUploader = LiveStreamLogService.this.mLogUploader;
                        if (iLogUploader != null) {
                            iLogUploader.uploadLog(createCommonLog);
                        }
                    } catch (JSONException unused) {
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass2(long j, long nativeNanoTime2, boolean z2) {
                r2 = j;
                r4 = nativeNanoTime2;
                r6 = z2;
            }
        });
    }

    public void setEnableCertVerify(int i) {
        this.mEnableCertVerify = i;
    }

    public void setLogInterval(long j) {
        this.mInterval = j;
    }

    public void setPushStreamFlag(int i) {
        this.mPushStreamFlag = i | this.mPushStreamFlag;
    }

    public void setReportStallLog(int i) {
        this.mEnableReportSenStallLog = i;
    }

    public void setSandboxProceedCost(long j) {
        this.mSandboxProceedCost = j;
    }

    public void setStopPushStreamManually(int i) {
        this.mIsStopPushStreamManually = i;
    }

    public void onProtocolDownGrade(int i, int i2) {
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.9
            public final /* synthetic */ int val$quicDownGradeErrorCode;
            public final /* synthetic */ int val$reconnectCount;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$9__run$___twin___() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_key", "protocol_downgrade").put("error_code", r4).put("error_count", r5);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                boolean LIZ;
                try {
                    anonymousClass9.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$9__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass9(long j, int i22, int i3) {
                r2 = j;
                r4 = i22;
                r5 = i3;
            }
        });
    }

    public void onPushStreamFail(int i, String str) {
        this.mLastErrorCode = i;
        this.mPushStreamResultErrorCode = i;
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.14
            public final /* synthetic */ int val$errorCode;
            public final /* synthetic */ String val$message;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$14__run$___twin___() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_key", "push_stream_fail").put("message", r4).put("error_code", r5);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
                boolean LIZ;
                try {
                    anonymousClass14.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$14__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass14(long j, String str2, int i2) {
                r2 = j;
                r4 = str2;
                r5 = i2;
            }
        });
    }

    public void onReportAvoCache(int i, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time_stamp", currentTimeMillis).put("audio_count", i).put("video_count", j);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        StringBuffer stringBuffer = this.mPushAvoCacheInfo;
        stringBuffer.append(jSONObject.toString());
        stringBuffer.append("\n");
    }

    public void onReportBwAdjustTime(int i, long j) {
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.13
            public final /* synthetic */ int val$adjustBitrate;
            public final /* synthetic */ long val$timeCost;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$13__run$___twin___() {
                int i2;
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        JSONObject put = createCommonLog.put("event_key", "bitrate_adjust_timecost");
                        if (r4 > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        put.put("adjustment", i2).put("adjust_step", Math.abs(r4)).put("adjust_time_cost", r5);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
                boolean LIZ;
                try {
                    anonymousClass13.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$13__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass13(long j2, int i2, long j3) {
                r2 = j2;
                r4 = i2;
                r5 = j3;
            }
        });
    }

    public void onVeLivePushLogMonitor(JSONObject jSONObject, LiveCore.Builder.ILogMonitor iLogMonitor) {
        appendVeLivePusherMonitorLog(jSONObject);
        if (iLogMonitor != null) {
            iLogMonitor.onLogMonitor("live_client_monitor_log", jSONObject);
        }
    }

    public void setDeviceOpenErrorCode(boolean z, int i) {
        if (z) {
            this.mAudioDeviceOpenErrorCode = i;
        } else {
            this.mVideoDeviceOpenErrorCode = i;
        }
    }

    public void setEncoderErrorCode(boolean z, long j) {
        if (z) {
            this.mAudioEncoderErrorCode = j;
        } else {
            this.mVideoEncoderErrorCode = j;
        }
    }

    public void uploadVideoEncodeFpsAdjustLog(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "Adjust videoEncodeFps");
            jSONObject.put("lastEncodeFps", i);
            jSONObject.put("newEncodeFps", i2);
            jSONObject.put("timestamp", System.currentTimeMillis());
        } catch (Exception unused) {
        }
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.1
            public final /* synthetic */ JSONObject val$msg;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$1__run$___twin___() {
                AVLog.logKibana(4, "Adjust videoEncodeFps", r2.toString(), null);
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass1(JSONObject jSONObject2) {
                r2 = jSONObject2;
            }
        });
    }

    public void extError(int i, int i2, Exception exc) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        if (exc != null) {
            str = exc.toString();
        } else {
            str = null;
        }
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.10
            public final /* synthetic */ int val$errorCode;
            public final /* synthetic */ int val$errorType;
            public final /* synthetic */ String val$finalMsg;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$10__run$___twin___() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_key", "live_ext_shutdown").put("error_type", r4).put("error_code", r5).put("msg", r6);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                boolean LIZ;
                try {
                    anonymousClass10.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$10__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass10(long currentTimeMillis2, int i3, int i22, String str2) {
                r2 = currentTimeMillis2;
                r4 = i3;
                r5 = i22;
                r6 = str2;
            }
        });
    }

    public void onPushStreamStall(boolean z, int i, long j) {
        TransportSendStallStatics transportSendStallStatics;
        if (this.mEnableReportSenStallLog > 0 && (transportSendStallStatics = this.mPushStreamStatistic) != null) {
            transportSendStallStatics.setTransportSendStallParam(z, i, j);
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time_stamp", currentTimeMillis).put("stall_type", "send_stall").put("is_audio", z).put("stall_time", j).put("stall_reason", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        StringBuffer stringBuffer = this.mPushStreamStallStats;
        stringBuffer.append(jSONObject);
        stringBuffer.append("\n");
    }

    public void uploadSDKLog(int i, String str, String str2) {
        long nativeNanoTime = TimeUtils.nativeNanoTime() / 1000000;
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.5
            public final /* synthetic */ long val$clockMs;
            public final /* synthetic */ int val$level;
            public final /* synthetic */ String val$msg;
            public final /* synthetic */ String val$tag;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$5__run$___twin___() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("clockMs", r4);
                        jSONObject.put("level", r6);
                        jSONObject.put("tag", r7);
                        jSONObject.put("msg", r8);
                        createCommonLog.put("event_key", "live_sdk_log").put("message", jSONObject.toString());
                        ILogUploader iLogUploader = LiveStreamLogService.this.mLogUploader;
                        if (iLogUploader != null) {
                            iLogUploader.uploadLog(createCommonLog);
                        }
                    } catch (JSONException unused) {
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass5(long j, long nativeNanoTime2, int i2, String str3, String str22) {
                r2 = j;
                r4 = nativeNanoTime2;
                r6 = i2;
                r7 = str3;
                r8 = str22;
            }
        });
    }

    public void onLWReconnectEnd(boolean z, boolean z2, int i, long j) {
        long nativeNanoTime = TimeUtils.nativeNanoTime() / 1000000;
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.4
            public final /* synthetic */ long val$clockMs;
            public final /* synthetic */ int val$costTime;
            public final /* synthetic */ long val$count;
            public final /* synthetic */ boolean val$success;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$4__run$___twin___() {
                int i2;
                int i22;
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        JSONObject put = createCommonLog.put("event_key", "lw_reconnect_stop");
                        if (r4) {
                            i2 = 0;
                        } else {
                            i2 = r5;
                        }
                        JSONObject put2 = put.put("error_code", i2);
                        if (r4) {
                            i22 = r5;
                        } else {
                            i22 = -1;
                        }
                        put2.put("cost_time", i22).put("reconnect_count", r6).put("clockMs", r8);
                        createCommonLog.put("message", createCommonLog.toString());
                        ILogUploader iLogUploader = LiveStreamLogService.this.mLogUploader;
                        if (iLogUploader != null) {
                            iLogUploader.uploadLog(createCommonLog);
                        }
                    } catch (JSONException unused) {
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass4(long j2, boolean z3, int i2, long j3, long nativeNanoTime2) {
                r2 = j2;
                r4 = z3;
                r5 = i2;
                r6 = j3;
                r8 = nativeNanoTime2;
            }
        });
    }

    public void uploadSDKLogEvent(int i, String str, String str2, String str3) {
        long nativeNanoTime = TimeUtils.nativeNanoTime() / 1000000;
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.6
            public final /* synthetic */ long val$clockMs;
            public final /* synthetic */ String val$event;
            public final /* synthetic */ int val$level;
            public final /* synthetic */ String val$msg;
            public final /* synthetic */ String val$tag;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$6__run$___twin___() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("clockMs", r4);
                        jSONObject.put("level", r6);
                        jSONObject.put("tag", r7);
                        jSONObject.put("msg", r8);
                        createCommonLog.put("event_key", r9).put("message", jSONObject.toString());
                        ILogUploader iLogUploader = LiveStreamLogService.this.mLogUploader;
                        if (iLogUploader != null) {
                            iLogUploader.uploadLog(createCommonLog);
                        }
                    } catch (JSONException unused) {
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                boolean LIZ;
                try {
                    anonymousClass6.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$6__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass6(long j, long nativeNanoTime2, int i2, String str4, String str32, String str22) {
                r2 = j;
                r4 = nativeNanoTime2;
                r6 = i2;
                r7 = str4;
                r8 = str32;
                r9 = str22;
            }
        });
    }

    public void onBitrateAdjust(long j, int i, int i2, int i3, String str) {
        this.mRateAdjustTimes++;
        if (i > 0) {
            this.mRateAdjustUpTimes++;
        }
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.11
            public final /* synthetic */ int val$adjust;
            public final /* synthetic */ String val$adjustment;
            public final /* synthetic */ long val$bitRate;
            public final /* synthetic */ int val$maxBitrate;
            public final /* synthetic */ int val$minBitrate;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$11__run$___twin___() {
                StringBuilder LIZ;
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        JSONObject put = createCommonLog.put("event_key", "bitrate_adjust").put("bitrate_beforeadjust", LiveStreamLogService.this.mLastBitRate).put("bitrate_afteradjust", r4).put("min_bitrate", r6).put("max_bitrate", r7);
                        if (r8 > 0) {
                            LIZ = X1D.LIZ();
                            LIZ.append("up-");
                            LIZ.append(r9);
                        } else {
                            LIZ = X1D.LIZ();
                            LIZ.append("down-");
                            LIZ.append(r9);
                        }
                        put.put("adjustment", X1D.LIZIZ(LIZ));
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                LiveStreamLogService.this.mLastBitRate = r4;
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                boolean LIZ;
                try {
                    anonymousClass11.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$11__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass11(long j2, long j3, int i22, int i32, int i4, String str2) {
                r2 = j2;
                r4 = j3;
                r6 = i22;
                r7 = i32;
                r8 = i4;
                r9 = str2;
            }
        });
    }

    public void onFpsAdjust(int i, int i2, int i3, int i4, String str) {
        this.mFpsAdjustTimes++;
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.12
            public final /* synthetic */ int val$adjustFps;
            public final /* synthetic */ String val$adjustment;
            public final /* synthetic */ int val$maxFps;
            public final /* synthetic */ int val$minFps;
            public final /* synthetic */ int val$oldFps;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$12__run$___twin___() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_key", "fps_adjust").put("fps_beforeadjust", r4).put("fps_afteradjust", r5).put("min_fps", r6).put("max_fps", r7).put("adjustment", r8).put("adjust_step", Math.abs(r5 - r4));
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
                boolean LIZ;
                try {
                    anonymousClass12.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$12__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass12(long j, int i5, int i22, int i32, int i42, String str2) {
                r2 = j;
                r4 = i5;
                r5 = i22;
                r6 = i32;
                r7 = i42;
                r8 = str2;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [int] */
    /* JADX WARN: Type inference failed for: r17v3 */
    public void onRTMPEnd(final int i, final int i2, final boolean z, String str, final long j) {
        final long j2;
        final ?? r17;
        final int i3;
        final JSONObject jSONObject;
        TransportSendStallStatics transportSendStallStatics;
        if (this.mLiveStream.getLiveStreamBuilder().isEnableVelivePusher()) {
            DebugLogUtils.isEnableDebugLog();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.mLastErrorCode = i;
        this.mPushStreamResultErrorCode = i;
        this.mErrorCount = i2;
        this.mIsFirstConnect = z;
        if (i == 200) {
            this.mPushStartTime = currentTimeMillis;
        }
        long j3 = this.mRtmpConnectingTime;
        if (j3 != 0) {
            j2 = currentTimeMillis - j3;
        } else {
            j2 = 0;
        }
        if (this.mEnableReportSenStallLog > 0) {
            long j4 = this.mRtmpReConnectingTime;
            if (j4 > 0 && (transportSendStallStatics = this.mPushStreamStatistic) != null) {
                transportSendStallStatics.setReconnectCost(currentTimeMillis - j4);
                this.mRtmpReConnectingTime = 0L;
            }
        }
        if (str != null) {
            this.mRemoteIP = str;
        }
        LiveStream liveStream = this.mLiveStream;
        if (liveStream != null) {
            boolean quicDownGradeFlag = liveStream.getQuicDownGradeFlag();
            i3 = this.mLiveStream.getQuicDownGradeType();
            r17 = quicDownGradeFlag;
        } else {
            r17 = 0;
            i3 = 0;
        }
        LiveCore.Builder builder = this.mLiveCore.getBuilder();
        if (builder != null) {
            this.mDefaultVideoBitrate = builder.getVideoBitrate() / 1000;
            this.mMinVideoBitrate = builder.getVideoMinBitrate() / 1000;
            this.mMaxVideoBitrate = builder.getVideoMaxBitrate() / 1000;
            this.mAudioBitrate = builder.getAudioBitrate() / 1000;
            this.mVideoWidth = builder.getVideoWidth();
            this.mVideoHeight = builder.getVideoHeight();
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        if (builder != null && builder.getSdkParams() != null) {
            jSONObject = builder.getSdkParams();
        } else {
            jSONObject = new JSONObject();
        }
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: X.P2t
            @Override // java.lang.Runnable
            public final void run() {
                LiveStreamLogService.this.lambda$onRTMPEnd$1(currentTimeMillis2, i, j2, i2, z, j, r17, i3, jSONObject);
            }
        });
    }

    public LiveStreamLogService(LiveStream liveStream, ILogUploader iLogUploader, long j, LiveCore liveCore, HandlerThread handlerThread, HandlerThread handlerThread2) {
        Handler handler;
        Handler handler2;
        this.mPushStreamResultReportSecond = 10;
        this.mLiveCore = liveCore;
        if (handlerThread2 != null) {
            handler = new Handler(handlerThread2.getLooper(), this);
        } else {
            handler = new Handler(this);
        }
        this.mLogUploadThreadHandler = handler;
        int i = liveCore.getBuilder() != null ? liveCore.getBuilder().getPushBase().logFieldMask : 0;
        this.mLogFieldMask = i;
        LongField.PrintAllFieldMask();
        LongField.PrintAllMaskedField(i);
        if (handlerThread != null) {
            handler2 = new Handler(handlerThread.getLooper(), this);
        } else {
            handler2 = new Handler(this);
        }
        this.mWorkThreadHandler = handler2;
        this.mInterval = j <= 0 ? 5000L : j;
        this.mLiveStream = liveStream;
        this.mNeedReportVideoMixerInfo = liveCore.getBuilder().getPushBase().needReportVideoMixerInfo;
        this.mPushStreamResultReportSecond = liveCore.getBuilder().getPushBase().pushStreamResultReportSecond;
        this.mLogUploader = iLogUploader;
        this.mStaticsReport = new LiveStreamReport();
        this.mPushStreamStatistic = new TransportSendStallStatics();
        this.mConnectEndStatistic = new TransportSendStallStatics();
        if (!AVLog.isLogKibanaDeviceSet()) {
            AVLog.setupLogKibanaDevice(new LiveStreamLogFilter(this));
        }
        AVLog.ILogFilter logKibanaDevice = AVLog.getLogKibanaDevice();
        if (logKibanaDevice instanceof LiveStreamLogFilter) {
            ((LiveStreamLogFilter) logKibanaDevice).setLogService(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public void onRTMPFailed(int i, int i2, boolean z, String str, long j, String str2) {
        ?? r12;
        int i3;
        LiveCore.Builder builder;
        long currentTimeMillis = System.currentTimeMillis();
        this.mLastErrorCode = i;
        this.mPushStreamResultErrorCode = i;
        this.mErrorCount = i2;
        this.mIsFirstConnect = z;
        if (i == 200) {
            this.mPushStartTime = currentTimeMillis;
        }
        LiveStream liveStream = this.mLiveStream;
        if (liveStream != null) {
            boolean quicDownGradeFlag = liveStream.getQuicDownGradeFlag();
            i3 = this.mLiveStream.getQuicDownGradeType();
            r12 = quicDownGradeFlag;
        } else {
            r12 = 0;
            i3 = 0;
        }
        LiveCore liveCore = this.mLiveCore;
        if (liveCore != null && (builder = liveCore.getBuilder()) != null) {
            this.mDefaultVideoBitrate = builder.getVideoBitrate() / 1000;
            this.mMinVideoBitrate = builder.getVideoMinBitrate() / 1000;
            this.mMaxVideoBitrate = builder.getVideoMaxBitrate() / 1000;
            this.mAudioBitrate = builder.getAudioBitrate() / 1000;
        }
        this.mLogUploadThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService.8
            public final /* synthetic */ long val$dnsTime;
            public final /* synthetic */ int val$errorCode;
            public final /* synthetic */ int val$finalHappenProtocolDowngrade;
            public final /* synthetic */ int val$finalProtocolDowngradeType;
            public final /* synthetic */ boolean val$firstConnect;
            public final /* synthetic */ String val$msg;
            public final /* synthetic */ int val$reconnectCount;
            public final /* synthetic */ long val$timestamp;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$8__run$___twin___() {
                boolean z2;
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(r2);
                if (createCommonLog != null) {
                    try {
                        JSONObject put = createCommonLog.put("event_key", "connect_fail");
                        if (r4 == 200) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        put.put("connect_status", z2).put("error_code", r4).put("error_count", r5).put("first_connect", r6).put("dns_parse_time", r7).put("default_bitrate", LiveStreamLogService.this.mDefaultVideoBitrate).put("min_bitrate", LiveStreamLogService.this.mMinVideoBitrate).put("max_bitrate", LiveStreamLogService.this.mMaxVideoBitrate).put("audio_bitrate", LiveStreamLogService.this.mAudioBitrate).put("message", r9).put("enable_cert_verify", LiveStreamLogService.this.mEnableCertVerify).put("sandbox_proceed_cost", LiveStreamLogService.this.mSandboxProceedCost).put("protocol_downgraded", r10).put("protocol_downgraded_type", r11);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_ss_ttlivestreamer_livestreamv2_log_LiveStreamLogService$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass8(long j2, int i4, int i22, boolean z2, long j3, String str22, int r122, int i32) {
                r2 = j2;
                r4 = i4;
                r5 = i22;
                r6 = z2;
                r7 = j3;
                r9 = str22;
                r10 = r122;
                r11 = i32;
            }
        });
    }

    public /* synthetic */ void lambda$onRTMPEnd$1(long j, int i, long j2, int i2, boolean z, long j3, int i3, int i4, JSONObject jSONObject) {
        boolean z2;
        JSONObject createCommonLog = createCommonLog(j);
        appendNodeOptimizedInfo(createCommonLog);
        if (createCommonLog != null) {
            try {
                JSONObject put = createCommonLog.put("event_key", "connect_start");
                if (i == 200) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                put.put("connect_status", z2).put("connect_elapse", j2).put("error_code", i).put("error_count", i2).put("first_connect", z).put("dns_parse_time", j3).put("default_bitrate", this.mDefaultVideoBitrate).put("min_bitrate", this.mMinVideoBitrate).put("max_bitrate", this.mMaxVideoBitrate).put("audio_bitrate", this.mAudioBitrate).put("enable_cert_verify", this.mEnableCertVerify).put("sandbox_proceed_cost", this.mSandboxProceedCost).put("protocol_downgraded", i3).put("protocol_downgraded_type", i4).put("width", this.mVideoWidth).put("height", this.mVideoHeight).put("sdk_params", jSONObject);
                this.mLogUploader.uploadLog(createCommonLog);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
