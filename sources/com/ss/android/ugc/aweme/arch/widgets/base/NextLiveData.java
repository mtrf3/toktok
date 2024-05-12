package com.ss.android.ugc.aweme.arch.widgets.base;

import X.C16880lQ;
import Y.ARunnableS20S0200000_1;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class NextLiveData<T> extends MutableLiveData<T> {
    public static Handler sMainHandler = new Handler(C16880lQ.LLJJJJ());
    public int mLatestVersion = -1;
    public Map<Observer, NextLiveData<T>.b<T>> nextObserverMap = new HashMap();

    /* loaded from: classes2.dex */
    public class b<R> implements Observer<R> {
        public final int LJLIL;
        public final Observer<R> LJLILLLLZI;
        public final boolean LJLJI;

        @Override // androidx.lifecycle.Observer
        public final void onChanged(R r) {
            if (!this.LJLJI && this.LJLIL >= NextLiveData.this.mLatestVersion) {
                return;
            }
            this.LJLILLLLZI.onChanged(r);
        }

        public b(int i, Observer<R> observer, boolean z) {
            this.LJLIL = i;
            this.LJLILLLLZI = observer;
            this.LJLJI = z;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer<? super T> observer) {
        observeForever(observer, false);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        sMainHandler.post(new ARunnableS20S0200000_1(t, this, 4));
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer<? super T> observer) {
        NextLiveData<T>.b<T> remove = this.nextObserverMap.remove(observer);
        if (remove != null) {
            super.removeObserver(remove);
            return;
        }
        if (observer instanceof b) {
            for (Map.Entry<Observer, NextLiveData<T>.b<T>> entry : this.nextObserverMap.entrySet()) {
                if (observer.equals(entry.getValue())) {
                    Observer key = entry.getKey();
                    super.removeObserver(observer);
                    if (key != null) {
                        this.nextObserverMap.remove(key);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        this.mLatestVersion++;
        super.setValue(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        observe(lifecycleOwner, observer, false);
    }

    public void observeForever(Observer<? super T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        NextLiveData<T>.b<T> bVar = new b<>(this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, bVar);
        super.observeForever(bVar);
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        NextLiveData<T>.b<T> bVar = new b<>(this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, bVar);
        super.observe(lifecycleOwner, bVar);
    }
}
