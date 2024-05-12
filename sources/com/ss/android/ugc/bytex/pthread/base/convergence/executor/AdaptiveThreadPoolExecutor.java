package com.ss.android.ugc.bytex.pthread.base.convergence.executor;

import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.InterfaceC74236TBo;
import X.TBT;
import com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.AqS17S0102000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AdaptiveThreadPoolExecutor implements IExecutor {
    public static final /* synthetic */ InterfaceC74236TBo[] $$delegatedProperties;
    public final DredgeHandler mDredgeHandler;
    public final C5H3 mExecutor$delegate;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(AdaptiveThreadPoolExecutor.class), "mExecutor", "getMExecutor()Ljava/util/concurrent/ThreadPoolExecutor;");
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
    }

    public AdaptiveThreadPoolExecutor(int i, int i2, DredgeHandler mDredgeHandler) {
        o.LJIIJ(mDredgeHandler, "mDredgeHandler");
        this.mDredgeHandler = mDredgeHandler;
        this.mExecutor$delegate = C221108m2.LIZIZ(new AqS17S0102000_6(this, i, i2, 0));
    }

    private final ThreadPoolExecutor getMExecutor() {
        return (ThreadPoolExecutor) this.mExecutor$delegate.getValue();
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.executor.IExecutor
    public void execute(Runnable runnable) {
        o.LJIIJ(runnable, "runnable");
        getMExecutor().execute(runnable);
        this.mDredgeHandler.requestDredgePrepare();
    }

    public final int getCorePoolSize() {
        return getMExecutor().getCorePoolSize();
    }

    public final int getMaxPoolSize() {
        return getMExecutor().getMaximumPoolSize();
    }

    public final void setCorePoolSize(int i) {
        getMExecutor().setCorePoolSize(i);
    }

    public final void setMaxPoolSize(int i) {
        getMExecutor().setMaximumPoolSize(i);
    }
}
