package com.ss.android.ugc.aweme.ml.ab;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;

/* loaded from: classes9.dex */
public final class CommerceSmartUIModelV2 extends CommerceSmartUIModel {

    @InterfaceC65349Pkn("features")
    public InputFeaturesConfig features;

    @InterfaceC65349Pkn("real")
    public OnePlaytimePredictRealConfig realConfig;

    @InterfaceC65349Pkn("track")
    public OneSmartDataTrackConfig track;

    public final InputFeaturesConfig getFeatures() {
        return this.features;
    }

    public final OnePlaytimePredictRealConfig getRealConfig() {
        return this.realConfig;
    }

    public final OneSmartDataTrackConfig getTrack() {
        return this.track;
    }

    public final void setFeatures(InputFeaturesConfig inputFeaturesConfig) {
        this.features = inputFeaturesConfig;
    }

    public final void setRealConfig(OnePlaytimePredictRealConfig onePlaytimePredictRealConfig) {
        this.realConfig = onePlaytimePredictRealConfig;
    }

    public final void setTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        this.track = oneSmartDataTrackConfig;
    }
}
