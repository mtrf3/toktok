package com.bytedance.vcloud.abrmodule;

import com.ss.ttm.player.ABRStrategy;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public interface IABRModule {
    void addBufferInfo(int i, String str, long j, long j2, long j3);

    float getFloatOption(int i, float f);

    long getLongOption(int i, long j);

    ABRResult getPredict();

    String getPredictByJsonParams(String str);

    String getStringOption(int i, String str);

    String getVersion();

    void init(IPlayStateSupplier iPlayStateSupplier);

    ABRResult onceSelect(int i, int i2);

    void release();

    void setDeviceInfo(IDeviceInfo iDeviceInfo);

    void setDoubleOptionForKey(int i, double d);

    void setFloatOptionForKey(int i, float f);

    void setInfoListener(IABRInfoListener iABRInfoListener);

    void setIntOptionForKey(int i, int i2);

    void setLongOptionForKey(int i, long j);

    void setMediaInfo(List<IVideoStream> list, List<IAudioStream> list2);

    void setSRBenchmark(Map<Integer, Integer> map);

    void setSRBenchmarkMap(Map<Integer, List<Integer>> map);

    void setStringOptionForKey(int i, String str);

    void start(int i, int i2);

    void stop();

    ABRStrategy toStratrgy();
}
