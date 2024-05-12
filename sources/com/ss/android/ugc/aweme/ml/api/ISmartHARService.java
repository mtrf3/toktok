package com.ss.android.ugc.aweme.ml.api;

import X.FQL;
import java.util.List;

/* loaded from: classes7.dex */
public interface ISmartHARService {
    void addPredictListener(FQL fql);

    void checkAndInit();

    boolean enable();

    int getLastRangeMostStatus(int i, boolean z);

    List<Integer> getLastRangeStatus(int i, boolean z);

    int getLastStatus();

    void removePredictListener(FQL fql);

    boolean triggerSmartHarPredict(String str, boolean z);
}
