package com.bytedance.ies.sdk.widgets;

import androidx.lifecycle.Observer;

/* loaded from: classes2.dex */
public interface NonNullObserver<T> extends Observer<T> {
    @Override // androidx.lifecycle.Observer
    void onChanged(T t);
}
