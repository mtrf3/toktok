package com.ss.videoarch.liveplayer.config;

import X.VLH;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.videoarch.liveplayer.config.PlayerConfigParams;

/* loaded from: classes15.dex */
public class PlayerConfig {
    public VLH<Integer> VeLivePlayerKeySetHWAsyncMode = new VLH<>(0);
    public VLH<Integer> VeLivePlayerKeySetMaxCacheSeconds = new VLH<>(10);
    public VLH<Integer> VeLivePlayerKeySetDefaultBufferingEndMs = new VLH<>(-1);
    public VLH<Integer> VeLivePlayerKeySetBufferingEndIgnoreVideo = new VLH<>(0);
    public VLH<Integer> VeLivePlayerKeySetStartPlayAudioBufferThresholdMs = new VLH<>(0);
    public VLH<Integer> VeLivePlayerKeySetKernelOpenFailRetry = new VLH<>(-1);
    public VLH<Integer> VeLivePlayerKeySetABRAlgorithm = new VLH<>(0);
    public VLH<Integer> VeLivePlayerKeySetOpenTextureRender = new VLH<>(-1);
    public VLH<Integer> VeLivePlayerKeySetNTPEnable = new VLH<>(1);
    public VLH<Integer> VeLivePlayerKeySetHardwareDecode = new VLH<>(0);
    public VLH<Integer> VeLivePlayerKeySetSoftwareDecodeForidden = new VLH<>(1);
    public VLH<Integer> VeLivePlayerKeySetHurryEnable = new VLH<>(0);
    public VLH<Integer> VeLivePlayerKeySetHurryTime = new VLH<>(Integer.valueOf(LiveNetAdaptiveHurryTimeSetting.DEFAULT));
    public VLH<Float> VeLivePlayerKeySetHurrySpeed = new VLH<>(Float.valueOf(1.2f));
    public VLH<Integer> VeLivePlayerKeySetSlowTime = new VLH<>(200);
    public VLH<Float> VeLivePlayerKeySetSlowSpeed = new VLH<>(Float.valueOf(0.9f));
    public VLH<Integer> VeLivePlayerKeySetReportApplogEnable = new VLH<>(1);
    public VLH<Integer> VeLivePlayerKeySetReportKernelLogEnable = new VLH<>(0);
    public PlayerConfigParams.NNSRParams SRConfig = new PlayerConfigParams.NNSRParams();
}
