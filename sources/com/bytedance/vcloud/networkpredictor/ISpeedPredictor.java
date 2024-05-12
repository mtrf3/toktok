package com.bytedance.vcloud.networkpredictor;

import java.util.Map;

/* loaded from: classes9.dex */
public interface ISpeedPredictor {
    void close();

    float getAverageDownloadSpeed(int i, int i2, boolean z);

    Map<String, String> getDownloadSpeed(int i);

    float getLastPredictConfidence();

    String getMultidimensionalDownloadSpeeds();

    SpeedPredictorResultCollection getMultidimensionalDownloadSpeedsObj();

    String getMultidimensionalPredictSpeeds();

    SpeedPredictorResultCollection getMultidimensionalPredictSpeedsObj();

    float getPredictSpeed();

    float getPredictSpeed(int i);

    String getVersion();

    void prepare();

    void release();

    void setConfigInfo(Map map);

    void setSpeedQueueSize(int i);

    void start();

    void update(long j, long j2, long j3);

    void update(ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map);

    void update(String str, Map<String, Integer> map);
}
