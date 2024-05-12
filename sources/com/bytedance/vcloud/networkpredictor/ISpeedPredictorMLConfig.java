package com.bytedance.vcloud.networkpredictor;

/* loaded from: classes9.dex */
public interface ISpeedPredictorMLConfig {
    boolean enable();

    String getModelDirName();

    String getModelType();

    String modelUrl();
}
