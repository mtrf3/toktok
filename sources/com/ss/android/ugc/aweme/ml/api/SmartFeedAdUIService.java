package com.ss.android.ugc.aweme.ml.api;

import X.C48051ItT;
import X.C48053ItV;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;

/* loaded from: classes9.dex */
public abstract class SmartFeedAdUIService implements ISmartFeedAdUIService {
    public static final C48051ItT Companion = new C48051ItT();
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public abstract /* synthetic */ void checkAndInit();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public abstract /* synthetic */ boolean enable();

    public abstract /* synthetic */ void ensureEvaluatorAvailable();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public abstract /* synthetic */ String getPredictLabelResult();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public abstract /* synthetic */ CommerceSmartUITasks getPredictTaskIndex();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public abstract /* synthetic */ CommerceSmartUIModel getSmartAdUIExperimentValue();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public abstract /* synthetic */ void startSmartAdUIJudge(Aweme aweme);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartFeedAdUIService instance() {
        Companion.getClass();
        return C48053ItV.LIZ;
    }
}
