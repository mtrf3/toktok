package com.ss.android.ugc.aweme.ml.ab;

import X.InterfaceC65349Pkn;
import X.WM7;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;

/* loaded from: classes9.dex */
public final class OneSmartDataTrackConfig {

    @InterfaceC65349Pkn("need_save")
    public boolean needSave;

    @InterfaceC65349Pkn("predict")
    public InputFeaturesConfig predict;

    @InterfaceC65349Pkn("real")
    public InputFeaturesConfig real;

    @InterfaceC65349Pkn("report_rate")
    public float reportRate;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene;

    @InterfaceC65349Pkn("track_type")
    public int trackType;

    @InterfaceC65349Pkn("zip_zero")
    public boolean zipZero;

    @InterfaceC65349Pkn("target_event")
    public String targetEvent = "";

    @InterfaceC65349Pkn("next_real_cnt")
    public int nextRealCnt = 1;

    @InterfaceC65349Pkn("real_trigger")
    public int realTriggerType = 101;

    public String toString() {
        return super.toString();
    }

    public final boolean getNeedSave() {
        return this.needSave;
    }

    public final int getNextRealCnt() {
        return this.nextRealCnt;
    }

    public final InputFeaturesConfig getPredict() {
        return this.predict;
    }

    public final InputFeaturesConfig getReal() {
        return this.real;
    }

    public final int getRealTriggerType() {
        return this.realTriggerType;
    }

    public final float getReportRate() {
        return this.reportRate;
    }

    public final String getScene() {
        return this.scene;
    }

    public final String getTargetEvent() {
        return this.targetEvent;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final boolean getZipZero() {
        return this.zipZero;
    }

    public final void setNeedSave(boolean z) {
        this.needSave = z;
    }

    public final void setNextRealCnt(int i) {
        this.nextRealCnt = i;
    }

    public final void setPredict(InputFeaturesConfig inputFeaturesConfig) {
        this.predict = inputFeaturesConfig;
    }

    public final void setReal(InputFeaturesConfig inputFeaturesConfig) {
        this.real = inputFeaturesConfig;
    }

    public final void setRealTriggerType(int i) {
        this.realTriggerType = i;
    }

    public final void setReportRate(float f) {
        this.reportRate = f;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setTargetEvent(String str) {
        this.targetEvent = str;
    }

    public final void setTrackType(int i) {
        this.trackType = i;
    }

    public final void setZipZero(boolean z) {
        this.zipZero = z;
    }
}
