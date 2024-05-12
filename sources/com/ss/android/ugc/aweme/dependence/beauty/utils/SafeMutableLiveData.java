package com.ss.android.ugc.aweme.dependence.beauty.utils;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SafeMutableLiveData<T> extends MutableLiveData<T> {
    public WeakReference<LifecycleOwner> lastLifecycleOwner;

    /* JADX WARN: Multi-variable type inference failed */
    public final void safeObserve(LifecycleOwner owner, Observer<T> observer) {
        LifecycleOwner lifecycleOwner;
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(observer, "observer");
        WeakReference<LifecycleOwner> weakReference = this.lastLifecycleOwner;
        if (weakReference != null && (lifecycleOwner = weakReference.get()) != null) {
            removeObservers(lifecycleOwner);
        }
        this.lastLifecycleOwner = new WeakReference<>(owner);
        observe(owner, observer);
    }
}
