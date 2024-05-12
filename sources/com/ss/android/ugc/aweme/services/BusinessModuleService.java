package com.ss.android.ugc.aweme.services;

import android.view.Choreographer;
import java.util.concurrent.locks.Lock;

/* loaded from: classes7.dex */
public interface BusinessModuleService {
    boolean doAtTheEndOfMeasure(Choreographer choreographer, Runnable runnable);

    void getMainLooperOptServiceAndUpdateWatchMainFrame();

    void getMainLooperOptServiceAndUpdateWatchUIFrame();

    void notifyFeedCacheCallback(Lock lock);

    void resetWatchState();

    void setMainLooperOptServiceEnable(boolean z);
}
