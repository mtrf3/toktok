package com.ss.android.ugc.aweme.port.in;

import java.util.HashMap;

/* loaded from: classes14.dex */
public interface IToolsCPUDataService {
    void end();

    HashMap<String, Double> getCpuData();

    HashMap<String, String> getThermalData();

    void init();

    int isSavePowerEnable();
}
