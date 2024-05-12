package com.bytedance.ies.sdk.datachannel;

import X.C32668Crw;
import X.C32669Crx;
import X.C76800UCe;
import X.InterfaceC32540Cps;
import X.InterfaceC88472Yns;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class NextLiveData<T> extends MutableLiveData<T> implements InterfaceC32540Cps<T> {
    public static final C32669Crx Companion = new C32669Crx();
    public T mInitialValue;
    public int mLatestVersion = -1;
    public final Map<InterfaceC88472Yns<T, C76800UCe>, C32668Crw<T>> nextObserverMap = new HashMap();

    public final void forceClearObserver$live_datachannel_release() {
        Iterator<Map.Entry<InterfaceC88472Yns<T, C76800UCe>, C32668Crw<T>>> it = this.nextObserverMap.entrySet().iterator();
        while (it.hasNext()) {
            removeObserver(it.next().getValue());
        }
        this.nextObserverMap.clear();
    }

    public NextLiveData() {
    }

    @Override // androidx.lifecycle.LiveData
    public T getValue() {
        T t = (T) super.getValue();
        if (t == null) {
            return this.mInitialValue;
        }
        return t;
    }

    public final int getMLatestVersion$live_datachannel_release() {
        return this.mLatestVersion;
    }

    public NextLiveData(T t) {
        this.mInitialValue = t;
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        if (t != null) {
            super.postValue(t);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer<? super T> observer) {
        o.LJIIIZ(observer, "observer");
        super.removeObserver(observer);
        if (observer instanceof C32668Crw) {
            for (Map.Entry<InterfaceC88472Yns<T, C76800UCe>, C32668Crw<T>> entry : this.nextObserverMap.entrySet()) {
                InterfaceC88472Yns<T, C76800UCe> key = entry.getKey();
                if (o.LJ(observer, entry.getValue())) {
                    if (key != null) {
                        this.nextObserverMap.remove(key);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void setMLatestVersion$live_datachannel_release(int i) {
        this.mLatestVersion = i;
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public final void setValue(T t) {
        if (t != null) {
            this.mLatestVersion++;
            super.setValue(t);
        }
    }

    public final C32668Crw<T> observeForever(InterfaceC88472Yns<? super T, C76800UCe> observer, boolean z) {
        o.LJIIIZ(observer, "observer");
        if (this.nextObserverMap.containsKey(observer)) {
            C32668Crw<T> c32668Crw = this.nextObserverMap.get(observer);
            o.LJI(c32668Crw);
            return c32668Crw;
        }
        C32668Crw<T> c32668Crw2 = new C32668Crw<>(observer, z, this);
        this.nextObserverMap.put(observer, c32668Crw2);
        super.observeForever(c32668Crw2);
        return c32668Crw2;
    }

    public final C32668Crw<T> observe(LifecycleOwner owner, InterfaceC88472Yns<? super T, C76800UCe> observer, boolean z) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(observer, "observer");
        if (this.nextObserverMap.containsKey(observer)) {
            C32668Crw<T> c32668Crw = this.nextObserverMap.get(observer);
            o.LJI(c32668Crw);
            return c32668Crw;
        }
        C32668Crw<T> c32668Crw2 = new C32668Crw<>(observer, z, this);
        this.nextObserverMap.put(observer, c32668Crw2);
        super.observe(owner, c32668Crw2);
        return c32668Crw2;
    }
}
