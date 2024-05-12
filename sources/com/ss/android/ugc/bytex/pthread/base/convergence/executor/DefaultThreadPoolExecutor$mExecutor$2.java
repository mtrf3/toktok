package com.ss.android.ugc.bytex.pthread.base.convergence.executor;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class DefaultThreadPoolExecutor$mExecutor$2 extends AbstractC65781Prl implements InterfaceC65784Pro<ThreadPoolExecutor> {
    public static final DefaultThreadPoolExecutor$mExecutor$2 INSTANCE = new DefaultThreadPoolExecutor$mExecutor$2();

    public DefaultThreadPoolExecutor$mExecutor$2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ThreadPoolExecutor invoke() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 0L, TimeUnit.MILLISECONDS, new SynchronousQueue(), Executors.defaultThreadFactory());
    }
}
