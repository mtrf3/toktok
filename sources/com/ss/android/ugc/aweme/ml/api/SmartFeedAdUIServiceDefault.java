package com.ss.android.ugc.aweme.ml.api;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;

/* loaded from: classes9.dex */
public final class SmartFeedAdUIServiceDefault extends SmartFeedAdUIService {
    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public boolean enable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService
    public void ensureEvaluatorAvailable() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public String getPredictLabelResult() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public CommerceSmartUITasks getPredictTaskIndex() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public CommerceSmartUIModel getSmartAdUIExperimentValue() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public void startSmartAdUIJudge(Aweme aweme) {
    }
}
