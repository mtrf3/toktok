package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.livecore.base.tinyjson.annotations.Serialized;

/* loaded from: classes12.dex */
public class UploadBWProbeParams {

    @Serialized("EwmaEstimate")
    public double EwmaEstimate;

    @Serialized("ReportBbrInfo")
    public int ReportBbrInfo;

    @Serialized("useHardware")
    public boolean useHardwareEncode;

    @Serialized("bWTestTime")
    public int bWTestTime = 10;

    @Serialized("bWTestTimeMS")
    public int bWTestTimeMS = 3900;

    @Serialized("packetSendValidTimeMS")
    public int packetSendValidTimeMS = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    @Serialized("PeakAvgCount")
    public int PeakAvgCount = 1;

    @Serialized("logInterval")
    public int logInterval = 1;

    @Serialized("logIntervalMS")
    public int logIntervalMS = 900;

    @Serialized("BottomLine540p")
    public int bottomLine540p = 1300;

    @Serialized("BottomLine720p")
    public int bottomLine720p = 1600;

    @Serialized("vCodec")
    public String vCodec = "video/bytevc1";

    @Serialized("defaultBitrate")
    public int defaultBitrate = 6000000;

    @Serialized("minBitrate")
    public int minBitrate = 6000000;

    @Serialized("maxBitrate")
    public int maxBitrate = 6000000;

    @Serialized("dropVideoFrameThresholdB")
    public int dropVideoFrameThresholdB = 20000;

    @Serialized("openTimeout")
    public int openTimeOut = 10000;

    @Serialized("prePushStreamThreshold")
    public int prePushStreamThreshold = 10000;

    @Serialized("prePushStreamDropFrameRange")
    public double prePushStreamDropFrameRange = 0.5d;

    @Serialized("BottomLine540pBwe")
    public int BottomLine540pBwe = LiveCenterDelayLoadSetting.DEFAULT;

    @Serialized("BottomLine720pBwe")
    public int BottomLine720pBwe = 15000;

    @Serialized("BWProbeBottomLevel")
    public int BWProbeBottomLevel = 1;

    @Serialized("BWProbeAimLevel")
    public int BWProbeAimLevel = 1;

    @Serialized("SuggestProtocol")
    public String SuggestProtocol = "tls";

    @Serialized("ResultStrategy")
    public int ResultStrategy = 11;

    @Serialized("EwmaHalfLife")
    public int EwmaHalfLife = 20;

    @Serialized("EwmaWeight")
    public double EwmaWeight = 60.0d;

    @Serialized("FirstOrderFilterParam")
    public double FirstOrderFilterParam = 0.9d;

    @Serialized("BWProbeRtmpq")
    public QuicParams quicParams = new QuicParams();

    @Serialized("LevelChooseMode")
    public int LevelChooseMode = 1;

    @Serialized("EnableSendLogInfo")
    public boolean enalbeSendLogInfo = false;
}
