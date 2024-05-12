package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class EncStrategyConfig {

    @Serialized("qulity_mode")
    public int qualityMode;

    @Serialized("strategy_adjust_mode")
    public int strategyAdjustMode = 1;

    @Serialized("category_params")
    public String categoryParams = "";

    @Serialized("bitrate_ratios")
    public String bitrateRatios = "";

    @Serialized("fps_ratios")
    public String fpsRatios = "";

    public final String getBitrateRatios() {
        return this.bitrateRatios;
    }

    public final String getCategoryParams() {
        return this.categoryParams;
    }

    public final String getFpsRatios() {
        return this.fpsRatios;
    }

    public final int getQualityMode() {
        return this.qualityMode;
    }

    public final int getStrategyAdjustMode() {
        return this.strategyAdjustMode;
    }

    public final void setBitrateRatios(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.bitrateRatios = str;
    }

    public final void setCategoryParams(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.categoryParams = str;
    }

    public final void setFpsRatios(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.fpsRatios = str;
    }

    public final void setQualityMode(int i) {
        this.qualityMode = i;
    }

    public final void setStrategyAdjustMode(int i) {
        this.strategyAdjustMode = i;
    }
}
