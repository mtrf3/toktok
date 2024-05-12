package com.ss.android.ugc.aweme.ml.infra;

import X.InterfaceC65349Pkn;
import X.WM7;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;

/* loaded from: classes9.dex */
public class SmartSceneConfig {

    @InterfaceC65349Pkn("disable")
    public boolean disable;

    @InterfaceC65349Pkn("disable_monitor")
    public boolean disableMonitor;

    @InterfaceC65349Pkn("features")
    public InputFeaturesConfig features;

    @InterfaceC65349Pkn("out_type")
    public String outType;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene;

    @InterfaceC65349Pkn("sdk")
    public SmartSdkConfig sdkConfig;

    @InterfaceC65349Pkn("skip_count")
    public int skipCount;

    @InterfaceC65349Pkn("track")
    public OneSmartDataTrackConfig track;

    public String toString() {
        return super.toString();
    }

    public final boolean getDisable() {
        return this.disable;
    }

    public final boolean getDisableMonitor() {
        return this.disableMonitor;
    }

    public final InputFeaturesConfig getFeatures() {
        return this.features;
    }

    public final String getScene() {
        return this.scene;
    }

    public final SmartSdkConfig getSdkConfig() {
        return this.sdkConfig;
    }

    public final int getSkipCount() {
        return this.skipCount;
    }

    public final OneSmartDataTrackConfig getTrack() {
        return this.track;
    }

    public final void setDisable(boolean z) {
        this.disable = z;
    }

    public final void setDisableMonitor(boolean z) {
        this.disableMonitor = z;
    }

    public final void setFeatures(InputFeaturesConfig inputFeaturesConfig) {
        this.features = inputFeaturesConfig;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setSdkConfig(SmartSdkConfig smartSdkConfig) {
        this.sdkConfig = smartSdkConfig;
    }

    public final void setSkipCount(int i) {
        this.skipCount = i;
    }

    public final void setTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        this.track = oneSmartDataTrackConfig;
    }
}
