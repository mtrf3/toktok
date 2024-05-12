package com.ss.android.ugc.aweme.ml.ab;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.setting.model.MLModel;

/* loaded from: classes9.dex */
public class SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel extends MLModel {

    @InterfaceC65349Pkn("count_when_execute")
    public int countWhenExecute;

    @InterfaceC65349Pkn("features")
    public InputFeaturesConfig features;

    @InterfaceC65349Pkn("load_model_before")
    public boolean loadModelBefore;

    @InterfaceC65349Pkn("real")
    public OnePlaytimePredictRealConfig realConfig;

    @InterfaceC65349Pkn("run_delay")
    public int runDelay = 16;

    @InterfaceC65349Pkn("skip_count")
    public int skipCount;

    @InterfaceC65349Pkn("track")
    public OneSmartDataTrackConfig track;

    @Override // com.ss.android.ugc.aweme.setting.model.MLModel
    public String toString() {
        return super.toString();
    }
}
