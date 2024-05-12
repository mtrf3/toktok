package com.bytedance.vcloud.strategy;

/* loaded from: classes9.dex */
public interface IStrategyStateSupplier {
    double getNetworkScore();

    double getNetworkSpeed();

    int getNetworkType();

    String mediaInfoJsonString(String str);

    String onAfterSelect(String str, String str2, int i, Object obj);

    String onBeforeSelect(String str, String str2, int i, Object obj);

    String selectBitrateJsonString(String str, int i);

    String selectBitrateJsonString(String str, String str2, int i);
}
