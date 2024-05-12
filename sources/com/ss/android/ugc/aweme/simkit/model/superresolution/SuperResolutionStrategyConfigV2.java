package com.ss.android.ugc.aweme.simkit.model.superresolution;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class SuperResolutionStrategyConfigV2 {

    @InterfaceC65349Pkn("enable_release_texture_render")
    public boolean enableReleaseTexture;

    @InterfaceC65349Pkn("fps_threshold")
    public int fpsThreshold;

    @InterfaceC65349Pkn("max_quality_diff")
    public float maxQualityDiff;

    @InterfaceC65349Pkn("restart_sr_time_threshold")
    public int restartSrTimeThreshold;

    @InterfaceC65349Pkn("battery_percent_threshold")
    public float batteryPercentThreshold = 0.2f;

    @InterfaceC65349Pkn("video_time_percent_threshold")
    public float videoTimePercentThreshold = 0.7f;

    @InterfaceC65349Pkn("quality_type_duration_threshold")
    public Map<Integer, Long> qualityTypeDurationThreshold = new HashMap();

    @InterfaceC65349Pkn("resolution_duration_threshold")
    public Map<Integer, Long> resolutionDurationThreshold = new HashMap();

    @InterfaceC65349Pkn("quality_type_min_duration_threshold")
    public Map<Integer, Long> qualityTypeMinDurationThreshold = new HashMap();

    @InterfaceC65349Pkn("resolution_min_duration_threshold")
    public Map<Integer, Long> resolutionMinDurationThreshold = new HashMap();

    @InterfaceC65349Pkn("dash_min_duration_threshold")
    public long dashMinDurationThreshold = 0;

    @InterfaceC65349Pkn("dash_sr")
    public boolean dashSr = false;

    @InterfaceC65349Pkn("splash_ad_sr")
    public boolean splashAdSr = false;

    @InterfaceC65349Pkn("splash_ad_sr_max_width")
    public int splashAdSrMaxWidth = 0;

    @InterfaceC65349Pkn("splash_ad_sr_max_height")
    public int splashAdSrMaxHeight = 0;

    @InterfaceC65349Pkn("ad_sr")
    public boolean adSr = false;

    @InterfaceC65349Pkn("async_init_sr")
    public int asyncInitSr = 1;

    @InterfaceC65349Pkn("close_sr_for_user_local_videos")
    public boolean closeSrForUserLocalVideos = false;

    @InterfaceC65349Pkn("consider_bitrate_v2")
    public boolean considerBitrateV2 = false;

    @InterfaceC65349Pkn("low_bitrate_sr_ver")
    public int lowBitrateSrVer = 0;

    @InterfaceC65349Pkn("low_bitrate_sr_delay_cnt")
    public int lowBitrateSrDelayCnt = 1;

    @InterfaceC65349Pkn("low_bitrate_sr_percent_threshold")
    public float lowBitrateSrPercentThreshold = 1.0f;

    @InterfaceC65349Pkn("sr_bitrate_curve")
    public Map<Float, AutoBitrateSet> srBitrateCurve = new HashMap();

    @InterfaceC65349Pkn("enable_266_sr")
    public boolean enable266Sr = true;

    @InterfaceC65349Pkn("sr_bitrate_curve_lowest_quality")
    public int srBitrateCurveLowestQuality = 0;

    @InterfaceC65349Pkn("sr_bitrate_curve_fps_threshold")
    public int srBitrateCurveFpsThreshold = 0;

    @InterfaceC65349Pkn("sr_bitrate_curve_without_1080")
    public boolean srBitrateCurveWithout1080 = false;
}
