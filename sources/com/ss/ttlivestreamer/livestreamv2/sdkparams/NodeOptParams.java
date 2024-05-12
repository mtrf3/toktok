package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;

/* loaded from: classes12.dex */
public final class NodeOptParams {

    @Serialized("enableWaitStrategyCallback")
    public boolean enableWaitStrategyCallback;

    @Serialized("preparedIp")
    public boolean preparedIp;

    @Serialized("strategyNodeOpt")
    public boolean strategyNodeOpt;

    @Serialized("rtmp")
    public int rtmp = Integer.MAX_VALUE;

    @Serialized("rtmps")
    public int rtmps = Integer.MAX_VALUE;

    @Serialized("rtmpq")
    public int rtmpq = Integer.MAX_VALUE;

    @Serialized("waitStrategyCallbackMs")
    public int waitStrategyCallbackMs = 1000;

    public final boolean getEnableWaitStrategyCallback() {
        return this.enableWaitStrategyCallback;
    }

    public final boolean getPreparedIp() {
        return this.preparedIp;
    }

    public final int getRtmp() {
        return this.rtmp;
    }

    public final int getRtmpq() {
        return this.rtmpq;
    }

    public final int getRtmps() {
        return this.rtmps;
    }

    public final boolean getStrategyNodeOpt() {
        return this.strategyNodeOpt;
    }

    public final int getWaitStrategyCallbackMs() {
        return this.waitStrategyCallbackMs;
    }

    public final void setEnableWaitStrategyCallback(boolean z) {
        this.enableWaitStrategyCallback = z;
    }

    public final void setPreparedIp(boolean z) {
        this.preparedIp = z;
    }

    public final void setRtmp(int i) {
        this.rtmp = i;
    }

    public final void setRtmpq(int i) {
        this.rtmpq = i;
    }

    public final void setRtmps(int i) {
        this.rtmps = i;
    }

    public final void setStrategyNodeOpt(boolean z) {
        this.strategyNodeOpt = z;
    }

    public final void setWaitStrategyCallbackMs(int i) {
        this.waitStrategyCallbackMs = i;
    }
}
