package com.bytedance.vcloud.networkpredictor;

/* loaded from: classes9.dex */
public interface ISpeedPredictorAwemePredictor {
    double calculateSpeed();

    void configMlModel(ISpeedPredictorMLConfig iSpeedPredictorMLConfig);

    double getSpeed();

    void monitorVideoSpeed(double d, double d2, long j);

    void setPredictorListener(ISpeedPredictorAwemeListener iSpeedPredictorAwemeListener);

    void setSpeedAlgorithmType(int i);
}
