package com.ss.android.ugc.bytex.pthread.base.convergence.external;

/* loaded from: classes7.dex */
public interface ThreadLifecycleObserver {
    void onAttach(Thread thread, Thread thread2);

    void onDetach(Thread thread, Thread thread2);
}
