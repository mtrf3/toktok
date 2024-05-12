package com.ss.android.ugc.aweme.ml.api;

import X.FQL;
import X.J4P;
import X.J4X;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class SmartHARService implements ISmartHARService {
    public static final J4X Companion = new J4X();
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ void addPredictListener(FQL fql);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ void checkAndInit();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ boolean enable();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ int getLastRangeMostStatus(int i, boolean z);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ List<Integer> getLastRangeStatus(int i, boolean z);

    public abstract /* synthetic */ Map<String, Float> getLastResult();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ int getLastStatus();

    public abstract /* synthetic */ String intStatusToName(int i);

    public abstract /* synthetic */ String intStringStatusToName(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ void removePredictListener(FQL fql);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ boolean triggerSmartHarPredict(String str, boolean z);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartHARService instance() {
        Companion.getClass();
        return J4P.LIZ;
    }
}
