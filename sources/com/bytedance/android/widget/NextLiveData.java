package com.bytedance.android.widget;

import X.C3CX;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class NextLiveData<T> extends MutableLiveData<T> {
    public int mLatestVersion = -1;
    public Map<Observer, C3CX> nextObserverMap = new HashMap();

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer<? super T> observer) {
        C3CX remove = this.nextObserverMap.remove(observer);
        if (remove != null) {
            super.removeObserver(remove);
            return;
        }
        super.removeObserver(observer);
        if (observer instanceof C3CX) {
            for (Map.Entry<Observer, C3CX> entry : this.nextObserverMap.entrySet()) {
                if (observer.equals(entry.getValue())) {
                    Observer key = entry.getKey();
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

    public void _observe(LifecycleOwner lifecycleOwner, Observer<T> observer) {
        observe(lifecycleOwner, observer, false);
    }

    public void observeForever(Observer<T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        C3CX c3cx = new C3CX(this, this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, c3cx);
        super.observeForever(c3cx);
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer<T> observer, boolean z) {
        if (this.nextObserverMap.containsKey(observer)) {
            return;
        }
        C3CX c3cx = new C3CX(this, this.mLatestVersion, observer, z);
        this.nextObserverMap.put(observer, c3cx);
        super.observe(lifecycleOwner, c3cx);
    }
}
