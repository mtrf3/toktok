package com.ss.ttlivestreamer.livestreamv2.core;

import X.C16880lQ;
import X.C25620zW;
import X.InterfaceC63833P3l;
import X.X1D;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.livecore.base.tinyjson.TinyJson;
import com.ss.ttlivestreamer.core.transport.RTMPUploadBWProbe;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.LibraryLoader;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.NodeOptParams;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.QuicParams;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.UploadBWProbeParams;
import com.ss.ttlivestreamer.livestreamv2.utils.NumberInit;
import com.ss.ttlivestreamer.livestreamv2.utils.UrlUtils;
import com.ss.videoarch.strategy.LiveStrategyManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LiveCoreUploadBWProbe {
    public InterfaceC63833P3l mDns;
    public RTMPUploadBWProbe.Listener mListener;
    public HashMap<String, String> mOptUrlMap;
    public RTMPUploadBWProbe mRtmpUploadBWProbe;
    public String mStreamUuid;
    public String mUri;
    public long mUrlPriority;
    public SafeHandlerThread mWorkThread;
    public final Handler mWorkThreadHandler;
    public String streamID;
    public final LiveSdkSetting mSdkSetting = new LiveSdkSetting();
    public boolean mEnableSendLogInfo = false;
    public int mNodeOptTimeCost = -1;
    public TEBundle mUploadBWTestOpt = new TEBundle();
    public TEBundle mTransportOpt = new TEBundle();
    public String mPushUrlPrefix = "";
    public int mRtmpPort = -1;
    public int mQuicFlag = -1;
    public boolean mDnsOptOpen = false;
    public boolean mDnsOptHit = false;
    public boolean mStrategyDnsOptOpen = false;
    public String mEvaluatorSymbol = "";
    public JSONObject mEvaluatorSymbolMap = null;
    public String mRequestId = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public final String mInvalidOptUrl = "INVALID_URL";
    public JSONObject mStrategynodeOptimizerInfos = null;
    public HashMap<String, List<String>> mPreparedIpList = null;
    public int mNodeIndex = 0;
    public String mProjectKey = null;
    public JSONObject mNodeOptimizeInfo = new JSONObject();

    public String getVersion() {
        return "15.0.1_1";
    }

    private NodeOptParams getNodeOptParams() {
        return this.mSdkSetting.nodeOpt;
    }

    private PushBase getPushBase() {
        return this.mSdkSetting.mPushBase;
    }

    private UploadBWProbeParams getUploadBWTestParams() {
        return this.mSdkSetting.mUploadBWProbeParams;
    }

    private boolean isUsingOptimizedUrl() {
        HashMap<String, String> hashMap;
        String str = this.mUri;
        StringBuilder LIZIZ = C25620zW.LIZIZ("isUsingOptimizedUrl fallback true originUrl:", str, " mDnsOptOpen:");
        LIZIZ.append(this.mDnsOptOpen);
        LIZIZ.append(" mDnsOptHit:");
        LIZIZ.append(this.mDnsOptHit);
        AVLog.iow("LiveCoreUploadBWProbe", X1D.LIZIZ(LIZIZ));
        if (!TextUtils.isEmpty(str) && this.mDnsOptOpen && this.mDnsOptHit && (hashMap = this.mOptUrlMap) != null && hashMap.containsKey(str)) {
            String str2 = this.mOptUrlMap.get(str);
            if (!TextUtils.isEmpty(str2) && !str2.equals("INVALID_URL")) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("optUrl:");
                LIZ.append(str2);
                LIZ.append(" isUsingOptimizeUrl return true");
                AVLog.iow("LiveCoreUploadBWProbe", X1D.LIZIZ(LIZ));
                return true;
            }
            return false;
        }
        return false;
    }

    private void parseParams() {
        TEBundle tEBundle;
        TEBundle tEBundle2 = new TEBundle();
        TEBundle tEBundle3 = new TEBundle();
        UploadBWProbeParams uploadBWTestParams = getUploadBWTestParams();
        QuicParams bWProbeQuicParams = getBWProbeQuicParams();
        PushBase pushBase = getPushBase();
        boolean z = true;
        if (this.mTransportOpt != null && (tEBundle = this.mUploadBWTestOpt) != null) {
            this.mEnableSendLogInfo = uploadBWTestParams.enalbeSendLogInfo;
            tEBundle.setInt("upload_bw_test_time", uploadBWTestParams.bWTestTime);
            this.mUploadBWTestOpt.setInt("upload_bw_test_time_ms", uploadBWTestParams.bWTestTimeMS);
            this.mUploadBWTestOpt.setInt("packet_send_valid_time_ms", uploadBWTestParams.packetSendValidTimeMS);
            this.mUploadBWTestOpt.setInt("PeakAvgCount", uploadBWTestParams.PeakAvgCount);
            this.mUploadBWTestOpt.setInt("upload_bw_probe_log_interval", uploadBWTestParams.logInterval);
            this.mUploadBWTestOpt.setInt("bottom_line_540p", uploadBWTestParams.bottomLine540p);
            this.mUploadBWTestOpt.setInt("bottom_line_720p", uploadBWTestParams.bottomLine720p);
            this.mUploadBWTestOpt.setInt("bottom_line_540p_bwe", uploadBWTestParams.BottomLine540pBwe);
            this.mUploadBWTestOpt.setInt("bottom_line_720p_bwe", uploadBWTestParams.BottomLine720pBwe);
            this.mUploadBWTestOpt.setInt("upload_bw_probe_bottom_level", uploadBWTestParams.BWProbeBottomLevel);
            this.mUploadBWTestOpt.setInt("upload_bw_probe_aim_level", uploadBWTestParams.BWProbeAimLevel);
            this.mUploadBWTestOpt.setString("upload_bw_probe_suggest_protocol", uploadBWTestParams.SuggestProtocol);
            this.mUploadBWTestOpt.setInt("upload_bw_probe_result_strategy", uploadBWTestParams.ResultStrategy);
            this.mUploadBWTestOpt.setInt("upload_bw_probe_ewma_half_life", uploadBWTestParams.EwmaHalfLife);
            this.mUploadBWTestOpt.setDouble("upload_bw_probe_ewma_estimate", uploadBWTestParams.EwmaEstimate);
            this.mUploadBWTestOpt.setDouble("upload_bw_probe_ewma_weight", uploadBWTestParams.EwmaWeight);
            this.mUploadBWTestOpt.setDouble("upload_bw_probe_first_order_filter_param", uploadBWTestParams.FirstOrderFilterParam);
            this.mUploadBWTestOpt.setInt("upload_bw_probe_log_interval_ms", uploadBWTestParams.logIntervalMS);
            this.mUploadBWTestOpt.setInt("upload_bw_probe_report_bbr_info", uploadBWTestParams.ReportBbrInfo);
            this.mUploadBWTestOpt.setInt("pre_push_stream_threshold", uploadBWTestParams.prePushStreamThreshold);
            this.mUploadBWTestOpt.setDouble("pre_push_stream_drop_frame_range", uploadBWTestParams.prePushStreamDropFrameRange);
            this.mUploadBWTestOpt.setInt("pre_push_stream_fps", pushBase.fps);
            this.mUploadBWTestOpt.setInt("pre_push_stream_bitrate", pushBase.defaultBitrate);
            this.mTransportOpt.setLong("rtmp_init_video_bitrate", uploadBWTestParams.defaultBitrate);
            this.mTransportOpt.setLong("rtmp_max_video_bitrate", uploadBWTestParams.maxBitrate);
            this.mTransportOpt.setLong("rtmp_min_video_bitrate", uploadBWTestParams.minBitrate);
            this.mTransportOpt.setString("video_type", uploadBWTestParams.vCodec);
            this.mTransportOpt.setBool("video_enable_accelera", uploadBWTestParams.useHardwareEncode);
            this.mTransportOpt.setString("liveio_settings", pushBase.liveioSettings);
            tEBundle2.setInt("open_timeout", uploadBWTestParams.openTimeOut);
            tEBundle2.setInt("drop_video_frame_threshold_B", uploadBWTestParams.dropVideoFrameThresholdB);
            tEBundle2.setInt("enable_refactor_report_net_info", 1);
            tEBundle2.setInt("log_interval_ms", uploadBWTestParams.logIntervalMS);
            this.mTransportOpt.setBundle("rtmp_cache_cfg", tEBundle2);
            if (NumberInit.isDefined(Integer.valueOf(bWProbeQuicParams.getInitCwnd()))) {
                tEBundle3.setInt("init_cwnd", bWProbeQuicParams.getInitCwnd());
            }
            if (NumberInit.isDefined(Integer.valueOf(bWProbeQuicParams.getInitQuicType()))) {
                tEBundle3.setInt("init_quic_type", bWProbeQuicParams.getInitQuicType());
            }
            if (NumberInit.isDefined(Integer.valueOf(bWProbeQuicParams.getCongestionType()))) {
                tEBundle3.setInt("congestion_type", bWProbeQuicParams.getCongestionType());
            }
            if (NumberInit.isDefined(Integer.valueOf(bWProbeQuicParams.getEnbaleBbrInfoReport()))) {
                tEBundle3.setInt("enable_bbrinfo_report", bWProbeQuicParams.getEnbaleBbrInfoReport());
            }
            if (NumberInit.isDefined(Integer.valueOf(bWProbeQuicParams.getQuicVersion()))) {
                tEBundle3.setInt("quic_version", bWProbeQuicParams.getQuicVersion());
            } else {
                tEBundle3.setInt("quic_version", 43);
            }
            JSONObject quicConfigJson = bWProbeQuicParams.getQuicConfigJson();
            if (quicConfigJson != null) {
                tEBundle3.setString("quic_config_json", quicConfigJson.toString());
            }
            JSONObject quicEngineParam = bWProbeQuicParams.getQuicEngineParam();
            if (quicEngineParam != null) {
                tEBundle3.setString("quic_engine_param", quicEngineParam.toString());
            }
            this.mTransportOpt.setBundle("quic_params", tEBundle3);
        }
        NodeOptParams nodeOptParams = getNodeOptParams();
        if (nodeOptParams != null) {
            boolean strategyNodeOpt = nodeOptParams.getStrategyNodeOpt();
            this.mStrategyDnsOptOpen = strategyNodeOpt;
            if (strategyNodeOpt && this.mOptUrlMap == null) {
                this.mOptUrlMap = new HashMap<>();
                AVLog.ioe("LiveCoreUploadBWProbe", "dostart mOptUrlMap is not null");
            }
        }
        if (this.mDns == null && !this.mStrategyDnsOptOpen) {
            z = false;
        }
        this.mDnsOptOpen = z;
        this.mDnsOptHit = false;
        this.mEvaluatorSymbol = "";
    }

    private void parseUrlPrefixAndPort() {
        String str;
        String str2 = this.mSdkSetting.mUploadBWProbeParams.SuggestProtocol;
        if (str2 != null && !str2.equals("")) {
            str = this.mSdkSetting.mUploadBWProbeParams.SuggestProtocol;
            AVLog.logKibana(4, "LiveCoreUploadBWProbe", "SuggestProtocol from UploadBWProbeParams", null);
        } else {
            str = this.mSdkSetting.suggestProtocol;
            AVLog.logKibana(4, "LiveCoreUploadBWProbe", "SuggestProtocol from PushBase", null);
        }
        Map<String, Integer> map = this.mSdkSetting.rtmpPorts;
        if (map != null) {
            str.getClass();
            switch (str.hashCode()) {
                case 106008:
                    if (!str.equals("kcp")) {
                        return;
                    }
                    this.mPushUrlPrefix = "rtmpk://";
                    if (!map.containsKey("kcp")) {
                        return;
                    }
                    this.mRtmpPort = map.get("kcp").intValue();
                    return;
                case 114657:
                    if (!str.equals("tcp")) {
                        return;
                    }
                    this.mPushUrlPrefix = "rtmp://";
                    if (!map.containsKey("tcp")) {
                        return;
                    }
                    this.mRtmpPort = map.get("tcp").intValue();
                    return;
                case 114939:
                    if (!str.equals("tls")) {
                        return;
                    }
                    this.mPushUrlPrefix = "rtmps://";
                    if (!map.containsKey("tls")) {
                        return;
                    }
                    this.mRtmpPort = map.get("tls").intValue();
                    return;
                case 3482174:
                    if (!str.equals("quic")) {
                        return;
                    }
                    this.mPushUrlPrefix = "rtmpq://";
                    if (!map.containsKey("quic")) {
                        return;
                    }
                    this.mRtmpPort = map.get("quic").intValue();
                    return;
                default:
                    return;
            }
        }
    }

    public QuicParams getBWProbeQuicParams() {
        return this.mSdkSetting.mUploadBWProbeParams.quicParams;
    }

    public String getLiveStreamUrl() {
        HashMap<String, String> hashMap;
        String str = this.mUri;
        if (!TextUtils.isEmpty(str) && this.mDnsOptOpen && this.mDnsOptHit && (hashMap = this.mOptUrlMap) != null && hashMap.containsKey(str)) {
            String str2 = this.mOptUrlMap.get(str);
            if (!TextUtils.isEmpty(str2) && !str2.equals("INVALID_URL")) {
                str = str2;
            }
        }
        String disPatchedUrl = getDisPatchedUrl(str);
        if (!TextUtils.isEmpty(disPatchedUrl)) {
            long j = this.mUrlPriority;
            if (j != 0) {
                disPatchedUrl = UrlUtils.AddParam(disPatchedUrl, "pri", String.valueOf(j));
            }
        }
        if (!TextUtils.isEmpty(disPatchedUrl) && !TextUtils.isEmpty(getStreamUniqueId())) {
            return UrlUtils.AddParam(disPatchedUrl, "_session_id", getStreamUniqueId());
        }
        return disPatchedUrl;
    }

    public void getOptimizedUrl() {
        HashMap<String, String> hashMap;
        String str = this.mUri;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ((this.mDns == null && !this.mStrategyDnsOptOpen) || isNodeOptDisabled(str)) {
            if (this.mDns != null) {
                AVLog.iow("LiveCoreUploadBWProbe", "Dns optimize disabled via vpass.");
            }
            this.mDnsOptOpen = false;
        }
        if (this.mDnsOptOpen && (hashMap = this.mOptUrlMap) != null && hashMap.containsKey(str) && this.mOptUrlMap.get(str).equals("INVALID_URL")) {
            this.mDnsOptOpen = false;
        }
        this.mDnsOptHit = false;
        this.mEvaluatorSymbol = "";
        if (!this.mDnsOptOpen || this.mOptUrlMap == null) {
            return;
        }
        try {
            String[] optUrlAndEvaluateSymbol = getOptUrlAndEvaluateSymbol(this.mDns, str);
            if (optUrlAndEvaluateSymbol != null && optUrlAndEvaluateSymbol.length == 2 && !TextUtils.isEmpty(optUrlAndEvaluateSymbol[0])) {
                this.mOptUrlMap.put(str, optUrlAndEvaluateSymbol[0]);
                this.mDnsOptHit = true;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Dns optimize hit: optimized url ");
                LIZ.append(optUrlAndEvaluateSymbol[0]);
                LIZ.append(", evaluate symbol ");
                LIZ.append(optUrlAndEvaluateSymbol[1]);
                LIZ.append("mDnsOptOpen: ");
                LIZ.append(this.mDnsOptOpen);
                LIZ.append("mDnsOptHit:");
                LIZ.append(this.mDnsOptHit);
                AVLog.ioi("LiveCoreUploadBWProbe", X1D.LIZIZ(LIZ));
                String str2 = optUrlAndEvaluateSymbol[1];
                this.mEvaluatorSymbol = str2;
                if (!TextUtils.isEmpty(str2)) {
                    return;
                }
                this.mEvaluatorSymbol = "sdk_previous_dns";
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public String getStreamId() {
        if (!TextUtils.isEmpty(this.streamID)) {
            return this.streamID;
        }
        String replace = UUID.randomUUID().toString().replace("-", "");
        this.streamID = replace;
        return replace;
    }

    public String getStreamUniqueId() {
        if (!TextUtils.isEmpty(this.mStreamUuid)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.mStreamUuid);
            LIZ.append(".");
            LIZ.append(this.mUrlPriority);
            return X1D.LIZIZ(LIZ);
        }
        return "";
    }

    public void release() {
        Looper looper;
        Thread thread;
        AVLog.logKibana(4, "LiveCoreUploadBWProbe", "release()", null);
        if (this.mRtmpUploadBWProbe != null) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreUploadBWProbe.3
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$3__run$___twin___() {
                    LiveCoreUploadBWProbe.this.mRtmpUploadBWProbe.release();
                }

                public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        final Object obj = new Object();
        final boolean[] zArr = {true};
        synchronized (obj) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreUploadBWProbe.4
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$4__run$___twin___() {
                    synchronized (obj) {
                        zArr[0] = false;
                        obj.notifyAll();
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                    boolean LIZ;
                    try {
                        anonymousClass4.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$4__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            try {
                obj.wait(500L);
                if (zArr[0] && (looper = this.mWorkThreadHandler.getLooper()) != null && (thread = looper.getThread()) != null) {
                    LiveStream.dumpJavaThreadStackIfNeed(thread, "LiveCoreUploadBWProbe");
                }
            } catch (InterruptedException unused) {
            }
        }
        SafeHandlerThread safeHandlerThread = this.mWorkThread;
        if (safeHandlerThread != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread);
            this.mWorkThread = null;
        }
        if (this.mListener != null) {
            this.mListener = null;
        }
    }

    public void stopBWTest() {
        AVLog.logKibana(4, "LiveCoreUploadBWProbe", "stopBWTest()", null);
        RTMPUploadBWProbe rTMPUploadBWProbe = this.mRtmpUploadBWProbe;
        if (rTMPUploadBWProbe != null) {
            rTMPUploadBWProbe.stopBWTest();
        }
    }

    public String getRtmpTcUrl() {
        if (isUsingOptimizedUrl()) {
            String str = this.mUri;
            try {
                return str.substring(0, str.lastIndexOf(47) + 1);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public void setUrlParams() {
        String liveStreamUrl = getLiveStreamUrl();
        String rtmpTcUrl = getRtmpTcUrl();
        if (!TextUtils.isEmpty(rtmpTcUrl)) {
            this.mTransportOpt.setString("rtmp_tc_url", rtmpTcUrl);
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(rtmpTcUrl);
                LIZ.append(liveStreamUrl.substring(liveStreamUrl.lastIndexOf(47) + 1));
                liveStreamUrl = X1D.LIZIZ(LIZ);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        this.mUploadBWTestOpt.setString("real_url", liveStreamUrl);
    }

    public void updateUrlPriority() {
        this.mUrlPriority = System.currentTimeMillis();
    }

    public int getQuicFlag() {
        return this.mQuicFlag;
    }

    public LiveCoreUploadBWProbe(RTMPUploadBWProbe.Listener listener) {
        this.mListener = null;
        this.mListener = listener;
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("LiveCoreWorkUploadBWProbeThread");
        this.mWorkThread = lockThread;
        lockThread.start();
        this.mWorkThreadHandler = this.mWorkThread.getHandler();
    }

    private void SendLogInfo(TEBundle tEBundle) {
        RTMPUploadBWProbe rTMPUploadBWProbe = this.mRtmpUploadBWProbe;
        if (rTMPUploadBWProbe != null) {
            rTMPUploadBWProbe.SendLogInfo(tEBundle);
        }
    }

    private void SetStartNativeApiCallTime1970(long j) {
        RTMPUploadBWProbe rTMPUploadBWProbe = this.mRtmpUploadBWProbe;
        if (rTMPUploadBWProbe != null) {
            rTMPUploadBWProbe.SetStartNativeApiCallTime1970(j);
        }
    }

    private void bWProbeFailUploadResult(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bwProbeState", 2);
            jSONObject.put("bwProbeFailReason_", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        AVLog.logKibanaEvent(4, "LiveCoreUploadBWProbe", "bw_probe", false, jSONObject.toString(), null);
    }

    private String getDisPatchedUrl(String str) {
        if (isRtsUrl(str)) {
            return str;
        }
        String str2 = this.mPushUrlPrefix;
        int i = this.mRtmpPort;
        if (str2.length() > 0 && i > 0) {
            String urlPrefixAndPort = setUrlPrefixAndPort(str2, i, str);
            if (!tryLoadQuicLibrary(urlPrefixAndPort)) {
                return str;
            }
            return urlPrefixAndPort;
        }
        return str;
    }

    private boolean isNodeOptDisabled(String str) {
        NodeOptParams nodeOptParams = getNodeOptParams();
        if (nodeOptParams == null) {
            return false;
        }
        String str2 = this.mPushUrlPrefix;
        if (str2.length() > 0 && this.mRtmpPort > 0) {
            str = str2;
        }
        if ((!str.startsWith("rtmp://") || !NumberInit.isDefined(Integer.valueOf(nodeOptParams.getRtmp())) || nodeOptParams.getRtmp() != 0) && ((!str.startsWith("rtmps://") || !NumberInit.isDefined(Integer.valueOf(nodeOptParams.getRtmps())) || nodeOptParams.getRtmps() != 0) && (!str.startsWith("rtmpq://") || !NumberInit.isDefined(Integer.valueOf(nodeOptParams.getRtmpq())) || nodeOptParams.getRtmpq() != 0))) {
            return false;
        }
        return true;
    }

    private boolean isRtsUrl(String str) {
        String[] split;
        if (str == null || (split = str.split("\\?")) == null || split.length < 1) {
            return false;
        }
        return split[0].contains(".sdp");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean tryLoadQuicLibrary(String str) {
        int i;
        if (!str.startsWith("rtmpq")) {
            return false;
        }
        try {
            if (LibraryLoader.loadLibrary("vcbasekit") && LibraryLoader.loadLibrary("ttquic")) {
                i = 1;
                AVLog.ioi("LiveCoreUploadBWProbe", "ttquic lib is load success");
            } else {
                i = 0;
                AVLog.ioi("LiveCoreUploadBWProbe", "ttquic lib is load fail");
            }
            this.mQuicFlag = i;
            return i;
        } catch (Throwable unused) {
            this.mQuicFlag = 0;
            AVLog.ioi("LiveCoreUploadBWProbe", "ttquic lib is load failed，change to nomal tcp");
            return false;
        }
    }

    public void SetEndNodeOptimizeTime1970(long j) {
        RTMPUploadBWProbe rTMPUploadBWProbe = this.mRtmpUploadBWProbe;
        if (rTMPUploadBWProbe != null) {
            rTMPUploadBWProbe.SetEndNodeOptimizeTime1970(j);
        }
    }

    public void appendNodeOptimizedInfo(long j) {
        boolean z;
        String str;
        long j2;
        boolean z2 = false;
        if (getNodeOptParams() != null) {
            getNodeOptParams().getPreparedIp();
            z = getNodeOptParams().getStrategyNodeOpt();
            getNodeOptParams().getWaitStrategyCallbackMs();
        } else {
            z = false;
        }
        if (this.mDnsOptOpen) {
            z2 = this.mDnsOptHit;
            str = this.mRequestId;
        } else {
            str = "";
        }
        if (this.mEnableSendLogInfo) {
            TEBundle tEBundle = new TEBundle();
            long j3 = 1;
            if (z2) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            tEBundle.setLong("hit_node_optimize", j2);
            if (!z) {
                j3 = 0;
            }
            tEBundle.setLong("node_optimize_strategy", j3);
            tEBundle.setLong("node_optimize_timecost_ms", (int) (System.currentTimeMillis() - j));
            tEBundle.setString("node_optimize_request_id", str);
            SendLogInfo(tEBundle);
            tEBundle.release();
        }
    }

    public void setDns(final InterfaceC63833P3l interfaceC63833P3l) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" setDns(), dns: ");
        LIZ.append(interfaceC63833P3l);
        AVLog.logKibana(4, "LiveCoreUploadBWProbe", X1D.LIZIZ(LIZ), null);
        Handler handler = this.mWorkThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreUploadBWProbe.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$1__run$___twin___() {
                    boolean z;
                    LiveCoreUploadBWProbe liveCoreUploadBWProbe = LiveCoreUploadBWProbe.this;
                    InterfaceC63833P3l interfaceC63833P3l2 = interfaceC63833P3l;
                    liveCoreUploadBWProbe.mDns = interfaceC63833P3l2;
                    if (interfaceC63833P3l2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    liveCoreUploadBWProbe.mDnsOptOpen = z;
                    liveCoreUploadBWProbe.mOptUrlMap = new HashMap<>();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("execute setDns, mDnsOptOpen ");
                    LIZ2.append(LiveCoreUploadBWProbe.this.mDnsOptOpen);
                    AVLog.logKibana(5, "LiveCoreUploadBWProbe", X1D.LIZIZ(LIZ2), null);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ2;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$1__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
    }

    public void setProjectKey(String str) {
        this.mProjectKey = str;
    }

    public void setStreamUniqueIdentifier(String str) {
        this.mStreamUuid = str;
    }

    public void setupSdkParams(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setupSdkParams(), sdkParams: ");
        LIZ.append(str);
        AVLog.logKibana(4, "LiveCoreUploadBWProbe", X1D.LIZIZ(LIZ), null);
        try {
            TinyJson.fromJson(new JSONObject(str), LiveSdkSetting.class, this.mSdkSetting);
            parseParams();
            parseUrlPrefixAndPort();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            TTLSSladarBugReportUtils.getInstance().report(e, "LiveCoreUploadBWProbe.setupSDKParams");
            if (!TTLSBuildConfig.canThrowException()) {
                AVLog.logKibana(6, "TinyJson", "parse sdkParams json failed", e);
                return;
            }
            throw new AndroidRuntimeException(e);
        }
    }

    public int startBWTest(String str) {
        return startBWTestInternal(str, 1);
    }

    public int startPrePushStream(String str) {
        if (TextUtils.isEmpty(str)) {
            RTMPUploadBWProbe.Listener listener = this.mListener;
            if (listener != null) {
                listener.onMessage(2, -2, 0L, null);
            }
            return -1;
        }
        if (isRtsUrl(str)) {
            RTMPUploadBWProbe.Listener listener2 = this.mListener;
            if (listener2 != null) {
                listener2.onMessage(2, -3, 0L, null);
            }
            return -1;
        }
        return startBWTestInternal(str, 2);
    }

    private String getNodeOptResultFromStrategySDK(String str, String str2) {
        JSONArray optJSONArray;
        String str3 = null;
        this.mStrategynodeOptimizerInfos = null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("host", str);
            jSONObject.put("stream_session_vv_id", getLiveStreamUrl());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        NodeOptParams nodeOptParams = getNodeOptParams();
        if (nodeOptParams != null) {
            nodeOptParams.getEnableWaitStrategyCallback();
        }
        JSONObject jSONObject2 = (JSONObject) LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(1, 13, null, jSONObject);
        this.mStrategynodeOptimizerInfos = jSONObject2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get strategy node optimizer infos: ");
        LIZ.append(jSONObject2);
        AVLog.ioi("LiveCoreUploadBWProbe", X1D.LIZIZ(LIZ));
        if (jSONObject2 != null) {
            if (jSONObject2.has("Ip")) {
                str3 = jSONObject2.optString("Ip");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("get ip from strategy sdk, ip: ");
                LIZ2.append(str3);
                AVLog.ioi("LiveCoreUploadBWProbe", X1D.LIZIZ(LIZ2));
            }
            if (jSONObject2.has("RemoteResult") && this.mPreparedIpList != null && (optJSONArray = jSONObject2.optJSONArray("RemoteResult")) != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
                this.mPreparedIpList.put(str2, arrayList);
            }
            if (jSONObject2.has("RequestId")) {
                this.mRequestId = jSONObject2.optString("RequestId");
            }
            if (jSONObject2.has("EvaluatorSymbol")) {
                JSONObject optJSONObject = jSONObject2.optJSONObject("EvaluatorSymbol");
                this.mEvaluatorSymbolMap = optJSONObject;
                if (optJSONObject != null && optJSONObject.has(str3)) {
                    this.mEvaluatorSymbol = this.mEvaluatorSymbolMap.optString(str3);
                }
            }
        }
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0119 A[LOOP:0: B:5:0x001a->B:18:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[EDGE_INSN: B:19:0x0037->B:20:0x0037 BREAK  A[LOOP:0: B:5:0x001a->B:18:0x0119], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String[] getOptUrlAndEvaluateSymbol(X.InterfaceC63833P3l r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreUploadBWProbe.getOptUrlAndEvaluateSymbol(X.P3l, java.lang.String):java.lang.String[]");
    }

    public int startBWTestInternal(final String str, final int i) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startBWTest(), url : ");
        LIZ.append(str);
        AVLog.logKibana(4, "LiveCoreUploadBWProbe", X1D.LIZIZ(LIZ), null);
        if (str == null || TextUtils.isEmpty(str)) {
            if (this.mListener != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", 4);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                this.mListener.onMessage(2, 0, 0L, jSONObject.toString());
                bWProbeFailUploadResult(4);
            }
            return -1;
        }
        if (isRtsUrl(str)) {
            if (this.mListener != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("reason", 5);
                } catch (JSONException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                this.mListener.onMessage(2, 0, 0L, jSONObject2.toString());
                bWProbeFailUploadResult(5);
            }
            return -1;
        }
        if (this.mListener != null) {
            this.mRtmpUploadBWProbe = new RTMPUploadBWProbe(getPushBase().rtmpLockOpt, this.mListener);
        }
        if (this.mRtmpUploadBWProbe == null) {
            return -1;
        }
        SetStartNativeApiCallTime1970(currentTimeMillis);
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreUploadBWProbe.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$2__run$___twin___() {
                LiveCoreUploadBWProbe liveCoreUploadBWProbe = LiveCoreUploadBWProbe.this;
                if (liveCoreUploadBWProbe.mRtmpUploadBWProbe != null) {
                    liveCoreUploadBWProbe.mUri = str;
                    liveCoreUploadBWProbe.setStreamUniqueIdentifier(liveCoreUploadBWProbe.getStreamId());
                    LiveCoreUploadBWProbe.this.updateUrlPriority();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    LiveCoreUploadBWProbe.this.getOptimizedUrl();
                    LiveCoreUploadBWProbe.this.appendNodeOptimizedInfo(currentTimeMillis2);
                    LiveCoreUploadBWProbe.this.SetEndNodeOptimizeTime1970(System.currentTimeMillis());
                    LiveCoreUploadBWProbe.this.setUrlParams();
                    LiveCoreUploadBWProbe liveCoreUploadBWProbe2 = LiveCoreUploadBWProbe.this;
                    liveCoreUploadBWProbe2.mRtmpUploadBWProbe.setParameter(liveCoreUploadBWProbe2.mUploadBWTestOpt, liveCoreUploadBWProbe2.mTransportOpt);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("mUploadBWTestOpt: ");
                    LIZ2.append(LiveCoreUploadBWProbe.this.mUploadBWTestOpt.toString());
                    LIZ2.append(" , mTransportOpt: ");
                    LIZ2.append(LiveCoreUploadBWProbe.this.mTransportOpt.toString());
                    AVLog.logKibana(4, "LiveCoreUploadBWProbe", X1D.LIZIZ(LIZ2), null);
                    String liveStreamUrl = LiveCoreUploadBWProbe.this.getLiveStreamUrl();
                    int i2 = i;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            return;
                        }
                        LiveCoreUploadBWProbe.this.mRtmpUploadBWProbe.startPrePushStream(liveStreamUrl);
                        return;
                    }
                    LiveCoreUploadBWProbe.this.mRtmpUploadBWProbe.startBWTest(liveStreamUrl);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ2;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreUploadBWProbe$2__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        return 0;
    }

    private String setUrlPrefixAndPort(String str, int i, String str2) {
        String str3;
        int indexOf = str2.indexOf("://");
        if (indexOf > 0) {
            str2 = str2.substring(indexOf + 3);
        }
        int indexOf2 = str2.indexOf("/", 0);
        int indexOf3 = str2.indexOf(":", 0);
        if (indexOf2 > 0) {
            if (indexOf3 <= 0) {
                indexOf3 = indexOf2;
            }
            String substring = str2.substring(0, indexOf3);
            str3 = str2.substring(indexOf2);
            str2 = substring;
        } else {
            str3 = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        LIZ.append(":");
        LIZ.append(i);
        LIZ.append(str3);
        return X1D.LIZIZ(LIZ);
    }
}
