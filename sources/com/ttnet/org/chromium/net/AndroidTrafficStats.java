package com.ttnet.org.chromium.net;

import X.C16880lQ;
import android.net.TrafficStats;
import android.os.Process;

/* loaded from: classes9.dex */
public class AndroidTrafficStats {
    public static long getCurrentUidRxBytes() {
        long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
        if (uidRxBytes != -1) {
            return uidRxBytes;
        }
        return 0L;
    }

    public static long getCurrentUidTxBytes() {
        long uidTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
        if (uidTxBytes != -1) {
            return uidTxBytes;
        }
        return 0L;
    }

    public static long getTotalRxBytes() {
        long LLLLLZ = C16880lQ.LLLLLZ();
        if (LLLLLZ != -1) {
            return LLLLLZ;
        }
        return 0L;
    }

    public static long getTotalTxBytes() {
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        if (totalTxBytes != -1) {
            return totalTxBytes;
        }
        return 0L;
    }
}
