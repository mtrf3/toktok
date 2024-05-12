package com.ss.android.ugc.aweme.im.sdk.common.data.dto;

import X.C221108m2;
import X.C5H3;
import X.C84718XMs;
import X.C84719XMt;
import X.InterfaceC65784Pro;
import Y.AObserverS83S0100000_15;
import Y.ARunnableS34S0200000_15;
import android.os.Handler;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DebounceLiveData<T> extends MediatorLiveData<T> {
    public static final C84719XMt Companion = new C84719XMt();
    public final C5H3 mainHandler$delegate;
    public final MutableLiveData<T> wrapped;

    private final Handler getMainHandler() {
        return (Handler) this.mainHandler$delegate.getValue();
    }

    @Override // androidx.lifecycle.LiveData
    public T getValue() {
        return this.wrapped.getValue();
    }

    public final void clean() {
        getMainHandler().removeCallbacksAndMessages(null);
    }

    public DebounceLiveData(MutableLiveData<T> wrapped) {
        o.LJIIIZ(wrapped, "wrapped");
        this.wrapped = wrapped;
        addSource(wrapped, new AObserverS83S0100000_15(this, 72));
        this.mainHandler$delegate = C221108m2.LIZIZ(C84718XMs.INSTANCE);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        super.postValue(t);
        this.wrapped.postValue(t);
    }

    public final void setFacadeValue(T t) {
        super.setValue(t);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        super.setValue(t);
        this.wrapped.setValue(t);
    }

    public final void postDelayed(T t, long j) {
        getMainHandler().removeCallbacksAndMessages(null);
        getMainHandler().postDelayed(new ARunnableS34S0200000_15(this, t, 20), j);
    }

    public final void setDelayed(InterfaceC65784Pro<? extends T> valueCalculator, long j) {
        o.LJIIIZ(valueCalculator, "valueCalculator");
        getMainHandler().removeCallbacksAndMessages(null);
        getMainHandler().postDelayed(new ARunnableS34S0200000_15(this, valueCalculator, 21), j);
    }

    public static /* synthetic */ void postDelayed$default(DebounceLiveData debounceLiveData, Object obj, long j, int i, Object obj2) {
        if ((i & 2) != 0) {
            j = 1000;
        }
        debounceLiveData.postDelayed(obj, j);
    }

    public static /* synthetic */ void setDelayed$default(DebounceLiveData debounceLiveData, InterfaceC65784Pro interfaceC65784Pro, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 1000;
        }
        debounceLiveData.setDelayed(interfaceC65784Pro, j);
    }
}
