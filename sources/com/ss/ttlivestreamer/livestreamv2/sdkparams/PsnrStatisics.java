package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;

/* loaded from: classes12.dex */
public final class PsnrStatisics {

    @Serialized("enable")
    public boolean enablePsnr;

    @Serialized("psnr_period_seconds")
    public int psnrPeriodSeconds = 30;

    @Serialized("psnr_calc_frames")
    public int psnrCalcFrames = 20;

    public final boolean getEnablePsnr() {
        return this.enablePsnr;
    }

    public final int getPsnrCalcFrames() {
        return this.psnrCalcFrames;
    }

    public final int getPsnrPeriodSeconds() {
        return this.psnrPeriodSeconds;
    }

    public final void setEnablePsnr(boolean z) {
        this.enablePsnr = z;
    }

    public final void setPsnrCalcFrames(int i) {
        this.psnrCalcFrames = i;
    }

    public final void setPsnrPeriodSeconds(int i) {
        this.psnrPeriodSeconds = i;
    }
}
