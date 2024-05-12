package com.bytedance.vcloud.networkpredictor;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class SpeedPredictorResultCollection {
    public ArrayList<SpeedPredictorResult> resultCollection = new ArrayList<>();

    public int size() {
        return this.resultCollection.size();
    }

    public ArrayList<SpeedPredictorResult> getResultCollection() {
        return this.resultCollection;
    }

    public void add(SpeedPredictorResult speedPredictorResult) {
        this.resultCollection.add(speedPredictorResult);
    }

    public SpeedPredictorResult get(int i) {
        return (SpeedPredictorResult) ListProtector.get(this.resultCollection, i);
    }
}
