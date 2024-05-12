package com.ss.bytertc.engine;

import X.X1D;

/* loaded from: classes33.dex */
public class SysStats {
    public double cpuAppUsage;
    public int cpuCores;
    public double cpuTotalUsage;
    public long freeMemory;
    public long fullMemory;
    public double memoryRatio;
    public double memoryUsage;
    public double totalMemoryRatio;
    public long totalMemoryUsage;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SysStats{cpu_cores=");
        LIZ.append(this.cpuCores);
        LIZ.append('\'');
        LIZ.append(" cpu_app_usage=");
        LIZ.append(this.cpuAppUsage);
        LIZ.append('\'');
        LIZ.append(", cpu_total_usage=");
        LIZ.append(this.cpuTotalUsage);
        LIZ.append(", memory_usage=");
        LIZ.append(this.memoryUsage);
        LIZ.append("full_memory=");
        LIZ.append(this.fullMemory);
        LIZ.append('\'');
        LIZ.append("total_memory_usage=");
        LIZ.append(this.totalMemoryUsage);
        LIZ.append('\'');
        LIZ.append("free_memory=");
        LIZ.append(this.freeMemory);
        LIZ.append('\'');
        LIZ.append("memory_ratio=");
        LIZ.append(this.memoryRatio);
        LIZ.append('\'');
        LIZ.append("total_memory_ratio=");
        LIZ.append(this.totalMemoryRatio);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public SysStats() {
    }

    public SysStats(int i, double d, double d2, double d3, long j, long j2, long j3, double d4, double d5) {
        this.cpuCores = i;
        this.cpuAppUsage = d;
        this.cpuTotalUsage = d2;
        this.memoryUsage = d3;
        this.fullMemory = j;
        this.totalMemoryUsage = j2;
        this.freeMemory = j3;
        this.memoryRatio = d4;
        this.totalMemoryRatio = d5;
    }

    public static SysStats create(int i, double d, double d2, double d3, long j, long j2, long j3, double d4, double d5) {
        return new SysStats(i, d, d2, d3, j, j2, j3, d4, d5);
    }
}
