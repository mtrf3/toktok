package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;

/* loaded from: classes12.dex */
public final class ReconnectConfig {

    @Serialized("disableTrace")
    public int disableTrace;

    @Serialized("version")
    public int version = 1;

    @Serialized("retryInitialTime")
    public int retryInitialTime = 1;

    @Serialized("retryIncreaseRatio")
    public double retryIncreaseRatio = 0.8d;

    @Serialized("maxDelayTime")
    public int maxDelayTime = 8;

    @Serialized("onceMaxTimeout")
    public int onceMaxTimeout = 10;

    @Serialized("allMaxTimeout")
    public int allMaxTimeout = 180;

    @Serialized("triggerUrlSelectRetryCount")
    public int triggerUrlSelectRetryCount = 5;

    public final int getAllMaxTimeout() {
        return this.allMaxTimeout;
    }

    public final int getDisableTrace() {
        return this.disableTrace;
    }

    public final int getMaxDelayTime() {
        return this.maxDelayTime;
    }

    public final int getOnceMaxTimeout() {
        return this.onceMaxTimeout;
    }

    public final double getRetryIncreaseRatio() {
        return this.retryIncreaseRatio;
    }

    public final int getRetryInitialTime() {
        return this.retryInitialTime;
    }

    public final int getTriggerUrlSelectRetryCount() {
        return this.triggerUrlSelectRetryCount;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setAllMaxTimeout(int i) {
        this.allMaxTimeout = i;
    }

    public final void setDisableTrace(int i) {
        this.disableTrace = i;
    }

    public final void setMaxDelayTime(int i) {
        this.maxDelayTime = i;
    }

    public final void setOnceMaxTimeout(int i) {
        this.onceMaxTimeout = i;
    }

    public final void setRetryIncreaseRatio(double d) {
        this.retryIncreaseRatio = d;
    }

    public final void setRetryInitialTime(int i) {
        this.retryInitialTime = i;
    }

    public final void setTriggerUrlSelectRetryCount(int i) {
        this.triggerUrlSelectRetryCount = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }
}
