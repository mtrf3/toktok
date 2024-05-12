package com.bytedance.sysoptimizer;

import X.JBR;
import X.X1D;

/* loaded from: classes7.dex */
public class StackLeakItem {
    public int leakCount;
    public String soBuildId;
    public long soEndAddr;
    public String soPath;
    public long soStartAddr;
    public long startRoutine;
    public long startRoutineOffset;

    public String getSoName() {
        int lastIndexOf;
        String str = this.soPath;
        if (str != null && (lastIndexOf = str.lastIndexOf(47)) >= 0 && lastIndexOf < this.soPath.length() - 1) {
            return this.soPath.substring(lastIndexOf + 1);
        }
        return "UNKNOWN";
    }

    public String getLeakItem() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[");
        LIZ.append(this.leakCount);
        LIZ.append("] stacks leaked: ");
        LIZ.append(Long.toHexString(this.startRoutineOffset));
        LIZ.append(" ");
        LIZ.append(Long.toHexString(this.soStartAddr));
        LIZ.append("-");
        LIZ.append(Long.toHexString(this.soEndAddr));
        LIZ.append(" r-xp ");
        LIZ.append(getSoName());
        LIZ.append(" (");
        return JBR.LJFF(LIZ, this.soBuildId, ")", LIZ);
    }

    public String getBuildId() {
        return this.soBuildId;
    }

    public int getLeakCount() {
        return this.leakCount;
    }

    public long getOffset() {
        return this.startRoutineOffset;
    }

    public StackLeakItem(int i, long j, long j2, long j3, String str, String str2) {
        this.leakCount = i;
        this.startRoutine = j;
        this.soStartAddr = j2;
        this.soEndAddr = j3;
        this.soPath = str;
        this.soBuildId = str2;
        this.startRoutineOffset = j - j2;
    }
}
