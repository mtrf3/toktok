package com.ss.android.ugc.bytex.pthread.base.convergence.dredge;

import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class IntervalDredgeAbility implements IDredgeAbility {
    public static final Companion Companion = new Companion();
    public int mBlockFlag;
    public final ThreadPoolExecutor mExecutor;
    public long mExpectAcceptCount;
    public int mOffset;
    public final int mPeriod;

    /* loaded from: classes7.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public IntervalDredgeAbility(ThreadPoolExecutor mExecutor, int i) {
        o.LJIIJ(mExecutor, "mExecutor");
        this.mExecutor = mExecutor;
        this.mPeriod = i;
    }

    public /* synthetic */ IntervalDredgeAbility(ThreadPoolExecutor threadPoolExecutor, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(threadPoolExecutor, (i2 & 2) != 0 ? 1023 : i);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.dredge.IDredgeAbility
    public boolean dredge() {
        ThreadPoolExecutor threadPoolExecutor;
        long size = this.mExecutor.getQueue().size();
        long taskCount = this.mExecutor.getTaskCount() - size;
        long j = this.mExpectAcceptCount;
        int i = taskCount < j ? 1 : 0;
        int i2 = (this.mBlockFlag << 1) + i;
        long j2 = j - taskCount;
        if (j2 < 0) {
            j2 = 0;
        }
        int corePoolSize = this.mExecutor.getCorePoolSize();
        if (i != 0) {
            int i3 = ((int) (j2 / corePoolSize)) + 1;
            if (i3 > 5) {
                i3 = 5;
            }
            int maximumPoolSize = this.mExecutor.getMaximumPoolSize() - corePoolSize;
            if (i3 > maximumPoolSize) {
                i3 = maximumPoolSize;
            }
            if (i3 > 0) {
                this.mOffset += i3;
                threadPoolExecutor = this.mExecutor;
                corePoolSize += i3;
                threadPoolExecutor.setCorePoolSize(corePoolSize);
            }
        } else {
            int i4 = this.mOffset;
            if (i4 > 0 && (this.mPeriod & i2) == 0) {
                this.mOffset = i4 - 1;
                threadPoolExecutor = this.mExecutor;
                int corePoolSize2 = threadPoolExecutor.getCorePoolSize() - 1;
                if (corePoolSize2 >= corePoolSize) {
                    corePoolSize = corePoolSize2;
                }
                threadPoolExecutor.setCorePoolSize(corePoolSize);
            }
        }
        this.mExpectAcceptCount = taskCount + size;
        if (i2 != 0) {
            return (i == 0 && this.mOffset == 0) ? false : true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.dredge.IDredgeAbility
    public boolean prepare() {
        if (this.mExecutor.getQueue().size() == 0) {
            return false;
        }
        this.mExpectAcceptCount = this.mExecutor.getTaskCount();
        return true;
    }
}
