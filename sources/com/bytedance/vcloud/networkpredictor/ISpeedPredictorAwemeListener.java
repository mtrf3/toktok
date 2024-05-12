package com.bytedance.vcloud.networkpredictor;

/* loaded from: classes9.dex */
public interface ISpeedPredictorAwemeListener {
    String getCountry();

    boolean getDownFileState(String str, String str2, String str3);

    String getFilesCachePath();

    Object getIOExecutor();

    String getNetworkType();

    int getPhoneSignal();
}
