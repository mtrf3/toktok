package com.ss.android.ugc.aweme.im.sdk.common.data.dto;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DistinctUntilChangedLiveData<T> extends MutableLiveData<T> {
    public DistinctUntilChangedLiveData(T t) {
        super(t);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        if (!o.LJ(getValue(), t)) {
            super.postValue(t);
        }
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        if (!o.LJ(getValue(), t)) {
            super.setValue(t);
        }
    }
}
