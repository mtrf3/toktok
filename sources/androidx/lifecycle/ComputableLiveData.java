package androidx.lifecycle;

import X.C28O;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class ComputableLiveData<T> {
    public final AtomicBoolean mComputing;
    public final Executor mExecutor;
    public final AtomicBoolean mInvalid;
    public final Runnable mInvalidationRunnable;
    public final LiveData<T> mLiveData;
    public final Runnable mRefreshRunnable;

    public abstract T compute();

    public ComputableLiveData() {
        this(C28O.LJLJJI);
    }

    public void invalidate() {
        C28O.LLLLZ().LL(this.mInvalidationRunnable);
    }

    public LiveData<T> getLiveData() {
        return this.mLiveData;
    }

    public ComputableLiveData(Executor executor) {
        this.mInvalid = new AtomicBoolean(true);
        this.mComputing = new AtomicBoolean(false);
        this.mRefreshRunnable = new Runnable() { // from class: androidx.lifecycle.ComputableLiveData.2
            @Override // java.lang.Runnable
            public void run() {
                androidx_lifecycle_ComputableLiveData$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public void androidx_lifecycle_ComputableLiveData$2__run$___twin___() {
                do {
                    if (ComputableLiveData.this.mComputing.compareAndSet(false, true)) {
                        Object obj = null;
                        boolean z = false;
                        while (ComputableLiveData.this.mInvalid.compareAndSet(true, false)) {
                            try {
                                obj = ComputableLiveData.this.compute();
                                z = true;
                            } finally {
                                ComputableLiveData.this.mComputing.set(false);
                            }
                        }
                        if (z) {
                            ComputableLiveData.this.mLiveData.postValue(obj);
                        }
                        if (!z) {
                            return;
                        }
                    } else {
                        return;
                    }
                } while (ComputableLiveData.this.mInvalid.get());
            }

            public static void androidx_lifecycle_ComputableLiveData$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.androidx_lifecycle_ComputableLiveData$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        this.mInvalidationRunnable = new Runnable() { // from class: androidx.lifecycle.ComputableLiveData.3
            @Override // java.lang.Runnable
            public void run() {
                androidx_lifecycle_ComputableLiveData$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void androidx_lifecycle_ComputableLiveData$3__run$___twin___() {
                boolean hasActiveObservers = ComputableLiveData.this.mLiveData.hasActiveObservers();
                if (ComputableLiveData.this.mInvalid.compareAndSet(false, true) && hasActiveObservers) {
                    ComputableLiveData computableLiveData = ComputableLiveData.this;
                    computableLiveData.mExecutor.execute(computableLiveData.mRefreshRunnable);
                }
            }

            public static void androidx_lifecycle_ComputableLiveData$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.androidx_lifecycle_ComputableLiveData$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        this.mExecutor = executor;
        this.mLiveData = new LiveData<T>() { // from class: androidx.lifecycle.ComputableLiveData.1
            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                ComputableLiveData computableLiveData = ComputableLiveData.this;
                computableLiveData.mExecutor.execute(computableLiveData.mRefreshRunnable);
            }
        };
    }
}
