package com.ss.android.ugc.bytex.pthread.base.helper;

import com.ss.android.ugc.bytex.pthread.base.IRunnableMonitor;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;

/* loaded from: classes7.dex */
public class DelegateRunnable implements Comparable<Object>, Runnable {
    public Runnable targetRunnable;

    public DelegateRunnable(Runnable runnable) {
        this.targetRunnable = runnable;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Runnable runnable = this.targetRunnable;
        if ((runnable instanceof Comparable) && (obj instanceof DelegateRunnable)) {
            return ((Comparable) runnable).compareTo(((DelegateRunnable) obj).targetRunnable);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof DelegateRunnable) && this.targetRunnable.equals(((DelegateRunnable) obj).targetRunnable);
    }

    public int hashCode() {
        return this.targetRunnable.hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            IRunnableMonitor iRunnableMonitor = PThreadExecutorsUtils.runnableMonitor;
            if (iRunnableMonitor != null) {
                iRunnableMonitor.beforeExecuteRunnable(this.targetRunnable);
            }
            this.targetRunnable.run();
        } finally {
            IRunnableMonitor iRunnableMonitor2 = PThreadExecutorsUtils.runnableMonitor;
            if (iRunnableMonitor2 != null) {
                iRunnableMonitor2.afterExecuteRunnable(this.targetRunnable);
            }
        }
    }

    public String toString() {
        return this.targetRunnable.toString();
    }
}
