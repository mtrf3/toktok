package androidx.room;

import X.AbstractC03300Ba;
import X.C0BN;
import X.C0BP;
import Y.IDRunnableS85S0100000;
import androidx.lifecycle.LiveData;
import androidx.room.RoomTrackingLiveData;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class RoomTrackingLiveData<T> extends LiveData<T> {
    public final Callable<T> mComputeFunction;
    public final C0BN mContainer;
    public final AbstractC03300Ba mDatabase;
    public final boolean mInTransaction;
    public final C0BP mObserver;
    public final AtomicBoolean mInvalid = new AtomicBoolean(true);
    public final AtomicBoolean mComputing = new AtomicBoolean(false);
    public final AtomicBoolean mRegisteredObserver = new AtomicBoolean(false);
    public final Runnable mRefreshRunnable = new IDRunnableS85S0100000(this, 29);
    public final Runnable mInvalidationRunnable = new IDRunnableS85S0100000(this, 30);

    public Executor getQueryExecutor() {
        if (this.mInTransaction) {
            return this.mDatabase.LIZJ;
        }
        return this.mDatabase.LIZIZ;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        this.mContainer.LIZ.add(this);
        getQueryExecutor().execute(this.mRefreshRunnable);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        this.mContainer.LIZ.remove(this);
    }

    public RoomTrackingLiveData(AbstractC03300Ba abstractC03300Ba, C0BN c0bn, boolean z, Callable<T> callable, final String[] strArr) {
        this.mDatabase = abstractC03300Ba;
        this.mInTransaction = z;
        this.mComputeFunction = callable;
        this.mContainer = c0bn;
        this.mObserver = new C0BP(strArr) { // from class: X.1CA
            @Override // X.C0BP
            public final void LIZ(java.util.Set<String> set) {
                C28O.LLLLZ().LL(RoomTrackingLiveData.this.mInvalidationRunnable);
            }
        };
    }
}
