package com.ss.android.ugc.bytex.pthread.base.convergence.executor;

import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.InterfaceC74236TBo;
import X.TBT;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DefaultThreadPoolExecutor implements IExecutor {
    public static final /* synthetic */ InterfaceC74236TBo[] $$delegatedProperties;
    public final C5H3 mExecutor$delegate = C221108m2.LIZIZ(DefaultThreadPoolExecutor$mExecutor$2.INSTANCE);

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(DefaultThreadPoolExecutor.class), "mExecutor", "getMExecutor()Ljava/util/concurrent/ThreadPoolExecutor;");
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
    }

    private final ThreadPoolExecutor getMExecutor() {
        return (ThreadPoolExecutor) this.mExecutor$delegate.getValue();
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.executor.IExecutor
    public void execute(Runnable runnable) {
        o.LJIIJ(runnable, "runnable");
        getMExecutor().execute(runnable);
    }
}
