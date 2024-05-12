package com.bytedance.common.jato.threads;

import X.Q89;
import X.X1D;
import defpackage.b0;

/* loaded from: classes2.dex */
public class ThreadInfo {
    public int lockTid;
    public long nativePeer;
    public int stm;
    public String threadName;
    public int tid;
    public int utm;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ThreadInfo{tid=");
        LIZ.append(this.tid);
        LIZ.append(", lock_tid=");
        LIZ.append(this.lockTid);
        LIZ.append(", threadPeer=");
        LIZ.append(this.nativePeer);
        LIZ.append(", threadName='");
        Q89.LIZIZ(LIZ, this.threadName, '\'', ", utm=");
        LIZ.append(this.utm);
        LIZ.append(", stm=");
        return b0.LIZJ(LIZ, this.stm, '}', LIZ);
    }

    public int getLockTid() {
        return this.lockTid;
    }

    public long getNativePeer() {
        return this.nativePeer;
    }

    public int getStm() {
        return this.stm;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public int getTid() {
        return this.tid;
    }

    public int getUtm() {
        return this.utm;
    }
}
