package com.ss.android.ugc.aweme.video.experiment;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;

/* loaded from: classes9.dex */
public class PlayerLongVideoBufferConfig {

    @InterfaceC65349Pkn("enable_long_video_buffer_opt")
    public int enableLongVideoBufferOpt;

    @InterfaceC65349Pkn("player_long_video_duration_ms")
    public int longVideoDurationDefinition = 60000;

    @InterfaceC65349Pkn("player_long_video_buffer_time_ms")
    public int longVideoBufferTimeMs = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    @InterfaceC65349Pkn("player_long_video_max_buffer_time_ms")
    public int longVideoMaxBufferTimeMs = 10000;
}
