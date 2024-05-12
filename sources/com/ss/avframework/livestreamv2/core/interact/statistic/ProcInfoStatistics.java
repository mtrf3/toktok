package com.ss.avframework.livestreamv2.core.interact.statistic;

import android.content.Context;
import android.os.Process;

/* loaded from: classes9.dex */
public class ProcInfoStatistics {
    public long appCpuTime;
    public short appCpuUsage;
    public boolean hasInit;
    public Context mContext;
    public long totalCpuTime;
    public short totalCpuUsage;
    public long usedCpuTime;

    public void release() {
        this.mContext = null;
    }

    public ProcInfo getProcInfo() {
        short s;
        long totalCPUTime = MonitorUtils.getTotalCPUTime();
        long usedCPUTime = MonitorUtils.getUsedCPUTime();
        long appCPUTime = MonitorUtils.getAppCPUTime(Process.myPid());
        float f = (float) (totalCPUTime - this.totalCpuTime);
        float f2 = (float) (usedCPUTime - this.usedCpuTime);
        float f3 = (float) (appCPUTime - this.appCpuTime);
        if (f > 0.0f) {
            if (f3 > 0.0f) {
                this.appCpuUsage = (short) Math.round((f3 / f) * 100.0f);
            }
            if (f2 > 0.0f) {
                this.totalCpuUsage = (short) Math.round((f2 / f) * 100.0f);
            }
        }
        ProcInfo procInfo = new ProcInfo();
        boolean z = this.hasInit;
        short s2 = -1;
        if (z) {
            s = this.appCpuUsage;
        } else {
            s = -1;
        }
        procInfo.appCpuUsed = s;
        if (z) {
            s2 = this.totalCpuUsage;
        }
        procInfo.totalCpuUsed = s2;
        Context context = this.mContext;
        if (context != null) {
            procInfo.appUsedMemory = MonitorUtils.getPidMemorySize(Process.myPid(), context);
            procInfo.systemUsedMemory = (float) MonitorUtils.getSysUsedMemory(context);
        }
        this.totalCpuTime = totalCPUTime;
        this.usedCpuTime = usedCPUTime;
        this.appCpuTime = appCPUTime;
        return procInfo;
    }

    public void setCpuCheckPoint() {
        this.totalCpuTime = MonitorUtils.getTotalCPUTime();
        this.usedCpuTime = MonitorUtils.getUsedCPUTime();
        this.appCpuTime = MonitorUtils.getAppCPUTime(Process.myPid());
    }

    /* loaded from: classes9.dex */
    public class ProcInfo {
        public short appCpuUsed;
        public float appUsedMemory;
        public float systemUsedMemory;
        public short totalCpuUsed;

        public ProcInfo() {
        }
    }

    public ProcInfoStatistics(Context context) {
        this.mContext = context;
        setCpuCheckPoint();
        this.hasInit = true;
    }
}
