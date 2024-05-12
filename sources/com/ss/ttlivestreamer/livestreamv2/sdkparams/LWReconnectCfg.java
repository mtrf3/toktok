package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.livecore.base.tinyjson.annotations.Serialized;

/* loaded from: classes12.dex */
public final class LWReconnectCfg {

    @Serialized("lw_reconnect_close_abr_drop_frame")
    public int lwReconnectCloseAbrDropFrame;

    @Serialized("lw_reconnect_enable_request_Iframe")
    public int lwReconnectEnableRequestIFrame;

    @Serialized("enable_lw_reconnect")
    public boolean enableLWReconnect = true;

    @Serialized("lw_reconnect_drop_frame_thresh")
    public int lwReconnectDropFrameThresh = 3000;

    @Serialized("lw_reconnect_enable_drop_frame")
    public int lwReconnectEnableDropFrame = 1;

    @Serialized("lw_reconnect_open_timeout")
    public int lwReconnectOpenTimeout = 3000;

    @Serialized("lightWeightReconnectMaxExecTime")
    public int lightWeightReconnectMaxExecTime = 3000;

    @Serialized("lightWeightReconnectRetryThreshold")
    public int lightWeightReconnectRetryThreshold = 100;

    @Serialized("lw_reconnect_request_Iframe_thresh")
    public int lwReconnectRequestIFrameThresh = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    public final boolean getEnableLWReconnect() {
        return this.enableLWReconnect;
    }

    public final int getLightWeightReconnectMaxExecTime() {
        return this.lightWeightReconnectMaxExecTime;
    }

    public final int getLightWeightReconnectRetryThreshold() {
        return this.lightWeightReconnectRetryThreshold;
    }

    public final int getLwReconnectCloseAbrDropFrame() {
        return this.lwReconnectCloseAbrDropFrame;
    }

    public final int getLwReconnectDropFrameThresh() {
        return this.lwReconnectDropFrameThresh;
    }

    public final int getLwReconnectEnableDropFrame() {
        return this.lwReconnectEnableDropFrame;
    }

    public final int getLwReconnectEnableRequestIFrame() {
        return this.lwReconnectEnableRequestIFrame;
    }

    public final int getLwReconnectOpenTimeout() {
        return this.lwReconnectOpenTimeout;
    }

    public final int getLwReconnectRequestIFrameThresh() {
        return this.lwReconnectRequestIFrameThresh;
    }

    public final void setEnableLWReconnect(boolean z) {
        this.enableLWReconnect = z;
    }

    public final void setLightWeightReconnectMaxExecTime(int i) {
        this.lightWeightReconnectMaxExecTime = i;
    }

    public final void setLightWeightReconnectRetryThreshold(int i) {
        this.lightWeightReconnectRetryThreshold = i;
    }

    public final void setLwReconnectCloseAbrDropFrame(int i) {
        this.lwReconnectCloseAbrDropFrame = i;
    }

    public final void setLwReconnectDropFrameThresh(int i) {
        this.lwReconnectDropFrameThresh = i;
    }

    public final void setLwReconnectEnableDropFrame(int i) {
        this.lwReconnectEnableDropFrame = i;
    }

    public final void setLwReconnectEnableRequestIFrame(int i) {
        this.lwReconnectEnableRequestIFrame = i;
    }

    public final void setLwReconnectOpenTimeout(int i) {
        this.lwReconnectOpenTimeout = i;
    }

    public final void setLwReconnectRequestIFrameThresh(int i) {
        this.lwReconnectRequestIFrameThresh = i;
    }
}
