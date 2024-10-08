package com.ss.android.ugc.aweme.comment.viewmodel;

import Y.AObserverS75S0200000_12;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SingleLiveEvent<T> extends MutableLiveData<T> {
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
        super.observe(owner, new AObserverS75S0200000_12(this, observer, 5));
    }
}
