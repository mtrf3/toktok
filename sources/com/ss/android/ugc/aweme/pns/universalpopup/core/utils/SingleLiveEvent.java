package com.ss.android.ugc.aweme.pns.universalpopup.core.utils;

import X.T4U;
import Y.AObserverS75S0200000_12;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SingleLiveEvent<T> extends MutableLiveData<T> {
    public static final T4U Companion = new T4U();
    public final AtomicBoolean pending = new AtomicBoolean(false);

    public final void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        this.pending.set(true);
        super.setValue(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner owner, Observer<? super T> observer) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(observer, "observer");
        hasActiveObservers();
        super.observe(owner, new AObserverS75S0200000_12(this, observer, 27));
    }

    /* renamed from: observe$lambda-0, reason: not valid java name */
    public static final void m149observe$lambda0(SingleLiveEvent this$0, Observer observer, Object obj) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(observer, "$observer");
        if (this$0.pending.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
    }
}
