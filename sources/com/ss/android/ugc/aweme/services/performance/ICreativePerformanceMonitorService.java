package com.ss.android.ugc.aweme.services.performance;

import java.util.Map;

/* loaded from: classes8.dex */
public interface ICreativePerformanceMonitorService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes8.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    String getBatteryPercent();

    int getBatteryState();

    String getBatteryTemperature();

    Map<String, Double> getCpuRate();

    String getCpuUsedRate();

    Map<String, Long> getMemory();

    String getMemoryUsedRate();

    int isPowerSaveMode();

    void startBlockMonitor(String str, int i, long j, LagDataCallback lagDataCallback);

    void startBlockMonitor(String str, int i, LagDataCallback lagDataCallback);

    void startFpsMonitor(String str, long j, LagDataCallback lagDataCallback);

    void startFpsMonitor(String str, LagDataCallback lagDataCallback);

    void stopBlockMonitor(String str);

    void stopFpsMonitor(String str);
}
